package com.example.lastproject.member;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.conn.ApiClient;
import com.example.conn.CommonMethod;
import com.example.lastproject.R;
import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.sdk.common.KakaoSdk;
import com.kakao.sdk.user.UserApiClient;
import com.kakao.sdk.user.model.User;
import com.navercorp.nid.NaverIdLoginSDK;
import com.navercorp.nid.oauth.NidOAuthLogin;
import com.navercorp.nid.oauth.OAuthLoginCallback;
import com.navercorp.nid.oauth.view.NidOAuthLoginButton;
import com.navercorp.nid.profile.NidProfileCallback;
import com.navercorp.nid.profile.data.NidProfileResponse;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public class LoginActivity extends AppCompatActivity {
   EditText id, pw;
    Button login, join;
    ImageView imgv_kakao_login;
    NidOAuthLoginButton buttonOauthLoginImg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ApiClient.setBASEURL("http://192.168.0.45/middle/");


        NaverIdLoginSDK.INSTANCE.initialize(this, "_UEnNH_z43Is8m9HPNKk", "n2gZgEzAkG", "LastProject");

/*
      new NidOAuthLogin().callDeleteTokenApi(this, new OAuthLoginCallback() {
            @Override
            public void onSuccess() {
                Log.d("로그", "onSuccess: ");
            }

            @Override
            public void onFailure(int i, @NonNull String s) {

            }

            @Override
            public void onError(int i, @NonNull String s) {
                Log.d("로그", "onSuccess: ");
            }
        });
        NaverIdLoginSDK.INSTANCE.logout();
*/


        KakaoSdk.init(this, "195d8e2f79da9f2510e52466f7c109c4");

        buttonOauthLoginImg = findViewById(R.id.buttonOAuthLoginImg);
        id = findViewById(R.id.edt_id);
        pw = findViewById(R.id.edt_pw);
        login = findViewById(R.id.btn_login);
        imgv_kakao_login = findViewById(R.id. imgv_kakao_login);
        join = findViewById(R.id.btn_join);

        join.setOnClickListener(v -> {
            Intent intent= new Intent(this, JoinActivity.class);
            startActivity(intent);
                });


        /*callback은 대부분 인터페이스  (new 치고 엔터) */
        buttonOauthLoginImg.setOAuthLogin(new OAuthLoginCallback() {
            @Override
            public void onSuccess() {
             //NidOAuthLogin().callProfileApi
                new NidOAuthLogin().callProfileApi(new NidProfileCallback<NidProfileResponse>() {
                    @Override
                    public void onSuccess(NidProfileResponse nidProfileResponse) {
                        Log.d("로그", "onSuccess: "+ nidProfileResponse.getProfile().getEmail());
                    }

                    @Override
                    public void onFailure(int i, @NonNull String s) {

                    }

                    @Override
                    public void onError(int i, @NonNull String s) {

                    }
                });
                Log.d("로그", "onSuccess: ");
            }

            @Override
            public void onFailure(int i, @NonNull String s) {
                Log.d("로그", "onFailure: ");
            }

            @Override
            public void onError(int i, @NonNull String s) {
                Log.d("로그", "onError: ");

            }
        });

        imgv_kakao_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kakaoLogin();
            }
        });
        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                /*if (id.getText().toString().equals("admin") && pw.getText().toString().equals("admin_pw")) {
               Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
                }*/
                //로그인 처리가 정상적으로 된다 -->VO 값 하나를 가져오는 경우
                CommonMethod commonMethod = new CommonMethod();
                commonMethod.setParams("email", id.getText().toString())
                        .setParams("pw", pw.getText().toString())
                        .sendPost("login.me", new CommonMethod.CallBackResult() {
                            @Override
                            public void result(boolean isResult, String data) {
                                Log.d("로그", "result: " + data);
                            }
                        });
            }
                        });
                           getHashKey();

            }
 //9A1e5Uw5YC4mZvsmhavOHivBWS0=
            private void getHashKey(){

                PackageInfo packageInfo = null;

                try {

                    packageInfo = getPackageManager().getPackageInfo(getPackageName(), PackageManager.GET_SIGNATURES);

                } catch (PackageManager.NameNotFoundException e) {

                    e.printStackTrace();

                }

                if (packageInfo == null)

                    Log.e("KeyHash", "KeyHash:null");


                for (Signature signature : packageInfo.signatures) {

                    try {

                        MessageDigest md = MessageDigest.getInstance("SHA");

                        md.update(signature.toByteArray());

                        Log.d("로그", Base64.encodeToString(md.digest(), Base64.DEFAULT));

                    } catch (NoSuchAlgorithmException e) {

                        Log.e("로그", "Unable to get MessageDigest. signature=" + signature, e);

                    }

                }

            }

            private void kakaoLogin() {

                Function2<OAuthToken, Throwable, Unit> callback = new Function2<OAuthToken, Throwable, Unit>() {
                    @Override
                    public Unit invoke(OAuthToken oAuthToken, Throwable throwable) {
                        if (oAuthToken != null) {
                            Log.d("로그", "invoke: " + oAuthToken.toString());
                            UserApiClient.getInstance().me(new Function2<User, Throwable, Unit>() {
                                @Override
                                public Unit invoke(User user, Throwable throwable) {
                                    Log.d("로그", "invoke: " + user.getId());
                                    Log.d("로그", "invoke: " + user.getKakaoAccount().getEmail());
                                    Log.d("로그", "invoke: " + user.getKakaoAccount().getProfile().getThumbnailImageUrl());

                                    socialLogin(user.getKakaoAccount().getEmail().toString()); /*socialLogin메소드로 보내주고*/
                                    return null;
                                }
                            });
                        }
                        return null;
                    }
                };

                if (UserApiClient.getInstance().isKakaoTalkLoginAvailable(this)) {
                    UserApiClient.getInstance().loginWithKakaoTalk(this, callback);
                } else {
                    UserApiClient.getInstance().loginWithKakaoAccount(this, callback);
                }
            }

                public void socialLogin(String email){ /*받는처리 (string으로)*/
                //소셜 로그인을 통해서 가져온 정보(이메일)를 Spring으로 전송하기. (oracle테이블에 해당하는 메일로 가입한 정보)
                    //AndMemberController에서 받게 처리
                   new CommonMethod().setParams("email",email).sendPost("social.me", new CommonMethod.CallBackResult() {
                       @Override
                       public void result(boolean isResult, String data) {

                       }
                   });

                //1.가입한 정보가 있다면 로그인 성공 처리
                //2.가입한 정보가 없다면 회원가입 처리

                }


/*                UserApiClient.instance.loginWithKakaoAccount(context) { token, error ->
                    if (error != null) {
                        Log.e(TAG, "로그인 실패", error)
                    }
                    else if (token != null) {
                        Log.i(TAG, "로그인 성공 ${token.accessToken}")
                    }
                }    */
    }


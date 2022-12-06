package com.example.and11_allview.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.and11_allview.R;

//2. 밑에서 만든 ViewHolder를 이용해서 RecyclerViewAdapter를 상속받는다 (※ BaseAdapter아님)
//RecyclerView.Adapter<RecvAdapter.JYViewHolder> <>안에 VH : ViewHolder
//                                   → android.~ 아니고 컴파일러한(com.~타입의 ViewHolder) :여기서 이름은 JYViewHolder임

public class RecvAdapter extends RecyclerView.Adapter<RecvAdapter.JYViewHolder> {
//LayoutInflater 필요 : ViewGroup parent 통해 칸만 제공하고, 붙이는거는 직접 붙여야함.
//LayoutInflater : 직접 붙이는 처리를 하기 위한 객체! -adapter필수요소
    LayoutInflater inflater;  /*inflater통해서 붙이는 처리를 위해 선언 */

    //생성자 만들기 - 어댑터 연결처리
    public RecvAdapter(LayoutInflater inflater) {
        this.inflater = inflater;
    }

    //3.우리가 만든 ViewHolder(JYViewHolder) 를 return해주는 부분이다.
    //ViewHolder : 직접 커스터마이징필요, 몇개의 위젯이 들어있는지 os가 판단할 수 없다.
    // ex) 어떤 아이템에는 이미지뷰가 3개, 다른 아이템에는 텍스트뷰가 3개등 있을때 사용.
    //onCreateViewHolder : BaseAdapter (getView메소드 ) 와 비슷
    //ViewGroup parent :
    @NonNull
    @Override
    public JYViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        /*inflater통해서 붙이는 처리*/
        View v = inflater.inflate(R.layout.item_grdf_girdv,parent,false); /*붙일 레이아웃, 붙일 칸, false*/
        //안에 있는 위젯을 담고
        JYViewHolder viewHolder = new JYViewHolder(v);
        return viewHolder;

    }
//5.데이터가 있다면, position holder에 담아져 있는 (칸) 위젯과 연결 부분 (Binding )
    @Override
    public void onBindViewHolder(@NonNull JYViewHolder h, int i) {
    //데이터 찾은뒤 실행되는 부분            이름 기니까 h, i로 바꾸고
    h.btn_change.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(h.imgv1.getVisibility() ==View.VISIBLE){
                h.imgv1.setVisibility(View.GONE);
                h.imgv2.setVisibility(View.VISIBLE);
            }else {
                h.imgv2.setVisibility(View.GONE);
                h.imgv1.setVisibility(View.VISIBLE);
            }

        }
    });

    }

    /*포지션이 꼬여서 데이터가 맘대로 통제가 안되는 경우
     * RecylerView 자체의 issue
     * getItemId,getItemViewType 오버라이딩 필요 */

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    //4.아이템의 갯수를 지정하는 부분
    @Override
    public int getItemCount() {
        return 30;  //
    }

    //1.extend! ->ViewHolder타입을 상속받은 innerClass ViewHolder를 만든다.
    public class JYViewHolder extends RecyclerView.ViewHolder {
        ImageView imgv1, imgv2;
        Button btn_change;

        public JYViewHolder(@NonNull View v) {  // View itemView 생성되는데 이름은 임의로 바꿨음 (v)
            super(v);
//위젯들을 찾아서 초기화하는 기능을 했음. v.find...
            imgv1 = v.findViewById(R.id.imgv1);
            imgv2 = v.findViewById(R.id.imgv2);
            btn_change = v.findViewById(R.id.btn_change);


        }
    }
}

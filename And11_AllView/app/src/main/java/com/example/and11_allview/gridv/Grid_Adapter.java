package com.example.and11_allview.gridv;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;

import com.example.and11_allview.R;
/*어댑터 클래스 만들고baseAdapter 상속받았다. */
public class Grid_Adapter extends BaseAdapter {
    LayoutInflater inflater;

    public Grid_Adapter(LayoutInflater inflater) {
        this.inflater = inflater;
    }

    @Override
    public int getCount() {
        return 30; /*예제 : 30건의 데이터 */
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    int count = 0;
    @Override
    public View getView(int position, View v, ViewGroup parent) { /*변수 이름 줄여도 ㄱㅊ , ViewGroup parent : 빈칸을 주는거고, 여기에 내가 붙이는거임*/
        ViewHolder viewHolder = null;
        //null이면 붙이고
        if(v==null){
                                //↓ 붙일 레이아웃을 가져온다,
            v= inflater.inflate(R.layout.item_grdf_girdv,parent,false);/*inflater 붙여주는 처리*/
            viewHolder = new ViewHolder(v);
            v.setTag(viewHolder);//Tag가 object형태라서 뭐든지 담을수가 있다. ->매번 inflater set으로 저장했다가 .
            count++;
        }else {
            //null이 아니면
            if (v.getTag() != null) {
               viewHolder = (ViewHolder) v.getTag();
            }
        }
        //final!!!!
        final ViewHolder tempViewHolder = viewHolder;
        viewHolder.btn_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tempViewHolder.imgv1.getVisibility()== View.VISIBLE){
                    //viewholder의 imvg1이 보이는경우
                    tempViewHolder.imgv1.setVisibility(View.GONE);
                    tempViewHolder.imgv2.setVisibility(View.VISIBLE);
                }else{
                    tempViewHolder.imgv2.setVisibility(View.GONE);
                    tempViewHolder.imgv1.setVisibility(View.VISIBLE);
                } //이상황에서는 정확한 인덱스가 없어서 이미지 변경이 오류처럼 보일 수 있다. 변경버튼 눌러도 정확한 위치가 바뀌는 건 아님

            }
        });
        Log.d("로그", "getView: "+count); //숫자는 더이상 늘어나지 않지만 로그는 찍히게 된다.



        /*찾아주기*/
        ImageView imgv1 = v.findViewById(R.id.imgv1);
        ImageView imgv2 = v.findViewById(R.id.imgv2);
        Button btn_change = v.findViewById(R.id.btn_change);
        /*getView메소드 몇번실행되는지 확인 ->스크롤할때마다 count 증가 => 계속실행됨 ->비효율적->리사이클러*/
        //count++;
        //Log.d("로그", "getView: "+count);
        return v;
        /*recycler (재활용) : view(아이템 붙인거) 한번 붙여놓고 나서 다시 계속 새로 붙이는 처리를 하지 않고,
        * 한 번 붙여놓은 아이템을 메모리에 저장해놨다가 다시 사용하는 구조로 만들기 : RecyclerView의 특성
        * RecyclerView는 ViewHolder라는 클래스를 무조건 만들어야한다.
        * 위젯을 묶어놓은 DTO -> ViewHolder (inner class로 많이 사용) */
    }
    public class ViewHolder{
        //필드 에 위젯들을 전부 다 써준다.
        ImageView imgv1, imgv2;
        Button btn_change;

        //한 칸에 붙일 item정보
        public ViewHolder(View v){
            imgv1 = v.findViewById(R.id.imgv1);
            imgv2 = v.findViewById(R.id.imgv2);
            btn_change = v.findViewById(R.id.btn_change);
        }

    }
}

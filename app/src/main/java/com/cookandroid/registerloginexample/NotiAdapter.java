package com.cookandroid.registerloginexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

public class NotiAdapter extends BaseAdapter {

    ArrayList<Board> list;
    // DB 데이터를 보여줄 ListView
    public ListView listView;
    public ArrayAdapter<String> dataAdapter;
    public Button delete;
    // DB 관련 변수
    public FirebaseDatabase database;
    public DatabaseReference myRef;

    public NotiAdapter(ArrayList<Board> list) {
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {
            //  item 레이아웃을 어댑터에 연동
            convertView = inflater.inflate(R.layout.item, parent, false);
        }

        TextView tvTitle = convertView.findViewById(R.id.tv_title);
        TextView tvContent = convertView.findViewById(R.id.content);


        Button delete =  convertView.findViewById(R.id.delete); // 버튼 선언 (사용하기 위한)
        // TextView date1 = convertView.findViewById(R.id.date);
        String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
        //   date1.setText(currentDateTimeString);

        delete.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                //   myref.database.ref().child('/chat/ㅇㅇ').set(null);
                myRef = database.getReference("testLog");
                list.remove(position);
                notifyDataSetChanged(); //온클릭 안에서 리스트뷰를 새로고침 함

            }
        }) ;




        tvTitle.setText(list.get(position).gettitle());
        // tvContent.setText(list.get(position).getcontent()); //여기에 들어가면 내용이 추가됨


        return convertView;
    }





    public void setNotiList(ArrayList<Board> list) {
        this.list = list;

        notifyDataSetChanged();
    }

}
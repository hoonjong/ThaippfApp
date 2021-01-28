package com.cookandroid.registerloginexample.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.cookandroid.registerloginexample.model.NotiAdapter;
import com.cookandroid.registerloginexample.R;
import com.cookandroid.registerloginexample.model.Board;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/** 이 앱의 핵심 기능이 담긴 선교지 소개 액티비티 입니다.
 *  Firebase Realtimebase를 이용하여 액티비티에서 작성한 글을
 *  실시간으로 CRUD 할 수 있도록 합니다.
 *  (현재는 수정, 삭제 기능이 미구현 상태)
 *
 */

public class SosicActivity extends AppCompatActivity {
    // 제목, 내용
    public EditText editText10, editText11;

    // 입력받은 데이터를 저장시킬 버튼
    public Button inputBtn, deletebtn;

    long now = System.currentTimeMillis();
    // 현재시간을 date 변수에 저장한다.
    Date date = new Date(now);
    // 시간을 나타냇 포맷을 정한다 ( yyyy/MM/dd 같은 형태로 변형 가능 )
    SimpleDateFormat sdfNow = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    // nowDate 변수에 값을 저장한다.
    String formatDate = sdfNow.format(date);

    TextView dateNow;


    // DB 데이터를 보여줄 ListView
    public ListView listView;
    public ArrayAdapter<String> dataAdapter;

    // DB 관련 변수
    public FirebaseDatabase database;
    public DatabaseReference myRef;

    // 제목,내용 리스트
    public ArrayList<Board> notidataList;

    public NotiAdapter notiAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sosic);

        // 변수 초기화
        editText10 = (EditText) findViewById(R.id.editText10);
        editText11 = (EditText) findViewById(R.id.editText11);


        deletebtn = (Button) findViewById(R.id.delete);
        inputBtn = (Button) findViewById(R.id.inputBtn);
        listView = (ListView) findViewById(R.id.listView);

        // DB 관련 변수 초기화
        //데이터베이스의 인스턴스를 가져온다고 생각(즉, Root를 가져온다고 이해하면 쉬움)
        database = FirebaseDatabase.getInstance();
        // message Reference가 없어도 상관 x

        notidataList = new ArrayList<>();
        //Root밑에 있는 “message”라는 위치를 참조함

        myRef = database.getReference("message");


        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView parent, View v, int position, long id) {
                        Log.e("TEST", "ENTER");
                        Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
                        /* putExtra의 첫 값은 식별 태그, 뒤에는 다음 화면에 넘길 값 */

                        intent.putExtra("title", notidataList.get(position).getcontent());
                        startActivity(intent);
                    }
                });



        // 자신이 얻은 Reference에 이벤트를 붙여줌
        // 데이터의 변화가 있을 때 출력해옴

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // 데이터를 읽어올 때 모든  데이터를 읽어오기때문에 List 를 초기화해주는 작업이 필요하다.

                // 데이터를 넣었을 때 처음부터 끝까지 다 받는거면 리스트 초기화를 해줘야합니다.
                // 추가한 데이터만 받는다면 초기화 X (리스트 전체 값이 초기화되기 때문에)
                //notidataList.clear();

                //dataAdapter.clear();
                notidataList.clear();
                Board board = dataSnapshot.getValue(Board.class);

                for (DataSnapshot messageData : dataSnapshot.getChildren()) {
                    String msg = messageData.getValue(String.class);
                    Log.d("testLog", msg);

                    // 파싱하는 부분 @로 파싱해서 제목과 내용을 분리
                    // filter[0] = "제목", filter[1] = "내용"
                    String[] filter = new String[0];
                    if (msg != null) {
                        filter = msg.split("@");
                    }
                    System.out.println(filter.length);
                    Log.d("testLog1", msg);

                    // 이 부분에서 title이랑 subtitle getValue()를 해서 null이 나오는 것 같아요
                    // 데이터 불러오는 부분 예제를 좀 봐야할 것 같은데요ㅠㅠ 잠시만요 보고올게요ㅋㅋㅋ
                    //String title = messageData.child("title").getValue().toString();
                    //String subtitle = messageData.child("subtitle").getValue().toString();
                    //dataAdapter.add(msg);

                    // 분리한 값으로 객체 생성해줌
                    Board notiData = new Board(filter[0], filter[1]);

                    //Board notiData = new Board(title, subtitle);

                    // 어댑터에 넣어줘야 하므로 리스트에 저장
                    notidataList.add(notiData);
                }


                // notifyDataSetChanged를 안해주면 ListView 갱신이 안됨
                //dataAdapter.notifyDataSetChanged();

                // 어댑터에 리스트 전달해주고 화면갱신

                // ListView에 출력할 데이터 초기화
                //dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, new ArrayList<String>());
                if (notiAdapter == null) {
                    notiAdapter = new NotiAdapter(notidataList);
                    // ListView에 Adapter 붙여줌
                    //listView.setAdapter(dataAdapter);
                    listView.setAdapter(notiAdapter);
                } else {
                    notiAdapter.notifyDataSetChanged();
                }

                // ListView 의 위치를 마지막으로 보내주기 위함
                //listView.setSelection(dataAdapter.getCount() - 1);
                listView.setSelection(notidataList.size() - 1);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        // 버튼 리스너 정의
        // 클릭시 EditText의 내용이 DB에 저장
        inputBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String str = editText.getText().toString().trim();


                String strTitle = editText10.getText().toString().trim();
                String strContent = editText11.getText().toString().trim();

                // 제목과 내용 에디트박스의 값을 받아서 이후 파싱을 위해 @를 넣어주고 합치는 작업
                // ex) 제목@내용
                String msg = strTitle + "@" + strContent;

                // push는 firebase가 임의로 중복되지 않은 키를 생성해서 저장
                // push로 하지 않을 경우 덮어 씌움

                // 이게 아직 안생겨서 그런 것 같아요
                //myRef.child("title").push().setValue(strTitle);
                //myRef.child("subtitle").push().setValue(strContent);
                //myRef.push().setValue(str);

                myRef.push().setValue(msg);


                // EditText 초기화
                editText10.setText("");
                editText11.setText("");

            }
        });


    }
}
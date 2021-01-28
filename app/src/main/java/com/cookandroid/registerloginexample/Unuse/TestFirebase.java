package com.cookandroid.registerloginexample.Unuse;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;


import androidx.appcompat.app.AppCompatActivity;

import com.cookandroid.registerloginexample.R;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class TestFirebase extends AppCompatActivity {
    // ArrayList<adapter> mItems = new ArrayList<>();

    private Button sendbt;
    private EditText editdt, editdt1;
    public String msg, msg1;
    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private FirebaseDatabase mDatabase;
    private DatabaseReference mReference;
    private ChildEventListener mChild;

    private ListView listView; //리스트뷰도 선언
    private ArrayAdapter<String> BoardAdapter;
    List<Object> Array = new ArrayList<Object>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);


        sendbt = (Button) findViewById(R.id.inputBtn);
        editdt = (EditText) findViewById(R.id.editText);
        editdt1 = (EditText) findViewById(R.id.editText1);
        listView = (ListView) findViewById(R.id.listviewmsg);

        initDatabase();

        BoardAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, new ArrayList<String>());
        listView.setAdapter(BoardAdapter);
        //데이터입력방식1 databaseReference.child("message").push().setValue("2");

        //데이터입력방식2 databaseReference.child("message").child("gbgg").setValue("2");

        sendbt.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                // databaseReference.child("message").push().setValue("2"); // 버튼 누르면 수행 할 명령>>이놈은 버튼을 눌렀을때 2를 출력
                msg = editdt.getText().toString(); //editdt 를 통해 입력받은 친구 msg에 넣어주고, 그 내용을 출력해줌
                databaseReference.child("message").push().setValue(msg);
                editdt.setText("");

                msg = editdt1.getText().toString(); //editdt 를 통해 입력받은 친구 msg에 넣어주고, 그 내용을 출력해줌
                databaseReference.child("message").push().setValue(msg);
                editdt1.setText("");

            }

        });

        mReference = mDatabase.getReference("message"); // 변경값을 확인할 child 이름
        mReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                BoardAdapter.clear();

                for (DataSnapshot messageData : dataSnapshot.getChildren()) {

                    String msg2 = messageData.getValue().toString();
                    Array.add(msg2);
                    BoardAdapter.add(msg2);
                    // child 내에 있는 데이터만큼 반복합니다.

                }
                BoardAdapter.notifyDataSetChanged();
                listView.setSelection(BoardAdapter.getCount() - 1);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }

    private void initDatabase() {
        mDatabase = FirebaseDatabase.getInstance();

        mReference = mDatabase.getReference("log");
        mReference.child("log").setValue("check");

        mChild = new ChildEventListener() {

            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        };
        mReference.addChildEventListener(mChild);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mReference.removeEventListener(mChild);
    }




}




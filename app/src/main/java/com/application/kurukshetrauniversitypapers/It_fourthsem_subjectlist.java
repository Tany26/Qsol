package com.application.kurukshetrauniversitypapers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class It_fourthsem_subjectlist extends AppCompatActivity {
    ListView listView;
    List<Listdata> subjectlist;
    Button downloadall;
    TextView subjectname;
    TextView papercount;
    TextView textView;
    String key;

    static int it_fourpapercount1,it_fourpapercount2,it_fourpapercount3,it_fourpapercount4,it_fourpapercount5;
    DatabaseReference ref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it_fourthsem_subjectlist);

        listView=findViewById(R.id.list);
        downloadall=findViewById(R.id.download_btn);
        subjectname=findViewById(R.id.subjectname);
        papercount=findViewById(R.id.papercount);
        textView=findViewById(R.id.textView);
        Intent intent=getIntent();
        key=intent.getStringExtra("key");
        textView.setText(key);

        GlobalClass globalClass=(GlobalClass)getApplicationContext();
        globalClass.setBranch("IT");
        globalClass.setSemester(4);

        subjectlist = new ArrayList<>();
        ref= FirebaseDatabase.getInstance().getReference("IN/KU/IT/04");
        ref.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s)
            {
                if(dataSnapshot.getKey().equals("CO")) {
                    it_fourpapercount1=(int)dataSnapshot.getChildrenCount();
                    subjectlist.add(new Listdata("Computer organisation and architecture", it_fourpapercount1+""));

                }
                if(dataSnapshot.getKey().equals("OP")) {
                    it_fourpapercount2=(int)dataSnapshot.getChildrenCount();
                    subjectlist.add(new Listdata("Object oriented programming", it_fourpapercount2+""));

                }
                if(dataSnapshot.getKey().equals("OS")) {
                    it_fourpapercount3=(int)dataSnapshot.getChildrenCount();
                    subjectlist.add(new Listdata("Operating systems", it_fourpapercount3+""));

                }
                if(dataSnapshot.getKey().equals("PL")) {
                    it_fourpapercount4=(int)dataSnapshot.getChildrenCount();
                    subjectlist.add(new Listdata("Programming language", it_fourpapercount4+""));

                }
                if(dataSnapshot.getKey().equals("FI")) {
                    it_fourpapercount5 =(int)dataSnapshot.getChildrenCount();
                    subjectlist.add(new Listdata("Fundamentals of up interfacing", it_fourpapercount5+""));
                }
               

                Mylistadapter adapter = new Mylistadapter(getBaseContext(), R.layout.row, subjectlist);
                listView.setAdapter(adapter);

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
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0) {
                    Intent intent=new Intent(It_fourthsem_subjectlist.this,Pdflist.class);
                    intent.putExtra("subject","IN/KU/IT/04/CO");
                    startActivity(intent);
                    Toast.makeText(It_fourthsem_subjectlist.this, "loading", Toast.LENGTH_SHORT).show();
                }
                if(position==1) {
                    Intent intent=new Intent(It_fourthsem_subjectlist.this,Pdflist.class);
                    intent.putExtra("subject","IN/KU/IT/04/FI");
                    startActivity(intent);
                    Toast.makeText(It_fourthsem_subjectlist.this, "loading", Toast.LENGTH_SHORT).show();
                }
                if(position==2) {
                    Intent intent=new Intent(It_fourthsem_subjectlist.this,Pdflist.class);
                    intent.putExtra("subject","IN/KU/IT/04/OP");
                    startActivity(intent);
                    Toast.makeText(It_fourthsem_subjectlist.this, "loading", Toast.LENGTH_SHORT).show();
                }
                if(position==3) {
                    Intent intent=new Intent(It_fourthsem_subjectlist.this,Pdflist.class);
                    intent.putExtra("subject","IN/KU/IT/04/OS");
                    startActivity(intent);
                    Toast.makeText(It_fourthsem_subjectlist.this, "loading", Toast.LENGTH_SHORT).show();
                }
                if(position==4) {
                    Intent intent=new Intent(It_fourthsem_subjectlist.this,Pdflist.class);
                    intent.putExtra("subject","IN/KU/IT/04/PL");
                    startActivity(intent);
                    Toast.makeText(It_fourthsem_subjectlist.this, "loading", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}

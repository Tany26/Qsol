package com.application.kurukshetrauniversitypapers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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

public class Cse_secondsem_subjectlist extends AppCompatActivity {
    ListView listView;
    List<Listdata> subjectlist;
    Button downloadall;
    TextView subjectname;
    TextView papercount;
    TextView textView;
    static int twopapercount1,twopapercount2,twopapercount3,twopapercount4,twopapercount5,twopapercount6,twopapercount7,twopapercount8,twopapercount9,twopapercount10,twopapercount11,twopapercount12,twopapercount13,twopapercount14,twopapercount15,twopapercount16,twopapercount17;
    DatabaseReference ref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_secondsem_subjectlist);
        downloadall=findViewById(R.id.download_btn);
        subjectname=findViewById(R.id.subjectname);
        papercount=findViewById(R.id.papercount);
        textView=findViewById(R.id.textView);
        listView=findViewById(R.id.list);

        GlobalClass globalClass=(GlobalClass)getApplicationContext();
        globalClass.setBranch("CSE");
        globalClass.setSemester(2);



        subjectlist = new ArrayList<>();
        ref= FirebaseDatabase.getInstance().getReference("IN/KU/CS/02");
        ref.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s)
            {
                if(dataSnapshot.getKey().equals("AC")) {
                    twopapercount1=(int)dataSnapshot.getChildrenCount();
                    subjectlist.add(new Listdata("Applied chemistry", twopapercount1+""));

                }
                if(dataSnapshot.getKey().equals("AM")) {
                    twopapercount2=(int)dataSnapshot.getChildrenCount();
                    subjectlist.add(new Listdata("Applied mathematics", twopapercount2+""));

                }
                if(dataSnapshot.getKey().equals("AP")) {
                    twopapercount3=(int)dataSnapshot.getChildrenCount();
                    subjectlist.add(new Listdata("Applied physics", twopapercount3+""));

                }
                if(dataSnapshot.getKey().equals("BI")) {
                    twopapercount4=(int)dataSnapshot.getChildrenCount();
                    subjectlist.add(new Listdata("Biology", twopapercount4+""));

                }
                if(dataSnapshot.getKey().equals("BT")) {
                    twopapercount5=(int)dataSnapshot.getChildrenCount();
                    subjectlist.add(new Listdata("Biotechnology",twopapercount5+""));

                }
                if(dataSnapshot.getKey().equals("CL")) {
                    twopapercount6 =(int)dataSnapshot.getChildrenCount();
                    subjectlist.add(new Listdata("Calculus and ordinary differential equation", twopapercount6+""));
                }
                if(dataSnapshot.getKey().equals("CH")) {
                    twopapercount7 =(int)dataSnapshot.getChildrenCount();
                    subjectlist.add(new Listdata("Chemistry", twopapercount7+""));
                }
                if(dataSnapshot.getKey().equals("EE")) {
                    twopapercount8 =(int)dataSnapshot.getChildrenCount();
                    subjectlist.add(new Listdata("Electrical engineering", twopapercount8+""));
                }
                if(dataSnapshot.getKey().equals("ET")) {
                    twopapercount9 =(int)dataSnapshot.getChildrenCount();
                    subjectlist.add(new Listdata("Electrical technology", twopapercount9+""));
                }
                if(dataSnapshot.getKey().equals("EF")) {
                    twopapercount10 =(int)dataSnapshot.getChildrenCount();
                    subjectlist.add(new Listdata("Electrical technology fundamentals", twopapercount10+""));
                }
                if(dataSnapshot.getKey().equals("ED")) {
                    twopapercount11 =(int)dataSnapshot.getChildrenCount();
                    subjectlist.add(new Listdata("Engineering drawing", twopapercount11+""));
                }
                if(dataSnapshot.getKey().equals("EH")) {
                    twopapercount12 =(int)dataSnapshot.getChildrenCount();
                    subjectlist.add(new Listdata("English", twopapercount12+""));
                }
                if(dataSnapshot.getKey().equals("FP")) {
                    twopapercount13 =(int)dataSnapshot.getChildrenCount();
                    subjectlist.add(new Listdata("Fundamentals of computer programming", twopapercount13+""));
                }
                if(dataSnapshot.getKey().equals("MA")) {
                    twopapercount14 =(int)dataSnapshot.getChildrenCount();
                    subjectlist.add(new Listdata("Mathematics", twopapercount14+""));
                }
                if(dataSnapshot.getKey().equals("PH")) {
                    twopapercount15 =(int)dataSnapshot.getChildrenCount();
                    subjectlist.add(new Listdata("Physics", twopapercount15+""));
                }
                if(dataSnapshot.getKey().equals("PS")) {
                    twopapercount16 =(int)dataSnapshot.getChildrenCount();
                    subjectlist.add(new Listdata("Probability and statistics", twopapercount16+""));
                }
                if(dataSnapshot.getKey().equals("PP")) {
                    twopapercount17 =(int)dataSnapshot.getChildrenCount();
                    subjectlist.add(new Listdata("Programming for problem solving", twopapercount17+""));
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
                    Intent intent=new Intent(Cse_secondsem_subjectlist.this,Pdflist.class);
                    intent.putExtra("subject","IN/KU/CS/02/AC");
                    startActivity(intent);
                    Toast.makeText(Cse_secondsem_subjectlist.this, "loading", Toast.LENGTH_SHORT).show();
                }
                if(position==1) {
                    Intent intent=new Intent(Cse_secondsem_subjectlist.this,Pdflist.class);
                    intent.putExtra("subject","IN/KU/CS/02/AM");
                    startActivity(intent);
                    Toast.makeText(Cse_secondsem_subjectlist.this, "loading", Toast.LENGTH_SHORT).show();
                }
                if(position==2) {
                    Intent intent=new Intent(Cse_secondsem_subjectlist.this,Pdflist.class);
                    intent.putExtra("subject","IN/KU/CS/02/AP");
                    startActivity(intent);
                    Toast.makeText(Cse_secondsem_subjectlist.this, "loading", Toast.LENGTH_SHORT).show();
                }
                if(position==3) {
                    Intent intent=new Intent(Cse_secondsem_subjectlist.this,Pdflist.class);
                    intent.putExtra("subject","IN/KU/CS/02/BI");
                    startActivity(intent);
                    Toast.makeText(Cse_secondsem_subjectlist.this, "loading", Toast.LENGTH_SHORT).show();
                }
                if(position==4) {
                    Intent intent=new Intent(Cse_secondsem_subjectlist.this,Pdflist.class);
                    intent.putExtra("subject","IN/KU/CS/02/BT");
                    startActivity(intent);
                    Toast.makeText(Cse_secondsem_subjectlist.this, "loading", Toast.LENGTH_SHORT).show();
                }
                if(position==5) {
                    Intent intent=new Intent(Cse_secondsem_subjectlist.this,Pdflist.class);
                    intent.putExtra("subject","IN/KU/CS/02/CH");
                    startActivity(intent);
                    Toast.makeText(Cse_secondsem_subjectlist.this, "loading", Toast.LENGTH_SHORT).show();
                }
                if(position==6) {
                    Intent intent=new Intent(Cse_secondsem_subjectlist.this,Pdflist.class);
                    intent.putExtra("subject","IN/KU/CS/02/CL");
                    startActivity(intent);
                    Toast.makeText(Cse_secondsem_subjectlist.this, "loading", Toast.LENGTH_SHORT).show();
                }
                if(position==7) {
                    Intent intent=new Intent(Cse_secondsem_subjectlist.this,Pdflist.class);
                    intent.putExtra("subject","IN/KU/CS/02/ED");
                    startActivity(intent);
                    Toast.makeText(Cse_secondsem_subjectlist.this, "loading", Toast.LENGTH_SHORT).show();
                }

                if(position==8) {
                    Intent intent=new Intent(Cse_secondsem_subjectlist.this,Pdflist.class);
                    intent.putExtra("subject","IN/KU/CS/02/EE");
                    startActivity(intent);
                    Toast.makeText(Cse_secondsem_subjectlist.this, "loading", Toast.LENGTH_SHORT).show();
                }
                if(position==9) {
                    Intent intent=new Intent(Cse_secondsem_subjectlist.this,Pdflist.class);
                    intent.putExtra("subject","IN/KU/CS/02/EF");
                    startActivity(intent);
                    Toast.makeText(Cse_secondsem_subjectlist.this, "loading", Toast.LENGTH_SHORT).show();
                }
                if(position==10) {
                    Intent intent=new Intent(Cse_secondsem_subjectlist.this,Pdflist.class);
                    intent.putExtra("subject","IN/KU/CS/02/EH");
                    startActivity(intent);
                    Toast.makeText(Cse_secondsem_subjectlist.this, "loading", Toast.LENGTH_SHORT).show();
                }
                if(position==11) {
                    Intent intent=new Intent(Cse_secondsem_subjectlist.this,Pdflist.class);
                    intent.putExtra("subject","IN/KU/CS/02/ET");
                    startActivity(intent);
                    Toast.makeText(Cse_secondsem_subjectlist.this, "loading", Toast.LENGTH_SHORT).show();
                }
                if(position==12) {
                    Intent intent=new Intent(Cse_secondsem_subjectlist.this,Pdflist.class);
                    intent.putExtra("subject","IN/KU/CS/02/FP");
                    startActivity(intent);
                    Toast.makeText(Cse_secondsem_subjectlist.this, "loading", Toast.LENGTH_SHORT).show();
                }
                if(position==13) {
                    Intent intent=new Intent(Cse_secondsem_subjectlist.this,Pdflist.class);
                    intent.putExtra("subject","IN/KU/CS/02/MA");
                    startActivity(intent);
                    Toast.makeText(Cse_secondsem_subjectlist.this, "loading", Toast.LENGTH_SHORT).show();
                }
                if(position==14) {
                    Intent intent=new Intent(Cse_secondsem_subjectlist.this,Pdflist.class);
                    intent.putExtra("subject","IN/KU/CS/02/PH");
                    startActivity(intent);
                    Toast.makeText(Cse_secondsem_subjectlist.this, "loading", Toast.LENGTH_SHORT).show();
                }
                if(position==15) {
                    Intent intent=new Intent(Cse_secondsem_subjectlist.this,Pdflist.class);
                    intent.putExtra("subject","IN/KU/CS/02/PP");
                    startActivity(intent);
                    Toast.makeText(Cse_secondsem_subjectlist.this, "loading", Toast.LENGTH_SHORT).show();
                }
                if(position==16) {
                    Intent intent=new Intent(Cse_secondsem_subjectlist.this,Pdflist.class);
                    intent.putExtra("subject","IN/KU/CS/02/PS");
                    startActivity(intent);
                    Toast.makeText(Cse_secondsem_subjectlist.this, "loading", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}

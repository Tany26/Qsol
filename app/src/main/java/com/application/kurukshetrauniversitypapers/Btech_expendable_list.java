package com.application.kurukshetrauniversitypapers;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Btech_expendable_list extends AppCompatActivity {

    ExpandableListView expandableListView;
    List<String> branch;
    Map<String, List<String>> semester;
    ExpandableListAdapter listAdapter;
    int cs01,cs02,cs03,cs04,cs05,cs06,cs07,cs08,ec04,ec06,ec07,ec08,it04,it06,it07,it08,el04,el06,el07,el08,me04,me06,me07,me08;
    int total_cse,total_ece,total_it,total_el,total_me;
    DatabaseReference ref1;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech_expendable_list);
        textView=findViewById(R.id.refresh);


        expandableListView=findViewById(R.id.btechexpendablelist);
        ref1=FirebaseDatabase.getInstance().getReference("IN/KU/CS/01");
        ref1.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                if(dataSnapshot.getKey().equals("AC")) {
                    cs01=cs01+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("AM")) {
                    cs01=cs01+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("AP")) {
                    cs01=cs01+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("EE")) {
                    cs01=cs01+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("BI")) {
                    cs01=cs01+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("BT")) {
                    cs01=cs01+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("CU")) {
                    cs01=cs01+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("CH")) {
                    cs01=cs01+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("ET")) {
                    cs01=cs01+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("ED")) {
                    cs01=cs01+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("EH")) {
                    cs01=cs01+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("FP")) {
                    cs01=cs01+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("MA")) {
                    cs01=cs01+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("ML")) {
                    cs01=cs01+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("PH")) {
                    cs01=cs01+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("PP")) {
                    cs01=cs01+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("SH")) {
                    cs01=cs01+(int)dataSnapshot.getChildrenCount();

                }
                filldata();
                listAdapter=new MyExListAdapter(getBaseContext(),branch,semester);
                expandableListView.setAdapter(listAdapter);
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
        ref1=FirebaseDatabase.getInstance().getReference("IN/KU/CS/02");
        ref1.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                if(dataSnapshot.getKey().equals("AC")) {
                    cs02=cs02+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("AM")) {
                    cs02=cs02+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("AP")) {
                    cs02=cs02+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("BI")) {
                    cs02=cs02+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("BT")) {
                    cs02=cs02+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("CL")) {
                    cs02=cs02+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("CH")) {
                    cs02=cs02+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("EE")) {
                    cs02=cs02+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("ET")) {
                    cs02=cs02+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("EF")) {
                    cs02=cs02+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("ED")) {
                    cs02=cs02+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("EH")) {
                    cs02=cs02+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("FP")) {
                    cs02=cs02+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("MA")) {
                    cs02=cs02+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("PH")) {
                    cs02=cs02+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("PS")) {
                    cs02=cs02+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("PP")) {
                    cs02=cs02+(int)dataSnapshot.getChildrenCount();

                }

                filldata();
                listAdapter=new MyExListAdapter(getBaseContext(),branch,semester);
                expandableListView.setAdapter(listAdapter);
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
        ref1=FirebaseDatabase.getInstance().getReference("IN/KU/CS/03");
        ref1.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                if(dataSnapshot.getKey().equals("DC")) {
                    cs03=cs03+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("DM")) {
                    cs03=cs03+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("DT")) {
                    cs03=cs03+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("DS")) {
                    cs03=cs03+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("DE")) {
                    cs03=cs03+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("IF")) {
                    cs03=cs03+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("OP")) {
                    cs03=cs03+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("PL")) {
                    cs03=cs03+(int)dataSnapshot.getChildrenCount();
                }

                filldata();
                listAdapter=new MyExListAdapter(getBaseContext(),branch,semester);
                expandableListView.setAdapter(listAdapter);

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
        ref1=FirebaseDatabase.getInstance().getReference("IN/KU/CS/04");
        ref1.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                if(dataSnapshot.getKey().equals("CA")) {
                    cs04=cs04+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("IF")) {
                    cs04=cs04+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("MI")) {
                    cs04=cs04+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("OP")) {
                    cs04=cs04+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("OS")) {
                    cs04=cs04+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("PL")) {
                    cs04=cs04+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("DD")) {
                    cs04=cs04+(int)dataSnapshot.getChildrenCount();
                }

                // total_cse=total_cse+cs06;
                filldata();
                listAdapter=new MyExListAdapter(getBaseContext(),branch,semester);
                expandableListView.setAdapter(listAdapter);
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
        ref1=FirebaseDatabase.getInstance().getReference("IN/KU/CS/05");
        ref1.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                if(dataSnapshot.getKey().equals("AT")) {
                    cs05=cs05+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("EO")) {
                    cs06=cs06+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("CN")) {
                    cs05=cs05+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("CO")) {
                    cs05=cs05+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("DA")) {
                    cs05=cs05+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("SA")) {
                    cs05=cs05+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("OS")) {
                    cs05=cs05+(int)dataSnapshot.getChildrenCount();
                }

                // total_cse=total_cse+cs06;
                filldata();
                listAdapter=new MyExListAdapter(getBaseContext(),branch,semester);
                expandableListView.setAdapter(listAdapter);

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
        ref1=FirebaseDatabase.getInstance().getReference("IN/KU/CS/06");
        ref1.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                if(dataSnapshot.getKey().equals("AD")) {
                    cs06=cs06+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("CD")) {
                    cs06=cs06+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("CT")) {
                    cs06=cs06+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("EO")) {
                    cs06=cs06+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("MC")) {
                    cs06=cs06+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("NM")) {
                    cs06=cs06+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("SE")) {
                    cs06=cs06+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("WE")) {
                    cs06=cs06+(int)dataSnapshot.getChildrenCount();
                }

                // total_cse=total_cse+cs06;
                filldata();
                listAdapter=new MyExListAdapter(getBaseContext(),branch,semester);
                expandableListView.setAdapter(listAdapter);

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
        ref1=FirebaseDatabase.getInstance().getReference("IN/KU/CS/07");
        ref1.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                if(dataSnapshot.getKey().equals("CD")) {
                    cs07=cs07+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("CG")) {
                    cs07=cs07+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("CI")) {
                    cs07=cs07+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("ES")) {
                    cs07=cs07+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("SC")) {
                    cs07=cs07+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("SP")) {
                    cs07=cs07+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("SM")) {
                    cs07=cs07+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("UL")) {
                    cs07=cs07+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("WE")) {
                    cs07=cs07+(int)dataSnapshot.getChildrenCount();
                }
                Log.e("7 sem",cs07+"");
                // total_cse=total_cse+cs07;
                filldata();
                listAdapter=new MyExListAdapter(getBaseContext(),branch,semester);
                expandableListView.setAdapter(listAdapter);

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
        ref1=FirebaseDatabase.getInstance().getReference("IN/KU/CS/08");
        ref1.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                if(dataSnapshot.getKey().equals("CC")) {
                    cs08=cs08+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("DW")) {
                    cs08=cs08+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("IC")) {
                    cs08=cs08+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("MD")) {
                    cs08=cs08+(int)dataSnapshot.getChildrenCount();
                }

                if(dataSnapshot.getKey().equals("NL")) {
                    cs08=cs08+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("NO")) {
                    cs08=cs08+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("ST")) {
                    cs08=cs08+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("SV")) {
                    cs08=cs08+(int)dataSnapshot.getChildrenCount();
                }
                Log.e("total_cse",total_cse+"");
                total_cse=cs01+cs02+cs03+cs04+cs05+cs06+cs07+cs08;
                filldata();
                listAdapter=new MyExListAdapter(getBaseContext(),branch,semester);
                expandableListView.setAdapter(listAdapter);

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
        // ece paper counts
        ref1=FirebaseDatabase.getInstance().getReference("IN/KU/EC/04");
        ref1.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                if(dataSnapshot.getKey().equals("AN")) {
                    ec04=ec04+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("CA")) {
                    ec04=ec04+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("DE")) {
                    ec04=ec04+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("DT")) {
                    ec04=ec04+(int)dataSnapshot.getChildrenCount();
                }

                if(dataSnapshot.getKey().equals("EM")) {
                    ec04=ec04+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("EY")) {
                    ec04=ec04+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("FW")) {
                    ec04=ec04+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("MS")) {
                    ec04=ec04+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("TA")) {
                    ec04=ec04+(int)dataSnapshot.getChildrenCount();
                }
                filldata();
                listAdapter=new MyExListAdapter(getBaseContext(),branch,semester);
                expandableListView.setAdapter(listAdapter);

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
        ref1=FirebaseDatabase.getInstance().getReference("IN/KU/EC/06");
        ref1.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                if(dataSnapshot.getKey().equals("CE")) {
                    ec06=ec06+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("CS")) {
                    ec06=ec06+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("DO")) {
                    ec06=ec06+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("DI")) {
                    ec06=ec06+(int)dataSnapshot.getChildrenCount();
                }

                if(dataSnapshot.getKey().equals("DP")) {
                    ec06=ec06+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("VD")) {
                    ec06=ec06+(int)dataSnapshot.getChildrenCount();
                }

                filldata();
                listAdapter=new MyExListAdapter(getBaseContext(),branch,semester);
                expandableListView.setAdapter(listAdapter);

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
        ref1=FirebaseDatabase.getInstance().getReference("IN/KU/EC/07");
        ref1.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                if(dataSnapshot.getKey().equals("OC")) {
                    ec07=ec07+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("RE")) {
                    ec07=ec07+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("TE")) {
                    ec07=ec07+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("AI")) {
                    ec07=ec07+(int)dataSnapshot.getChildrenCount();
                }

                if(dataSnapshot.getKey().equals("ME")) {
                    ec07=ec07+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("VL")) {
                    ec07=ec07+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("FW")) {
                    ec07=ec07+(int)dataSnapshot.getChildrenCount();
                }
                filldata();
                listAdapter=new MyExListAdapter(getBaseContext(),branch,semester);
                expandableListView.setAdapter(listAdapter);

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
        ref1=FirebaseDatabase.getInstance().getReference("IN/KU/EC/08");
        ref1.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                if(dataSnapshot.getKey().equals("EI")) {
                    ec08=ec08+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("RA")) {
                    cs08=cs08+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("MU")) {
                    ec08=ec08+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("TA")) {
                    ec08=ec08+(int)dataSnapshot.getChildrenCount();
                }

                if(dataSnapshot.getKey().equals("WI")) {
                    ec08=ec08+(int)dataSnapshot.getChildrenCount();
                }
                Log.e("total_ece",total_ece+"");
                total_ece=cs01+cs02+ec04+ec06+ec07+ec08;
                filldata();
                listAdapter=new MyExListAdapter(getBaseContext(),branch,semester);
                expandableListView.setAdapter(listAdapter);

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
        // IT paper count
        ref1=FirebaseDatabase.getInstance().getReference("IN/KU/IT/04");
        ref1.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                if(dataSnapshot.getKey().equals("CO")) {
                    it04=it04+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("OP")) {
                    it04=it04+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("OS")) {
                    it04=it04+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("PL")) {
                    it04=it04+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("FI")) {
                    it04=it04+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("EY")) {
                    it04=it04+(int)dataSnapshot.getChildrenCount();
                }
                filldata();
                listAdapter=new MyExListAdapter(getBaseContext(),branch,semester);
                expandableListView.setAdapter(listAdapter);

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
        ref1=FirebaseDatabase.getInstance().getReference("IN/KU/IT/06");
        ref1.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                if(dataSnapshot.getKey().equals("CM")) {
                    it06=it06+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("CN")) {
                    it06=it06+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("DA")) {
                    it06=it06+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("MM")) {
                    it06=it06+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("SE")) {
                    it06=it06+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("IM")) {
                    it06=it04+(int)dataSnapshot.getChildrenCount();
                }
                filldata();
                listAdapter=new MyExListAdapter(getBaseContext(),branch,semester);
                expandableListView.setAdapter(listAdapter);

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
        ref1=FirebaseDatabase.getInstance().getReference("IN/KU/IT/07");
        ref1.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                if(dataSnapshot.getKey().equals("AL")) {
                    it07=it07+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("BC")) {
                    it07=it07+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("CD")) {
                    it07=it07+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("EC")) {
                    it07=it07+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("LS")) {
                    it07=it07+(int)dataSnapshot.getChildrenCount();
                }

                filldata();
                listAdapter=new MyExListAdapter(getBaseContext(),branch,semester);
                expandableListView.setAdapter(listAdapter);

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
        ref1=FirebaseDatabase.getInstance().getReference("IN/KU/IT/08");
        ref1.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                if(dataSnapshot.getKey().equals("AA")) {
                    it08=it08+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("CI")) {
                    it08=it08+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("DW")) {
                    it08=it08+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("MB")) {
                    it08=it08+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("EI")) {
                    it08=it08+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("IO")) {
                    it08=it08+(int)dataSnapshot.getChildrenCount();
                }
                total_it=cs01+cs02+it04+it06+it07+it08;
                filldata();
                listAdapter=new MyExListAdapter(getBaseContext(),branch,semester);
                expandableListView.setAdapter(listAdapter);


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
        // ELE paper count
        ref1=FirebaseDatabase.getInstance().getReference("IN/KU/EL/04");
        ref1.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                if(dataSnapshot.getKey().equals("CY")) {
                    el04=el04+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("DE")) {
                    el04=el04+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("EA")) {
                    el04=el04+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("EG")) {
                    el04=el04+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("EM")) {
                    el04=el04+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("PG")) {
                    el04=el04+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("SS")) {
                    el04=el04+(int)dataSnapshot.getChildrenCount();
                }
                filldata();
                listAdapter=new MyExListAdapter(getBaseContext(),branch,semester);
                expandableListView.setAdapter(listAdapter);

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
        ref1=FirebaseDatabase.getInstance().getReference("IN/KU/EL/06");
        ref1.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                if(dataSnapshot.getKey().equals("AE")) {
                    el06=el06+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("DP")) {
                    el06=el06+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("EN")) {
                    el06=el06+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("EZ")) {
                    el06=el06+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("MP")) {
                    el06=el06+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("MS")) {
                    el06=el06+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("PE")) {
                    el06=el06+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("PN")) {
                    el06=el06+(int)dataSnapshot.getChildrenCount();
                }
                filldata();
                listAdapter=new MyExListAdapter(getBaseContext(),branch,semester);
                expandableListView.setAdapter(listAdapter);

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
        ref1=FirebaseDatabase.getInstance().getReference("IN/KU/EL/07");
        ref1.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                if(dataSnapshot.getKey().equals("DN")) {
                    el07=el07+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("EZ")) {
                    el07=el07+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("HV")) {
                    el07=el07+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("NC")) {
                    el07=el07+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("TA")) {
                    el07=el07+(int)dataSnapshot.getChildrenCount();
                }
                 total_el=cs01+cs02+el04+el06+el07+el08;
                filldata();
                listAdapter=new MyExListAdapter(getBaseContext(),branch,semester);
                expandableListView.setAdapter(listAdapter);

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
        ref1=FirebaseDatabase.getInstance().getReference("IN/KU/EL/08");
        ref1.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                if(dataSnapshot.getKey().equals("CP")) {
                    el08=el08+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("EG")) {
                    el08=el08+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("IF")) {
                    el08=el08+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("OR")) {
                    el08=el08+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("UT")) {
                    el08=el08+(int)dataSnapshot.getChildrenCount();
                }
                total_el=cs01+cs02+el04+el06+el07+el08;
                filldata();
                listAdapter=new MyExListAdapter(getBaseContext(),branch,semester);
                expandableListView.setAdapter(listAdapter);

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

        // ME paper count
        ref1=FirebaseDatabase.getInstance().getReference("IN/KU/ME/04");
        ref1.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                if(dataSnapshot.getKey().equals("DY")) {
                    me04=me04+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("FM")) {
                    me04=me04+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("MO")) {
                    me04=me04+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("MT")) {
                    me04=me04+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("PT")) {
                    me04=me04+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("SG")) {
                    me04=me04+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("SL")) {
                    me04=me04+(int)dataSnapshot.getChildrenCount();
                }
                filldata();
                listAdapter=new MyExListAdapter(getBaseContext(),branch,semester);
                expandableListView.setAdapter(listAdapter);

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
        ref1=FirebaseDatabase.getInstance().getReference("IN/KU/ME/06");
        ref1.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                if(dataSnapshot.getKey().equals("CF")) {
                    me06=me06+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("MN")) {
                    me06=me06+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("MV")) {
                    me06=me06+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("OR")) {
                    me06=me06+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("RC")) {
                    me06=me06+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("TV")) {
                    me06=me06+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("TY")) {
                    me06=me06+(int)dataSnapshot.getChildrenCount();
                }
                filldata();
                listAdapter=new MyExListAdapter(getBaseContext(),branch,semester);
                expandableListView.setAdapter(listAdapter);

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
        ref1=FirebaseDatabase.getInstance().getReference("IN/KU/ME/07");
        ref1.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                if(dataSnapshot.getKey().equals("AF")) {
                    me07=me07+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("AG")) {
                    me07=me07+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("MG")) {
                    me07=me07+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("MR")) {
                    me07=me07+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("SQ")) {
                    me07=me07+(int)dataSnapshot.getChildrenCount();
                }

                filldata();
                listAdapter=new MyExListAdapter(getBaseContext(),branch,semester);
                expandableListView.setAdapter(listAdapter);

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
        ref1=FirebaseDatabase.getInstance().getReference("IN/KU/ME/08");
        ref1.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                if(dataSnapshot.getKey().equals("EP")) {
                    me08=me08+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("MM")) {
                    me08=me08+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("NG")) {
                    me08=me08+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("OR")) {
                    me08=me08+(int)dataSnapshot.getChildrenCount();
                }
                if(dataSnapshot.getKey().equals("PI")) {
                    me08=me08+(int)dataSnapshot.getChildrenCount();
                }
                total_me=cs01+cs02+me04+me06+me07+me08;
                filldata();
                listAdapter=new MyExListAdapter(getBaseContext(),branch,semester);
                expandableListView.setAdapter(listAdapter);

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



        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Btech_expendable_list.this,Expendable_loader.class));
            }
        });

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                if((groupPosition)==0 && listAdapter.getChild(groupPosition,childPosition).equals("First semester " +"("+cs01+")")) {
                    Intent i=new Intent(getBaseContext(),Cse_firstsem_subjectlist.class);
                    //i.putExtra("key", "1");
                    startActivity(i);
                    Toast.makeText(Btech_expendable_list.this, "Loading", Toast.LENGTH_SHORT).show();
                }
                if((groupPosition)==0 && listAdapter.getChild(groupPosition,childPosition).equals("Second semester " +"("+cs02+")")) {
                    Intent i=new Intent(getBaseContext(),Cse_secondsem_subjectlist.class);
                   // i.putExtra("key", "2");
                    startActivity(i);
                    Toast.makeText(Btech_expendable_list.this, "Loading", Toast.LENGTH_SHORT).show();
                }
                if((groupPosition)==0 && listAdapter.getChild(groupPosition,childPosition).equals("Third semester " +"("+cs03+")")) {
                    Intent i=new Intent(getBaseContext(),Cse_thirdesem_subjectlist.class);
                    //i.putExtra("key", "first");
                    startActivity(i);
                    Toast.makeText(Btech_expendable_list.this, "Loading", Toast.LENGTH_SHORT).show();
                }
                if((groupPosition)==0 && listAdapter.getChild(groupPosition,childPosition).equals("Fourth semester " +"("+cs04+")")) {
                    Intent i=new Intent(getBaseContext(),Cse_fourthsem_subjectlist.class);
                    //i.putExtra("key", "first");
                    startActivity(i);
                    Toast.makeText(Btech_expendable_list.this, "Loading", Toast.LENGTH_SHORT).show();
                }
                if((groupPosition)==0 && listAdapter.getChild(groupPosition,childPosition).equals("Fifth semester " +"("+cs05+")")) {
                    Intent i=new Intent(getBaseContext(),Cse_fifthsem_subjectlist.class);
                    //i.putExtra("key", "first");
                    startActivity(i);
                    Toast.makeText(Btech_expendable_list.this, "Loading", Toast.LENGTH_SHORT).show();
                }
                if((groupPosition)==0 && listAdapter.getChild(groupPosition,childPosition).equals("Sixth semester " +"("+cs06+")")) {
                    Intent i=new Intent(getBaseContext(),Cse_sixthsem_subjectlist.class);
                    //i.putExtra("key", "first");
                    startActivity(i);
                    Toast.makeText(Btech_expendable_list.this, "Loading", Toast.LENGTH_SHORT).show();
                }
                if((groupPosition)==0 && listAdapter.getChild(groupPosition,childPosition).equals("Seventh semester " +"("+cs07+")")) {
                    Intent i=new Intent(getBaseContext(),Cse_seventhsem_subjectlist.class);
                    //i.putExtra("key", "first");
                    startActivity(i);
                    Toast.makeText(Btech_expendable_list.this, "Loading", Toast.LENGTH_SHORT).show();
                }
                if((groupPosition)==0 && listAdapter.getChild(groupPosition,childPosition).equals("Eight semester " +"("+cs08+")")) {
                    Intent i=new Intent(getBaseContext(),Cse_eightsem_subjectlist.class);
                    //i.putExtra("key", "first");
                    startActivity(i);
                    Toast.makeText(Btech_expendable_list.this, "Loading", Toast.LENGTH_SHORT).show();
                }

                if((groupPosition)==1 && listAdapter.getChild(groupPosition,childPosition).equals("First semester " +"("+cs01+")")) {
                    Intent i=new Intent(getBaseContext(),Cse_firstsem_subjectlist.class);
                    startActivity(i);
                    Toast.makeText(Btech_expendable_list.this, "Loading", Toast.LENGTH_SHORT).show();
//                    Toast.makeText(Btech_expendable_list.this, "Will be uploaded soon", Toast.LENGTH_SHORT).show();
                }
                if((groupPosition)==1 && listAdapter.getChild(groupPosition,childPosition).equals("Second semester " +"("+cs02+")")) {
                    Intent i=new Intent(getBaseContext(),Cse_secondsem_subjectlist.class);
                    startActivity(i);
                    Toast.makeText(Btech_expendable_list.this, "Loading", Toast.LENGTH_SHORT).show();
                }
                if((groupPosition)==1 && listAdapter.getChild(groupPosition,childPosition).equals("Third semester")) {
                    Toast.makeText(Btech_expendable_list.this, "Uploaded soon", Toast.LENGTH_SHORT).show();
                }
                if((groupPosition)==1 && listAdapter.getChild(groupPosition,childPosition).equals("Fourth semester "+"("+it04+")")) {
                    Intent i=new Intent(getBaseContext(),It_fourthsem_subjectlist.class);
                    i.putExtra("key", "4");
                    startActivity(i);

                }
                if((groupPosition)==1 && listAdapter.getChild(groupPosition,childPosition).equals("Fifth semester")) {
                    Toast.makeText(Btech_expendable_list.this, "Uploaded soon", Toast.LENGTH_SHORT).show();
                }
                if((groupPosition)==1 && listAdapter.getChild(groupPosition,childPosition).equals("Sixth semester "+"("+it06+")")) {
                    Intent i=new Intent(getBaseContext(),It_sixthsem_subjectlist.class);
                    i.putExtra("key", "6");
                    startActivity(i);
                }
                if((groupPosition)==1 && listAdapter.getChild(groupPosition,childPosition).equals("Seventh semester "+"("+it07+")")) {
                    Intent i=new Intent(getBaseContext(),It_seventhsem_subjectlist.class);
                    i.putExtra("key", "7");
                    startActivity(i);
                }
                if((groupPosition)==1 && listAdapter.getChild(groupPosition,childPosition).equals("Eight semester "+"("+it08+")")) {
                    Intent i=new Intent(getBaseContext(),It_eightsem_subjectlist.class);
                    i.putExtra("key", "8");
                    startActivity(i);
                }

                if((groupPosition)==2  && listAdapter.getChild(groupPosition,childPosition).equals("First semester " +"("+cs01+")")) {
                    Intent i=new Intent(getBaseContext(),Cse_firstsem_subjectlist.class);
                    startActivity(i);
                    Toast.makeText(Btech_expendable_list.this, "Loading", Toast.LENGTH_SHORT).show();
                }
                if((groupPosition)==2  && listAdapter.getChild(groupPosition,childPosition).equals("Second semester " +"("+cs02+")")) {
                    Intent i=new Intent(getBaseContext(),Cse_secondsem_subjectlist.class);
                    startActivity(i);
                    Toast.makeText(Btech_expendable_list.this, "Loading", Toast.LENGTH_SHORT).show();
                }
                if((groupPosition)==2 && listAdapter.getChild(groupPosition,childPosition).equals("Third semester")) {
                    Toast.makeText(Btech_expendable_list.this, "Uploaded soon", Toast.LENGTH_SHORT).show();
                }
                if((groupPosition)==2 && listAdapter.getChild(groupPosition,childPosition).equals("Fourth semester "+"("+me04+")")) {
                    Intent i=new Intent(getBaseContext(),Me_fourthsem_subjectlist.class);
                    i.putExtra("key", "4");
                    startActivity(i);
                }
                if((groupPosition)==2 && listAdapter.getChild(groupPosition,childPosition).equals("Fifth semester")) {
                    Toast.makeText(Btech_expendable_list.this, "Uploaded soon", Toast.LENGTH_SHORT).show();
                }
                if((groupPosition)==2 && listAdapter.getChild(groupPosition,childPosition).equals("Sixth semester "+"("+me06+")")) {
                    Intent i=new Intent(getBaseContext(),Me_sixthsem_subjectlist.class);
                    i.putExtra("key", "6");
                    startActivity(i);
                }
                if((groupPosition)==2 && listAdapter.getChild(groupPosition,childPosition).equals("Seventh semester "+"("+me07+")")) {
                    Intent i=new Intent(getBaseContext(),Me_seventhsem_subjectlist.class);
                    i.putExtra("key", "7");
                    startActivity(i);
                }
                if((groupPosition)==2 && listAdapter.getChild(groupPosition,childPosition).equals("Eight semester "+"("+me08+")")) {
                    Intent i=new Intent(getBaseContext(),Me_eightsem_subjectlist.class);
                    i.putExtra("key", "8");
                    startActivity(i);
                }

                if((groupPosition)==3  && listAdapter.getChild(groupPosition,childPosition).equals("First semester " +"("+cs01+")")) {
                    Intent i=new Intent(getBaseContext(),Cse_firstsem_subjectlist.class);
                    startActivity(i);
                    Toast.makeText(Btech_expendable_list.this, "Loading", Toast.LENGTH_SHORT).show();
                }
                if((groupPosition)==3  && listAdapter.getChild(groupPosition,childPosition).equals("Second semester " +"("+cs02+")")) {
                    Intent i=new Intent(getBaseContext(),Cse_secondsem_subjectlist.class);
                    startActivity(i);
                    Toast.makeText(Btech_expendable_list.this, "Loading", Toast.LENGTH_SHORT).show();
                }
                if((groupPosition)==3 && listAdapter.getChild(groupPosition,childPosition).equals("Third semester "+"("+0+")")) {
                    Toast.makeText(Btech_expendable_list.this, "Uploaded soon", Toast.LENGTH_SHORT).show();
                }
                if((groupPosition)==3 && listAdapter.getChild(groupPosition,childPosition).equals("Fourth semester "+"("+ec04+")")) {
                    Intent i=new Intent(getBaseContext(),Ece_fourthsem_subjectlist.class);
                    i.putExtra("key", "4");
                    startActivity(i);

                }
                if((groupPosition)==3 && listAdapter.getChild(groupPosition,childPosition).equals("Fifth semester "+"("+0+")")) {
                    Toast.makeText(Btech_expendable_list.this, "Uploaded soon", Toast.LENGTH_SHORT).show();
                }
                if((groupPosition)==3 && listAdapter.getChild(groupPosition,childPosition).equals("Sixth semester "+"("+ec06+")")) {
                    Intent i=new Intent(getBaseContext(),Ece_sixthsem_subjectlist.class);
                    i.putExtra("key", "6");
                    startActivity(i);

                }
                if((groupPosition)==3 && listAdapter.getChild(groupPosition,childPosition).equals("Seventh semester "+"("+ec07+")")) {
                    Intent i=new Intent(getBaseContext(),Ece_seventhsem_subjectlist.class);
                    i.putExtra("key", "7");
                    startActivity(i);

                }
                if((groupPosition)==3 && listAdapter.getChild(groupPosition,childPosition).equals("Eight semester "+"("+ec08+")")) {
                    Intent i=new Intent(getBaseContext(),Ece_eightsem_subjectlist.class);
                    i.putExtra("key", "8");
                    startActivity(i);
                }



                if((groupPosition)==4  && listAdapter.getChild(groupPosition,childPosition).equals("First semester " +"("+cs01+")")) {
                    Intent i=new Intent(getBaseContext(),Cse_firstsem_subjectlist.class);
                    startActivity(i);
                    Toast.makeText(Btech_expendable_list.this, "Loading", Toast.LENGTH_SHORT).show();
                }
                if((groupPosition)==4  && listAdapter.getChild(groupPosition,childPosition).equals("Second semester " +"("+cs02+")")) {
                    Intent i=new Intent(getBaseContext(),Cse_secondsem_subjectlist.class);
                    startActivity(i);
                    Toast.makeText(Btech_expendable_list.this, "Loading", Toast.LENGTH_SHORT).show();
                }
                if((groupPosition)==4 && listAdapter.getChild(groupPosition,childPosition).equals("Third semester")) {
                    Toast.makeText(Btech_expendable_list.this, "Uploaded soon", Toast.LENGTH_SHORT).show();
                }
                if((groupPosition)==4 && listAdapter.getChild(groupPosition,childPosition).equals("Fourth semester "+"("+el04+")")) {
                    Intent intent=new Intent(Btech_expendable_list.this,Ele_fourthsem_subjectlist.class);
                    intent.putExtra("key", "4");
                    startActivity(intent);
                }
                if((groupPosition)==4 && listAdapter.getChild(groupPosition,childPosition).equals("Fifth semester")) {
                    Toast.makeText(Btech_expendable_list.this, "Uploaded soon", Toast.LENGTH_SHORT).show();
                }
                if((groupPosition)==4 && listAdapter.getChild(groupPosition,childPosition).equals("Sixth semester "+"("+el06+")")) {
                    Intent intent=new Intent(Btech_expendable_list.this,Ele_sixthsem_subjectlist.class);
                    intent.putExtra("key", "6");
                    startActivity(intent);
                }
                if((groupPosition)==4 && listAdapter.getChild(groupPosition,childPosition).equals("Seventh semester "+"("+el07+")")) {
                    Intent intent=new Intent(Btech_expendable_list.this,Ele_seventhsem_subjectlist.class);
                    intent.putExtra("key", "7");
                    startActivity(intent);
                }
                if((groupPosition)==4 && listAdapter.getChild(groupPosition,childPosition).equals("Eight semester "+"("+el08+")")) {
                    Intent intent=new Intent(Btech_expendable_list.this,Ele_eightsem_subjectlist.class);
                    intent.putExtra("key", "8");
                    startActivity(intent);
                }

                return false;
            }
        });
    }

    public void filldata(){
        branch=new ArrayList<>();
        semester=new HashMap<>();

        branch.add("Computer Science Engineering " +"("+total_cse+")");
        branch.add("Information Technology "+"("+total_it+")");
        branch.add("Mechanical Engineering "+"("+total_me+")");
        branch.add("Electronics and Communication Engg. "+"("+total_ece+")");
        branch.add("Electrical Engineering "+"("+total_el+")");

        List<String> first=new ArrayList<>();
        List<String> second=new ArrayList<>();
        List<String> third=new ArrayList<>();
        List<String> fourth=new ArrayList<>();
        List<String> fifth=new ArrayList<>();

        first.add("First semester " +"("+cs01+")");
        first.add("Second semester "+"("+cs02+")");
        first.add("Third semester "+"("+cs03+")");
        first.add("Fourth semester "+"("+cs04+")");
        first.add("Fifth semester "+"("+cs05+")");
        first.add("Sixth semester "+"("+cs06+")");
        first.add("Seventh semester "+"("+cs07+")");
        first.add("Eight semester "+"("+cs08+")");

        second.add("First semester "+"("+cs01+")");
        second.add("Second semester "+"("+cs02+")");
        second.add("Third semester "+"("+0+")");
        second.add("Fourth semester "+"("+it04+")");
        second.add("Fifth semester "+"("+0+")");
        second.add("Sixth semester "+"("+it06+")");
        second.add("Seventh semester "+"("+it07+")");
        second.add("Eight semester "+"("+it08+")");

        third.add("First semester "+"("+cs01+")");
        third.add("Second semester "+"("+cs02+")");
        third.add("Third semester "+"("+0+")");
        third.add("Fourth semester "+"("+me04+")");
        third.add("Fifth semester "+"("+0+")");
        third.add("Sixth semester "+"("+me06+")");
        third.add("Seventh semester "+"("+me07+")");
        third.add("Eight semester "+"("+me08+")");

        fourth.add("First semester "+"("+cs01+")");
        fourth.add("Second semester "+"("+cs02+")");
        fourth.add("Third semester "+"("+0+")");
        fourth.add("Fourth semester "+"("+ec04+")");
        fourth.add("Fifth semester "+"("+0+")");
        fourth.add("Sixth semester "+"("+ec06+")");
        fourth.add("Seventh semester "+"("+ec07+")");
        fourth.add("Eight semester "+"("+ec08+")");

        fifth.add("First semester "+"("+cs01+")");
        fifth.add("Second semester "+"("+cs02+")");
        fifth.add("Third semester "+"("+0+")");
        fifth.add("Fourth semester "+"("+el04+")");
        fifth.add("Fifth semester "+"("+0+")");
        fifth.add("Sixth semester "+"("+el06+")");
        fifth.add("Seventh semester "+"("+el07+")");
        fifth.add("Eight semester "+"("+el08+")");

        semester.put(branch.get(0),first);
        semester.put(branch.get(1),second);
        semester.put(branch.get(2),third);
        semester.put(branch.get(3),fourth);
        semester.put(branch.get(4),fifth);

    }
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        startActivity(new Intent(Btech_expendable_list.this, MainActivity.class));
        finish();

    }

}

package com.example.davet.beach1.CSU_List;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.davet.beach1.InfoTemplate;
import com.example.davet.beach1.R;

public class CSU_MontereyBay extends AppCompatActivity implements InfoTemplate {
    private final String SCHOOL_NAME = "CSU Monterey Bay";
    private final String ADDRESS = "5108 Fourth Avenue, Marina, CA 93933";
    private final String NUM_STRING = "(831) 655-0268";

    private TextView cSUName;
    private TextView contactInfo;
    private Button callButton;
    private Button call911;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csu__montereybay); //change this one to the respective XML Layout

        cSUName = (TextView) findViewById(R.id.schoolName);
        cSUName.setText(getSchoolName());

        contactInfo = (TextView) findViewById(R.id.schoolDetail);
        contactInfo.setText(getAddress() + "\n" + getNumString());

        callButton = (Button) findViewById(R.id.callCampPol);
        callButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                dialContactPhone(getNumString());
            }
        });

        call911 = (Button) findViewById(R.id.call911);
        call911.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                dialContactPhone("911");
            }
        });
    }

    private void  dialContactPhone(final String phoneNumber) {
        //startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));
        String uri = "tel:" + phoneNumber.trim();
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse(uri));
        startActivity(intent);
    }

    @Override
    public String getSchoolName() {
        return SCHOOL_NAME;
    }

    @Override
    public String getAddress() {
        return ADDRESS;
    }

    @Override
    public String getNumString() {
        return NUM_STRING;
    }

    @Override
    public int getNumInt() {
        return 0;
    }
}
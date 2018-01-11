package com.machinetest;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.OnClick;


public class MainActivity extends Activity implements Maincontract.viewMain {

MainPresenter presenter;
  @BindView(R.id.et_email)
    EditText et_email;
    @BindView(R.id.et_pass)
     EditText et_pass;
    @BindView(R.id.btn_submit)
     Button btn_submit;
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter=new MainPresenter(this);
    }



    @Override
    public void init() {


    }

    @OnClick(R.id.btn_submit)
    public void Loginuser(View view)
    {
        String temp=et_email.getText().toString();
        String temp_pass=et_pass.getText().toString();
        Toast.makeText(mContext,"Submit Clicked By "+temp,Toast.LENGTH_SHORT).show();
        presenter.submitlogin(et_email,et_pass);
    }



}


package com.machinetest;

import android.widget.EditText;

/**
 * Created by webwerks1 on 11/1/18.
 */
public class MainPresenter implements Maincontract.presenterMain {


    Maincontract.viewMain mView;


    public MainPresenter(Maincontract.viewMain view) {
        mView=view;
  }


    public void submitlogin(EditText et_email, EditText et_pass) {

    }
}



package com.exp.sign;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.jiang.geo.R;
import com.wang.avi.AVLoadingIndicatorView;

import butterknife.ButterKnife;

public class CPWDActivity extends AppCompatActivity {

    private CardView cvAdd;
    private EditText etName;
    private EditText etNo;
    private EditText etPhone;
    private Button btGo;
    private FloatingActionButton fab;
    private AVLoadingIndicatorView loadingIndicatorView;

    private BmobUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_pwd);
        ButterKnife.bind(this);

        loadingIndicatorView = (AVLoadingIndicatorView) findViewById(R.id.loading);
        cvAdd = (CardView) findViewById(R.id.cv_add);
        etName = (EditText) findViewById(R.id.et_name);
        etNo = (EditText) findViewById(R.id.et_no);
        etPhone = (EditText) findViewById(R.id.et_phone);
        btGo = (Button) findViewById(R.id.bt_go);
        fab = (FloatingActionButton) findViewById(R.id.fab);
        loadingIndicatorView.hide();


        btGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next(view);
            }
        });

        user = App.app.getDaoSession().getBmobUserDao().loadAll().get(0);

    }

    public void next(View view) {

        final String name = etName.getText().toString();
        final String no = etNo.getText().toString();
        final String phone = etPhone.getText().toString();

        if (TextUtils.isEmpty(name) || TextUtils.isEmpty(no)
                || TextUtils.isEmpty(phone)) {
            Toast.makeText(this, "Please enter complete information", Toast.LENGTH_SHORT).show();
            return;
        }
        if(!no.equalsIgnoreCase(phone)){
            Toast.makeText(this, "The two passwords are inconsistent", Toast.LENGTH_SHORT).show();
            return;
        }
        if(!name.equalsIgnoreCase(user.getPassword())){
            Toast.makeText(this, "Original password input error", Toast.LENGTH_SHORT).show();
            return;
        }
        loadingIndicatorView.show();
        user.setPassword(no);

        App.app.getDaoSession().getBmobUserDao().update(user);
        Toast.makeText(CPWDActivity.this, "Modified successfully", Toast.LENGTH_SHORT).show();
        finish();
    }

}

package com.melo.danillo.gerenciadordeligas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements  View.OnClickListener{

    private EditText txtEmail;
    private Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txtEmail = (EditText) findViewById(R.id.editText_email_login);

        Bundle bundle = getIntent().getExtras();
       String email =   bundle.getString("email");
        txtEmail.setText(email);

       btnLogin = (Button) findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.btn_login){
            Toast.makeText(this,"Email "+txtEmail.getText().toString(),Toast.LENGTH_LONG);
        }

    }
}

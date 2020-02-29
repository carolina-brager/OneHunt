package com.wichacks2020.onehunt.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.wichacks2020.onehunt.R;

public class SignUpActivity extends AppCompatActivity {

    EditText mUsername, mPassword;
    Button btnRegister;
    TextView tvLogin;
    FirebaseAuth mFireBaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        mFireBaseAuth = FirebaseAuth.getInstance();
        mUsername = findViewById(R.id.username);
        mPassword = findViewById(R.id.password);
        btnRegister = findViewById(R.id.register);
        tvLogin = findViewById(R.id.sign_in);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = mUsername.getText().toString();
                String password = mPassword.getText().toString();

                if(username.isEmpty()){
                    mUsername.setError("Please enter your username");
                    mUsername.requestFocus();
                }
                else if(password.isEmpty()){
                    mPassword.setError("Please enter your password");
                    mPassword.requestFocus();
                }
                else{
                    mFireBaseAuth.createUserWithEmailAndPassword(
                            username, password).addOnCompleteListener(SignUpActivity.this, new OnCompleteListener<com.google.firebase.auth.AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<com.google.firebase.auth.AuthResult> task) {
                            if(!task.isSuccessful()){
                                Toast.makeText(SignUpActivity.this, "Registration unsuccessful, try again", Toast.LENGTH_SHORT).show();
                            }
                            else{
                                startActivity(new Intent(SignUpActivity.this, MainActivity.class));
                            }
                        }
                    });
                }
            }
        });

        tvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SignUpActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });
    }
}

package com.example.pavanbora.tvshows;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.firebaseAuth;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;
    EditText username,password;
    Button register,forgotpassword;
    TextView login;
    CardView logincard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth=findViewById()

    }
}

package com.rcoem.enotice.enotice_app;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class AccountActivity extends AppCompatActivity {

    private Button signOut;

    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);







        mAuth = FirebaseAuth.getInstance();
        signOut = (Button) findViewById(R.id.signOut);

        signOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mAuth.signOut();
                Toast.makeText(AccountActivity.this, R.string.sign_out, Toast.LENGTH_LONG).show();
                startActivity(new Intent(AccountActivity.this, MainActivity.class));
            }
        });
    }

}

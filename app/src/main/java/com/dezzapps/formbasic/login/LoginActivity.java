package com.dezzapps.formbasic.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.dezzapps.formbasic.R;
import com.dezzapps.formbasic.root.App;

import javax.inject.Inject;

public class LoginActivity extends AppCompatActivity implements LoginActivityMVP.View {

    @Inject
    LoginActivityMVP.Presenter presenter;

    EditText editTextUsername, editTextPassword;
    Button buttonSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((App) getApplication()).getComponent().inject(this);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonSubmit = findViewById(R.id.buttonSubmit);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                presenter.loginButtonCLicked();
                       }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.setView(this);
        presenter.getCurrentUser();
    }

    @Override
    public String getUsername() {
        return this.editTextUsername.getText().toString();
    }

    @Override
    public String getPassword() {
        return this.editTextPassword.getText().toString();
    }

    @Override
    public void showUserNotAvalible() {
        Toast.makeText(getApplicationContext(), "User no Availeble", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void showInputError() {
        Toast.makeText(getApplicationContext(), "Error, problemas al ingresar", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void showUserSaved() {
        Toast.makeText(getApplicationContext(), "User saved", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void setUsername(String username) {
        editTextUsername.setText(username);
    }

    @Override
    public void setPassword(String password) {
        editTextPassword.setText(password);
    }
}

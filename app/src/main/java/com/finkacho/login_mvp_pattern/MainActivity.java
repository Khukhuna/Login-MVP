package com.finkacho.login_mvp_pattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.finkacho.login_mvp_pattern.Presenter.LoginPresenter;
import com.finkacho.login_mvp_pattern.View.LoginView;

public class MainActivity extends AppCompatActivity implements LoginView {

    private EditText mail;
    private EditText pwd;
    private Button signIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mail = findViewById(R.id.mailInput);
        pwd = findViewById(R.id.pwdInput);

        signIn = findViewById(R.id.signIn);

        final LoginPresenter presenter = new LoginPresenter(this);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onLogin(mail.getText().toString(), pwd.getText().toString());
            }
        });

    }

    @Override
    public void onLoginResult(String message) {
        Log.d("MainActivity", message);
    }
}

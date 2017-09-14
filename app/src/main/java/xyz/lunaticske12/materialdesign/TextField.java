package xyz.lunaticske12.materialdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.widget.RelativeLayout;

public class TextField extends AppCompatActivity {

    AppCompatEditText user;
    AppCompatEditText pass;
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_field);

        user = (AppCompatEditText) findViewById(R.id.username_TextField);
        pass = (AppCompatEditText) findViewById(R.id.password_TextField);
        relativeLayout = (RelativeLayout) findViewById(R.id.activity_text_field);

        relativeLayout.setOnClickListener(null);

    }
}

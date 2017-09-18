package xyz.lunaticske12.materialdesign;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatCheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class SelectionActivity extends AppCompatActivity {

    AppCompatCheckBox appCompatCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

        appCompatCheckBox = (AppCompatCheckBox) findViewById(R.id.checkbox_id);

        appCompatCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    Toast.makeText(getApplicationContext(), "CheckBox is Enable", Toast.LENGTH_SHORT).show();

                }
                else {
                    Toast.makeText(getApplicationContext(), "CheckBox is Disable", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}

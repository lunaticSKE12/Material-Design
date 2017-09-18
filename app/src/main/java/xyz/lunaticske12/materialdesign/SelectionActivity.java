package xyz.lunaticske12.materialdesign;

import android.provider.Settings;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.AppCompatRadioButton;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SelectionActivity extends AppCompatActivity {

    AppCompatCheckBox appCompatCheckBox;
    AppCompatRadioButton appCompatRadioButton;

    RadioGroup radioGroup;

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

        appCompatRadioButton = (AppCompatRadioButton) findViewById(R.id.RadioButton1_id);
        appCompatRadioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            }
        });

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup_id);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

                switch (checkedId){
                    case R.id.RadioButton1_id:
                        Toast.makeText(getApplicationContext(), "Check 1", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.RadioButton2_id:
                        Toast.makeText(getApplicationContext(), "Check 2", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}

package xyz.lunaticske12.materialdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //set back to home
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.item1_id){
            Toast.makeText(getApplicationContext(), "item1 is selected", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(), Drawer.class);
            startActivity(intent);

        }
        else if (id == R.id.item2_id){
            Toast.makeText(getApplicationContext(), "item2 is selected", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.item3_id){
            Toast.makeText(getApplicationContext(), "item3 is selected", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.search_id){
            Toast.makeText(getApplicationContext(), "search is selected", Toast.LENGTH_SHORT).show();
        }
        else if(id == R.id.cart_id){
            Toast.makeText(getApplicationContext(), "cart is selected", Toast.LENGTH_SHORT).show();
        }
        else if(id == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}

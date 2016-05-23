package com.example.baibers.assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

import java.util.*;

public class MainActivity extends ActionBarActivity {
    String str;
    Random rand=new Random();
    int randomNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //normal click event handling
        Button button=(Button)findViewById(R.id.buttonGs);
        button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView textView=(TextView)findViewById(R.id.textView);
                        EditText Text1=(EditText)findViewById(R.id.Text1);
                        str = Text1.getText().toString();
                        randomNum=rand.nextInt(1000);
                        int num = Integer.parseInt(str);
                        int x = randomNum-num;
                        if (x==0){
                            Toast.makeText(getApplicationContext(), "EQUAL", Toast.LENGTH_SHORT).show();
                        }
                        else if(x<=5 && x>=-5){
                            Toast.makeText(getApplicationContext(), "VERY CLOSE", Toast.LENGTH_SHORT).show();
                        }
                        else if(x>5) {
                            Toast.makeText(getApplicationContext(), "SMALLER", Toast.LENGTH_SHORT).show();
                        }
                        else Toast.makeText(getApplicationContext(), "LARGER", Toast.LENGTH_SHORT).show();

                        textView.setText(Integer.toString(randomNum));

                    }
                }
        );
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

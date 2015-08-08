package com.estebanb123.sqlliteaplicacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    EditText maguiInput;
    TextView maguiText;
    MyDBHandler dbhandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        maguiInput =(EditText)findViewById(R.id.maguiEditText);
        maguiText = (TextView)findViewById(R.id.maguiTextView);
        dbhandler = new MyDBHandler(this,null,null,1);
        printDatabase();
    }
    //add a product to the db
    public void addButtonClicked(View v){
        Producto p = new Producto(maguiInput.getText().toString());
        dbhandler.addProducto(p);
        printDatabase();
    }
    //delete a product to the db
    public void deleteButtonClicked(View v){
        String inputText = maguiInput.getText().toString();
        dbhandler.deleteProducto(inputText);
        printDatabase();
    }
    public void printDatabase(){
        String dbString =dbhandler.databaseToString();
        maguiText.setText(dbString);
        maguiInput.setText("");
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

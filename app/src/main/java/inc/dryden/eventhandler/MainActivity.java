package inc.dryden.eventhandler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = findViewById(R.id.bt);

        button.setOnClickListener(
                new Button.OnClickListener(){
                    int n = 0;


                    public void onClick(View v){

                        if(n == 0){
                        TextView myTXT = (TextView)findViewById(R.id.msg);
                        myTXT.setText("Not bad");
                        n = n + 1;
                        }
                        else{
                            TextView myTXT = (TextView)findViewById(R.id.msg);
                            myTXT.setText("Hello World");
                            n = 0;
                        }


                        }
                    }

                    );


    Button bt = findViewById(R.id.chnge);

        bt.setOnClickListener(
                new Button.OnClickListener(){

                    public void onClick(View v){


                    startActivity(new Intent(MainActivity.this, Main2Activity.class));

                    }


    });
}
}
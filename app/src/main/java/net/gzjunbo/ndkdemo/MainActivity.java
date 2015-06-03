package net.gzjunbo.ndkdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {
    private Button callNdk;

    static {
        System.loadLibrary("Hello");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        callNdk = (Button) findViewById(R.id.callNDK);
        callNdk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, callNDK(),Toast.LENGTH_LONG ).show();
            }
        });
    }

     public native String callNDK();
}

package justina.santos.com.santosjustinalab4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4ITH","OnCreate() is running!");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4ITH","OnStart() is running!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ITH","OnResume() is running!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4ITH","OnPause() is running!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4ITH","OnStop() is running!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4ITH","OnRestart() is running!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4ITH","OnDestroy() is running!");
    }

    public void displayMSG(View v)
    {
        if(v.getId() == R.id.next)
        {
            Snackbar.make(v, "Next button is clicked!", Snackbar.LENGTH_LONG).show();
        }
        else if(v.getId() == R.id.back)
         Toast.makeText(this, "Back button is clicked!", Toast.LENGTH_SHORT).show();


    }


}

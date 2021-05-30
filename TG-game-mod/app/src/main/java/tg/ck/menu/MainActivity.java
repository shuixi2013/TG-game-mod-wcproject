package tg.ck.menu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import tg.ck.MApplication;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //To launch mod menu
        StaticActivity.Start(this);

        //To load lib only
        //LoadLib.Start(this);

        //To launch game activity
        //Uncomment this if you are following METHOD 2 of CHANGING FILES
        try {
            //Start service
            MainActivity.this.startActivity(new Intent(MainActivity.this, Class.forName(MApplication.GameActivity)));
        } catch (ClassNotFoundException e) {
            Toast.makeText(MainActivity.this, "Error. Game's main activity does not exist", Toast.LENGTH_LONG).show();
            e.printStackTrace();
            return;
        }
    }
}

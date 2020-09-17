package game.prodjekt.sasadd;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    protected WebView game;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // init
        game = (WebView) findViewById(R.id.game);

        // settings
        game.setInitialScale(1);
        game.getSettings().setUseWideViewPort(true);
        game.getSettings().setLoadWithOverviewMode(true);
        game.getSettings().setAllowContentAccess(true);
        game.getSettings().setDomStorageEnabled(true);
        game.getSettings().setAllowFileAccess(true);
        game.getSettings().setAllowUniversalAccessFromFileURLs(true);

        // load
        game.loadUrl("file:///android_asset/game/index.html");


    }
}
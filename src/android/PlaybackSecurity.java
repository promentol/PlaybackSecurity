import android.os.Bundle;
import org.apache.cordova.*;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class PlaybackSecurity extends CordovaActivity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        super.init();

        WebView wv = (WebView) appView.getEngine().getView();
        WebSettings ws = wv.getSettings();
        ws.setMediaPlaybackRequiresUserGesture(false);
        ws.setAllowFileAccess(true);

        loadUrl(launchUrl);
    }
}
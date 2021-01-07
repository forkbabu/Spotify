package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.fragment.app.c;

/* renamed from: ibb  reason: default package */
public class ibb extends WebChromeClient {
    private final b a;
    private final jbb b = new jbb();
    private final kbb c;

    /* renamed from: ibb$a */
    public interface a {
    }

    /* renamed from: ibb$b */
    public interface b {
    }

    public ibb(b bVar, a aVar) {
        this.a = bVar;
        this.c = new kbb(aVar);
    }

    public void a(int i, int i2, Intent intent) {
        this.c.b(i, i2, intent);
    }

    public void b() {
        this.b.a();
        this.c.a();
    }

    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(WebView webView) {
        c B2 = ((com.spotify.music.libs.web.b) this.a).a.B2();
        if (B2 != null) {
            B2.finish();
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        this.b.e(webView.getContext(), str2, jsResult);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        this.c.c(valueCallback, fileChooserParams);
        return true;
    }
}

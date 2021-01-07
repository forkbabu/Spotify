package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.libs.web.c;
import defpackage.ibb;

/* access modifiers changed from: package-private */
/* renamed from: kbb  reason: default package */
public class kbb {
    private final ibb.a a;
    private ValueCallback<Uri[]> b;

    kbb(ibb.a aVar) {
        this.a = aVar;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        ValueCallback<Uri[]> valueCallback = this.b;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
            this.b = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void b(int i, int i2, Intent intent) {
        Logger.b("onActivityResult %s, %s, %s", Integer.valueOf(i), Integer.valueOf(i2), intent);
        if (i == 1780) {
            Uri[] parseResult = WebChromeClient.FileChooserParams.parseResult(i2, intent);
            ValueCallback<Uri[]> valueCallback = this.b;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(parseResult);
                this.b = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Logger.b("onShowFileChooser", new Object[0]);
        Logger.b("setCurrentCallback %s", valueCallback);
        a();
        this.b = valueCallback;
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                ((c) this.a).a.H4(fileChooserParams.createIntent(), 1780, null);
            } catch (ActivityNotFoundException unused) {
                a();
            }
        } else {
            a();
        }
    }
}

package defpackage;

import android.net.Uri;
import android.util.Base64;
import com.adjust.sdk.Constants;
import com.google.common.base.Charsets;
import java.io.InputStream;

/* renamed from: lwd  reason: default package */
public class lwd {
    private final yb3 a;
    private final hwd b;

    public lwd(yb3 yb3, hwd hwd) {
        this.a = yb3;
        this.b = hwd;
    }

    public InputStream a(Uri uri) {
        Uri a2 = this.b.a(uri);
        String uri2 = a2.toString();
        String scheme = a2.getScheme();
        if ("spotify".equals(scheme)) {
            if (uri2.startsWith("spotify:image:")) {
                uri2 = Base64.encodeToString(uri2.substring(14).getBytes(Charsets.UTF_8), 0);
            } else if (uri2.startsWith("spotify:localfileimage:")) {
                uri2 = Base64.encodeToString(uri2.getBytes(Charsets.UTF_8), 0);
            }
        } else if ("http".equals(scheme) || Constants.SCHEME.equals(scheme)) {
            uri2 = Base64.encodeToString(uri2.getBytes(Charsets.UTF_8), 0);
        }
        InputStream a3 = this.a.a(uri2);
        if (a3 == null) {
            return null;
        }
        return a3;
    }
}

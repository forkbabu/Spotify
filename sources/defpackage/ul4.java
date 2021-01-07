package defpackage;

import android.net.Uri;

/* renamed from: ul4  reason: default package */
public class ul4 implements ll4 {
    @Override // defpackage.ll4
    public boolean a(Uri uri) {
        String uri2 = uri.toString();
        return uri2.startsWith("https://www.paypal.com/cgi-bin/webscr") || uri2.startsWith("https://www.sandbox.paypal.com/cgi-bin/webscr");
    }
}

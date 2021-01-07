package com.facebook.login;

import android.net.Uri;
import com.facebook.login.LoginClient;
import java.util.Collection;

public class h extends o {
    private static volatile h h;
    private Uri g;

    public static h r() {
        if (h == null) {
            synchronized (h.class) {
                if (h == null) {
                    h = new h();
                }
            }
        }
        return h;
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.login.o
    public LoginClient.d a(Collection<String> collection) {
        LoginClient.d a = super.a(collection);
        Uri uri = this.g;
        if (uri != null) {
            a.l(uri.toString());
        }
        return a;
    }

    public void s(Uri uri) {
        this.g = uri;
    }
}

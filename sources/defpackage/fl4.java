package defpackage;

import android.net.Uri;

/* access modifiers changed from: package-private */
/* renamed from: fl4  reason: default package */
public class fl4 {
    private final String a;

    fl4(String str) {
        this.a = str;
    }

    /* access modifiers changed from: package-private */
    public Uri a(Uri uri) {
        return uri.buildUpon().appendQueryParameter("app_version", this.a).build();
    }
}

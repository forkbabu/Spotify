package defpackage;

import android.net.Uri;
import android.os.Bundle;

/* access modifiers changed from: package-private */
/* renamed from: vx8  reason: default package */
public abstract class vx8 {
    vx8() {
    }

    public static vx8 a(Uri uri, Bundle bundle) {
        Uri b = uri != null ? khf.b(uri) : Uri.EMPTY;
        String str = "";
        String string = bundle != null ? bundle.getString("android.intent.extra.user_query", str) : str;
        if (bundle != null) {
            str = bundle.getString("android.intent.extra.user_query_language", str);
        }
        return new sx8(b, string, str);
    }

    public abstract String b();

    public abstract String c();

    public abstract Uri d();
}

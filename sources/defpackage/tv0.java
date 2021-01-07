package defpackage;

import android.net.Uri;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import kotlin.jvm.internal.h;
import kotlin.text.e;

/* renamed from: tv0  reason: default package */
public class tv0 implements tw0 {
    private static final SpSharedPreferences.b<Object, String> b;
    private final SpSharedPreferences<Object> a;

    static {
        SpSharedPreferences.b<Object, String> c = SpSharedPreferences.b.c("com.spotify.music.spotlets.tracker.adjust.adjustUri.Allboarding");
        h.d(c, "SpSharedPreferences.PrefsKey.makeKey(KEY_ID)");
        b = c;
    }

    public tv0(SpSharedPreferences<Object> spSharedPreferences) {
        h.e(spSharedPreferences, "prefs");
        this.a = spSharedPreferences;
    }

    @Override // defpackage.tw0
    public void a(Uri uri) {
        h.e(uri, "uri");
        String uri2 = uri.toString();
        h.d(uri2, "uri.toString()");
        boolean z = true;
        if (!(!e.n(uri2)) || !l0.x(uri2)) {
            z = false;
        }
        if (z) {
            SpSharedPreferences.a<Object> b2 = this.a.b();
            b2.f(b, uri.toString());
            b2.i();
        }
    }

    public final void b() {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.h(b);
        b2.i();
    }

    public String c() {
        String n = this.a.n(b, "");
        h.d(n, "storedLink");
        if (!e.n(n)) {
            n = l0.z(n).B();
            if (n == null) {
                return "";
            }
            if (!(!e.n(n))) {
                n = null;
            }
            if (n == null) {
                return "";
            }
        }
        return n;
    }
}

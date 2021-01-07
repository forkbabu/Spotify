package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: jwc  reason: default package */
public class jwc {
    private static final SpSharedPreferences.b<Object, Boolean> b = SpSharedPreferences.b.c("last_known_is_logged_out_status");
    private final SpSharedPreferences<Object> a;

    public jwc(SpSharedPreferences<Object> spSharedPreferences) {
        this.a = spSharedPreferences;
    }

    public boolean a() {
        return this.a.d(b, true);
    }

    public void b(boolean z) {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.a(b, z);
        b2.i();
    }
}

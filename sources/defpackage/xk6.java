package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: xk6  reason: default package */
public class xk6 {
    private static final SpSharedPreferences.b<Object, Boolean> b = SpSharedPreferences.b.e("offline.user.mix.education.row.dismissed");
    private final SpSharedPreferences<Object> a;

    public xk6(SpSharedPreferences<Object> spSharedPreferences) {
        this.a = spSharedPreferences;
    }

    public boolean a() {
        return this.a.d(b, false);
    }

    public void b() {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.a(b, true);
        b2.i();
    }
}

package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* access modifiers changed from: package-private */
/* renamed from: wj6  reason: default package */
public class wj6 {
    private static final SpSharedPreferences.b<Object, Boolean> b = SpSharedPreferences.b.e("playlist.education.shuffle.dismissed");
    private final SpSharedPreferences<Object> a;

    public wj6(SpSharedPreferences<Object> spSharedPreferences) {
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

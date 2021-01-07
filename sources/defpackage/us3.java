package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: us3  reason: default package */
public class us3 implements ts3 {
    public static final SpSharedPreferences.b<Object, Long> b = SpSharedPreferences.b.e("last_shown_reminder_timestamp");
    public static final SpSharedPreferences.b<Object, Boolean> c = SpSharedPreferences.b.e("user_has_saved_ad");
    public static final SpSharedPreferences.b<Object, Long> d = SpSharedPreferences.b.e("user_has_saved_ad_timestamp");
    public static final SpSharedPreferences.b<Object, Boolean> e = SpSharedPreferences.b.e("user_has_saved_ad_in_background");
    private final SpSharedPreferences<Object> a;

    public us3(SpSharedPreferences<Object> spSharedPreferences) {
        this.a = spSharedPreferences;
    }

    public long a() {
        return this.a.j(b, -1);
    }

    public long b() {
        return this.a.j(d, -1);
    }

    public boolean c() {
        return this.a.d(e, false);
    }

    public boolean d() {
        return this.a.d(c, false);
    }

    public void e(long j) {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.e(b, j);
        b2.i();
    }

    public void f(boolean z) {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.a(c, z);
        b2.i();
    }

    public void g(boolean z) {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.a(e, z);
        b2.i();
    }

    public void h(long j) {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.e(d, j);
        b2.i();
    }
}

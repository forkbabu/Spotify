package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: uh7  reason: default package */
public class uh7 {
    private static final SpSharedPreferences.b<Object, Boolean> b = SpSharedPreferences.b.c("preload_notification_has_never_logged_in");
    private static final SpSharedPreferences.b<Object, Long> c = SpSharedPreferences.b.c("preload_notification_first_time_app_started_millis");
    private static final SpSharedPreferences.b<Object, Integer> d = SpSharedPreferences.b.c("preload_notification_times_been_shown");
    private final SpSharedPreferences<Object> a;

    public uh7(SpSharedPreferences<Object> spSharedPreferences) {
        this.a = spSharedPreferences;
    }

    public long a() {
        return this.a.j(c, -1);
    }

    public int b() {
        return this.a.f(d, 0);
    }

    public boolean c() {
        return this.a.j(c, -1) == -1;
    }

    public boolean d() {
        return this.a.d(b, true);
    }

    public void e() {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.b(d, b() + 1);
        b2.i();
    }

    public void f(long j) {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.e(c, j);
        b2.i();
    }

    public void g() {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.a(b, false);
        b2.i();
    }
}

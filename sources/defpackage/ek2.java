package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import java.util.concurrent.TimeUnit;

/* renamed from: ek2  reason: default package */
public class ek2 implements w70 {
    private static final SpSharedPreferences.b<Object, Long> c = SpSharedPreferences.b.e("background_restrictions_next_scheduled_time");
    private static final SpSharedPreferences.b<Object, Integer> d = SpSharedPreferences.b.e("background_restrictions_times_shown");
    private final cqe a;
    private final SpSharedPreferences<Object> b;

    public ek2(cqe cqe, SpSharedPreferences<Object> spSharedPreferences) {
        this.a = cqe;
        this.b = spSharedPreferences;
    }

    public void a() {
        SpSharedPreferences.a<Object> b2 = this.b.b();
        b2.e(c, 0);
        b2.b(d, 1);
        b2.i();
    }

    public void b() {
        long d2 = this.a.d();
        SpSharedPreferences<Object> spSharedPreferences = this.b;
        SpSharedPreferences.b<Object, Integer> bVar = d;
        int f = spSharedPreferences.f(bVar, 1);
        long millis = d2 + TimeUnit.DAYS.toMillis((long) (f > 2 ? 7 : 1));
        SpSharedPreferences.a<Object> b2 = this.b.b();
        b2.e(c, millis);
        b2.b(bVar, f + 1);
        b2.i();
    }

    public boolean c() {
        return this.a.d() >= this.b.j(c, 0);
    }
}

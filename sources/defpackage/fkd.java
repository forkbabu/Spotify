package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptySet;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: fkd  reason: default package */
public class fkd implements ekd {
    private static final long c = TimeUnit.DAYS.toMillis(30);
    private static final SpSharedPreferences.b<Object, Long> d;
    private static final SpSharedPreferences.b<Object, String> e;
    private static final SpSharedPreferences.b<Object, String> f;
    private static final SpSharedPreferences.b<Object, String> g;
    private static final SpSharedPreferences.b<Object, Set<String>> h;
    private final cqe a;
    private final SpSharedPreferences<Object> b;

    static {
        SpSharedPreferences.b<Object, Long> c2 = SpSharedPreferences.b.c("superbird_ota_last_time_connected");
        h.d(c2, "SpSharedPreferences.Pref…ota_last_time_connected\")");
        d = c2;
        SpSharedPreferences.b<Object, String> c3 = SpSharedPreferences.b.c("superbird_ota_last_serial_connected");
        h.d(c3, "SpSharedPreferences.Pref…a_last_serial_connected\")");
        e = c3;
        SpSharedPreferences.b<Object, String> c4 = SpSharedPreferences.b.c("superbird_device_address");
        h.d(c4, "SpSharedPreferences.Pref…uperbird_device_address\")");
        f = c4;
        SpSharedPreferences.b<Object, String> c5 = SpSharedPreferences.b.c("superbird_last_known_device_address");
        h.d(c5, "SpSharedPreferences.Pref…st_known_device_address\")");
        g = c5;
        SpSharedPreferences.b<Object, Set<String>> c6 = SpSharedPreferences.b.c("superbird_completed_setup");
        h.d(c6, "SpSharedPreferences.Pref…perbird_completed_setup\")");
        h = c6;
    }

    public fkd(cqe cqe, SpSharedPreferences<Object> spSharedPreferences) {
        h.e(cqe, "clock");
        h.e(spSharedPreferences, "preferences");
        this.a = cqe;
        this.b = spSharedPreferences;
    }

    @Override // defpackage.ekd
    public void a(String str) {
        SpSharedPreferences.a<Object> b2 = this.b.b();
        b2.f(f, str);
        b2.i();
        if (str != null) {
            SpSharedPreferences.a<Object> b3 = this.b.b();
            b3.f(g, str);
            b3.i();
        }
    }

    @Override // defpackage.ekd
    public boolean b(String str) {
        h.e(str, "serial");
        Set<String> o = this.b.o(h, EmptySet.a);
        return o != null && o.contains(str);
    }

    @Override // defpackage.ekd
    public void c(String str) {
        long d2 = this.a.d();
        SpSharedPreferences.a<Object> b2 = this.b.b();
        b2.e(d, d2);
        b2.i();
        SpSharedPreferences.a<Object> b3 = this.b.b();
        b3.f(e, str);
        b3.i();
    }

    @Override // defpackage.ekd
    public String d() {
        return this.b.m(f, null);
    }

    @Override // defpackage.ekd
    public String e() {
        return this.b.m(g, null);
    }

    @Override // defpackage.ekd
    public boolean f() {
        return this.b.o(h, EmptySet.a).size() > 0;
    }

    @Override // defpackage.ekd
    public boolean g() {
        return this.a.d() - this.b.j(d, 0) <= c;
    }

    @Override // defpackage.ekd
    public String h() {
        return this.b.m(e, null);
    }

    @Override // defpackage.ekd
    public void i(String str) {
        LinkedHashSet linkedHashSet;
        h.e(str, "serial");
        SpSharedPreferences<Object> spSharedPreferences = this.b;
        SpSharedPreferences.b<Object, Set<String>> bVar = h;
        Set<String> o = spSharedPreferences.o(bVar, EmptySet.a);
        if (o != null) {
            h.e(o, "$this$plus");
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(d.w(o.size() + 1));
            linkedHashSet2.addAll(o);
            linkedHashSet2.add(str);
            linkedHashSet = linkedHashSet2;
        } else {
            linkedHashSet = d.G(str);
        }
        SpSharedPreferences.a<Object> b2 = this.b.b();
        b2.g(bVar, linkedHashSet);
        b2.i();
    }
}

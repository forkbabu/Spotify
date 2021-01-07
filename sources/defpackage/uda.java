package defpackage;

import com.google.common.collect.ImmutableMap;
import com.jakewharton.rxrelay2.b;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.s;

/* renamed from: uda  reason: default package */
public class uda {
    private static final SpSharedPreferences.b<Object, Boolean> c = SpSharedPreferences.b.e("data_saver_mode_user_enabled");
    private static final SpSharedPreferences.b<Object, Integer> d;
    private static final ImmutableMap<String, SpSharedPreferences.b<Object, Integer>> e;
    private final SpSharedPreferences<Object> a;
    private final b<Boolean> b = b.g1();

    static {
        SpSharedPreferences.b<Object, Integer> e2 = SpSharedPreferences.b.e("data_saver_mode:streaming_quality_user_value");
        d = e2;
        e = ImmutableMap.of("stream_quality", e2);
    }

    uda(SpSharedPreferences<Object> spSharedPreferences) {
        spSharedPreferences.getClass();
        this.a = spSharedPreferences;
    }

    public int a(String str, int i) {
        SpSharedPreferences.b<Object, Integer> bVar = e.get(str);
        if (bVar != null) {
            return this.a.f(bVar, i);
        }
        Assertion.g(String.format("Key %s does not map to a PrefsKey", str));
        return i;
    }

    public boolean b(boolean z) {
        return this.a.d(c, z);
    }

    public boolean c() {
        return this.a.a(c);
    }

    public s<Boolean> d() {
        if (!this.b.i1()) {
            this.b.accept(Boolean.valueOf(b(false)));
        }
        return this.b;
    }

    public void e(boolean z) {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.a(c, z);
        b2.i();
        this.b.accept(Boolean.valueOf(z));
    }

    public void f(String str, int i) {
        if (e.get(str) != null) {
            SpSharedPreferences.a<Object> b2 = this.a.b();
            b2.b(d, i);
            b2.i();
            return;
        }
        Assertion.g(String.format("Key %s does not map to a PrefsKey", str));
    }
}

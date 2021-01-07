package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.l;
import io.reactivex.z;
import kotlin.jvm.internal.h;

/* renamed from: ri4 */
public final class ri4 {
    private final hi4 a;
    private final SpSharedPreferences<Object> b;
    private final String c;

    public ri4(hi4 hi4, SpSharedPreferences<Object> spSharedPreferences, String str) {
        h.e(hi4, "carePackageEndpoint");
        h.e(spSharedPreferences, "sharedPreferences");
        h.e(str, "campaignId");
        this.a = hi4;
        this.b = spSharedPreferences;
        this.c = str;
    }

    public static final z b(ri4 ri4) {
        z<R> m = ri4.a.b(ri4.c).A(ni4.a).m(oi4.a);
        h.d(m, "carePackageEndpoint\n    …ndpoint ${it.message}\") }");
        z<? extends R> w = l.j(new mi4(ri4)).w();
        h.d(w, "Maybe.fromCallable {\n   …ull)\n        }.toSingle()");
        z<R> C = m.C(w);
        h.d(C, "this.onErrorResumeNext(loadFromCache())");
        return C;
    }
}

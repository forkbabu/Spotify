package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.u;
import com.spotify.messages.OutOfSkips;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import java.util.Calendar;
import kotlin.jvm.internal.h;

/* renamed from: lp1  reason: default package */
public final class lp1 {
    private static final SpSharedPreferences.b<Object, Long> d;
    private final gl0<u> a;
    private final SpSharedPreferences<Object> b;
    private final cqe c;

    static {
        SpSharedPreferences.b<Object, Long> e = SpSharedPreferences.b.e("skip_limit_timestamp");
        h.d(e, "SpSharedPreferences.Pref…akeUserKey(SKIP_LIMIT_ID)");
        d = e;
    }

    public lp1(gl0<u> gl0, SpSharedPreferences<Object> spSharedPreferences, cqe cqe) {
        h.e(gl0, "eventPublisher");
        h.e(spSharedPreferences, "sharedPreferences");
        h.e(cqe, "clock");
        this.a = gl0;
        this.b = spSharedPreferences;
        this.c = cqe;
    }

    private final void b(String str) {
        OutOfSkips.b i = OutOfSkips.i();
        i.m(str);
        GeneratedMessageLite build = i.build();
        h.d(build, "OutOfSkips.newBuilder().…\n                .build()");
        this.a.c(build);
    }

    public final void a() {
        b("Free Tier Common Secondary");
        SpSharedPreferences<Object> spSharedPreferences = this.b;
        SpSharedPreferences.b<Object, Long> bVar = d;
        if (spSharedPreferences.a(bVar)) {
            try {
                long i = this.b.i(bVar);
                Calendar e = this.c.e();
                e.setTimeInMillis(i);
                e.add(10, 1);
                if (e.before(this.c.e())) {
                    b("Free Tier Common First");
                    SpSharedPreferences.a<Object> b2 = this.b.b();
                    b2.e(bVar, this.c.d());
                    b2.i();
                }
            } catch (Throwable th) {
                yif.m(th);
            }
        } else {
            b("Free Tier Common First");
            SpSharedPreferences.a<Object> b3 = this.b.b();
            b3.e(bVar, this.c.d());
            b3.i();
        }
    }
}

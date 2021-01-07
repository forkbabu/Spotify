package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.util.t;
import com.spotify.mobile.android.util.x;
import io.reactivex.s;

/* renamed from: ro5  reason: default package */
public class ro5 {
    private final cqe a;
    private final t b;
    private final String c;
    private final qo5 d;
    private final boolean e;

    public ro5(qo5 qo5, cqe cqe, t tVar, String str, Context context) {
        this.d = qo5;
        cqe.getClass();
        this.a = cqe;
        tVar.getClass();
        this.b = tVar;
        str.getClass();
        this.c = str;
        this.e = x.g(context);
    }

    public s<b91> a() {
        return this.d.a(ImmutableMap.of("client-platform", "android", "client-locale", this.c, "client-timezone", this.a.f().getID(), "client-version", this.b.c(), "tablet-layout", String.valueOf(this.e))).P().h(b91.class);
    }
}

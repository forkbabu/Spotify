package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.g;

/* renamed from: mr  reason: default package */
public final class mr extends b<a.d.c> implements t {
    private static final a.g<nr> k;
    private static final a.AbstractC0094a<nr, a.d.c> l;
    private static final a<a.d.c> m;

    static {
        a.g<nr> gVar = new a.g<>();
        k = gVar;
        or orVar = new or();
        l = orVar;
        m = new a<>("ClientTelemetry.API", orVar, gVar);
    }

    public mr(Context context) {
        super(context, m, a.d.e, b.a.c);
    }

    public final g<Void> u(r rVar) {
        s.a a = s.a();
        a.d(pt.a);
        a.c(false);
        a.b(new lr(rVar));
        return e(a.a());
    }
}

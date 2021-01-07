package defpackage;

import android.content.Context;
import defpackage.j1c;
import kotlin.jvm.internal.h;

/* renamed from: r1c  reason: default package */
public final class r1c implements q1c {
    private final Context a;
    private final u1c b;
    private t1c c;

    public r1c(Context context, u1c u1c, t1c t1c) {
        h.e(context, "context");
        h.e(u1c, "densityParams");
        h.e(t1c, "interpolator");
        this.a = context;
        this.b = u1c;
        this.c = t1c;
    }

    @Override // defpackage.q1c
    public m1c a(j1c.b bVar) {
        h.e(bVar, "duration");
        u1c u1c = this.b;
        double c2 = u1c.c();
        double a2 = u1c.a() - u1c.c();
        t1c t1c = this.c;
        double b2 = (double) bVar.b();
        double b3 = (double) u1c.b().b();
        Double.isNaN(b2);
        Double.isNaN(b3);
        Double.isNaN(b2);
        Double.isNaN(b3);
        Double.isNaN(b2);
        Double.isNaN(b3);
        double a3 = (t1c.a(b2 / b3) * a2) + c2;
        j1c.a.AbstractC0624a.b bVar2 = new j1c.a.AbstractC0624a.b(this.a, (float) bVar.b());
        Context context = this.a;
        double a4 = (double) bVar2.a();
        Double.isNaN(a4);
        Double.isNaN(a4);
        return new m1c(bVar2, new j1c.a.AbstractC0624a.C0625a(context, (float) (a4 / a3)), a3);
    }
}

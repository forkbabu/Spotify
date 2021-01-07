package defpackage;

import android.content.Context;
import android.content.res.Resources;
import defpackage.j1c;
import kotlin.jvm.internal.h;

/* renamed from: u1c  reason: default package */
public final class u1c {
    private final double a;
    private final double b;
    private final j1c.b.a c;

    public u1c(Context context, j1c.b.a aVar, j1c.a aVar2, j1c.a aVar3, int i) {
        j1c.a.b.c cVar = null;
        j1c.b.a aVar4 = (i & 2) != 0 ? new j1c.b.a(5400000) : null;
        j1c.a.AbstractC0624a.b bVar = (i & 4) != 0 ? new j1c.a.AbstractC0624a.b(context, 6.0f) : null;
        if ((i & 8) != 0) {
            h.e(context, "$this$getMaximumSegmentWidth");
            Resources resources = context.getResources();
            h.d(resources, "resources");
            cVar = new j1c.a.b.c(context, anf.b(((float) resources.getDisplayMetrics().widthPixels) * 0.75f));
        }
        h.e(context, "context");
        h.e(aVar4, "maximumDuration");
        h.e(bVar, "minimumWidth");
        h.e(cVar, "maximumWidth");
        this.c = aVar4;
        this.a = bVar.c();
        double b2 = (double) aVar4.b();
        double c2 = cVar.c();
        Double.isNaN(b2);
        Double.isNaN(b2);
        Double.isNaN(b2);
        this.b = c2 * b2;
    }

    public final double a() {
        return this.b;
    }

    public final j1c.b.a b() {
        return this.c;
    }

    public final double c() {
        return this.a;
    }
}

package defpackage;

import defpackage.a7a;
import defpackage.c7a;
import defpackage.y6a;

/* renamed from: t6a  reason: default package */
public final /* synthetic */ class t6a implements ti0 {
    public final /* synthetic */ c7a a;

    public /* synthetic */ t6a(c7a c7a) {
        this.a = c7a;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        c7a c7a = this.a;
        a7a.g gVar = (a7a.g) obj;
        if (c7a.j()) {
            return c7a;
        }
        c7a.a l = c7a.l();
        l.e(new y6a.b());
        l.f(true);
        return l.b();
    }
}

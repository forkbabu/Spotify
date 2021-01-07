package defpackage;

import com.spotify.mobius.e0;
import defpackage.o21;
import defpackage.p21;
import defpackage.r21;
import defpackage.s21;

/* renamed from: a21  reason: default package */
public final /* synthetic */ class a21 implements ti0 {
    public final /* synthetic */ t21 a;
    public final /* synthetic */ r21.e b;

    public /* synthetic */ a21(t21 t21, r21.e eVar) {
        this.a = t21;
        this.b = eVar;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        t21 t21 = this.a;
        r21.e eVar = this.b;
        s21.c cVar = (s21.c) obj;
        return e0.f(t21.g(new o21.a(eVar.j())).i(new p21.g(eVar.i())));
    }
}

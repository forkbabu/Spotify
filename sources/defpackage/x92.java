package defpackage;

import com.spotify.mobius.g;
import com.spotify.mobius.h;

/* renamed from: x92  reason: default package */
public class x92<A, B, C> implements h<B> {
    private final ea2<B, A> a;
    private final g<A, C> b;
    private final da2<C> c;
    private final h<A> d;

    private x92(ea2<B, A> ea2, g<A, C> gVar, da2<C> da2) {
        this.a = ea2;
        this.b = gVar;
        this.c = da2;
        this.d = gVar.t(da2);
    }

    public static <A, B, C> h<B> b(ea2<B, A> ea2, g<A, C> gVar, da2<C> da2) {
        ea2.getClass();
        gVar.getClass();
        da2.getClass();
        return new x92(ea2, gVar, da2);
    }

    @Override // com.spotify.mobius.h, defpackage.da2
    public void accept(B b2) {
        this.d.accept(this.a.apply(b2));
    }

    @Override // com.spotify.mobius.h, defpackage.w92
    public void dispose() {
        this.d.dispose();
    }
}

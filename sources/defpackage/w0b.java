package defpackage;

import defpackage.xya;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import java.util.Map;

/* renamed from: w0b  reason: default package */
public class w0b implements w<xya.g, tz0> {
    private final qz0 a;
    private final pz0 b;

    public w0b(qz0 qz0, pz0 pz0) {
        this.a = qz0;
        this.b = pz0;
    }

    public /* synthetic */ v a(xya.g gVar) {
        return this.a.c(gVar.b().a()).b(gVar.a()).build().v(new a0b(this, gVar));
    }

    @Override // io.reactivex.w
    public v<tz0> apply(s<xya.g> sVar) {
        return sVar.W(new zza(this), false, Integer.MAX_VALUE);
    }

    public /* synthetic */ v b(xya.g gVar, Map map) {
        return s.i0(new tz0(gVar.a(), this.b.a(map).isPresent() ? this.b.a(map).get() : "", map));
    }
}

package defpackage;

import com.spotify.libs.connect.p;
import defpackage.cs0;
import io.reactivex.BackpressureStrategy;
import io.reactivex.g;
import io.reactivex.h;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: ds0  reason: default package */
public class ds0 implements cs0 {
    private final Set<cs0.b> a = new CopyOnWriteArraySet();
    private h<Float> b;
    private cs0.a c;
    private p d;
    private float e;

    public static void k(ds0 ds0, h hVar) {
        ds0.b = hVar;
    }

    @Override // defpackage.cs0
    public p a() {
        return this.d;
    }

    @Override // defpackage.cs0
    public h<Float> b() {
        return this.b;
    }

    @Override // defpackage.cs0
    public void c(p pVar) {
        this.d = pVar;
    }

    @Override // defpackage.cs0
    public s<Float> d() {
        return new v(g.p(new vr0(this), BackpressureStrategy.LATEST));
    }

    @Override // defpackage.cs0
    public void e(cs0.a aVar) {
        this.c = null;
    }

    @Override // defpackage.cs0
    public Set<cs0.b> f() {
        return this.a;
    }

    @Override // defpackage.cs0
    public boolean g() {
        cs0.a aVar = this.c;
        return aVar == null || !((p) aVar).d();
    }

    @Override // defpackage.cs0
    public float h() {
        return this.e;
    }

    @Override // defpackage.cs0
    public boolean i() {
        p pVar;
        cs0.a aVar = this.c;
        return (aVar != null && ((p) aVar).d()) || ((pVar = this.d) != null && pVar.d());
    }

    @Override // defpackage.cs0
    public void j(float f) {
        this.e = f;
    }
}

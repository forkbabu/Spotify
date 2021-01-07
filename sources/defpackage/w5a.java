package defpackage;

import android.view.ViewGroup;
import com.google.common.base.Optional;
import com.spotify.rxjava2.p;
import defpackage.d7a;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: w5a  reason: default package */
public class w5a implements ahb, xgb {
    private final y a;
    private final s<d7a> b;
    private final p c = new p();
    private final com.spotify.music.libs.carmodeengine.util.y f;
    private final bhb n;
    private d7a o;
    private boolean p;

    public w5a(y yVar, s<d7a> sVar, com.spotify.music.libs.carmodeengine.util.y yVar2, bhb bhb) {
        this.a = yVar;
        this.b = sVar;
        this.f = yVar2;
        this.n = bhb;
    }

    @Override // defpackage.ahb
    public void a() {
        this.c.b(s.n(this.b, this.f.d(), j5a.a).o0(this.a).subscribe(new h5a(this)));
    }

    @Override // defpackage.xgb
    public Optional<Integer> b() {
        d7a d7a = this.o;
        if (d7a != null) {
            d7a.getClass();
            if ((d7a instanceof d7a.a) && this.p) {
                return Optional.of(1);
            }
        }
        return Optional.absent();
    }

    @Override // defpackage.ahb
    public void c() {
    }

    public /* synthetic */ void d(u3 u3Var) {
        this.o = u3Var.a;
        this.p = u3Var.b.booleanValue() || this.f.h();
        this.n.J();
    }

    @Override // defpackage.ahb
    public void e() {
        this.c.a();
    }

    @Override // defpackage.ahb
    public void f(ViewGroup viewGroup) {
    }
}

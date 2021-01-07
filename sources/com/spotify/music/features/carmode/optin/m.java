package com.spotify.music.features.carmode.optin;

import com.spotify.music.features.carmode.optin.j;
import com.spotify.music.libs.carmodeengine.util.t;
import com.spotify.rxjava2.q;
import defpackage.d7a;
import io.reactivex.s;
import io.reactivex.y;

public class m implements j.a {
    private final y a;
    private final k5a b;
    private final s<d7a> c;
    private final s<Boolean> d;
    private final t e;
    private final wlf<Boolean> f;
    private final q g = new q();
    private d7a h = d7a.b();
    private j i;
    private o j;
    private boolean k;

    public m(y yVar, k5a k5a, s<d7a> sVar, com.spotify.music.libs.carmodeengine.util.y yVar2, t tVar, wlf<Boolean> wlf) {
        this.a = yVar;
        this.b = k5a;
        this.c = sVar;
        this.d = yVar2.c();
        this.e = tVar;
        this.f = wlf;
    }

    @Override // com.spotify.music.features.carmode.optin.j.a
    public void a() {
        d7a d7a = this.h;
        d7a.getClass();
        if (d7a instanceof d7a.b) {
            this.k = true;
            this.b.a();
            this.e.a();
            o oVar = this.j;
            oVar.getClass();
            oVar.b();
            return;
        }
        d7a d7a2 = this.h;
        d7a2.getClass();
        if (d7a2 instanceof d7a.a) {
            this.k = true;
            this.b.d();
            this.e.b();
            o oVar2 = this.j;
            oVar2.getClass();
            oVar2.a();
        }
    }

    public void b(u3 u3Var) {
        F f2 = u3Var.a;
        boolean booleanValue = u3Var.b.booleanValue();
        j jVar = this.i;
        if (jVar != null) {
            this.h = f2;
            if (booleanValue) {
                f2.getClass();
                if (!(f2 instanceof d7a.c) && !this.f.get().booleanValue()) {
                    d7a d7a = this.h;
                    d7a.getClass();
                    if (d7a instanceof d7a.b) {
                        jVar.c(this.k);
                    } else {
                        jVar.a(this.k);
                    }
                    this.k = false;
                }
            }
            jVar.b();
            this.k = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.g.a(s.n(this.c, this.d, i.a).o0(this.a).subscribe(new a(this)));
    }

    /* access modifiers changed from: package-private */
    public void d() {
        this.g.c();
    }

    public void e(j jVar, o oVar) {
        this.i = jVar;
        ((p) jVar).setListener(this);
        this.j = oVar;
    }
}

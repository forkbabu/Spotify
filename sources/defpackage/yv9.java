package defpackage;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.navigation.logger.d;
import com.spotify.instrumentation.navigation.logger.m;
import defpackage.ej9;
import io.reactivex.disposables.b;
import io.reactivex.s;

/* renamed from: yv9  reason: default package */
public class yv9 {
    private final aw9 a;
    private final cqe b;
    private final m c;
    private final xv9 d;
    private fj9 e;
    private ej9.a f;
    private b g;
    private long h;
    private boolean i;

    yv9(aw9 aw9, cqe cqe, m mVar, xv9 xv9) {
        this.a = aw9;
        this.b = cqe;
        this.c = mVar;
        this.d = xv9;
    }

    private void a(fj9 fj9, long j) {
        fj9.getClass();
        d("exit", j, fj9.d(), fj9.e(), fj9.c());
    }

    private void c(ej9.a aVar, long j) {
        aVar.getClass();
        long j2 = this.h;
        PageIdentifiers pageIdentifiers = PageIdentifiers.UNKNOWN_NOTLOADED;
        d("enter", j2, pageIdentifiers.path(), aVar.b(), null);
        d("exit", j, pageIdentifiers.path(), aVar.b(), null);
    }

    private void d(String str, long j, String str2, String str3, String str4) {
        this.a.a(str, j, str2, str3, str4);
    }

    public void b(ej9 ej9) {
        long d2 = this.b.d();
        fj9 fj9 = this.e;
        if (fj9 != null) {
            a(fj9, d2);
        }
        if (ej9 instanceof fj9) {
            fj9 fj92 = (fj9) ej9;
            ej9.a aVar = this.f;
            if (aVar != null && aVar.b().equals(fj92.e())) {
                d2 = this.h;
            }
            this.d.b();
            this.c.d(new d(this.d.a(), fj92.d(), fj92.e(), fj92.c()));
            this.e = fj92;
            this.f = null;
            d("enter", d2, fj92.d(), fj92.e(), fj92.c());
        } else if (ej9 instanceof ej9.a) {
            ej9.a aVar2 = this.f;
            if (aVar2 != null) {
                c(aVar2, d2);
            }
            this.e = null;
            this.f = (ej9.a) ej9;
            this.h = d2;
        }
    }

    public void e(boolean z) {
        this.i = z;
        if (!z) {
            long d2 = this.b.d();
            fj9 fj9 = this.e;
            if (fj9 != null) {
                a(fj9, d2);
                this.e = null;
            } else {
                ej9.a aVar = this.f;
                if (aVar != null) {
                    c(aVar, d2);
                    this.f = null;
                }
            }
        }
        b bVar = this.g;
        if (bVar != null) {
            bVar.dispose();
            this.g = null;
        }
    }

    public void f(s<ej9> sVar) {
        sVar.getClass();
        this.g = sVar.C0(this.i ? 1 : 0).subscribe(new tv9(this));
        this.i = false;
    }
}

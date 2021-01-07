package defpackage;

import defpackage.re7;
import io.reactivex.s;

/* renamed from: le7  reason: default package */
public class le7 implements ke7 {
    public static final /* synthetic */ int f = 0;
    private final oe7 b;
    private final lf7 c;
    private final ff7 d;
    private final bf7 e;

    /* access modifiers changed from: private */
    /* renamed from: le7$a */
    public interface a {
        re7 a(re7.b bVar);
    }

    public le7(oe7 oe7, lf7 lf7, ff7 ff7, bf7 bf7) {
        this.b = oe7;
        this.c = lf7;
        this.d = ff7;
        this.e = bf7;
    }

    @Override // defpackage.ke7
    public s<qe7> a(String str) {
        return s.n(this.b.a(str).A(new de7(this)).P(), this.c.a(), new he7(this)).j0(ee7.a).E();
    }

    public re7 b(re7.b bVar) {
        return new re7.b(this.e.b(bVar.b()));
    }

    public re7 c(kf7 kf7, re7.b bVar) {
        ff7 ff7 = this.d;
        b91 b2 = bVar.b();
        ff7.getClass();
        return new re7.b(new k91(new ye7(kf7)).b(b2));
    }
}

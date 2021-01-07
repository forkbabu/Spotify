package defpackage;

import com.spotify.voice.api.model.m;
import defpackage.vte;
import io.reactivex.functions.g;

/* renamed from: kte  reason: default package */
public class kte implements g<m> {
    private final mte a;
    private final cqe b;
    private final sse c;
    private long f;

    public kte(mte mte, cqe cqe, sse sse) {
        this.a = mte;
        this.b = cqe;
        this.c = sse;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(m mVar) {
        m mVar2 = mVar;
        mVar2.getClass();
        if (mVar2 instanceof m.a) {
            this.f = this.b.d();
        } else if ((mVar2 instanceof m.e) && this.f > 0) {
            mte mte = this.a;
            vte.a a2 = vte.a();
            a2.b(this.c.c());
            a2.a((int) (this.b.d() - this.f));
            mte.c(a2.build());
            this.f = 0;
        }
    }
}

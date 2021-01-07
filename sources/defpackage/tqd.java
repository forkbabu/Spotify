package defpackage;

import defpackage.uqd;
import io.reactivex.g;
import io.reactivex.k;

/* renamed from: tqd  reason: default package */
public final class tqd implements k<uqd, Integer> {
    private final g<Integer> a;

    public tqd(g<Integer> gVar) {
        this.a = gVar;
    }

    @Override // io.reactivex.k
    public tpf<Integer> a(g<uqd> gVar) {
        return gVar.b0(new uqd.a()).f0(new sqd(this)).s();
    }

    public /* synthetic */ g b(uqd.a aVar) {
        return this.a;
    }
}

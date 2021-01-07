package defpackage;

import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: hd2  reason: default package */
public final /* synthetic */ class hd2 implements w {
    public final /* synthetic */ g a;
    public final /* synthetic */ cqe b;
    public final /* synthetic */ kv3 c;
    public final /* synthetic */ gl0 d;

    public /* synthetic */ hd2(g gVar, cqe cqe, kv3 kv3, gl0 gl0) {
        this.a = gVar;
        this.b = cqe;
        this.c = kv3;
        this.d = gl0;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.J0(new dd2(this.a, this.b, this.c, this.d));
    }
}

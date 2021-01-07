package defpackage;

import com.spotify.voice.api.model.m;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;

/* renamed from: zc2  reason: default package */
public final /* synthetic */ class zc2 implements l {
    public final /* synthetic */ g a;
    public final /* synthetic */ cqe b;

    public /* synthetic */ zc2(g gVar, cqe cqe) {
        this.a = gVar;
        this.b = cqe;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        g gVar = this.a;
        cqe cqe = this.b;
        gVar.getClass();
        return new v(gVar).N0(1).j0(new dc2((m) obj, cqe));
    }
}

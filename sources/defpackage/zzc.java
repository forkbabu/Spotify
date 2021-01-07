package defpackage;

import com.spotify.share.sharedata.r;
import com.spotify.share.sharedata.t;
import com.spotify.share.util.m;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.maybe.b;
import io.reactivex.p;
import kotlin.jvm.internal.h;

/* renamed from: zzc  reason: default package */
final class zzc<T, R> implements l<t, p<? extends t>> {
    final /* synthetic */ yzc a;
    final /* synthetic */ o8e b;
    final /* synthetic */ pzc c;

    zzc(yzc yzc, o8e o8e, pzc pzc) {
        this.a = yzc;
        this.b = o8e;
        this.c = pzc;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public p<? extends t> apply(t tVar) {
        t tVar2 = tVar;
        h.e(tVar2, "it");
        if (this.b.b().contains(m.a(tVar2))) {
            return io.reactivex.l.k(tVar2);
        }
        if (!(tVar2 instanceof r)) {
            return b.a;
        }
        return this.a.e(this.b, this.a.d(this.c, (r) tVar2)).O();
    }
}

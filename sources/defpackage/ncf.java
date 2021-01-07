package defpackage;

import com.spotify.music.follow.m;
import com.spotify.music.follow.resolver.f;
import defpackage.kef;
import io.reactivex.a;
import io.reactivex.functions.l;

/* renamed from: ncf  reason: default package */
public final /* synthetic */ class ncf implements l {
    public final /* synthetic */ m a;
    public final /* synthetic */ f b;

    public /* synthetic */ ncf(m mVar, f fVar) {
        this.a = mVar;
        this.b = fVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        m mVar = this.a;
        f fVar = this.b;
        kef.c cVar = (kef.c) obj;
        if (mVar.c(cVar.t()) != null) {
            return a.u(new rbf(mVar, cVar)).N();
        }
        return fVar.a(cVar.t()).Y(new waf(mVar, cVar)).N().r0(tdf.a);
    }
}

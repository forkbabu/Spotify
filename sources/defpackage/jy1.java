package defpackage;

import com.spotify.mobile.android.storytelling.common.PauseState;
import com.spotify.mobile.android.storytelling.common.d;
import defpackage.gx1;
import defpackage.qx1;
import io.reactivex.functions.g;

/* access modifiers changed from: package-private */
/* renamed from: jy1  reason: default package */
public final class jy1<T> implements g<qx1.m> {
    final /* synthetic */ nmf a;
    final /* synthetic */ nmf b;
    final /* synthetic */ d c;
    final /* synthetic */ cmf f;

    jy1(nmf nmf, nmf nmf2, d dVar, cmf cmf) {
        this.a = nmf;
        this.b = nmf2;
        this.c = dVar;
        this.f = cmf;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(qx1.m mVar) {
        this.a.invoke(gx1.d.a);
        this.b.invoke(PauseState.PAUSED);
        this.c.a(mVar.a());
        this.f.invoke();
    }
}

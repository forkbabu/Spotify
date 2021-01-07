package defpackage;

import com.spotify.music.follow.j;
import com.spotify.music.follow.m;
import defpackage.kef;
import io.reactivex.functions.a;

/* renamed from: ybf  reason: default package */
public final /* synthetic */ class ybf implements a {
    public final /* synthetic */ m a;
    public final /* synthetic */ j b;
    public final /* synthetic */ kef.c c;

    public /* synthetic */ ybf(m mVar, j jVar, kef.c cVar) {
        this.a = mVar;
        this.b = jVar;
        this.c = cVar;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        m mVar = this.a;
        j jVar = this.b;
        kef.c cVar = this.c;
        mVar.g(jVar);
        mVar.e(cVar.t(), true);
    }
}

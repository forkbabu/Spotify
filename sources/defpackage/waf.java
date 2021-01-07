package defpackage;

import com.spotify.music.follow.j;
import com.spotify.music.follow.m;
import defpackage.kef;
import io.reactivex.a;
import io.reactivex.functions.l;

/* renamed from: waf  reason: default package */
public final /* synthetic */ class waf implements l {
    public final /* synthetic */ m a;
    public final /* synthetic */ kef.c b;

    public /* synthetic */ waf(m mVar, kef.c cVar) {
        this.a = mVar;
        this.b = cVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return a.u(new ybf(this.a, (j) obj, this.b));
    }
}

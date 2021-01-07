package defpackage;

import com.spotify.player.model.ContextTrack;
import com.spotify.share.sharedata.r;
import io.reactivex.functions.l;

/* renamed from: xmd  reason: default package */
public final /* synthetic */ class xmd implements l {
    public final /* synthetic */ hnd a;
    public final /* synthetic */ r b;

    public /* synthetic */ xmd(hnd hnd, r rVar) {
        this.a = hnd;
        this.b = rVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        hnd hnd = this.a;
        r rVar = this.b;
        hnd.getClass();
        return io.reactivex.l.k((ContextTrack) obj).g(new cnd(hnd, rVar));
    }
}

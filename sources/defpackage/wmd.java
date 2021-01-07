package defpackage;

import com.spotify.player.model.ContextTrack;
import com.spotify.share.sharedata.r;
import io.reactivex.functions.l;

/* renamed from: wmd  reason: default package */
public final /* synthetic */ class wmd implements l {
    public final /* synthetic */ hnd a;
    public final /* synthetic */ r b;

    public /* synthetic */ wmd(hnd hnd, r rVar) {
        this.a = hnd;
        this.b = rVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.f(this.b, (ContextTrack) obj);
    }
}

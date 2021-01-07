package defpackage;

import com.spotify.player.model.ContextTrack;
import com.spotify.share.sharedata.r;
import io.reactivex.functions.l;

/* renamed from: cnd  reason: default package */
public final /* synthetic */ class cnd implements l {
    public final /* synthetic */ hnd a;
    public final /* synthetic */ r b;

    public /* synthetic */ cnd(hnd hnd, r rVar) {
        this.a = hnd;
        this.b = rVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.e(this.b, (ContextTrack) obj);
    }
}

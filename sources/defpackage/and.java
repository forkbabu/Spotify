package defpackage;

import com.spotify.player.model.PlayerState;
import com.spotify.share.sharedata.r;
import io.reactivex.functions.l;

/* renamed from: and  reason: default package */
public final /* synthetic */ class and implements l {
    public final /* synthetic */ hnd a;
    public final /* synthetic */ r b;

    public /* synthetic */ and(hnd hnd, r rVar) {
        this.a = hnd;
        this.b = rVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        hnd hnd = this.a;
        r rVar = this.b;
        hnd.getClass();
        return io.reactivex.l.j(new umd(hnd, (PlayerState) obj, rVar));
    }
}

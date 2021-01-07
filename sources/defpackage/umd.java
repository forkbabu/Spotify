package defpackage;

import com.spotify.player.model.PlayerState;
import com.spotify.share.sharedata.r;
import java.util.concurrent.Callable;

/* renamed from: umd  reason: default package */
public final /* synthetic */ class umd implements Callable {
    public final /* synthetic */ hnd a;
    public final /* synthetic */ PlayerState b;
    public final /* synthetic */ r c;

    public /* synthetic */ umd(hnd hnd, PlayerState playerState, r rVar) {
        this.a = hnd;
        this.b = playerState;
        this.c = rVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.h(this.b, this.c);
    }
}

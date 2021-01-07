package com.spotify.music.genie;

import com.spotify.music.genie.Wish;
import com.spotify.music.genie.q;
import io.reactivex.functions.l;
import io.reactivex.z;

public final /* synthetic */ class g implements l {
    public final /* synthetic */ q a;

    public /* synthetic */ g(q qVar) {
        this.a = qVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        q qVar = this.a;
        q.a aVar = (q.a) obj;
        qVar.getClass();
        boolean z = aVar.a;
        boolean isPlaying = aVar.b.isPlaying();
        boolean isPaused = aVar.b.isPaused();
        if (isPlaying && isPaused) {
            return z.z(new n(null, aVar.b.contextMetadata().get("context_description"), Wish.Action.PLAY_CURRENT_SESSION));
        }
        if (!z || !isPlaying) {
            return qVar.g();
        }
        return z.z(new n(null, null, Wish.Action.DO_NOTHING));
    }
}

package defpackage;

import com.google.common.base.Optional;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

/* renamed from: bm2  reason: default package */
public final /* synthetic */ class bm2 implements l {
    public static final /* synthetic */ bm2 a = new bm2();

    private /* synthetic */ bm2() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        PlayerState playerState;
        return mm2.a(playerState, mm2.e.contains(((PlayerState) obj).track().transform(zl2.a).or((Optional<V>) "")));
    }
}

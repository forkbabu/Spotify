package defpackage;

import com.google.common.base.Optional;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.c;

/* renamed from: dm2  reason: default package */
public final /* synthetic */ class dm2 implements c {
    public static final /* synthetic */ dm2 a = new dm2();

    private /* synthetic */ dm2() {
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        PlayerState playerState = (PlayerState) obj;
        PlayerState playerState2 = (PlayerState) obj2;
        int i = mm2.f;
        Optional<ContextTrack> track = playerState.track();
        zl2 zl2 = zl2.a;
        return (track.transform(zl2).or("").equals(playerState2.track().transform(zl2).or("")) && playerState.isPaused() == playerState2.isPaused()) ? playerState : playerState2;
    }
}

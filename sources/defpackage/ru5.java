package defpackage;

import com.google.common.base.Optional;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

/* renamed from: ru5  reason: default package */
public final /* synthetic */ class ru5 implements l {
    public static final /* synthetic */ ru5 a = new ru5();

    private /* synthetic */ ru5() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        return playerState.track().isPresent() ? Optional.of(playerState) : Optional.absent();
    }
}

package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.n;

/* renamed from: opb  reason: default package */
public final /* synthetic */ class opb implements n {
    public static final /* synthetic */ opb a = new opb();

    private /* synthetic */ opb() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        return playerState.isPlaying() && playerState.track().isPresent();
    }
}

package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

/* renamed from: w3d  reason: default package */
public final /* synthetic */ class w3d implements l {
    public static final /* synthetic */ w3d a = new w3d();

    private /* synthetic */ w3d() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        return new u3(playerState.playbackId().get(), playerState.track().get());
    }
}

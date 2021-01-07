package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.yourlibrary.musicpages.domain.u0;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

/* renamed from: ma9  reason: default package */
public final /* synthetic */ class ma9 implements l {
    public static final /* synthetic */ ma9 a = new ma9();

    private /* synthetic */ ma9() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        Optional<ContextTrack> track = playerState.track();
        if (!track.isPresent()) {
            return u0.b();
        }
        String uri = track.get().uri();
        String uid = track.get().uid();
        String contextUri = playerState.contextUri();
        if (playerState.isPaused()) {
            return u0.c(uri, uid, contextUri);
        }
        return u0.d(uri, uid, contextUri);
    }
}

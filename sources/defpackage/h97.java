package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.podcast.episode.t0;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.c;

/* renamed from: h97  reason: default package */
public final /* synthetic */ class h97 implements c {
    public static final /* synthetic */ h97 a = new h97();

    private /* synthetic */ h97() {
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        PlayerState playerState = (PlayerState) obj;
        String contextUri = playerState.contextUri();
        long longValue = ((Long) obj2).longValue();
        Optional<ContextTrack> track = playerState.track();
        int i = -1;
        if (track.isPresent()) {
            String str = track.get().metadata().get(ContextTrack.Metadata.KEY_SEGMENT_INDEX);
            if (str == null) {
                Logger.n(" [%s] missing for track [%s]", ContextTrack.Metadata.KEY_SEGMENT_INDEX, track.get().uri());
            } else {
                try {
                    i = Integer.parseInt(str);
                } catch (NumberFormatException e) {
                    Logger.e(e, "The cannot be [%s]", str);
                }
            }
        }
        return new i97(contextUri, longValue, i, t0.a(playerState));
    }
}

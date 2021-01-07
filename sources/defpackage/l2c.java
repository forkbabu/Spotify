package defpackage;

import com.spotify.music.nowplaying.core.modes.a;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;

/* renamed from: l2c  reason: default package */
public class l2c implements a {
    @Override // com.spotify.music.nowplaying.core.modes.a
    public boolean a(PlayerState playerState) {
        ContextTrack contextTrack = playerState.track().get();
        if (!kxd.f(contextTrack) || !kxd.j(contextTrack) || !contextTrack.metadata().containsKey("click_url")) {
            return false;
        }
        String str = (String) je.e0(contextTrack, "$this$isPodcastAdInVideo", ContextTrack.Metadata.KEY_IS_PODCAST_ADVERTISEMENT_IN_VIDEO);
        if (str != null ? Boolean.parseBoolean(str) : false) {
            return true;
        }
        return false;
    }
}

package defpackage;

import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.nowplaying.core.modes.a;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.playlist.formatlisttype.FormatListType;

/* renamed from: j4c  reason: default package */
public class j4c implements a {
    private final com.spotify.playlist.formatlisttype.a a;

    public j4c(com.spotify.playlist.formatlisttype.a aVar) {
        this.a = aVar;
    }

    @Override // com.spotify.music.nowplaying.core.modes.a
    public boolean a(PlayerState playerState) {
        ContextTrack contextTrack = playerState.track().get();
        if (l0.z(contextTrack.uri()).q() == LinkType.SHOW_EPISODE && kxd.m(contextTrack)) {
            if (!(this.a.a(playerState.contextMetadata().get("format_list_type")) == FormatListType.s)) {
                return true;
            }
        }
        if (l0.z(contextTrack.uri()).q() == LinkType.LIVE_EVENT && kxd.m(contextTrack)) {
            return true;
        }
        return false;
    }
}

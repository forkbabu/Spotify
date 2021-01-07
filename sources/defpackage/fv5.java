package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import com.spotify.music.nowplaying.core.modes.NowPlayingMode;
import com.spotify.music.nowplaying.core.modes.a;
import com.spotify.player.model.PlayerState;
import java.util.Map;

/* renamed from: fv5  reason: default package */
public class fv5 {
    private static final ImmutableList<NowPlayingMode> b = ImmutableList.of(NowPlayingMode.PODCAST);
    private final Map<NowPlayingMode, a> a;

    public fv5(Map<NowPlayingMode, a> map) {
        this.a = map;
    }

    public NowPlayingMode a(PlayerState playerState) {
        playerState.getClass();
        playerState.track().get().getClass();
        UnmodifiableListIterator<NowPlayingMode> listIterator = b.listIterator();
        while (listIterator.hasNext()) {
            NowPlayingMode next = listIterator.next();
            a aVar = this.a.get(next);
            if (aVar != null && aVar.a(playerState)) {
                return next;
            }
        }
        return NowPlayingMode.DEFAULT;
    }
}

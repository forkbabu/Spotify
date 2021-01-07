package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;

/* renamed from: ar9  reason: default package */
public final class ar9 {
    private static boolean a(PlayerState playerState, String str) {
        Optional<ContextTrack> track = playerState.track();
        if (track.isPresent() && kxd.k(track.get()) && !track.get().metadata().getOrDefault("album_uri", "").equals(str)) {
            return false;
        }
        String contextUri = playerState.contextUri();
        l0 z = l0.z(str);
        l0 z2 = l0.z(contextUri);
        LinkType q = z.q();
        LinkType linkType = LinkType.COLLECTION_TRACKS;
        if (q == linkType && z2.q() == linkType) {
            return true;
        }
        LinkType q2 = z2.q();
        LinkType linkType2 = LinkType.PROFILE_PLAYLIST;
        if (q2 == linkType2 && z.q() == LinkType.PLAYLIST_V2 && z2.i().equals(z.i())) {
            return true;
        }
        if ((z2.q() == LinkType.COLLECTION_ALBUM || z2.q() == LinkType.COLLECTION_ARTIST) && str.equals(z2.G())) {
            return true;
        }
        if (z.q() == z2.q() && contextUri.equals(str)) {
            return true;
        }
        if (track.isPresent() && track.get().uri().equals(str)) {
            return true;
        }
        if (!track.isPresent() || !track.get().metadata().getOrDefault("album_uri", "").equals(str)) {
            return false;
        }
        if (z2.equals(z) || (z2.q() != linkType2 && z2.q() != LinkType.PLAYLIST_V2 && z2.q() != linkType)) {
            return true;
        }
        return false;
    }

    public static boolean b(PlayerState playerState, String str) {
        if (!playerState.isPlaying() || playerState.isPaused()) {
            return false;
        }
        return a(playerState, str);
    }

    public static boolean c(PlayerState playerState, String str) {
        return playerState.isPlaying() && a(playerState, str);
    }
}

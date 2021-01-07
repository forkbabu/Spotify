package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: isb  reason: default package */
public final class isb {
    public static String a(LegacyPlayerState legacyPlayerState) {
        PlayerTrack track;
        if (legacyPlayerState == null || (track = legacyPlayerState.track()) == null) {
            return null;
        }
        return track.uri();
    }
}

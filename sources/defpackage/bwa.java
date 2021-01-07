package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.searchview.proto.Entity;

/* renamed from: bwa  reason: default package */
public class bwa implements awa {
    @Override // defpackage.awa
    public SpotifyIconV2 a(Entity entity) {
        switch (entity.m().ordinal()) {
            case 0:
                return SpotifyIconV2.ARTIST;
            case 1:
                return SpotifyIconV2.TRACK;
            case 2:
                return SpotifyIconV2.ALBUM;
            case 3:
                return SpotifyIconV2.PLAYLIST;
            case 4:
                return SpotifyIconV2.BROWSE;
            case 5:
            case 6:
                return SpotifyIconV2.PODCASTS;
            case 7:
                return SpotifyIconV2.USER;
            case 8:
                return SpotifyIconV2.HASH;
            case 9:
                return SpotifyIconV2.SEARCH;
            default:
                Assertion.g("Could not resolve image placeholder for unknown entity: " + entity);
                return SpotifyIconV2.TRACK;
        }
    }
}

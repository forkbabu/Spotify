package defpackage;

import com.spotify.mobile.android.util.LinkType;
import com.spotify.remoteconfig.sa;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: gzc  reason: default package */
public final class gzc implements fjf<List<LinkType>> {
    private final wlf<sa> a;

    public gzc(wlf<sa> wlf) {
        this.a = wlf;
    }

    public static List<LinkType> a(sa saVar) {
        List<LinkType> list;
        if (saVar.g()) {
            list = Collections.unmodifiableList(Arrays.asList(LinkType.TRACK, LinkType.ARTIST, LinkType.ALBUM, LinkType.ALBUM_AUTOPLAY, LinkType.ARTIST_ALBUMS, LinkType.ARTIST_APPEARS_ON, LinkType.ARTIST_PLAYLISTS, LinkType.ARTIST_RELATED, LinkType.ARTIST_RELEASES, LinkType.ARTIST_SINGLES, LinkType.COLLECTION_TRACKS, LinkType.COLLECTION_ALBUM, LinkType.COLLECTION_ARTIST, LinkType.PLAYLIST_AUTOPLAY, LinkType.PLAYLIST_V2_AUTOPLAY, LinkType.PLAYLIST_V2, LinkType.PROFILE_PLAYLIST, LinkType.COLLECTION_ROOTLIST, LinkType.COLLECTION_PODCASTS, LinkType.COLLECTION_PODCASTS_DOWNLOADS, LinkType.COLLECTION_PODCASTS_FOLLOWING, LinkType.COLLECTION_PODCASTS_EPISODES, LinkType.CONCERT_ENTITY, LinkType.SHOW_ROOT, LinkType.SHOW_SHOW, LinkType.SHOW_EPISODE, LinkType.SHOW_EPISODE_TIMESTAMP, LinkType.EPISODE_AUTOPLAY));
        } else {
            list = Collections.unmodifiableList(Arrays.asList(LinkType.TRACK, LinkType.ARTIST, LinkType.ALBUM, LinkType.ALBUM_AUTOPLAY, LinkType.ARTIST_ALBUMS, LinkType.ARTIST_APPEARS_ON, LinkType.ARTIST_PLAYLISTS, LinkType.ARTIST_RELATED, LinkType.ARTIST_RELEASES, LinkType.ARTIST_SINGLES, LinkType.COLLECTION_TRACKS, LinkType.COLLECTION_ALBUM, LinkType.COLLECTION_ARTIST, LinkType.PLAYLIST_AUTOPLAY, LinkType.PLAYLIST_V2_AUTOPLAY, LinkType.PLAYLIST_V2, LinkType.PROFILE_PLAYLIST, LinkType.COLLECTION_ROOTLIST, LinkType.COLLECTION_PODCASTS, LinkType.COLLECTION_PODCASTS_DOWNLOADS, LinkType.COLLECTION_PODCASTS_FOLLOWING, LinkType.COLLECTION_PODCASTS_EPISODES, LinkType.SHOW_ROOT, LinkType.SHOW_SHOW, LinkType.SHOW_EPISODE, LinkType.SHOW_EPISODE_TIMESTAMP, LinkType.EPISODE_AUTOPLAY));
        }
        yif.g(list, "Cannot return null from a non-@Nullable @Provides method");
        return list;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}

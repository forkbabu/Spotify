package defpackage;

import com.spotify.mobile.android.spotlets.bixbyhomecards.models.RecommendedPlaylistsResponse;
import io.reactivex.z;

/* renamed from: at1  reason: default package */
public interface at1 {
    @zqf("webapi-browse/v1/browse/featured-playlists")
    z<RecommendedPlaylistsResponse> a(@nrf("timestamp") String str);
}

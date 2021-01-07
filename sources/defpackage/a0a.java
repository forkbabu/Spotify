package defpackage;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.Query;
import com.spotify.music.libs.assistedcuration.model.RecentlyPlayedTracksResponse;
import io.reactivex.z;

@CosmosService
/* renamed from: a0a  reason: default package */
public interface a0a {
    @GET("sp://core-recently-played/unstable/tracks?include_hidden=false&include_local_tracks=false&include_episodes=false")
    z<RecentlyPlayedTracksResponse> a(@Query("limit") int i);
}

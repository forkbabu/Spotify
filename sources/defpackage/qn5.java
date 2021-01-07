package defpackage;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.PUT;
import com.spotify.cosmos.android.cosmonaut.annotations.QueryMap;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.music.features.localfilesimport.model.LocalAlbums;
import com.spotify.music.features.localfilesimport.model.LocalArtists;
import com.spotify.music.features.localfilesimport.model.LocalSources;
import com.spotify.music.features.localfilesimport.model.LocalSourcesResponse;
import com.spotify.music.features.localfilesimport.model.LocalTracks;
import com.spotify.music.features.localfilesimport.model.e;
import io.reactivex.s;
import io.reactivex.z;
import java.util.Map;

@CosmosService
/* renamed from: qn5  reason: default package */
public interface qn5 {
    @PUT("sp://local-files/v2/sources")
    z<LocalSourcesResponse> a(@Body e eVar);

    @SUB("sp://local-files/v1/folders")
    s<LocalSources> b(@QueryMap Map<String, String> map);

    @SUB("sp://local-files/v1/albums")
    s<LocalAlbums> c(@QueryMap Map<String, String> map);

    @SUB("sp://local-files/v2/tracks")
    s<LocalTracks> d(@QueryMap Map<String, String> map);

    @SUB("sp://local-files/v1/artists")
    s<LocalArtists> e(@QueryMap Map<String, String> map);
}

package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.endpoint.model.AlbumRecommendationsResponse;
import com.spotify.music.features.yourlibrary.musicpages.endpoint.model.b;
import io.reactivex.z;

/* renamed from: ia9  reason: default package */
public interface ia9 {
    @erf({"Accept: application/json"})
    @zqf("your-library-view/v1/recommendations/albums")
    z<AlbumRecommendationsResponse> a(@nrf("limit") int i);

    @erf({"Accept: application/json"})
    @zqf("your-library-view/v1/recommendations/artists?source=collection")
    z<b> b(@nrf("limit") int i);
}

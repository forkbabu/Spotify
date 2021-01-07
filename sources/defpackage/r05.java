package defpackage;

import com.spotify.music.features.eventshub.locationsearch.model.LocationsHolder;
import com.spotify.music.features.eventshub.model.ArtistConcertsModel;
import com.spotify.music.features.eventshub.model.ConcertEntityModel;
import com.spotify.music.features.eventshub.model.EventsHubModel;
import io.reactivex.z;
import retrofit2.v;

/* renamed from: r05  reason: default package */
public interface r05 {
    @zqf("concerts/v1/location/suggest")
    z<v<LocationsHolder>> a(@nrf("q") String str);

    @zqf("concerts/v2/concerts/artist/{artistId}?decorate=true&locale=en")
    z<ArtistConcertsModel> b(@mrf("artistId") String str, @nrf("geohash") Integer num, @nrf("filterByLoc") boolean z);

    @zqf("concerts/v2/concerts/view?source=user&source=popular&source=online")
    z<v<EventsHubModel>> c(@nrf("geonameId") Integer num);

    @zqf("concerts/v1/concert/view/{concertId}")
    z<ConcertEntityModel> d(@mrf("concertId") String str);
}

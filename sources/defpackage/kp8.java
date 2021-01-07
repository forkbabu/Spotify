package defpackage;

import com.spotify.music.features.tasteonboarding.artistsearch.model.ArtistSearchResponse;
import io.reactivex.s;

/* renamed from: kp8  reason: default package */
public interface kp8 {
    @zqf("nftonboarding/v2/search")
    s<ArtistSearchResponse> a(@nrf("query") String str, @nrf("timestamp") String str2, @nrf("search-session-id") String str3, @nrf("session-id") String str4);

    @zqf("nftonboarding/v3/search")
    s<ArtistSearchResponse> b(@nrf("query") String str, @nrf("timestamp") String str2, @nrf("search-session-id") String str3, @nrf("session-id") String str4);

    @zqf
    s<ArtistSearchResponse> c(@srf String str);
}

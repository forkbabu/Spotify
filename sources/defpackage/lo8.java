package defpackage;

import com.spotify.music.features.tasteonboarding.artistpicker.model.ArtistPickerResponse;
import com.spotify.music.features.tasteonboarding.artistpicker.model.RelatedArtistsResponse;
import io.reactivex.z;

/* renamed from: lo8  reason: default package */
public interface lo8 {
    @zqf
    z<RelatedArtistsResponse> a(@srf String str);

    @zqf("nftonboarding/v1/questionnaire/single?retake=true&platform=android")
    z<ArtistPickerResponse> b(@nrf("manufacturer") String str, @nrf("model") String str2, @nrf("deepLink") String str3, @nrf("logging") String str4);

    @zqf("nftonboarding/v1/questionnaire/single?platform=android")
    z<ArtistPickerResponse> c(@nrf("manufacturer") String str, @nrf("model") String str2, @nrf("deepLink") String str3, @nrf("logging") String str4);

    @zqf
    z<ArtistPickerResponse> d(@srf String str);
}

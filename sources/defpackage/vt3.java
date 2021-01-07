package defpackage;

import com.spotify.music.features.ads.sponsorship.model.SponsorshipAdData;
import com.spotify.music.features.ads.sponsorship.model.Sponsorships;
import io.reactivex.z;
import retrofit2.v;

/* renamed from: vt3  reason: default package */
public interface vt3 {
    @zqf("sponsoredplaylist/v1/sponsored/{contextUri}")
    z<v<SponsorshipAdData>> a(@mrf("contextUri") String str);

    @zqf("sponsoredplaylist/v1/sponsored")
    z<v<Sponsorships>> b();
}

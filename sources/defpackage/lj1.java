package defpackage;

import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import io.reactivex.z;
import java.util.List;
import java.util.Map;

/* renamed from: lj1  reason: default package */
public interface lj1 {
    @zqf("external-integration-recs/v1/{spaces-id}")
    z<HubsJsonViewModel> a(@mrf("spaces-id") String str, @nrf("signal") List<String> list, @nrf("page") String str2, @nrf("per_page") String str3, @nrf("region") String str4, @nrf("locale") String str5, @nrf("platform") String str6, @nrf("version") String str7, @nrf("dt") String str8, @nrf("suppress404") String str9, @nrf("suppress_response_codes") String str10, @nrf("packageName") String str11, @nrf("clientId") String str12, @nrf("category") String str13, @nrf("transportType") String str14, @nrf("protocol") String str15);

    @zqf("external-integration-recs/v1/external-integration-browse")
    z<HubsJsonViewModel> b(@orf Map<String, String> map, @drf Map<String, String> map2, @nrf("packageName") String str, @nrf("clientId") String str2, @nrf("category") String str3, @nrf("transportType") String str4, @nrf("protocol") String str5);

    @zqf("external-integration-recs/v1/{genre}")
    z<HubsJsonViewModel> c(@mrf("genre") String str, @orf Map<String, String> map, @drf Map<String, String> map2, @nrf("packageName") String str2, @nrf("clientId") String str3, @nrf("category") String str4, @nrf("transportType") String str5, @nrf("protocol") String str6);

    @zqf("external-integration-recs/v1/android-auto-home")
    z<HubsJsonViewModel> d(@orf Map<String, String> map, @drf Map<String, String> map2, @nrf("packageName") String str, @nrf("clientId") String str2, @nrf("category") String str3, @nrf("transportType") String str4, @nrf("protocol") String str5);
}

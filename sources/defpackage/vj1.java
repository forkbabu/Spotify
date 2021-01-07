package defpackage;

import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import io.reactivex.z;
import java.util.List;
import java.util.Map;

/* renamed from: vj1  reason: default package */
public interface vj1 {
    @zqf("vanilla/v1/views/hub2/android-auto-home")
    z<HubsJsonViewModel> a(@orf Map<String, String> map, @drf Map<String, String> map2);

    @zqf("vanilla/v1/views/hub2/external-integration-browse")
    z<HubsJsonViewModel> b(@orf Map<String, String> map, @drf Map<String, String> map2);

    @zqf("vanilla/v1/views/hub2/{spaces-id}")
    z<HubsJsonViewModel> c(@mrf("spaces-id") String str, @nrf("signal") List<String> list, @nrf("page") String str2, @nrf("per_page") String str3, @nrf("region") String str4, @nrf("locale") String str5, @nrf("platform") String str6, @nrf("version") String str7, @nrf("dt") String str8, @nrf("suppress404") String str9, @nrf("suppress_response_codes") String str10);

    @zqf("vanilla/v1/views/hub2/{genre}")
    z<HubsJsonViewModel> d(@mrf("genre") String str, @orf Map<String, String> map, @drf Map<String, String> map2);
}

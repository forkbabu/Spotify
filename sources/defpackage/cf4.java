package defpackage;

import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import io.reactivex.z;
import okhttp3.e0;
import retrofit2.v;

/* renamed from: cf4  reason: default package */
public interface cf4 {
    @zqf("hubview-mobile-v1/browse/{page}?platform=android")
    z<v<e0>> a(@mrf("page") String str, @nrf("client-timezone") String str2, @nrf("podcast") boolean z, @nrf("locale") String str3, @nrf("signal") String str4, @nrf("offset") String str5);

    @zqf("hubview-mobile-v1/browse/{page}?platform=android")
    z<HubsJsonViewModel> b(@mrf("page") String str, @nrf("client-timezone") String str2, @nrf("podcast") boolean z, @nrf("locale") String str3, @nrf("signal") String str4, @nrf("offset") String str5);
}

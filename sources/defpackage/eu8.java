package defpackage;

import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import io.reactivex.z;

/* renamed from: eu8  reason: default package */
public interface eu8 {
    @zqf("vanilla/v1/views/hub2/mo-trending-searches")
    z<HubsJsonViewModel> a(@nrf("locale") String str);

    @zqf("vanilla/v1/views/hub2/mo-trending-searches?signal=includepodcasts%3Atrue")
    z<HubsJsonViewModel> b(@nrf("locale") String str);
}

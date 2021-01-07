package defpackage;

import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import io.reactivex.z;

/* renamed from: pma  reason: default package */
public interface pma {
    @zqf("podcast-charts-service/v2/charts/hubs")
    z<HubsJsonViewModel> a(@nrf("page_uri") String str);
}

package defpackage;

import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import io.reactivex.z;
import java.util.Map;

/* renamed from: w85  reason: default package */
public interface w85 {
    @zqf("track-entity-view/v2/track/{id}")
    z<HubsJsonViewModel> a(@mrf("id") String str, @orf Map<String, String> map);
}

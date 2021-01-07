package defpackage;

import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import io.reactivex.z;
import java.util.Map;

/* renamed from: e75  reason: default package */
public interface e75 {
    @zqf("artistview/v1/artist/{id}/releases")
    z<HubsJsonViewModel> a(@mrf("id") String str, @orf Map<String, String> map);
}

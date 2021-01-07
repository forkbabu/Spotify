package defpackage;

import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import io.reactivex.z;
import java.util.Map;

/* renamed from: vv3  reason: default package */
public interface vv3 {
    @zqf("album-entity-view/v2/album/{albumId}")
    z<HubsJsonViewModel> a(@mrf("albumId") String str, @orf Map<String, String> map);
}

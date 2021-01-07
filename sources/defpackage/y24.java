package defpackage;

import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import io.reactivex.z;
import java.util.List;
import java.util.Map;

/* renamed from: y24  reason: default package */
public interface y24 {
    @zqf("vanilla/v1/views/hub2/assisted-curation-search-album-entity")
    z<HubsJsonViewModel> a(@orf Map<String, String> map, @nrf("signal") List<String> list);

    @zqf("vanilla/v1/views/hub2/assisted-curation-search-artist-entity")
    z<HubsJsonViewModel> b(@orf Map<String, String> map, @nrf("signal") List<String> list);

    @zqf("vanilla/v1/views/hub2/{space}")
    z<HubsJsonViewModel> c(@mrf("space") String str, @orf Map<String, String> map, @nrf("signal") List<String> list);
}

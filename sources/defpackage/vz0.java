package defpackage;

import com.spotify.searchview.assistedcuration.proto.DrillDownViewResponse;
import com.spotify.searchview.proto.MainViewResponse;
import io.reactivex.z;
import java.util.Map;

/* renamed from: vz0  reason: default package */
public interface vz0 {
    @erf({"Accept: application/protobuf"})
    @zqf("searchview/v2/search")
    z<MainViewResponse> a(@orf Map<String, String> map);

    @zqf("searchview/v2/assisted-curation/{drilldown}")
    z<DrillDownViewResponse> b(@mrf("drilldown") String str, @orf Map<String, String> map);

    @zqf("searchview/v2/assisted-curation")
    z<com.spotify.searchview.assistedcuration.proto.MainViewResponse> c(@orf Map<String, String> map);

    @erf({"Accept: application/protobuf"})
    @zqf("searchview/v2/search/{drilldown}")
    z<com.spotify.searchview.proto.DrillDownViewResponse> d(@mrf("drilldown") String str, @orf Map<String, String> map);
}

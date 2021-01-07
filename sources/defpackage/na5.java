package defpackage;

import com.spotify.stories.v2.view.rpc.proto.GetStoryViewResponse;
import io.reactivex.z;

/* renamed from: na5  reason: default package */
public interface na5 {
    @erf({"Accept: application/protobuf"})
    @zqf("stories-view/v2/stories")
    z<GetStoryViewResponse> a(@nrf("uri") String str);
}

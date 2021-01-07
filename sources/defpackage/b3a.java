package defpackage;

import com.spotify.rcs.model.proto.Bootstrap$BootstrapRequest;
import com.spotify.rcs.model.proto.Bootstrap$BootstrapResponse;
import io.reactivex.z;
import retrofit2.v;

/* renamed from: b3a  reason: default package */
public interface b3a {
    @erf({"Accept: application/protobuf"})
    @irf("/bootstrap/v1/bootstrap")
    z<v<Bootstrap$BootstrapResponse>> a(@uqf Bootstrap$BootstrapRequest bootstrap$BootstrapRequest);
}

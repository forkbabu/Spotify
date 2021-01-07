package defpackage;

import com.spotify.pses.v1.proto.ConfigurationRequest;
import com.spotify.pses.v1.proto.ConfigurationResponse;
import io.reactivex.z;

/* renamed from: ay0  reason: default package */
public interface ay0 {
    @erf({"No-Webgate-Authentication: true", "Accept: application/protobuf"})
    @irf("v1/pses/screenconfig")
    z<ConfigurationResponse> a(@uqf ConfigurationRequest configurationRequest);
}

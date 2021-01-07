package defpackage;

import com.spotify.allboarding.model.v1.proto.MoreResponse;
import com.spotify.allboarding.model.v1.proto.OnboardingRequest;
import com.spotify.allboarding.model.v1.proto.OnboardingResponse;
import com.spotify.allboarding.model.v1.proto.SearchResponse;
import io.reactivex.z;

/* renamed from: sv0  reason: default package */
public interface sv0 {
    @erf({"Accept: application/protobuf"})
    @zqf
    z<SearchResponse> a(@srf String str, @nrf("query") String str2, @nrf("timestamp") String str3, @nrf("session-id") String str4);

    @erf({"Accept: application/protobuf"})
    @zqf
    z<MoreResponse> b(@srf String str);

    @erf({"Accept: application/protobuf"})
    @zqf("allboarding/v1/onboarding/{path}")
    z<OnboardingResponse> c(@mrf("path") String str, @nrf("deeplink") String str2, @nrf("entry-point") String str3, @nrf("manufacturer") String str4, @nrf("model") String str5, @nrf("platform") String str6);

    @erf({"Accept: application/protobuf"})
    @irf
    z<OnboardingResponse> d(@srf String str, @uqf OnboardingRequest onboardingRequest, @nrf("deeplink") String str2, @nrf("manufacturer") String str3, @nrf("model") String str4, @nrf("platform") String str5);
}

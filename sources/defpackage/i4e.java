package defpackage;

import com.spotify.share.base.linkgeneration.proto.GenerateUrlRequest;
import com.spotify.share.base.linkgeneration.proto.GenerateUrlResponse;
import io.reactivex.z;

/* renamed from: i4e  reason: default package */
public interface i4e {
    @erf({"Accept: application/protobuf"})
    @irf("url-dispenser/v1/generate-url")
    z<GenerateUrlResponse> a(@uqf GenerateUrlRequest generateUrlRequest);
}

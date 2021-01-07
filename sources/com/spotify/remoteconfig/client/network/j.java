package com.spotify.remoteconfig.client.network;

import com.spotify.rcs.resolver.grpc.v0.ResolveRequest;
import com.spotify.rcs.resolver.grpc.v0.ResolveResponse;
import com.spotify.ucs.proto.v0.UcsRequest;
import com.spotify.ucs.proto.v0.UcsResponseWrapper;
import io.reactivex.z;
import retrofit2.v;

public interface j {
    public static final a a = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }
    }

    @erf({"Content-Type: application/protobuf", "Accept: application/protobuf"})
    @irf("user-customization-service/v1/customize")
    z<v<UcsResponseWrapper>> a(@uqf UcsRequest ucsRequest);

    @erf({"Content-Type: application/protobuf", "Accept: application/protobuf"})
    @irf("remote-config-resolver/v3/configuration")
    z<v<ResolveResponse>> b(@uqf ResolveRequest resolveRequest);
}

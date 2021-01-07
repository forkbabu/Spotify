package defpackage;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.Headers;
import com.spotify.cosmos.android.cosmonaut.annotations.PUT;
import com.spotify.playlist.ondemand.proto.SetRequest;
import com.spotify.playlist.ondemand.proto.TemporaryRequest;
import io.reactivex.a;

@CosmosService
/* renamed from: txd  reason: default package */
public interface txd {
    @Headers({"content-type: application/protobuf", "accept: application/protobuf"})
    @PUT("sp://on-demand-set/v1/temporary")
    a a(@Body TemporaryRequest temporaryRequest);

    @Headers({"content-type: application/protobuf", "accept: application/protobuf"})
    @PUT("sp://on-demand-set/v1/set")
    a b(@Body SetRequest setRequest);
}

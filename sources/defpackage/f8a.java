package defpackage;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.Query;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.util.decorator.UpdateModel;
import io.reactivex.s;
import io.reactivex.z;

@CosmosService
/* renamed from: f8a  reason: default package */
public interface f8a {
    @SUB("sp://core-collection/unstable/@/decorate?responseFormat=protobuf")
    s<Response> a(@Query("preferCached") boolean z, @Body UpdateModel updateModel);

    @GET("sp://core-collection/unstable/@/decorate?responseFormat=protobuf")
    z<Response> b(@Query("preferCached") boolean z, @Body UpdateModel updateModel);
}

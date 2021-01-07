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
/* renamed from: qna  reason: default package */
public interface qna {
    @GET("sp://core-show/unstable/decorate?responseFormat=protobuf")
    z<Response> a(@Query("preferCached") boolean z, @Body UpdateModel updateModel);

    @SUB("sp://core-show/unstable/decorate?responseFormat=protobuf")
    s<Response> b(@Query("preferCached") boolean z, @Body UpdateModel updateModel);
}

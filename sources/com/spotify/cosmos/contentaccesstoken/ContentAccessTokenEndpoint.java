package com.spotify.cosmos.contentaccesstoken;

import com.spotify.contentaccesstoken.proto.ContentAccessRefreshToken;
import com.spotify.contentaccesstoken.proto.ContentAccessTokenResponse;
import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.Headers;
import com.spotify.cosmos.android.cosmonaut.annotations.POST;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.cosmos.router.Response;
import io.reactivex.z;
import kotlin.f;

@CosmosService
public interface ContentAccessTokenEndpoint {
    @GET("sp://content-access-token/v1/token")
    @Headers({"content-type: application/protobuf", "accept: application/protobuf"})
    z<ContentAccessTokenResponse> getToken();

    @Headers({"content-type: application/protobuf", "accept: application/protobuf"})
    @POST("sp://content-access-token/v1/refresh-token")
    z<f> setRefreshToken(@Body ContentAccessRefreshToken contentAccessRefreshToken);

    @GET("sp://content-access-token/v1/{state}")
    z<Response> setState(@Path("state") String str);
}

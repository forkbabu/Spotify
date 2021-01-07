package com.spotify.cosmos.session.impl;

import com.spotify.cosmos.android.TypedResponse;
import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.BodyPart;
import com.spotify.cosmos.android.cosmonaut.annotations.DELETE;
import com.spotify.cosmos.android.cosmonaut.annotations.POST;
import com.spotify.cosmos.android.cosmonaut.annotations.Query;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.cosmos.router.Response;
import com.spotify.cosmos.session.model.LoginRequest;
import com.spotify.cosmos.session.model.LoginResponseBody;
import com.spotify.cosmos.session.model.ProductStateWrapper;
import com.spotify.cosmos.session.model.SessionInfo;
import io.reactivex.a;
import io.reactivex.s;
import io.reactivex.z;

/* access modifiers changed from: package-private */
@CosmosService
public interface SessionCosmosClient {
    @POST("sp://session/v1/cancel")
    a cancel();

    @SUB("sp://session/v1")
    s<SessionInfo> currentSession();

    @POST("sp://session/v1/disable-product-state-from-ucs")
    z<Response> disableProductStateFromUcs();

    @POST("sp://session/v1")
    z<TypedResponse<LoginResponseBody>> login(@Body LoginRequest loginRequest);

    @DELETE("sp://session/v1")
    a logout(@Query("forgetCredentials") boolean z);

    @POST("sp://session/v1/bootstrap-completed")
    z<TypedResponse<LoginResponseBody>> notifyBootstrapCompleted(@Body ProductStateWrapper productStateWrapper, @Query("success") boolean z);

    @POST("sp://session/v1/resend")
    z<TypedResponse<LoginResponseBody>> resendCode(@Query("uid") String str);

    @POST("sp://session/v1/update-product-state")
    z<Response> updateProductState(@Body ProductStateWrapper productStateWrapper);

    @POST("sp://session/v1/code")
    z<TypedResponse<LoginResponseBody>> verifyCode(@Query("uid") String str, @BodyPart("code") String str2);
}

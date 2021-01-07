package com.spotify.music.feedback;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.DELETE;
import com.spotify.cosmos.android.cosmonaut.annotations.POST;
import com.spotify.cosmos.android.cosmonaut.annotations.Query;
import io.reactivex.a;

@CosmosService
public interface d {
    @POST("sp://feedback/v1/feedback/like")
    a a(@Query(encoded = false, value = "uri") String str, @Query(encoded = false, value = "context_uri") String str2, @Query(encoded = false, value = "subcontext_uri") String str3, @Query(encoded = false, value = "feature") String str4, @Query(encoded = false, value = "reason") String str5, @Query(encoded = false, value = "view_uri") String str6);

    @DELETE("sp://feedback/v1/feedback")
    a b(@Query(encoded = false, value = "uri") String str, @Query(encoded = false, value = "context_uri") String str2, @Query(encoded = false, value = "subcontext_uri") String str3, @Query(encoded = false, value = "feature") String str4, @Query(encoded = false, value = "reason") String str5);

    @POST("sp://feedback/v1/feedback/dislike")
    a c(@Query(encoded = false, value = "uri") String str, @Query(encoded = false, value = "context_uri") String str2, @Query(encoded = false, value = "subcontext_uri") String str3, @Query(encoded = false, value = "feature") String str4, @Query(encoded = false, value = "reason") String str5);
}

package com.spotify.music.features.payfail;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.music.features.payfail.PaymentFailureRepository;
import io.reactivex.z;

@CosmosService
public interface g0 {
    @GET("sp://offline/v1/resources")
    z<PaymentFailureRepository.Resources> a();
}

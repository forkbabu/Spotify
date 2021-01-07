package com.spotify.music.concat;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.music.concat.proto.ConcatCosmos$ConcatRequest;
import com.spotify.music.concat.proto.ConcatCosmos$ConcatResponse;
import com.spotify.music.concat.proto.TechuCoreExercise$TechUCoreExerciseRequest;
import com.spotify.music.concat.proto.TechuCoreExercise$TechUCoreExerciseResponse;
import io.reactivex.z;

@CosmosService
public interface d {
    @GET("sp://concat/concat")
    z<ConcatCosmos$ConcatResponse> a(@Body ConcatCosmos$ConcatRequest concatCosmos$ConcatRequest);

    @GET("sp://techu-core-exercise/v1/concat")
    z<TechuCoreExercise$TechUCoreExerciseResponse> b(@Body TechuCoreExercise$TechUCoreExerciseRequest techuCoreExercise$TechUCoreExerciseRequest);
}

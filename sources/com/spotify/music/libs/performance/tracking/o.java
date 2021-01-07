package com.spotify.music.libs.performance.tracking;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.POST;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.cosmos.android.cosmonaut.annotations.Query;
import com.spotify.cosmos.router.Response;
import io.reactivex.z;

@CosmosService
public interface o {
    @POST("sp://perf-metrics/v1/startup/reached-terminal-state/{terminalState}")
    z<Response> a(@Path("terminalState") String str, @Query("foreground_startup") boolean z);
}

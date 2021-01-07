package defpackage;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.music.freetiercommon.models.RemainingSkips;
import io.reactivex.z;

@CosmosService
/* renamed from: mk9  reason: default package */
public interface mk9 {
    @GET("sp://sequence_rules/v1/remaining_skips")
    z<RemainingSkips> a();
}

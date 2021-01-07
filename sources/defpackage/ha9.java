package defpackage;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Query;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.music.features.yourlibrary.musicpages.endpoint.model.BansResponse;
import io.reactivex.s;

@CosmosService
/* renamed from: ha9  reason: default package */
public interface ha9 {
    @SUB("sp://core-collection/unstable/bans")
    s<BansResponse> a(@Query("sort") String str);
}

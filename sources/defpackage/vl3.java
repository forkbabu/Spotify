package defpackage;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.cosmos.router.Response;
import io.reactivex.s;

@CosmosService
/* renamed from: vl3  reason: default package */
public interface vl3 {
    @SUB("sp://voice_ad/v1/audio-signal")
    s<Response> a();
}

package defpackage;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.PUT;
import com.spotify.cosmos.router.Response;
import com.spotify.messages.CoreIntegrationTestEvent;
import io.reactivex.z;

@CosmosService
/* renamed from: m05  reason: default package */
public interface m05 {
    @PUT("sp://event_sender/v1/gabitoevent/CoreIntegrationTestEvent")
    z<Response> a(@Body CoreIntegrationTestEvent coreIntegrationTestEvent);
}

package defpackage;

import com.spotify.collection.endpoints.proto.TrackListMetadata$ProtoTrackListMetadataResponse;
import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.QueryMap;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import io.reactivex.s;
import java.util.Map;

@CosmosService
/* renamed from: qh0  reason: default package */
public interface qh0 {
    @SUB("sp://core-collection/unstable/@/list/tracks/metadata")
    s<TrackListMetadata$ProtoTrackListMetadataResponse> a(@QueryMap Map<String, String> map);
}

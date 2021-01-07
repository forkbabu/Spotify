package defpackage;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.metadata.proto.Metadata$Album;
import com.spotify.metadata.proto.Metadata$Artist;
import com.spotify.metadata.proto.Metadata$Show;
import com.spotify.metadata.proto.Metadata$Track;
import io.reactivex.z;

@CosmosService
/* renamed from: k31  reason: default package */
public interface k31 {
    @GET("sp://metadata/v1/uri/{uri}")
    z<Metadata$Show> a(@Path("uri") String str);

    @GET("sp://metadata/v1/uri/{uri}")
    z<Metadata$Artist> b(@Path("uri") String str);

    @GET("sp://metadata/v1/uri/{uri}")
    z<Metadata$Track> c(@Path("uri") String str);

    @GET("sp://metadata/v1/uri/{uri}")
    z<Metadata$Album> d(@Path("uri") String str);
}

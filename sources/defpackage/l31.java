package defpackage;

import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.metadata.proto.Metadata$Album;
import com.spotify.metadata.proto.Metadata$Artist;
import com.spotify.metadata.proto.Metadata$Show;
import com.spotify.metadata.proto.Metadata$Track;
import io.reactivex.z;
import java.util.List;

/* renamed from: l31  reason: default package */
public interface l31 {
    z<Metadata$Show> a(@Path("uri") String str);

    z<Metadata$Artist> b(@Path("uri") String str);

    z<Metadata$Track> c(@Path("uri") String str);

    z<Metadata$Album> d(@Path("uri") String str);

    z<List<String>> e(List<String> list);
}

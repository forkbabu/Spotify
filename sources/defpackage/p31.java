package defpackage;

import com.spotify.common.uri.SpotifyUri;
import com.spotify.metadata.proto.Metadata$Album;
import com.spotify.metadata.proto.Metadata$Artist;
import com.spotify.metadata.proto.Metadata$Show;
import com.spotify.metadata.proto.Metadata$Track;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.z;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: p31  reason: default package */
public final class p31 implements l31 {
    private final k31 a;

    /* renamed from: p31$a */
    static final class a<T, R> implements l<String, v<? extends String>> {
        final /* synthetic */ p31 a;

        a(p31 p31) {
            this.a = p31;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends String> apply(String str) {
            String str2 = str;
            h.e(str2, "uri");
            SpotifyUri spotifyUri = new SpotifyUri(str2);
            SpotifyUri.Kind i = spotifyUri.i();
            h.d(i, "spotifyUri.kind");
            if (i.ordinal() == 3) {
                return p31.f(this.a, str2);
            }
            s i0 = s.i0(spotifyUri.toString());
            h.d(i0, "Observable.just(spotifyUri.toString())");
            return i0;
        }
    }

    public p31(k31 k31) {
        h.e(k31, "mCosmosService");
        this.a = k31;
    }

    public static final s f(p31 p31, String str) {
        s<R> j0 = p31.a.d(str).P().W(m31.a, false, Integer.MAX_VALUE).W(n31.a, false, Integer.MAX_VALUE).j0(o31.a);
        h.d(j0, "mCosmosService\n         …yteArray())).toString() }");
        return j0;
    }

    @Override // defpackage.l31
    public z<Metadata$Show> a(String str) {
        h.e(str, "showUri");
        return this.a.a(str);
    }

    @Override // defpackage.l31
    public z<Metadata$Artist> b(String str) {
        h.e(str, "artistUri");
        return this.a.b(str);
    }

    @Override // defpackage.l31
    public z<Metadata$Track> c(String str) {
        h.e(str, "trackUri");
        return this.a.c(str);
    }

    @Override // defpackage.l31
    public z<Metadata$Album> d(String str) {
        h.e(str, "albumUri");
        return this.a.d(str);
    }

    @Override // defpackage.l31
    public z<List<String>> e(List<String> list) {
        h.e(list, "uris");
        z<List<String>> Z0 = s.d0(list).w(new a(this)).Z0();
        h.d(Z0, "Observable.fromIterable(… }\n            }.toList()");
        return Z0;
    }
}

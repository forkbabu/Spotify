package defpackage;

import com.spotify.common.uri.Base62;
import com.spotify.common.uri.SpotifyUri;
import com.spotify.metadata.proto.Metadata$Track;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: o31  reason: default package */
public final class o31<T, R> implements l<Metadata$Track, String> {
    public static final o31 a = new o31();

    o31() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public String apply(Metadata$Track metadata$Track) {
        Metadata$Track metadata$Track2 = metadata$Track;
        h.e(metadata$Track2, AppProtocol.TrackData.TYPE_TRACK);
        return new SpotifyUri(SpotifyUri.Kind.TRACK, Base62.a(metadata$Track2.l().A()), null).toString();
    }
}

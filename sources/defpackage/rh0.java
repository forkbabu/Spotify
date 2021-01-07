package defpackage;

import com.spotify.collection.endpoints.proto.TrackListMetadata$ProtoTrackListMetadataResponse;
import com.spotify.playlist.models.offline.b;
import io.reactivex.functions.l;
import io.reactivex.s;
import kotlin.jvm.internal.h;

/* renamed from: rh0  reason: default package */
public final class rh0 implements oh0 {
    private final qh0 a;

    /* renamed from: rh0$a */
    static final class a<T, R> implements l<TrackListMetadata$ProtoTrackListMetadataResponse, vh0> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public vh0 apply(TrackListMetadata$ProtoTrackListMetadataResponse trackListMetadata$ProtoTrackListMetadataResponse) {
            TrackListMetadata$ProtoTrackListMetadataResponse trackListMetadata$ProtoTrackListMetadataResponse2 = trackListMetadata$ProtoTrackListMetadataResponse;
            h.e(trackListMetadata$ProtoTrackListMetadataResponse2, "it");
            h.e(trackListMetadata$ProtoTrackListMetadataResponse2, "from");
            return new vh0(trackListMetadata$ProtoTrackListMetadataResponse2.m(), trackListMetadata$ProtoTrackListMetadataResponse2.h(), b.a(trackListMetadata$ProtoTrackListMetadataResponse2.i(), trackListMetadata$ProtoTrackListMetadataResponse2.l()));
        }
    }

    public rh0(qh0 qh0) {
        h.e(qh0, "cosmosServiceCollection");
        this.a = qh0;
    }

    @Override // defpackage.oh0
    public s<vh0> a(ph0 ph0) {
        h.e(ph0, "configurationCollection");
        s<R> j0 = this.a.a(ph0.b()).j0(a.a);
        h.d(j0, "cosmosServiceCollection\n…lectionListMetadata(it) }");
        return j0;
    }
}

package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.spotlets.collection.proto.CollectionDecorateRequest$ProtoDecorateResponse;
import com.spotify.mobile.android.spotlets.collection.proto.CollectionDecorateRequest$ProtoDecorateTrackItem;
import com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackArtistMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$TrackDescriptor;
import com.spotify.mobile.android.spotlets.collection.proto.TrackState$ProtoTrackCollectionState;
import com.spotify.mobile.android.spotlets.collection.proto.TrackState$ProtoTrackOfflineState;
import com.spotify.mobile.android.spotlets.collection.proto.TrackState$ProtoTrackPlayState;
import com.spotify.mobile.android.util.decorator.UpdateModel;
import com.spotify.mobile.android.util.decorator.c;
import com.spotify.mobile.android.util.x;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.PlayabilityRestriction;
import com.spotify.playlist.models.a;
import com.spotify.playlist.models.b;
import com.spotify.playlist.models.o;
import com.spotify.playlist.models.q;
import io.reactivex.s;
import io.reactivex.y;
import io.reactivex.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: c8a  reason: default package */
public class c8a extends c<o> {
    private final f8a d;

    public c8a(f8a f8a, y yVar, y yVar2) {
        super(yVar, yVar2);
        this.d = f8a;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.util.decorator.c
    public z<Response> a(UpdateModel updateModel) {
        return this.d.b(d(), updateModel);
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.util.decorator.c
    public s<Response> b(UpdateModel updateModel) {
        return this.d.a(d(), updateModel);
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.util.decorator.c
    public Map<String, o> c(byte[] bArr) {
        o oVar;
        String str;
        b bVar;
        a aVar;
        CollectionDecorateRequest$ProtoDecorateResponse p = CollectionDecorateRequest$ProtoDecorateResponse.p(bArr);
        if (p == null) {
            return null;
        }
        HashMap hashMap = new HashMap(p.n());
        for (CollectionDecorateRequest$ProtoDecorateTrackItem collectionDecorateRequest$ProtoDecorateTrackItem : p.o()) {
            String i = collectionDecorateRequest$ProtoDecorateTrackItem.i();
            TrackMetadata$ProtoTrackMetadata n = collectionDecorateRequest$ProtoDecorateTrackItem.r() ? collectionDecorateRequest$ProtoDecorateTrackItem.n() : null;
            TrackState$ProtoTrackOfflineState l = collectionDecorateRequest$ProtoDecorateTrackItem.p() ? collectionDecorateRequest$ProtoDecorateTrackItem.l() : null;
            TrackState$ProtoTrackPlayState m = collectionDecorateRequest$ProtoDecorateTrackItem.q() ? collectionDecorateRequest$ProtoDecorateTrackItem.m() : null;
            TrackState$ProtoTrackCollectionState h = collectionDecorateRequest$ProtoDecorateTrackItem.o() ? collectionDecorateRequest$ProtoDecorateTrackItem.h() : null;
            if (!MoreObjects.isNullOrEmpty(null)) {
                o.a builder = o.builder();
                builder.i(null);
                if (n == null) {
                    aVar = a.a().e();
                } else {
                    aVar = iaa.c(n.u() ? n.h() : null);
                }
                builder.g(aVar);
                oVar = builder.build();
            } else if (n == null) {
                oVar = o.builder().build();
            } else {
                int i2 = ImmutableList.a;
                ImmutableList.Builder builder2 = new ImmutableList.Builder();
                Iterator<TrackMetadata$ProtoTrackArtistMetadata> it = n.m().iterator();
                while (true) {
                    str = "";
                    if (!it.hasNext()) {
                        break;
                    }
                    TrackMetadata$ProtoTrackArtistMetadata next = it.next();
                    if (next == null) {
                        bVar = b.a().b();
                    } else {
                        b.a a = b.a();
                        a.n(next.h());
                        a.j(next.i());
                        Covers.a a2 = Covers.a();
                        a2.d((String) x.n(next.l().m(), str));
                        a.d(a2.a());
                        bVar = a.b();
                    }
                    builder2.mo53add((ImmutableList.Builder) bVar);
                }
                a c = iaa.c(n.u() ? n.h() : null);
                o.a builder3 = o.builder();
                builder3.g(c);
                boolean z = false;
                builder3.k(0);
                builder3.f(n.p());
                builder3.d(n.q());
                builder3.s(null);
                builder3.v(builder2.build());
                builder3.l(n.o());
                builder3.q(n.getIsLocal());
                builder3.o(n.s());
                builder3.x(n.getHasLyrics());
                builder3.a(n.getIsExplicit());
                builder3.w(n.getIs19PlusOnly());
                builder3.t(n.getIsPremiumOnly());
                builder3.p(n.r());
                builder3.m(n.getAvailable());
                List<TrackMetadata$TrackDescriptor> t = n.t();
                int i3 = ImmutableList.a;
                ImmutableList.Builder builder4 = new ImmutableList.Builder();
                for (TrackMetadata$TrackDescriptor trackMetadata$TrackDescriptor : t) {
                    builder4.mo53add((ImmutableList.Builder) trackMetadata$TrackDescriptor.h());
                }
                builder3.r(builder4.build());
                if (l != null) {
                    str = l.i();
                }
                builder3.e(com.spotify.playlist.models.offline.b.a(str, 0));
                builder3.b(m != null && m.i());
                builder3.c(h != null && h.i());
                builder3.h(h != null && h.m());
                builder3.u(h != null && h.h());
                if (h != null && h.n()) {
                    z = true;
                }
                builder3.n(z);
                builder3.j(m != null ? q.k(m.l()) : PlayabilityRestriction.UNKNOWN);
                oVar = builder3.build();
            }
            hashMap.put(i, oVar);
        }
        return hashMap;
    }
}

package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.spotlets.collection.proto.ArtistMetadata$ProtoArtistMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.ArtistState$ProtoArtistCollectionState;
import com.spotify.mobile.android.spotlets.collection.proto.ArtistState$ProtoArtistOfflineState;
import com.spotify.mobile.android.spotlets.collection.proto.CollectionDecorateRequest$ProtoDecorateArtistItem;
import com.spotify.mobile.android.spotlets.collection.proto.CollectionDecorateRequest$ProtoDecorateResponse;
import com.spotify.mobile.android.util.decorator.UpdateModel;
import com.spotify.mobile.android.util.decorator.c;
import com.spotify.mobile.android.util.x;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.b;
import io.reactivex.s;
import io.reactivex.y;
import io.reactivex.z;
import java.util.HashMap;
import java.util.Map;

/* renamed from: a8a  reason: default package */
public class a8a extends c<b> {
    private final f8a d;

    public a8a(f8a f8a, y yVar, y yVar2) {
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
    public Map<String, b> c(byte[] bArr) {
        b bVar;
        int i;
        int i2;
        int i3;
        CollectionDecorateRequest$ProtoDecorateResponse p = CollectionDecorateRequest$ProtoDecorateResponse.p(bArr);
        if (p == null) {
            return null;
        }
        HashMap hashMap = new HashMap(p.l());
        for (CollectionDecorateRequest$ProtoDecorateArtistItem collectionDecorateRequest$ProtoDecorateArtistItem : p.m()) {
            String l = collectionDecorateRequest$ProtoDecorateArtistItem.l();
            ArtistMetadata$ProtoArtistMetadata h = collectionDecorateRequest$ProtoDecorateArtistItem.n() ? collectionDecorateRequest$ProtoDecorateArtistItem.h() : null;
            ArtistState$ProtoArtistOfflineState m = collectionDecorateRequest$ProtoDecorateArtistItem.p() ? collectionDecorateRequest$ProtoDecorateArtistItem.m() : null;
            ArtistState$ProtoArtistCollectionState i4 = collectionDecorateRequest$ProtoDecorateArtistItem.o() ? collectionDecorateRequest$ProtoDecorateArtistItem.i() : null;
            if (!MoreObjects.isNullOrEmpty(null)) {
                b.a a = b.a();
                a.h(null);
                bVar = a.b();
            } else if (h == null) {
                bVar = b.a().b();
            } else {
                Covers e = iaa.e(h.n() ? h.h() : null);
                boolean z = false;
                if (m == null) {
                    i = 0;
                } else {
                    i = m.m();
                }
                b.a a2 = b.a();
                a2.d(e);
                a2.n(h.l());
                a2.j(h.m());
                a2.o(h.getIsVariousArtists());
                if (i4 == null) {
                    i2 = 0;
                } else {
                    i2 = i4.o();
                }
                a2.l(i2);
                if (i4 == null) {
                    i3 = 0;
                } else {
                    i3 = i4.n();
                }
                a2.k(i3);
                String str = "";
                if (i4 != null) {
                    str = (String) x.n(i4.h(), str);
                }
                a2.c(str);
                a2.a(0);
                a2.m(com.spotify.playlist.models.offline.b.a(m == null ? null : m.l(), i));
                a2.i(com.spotify.playlist.models.offline.b.a(m == null ? null : m.i(), i));
                a2.e(i4 != null && i4.m());
                if (i4 != null && i4.l()) {
                    z = true;
                }
                a2.f(z);
                a2.g(null);
                bVar = a2.b();
            }
            hashMap.put(l, bVar);
        }
        return hashMap;
    }
}

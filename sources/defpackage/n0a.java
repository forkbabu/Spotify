package defpackage;

import com.spotify.metadata.proto.Metadata$Artist;
import com.spotify.metadata.proto.Metadata$TopTracks;
import com.spotify.metadata.proto.Metadata$Track;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobile.android.util.q;
import defpackage.g1a;
import io.reactivex.functions.l;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: n0a  reason: default package */
public final /* synthetic */ class n0a implements l {
    public final /* synthetic */ Set a;

    public /* synthetic */ n0a(Set set) {
        this.a = set;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Set set = this.a;
        Metadata$Artist metadata$Artist = (Metadata$Artist) obj;
        ArrayList arrayList = new ArrayList();
        for (Metadata$TopTracks metadata$TopTracks : metadata$Artist.m()) {
            for (Metadata$Track metadata$Track : metadata$TopTracks.h()) {
                String B = l0.I(q.c(metadata$Track.l().A())).B();
                if (!set.contains(B)) {
                    arrayList.add(B);
                }
            }
        }
        g1a.b bVar = new g1a.b();
        bVar.b(metadata$Artist.i());
        bVar.c(arrayList);
        return bVar.a();
    }
}

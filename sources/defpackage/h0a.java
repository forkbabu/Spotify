package defpackage;

import com.spotify.metadata.proto.Metadata$Album;
import com.spotify.metadata.proto.Metadata$Disc;
import com.spotify.metadata.proto.Metadata$Track;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobile.android.util.q;
import defpackage.e1a;
import io.reactivex.functions.l;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: h0a  reason: default package */
public final /* synthetic */ class h0a implements l {
    public final /* synthetic */ Set a;

    public /* synthetic */ h0a(Set set) {
        this.a = set;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Set set = this.a;
        Metadata$Album metadata$Album = (Metadata$Album) obj;
        ArrayList arrayList = new ArrayList();
        for (Metadata$Disc metadata$Disc : metadata$Album.l()) {
            for (Metadata$Track metadata$Track : metadata$Disc.h()) {
                String B = l0.I(q.c(metadata$Track.l().A())).B();
                if (!set.contains(B)) {
                    arrayList.add(B);
                }
            }
        }
        e1a.b bVar = new e1a.b();
        bVar.b(metadata$Album.n());
        bVar.c(arrayList);
        return bVar.a();
    }
}

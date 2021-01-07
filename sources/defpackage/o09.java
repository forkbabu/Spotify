package defpackage;

import com.spotify.music.features.yourepisodes.domain.a;
import com.spotify.playlist.models.Episode;
import java.util.ArrayList;
import kotlin.jvm.internal.h;

/* renamed from: o09  reason: default package */
public final class o09 extends n09 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o09(uoc uoc, ngc ngc) {
        super(uoc, ngc);
        h.e(uoc, "cardView");
        h.e(ngc, "cardBinder");
    }

    @Override // defpackage.n09
    public void h0(a aVar, a[] aVarArr) {
        h.e(aVar, "item");
        h.e(aVarArr, "items");
        j0().c(true);
        ngc j0 = j0();
        uoc l0 = l0();
        Episode b = aVar.b();
        ArrayList arrayList = new ArrayList(aVarArr.length);
        for (a aVar2 : aVarArr) {
            arrayList.add(aVar2.b());
        }
        Object[] array = arrayList.toArray(new Episode[0]);
        if (array != null) {
            j0.b(l0, b, (Episode[]) array, "", aVar.a());
            l0().getView().setVisibility(0);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @Override // defpackage.n09
    public void m0() {
        l0().getView().setVisibility(4);
    }
}

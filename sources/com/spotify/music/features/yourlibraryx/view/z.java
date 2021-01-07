package com.spotify.music.features.yourlibraryx.view;

import androidx.recyclerview.widget.m;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryEntityInfo;
import com.spotify.music.features.yourlibraryx.view.y;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.j;

public final class z extends m.d<y> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.m.d
    public boolean a(y yVar, y yVar2) {
        y yVar3 = yVar;
        y yVar4 = yVar2;
        h.e(yVar3, "oldItem");
        h.e(yVar4, "newItem");
        return h.a(yVar3, yVar4);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.m.d
    public boolean b(y yVar, y yVar2) {
        y yVar3 = yVar;
        y yVar4 = yVar2;
        h.e(yVar3, "oldItem");
        h.e(yVar4, "newItem");
        if (!(!h.a(j.b(yVar3.getClass()), j.b(yVar4.getClass())))) {
            if (!(yVar3 instanceof y.a) || !(yVar4 instanceof y.a)) {
                return true;
            }
            y.a aVar = (y.a) yVar3;
            y.a aVar2 = (y.a) yVar4;
            if (aVar.b().l() == aVar2.b().l()) {
                YourLibraryResponseProto$YourLibraryEntityInfo m = aVar.b().m();
                h.d(m, "oldItem.entity.entityInfo");
                String p = m.p();
                YourLibraryResponseProto$YourLibraryEntityInfo m2 = aVar2.b().m();
                h.d(m2, "newItem.entity.entityInfo");
                if (h.a(p, m2.p())) {
                    return true;
                }
            }
        }
        return false;
    }
}

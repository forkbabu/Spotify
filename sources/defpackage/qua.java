package defpackage;

import com.spotify.searchview.proto.Entity;
import com.spotify.ubi.specification.factories.q3;
import defpackage.wsa;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: qua  reason: default package */
public class qua {
    private final mwa a;
    private final q3 b;
    private final boolean c;

    public qua(mwa mwa, q3 q3Var, boolean z) {
        this.a = mwa;
        this.b = q3Var;
        this.c = z;
    }

    public List<s81> a(List<Entity> list, String str) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            Entity entity = list.get(i);
            mwa mwa = this.a;
            rqe a2 = this.b.c().e(str).c().c(Integer.valueOf(i), entity.r()).a();
            wsa.a a3 = wsa.a();
            a3.e(a2);
            a3.a(i);
            a3.b(entity.r());
            a3.d("top-results");
            a3.c(str);
            lwa b2 = mwa.b(entity, a3.build());
            b2.b(this.c);
            b2.c(true);
            arrayList.add(b2.a());
        }
        return arrayList;
    }
}

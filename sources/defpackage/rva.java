package defpackage;

import com.spotify.searchview.assistedcuration.proto.Entity;
import com.spotify.ubi.specification.factories.v;
import defpackage.wsa;
import java.util.ArrayList;
import java.util.List;

/* renamed from: rva  reason: default package */
class rva {
    private final yva a;
    private final jxa<Entity.EntityCase> b;
    private final v c;

    rva(yva yva, jxa<Entity.EntityCase> jxa, v vVar) {
        this.a = yva;
        this.b = jxa;
        this.c = vVar;
    }

    public List<s81> a(List<Entity> list, String str) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            Entity entity = list.get(i);
            yva yva = this.a;
            rqe a2 = this.c.c().c(str).c().b(Integer.valueOf(i), entity.o()).a();
            wsa.a a3 = wsa.a();
            a3.e(a2);
            a3.a(i);
            a3.b(entity.o());
            a3.d("top-results");
            a3.c(str);
            xva b2 = yva.b(entity, a3.build(), this.b.a(entity.i()) + "-results");
            b2.b(true);
            arrayList.add(b2.a());
        }
        return arrayList;
    }
}

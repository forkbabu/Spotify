package defpackage;

import com.spotify.searchview.proto.Entity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cua  reason: default package */
public class cua implements sg0<jua, b91> {
    private final kua a;
    private final oua b;
    private final eua c;
    private final hua d;

    public cua(kua kua, oua oua, eua eua, hua hua) {
        this.a = kua;
        this.b = oua;
        this.c = eua;
        this.d = hua;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.sg0
    public b91 apply(jua jua) {
        jua jua2 = jua;
        List<Entity> a2 = zta.a(jua2.e().n());
        if (a2.isEmpty()) {
            return this.d.a(jua2);
        }
        List<s81> a3 = this.a.a(jua2, a2);
        List<s81> a4 = this.b.apply(jua2);
        return z81.i().a(a3).a(a4).h(this.c.a(jua2, jua2.e().l(0).n(), ((ArrayList) a3).size() - 1)).g();
    }
}

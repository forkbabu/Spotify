package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: jj0  reason: default package */
public final /* synthetic */ class jj0 implements qj0 {
    public final /* synthetic */ List a;

    public /* synthetic */ jj0(List list) {
        this.a = list;
    }

    @Override // defpackage.qj0
    public final oj0 a(wi0 wi0) {
        List<pj0> list = this.a;
        ArrayList arrayList = new ArrayList();
        for (pj0 pj0 : list) {
            arrayList.add(pj0.a(wi0));
        }
        return new mj0(arrayList);
    }
}

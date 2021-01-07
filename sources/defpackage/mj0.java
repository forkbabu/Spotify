package defpackage;

import java.util.List;

/* renamed from: mj0  reason: default package */
public final /* synthetic */ class mj0 implements oj0 {
    public final /* synthetic */ List a;

    public /* synthetic */ mj0(List list) {
        this.a = list;
    }

    @Override // defpackage.oj0
    public final void dispose() {
        List<oj0> list = this.a;
        synchronized (list) {
            for (oj0 oj0 : list) {
                oj0.dispose();
            }
            list.clear();
        }
    }
}

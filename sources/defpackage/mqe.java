package defpackage;

import defpackage.lqe;
import java.util.List;

/* renamed from: mqe  reason: default package */
public final class mqe extends lqe<mqe, b> {

    /* renamed from: mqe$b */
    public static class b extends lqe.a<mqe, b> {
        private b() {
        }

        /* Return type fixed from 'lqe' to match base method */
        /* access modifiers changed from: protected */
        @Override // defpackage.lqe.a
        public mqe d(rqe rqe, pqe pqe, List list) {
            return new mqe(rqe, pqe, list, null);
        }

        b(a aVar) {
        }
    }

    mqe(rqe rqe, pqe pqe, List list, a aVar) {
        super(rqe, pqe, list);
    }

    public static b e() {
        return new b(null);
    }

    @Override // defpackage.lqe
    public String toString() {
        StringBuilder V0 = je.V0("impression = ");
        V0.append(super.toString());
        return V0.toString();
    }
}

package defpackage;

import defpackage.lqe;
import java.util.List;

/* renamed from: nqe  reason: default package */
public final class nqe extends lqe<nqe, b> {
    private final qqe e;

    /* renamed from: nqe$b */
    public static class b extends lqe.a<nqe, b> {
        private qqe d;

        private b() {
        }

        /* Return type fixed from 'lqe' to match base method */
        /* access modifiers changed from: protected */
        @Override // defpackage.lqe.a
        public nqe d(rqe rqe, pqe pqe, List list) {
            qqe qqe = this.d;
            tqe.c(qqe, "action");
            if (qqe == null) {
                return new nqe(rqe, pqe, lqe.a.b(list, "No action!"), qqe.e, null);
            }
            List<String> a = this.d.a();
            if (!a.isEmpty()) {
                list = lqe.a.b(a, new String[0]);
            }
            return new nqe(rqe, pqe, list, this.d, null);
        }

        public b h(qqe qqe) {
            tqe.a(qqe, "action");
            this.d = qqe;
            return this;
        }

        b(a aVar) {
        }
    }

    nqe(rqe rqe, pqe pqe, List list, qqe qqe, a aVar) {
        super(rqe, pqe, list);
        tqe.a(qqe, "action");
        this.e = qqe;
    }

    public static b f() {
        return new b(null);
    }

    public qqe e() {
        return this.e;
    }

    @Override // defpackage.lqe
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nqe.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.e.equals(((nqe) obj).e);
    }

    @Override // defpackage.lqe
    public int hashCode() {
        return this.e.hashCode() + (super.hashCode() * 31);
    }

    @Override // defpackage.lqe
    public String toString() {
        return String.format("interaction = %s %s", this.e, super.toString());
    }
}

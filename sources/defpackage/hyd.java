package defpackage;

import defpackage.pyd;
import java.util.List;

/* renamed from: hyd  reason: default package */
final class hyd extends pyd {
    private final List<oyd> a;

    /* access modifiers changed from: package-private */
    /* renamed from: hyd$b */
    public static final class b implements pyd.a {
        private List<oyd> a;

        b() {
        }

        @Override // defpackage.pyd.a
        public pyd.a a(List<oyd> list) {
            this.a = list;
            return this;
        }

        @Override // defpackage.pyd.a
        public pyd build() {
            return new hyd(this.a, null);
        }
    }

    hyd(List list, a aVar) {
        this.a = list;
    }

    @Override // defpackage.pyd
    public List<oyd> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pyd)) {
            return false;
        }
        List<oyd> list = this.a;
        List<oyd> b2 = ((pyd) obj).b();
        if (list != null) {
            return list.equals(b2);
        }
        if (b2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        List<oyd> list = this.a;
        return (list == null ? 0 : list.hashCode()) ^ 1000003;
    }

    public String toString() {
        return je.L0(je.V0("PodcastTopics{topics="), this.a, "}");
    }
}

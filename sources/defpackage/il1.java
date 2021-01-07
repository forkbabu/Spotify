package defpackage;

import defpackage.ml1;
import java.util.List;

/* renamed from: il1  reason: default package */
final class il1 extends ml1 {
    private final List<ol1> a;
    private final List<gl1> b;
    private final List<nl1> c;
    private final List<nl1> d;
    private final List<nl1> e;

    /* access modifiers changed from: package-private */
    /* renamed from: il1$b */
    public static final class b extends ml1.a {
        private List<ol1> a;
        private List<gl1> b;
        private List<nl1> c;
        private List<nl1> d;
        private List<nl1> e;

        b() {
        }

        @Override // defpackage.ml1.a
        public ml1.a a(List<gl1> list) {
            this.b = list;
            return this;
        }

        @Override // defpackage.ml1.a
        public ml1.a b(List<nl1> list) {
            this.c = list;
            return this;
        }

        @Override // defpackage.ml1.a
        public ml1 c() {
            return new il1(this.a, this.b, this.c, this.d, this.e, null);
        }

        @Override // defpackage.ml1.a
        public ml1.a d(List<nl1> list) {
            this.e = list;
            return this;
        }

        @Override // defpackage.ml1.a
        public ml1.a e(List<nl1> list) {
            this.d = list;
            return this;
        }

        @Override // defpackage.ml1.a
        public ml1.a f(List<ol1> list) {
            this.a = list;
            return this;
        }
    }

    il1(List list, List list2, List list3, List list4, List list5, a aVar) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
    }

    @Override // defpackage.ml1
    public List<gl1> a() {
        return this.b;
    }

    @Override // defpackage.ml1
    public List<nl1> b() {
        return this.c;
    }

    @Override // defpackage.ml1
    public List<nl1> d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ml1)) {
            return false;
        }
        ml1 ml1 = (ml1) obj;
        List<ol1> list = this.a;
        if (list != null ? list.equals(ml1.k()) : ml1.k() == null) {
            List<gl1> list2 = this.b;
            if (list2 != null ? list2.equals(ml1.a()) : ml1.a() == null) {
                List<nl1> list3 = this.c;
                if (list3 != null ? list3.equals(ml1.b()) : ml1.b() == null) {
                    List<nl1> list4 = this.d;
                    if (list4 != null ? list4.equals(ml1.j()) : ml1.j() == null) {
                        List<nl1> list5 = this.e;
                        if (list5 == null) {
                            if (ml1.d() == null) {
                                return true;
                            }
                        } else if (list5.equals(ml1.d())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        List<ol1> list = this.a;
        int i = 0;
        int hashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        List<gl1> list2 = this.b;
        int hashCode2 = (hashCode ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        List<nl1> list3 = this.c;
        int hashCode3 = (hashCode2 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
        List<nl1> list4 = this.d;
        int hashCode4 = (hashCode3 ^ (list4 == null ? 0 : list4.hashCode())) * 1000003;
        List<nl1> list5 = this.e;
        if (list5 != null) {
            i = list5.hashCode();
        }
        return hashCode4 ^ i;
    }

    @Override // defpackage.ml1
    public List<nl1> j() {
        return this.d;
    }

    @Override // defpackage.ml1
    public List<ol1> k() {
        return this.a;
    }

    public String toString() {
        StringBuilder V0 = je.V0("SearchResult{tracks=");
        V0.append(this.a);
        V0.append(", albums=");
        V0.append(this.b);
        V0.append(", artists=");
        V0.append(this.c);
        V0.append(", playlists=");
        V0.append(this.d);
        V0.append(", episodes=");
        return je.L0(V0, this.e, "}");
    }
}

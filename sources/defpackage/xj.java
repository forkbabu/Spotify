package defpackage;

/* renamed from: xj  reason: default package */
public interface xj {

    /* renamed from: xj$b */
    public static class b implements xj {
        private final long a;
        private final a b;

        public b(long j, long j2) {
            this.a = j;
            this.b = new a(j2 == 0 ? yj.c : new yj(0, j2));
        }

        @Override // defpackage.xj
        public a e(long j) {
            return this.b;
        }

        @Override // defpackage.xj
        public boolean h() {
            return false;
        }

        @Override // defpackage.xj
        public long j() {
            return this.a;
        }
    }

    a e(long j);

    boolean h();

    long j();

    /* renamed from: xj$a */
    public static final class a {
        public final yj a;
        public final yj b;

        public a(yj yjVar) {
            this.a = yjVar;
            this.b = yjVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.a.equals(aVar.a) || !this.b.equals(aVar.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public String toString() {
            String str;
            StringBuilder V0 = je.V0("[");
            V0.append(this.a);
            if (this.a.equals(this.b)) {
                str = "";
            } else {
                StringBuilder V02 = je.V0(", ");
                V02.append(this.b);
                str = V02.toString();
            }
            return je.I0(V0, str, "]");
        }

        public a(yj yjVar, yj yjVar2) {
            this.a = yjVar;
            this.b = yjVar2;
        }
    }
}

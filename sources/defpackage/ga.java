package defpackage;

import androidx.work.BackoffPolicy;
import androidx.work.WorkInfo;
import androidx.work.d;
import androidx.work.j;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: ga  reason: default package */
public final class ga {
    private static final String r = j.f("WorkSpec");
    public static final d1<List<c>, List<WorkInfo>> s = new a();
    public String a;
    public WorkInfo.State b = WorkInfo.State.ENQUEUED;
    public String c;
    public String d;
    public d e;
    public d f;
    public long g;
    public long h;
    public long i;
    public androidx.work.b j;
    public int k;
    public BackoffPolicy l;
    public long m;
    public long n;
    public long o;
    public long p;
    public boolean q;

    /* renamed from: ga$a */
    class a implements d1<List<c>, List<WorkInfo>> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.d1
        public List<WorkInfo> apply(List<c> list) {
            d dVar;
            List<c> list2 = list;
            if (list2 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list2.size());
            for (c cVar : list2) {
                List<d> list3 = cVar.f;
                if (list3 == null || list3.isEmpty()) {
                    dVar = d.c;
                } else {
                    dVar = cVar.f.get(0);
                }
                arrayList.add(new WorkInfo(UUID.fromString(cVar.a), cVar.b, cVar.c, cVar.e, dVar, cVar.d));
            }
            return arrayList;
        }
    }

    /* renamed from: ga$b */
    public static class b {
        public String a;
        public WorkInfo.State b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.b != bVar.b) {
                return false;
            }
            return this.a.equals(bVar.a);
        }

        public int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }
    }

    /* renamed from: ga$c */
    public static class c {
        public String a;
        public WorkInfo.State b;
        public d c;
        public int d;
        public List<String> e;
        public List<d> f;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.d != cVar.d) {
                return false;
            }
            String str = this.a;
            if (str == null ? cVar.a != null : !str.equals(cVar.a)) {
                return false;
            }
            if (this.b != cVar.b) {
                return false;
            }
            d dVar = this.c;
            if (dVar == null ? cVar.c != null : !dVar.equals(cVar.c)) {
                return false;
            }
            List<String> list = this.e;
            if (list == null ? cVar.e != null : !list.equals(cVar.e)) {
                return false;
            }
            List<d> list2 = this.f;
            List<d> list3 = cVar.f;
            if (list2 != null) {
                return list2.equals(list3);
            }
            if (list3 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            WorkInfo.State state = this.b;
            int hashCode2 = (hashCode + (state != null ? state.hashCode() : 0)) * 31;
            d dVar = this.c;
            int hashCode3 = (((hashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31) + this.d) * 31;
            List<String> list = this.e;
            int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
            List<d> list2 = this.f;
            if (list2 != null) {
                i = list2.hashCode();
            }
            return hashCode4 + i;
        }
    }

    public ga(String str, String str2) {
        d dVar = d.c;
        this.e = dVar;
        this.f = dVar;
        this.j = androidx.work.b.i;
        this.l = BackoffPolicy.EXPONENTIAL;
        this.m = 30000;
        this.p = -1;
        this.a = str;
        this.c = str2;
    }

    public long a() {
        long j2;
        boolean z = false;
        if (this.b == WorkInfo.State.ENQUEUED && this.k > 0) {
            if (this.l == BackoffPolicy.LINEAR) {
                z = true;
            }
            if (z) {
                j2 = this.m * ((long) this.k);
            } else {
                j2 = (long) Math.scalb((float) this.m, this.k - 1);
            }
            return Math.min(18000000L, j2) + this.n;
        }
        long j3 = 0;
        if (c()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j4 = this.n;
            long j5 = j4 == 0 ? currentTimeMillis + this.g : j4;
            long j6 = this.i;
            long j7 = this.h;
            if (j6 != j7) {
                z = true;
            }
            if (z) {
                if (j4 == 0) {
                    j3 = j6 * -1;
                }
                return j5 + j7 + j3;
            }
            if (j4 != 0) {
                j3 = j7;
            }
            return j5 + j3;
        }
        long j8 = this.n;
        if (j8 == 0) {
            j8 = System.currentTimeMillis();
        }
        return j8 + this.g;
    }

    public boolean b() {
        return !androidx.work.b.i.equals(this.j);
    }

    public boolean c() {
        return this.h != 0;
    }

    public void d(long j2) {
        if (j2 > 18000000) {
            j.c().h(r, "Backoff delay duration exceeds maximum value", new Throwable[0]);
            j2 = 18000000;
        }
        if (j2 < 10000) {
            j.c().h(r, "Backoff delay duration less than minimum value", new Throwable[0]);
            j2 = 10000;
        }
        this.m = j2;
    }

    public void e(long j2, long j3) {
        if (j2 < 900000) {
            j.c().h(r, String.format("Interval duration lesser than minimum allowed value; Changed to %s", 900000L), new Throwable[0]);
            j2 = 900000;
        }
        if (j3 < 300000) {
            j.c().h(r, String.format("Flex duration lesser than minimum allowed value; Changed to %s", 300000L), new Throwable[0]);
            j3 = 300000;
        }
        if (j3 > j2) {
            j.c().h(r, String.format("Flex duration greater than interval duration; Changed to %s", Long.valueOf(j2)), new Throwable[0]);
            j3 = j2;
        }
        this.h = j2;
        this.i = j3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ga)) {
            return false;
        }
        ga gaVar = (ga) obj;
        if (this.g != gaVar.g || this.h != gaVar.h || this.i != gaVar.i || this.k != gaVar.k || this.m != gaVar.m || this.n != gaVar.n || this.o != gaVar.o || this.p != gaVar.p || this.q != gaVar.q || !this.a.equals(gaVar.a) || this.b != gaVar.b || !this.c.equals(gaVar.c)) {
            return false;
        }
        String str = this.d;
        if (str == null ? gaVar.d != null : !str.equals(gaVar.d)) {
            return false;
        }
        if (this.e.equals(gaVar.e) && this.f.equals(gaVar.f) && this.j.equals(gaVar.j) && this.l == gaVar.l) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int Y0 = je.Y0(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
        String str = this.d;
        int hashCode = str != null ? str.hashCode() : 0;
        int hashCode2 = this.e.hashCode();
        int hashCode3 = this.f.hashCode();
        long j2 = this.g;
        long j3 = this.h;
        long j4 = this.i;
        int hashCode4 = this.j.hashCode();
        int hashCode5 = this.l.hashCode();
        long j5 = this.m;
        long j6 = this.n;
        long j7 = this.o;
        long j8 = this.p;
        return ((((((((((hashCode5 + ((((hashCode4 + ((((((((hashCode3 + ((hashCode2 + ((Y0 + hashCode) * 31)) * 31)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31)) * 31) + this.k) * 31)) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + (this.q ? 1 : 0);
    }

    public String toString() {
        return je.I0(je.V0("{WorkSpec: "), this.a, "}");
    }

    public ga(ga gaVar) {
        d dVar = d.c;
        this.e = dVar;
        this.f = dVar;
        this.j = androidx.work.b.i;
        this.l = BackoffPolicy.EXPONENTIAL;
        this.m = 30000;
        this.p = -1;
        this.a = gaVar.a;
        this.c = gaVar.c;
        this.b = gaVar.b;
        this.d = gaVar.d;
        this.e = new d(gaVar.e);
        this.f = new d(gaVar.f);
        this.g = gaVar.g;
        this.h = gaVar.h;
        this.i = gaVar.i;
        this.j = new androidx.work.b(gaVar.j);
        this.k = gaVar.k;
        this.l = gaVar.l;
        this.m = gaVar.m;
        this.n = gaVar.n;
        this.o = gaVar.o;
        this.p = gaVar.p;
        this.q = gaVar.q;
    }
}

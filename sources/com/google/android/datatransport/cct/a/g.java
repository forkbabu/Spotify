package com.google.android.datatransport.cct.a;

import com.google.android.datatransport.cct.a.l;
import java.util.List;

/* access modifiers changed from: package-private */
public final class g extends l {
    private final long a;
    private final long b;
    private final zzp c;
    private final Integer d;
    private final String e;
    private final List<k> f;
    private final zzu g;

    /* access modifiers changed from: package-private */
    public static final class a extends l.a {
        private Long a;
        private Long b;
        private zzp c;
        private Integer d;
        private String e;
        private List<k> f;
        private zzu g;

        a() {
        }

        @Override // com.google.android.datatransport.cct.a.l.a
        public l.a b(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.l.a
        public l.a c(zzp zzp) {
            this.c = zzp;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.l.a
        public l.a d(zzu zzu) {
            this.g = zzu;
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.datatransport.cct.a.l.a
        public l.a e(Integer num) {
            this.d = num;
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.datatransport.cct.a.l.a
        public l.a f(String str) {
            this.e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.l.a
        public l.a g(List<k> list) {
            this.f = list;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.l.a
        public l h() {
            String str = this.a == null ? " requestTimeMs" : "";
            if (this.b == null) {
                str = je.x0(str, " requestUptimeMs");
            }
            if (str.isEmpty()) {
                return new g(this.a.longValue(), this.b.longValue(), this.c, this.d, this.e, this.f, this.g);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.google.android.datatransport.cct.a.l.a
        public l.a i(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    /* synthetic */ g(long j, long j2, zzp zzp, Integer num, String str, List list, zzu zzu) {
        this.a = j;
        this.b = j2;
        this.c = zzp;
        this.d = num;
        this.e = str;
        this.f = list;
        this.g = zzu;
    }

    @Override // com.google.android.datatransport.cct.a.l
    public zzp b() {
        return this.c;
    }

    @Override // com.google.android.datatransport.cct.a.l
    public List<k> c() {
        return this.f;
    }

    @Override // com.google.android.datatransport.cct.a.l
    public Integer d() {
        return this.d;
    }

    @Override // com.google.android.datatransport.cct.a.l
    public String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        zzp zzp;
        Integer num;
        String str;
        List<k> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.a == lVar.g() && this.b == lVar.h() && ((zzp = this.c) != null ? zzp.equals(((g) lVar).c) : ((g) lVar).c == null) && ((num = this.d) != null ? num.equals(((g) lVar).d) : ((g) lVar).d == null) && ((str = this.e) != null ? str.equals(((g) lVar).e) : ((g) lVar).e == null) && ((list = this.f) != null ? list.equals(((g) lVar).f) : ((g) lVar).f == null)) {
            zzu zzu = this.g;
            if (zzu == null) {
                if (((g) lVar).g == null) {
                    return true;
                }
            } else if (zzu.equals(((g) lVar).g)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.a.l
    public zzu f() {
        return this.g;
    }

    @Override // com.google.android.datatransport.cct.a.l
    public long g() {
        return this.a;
    }

    @Override // com.google.android.datatransport.cct.a.l
    public long h() {
        return this.b;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        zzp zzp = this.c;
        int i2 = 0;
        int hashCode = (i ^ (zzp == null ? 0 : zzp.hashCode())) * 1000003;
        Integer num = this.d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<k> list = this.f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        zzu zzu = this.g;
        if (zzu != null) {
            i2 = zzu.hashCode();
        }
        return hashCode4 ^ i2;
    }

    public String toString() {
        StringBuilder V0 = je.V0("LogRequest{requestTimeMs=");
        V0.append(this.a);
        V0.append(", requestUptimeMs=");
        V0.append(this.b);
        V0.append(", clientInfo=");
        V0.append(this.c);
        V0.append(", logSource=");
        V0.append(this.d);
        V0.append(", logSourceName=");
        V0.append(this.e);
        V0.append(", logEvents=");
        V0.append(this.f);
        V0.append(", qosTier=");
        V0.append(this.g);
        V0.append("}");
        return V0.toString();
    }
}

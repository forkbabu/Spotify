package defpackage;

import defpackage.pg;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: jg  reason: default package */
public final class jg extends pg {
    private final String a;
    private final Integer b;
    private final og c;
    private final long d;
    private final long e;
    private final Map<String, String> f;

    /* access modifiers changed from: package-private */
    /* renamed from: jg$b */
    public static final class b extends pg.a {
        private String a;
        private Integer b;
        private og c;
        private Long d;
        private Long e;
        private Map<String, String> f;

        b() {
        }

        @Override // defpackage.pg.a
        public pg d() {
            String str = this.a == null ? " transportName" : "";
            if (this.c == null) {
                str = je.x0(str, " encodedPayload");
            }
            if (this.d == null) {
                str = je.x0(str, " eventMillis");
            }
            if (this.e == null) {
                str = je.x0(str, " uptimeMillis");
            }
            if (this.f == null) {
                str = je.x0(str, " autoMetadata");
            }
            if (str.isEmpty()) {
                return new jg(this.a, this.b, this.c, this.d.longValue(), this.e.longValue(), this.f, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.pg.a
        public Map<String, String> e() {
            Map<String, String> map = this.f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // defpackage.pg.a
        public pg.a f(Integer num) {
            this.b = num;
            return this;
        }

        @Override // defpackage.pg.a
        public pg.a g(og ogVar) {
            if (ogVar != null) {
                this.c = ogVar;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        @Override // defpackage.pg.a
        public pg.a h(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // defpackage.pg.a
        public pg.a i(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        @Override // defpackage.pg.a
        public pg.a j(long j) {
            this.e = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: protected */
        public pg.a k(Map<String, String> map) {
            this.f = map;
            return this;
        }
    }

    jg(String str, Integer num, og ogVar, long j, long j2, Map map, a aVar) {
        this.a = str;
        this.b = num;
        this.c = ogVar;
        this.d = j;
        this.e = j2;
        this.f = map;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.pg
    public Map<String, String> c() {
        return this.f;
    }

    @Override // defpackage.pg
    public Integer d() {
        return this.b;
    }

    @Override // defpackage.pg
    public og e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pg)) {
            return false;
        }
        pg pgVar = (pg) obj;
        if (!this.a.equals(pgVar.j()) || ((num = this.b) != null ? !num.equals(pgVar.d()) : pgVar.d() != null) || !this.c.equals(pgVar.e()) || this.d != pgVar.f() || this.e != pgVar.k() || !this.f.equals(pgVar.c())) {
            return false;
        }
        return true;
    }

    @Override // defpackage.pg
    public long f() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j = this.d;
        long j2 = this.e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f.hashCode();
    }

    @Override // defpackage.pg
    public String j() {
        return this.a;
    }

    @Override // defpackage.pg
    public long k() {
        return this.e;
    }

    public String toString() {
        StringBuilder V0 = je.V0("EventInternal{transportName=");
        V0.append(this.a);
        V0.append(", code=");
        V0.append(this.b);
        V0.append(", encodedPayload=");
        V0.append(this.c);
        V0.append(", eventMillis=");
        V0.append(this.d);
        V0.append(", uptimeMillis=");
        V0.append(this.e);
        V0.append(", autoMetadata=");
        return je.M0(V0, this.f, "}");
    }
}

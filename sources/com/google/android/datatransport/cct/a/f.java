package com.google.android.datatransport.cct.a;

import com.google.android.datatransport.cct.a.k;
import java.util.Arrays;

/* access modifiers changed from: package-private */
public final class f extends k {
    private final long a;
    private final Integer b;
    private final long c;
    private final byte[] d;
    private final String e;
    private final long f;
    private final zzt g;

    /* access modifiers changed from: package-private */
    public static final class a extends k.a {
        private Long a;
        private Integer b;
        private Long c;
        private byte[] d;
        private String e;
        private Long f;
        private zzt g;

        a() {
        }

        @Override // com.google.android.datatransport.cct.a.k.a
        public k.a a(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.k.a
        public k.a b(zzt zzt) {
            this.g = zzt;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.k.a
        public k.a c(Integer num) {
            this.b = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.k.a
        public k d() {
            String str = this.a == null ? " eventTimeMs" : "";
            if (this.c == null) {
                str = je.x0(str, " eventUptimeMs");
            }
            if (this.f == null) {
                str = je.x0(str, " timezoneOffsetSeconds");
            }
            if (str.isEmpty()) {
                return new f(this.a.longValue(), this.b, this.c.longValue(), this.d, this.e, this.f.longValue(), this.g);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.google.android.datatransport.cct.a.k.a
        public k.a e(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.k.a
        public k.a f(long j) {
            this.f = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: package-private */
        public k.a g(String str) {
            this.e = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public k.a h(byte[] bArr) {
            this.d = bArr;
            return this;
        }
    }

    /* synthetic */ f(long j, Integer num, long j2, byte[] bArr, String str, long j3, zzt zzt) {
        this.a = j;
        this.b = num;
        this.c = j2;
        this.d = bArr;
        this.e = str;
        this.f = j3;
        this.g = zzt;
    }

    @Override // com.google.android.datatransport.cct.a.k
    public Integer c() {
        return this.b;
    }

    @Override // com.google.android.datatransport.cct.a.k
    public long d() {
        return this.a;
    }

    @Override // com.google.android.datatransport.cct.a.k
    public long e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.a == kVar.d() && ((num = this.b) != null ? num.equals(((f) kVar).b) : ((f) kVar).b == null) && this.c == kVar.e()) {
            if (Arrays.equals(this.d, kVar instanceof f ? ((f) kVar).d : kVar.g()) && ((str = this.e) != null ? str.equals(((f) kVar).e) : ((f) kVar).e == null) && this.f == kVar.i()) {
                zzt zzt = this.g;
                if (zzt == null) {
                    if (((f) kVar).g == null) {
                        return true;
                    }
                } else if (zzt.equals(((f) kVar).g)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.a.k
    public zzt f() {
        return this.g;
    }

    @Override // com.google.android.datatransport.cct.a.k
    public byte[] g() {
        return this.d;
    }

    @Override // com.google.android.datatransport.cct.a.k
    public String h() {
        return this.e;
    }

    public int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int i2 = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        long j2 = this.c;
        int hashCode2 = (((((i ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j3 = this.f;
        int i3 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        zzt zzt = this.g;
        if (zzt != null) {
            i2 = zzt.hashCode();
        }
        return i3 ^ i2;
    }

    @Override // com.google.android.datatransport.cct.a.k
    public long i() {
        return this.f;
    }

    public String toString() {
        StringBuilder V0 = je.V0("LogEvent{eventTimeMs=");
        V0.append(this.a);
        V0.append(", eventCode=");
        V0.append(this.b);
        V0.append(", eventUptimeMs=");
        V0.append(this.c);
        V0.append(", sourceExtension=");
        V0.append(Arrays.toString(this.d));
        V0.append(", sourceExtensionJsonProto3=");
        V0.append(this.e);
        V0.append(", timezoneOffsetSeconds=");
        V0.append(this.f);
        V0.append(", networkConnectionInfo=");
        V0.append(this.g);
        V0.append("}");
        return V0.toString();
    }
}

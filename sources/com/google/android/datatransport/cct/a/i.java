package com.google.android.datatransport.cct.a;

import com.google.android.datatransport.cct.a.zzt;

/* access modifiers changed from: package-private */
public final class i extends zzt {
    private final zzt.zzc a;
    private final zzt.zzb b;

    /* access modifiers changed from: package-private */
    public static final class a extends zzt.a {
        private zzt.zzc a;
        private zzt.zzb b;

        a() {
        }

        @Override // com.google.android.datatransport.cct.a.zzt.a
        public zzt.a a(zzt.zzb zzb) {
            this.b = zzb;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.zzt.a
        public zzt.a b(zzt.zzc zzc) {
            this.a = zzc;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.zzt.a
        public zzt c() {
            return new i(this.a, this.b);
        }
    }

    /* synthetic */ i(zzt.zzc zzc, zzt.zzb zzb) {
        this.a = zzc;
        this.b = zzb;
    }

    @Override // com.google.android.datatransport.cct.a.zzt
    public zzt.zzb b() {
        return this.b;
    }

    @Override // com.google.android.datatransport.cct.a.zzt
    public zzt.zzc c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzt)) {
            return false;
        }
        zzt.zzc zzc = this.a;
        if (zzc != null ? zzc.equals(((i) obj).a) : ((i) obj).a == null) {
            zzt.zzb zzb = this.b;
            if (zzb == null) {
                if (((i) obj).b == null) {
                    return true;
                }
            } else if (zzb.equals(((i) obj).b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        zzt.zzc zzc = this.a;
        int i = 0;
        int hashCode = ((zzc == null ? 0 : zzc.hashCode()) ^ 1000003) * 1000003;
        zzt.zzb zzb = this.b;
        if (zzb != null) {
            i = zzb.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("NetworkConnectionInfo{networkType=");
        V0.append(this.a);
        V0.append(", mobileSubtype=");
        V0.append(this.b);
        V0.append("}");
        return V0.toString();
    }
}

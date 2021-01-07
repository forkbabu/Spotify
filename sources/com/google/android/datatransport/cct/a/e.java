package com.google.android.datatransport.cct.a;

import com.google.android.datatransport.cct.a.zzp;

/* access modifiers changed from: package-private */
public final class e extends zzp {
    private final zzp.zzb a;
    private final a b;

    /* access modifiers changed from: package-private */
    public static final class a extends zzp.a {
        private zzp.zzb a;
        private a b;

        a() {
        }

        @Override // com.google.android.datatransport.cct.a.zzp.a
        public zzp.a a(a aVar) {
            this.b = aVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.zzp.a
        public zzp.a b(zzp.zzb zzb) {
            this.a = zzb;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.zzp.a
        public zzp c() {
            return new e(this.a, this.b);
        }
    }

    /* synthetic */ e(zzp.zzb zzb, a aVar) {
        this.a = zzb;
        this.b = aVar;
    }

    @Override // com.google.android.datatransport.cct.a.zzp
    public a b() {
        return this.b;
    }

    @Override // com.google.android.datatransport.cct.a.zzp
    public zzp.zzb c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzp)) {
            return false;
        }
        zzp.zzb zzb = this.a;
        if (zzb != null ? zzb.equals(((e) obj).a) : ((e) obj).a == null) {
            a aVar = this.b;
            if (aVar == null) {
                if (((e) obj).b == null) {
                    return true;
                }
            } else if (aVar.equals(((e) obj).b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        zzp.zzb zzb = this.a;
        int i = 0;
        int hashCode = ((zzb == null ? 0 : zzb.hashCode()) ^ 1000003) * 1000003;
        a aVar = this.b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ClientInfo{clientType=");
        V0.append(this.a);
        V0.append(", androidClientInfo=");
        V0.append(this.b);
        V0.append("}");
        return V0.toString();
    }
}

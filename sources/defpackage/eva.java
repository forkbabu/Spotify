package defpackage;

import com.google.common.base.Optional;
import com.spotify.searchview.assistedcuration.proto.DrillDownViewResponse;
import com.spotify.searchview.assistedcuration.proto.EntityType;

/* access modifiers changed from: package-private */
/* renamed from: eva  reason: default package */
public final class eva extends gva {
    private final String a;
    private final String b;
    private final EntityType c;
    private final Optional<Integer> d;
    private final DrillDownViewResponse e;

    eva(String str, String str2, EntityType entityType, Optional<Integer> optional, DrillDownViewResponse drillDownViewResponse) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (entityType != null) {
                    this.c = entityType;
                    if (optional != null) {
                        this.d = optional;
                        if (drillDownViewResponse != null) {
                            this.e = drillDownViewResponse;
                            return;
                        }
                        throw new NullPointerException("Null result");
                    }
                    throw new NullPointerException("Null lastOffset");
                }
                throw new NullPointerException("Null entityType");
            }
            throw new NullPointerException("Null query");
        }
        throw new NullPointerException("Null requestId");
    }

    @Override // defpackage.gva
    public EntityType b() {
        return this.c;
    }

    @Override // defpackage.gva
    public Optional<Integer> c() {
        return this.d;
    }

    @Override // defpackage.gva
    public String d() {
        return this.b;
    }

    @Override // defpackage.gva
    public String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gva)) {
            return false;
        }
        gva gva = (gva) obj;
        if (!this.a.equals(gva.e()) || !this.b.equals(gva.d()) || !this.c.equals(gva.b()) || !this.d.equals(gva.c()) || !this.e.equals(gva.f())) {
            return false;
        }
        return true;
    }

    @Override // defpackage.gva
    public DrillDownViewResponse f() {
        return this.e;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("DrillDownResponse{requestId=");
        V0.append(this.a);
        V0.append(", query=");
        V0.append(this.b);
        V0.append(", entityType=");
        V0.append(this.c);
        V0.append(", lastOffset=");
        V0.append(this.d);
        V0.append(", result=");
        V0.append(this.e);
        V0.append("}");
        return V0.toString();
    }
}

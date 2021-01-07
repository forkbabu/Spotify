package defpackage;

import com.google.common.base.Optional;
import com.spotify.searchview.proto.DrillDownViewResponse;
import com.spotify.searchview.proto.EntityType;

/* access modifiers changed from: package-private */
/* renamed from: uta  reason: default package */
public final class uta extends gua {
    private final String a;
    private final String b;
    private final EntityType c;
    private final Optional<Integer> d;
    private final DrillDownViewResponse e;

    uta(String str, String str2, EntityType entityType, Optional<Integer> optional, DrillDownViewResponse drillDownViewResponse) {
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
                throw new NullPointerException("Null drilldownType");
            }
            throw new NullPointerException("Null query");
        }
        throw new NullPointerException("Null requestId");
    }

    @Override // defpackage.gua
    public EntityType b() {
        return this.c;
    }

    @Override // defpackage.gua
    public Optional<Integer> c() {
        return this.d;
    }

    @Override // defpackage.gua
    public String d() {
        return this.b;
    }

    @Override // defpackage.gua
    public String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gua)) {
            return false;
        }
        gua gua = (gua) obj;
        if (!this.a.equals(gua.e()) || !this.b.equals(gua.d()) || !this.c.equals(gua.b()) || !this.d.equals(gua.c()) || !this.e.equals(gua.f())) {
            return false;
        }
        return true;
    }

    @Override // defpackage.gua
    public DrillDownViewResponse f() {
        return this.e;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("SearchDrilldownResponse{requestId=");
        V0.append(this.a);
        V0.append(", query=");
        V0.append(this.b);
        V0.append(", drilldownType=");
        V0.append(this.c);
        V0.append(", lastOffset=");
        V0.append(this.d);
        V0.append(", result=");
        V0.append(this.e);
        V0.append("}");
        return V0.toString();
    }
}

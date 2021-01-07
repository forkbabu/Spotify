package defpackage;

import com.google.common.collect.ImmutableSet;
import defpackage.d39;
import defpackage.d39.b;
import java.lang.Enum;

/* access modifiers changed from: package-private */
/* renamed from: w29  reason: default package */
public final class w29<T extends Enum<T>, D extends d39.b<T>> extends d39.d<T, D> {
    private final ImmutableSet<T> a;
    private final d39.f b;
    private final d39.e<T, D> c;

    w29(ImmutableSet<T> immutableSet, d39.f fVar, d39.e<T, D> eVar) {
        if (immutableSet != null) {
            this.a = immutableSet;
            if (fVar != null) {
                this.b = fVar;
                this.c = eVar;
                return;
            }
            throw new NullPointerException("Null viewTypeCreator");
        }
        throw new NullPointerException("Null types");
    }

    @Override // defpackage.d39.d
    public ImmutableSet<T> b() {
        return this.a;
    }

    @Override // defpackage.d39.d
    public d39.e<T, D> c() {
        return this.c;
    }

    @Override // defpackage.d39.d
    public d39.f d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d39.d)) {
            return false;
        }
        d39.d dVar = (d39.d) obj;
        if (this.a.equals(dVar.b()) && this.b.equals(dVar.d())) {
            d39.e<T, D> eVar = this.c;
            if (eVar == null) {
                if (dVar.c() == null) {
                    return true;
                }
            } else if (eVar.equals(dVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        d39.e<T, D> eVar = this.c;
        return hashCode ^ (eVar == null ? 0 : eVar.hashCode());
    }

    public String toString() {
        StringBuilder V0 = je.V0("ViewType{types=");
        V0.append(this.a);
        V0.append(", viewTypeCreator=");
        V0.append(this.b);
        V0.append(", viewTypeBinder=");
        V0.append(this.c);
        V0.append("}");
        return V0.toString();
    }
}

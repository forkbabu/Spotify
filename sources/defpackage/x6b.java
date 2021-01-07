package defpackage;

import com.google.common.base.Optional;

/* access modifiers changed from: package-private */
/* renamed from: x6b  reason: default package */
public final class x6b<T> extends d7b<T> {
    private final String a;
    private final String b;
    private final Optional<T> c;
    private final Optional<Throwable> d;

    x6b(String str, String str2, Optional<T> optional, Optional<Throwable> optional2) {
        if (str != null) {
            this.a = str;
            this.b = str2;
            this.c = optional;
            this.d = optional2;
            return;
        }
        throw new NullPointerException("Null query");
    }

    @Override // defpackage.d7b
    public Optional<Throwable> b() {
        return this.d;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d7b)) {
            return false;
        }
        d7b d7b = (d7b) obj;
        if (!this.a.equals(d7b.g()) || ((str = this.b) != null ? !str.equals(d7b.h()) : d7b.h() != null) || !this.c.equals(d7b.i()) || !this.d.equals(d7b.b())) {
            return false;
        }
        return true;
    }

    @Override // defpackage.d7b
    public String g() {
        return this.a;
    }

    @Override // defpackage.d7b
    public String h() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return ((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    @Override // defpackage.d7b
    public Optional<T> i() {
        return this.c;
    }

    public String toString() {
        StringBuilder V0 = je.V0("SearchResponseHolder{query=");
        V0.append(this.a);
        V0.append(", requestId=");
        V0.append(this.b);
        V0.append(", results=");
        V0.append(this.c);
        V0.append(", error=");
        return je.F0(V0, this.d, "}");
    }
}

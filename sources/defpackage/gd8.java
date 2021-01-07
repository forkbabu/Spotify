package defpackage;

import com.google.common.base.Optional;

/* renamed from: gd8  reason: default package */
abstract class gd8 extends wd8 {
    private final td8 a;
    private final Optional<String> b;
    private final boolean c;

    gd8(td8 td8, Optional<String> optional, boolean z) {
        if (td8 != null) {
            this.a = td8;
            if (optional != null) {
                this.b = optional;
                this.c = z;
                return;
            }
            throw new NullPointerException("Null query");
        }
        throw new NullPointerException("Null baseParams");
    }

    @Override // defpackage.wd8
    public td8 a() {
        return this.a;
    }

    @Override // defpackage.wd8
    public Optional<String> b() {
        return this.b;
    }

    @Override // defpackage.wd8
    public boolean c() {
        return this.c;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wd8)) {
            return false;
        }
        wd8 wd8 = (wd8) obj;
        if (!this.a.equals(wd8.a()) || !this.b.equals(wd8.b()) || this.c != wd8.c()) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("SearchMainFragmentParams{baseParams=");
        V0.append(this.a);
        V0.append(", query=");
        V0.append(this.b);
        V0.append(", startPlayback=");
        return je.P0(V0, this.c, "}");
    }
}

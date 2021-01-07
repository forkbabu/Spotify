package defpackage;

import com.google.common.base.Optional;

/* renamed from: tyc  reason: default package */
abstract class tyc extends szc {
    private final m8e a;
    private final Optional<l8e> b;

    tyc(m8e m8e, Optional<l8e> optional) {
        if (m8e != null) {
            this.a = m8e;
            if (optional != null) {
                this.b = optional;
                return;
            }
            throw new NullPointerException("Null stickerMedia");
        }
        throw new NullPointerException("Null backgroundMedia");
    }

    @Override // defpackage.szc
    public m8e a() {
        return this.a;
    }

    @Override // defpackage.szc
    public Optional<l8e> c() {
        return this.b;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof szc)) {
            return false;
        }
        szc szc = (szc) obj;
        if (!this.a.equals(szc.a()) || !this.b.equals(szc.c())) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("SharePreviewData{backgroundMedia=");
        V0.append(this.a);
        V0.append(", stickerMedia=");
        return je.F0(V0, this.b, "}");
    }
}

package com.spotify.music.slate.model;

abstract class e extends t {
    private final i3d a;
    private final u b;

    e(i3d i3d, u uVar) {
        if (i3d != null) {
            this.a = i3d;
            if (uVar != null) {
                this.b = uVar;
                return;
            }
            throw new NullPointerException("Null negativeAction");
        }
        throw new NullPointerException("Null content");
    }

    @Override // com.spotify.music.slate.model.t
    public i3d a() {
        return this.a;
    }

    @Override // com.spotify.music.slate.model.t
    public u c() {
        return this.b;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (!this.a.equals(tVar.a()) || !this.b.equals(tVar.c())) {
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
        StringBuilder V0 = je.V0("SlateModalViewModel{content=");
        V0.append(this.a);
        V0.append(", negativeAction=");
        V0.append(this.b);
        V0.append("}");
        return V0.toString();
    }
}

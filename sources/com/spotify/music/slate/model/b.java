package com.spotify.music.slate.model;

abstract class b extends q {
    private final o a;
    private final n b;

    b(o oVar, n nVar) {
        if (oVar != null) {
            this.a = oVar;
            this.b = nVar;
            return;
        }
        throw new NullPointerException("Null imageSource");
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.slate.model.q
    public n b() {
        return this.b;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.a.equals(qVar.f())) {
            n nVar = this.b;
            if (nVar == null) {
                if (qVar.b() == null) {
                    return true;
                }
            } else if (nVar.equals(qVar.b())) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.slate.model.q
    public o f() {
        return this.a;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        n nVar = this.b;
        return hashCode ^ (nVar == null ? 0 : nVar.hashCode());
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("PicassoImage{imageSource=");
        V0.append(this.a);
        V0.append(", effect=");
        V0.append(this.b);
        V0.append("}");
        return V0.toString();
    }
}

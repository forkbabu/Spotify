package com.spotify.music.slate.model;

abstract class d extends s {
    private final int a;

    d(int i) {
        this.a = i;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.slate.model.s
    public int e() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s) || this.a != ((s) obj).e()) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.a ^ 1000003;
    }

    @Override // java.lang.Object
    public String toString() {
        return je.B0(je.V0("ResourceText{resourceId="), this.a, "}");
    }
}

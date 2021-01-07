package com.spotify.music.slate.model;

abstract class c extends r {
    private final int a;

    c(int i) {
        this.a = i;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.slate.model.r
    public int a() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r) || this.a != ((r) obj).a()) {
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
        return je.B0(je.V0("ResourceImageSource{resourceId="), this.a, "}");
    }
}

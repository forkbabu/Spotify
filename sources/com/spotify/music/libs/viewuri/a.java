package com.spotify.music.libs.viewuri;

/* access modifiers changed from: package-private */
public abstract class a extends c {
    private final String a;

    a(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null viewUri");
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.libs.viewuri.c
    public String c() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            return this.a.equals(((c) obj).c());
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}

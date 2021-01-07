package com.spotify.music.libs.thestage.config;

abstract class a extends c {
    private final TheStageUri a;

    a(TheStageUri theStageUri) {
        if (theStageUri != null) {
            this.a = theStageUri;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    @Override // com.spotify.music.libs.thestage.config.c
    public TheStageUri b() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            return this.a.equals(((c) obj).b());
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("TheStageViewConfig{uri=");
        V0.append(this.a);
        V0.append("}");
        return V0.toString();
    }
}

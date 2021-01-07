package com.spotify.voice.api.model;

/* access modifiers changed from: package-private */
public final class c extends i {
    private final String j;

    c(String str) {
        if (str != null) {
            this.j = str;
            return;
        }
        throw new NullPointerException("Null type");
    }

    @Override // com.spotify.voice.api.model.i
    public String b() {
        return this.j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            return this.j.equals(((i) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.j.hashCode() ^ 1000003;
    }

    public String toString() {
        return je.I0(je.V0("ErrorType{type="), this.j, "}");
    }
}

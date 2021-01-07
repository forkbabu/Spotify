package com.spotify.music.utterancesuggestions;

import kotlin.jvm.internal.h;

public final class f {
    private final String a;

    public f(String str) {
        h.e(str, "utterance");
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof f) && h.a(this.a, ((f) obj).a);
        }
        return true;
    }

    public int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return je.I0(je.V0("Utterance(utterance="), this.a, ")");
    }
}

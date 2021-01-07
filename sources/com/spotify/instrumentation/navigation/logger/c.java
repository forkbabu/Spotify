package com.spotify.instrumentation.navigation.logger;

import kotlin.jvm.internal.h;

public final class c {
    private final String a;

    public c(String str) {
        h.e(str, "id");
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof c) && h.a(this.a, ((c) obj).a);
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
        return je.I0(je.V0("InteractionId(id="), this.a, ")");
    }
}

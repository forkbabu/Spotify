package com.spotify.music.carmodehome.model;

import kotlin.jvm.internal.h;

public final class b {
    private final String a;
    private final String b;
    private final c c;

    public b(String str, String str2, c cVar) {
        h.e(str, "title");
        h.e(str2, "contextUri");
        h.e(cVar, "image");
        this.a = str;
        this.b = str2;
        this.c = cVar;
    }

    public final String a() {
        return this.b;
    }

    public final c b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return h.a(this.a, bVar.a) && h.a(this.b, bVar.b) && h.a(this.c, bVar.c);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        c cVar = this.c;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("HomeShelfItem(title=");
        V0.append(this.a);
        V0.append(", contextUri=");
        V0.append(this.b);
        V0.append(", image=");
        V0.append(this.c);
        V0.append(")");
        return V0.toString();
    }
}

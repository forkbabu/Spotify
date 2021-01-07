package com.spotify.music.features.yourlibraryx.contextmenu;

import kotlin.jvm.internal.h;

public final class a {
    private final String a;
    private final String b;
    private final ContextItemType c;

    public a(String str, String str2, ContextItemType contextItemType) {
        h.e(str, "uri");
        h.e(str2, "title");
        h.e(contextItemType, "type");
        this.a = str;
        this.b = str2;
        this.c = contextItemType;
    }

    public final String a() {
        return this.b;
    }

    public final ContextItemType b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return h.a(this.a, aVar.a) && h.a(this.b, aVar.b) && h.a(this.c, aVar.c);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        ContextItemType contextItemType = this.c;
        if (contextItemType != null) {
            i = contextItemType.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ContextMenuItem(uri=");
        V0.append(this.a);
        V0.append(", title=");
        V0.append(this.b);
        V0.append(", type=");
        V0.append(this.c);
        V0.append(")");
        return V0.toString();
    }
}

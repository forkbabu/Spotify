package com.spotify.music.carmodehome.model;

import java.util.List;
import kotlin.jvm.internal.h;

public final class HomeShelf {
    private final String a;
    private final String b;
    private final List<b> c;
    private final Type d;

    public enum Type {
        CARD_GRID,
        SHORTCUT_LIST
    }

    public HomeShelf(String str, String str2, List<b> list, Type type) {
        h.e(str, "id");
        h.e(str2, "title");
        h.e(list, "items");
        h.e(type, "type");
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = type;
    }

    public final String a() {
        return this.a;
    }

    public final List<b> b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final Type d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeShelf)) {
            return false;
        }
        HomeShelf homeShelf = (HomeShelf) obj;
        return h.a(this.a, homeShelf.a) && h.a(this.b, homeShelf.b) && h.a(this.c, homeShelf.c) && h.a(this.d, homeShelf.d);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<b> list = this.c;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        Type type = this.d;
        if (type != null) {
            i = type.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("HomeShelf(id=");
        V0.append(this.a);
        V0.append(", title=");
        V0.append(this.b);
        V0.append(", items=");
        V0.append(this.c);
        V0.append(", type=");
        V0.append(this.d);
        V0.append(")");
        return V0.toString();
    }
}

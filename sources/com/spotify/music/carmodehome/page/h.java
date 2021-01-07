package com.spotify.music.carmodehome.page;

import com.spotify.music.carmodehome.model.HomeShelf;
import java.util.List;

public final class h {
    private final List<HomeShelf> a;
    private final String b;
    private final String c;

    public h(List list, String str, String str2, int i) {
        int i2 = i & 2;
        int i3 = i & 4;
        kotlin.jvm.internal.h.e(list, "shelves");
        this.a = list;
        this.b = null;
        this.c = null;
    }

    public static h a(h hVar, List list, String str, String str2, int i) {
        if ((i & 1) != 0) {
            list = hVar.a;
        }
        if ((i & 2) != 0) {
            str = hVar.b;
        }
        if ((i & 4) != 0) {
            str2 = hVar.c;
        }
        hVar.getClass();
        kotlin.jvm.internal.h.e(list, "shelves");
        return new h(list, str, str2);
    }

    public final String b() {
        return this.c;
    }

    public final List<HomeShelf> c() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.h.a(this.a, hVar.a) && kotlin.jvm.internal.h.a(this.b, hVar.b) && kotlin.jvm.internal.h.a(this.c, hVar.c);
    }

    public int hashCode() {
        List<HomeShelf> list = this.a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("CarModeHomeViewModel(shelves=");
        V0.append(this.a);
        V0.append(", title=");
        V0.append(this.b);
        V0.append(", gradientImageUri=");
        return je.I0(V0, this.c, ")");
    }

    public h(List<HomeShelf> list, String str, String str2) {
        kotlin.jvm.internal.h.e(list, "shelves");
        this.a = list;
        this.b = str;
        this.c = str2;
    }
}

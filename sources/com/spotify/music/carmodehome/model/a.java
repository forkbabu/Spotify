package com.spotify.music.carmodehome.model;

import java.util.List;
import kotlin.jvm.internal.h;

public final class a {
    private final List<HomeShelf> a;

    public a(List<HomeShelf> list) {
        h.e(list, "homeShelves");
        this.a = list;
    }

    public final List<HomeShelf> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && h.a(this.a, ((a) obj).a);
        }
        return true;
    }

    public int hashCode() {
        List<HomeShelf> list = this.a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        return je.L0(je.V0("HomeContent(homeShelves="), this.a, ")");
    }
}

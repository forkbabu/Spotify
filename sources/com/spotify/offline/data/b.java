package com.spotify.offline.data;

import java.util.List;
import kotlin.jvm.internal.h;

public final class b {
    private final List<a> a;

    public b(List<a> list) {
        h.e(list, "resources");
        this.a = list;
    }

    public final List<a> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && h.a(this.a, ((b) obj).a);
        }
        return true;
    }

    public int hashCode() {
        List<a> list = this.a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        return je.L0(je.V0("OfflineResources(resources="), this.a, ")");
    }
}

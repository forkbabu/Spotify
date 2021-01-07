package com.spotify.libs.onboarding.allboarding.search;

import com.spotify.allboarding.model.v1.proto.SearchItem;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.h;

public final class f {
    private final String a;
    private final List<SearchItem> b;
    private final boolean c;

    public f() {
        this(null, null, false, 7);
    }

    public f(String str, List<SearchItem> list, boolean z) {
        h.e(str, "query");
        h.e(list, "searchResults");
        this.a = str;
        this.b = list;
        this.c = z;
    }

    public static f a(f fVar, String str, List list, boolean z, int i) {
        if ((i & 1) != 0) {
            str = fVar.a;
        }
        List<SearchItem> list2 = (i & 2) != 0 ? fVar.b : null;
        if ((i & 4) != 0) {
            z = fVar.c;
        }
        h.e(str, "query");
        h.e(list2, "searchResults");
        return new f(str, list2, z);
    }

    public final boolean b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public final List<SearchItem> d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return h.a(this.a, fVar.a) && h.a(this.b, fVar.b) && this.c == fVar.c;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<SearchItem> list = this.b;
        if (list != null) {
            i = list.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ViewState(query=");
        V0.append(this.a);
        V0.append(", searchResults=");
        V0.append(this.b);
        V0.append(", error=");
        return je.P0(V0, this.c, ")");
    }

    public f(String str, List list, boolean z, int i) {
        EmptyList emptyList = null;
        String str2 = (i & 1) != 0 ? "" : null;
        emptyList = (i & 2) != 0 ? EmptyList.a : emptyList;
        z = (i & 4) != 0 ? false : z;
        h.e(str2, "query");
        h.e(emptyList, "searchResults");
        this.a = str2;
        this.b = emptyList;
        this.c = z;
    }
}

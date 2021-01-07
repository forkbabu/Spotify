package com.spotify.music.features.yourlibraryx.view;

import com.spotify.music.features.yourlibraryx.domain.a;
import java.util.List;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class j {
    private final jnf a;
    private final a b;
    private final List<y> c;
    private final List<y> d;
    private final String e;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.spotify.music.features.yourlibraryx.view.y> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.spotify.music.features.yourlibraryx.view.y> */
    /* JADX WARN: Multi-variable type inference failed */
    public j(a aVar, List<? extends y> list, List<? extends y> list2, String str) {
        jnf jnf;
        h.e(aVar, "subscriptionContext");
        h.e(list, "header");
        h.e(list2, "items");
        h.e(str, "playingUri");
        this.b = aVar;
        this.c = list;
        this.d = list2;
        this.e = str;
        if (list.isEmpty()) {
            jnf jnf2 = jnf.n;
            jnf = jnf.f;
        } else {
            jnf = knf.e(0, list.size());
        }
        this.a = jnf;
    }

    public final List<y> a() {
        return this.c;
    }

    public final jnf b() {
        return this.a;
    }

    public final List<y> c() {
        return this.d;
    }

    public final a d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return h.a(this.b, jVar.b) && h.a(this.c, jVar.c) && h.a(this.d, jVar.d) && h.a(this.e, jVar.e);
    }

    public int hashCode() {
        a aVar = this.b;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        List<y> list = this.c;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<y> list2 = this.d;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str = this.e;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Update(subscriptionContext=");
        V0.append(this.b);
        V0.append(", header=");
        V0.append(this.c);
        V0.append(", items=");
        V0.append(this.d);
        V0.append(", playingUri=");
        return je.I0(V0, this.e, ")");
    }
}

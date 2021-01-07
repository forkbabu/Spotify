package com.spotify.mobile.android.share.menu.preview.api;

import java.util.Set;
import kotlin.jvm.internal.h;

public final class a {
    private final String a;
    private final Set<ShareCapability> b;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Set<? extends com.spotify.mobile.android.share.menu.preview.api.ShareCapability> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(String str, Set<? extends ShareCapability> set) {
        h.e(str, "id");
        h.e(set, "capabilities");
        this.a = str;
        this.b = set;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return h.a(this.a, ((a) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("ShareDestination(id=");
        V0.append(this.a);
        V0.append(", capabilities=");
        V0.append(this.b);
        V0.append(")");
        return V0.toString();
    }
}

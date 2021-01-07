package com.spotify.music.features.notificationsettings.common;

import java.util.Set;
import kotlin.jvm.internal.h;

public final class a {
    private final String a;
    private final String b;
    private final String c;
    private Set<Channel> d;

    public a(String str, String str2, String str3, Set<Channel> set) {
        h.e(str, "name");
        h.e(str2, "description");
        h.e(str3, "key");
        h.e(set, "enabledChannels");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = set;
    }

    public final String a() {
        return this.b;
    }

    public final Set<Channel> b() {
        return this.d;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
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
        return h.a(this.a, aVar.a) && h.a(this.b, aVar.b) && h.a(this.c, aVar.c) && h.a(this.d, aVar.d);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Set<Channel> set = this.d;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Category(name=");
        V0.append(this.a);
        V0.append(", description=");
        V0.append(this.b);
        V0.append(", key=");
        V0.append(this.c);
        V0.append(", enabledChannels=");
        V0.append(this.d);
        V0.append(")");
        return V0.toString();
    }
}

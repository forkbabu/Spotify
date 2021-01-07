package com.spotify.collection.endpoints.listenlater.models;

import com.spotify.playlist.models.Episode;
import java.util.List;
import kotlin.jvm.internal.h;

public final class a {
    private final int a;
    private final int b;
    private final List<Episode> c;
    private final String d;
    private final Integer e;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.spotify.playlist.models.Episode> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(int i, int i2, List<? extends Episode> list, String str, Integer num) {
        h.e(list, "episode");
        this.a = i;
        this.b = i2;
        this.c = list;
        this.d = str;
        this.e = num;
    }

    public final List<Episode> a() {
        return this.c;
    }

    public final Integer b() {
        return this.e;
    }

    public final String c() {
        return this.d;
    }

    public final int d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && h.a(this.c, aVar.c) && h.a(this.d, aVar.d) && h.a(this.e, aVar.e);
    }

    public int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        List<Episode> list = this.c;
        int i2 = 0;
        int hashCode = (i + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.e;
        if (num != null) {
            i2 = num.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        StringBuilder V0 = je.V0("EpisodeList(unfilteredLength=");
        V0.append(this.a);
        V0.append(", unrangedLength=");
        V0.append(this.b);
        V0.append(", episode=");
        V0.append(this.c);
        V0.append(", offlineStatus=");
        V0.append(this.d);
        V0.append(", offlineProgress=");
        V0.append(this.e);
        V0.append(")");
        return V0.toString();
    }
}

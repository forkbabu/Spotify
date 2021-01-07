package defpackage;

import defpackage.gz4;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.h;

/* renamed from: kz4  reason: default package */
public final class kz4 {
    private final gz4 a;
    private final List<String> b;

    public kz4() {
        this(null, null, 3);
    }

    public kz4(gz4 gz4, List<String> list) {
        h.e(gz4, "podcastEpisodesState");
        h.e(list, "playlistItems");
        this.a = gz4;
        this.b = list;
    }

    public static kz4 a(kz4 kz4, gz4 gz4, List list, int i) {
        if ((i & 1) != 0) {
            gz4 = kz4.a;
        }
        List<String> list2 = (i & 2) != 0 ? kz4.b : null;
        h.e(gz4, "podcastEpisodesState");
        h.e(list2, "playlistItems");
        return new kz4(gz4, list2);
    }

    public final List<String> b() {
        return this.b;
    }

    public final gz4 c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kz4)) {
            return false;
        }
        kz4 kz4 = (kz4) obj;
        return h.a(this.a, kz4.a) && h.a(this.b, kz4.b);
    }

    public int hashCode() {
        gz4 gz4 = this.a;
        int i = 0;
        int hashCode = (gz4 != null ? gz4.hashCode() : 0) * 31;
        List<String> list = this.b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PodcastsModel(podcastEpisodesState=");
        V0.append(this.a);
        V0.append(", playlistItems=");
        return je.L0(V0, this.b, ")");
    }

    public kz4(gz4 gz4, List list, int i) {
        gz4.d dVar = (i & 1) != 0 ? gz4.d.a : null;
        list = (i & 2) != 0 ? EmptyList.a : list;
        h.e(dVar, "podcastEpisodesState");
        h.e(list, "playlistItems");
        this.a = dVar;
        this.b = list;
    }
}

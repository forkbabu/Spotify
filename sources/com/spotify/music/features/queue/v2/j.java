package com.spotify.music.features.queue.v2;

import com.spotify.player.model.ContextTrack;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.h;

public final class j {
    private static final j f;
    public static final j g = null;
    private final String a;
    private final String b;
    private final List<ContextTrack> c;
    private final List<ContextTrack> d;
    private final a e;

    static {
        EmptyList emptyList = EmptyList.a;
        f = new j("", "", emptyList, emptyList, new a(0, 0, 0.0f));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.spotify.player.model.ContextTrack> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends com.spotify.player.model.ContextTrack> */
    /* JADX WARN: Multi-variable type inference failed */
    public j(String str, String str2, List<? extends ContextTrack> list, List<? extends ContextTrack> list2, a aVar) {
        h.e(str, "revision");
        h.e(str2, "previousRevision");
        h.e(list, "nextTracks");
        h.e(list2, "prevTracks");
        h.e(aVar, "playbackState");
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = list2;
        this.e = aVar;
    }

    public static j b(j jVar, String str, String str2, List list, List list2, a aVar, int i) {
        if ((i & 1) != 0) {
            str = jVar.a;
        }
        if ((i & 2) != 0) {
            str2 = jVar.b;
        }
        if ((i & 4) != 0) {
            list = jVar.c;
        }
        if ((i & 8) != 0) {
            list2 = jVar.d;
        }
        if ((i & 16) != 0) {
            aVar = jVar.e;
        }
        jVar.getClass();
        h.e(str, "revision");
        h.e(str2, "previousRevision");
        h.e(list, "nextTracks");
        h.e(list2, "prevTracks");
        h.e(aVar, "playbackState");
        return new j(str, str2, list, list2, aVar);
    }

    public final List<ContextTrack> c() {
        return this.c;
    }

    public final a d() {
        return this.e;
    }

    public final List<ContextTrack> e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return h.a(this.a, jVar.a) && h.a(this.b, jVar.b) && h.a(this.c, jVar.c) && h.a(this.d, jVar.d) && h.a(this.e, jVar.e);
    }

    public final String f() {
        return this.b;
    }

    public final String g() {
        return this.a;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<ContextTrack> list = this.c;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        List<ContextTrack> list2 = this.d;
        int hashCode4 = (hashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31;
        a aVar = this.e;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("QueueModel(revision=");
        V0.append(this.a);
        V0.append(", previousRevision=");
        V0.append(this.b);
        V0.append(", nextTracks=");
        V0.append(this.c);
        V0.append(", prevTracks=");
        V0.append(this.d);
        V0.append(", playbackState=");
        V0.append(this.e);
        V0.append(")");
        return V0.toString();
    }
}

package com.spotify.music.features.podcast.episode.transcript.ui.page;

import java.util.List;
import kotlin.jvm.internal.h;

public final class k {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final List<c> e;

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.List<? extends com.spotify.music.features.podcast.episode.transcript.ui.page.c> */
    /* JADX WARN: Multi-variable type inference failed */
    public k(String str, String str2, String str3, String str4, List<? extends c> list) {
        h.e(str, "version");
        h.e(str2, "episodeUri");
        h.e(str3, "language");
        h.e(str4, "publishedAt");
        h.e(list, "items");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
    }

    public final List<c> a() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return h.a(this.a, kVar.a) && h.a(this.b, kVar.b) && h.a(this.c, kVar.c) && h.a(this.d, kVar.d) && h.a(this.e, kVar.e);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        List<c> list = this.e;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("TranscriptViewModel(version=");
        V0.append(this.a);
        V0.append(", episodeUri=");
        V0.append(this.b);
        V0.append(", language=");
        V0.append(this.c);
        V0.append(", publishedAt=");
        V0.append(this.d);
        V0.append(", items=");
        return je.L0(V0, this.e, ")");
    }
}

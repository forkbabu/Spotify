package com.spotify.voice.results.impl;

import com.spotify.voice.results.model.e;
import java.util.List;
import kotlin.jvm.internal.h;

public final class i {
    private final String a;
    private final List<e.a> b;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.spotify.voice.results.model.e$a> */
    /* JADX WARN: Multi-variable type inference failed */
    public i(String str, List<? extends e.a> list) {
        h.e(str, "title");
        h.e(list, "resultList");
        this.a = str;
        this.b = list;
    }

    public final List<e.a> a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return h.a(this.a, iVar.a) && h.a(this.b, iVar.b);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<e.a> list = this.b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("VoiceResultsViewModel(title=");
        V0.append(this.a);
        V0.append(", resultList=");
        return je.L0(V0, this.b, ")");
    }
}

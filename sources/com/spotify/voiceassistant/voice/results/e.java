package com.spotify.voiceassistant.voice.results;

import kotlin.jvm.internal.h;

public final class e {
    private final String a;
    private final com.spotify.voice.results.model.e b;

    public e(String str, com.spotify.voice.results.model.e eVar) {
        h.e(str, "utteranceId");
        h.e(eVar, "results");
        this.a = str;
        this.b = eVar;
    }

    public final com.spotify.voice.results.model.e a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return h.a(this.a, eVar.a) && h.a(this.b, eVar.b);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        com.spotify.voice.results.model.e eVar = this.b;
        if (eVar != null) {
            i = eVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AlternativeResults(utteranceId=");
        V0.append(this.a);
        V0.append(", results=");
        V0.append(this.b);
        V0.append(")");
        return V0.toString();
    }
}

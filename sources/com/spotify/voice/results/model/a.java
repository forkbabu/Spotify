package com.spotify.voice.results.model;

import com.spotify.voice.results.model.e;
import java.util.List;

abstract class a extends e {
    private final String a;
    private final List<e.a> b;
    private final String c;

    a(String str, List<e.a> list, String str2) {
        if (str != null) {
            this.a = str;
            if (list != null) {
                this.b = list;
                if (str2 != null) {
                    this.c = str2;
                    return;
                }
                throw new NullPointerException("Null subtitle");
            }
            throw new NullPointerException("Null results");
        }
        throw new NullPointerException("Null title");
    }

    @Override // com.spotify.voice.results.model.e
    public List<e.a> c() {
        return this.b;
    }

    @Override // com.spotify.voice.results.model.e
    public String e() {
        return this.c;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.a.equals(eVar.f()) || !this.b.equals(eVar.c()) || !this.c.equals(eVar.e())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.voice.results.model.e
    public String f() {
        return this.a;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("ResultsPageModel{title=");
        V0.append(this.a);
        V0.append(", results=");
        V0.append(this.b);
        V0.append(", subtitle=");
        return je.I0(V0, this.c, "}");
    }
}

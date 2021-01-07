package com.spotify.playlist.models;

import java.util.Map;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.h;

public final class l implements g, h {
    private final Episode a;
    private final o b;
    private final p c;
    private final Map<String, String> f;
    private final String n;
    private final String o;

    public static final class a {
        private o a;
        private String b;
        private p c;
        private String d;
        private Episode e;
        private Map<String, String> f;

        public a() {
            this(null, null, null, null, null, null, 63);
        }

        public a(o oVar, String str, p pVar, String str2, Episode episode, Map map, int i) {
            oVar = (i & 1) != 0 ? null : oVar;
            str = (i & 2) != 0 ? null : str;
            pVar = (i & 4) != 0 ? null : pVar;
            int i2 = i & 8;
            episode = (i & 16) != 0 ? null : episode;
            map = (i & 32) != 0 ? null : map;
            this.a = oVar;
            this.b = str;
            this.c = pVar;
            this.d = null;
            this.e = episode;
            this.f = map;
        }

        public final a a(p pVar) {
            this.c = pVar;
            return this;
        }

        public final l b() {
            o oVar = this.a;
            String str = this.b;
            String str2 = this.d;
            p pVar = this.c;
            Episode episode = this.e;
            Map<String, String> map = this.f;
            h.c(map);
            return new l(episode, oVar, pVar, map, str, str2);
        }

        public final a c(Episode episode) {
            this.e = episode;
            return this;
        }

        public final a d(Map<String, String> map) {
            h.e(map, "formatListAttributes");
            this.f = map;
            return this;
        }

        public final a e(String str) {
            this.d = str;
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return h.a(this.a, aVar.a) && h.a(this.b, aVar.b) && h.a(this.c, aVar.c) && h.a(this.d, aVar.d) && h.a(this.e, aVar.e) && h.a(this.f, aVar.f);
        }

        public final a f(String str) {
            this.b = str;
            return this;
        }

        public final a g(o oVar) {
            this.a = oVar;
            return this;
        }

        public int hashCode() {
            o oVar = this.a;
            int i = 0;
            int hashCode = (oVar != null ? oVar.hashCode() : 0) * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            p pVar = this.c;
            int hashCode3 = (hashCode2 + (pVar != null ? pVar.hashCode() : 0)) * 31;
            String str2 = this.d;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
            Episode episode = this.e;
            int hashCode5 = (hashCode4 + (episode != null ? episode.hashCode() : 0)) * 31;
            Map<String, String> map = this.f;
            if (map != null) {
                i = map.hashCode();
            }
            return hashCode5 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Builder(track=");
            V0.append(this.a);
            V0.append(", rowId=");
            V0.append(this.b);
            V0.append(", addedBy=");
            V0.append(this.c);
            V0.append(", header=");
            V0.append(this.d);
            V0.append(", episode=");
            V0.append(this.e);
            V0.append(", formatListAttributes=");
            return je.M0(V0, this.f, ")");
        }
    }

    public l(Episode episode, o oVar, p pVar, Map<String, String> map, String str, String str2) {
        h.e(map, "formatListAttributes");
        this.a = episode;
        this.b = oVar;
        this.c = pVar;
        this.f = map;
        this.n = str;
        this.o = str2;
    }

    public static final a a() {
        return new a(null, null, null, null, null, EmptyMap.a, 31);
    }

    public final p b() {
        return this.c;
    }

    public final Episode c() {
        return this.a;
    }

    public final Map<String, String> d() {
        return this.f;
    }

    public final String e() {
        o oVar = this.b;
        if (oVar != null) {
            String name = oVar.getName();
            h.d(name, "track.name");
            return name;
        }
        Episode episode = this.a;
        String n2 = episode != null ? episode.n() : null;
        return n2 != null ? n2 : "";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return h.a(this.a, lVar.a) && h.a(this.b, lVar.b) && h.a(this.c, lVar.c) && h.a(this.f, lVar.f) && h.a(this.n, lVar.n) && h.a(this.o, lVar.o);
    }

    public final String f() {
        return this.n;
    }

    public final o g() {
        return this.b;
    }

    @Override // com.spotify.playlist.models.g
    public String getHeader() {
        return this.o;
    }

    @Override // com.spotify.playlist.models.h
    public String getUri() {
        o oVar = this.b;
        if (oVar != null) {
            return oVar.getUri();
        }
        Episode episode = this.a;
        String uri = episode != null ? ((c) episode).getUri() : null;
        return uri != null ? uri : "";
    }

    public final a h() {
        return new a(this.b, this.n, this.c, null, this.a, this.f, 8);
    }

    public int hashCode() {
        Episode episode = this.a;
        int i = 0;
        int hashCode = (episode != null ? episode.hashCode() : 0) * 31;
        o oVar = this.b;
        int hashCode2 = (hashCode + (oVar != null ? oVar.hashCode() : 0)) * 31;
        p pVar = this.c;
        int hashCode3 = (hashCode2 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        Map<String, String> map = this.f;
        int hashCode4 = (hashCode3 + (map != null ? map.hashCode() : 0)) * 31;
        String str = this.n;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.o;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PlaylistItem(episode=");
        V0.append(this.a);
        V0.append(", track=");
        V0.append(this.b);
        V0.append(", addedBy=");
        V0.append(this.c);
        V0.append(", formatListAttributes=");
        V0.append(this.f);
        V0.append(", rowId=");
        V0.append(this.n);
        V0.append(", header=");
        return je.I0(V0, this.o, ")");
    }
}

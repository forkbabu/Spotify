package com.spotify.music.features.playlistentity.itemlist.adapter;

import java.util.Map;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.h;

public final class ContextMenuItem {
    private final String a;
    private final String b;
    private final int c;
    private final String d;
    private final Type e;
    private final Map<String, String> f;

    public enum Type {
        TRACK,
        AUDIO_EPISODE,
        MUSIC_AND_TALK_EPISODE,
        VIDEO_EPISODE
    }

    public static final class a {
        private String a;
        private Integer b;
        private Type c;
        private String d;
        private String e;
        private Map<String, String> f;

        public a() {
            this(null, null, null, null, null, null, 63);
        }

        public a(String str, Integer num, Type type, String str2, String str3, Map map, int i) {
            int i2 = i & 1;
            int i3 = i & 2;
            int i4 = i & 4;
            int i5 = i & 8;
            int i6 = i & 16;
            Map<String, String> map2 = (i & 32) != 0 ? EmptyMap.a : null;
            h.e(map2, "additionalMetadata");
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = map2;
        }

        public final a a(Map<String, String> map) {
            h.e(map, "metadata");
            this.f = map;
            return this;
        }

        public final ContextMenuItem b() {
            String str = this.d;
            h.c(str);
            String str2 = this.e;
            h.c(str2);
            String str3 = this.a;
            Type type = this.c;
            h.c(type);
            Integer num = this.b;
            h.c(num);
            return new ContextMenuItem(str, str2, num.intValue(), str3, type, this.f);
        }

        public final a c(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public final a d(String str) {
            h.e(str, "name");
            this.e = str;
            return this;
        }

        public final a e(String str) {
            this.a = str;
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

        public final a f(Type type) {
            h.e(type, "type");
            this.c = type;
            return this;
        }

        public final a g(String str) {
            h.e(str, "uri");
            this.d = str;
            return this;
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Integer num = this.b;
            int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
            Type type = this.c;
            int hashCode3 = (hashCode2 + (type != null ? type.hashCode() : 0)) * 31;
            String str2 = this.d;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.e;
            int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
            Map<String, String> map = this.f;
            if (map != null) {
                i = map.hashCode();
            }
            return hashCode5 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Builder(rowId=");
            V0.append(this.a);
            V0.append(", index=");
            V0.append(this.b);
            V0.append(", type=");
            V0.append(this.c);
            V0.append(", uri=");
            V0.append(this.d);
            V0.append(", name=");
            V0.append(this.e);
            V0.append(", additionalMetadata=");
            return je.M0(V0, this.f, ")");
        }
    }

    public ContextMenuItem(String str, String str2, int i, String str3, Type type, Map<String, String> map) {
        h.e(str, "uri");
        h.e(str2, "name");
        h.e(type, "type");
        h.e(map, "additionalMetadata");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = type;
        this.f = map;
    }

    public static final a a() {
        return new a(null, null, null, null, null, null, 63);
    }

    public final Map<String, String> b() {
        return this.f;
    }

    public final int c() {
        return this.c;
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContextMenuItem)) {
            return false;
        }
        ContextMenuItem contextMenuItem = (ContextMenuItem) obj;
        return h.a(this.a, contextMenuItem.a) && h.a(this.b, contextMenuItem.b) && this.c == contextMenuItem.c && h.a(this.d, contextMenuItem.d) && h.a(this.e, contextMenuItem.e) && h.a(this.f, contextMenuItem.f);
    }

    public final Type f() {
        return this.e;
    }

    public final String g() {
        return this.a;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.c) * 31;
        String str3 = this.d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Type type = this.e;
        int hashCode4 = (hashCode3 + (type != null ? type.hashCode() : 0)) * 31;
        Map<String, String> map = this.f;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ContextMenuItem(uri=");
        V0.append(this.a);
        V0.append(", name=");
        V0.append(this.b);
        V0.append(", index=");
        V0.append(this.c);
        V0.append(", rowId=");
        V0.append(this.d);
        V0.append(", type=");
        V0.append(this.e);
        V0.append(", additionalMetadata=");
        return je.M0(V0, this.f, ")");
    }
}

package com.spotify.playlist.models;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.h;

public final class n {
    private final List<String> a;

    public n(List<String> list) {
        h.e(list, "artists");
        this.a = list;
    }

    public final List<String> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof n) && h.a(this.a, ((n) obj).a);
        }
        return true;
    }

    public int hashCode() {
        List<String> list = this.a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        return je.L0(je.V0("PodcastSegments(artists="), this.a, ")");
    }

    public n() {
        EmptyList emptyList = EmptyList.a;
        h.e(emptyList, "artists");
        this.a = emptyList;
    }

    public static final class a {
        private List<String> a;

        public a() {
            EmptyList emptyList = EmptyList.a;
            h.e(emptyList, "artists");
            this.a = emptyList;
        }

        public final n a() {
            return new n(this.a);
        }

        public final a b(List<String> list) {
            h.e(list, "artists");
            this.a = list;
            return this;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && h.a(this.a, ((a) obj).a);
            }
            return true;
        }

        public int hashCode() {
            List<String> list = this.a;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.L0(je.V0("Builder(artists="), this.a, ")");
        }

        public a(List list, int i) {
            EmptyList emptyList = (i & 1) != 0 ? EmptyList.a : null;
            h.e(emptyList, "artists");
            this.a = emptyList;
        }
    }
}

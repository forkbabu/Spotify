package com.spotify.playlist.models;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.h;

public final class e {
    private final String a;
    private final List<b> b;

    public static final class a {
        private String a;
        private List<b> b;

        public a() {
            this(null, null, 3);
        }

        public a(String str, List list, int i) {
            EmptyList emptyList = null;
            String str2 = (i & 1) != 0 ? "" : null;
            emptyList = (i & 2) != 0 ? EmptyList.a : emptyList;
            h.e(str2, "episodeUri");
            h.e(emptyList, "transcriptItems");
            this.a = str2;
            this.b = emptyList;
        }

        public final e a() {
            return new e(this.a, this.b);
        }

        public final a b(String str) {
            h.e(str, "episodeUri");
            this.a = str;
            return this;
        }

        public final a c(List<b> list) {
            h.e(list, "transcriptItems");
            this.b = list;
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
            return h.a(this.a, aVar.a) && h.a(this.b, aVar.b);
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            List<b> list = this.b;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Builder(episodeUri=");
            V0.append(this.a);
            V0.append(", transcriptItems=");
            return je.L0(V0, this.b, ")");
        }
    }

    public static final class b {
        private final String a;
        private final String b;
        private final boolean c;
        private final String d;

        public static final class a {
            private String a;
            private String b;
            private boolean c;
            private String d;

            public a() {
                this(null, null, false, null, 15);
            }

            public a(String str, String str2, boolean z, String str3, int i) {
                String str4 = null;
                String str5 = (i & 1) != 0 ? "" : null;
                String str6 = (i & 2) != 0 ? "" : null;
                z = (i & 4) != 0 ? false : z;
                str4 = (i & 8) != 0 ? "" : str4;
                je.x(str5, "transcriptUri", str6, "language", str4, "cdnUrl");
                this.a = str5;
                this.b = str6;
                this.c = z;
                this.d = str4;
            }

            public final b a() {
                return new b(this.a, this.b, this.c, this.d);
            }

            public final a b(String str) {
                h.e(str, "cdnUrl");
                this.d = str;
                return this;
            }

            public final a c(boolean z) {
                this.c = z;
                return this;
            }

            public final a d(String str) {
                h.e(str, "language");
                this.b = str;
                return this;
            }

            public final a e(String str) {
                h.e(str, "transcriptUri");
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
                return h.a(this.a, aVar.a) && h.a(this.b, aVar.b) && this.c == aVar.c && h.a(this.d, aVar.d);
            }

            public int hashCode() {
                String str = this.a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.b;
                int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                boolean z = this.c;
                if (z) {
                    z = true;
                }
                int i2 = z ? 1 : 0;
                int i3 = z ? 1 : 0;
                int i4 = z ? 1 : 0;
                int i5 = (hashCode2 + i2) * 31;
                String str3 = this.d;
                if (str3 != null) {
                    i = str3.hashCode();
                }
                return i5 + i;
            }

            public String toString() {
                StringBuilder V0 = je.V0("Builder(transcriptUri=");
                V0.append(this.a);
                V0.append(", language=");
                V0.append(this.b);
                V0.append(", curated=");
                V0.append(this.c);
                V0.append(", cdnUrl=");
                return je.I0(V0, this.d, ")");
            }
        }

        public b(String str, String str2, boolean z, String str3) {
            je.x(str, "transcriptUri", str2, "language", str3, "cdnUrl");
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = str3;
        }

        public final String a() {
            return this.d;
        }

        public final boolean b() {
            return this.c;
        }

        public final String c() {
            return this.b;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return h.a(this.a, bVar.a) && h.a(this.b, bVar.b) && this.c == bVar.c && h.a(this.d, bVar.d);
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            boolean z = this.c;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = (hashCode2 + i2) * 31;
            String str3 = this.d;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return i5 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("EpisodeTranscriptItem(transcriptUri=");
            V0.append(this.a);
            V0.append(", language=");
            V0.append(this.b);
            V0.append(", curated=");
            V0.append(this.c);
            V0.append(", cdnUrl=");
            return je.I0(V0, this.d, ")");
        }
    }

    public e(String str, List<b> list) {
        h.e(str, "episodeUri");
        h.e(list, "transcriptItems");
        this.a = str;
        this.b = list;
    }

    public final List<b> a() {
        return this.b;
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
        List<b> list = this.b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("EpisodeTranscripts(episodeUri=");
        V0.append(this.a);
        V0.append(", transcriptItems=");
        return je.L0(V0, this.b, ")");
    }
}

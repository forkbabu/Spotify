package com.spotify.music.navigation;

import com.spotify.music.navigation.g;

/* access modifiers changed from: package-private */
public final class d extends g {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    /* access modifiers changed from: package-private */
    public static final class b extends g.a {
        private String a;
        private String b;
        private String c;
        private String d;

        b() {
        }

        public g a() {
            String str = this.b == null ? " spotifyLink" : "";
            if (this.d == null) {
                str = je.x0(str, " featureId");
            }
            if (str.isEmpty()) {
                return new d(this.a, this.b, this.c, this.d, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public g.a b(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null featureId");
        }

        public g.a c(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null spotifyLink");
        }

        public g.a d(String str) {
            this.c = str;
            return this;
        }

        public g.a e(String str) {
            this.a = str;
            return this;
        }
    }

    d(String str, String str2, String str3, String str4, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // com.spotify.music.navigation.g
    public String a() {
        return this.d;
    }

    @Override // com.spotify.music.navigation.g
    public String b() {
        return this.b;
    }

    @Override // com.spotify.music.navigation.g
    public String c() {
        return this.c;
    }

    @Override // com.spotify.music.navigation.g
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        String str2 = this.a;
        if (str2 != null ? str2.equals(gVar.d()) : gVar.d() == null) {
            if (this.b.equals(gVar.b()) && ((str = this.c) != null ? str.equals(gVar.c()) : gVar.c() == null) && this.d.equals(gVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode ^ i) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("BackStackFragmentDescription{title=");
        V0.append(this.a);
        V0.append(", spotifyLink=");
        V0.append(this.b);
        V0.append(", tag=");
        V0.append(this.c);
        V0.append(", featureId=");
        return je.I0(V0, this.d, "}");
    }
}

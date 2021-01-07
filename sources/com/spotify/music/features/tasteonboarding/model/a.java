package com.spotify.music.features.tasteonboarding.model;

import com.spotify.music.features.tasteonboarding.model.d;

/* access modifiers changed from: package-private */
public abstract class a extends d {
    private final String a;
    private final String b;
    private final String c;

    /* access modifiers changed from: package-private */
    public static class b extends d.a {
        private String a;
        private String b;
        private String c;

        b() {
        }

        @Override // com.spotify.music.features.tasteonboarding.model.d.a
        public d a() {
            return new c(this.a, this.b, this.c);
        }

        @Override // com.spotify.music.features.tasteonboarding.model.d.a
        public d.a b(String str) {
            this.b = str;
            return this;
        }

        @Override // com.spotify.music.features.tasteonboarding.model.d.a
        public d.a c(String str) {
            this.c = str;
            return this;
        }

        @Override // com.spotify.music.features.tasteonboarding.model.d.a
        public d.a d(String str) {
            this.a = str;
            return this;
        }

        b(d dVar, C0256a aVar) {
            this.a = dVar.e();
            this.b = dVar.b();
            this.c = dVar.c();
        }
    }

    a(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // com.spotify.music.features.tasteonboarding.model.d
    public String b() {
        return this.b;
    }

    @Override // com.spotify.music.features.tasteonboarding.model.d
    public String c() {
        return this.c;
    }

    @Override // com.spotify.music.features.tasteonboarding.model.d
    public String e() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.a;
        if (str != null ? str.equals(dVar.e()) : dVar.e() == null) {
            String str2 = this.b;
            if (str2 != null ? str2.equals(dVar.b()) : dVar.b() == null) {
                String str3 = this.c;
                if (str3 == null) {
                    if (dVar.c() == null) {
                        return true;
                    }
                } else if (str3.equals(dVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.features.tasteonboarding.model.d
    public d.a f() {
        return new b(this, null);
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 ^ i;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Logging{section=");
        V0.append(this.a);
        V0.append(", contentSource=");
        V0.append(this.b);
        V0.append(", contentSourceUri=");
        return je.I0(V0, this.c, "}");
    }
}

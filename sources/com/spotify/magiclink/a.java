package com.spotify.magiclink;

import com.spotify.magiclink.o;

/* access modifiers changed from: package-private */
public abstract class a extends o {
    private final String a;
    private final String b;
    private final String c;

    /* access modifiers changed from: package-private */
    /* renamed from: com.spotify.magiclink.a$a  reason: collision with other inner class name */
    public static class C0170a implements o.a {
        private String a;
        private String b;
        private String c;

        C0170a() {
        }

        public o a() {
            String str = this.a == null ? " username" : "";
            if (this.b == null) {
                str = je.x0(str, " token");
            }
            if (str.isEmpty()) {
                return new m(this.a, this.b, this.c);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public o.a b(String str) {
            this.c = str;
            return this;
        }

        public o.a c(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        public o.a d(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null username");
        }
    }

    a(String str, String str2, String str3) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                this.c = str3;
                return;
            }
            throw new NullPointerException("Null token");
        }
        throw new NullPointerException("Null username");
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.magiclink.o
    public String a() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.magiclink.o
    public String b() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.magiclink.o
    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.a.equals(oVar.c()) && this.b.equals(oVar.b())) {
            String str = this.c;
            if (str == null) {
                if (oVar.a() == null) {
                    return true;
                }
            } else if (str.equals(oVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }
}

package com.spotify.music.features.premiumdestination.domain;

import com.spotify.music.features.premiumdestination.domain.l;

final class i extends l {
    private final String a;
    private final boolean b;
    private final m c;

    /* access modifiers changed from: package-private */
    public static final class b implements l.a {
        private String a;
        private Boolean b;
        private m c;

        b() {
        }

        public l.a a(String str) {
            this.a = str;
            return this;
        }

        public l.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.features.premiumdestination.domain.l.a
        public l build() {
            String str = this.b == null ? " showSettingsCog" : "";
            if (this.c == null) {
                str = je.x0(str, " state");
            }
            if (str.isEmpty()) {
                return new i(this.a, this.b.booleanValue(), this.c, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public l.a c(m mVar) {
            if (mVar != null) {
                this.c = mVar;
                return this;
            }
            throw new NullPointerException("Null state");
        }

        b(l lVar, a aVar) {
            this.a = lVar.b();
            this.b = Boolean.valueOf(lVar.c());
            this.c = lVar.d();
        }
    }

    i(String str, boolean z, m mVar, a aVar) {
        this.a = str;
        this.b = z;
        this.c = mVar;
    }

    @Override // com.spotify.music.features.premiumdestination.domain.l
    public String b() {
        return this.a;
    }

    @Override // com.spotify.music.features.premiumdestination.domain.l
    public boolean c() {
        return this.b;
    }

    @Override // com.spotify.music.features.premiumdestination.domain.l
    public m d() {
        return this.c;
    }

    @Override // com.spotify.music.features.premiumdestination.domain.l
    public l.a e() {
        return new b(this, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        String str = this.a;
        if (str != null ? str.equals(lVar.b()) : lVar.b() == null) {
            if (this.b == lVar.c() && this.c.equals(lVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        return (((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("PremiumPageModel{productType=");
        V0.append(this.a);
        V0.append(", showSettingsCog=");
        V0.append(this.b);
        V0.append(", state=");
        V0.append(this.c);
        V0.append("}");
        return V0.toString();
    }
}

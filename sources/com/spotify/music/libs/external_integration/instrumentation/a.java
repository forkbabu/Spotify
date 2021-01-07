package com.spotify.music.libs.external_integration.instrumentation;

import com.spotify.music.libs.external_integration.instrumentation.e;

final class a extends e {
    private final Page a;
    private final String b;
    private final Integer c;

    /* access modifiers changed from: package-private */
    public static final class b implements e.a {
        private Page a;
        private String b;
        private Integer c;

        b() {
        }

        @Override // com.spotify.music.libs.external_integration.instrumentation.e.a
        public e.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null id");
        }

        @Override // com.spotify.music.libs.external_integration.instrumentation.e.a
        public e build() {
            String str = this.a == null ? " page" : "";
            if (this.b == null) {
                str = je.x0(str, " id");
            }
            if (str.isEmpty()) {
                return new a(this.a, this.b, this.c, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.libs.external_integration.instrumentation.e.a
        public e.a c(Integer num) {
            this.c = num;
            return this;
        }

        @Override // com.spotify.music.libs.external_integration.instrumentation.e.a
        public e.a d(Page page) {
            if (page != null) {
                this.a = page;
                return this;
            }
            throw new NullPointerException("Null page");
        }
    }

    a(Page page, String str, Integer num, C0283a aVar) {
        this.a = page;
        this.b = str;
        this.c = num;
    }

    @Override // com.spotify.music.libs.external_integration.instrumentation.e
    public String b() {
        return this.b;
    }

    @Override // com.spotify.music.libs.external_integration.instrumentation.e
    public Page c() {
        return this.a;
    }

    @Override // com.spotify.music.libs.external_integration.instrumentation.e
    public Integer d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.a.equals(eVar.c()) && this.b.equals(eVar.b())) {
            Integer num = this.c;
            if (num == null) {
                if (eVar.d() == null) {
                    return true;
                }
            } else if (num.equals(eVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        Integer num = this.c;
        return hashCode ^ (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        StringBuilder V0 = je.V0("ExternalIntegrationUbiParams{page=");
        V0.append(this.a);
        V0.append(", id=");
        V0.append(this.b);
        V0.append(", position=");
        V0.append(this.c);
        V0.append("}");
        return V0.toString();
    }
}

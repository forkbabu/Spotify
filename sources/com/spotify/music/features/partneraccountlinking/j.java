package com.spotify.music.features.partneraccountlinking;

import com.spotify.music.features.partneraccountlinking.q;

final class j extends q {
    private final String a;
    private final String b;
    private final PartnerAccountLinkingError c;

    static final class b implements q.a {
        private String a;
        private String b;
        private PartnerAccountLinkingError c;

        b() {
        }

        @Override // com.spotify.music.features.partneraccountlinking.q.a
        public q.a a(PartnerAccountLinkingError partnerAccountLinkingError) {
            this.c = partnerAccountLinkingError;
            return this;
        }

        public q.a b(String str) {
            this.b = str;
            return this;
        }

        @Override // com.spotify.music.features.partneraccountlinking.q.a
        public q build() {
            return new j(this.a, this.b, this.c, null);
        }

        public q.a c(String str) {
            this.a = str;
            return this;
        }
    }

    j(String str, String str2, PartnerAccountLinkingError partnerAccountLinkingError, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = partnerAccountLinkingError;
    }

    @Override // com.spotify.music.features.partneraccountlinking.q
    public PartnerAccountLinkingError a() {
        return this.c;
    }

    @Override // com.spotify.music.features.partneraccountlinking.q
    public String b() {
        return this.b;
    }

    @Override // com.spotify.music.features.partneraccountlinking.q
    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        String str = this.a;
        if (str != null ? str.equals(qVar.c()) : qVar.c() == null) {
            String str2 = this.b;
            if (str2 != null ? str2.equals(qVar.b()) : qVar.b() == null) {
                PartnerAccountLinkingError partnerAccountLinkingError = this.c;
                if (partnerAccountLinkingError == null) {
                    if (qVar.a() == null) {
                        return true;
                    }
                } else if (partnerAccountLinkingError.equals(qVar.a())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        PartnerAccountLinkingError partnerAccountLinkingError = this.c;
        if (partnerAccountLinkingError != null) {
            i = partnerAccountLinkingError.hashCode();
        }
        return hashCode2 ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PartnerAccountLinkingResult{state=");
        V0.append(this.a);
        V0.append(", redirectUri=");
        V0.append(this.b);
        V0.append(", error=");
        V0.append(this.c);
        V0.append("}");
        return V0.toString();
    }
}

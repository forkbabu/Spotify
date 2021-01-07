package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.TokenResult;

final class b extends TokenResult {
    private final String a;
    private final long b;
    private final TokenResult.ResponseCode c;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.installations.remote.b$b  reason: collision with other inner class name */
    public static final class C0134b extends TokenResult.a {
        private String a;
        private Long b;
        private TokenResult.ResponseCode c;

        C0134b() {
        }

        @Override // com.google.firebase.installations.remote.TokenResult.a
        public TokenResult a() {
            String str = this.b == null ? " tokenExpirationTimestamp" : "";
            if (str.isEmpty()) {
                return new b(this.a, this.b.longValue(), this.c, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.google.firebase.installations.remote.TokenResult.a
        public TokenResult.a b(TokenResult.ResponseCode responseCode) {
            this.c = responseCode;
            return this;
        }

        @Override // com.google.firebase.installations.remote.TokenResult.a
        public TokenResult.a c(String str) {
            this.a = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.TokenResult.a
        public TokenResult.a d(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    b(String str, long j, TokenResult.ResponseCode responseCode, a aVar) {
        this.a = str;
        this.b = j;
        this.c = responseCode;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public TokenResult.ResponseCode b() {
        return this.c;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public String c() {
        return this.a;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TokenResult)) {
            return false;
        }
        TokenResult tokenResult = (TokenResult) obj;
        String str = this.a;
        if (str != null ? str.equals(tokenResult.c()) : tokenResult.c() == null) {
            if (this.b == tokenResult.d()) {
                TokenResult.ResponseCode responseCode = this.c;
                if (responseCode == null) {
                    if (tokenResult.b() == null) {
                        return true;
                    }
                } else if (responseCode.equals(tokenResult.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        TokenResult.ResponseCode responseCode = this.c;
        if (responseCode != null) {
            i = responseCode.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("TokenResult{token=");
        V0.append(this.a);
        V0.append(", tokenExpirationTimestamp=");
        V0.append(this.b);
        V0.append(", responseCode=");
        V0.append(this.c);
        V0.append("}");
        return V0.toString();
    }
}

package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.InstallationResponse;

/* access modifiers changed from: package-private */
public final class a extends InstallationResponse {
    private final String a;
    private final String b;
    private final String c;
    private final TokenResult d;
    private final InstallationResponse.ResponseCode e;

    /* access modifiers changed from: package-private */
    public static final class b extends InstallationResponse.a {
        private String a;
        private String b;
        private String c;
        private TokenResult d;
        private InstallationResponse.ResponseCode e;

        b() {
        }

        public InstallationResponse a() {
            return new a(this.a, this.b, this.c, this.d, this.e, null);
        }

        public InstallationResponse.a b(TokenResult tokenResult) {
            this.d = tokenResult;
            return this;
        }

        public InstallationResponse.a c(String str) {
            this.b = str;
            return this;
        }

        public InstallationResponse.a d(String str) {
            this.c = str;
            return this;
        }

        public InstallationResponse.a e(InstallationResponse.ResponseCode responseCode) {
            this.e = responseCode;
            return this;
        }

        public InstallationResponse.a f(String str) {
            this.a = str;
            return this;
        }
    }

    a(String str, String str2, String str3, TokenResult tokenResult, InstallationResponse.ResponseCode responseCode, C0133a aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = tokenResult;
        this.e = responseCode;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public TokenResult a() {
        return this.d;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public String b() {
        return this.b;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public String c() {
        return this.c;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public InstallationResponse.ResponseCode d() {
        return this.e;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationResponse)) {
            return false;
        }
        InstallationResponse installationResponse = (InstallationResponse) obj;
        String str = this.a;
        if (str != null ? str.equals(installationResponse.e()) : installationResponse.e() == null) {
            String str2 = this.b;
            if (str2 != null ? str2.equals(installationResponse.b()) : installationResponse.b() == null) {
                String str3 = this.c;
                if (str3 != null ? str3.equals(installationResponse.c()) : installationResponse.c() == null) {
                    TokenResult tokenResult = this.d;
                    if (tokenResult != null ? tokenResult.equals(installationResponse.a()) : installationResponse.a() == null) {
                        InstallationResponse.ResponseCode responseCode = this.e;
                        if (responseCode == null) {
                            if (installationResponse.d() == null) {
                                return true;
                            }
                        } else if (responseCode.equals(installationResponse.d())) {
                            return true;
                        }
                    }
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
        String str3 = this.c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        TokenResult tokenResult = this.d;
        int hashCode4 = (hashCode3 ^ (tokenResult == null ? 0 : tokenResult.hashCode())) * 1000003;
        InstallationResponse.ResponseCode responseCode = this.e;
        if (responseCode != null) {
            i = responseCode.hashCode();
        }
        return hashCode4 ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("InstallationResponse{uri=");
        V0.append(this.a);
        V0.append(", fid=");
        V0.append(this.b);
        V0.append(", refreshToken=");
        V0.append(this.c);
        V0.append(", authToken=");
        V0.append(this.d);
        V0.append(", responseCode=");
        V0.append(this.e);
        V0.append("}");
        return V0.toString();
    }
}

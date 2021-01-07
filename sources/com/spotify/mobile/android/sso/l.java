package com.spotify.mobile.android.sso;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import java.util.List;

/* access modifiers changed from: package-private */
public final class l extends AuthorizationRequest {
    private final String a;
    private final String b;
    private final List<String> c;
    private final AuthorizationRequest.ResponseType d;
    private final ClientIdentity e;
    private final String f;
    private final boolean g;

    /* JADX WARN: Incorrect args count in method signature: (Ljava/lang/String;Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;Lcom/spotify/mobile/android/sso/AuthorizationRequest$ResponseType;Lcom/spotify/mobile/android/sso/ClientIdentity;Ljava/lang/String;Ljava/lang/Object;Z)V */
    l(String str, String str2, List list, AuthorizationRequest.ResponseType responseType, ClientIdentity clientIdentity, String str3, boolean z) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (list != null) {
                    this.c = list;
                    if (responseType != null) {
                        this.d = responseType;
                        this.e = clientIdentity;
                        this.f = str3;
                        this.g = z;
                        return;
                    }
                    throw new NullPointerException("Null responseType");
                }
                throw new NullPointerException("Null scopesList");
            }
            throw new NullPointerException("Null clientId");
        }
        throw new NullPointerException("Null redirectUri");
    }

    @Override // com.spotify.mobile.android.sso.AuthorizationRequest
    public String b() {
        return this.b;
    }

    @Override // com.spotify.mobile.android.sso.AuthorizationRequest
    public ClientIdentity c() {
        return this.e;
    }

    @Override // com.spotify.mobile.android.sso.AuthorizationRequest
    public void d() {
    }

    @Override // com.spotify.mobile.android.sso.AuthorizationRequest
    public String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        ClientIdentity clientIdentity;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        if (this.a.equals(authorizationRequest.e()) && this.b.equals(authorizationRequest.b()) && this.c.equals(authorizationRequest.h()) && this.d.equals(authorizationRequest.f()) && ((clientIdentity = this.e) != null ? clientIdentity.equals(authorizationRequest.c()) : authorizationRequest.c() == null) && ((str = this.f) != null ? str.equals(authorizationRequest.i()) : authorizationRequest.i() == null)) {
            authorizationRequest.d();
            if (this.g == authorizationRequest.j()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.mobile.android.sso.AuthorizationRequest
    public AuthorizationRequest.ResponseType f() {
        return this.d;
    }

    @Override // com.spotify.mobile.android.sso.AuthorizationRequest
    public List<String> h() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        ClientIdentity clientIdentity = this.e;
        int hashCode2 = (hashCode ^ (clientIdentity == null ? 0 : clientIdentity.hashCode())) * 1000003;
        String str = this.f;
        return ((((hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ 0) * 1000003) ^ (this.g ? 1231 : 1237);
    }

    @Override // com.spotify.mobile.android.sso.AuthorizationRequest
    public String i() {
        return this.f;
    }

    @Override // com.spotify.mobile.android.sso.AuthorizationRequest
    public boolean j() {
        return this.g;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AuthorizationRequest{redirectUri=");
        V0.append(this.a);
        V0.append(", clientId=");
        V0.append(this.b);
        V0.append(", scopesList=");
        V0.append(this.c);
        V0.append(", responseType=");
        V0.append(this.d);
        V0.append(", clientIdentity=");
        V0.append(this.e);
        V0.append(", state=");
        V0.append(this.f);
        V0.append(", codeVerifier=");
        V0.append((Object) null);
        V0.append(", showDialog=");
        return je.P0(V0, this.g, "}");
    }
}

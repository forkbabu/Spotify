package com.spotify.music.builtinauth.model;

import com.spotify.mobile.android.sso.ClientIdentity;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class b extends a {
    private final String a;
    private final Map<String, String> b;
    private final List<String> c;
    private final ClientIdentity d;

    b(String str, Map<String, String> map, List<String> list, ClientIdentity clientIdentity) {
        if (str != null) {
            this.a = str;
            this.b = map;
            if (list != null) {
                this.c = list;
                this.d = clientIdentity;
                return;
            }
            throw new NullPointerException("Null authMethods");
        }
        throw new NullPointerException("Null authid");
    }

    @Override // com.spotify.music.builtinauth.model.a
    public List<String> c() {
        return this.c;
    }

    @Override // com.spotify.music.builtinauth.model.a
    public String d() {
        return this.a;
    }

    @Override // com.spotify.music.builtinauth.model.a
    public ClientIdentity e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        Map<String, String> map;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a.equals(aVar.d()) && ((map = this.b) != null ? map.equals(aVar.f()) : aVar.f() == null) && this.c.equals(aVar.c())) {
            ClientIdentity clientIdentity = this.d;
            if (clientIdentity == null) {
                if (aVar.e() == null) {
                    return true;
                }
            } else if (clientIdentity.equals(aVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.music.builtinauth.model.a
    public Map<String, String> f() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Map<String, String> map = this.b;
        int i = 0;
        int hashCode2 = (((hashCode ^ (map == null ? 0 : map.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        ClientIdentity clientIdentity = this.d;
        if (clientIdentity != null) {
            i = clientIdentity.hashCode();
        }
        return hashCode2 ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AuthDetails{authid=");
        V0.append(this.a);
        V0.append(", extras=");
        V0.append(this.b);
        V0.append(", authMethods=");
        V0.append(this.c);
        V0.append(", clientIdentity=");
        V0.append(this.d);
        V0.append("}");
        return V0.toString();
    }
}

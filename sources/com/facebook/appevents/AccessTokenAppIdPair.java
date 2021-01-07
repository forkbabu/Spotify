package com.facebook.appevents;

import com.facebook.internal.f0;
import java.io.Serializable;

/* access modifiers changed from: package-private */
public class AccessTokenAppIdPair implements Serializable {
    private static final long serialVersionUID = 1;
    private final String accessTokenString;
    private final String applicationId;

    static class SerializationProxyV1 implements Serializable {
        private static final long serialVersionUID = -2488473066578201069L;
        private final String accessTokenString;
        private final String appId;

        SerializationProxyV1(String str, String str2, a aVar) {
            this.accessTokenString = str;
            this.appId = str2;
        }

        private Object readResolve() {
            return new AccessTokenAppIdPair(this.accessTokenString, this.appId);
        }
    }

    public AccessTokenAppIdPair(String str, String str2) {
        this.accessTokenString = f0.C(str) ? null : str;
        this.applicationId = str2;
    }

    private Object writeReplace() {
        return new SerializationProxyV1(this.accessTokenString, this.applicationId, null);
    }

    public String a() {
        return this.accessTokenString;
    }

    public String b() {
        return this.applicationId;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (!(obj instanceof AccessTokenAppIdPair)) {
            return false;
        }
        AccessTokenAppIdPair accessTokenAppIdPair = (AccessTokenAppIdPair) obj;
        if (!f0.b(accessTokenAppIdPair.accessTokenString, this.accessTokenString) || !f0.b(accessTokenAppIdPair.applicationId, this.applicationId)) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.accessTokenString;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.applicationId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode ^ i;
    }
}

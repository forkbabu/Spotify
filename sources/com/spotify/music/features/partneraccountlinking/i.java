package com.spotify.music.features.partneraccountlinking;

import com.spotify.music.features.partneraccountlinking.PartnerAccountLinkingError;

/* access modifiers changed from: package-private */
public final class i extends PartnerAccountLinkingError {
    private final PartnerAccountLinkingError.ErrorType a;
    private final String b;

    i(PartnerAccountLinkingError.ErrorType errorType, String str) {
        if (errorType != null) {
            this.a = errorType;
            if (str != null) {
                this.b = str;
                return;
            }
            throw new NullPointerException("Null errorMessage");
        }
        throw new NullPointerException("Null errorType");
    }

    @Override // com.spotify.music.features.partneraccountlinking.PartnerAccountLinkingError
    public String a() {
        return this.b;
    }

    @Override // com.spotify.music.features.partneraccountlinking.PartnerAccountLinkingError
    public PartnerAccountLinkingError.ErrorType b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PartnerAccountLinkingError)) {
            return false;
        }
        PartnerAccountLinkingError partnerAccountLinkingError = (PartnerAccountLinkingError) obj;
        if (!this.a.equals(partnerAccountLinkingError.b()) || !this.b.equals(partnerAccountLinkingError.a())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("PartnerAccountLinkingError{errorType=");
        V0.append(this.a);
        V0.append(", errorMessage=");
        return je.I0(V0, this.b, "}");
    }
}

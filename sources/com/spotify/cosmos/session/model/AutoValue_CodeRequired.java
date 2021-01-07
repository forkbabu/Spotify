package com.spotify.cosmos.session.model;

final class AutoValue_CodeRequired extends CodeRequired {
    private final String canonicalPhoneNumber;
    private final String challengeId;
    private final long codeLength;
    private final long expiresIn;
    private final int method;
    private final int retryNumber;

    AutoValue_CodeRequired(String str, int i, long j, String str2, long j2, int i2) {
        if (str != null) {
            this.challengeId = str;
            this.method = i;
            this.codeLength = j;
            if (str2 != null) {
                this.canonicalPhoneNumber = str2;
                this.expiresIn = j2;
                this.retryNumber = i2;
                return;
            }
            throw new NullPointerException("Null canonicalPhoneNumber");
        }
        throw new NullPointerException("Null challengeId");
    }

    @Override // com.spotify.cosmos.session.model.CodeRequired
    public String canonicalPhoneNumber() {
        return this.canonicalPhoneNumber;
    }

    @Override // com.spotify.cosmos.session.model.CodeRequired
    public String challengeId() {
        return this.challengeId;
    }

    @Override // com.spotify.cosmos.session.model.CodeRequired
    public long codeLength() {
        return this.codeLength;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CodeRequired)) {
            return false;
        }
        CodeRequired codeRequired = (CodeRequired) obj;
        if (this.challengeId.equals(codeRequired.challengeId()) && this.method == codeRequired.method() && this.codeLength == codeRequired.codeLength() && this.canonicalPhoneNumber.equals(codeRequired.canonicalPhoneNumber()) && this.expiresIn == codeRequired.expiresIn() && this.retryNumber == codeRequired.retryNumber()) {
            return true;
        }
        return false;
    }

    @Override // com.spotify.cosmos.session.model.CodeRequired
    public long expiresIn() {
        return this.expiresIn;
    }

    public int hashCode() {
        long j = this.codeLength;
        long j2 = this.expiresIn;
        return ((((((((((this.challengeId.hashCode() ^ 1000003) * 1000003) ^ this.method) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.canonicalPhoneNumber.hashCode()) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.retryNumber;
    }

    @Override // com.spotify.cosmos.session.model.CodeRequired
    public int method() {
        return this.method;
    }

    @Override // com.spotify.cosmos.session.model.CodeRequired
    public int retryNumber() {
        return this.retryNumber;
    }

    public String toString() {
        StringBuilder V0 = je.V0("CodeRequired{challengeId=");
        V0.append(this.challengeId);
        V0.append(", method=");
        V0.append(this.method);
        V0.append(", codeLength=");
        V0.append(this.codeLength);
        V0.append(", canonicalPhoneNumber=");
        V0.append(this.canonicalPhoneNumber);
        V0.append(", expiresIn=");
        V0.append(this.expiresIn);
        V0.append(", retryNumber=");
        return je.B0(V0, this.retryNumber, "}");
    }
}

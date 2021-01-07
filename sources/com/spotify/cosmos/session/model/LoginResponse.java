package com.spotify.cosmos.session.model;

public abstract class LoginResponse {

    public static final class BootstrapRequired extends LoginResponse {
        private final String accessToken;

        BootstrapRequired(String str) {
            str.getClass();
            this.accessToken = str;
        }

        public final String accessToken() {
            return this.accessToken;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BootstrapRequired)) {
                return false;
            }
            return ((BootstrapRequired) obj).accessToken.equals(this.accessToken);
        }

        public int hashCode() {
            return this.accessToken.hashCode() + 0;
        }

        @Override // com.spotify.cosmos.session.model.LoginResponse
        public final <R_> R_ map(ti0<Success, R_> ti0, ti0<Error, R_> ti02, ti0<CodeSuccess, R_> ti03, ti0<CodeRequired, R_> ti04, ti0<BootstrapRequired, R_> ti05) {
            return ti05.apply(this);
        }

        @Override // com.spotify.cosmos.session.model.LoginResponse
        public final void match(si0<Success> si0, si0<Error> si02, si0<CodeSuccess> si03, si0<CodeRequired> si04, si0<BootstrapRequired> si05) {
            si05.accept(this);
        }

        public String toString() {
            return je.H0(je.V0("BootstrapRequired{accessToken="), this.accessToken, '}');
        }
    }

    public static final class CodeRequired extends LoginResponse {
        private final String canonicalPhoneNumber;
        private final String challengeId;
        private final long codeLength;
        private final long expiresIn;
        private final int method;
        private final int retryNumber;

        CodeRequired(String str, int i, long j, String str2, long j2, int i2) {
            str.getClass();
            this.challengeId = str;
            this.method = i;
            this.codeLength = j;
            str2.getClass();
            this.canonicalPhoneNumber = str2;
            this.expiresIn = j2;
            this.retryNumber = i2;
        }

        public final String canonicalPhoneNumber() {
            return this.canonicalPhoneNumber;
        }

        public final String challengeId() {
            return this.challengeId;
        }

        public final long codeLength() {
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
            if (codeRequired.method == this.method && codeRequired.codeLength == this.codeLength && codeRequired.expiresIn == this.expiresIn && codeRequired.retryNumber == this.retryNumber && codeRequired.challengeId.equals(this.challengeId) && codeRequired.canonicalPhoneNumber.equals(this.canonicalPhoneNumber)) {
                return true;
            }
            return false;
        }

        public final long expiresIn() {
            return this.expiresIn;
        }

        public int hashCode() {
            int K = je.K(this.method, je.Y0(this.challengeId, 0, 31), 31);
            int Y0 = je.Y0(this.canonicalPhoneNumber, (Long.valueOf(this.codeLength).hashCode() + K) * 31, 31);
            return je.b(this.retryNumber, (Long.valueOf(this.expiresIn).hashCode() + Y0) * 31);
        }

        @Override // com.spotify.cosmos.session.model.LoginResponse
        public final <R_> R_ map(ti0<Success, R_> ti0, ti0<Error, R_> ti02, ti0<CodeSuccess, R_> ti03, ti0<CodeRequired, R_> ti04, ti0<BootstrapRequired, R_> ti05) {
            return ti04.apply(this);
        }

        @Override // com.spotify.cosmos.session.model.LoginResponse
        public final void match(si0<Success> si0, si0<Error> si02, si0<CodeSuccess> si03, si0<CodeRequired> si04, si0<BootstrapRequired> si05) {
            si04.accept(this);
        }

        public final int method() {
            return this.method;
        }

        public final int retryNumber() {
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
            return je.A0(V0, this.retryNumber, '}');
        }
    }

    public static final class CodeSuccess extends LoginResponse {
        private final String email;
        private final Boolean emailAlreadyExist;
        private final String identifierToken;

        CodeSuccess(String str, String str2, Boolean bool) {
            this.identifierToken = str;
            this.email = str2;
            this.emailAlreadyExist = bool;
        }

        public final String email() {
            return this.email;
        }

        public final Boolean emailAlreadyExist() {
            return this.emailAlreadyExist;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CodeSuccess)) {
                return false;
            }
            CodeSuccess codeSuccess = (CodeSuccess) obj;
            if (!gf0.e(codeSuccess.identifierToken, this.identifierToken) || !gf0.e(codeSuccess.email, this.email) || !gf0.e(codeSuccess.emailAlreadyExist, this.emailAlreadyExist)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.identifierToken;
            int i = 0;
            int hashCode = ((str != null ? str.hashCode() : 0) + 0) * 31;
            String str2 = this.email;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            Boolean bool = this.emailAlreadyExist;
            if (bool != null) {
                i = bool.hashCode();
            }
            return hashCode2 + i;
        }

        public final String identifierToken() {
            return this.identifierToken;
        }

        @Override // com.spotify.cosmos.session.model.LoginResponse
        public final <R_> R_ map(ti0<Success, R_> ti0, ti0<Error, R_> ti02, ti0<CodeSuccess, R_> ti03, ti0<CodeRequired, R_> ti04, ti0<BootstrapRequired, R_> ti05) {
            return ti03.apply(this);
        }

        @Override // com.spotify.cosmos.session.model.LoginResponse
        public final void match(si0<Success> si0, si0<Error> si02, si0<CodeSuccess> si03, si0<CodeRequired> si04, si0<BootstrapRequired> si05) {
            si03.accept(this);
        }

        public String toString() {
            StringBuilder V0 = je.V0("CodeSuccess{identifierToken=");
            V0.append(this.identifierToken);
            V0.append(", email=");
            V0.append(this.email);
            V0.append(", emailAlreadyExist=");
            V0.append(this.emailAlreadyExist);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class Error extends LoginResponse {
        private final String error;
        private final int status;

        Error(int i, String str) {
            this.status = i;
            this.error = str;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error2 = (Error) obj;
            if (error2.status != this.status || !gf0.e(error2.error, this.error)) {
                return false;
            }
            return true;
        }

        public final String error() {
            return this.error;
        }

        public int hashCode() {
            int i = 0;
            int K = je.K(this.status, 0, 31);
            String str = this.error;
            if (str != null) {
                i = str.hashCode();
            }
            return K + i;
        }

        @Override // com.spotify.cosmos.session.model.LoginResponse
        public final <R_> R_ map(ti0<Success, R_> ti0, ti0<Error, R_> ti02, ti0<CodeSuccess, R_> ti03, ti0<CodeRequired, R_> ti04, ti0<BootstrapRequired, R_> ti05) {
            return ti02.apply(this);
        }

        @Override // com.spotify.cosmos.session.model.LoginResponse
        public final void match(si0<Success> si0, si0<Error> si02, si0<CodeSuccess> si03, si0<CodeRequired> si04, si0<BootstrapRequired> si05) {
            si02.accept(this);
        }

        public final int status() {
            return this.status;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Error{status=");
            V0.append(this.status);
            V0.append(", error=");
            return je.H0(V0, this.error, '}');
        }
    }

    public static final class Success extends LoginResponse {
        private final SessionInfo session;

        Success(SessionInfo sessionInfo) {
            sessionInfo.getClass();
            this.session = sessionInfo;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            return ((Success) obj).session.equals(this.session);
        }

        public int hashCode() {
            return this.session.hashCode() + 0;
        }

        @Override // com.spotify.cosmos.session.model.LoginResponse
        public final <R_> R_ map(ti0<Success, R_> ti0, ti0<Error, R_> ti02, ti0<CodeSuccess, R_> ti03, ti0<CodeRequired, R_> ti04, ti0<BootstrapRequired, R_> ti05) {
            return ti0.apply(this);
        }

        @Override // com.spotify.cosmos.session.model.LoginResponse
        public final void match(si0<Success> si0, si0<Error> si02, si0<CodeSuccess> si03, si0<CodeRequired> si04, si0<BootstrapRequired> si05) {
            si0.accept(this);
        }

        public final SessionInfo session() {
            return this.session;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Success{session=");
            V0.append(this.session);
            V0.append('}');
            return V0.toString();
        }
    }

    LoginResponse() {
    }

    public static LoginResponse bootstrapRequired(String str) {
        return new BootstrapRequired(str);
    }

    public static LoginResponse codeRequired(String str, int i, long j, String str2, long j2, int i2) {
        return new CodeRequired(str, i, j, str2, j2, i2);
    }

    public static LoginResponse codeSuccess(String str, String str2, Boolean bool) {
        return new CodeSuccess(str, str2, bool);
    }

    public static LoginResponse error(int i, String str) {
        return new Error(i, str);
    }

    public static LoginResponse success(SessionInfo sessionInfo) {
        return new Success(sessionInfo);
    }

    public final BootstrapRequired asBootstrapRequired() {
        return (BootstrapRequired) this;
    }

    public final CodeRequired asCodeRequired() {
        return (CodeRequired) this;
    }

    public final CodeSuccess asCodeSuccess() {
        return (CodeSuccess) this;
    }

    public final Error asError() {
        return (Error) this;
    }

    public final Success asSuccess() {
        return (Success) this;
    }

    public final boolean isBootstrapRequired() {
        return this instanceof BootstrapRequired;
    }

    public final boolean isCodeRequired() {
        return this instanceof CodeRequired;
    }

    public final boolean isCodeSuccess() {
        return this instanceof CodeSuccess;
    }

    public final boolean isError() {
        return this instanceof Error;
    }

    public final boolean isSuccess() {
        return this instanceof Success;
    }

    public abstract <R_> R_ map(ti0<Success, R_> ti0, ti0<Error, R_> ti02, ti0<CodeSuccess, R_> ti03, ti0<CodeRequired, R_> ti04, ti0<BootstrapRequired, R_> ti05);

    public abstract void match(si0<Success> si0, si0<Error> si02, si0<CodeSuccess> si03, si0<CodeRequired> si04, si0<BootstrapRequired> si05);
}

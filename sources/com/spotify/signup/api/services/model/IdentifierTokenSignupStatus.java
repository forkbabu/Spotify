package com.spotify.signup.api.services.model;

import com.spotify.signup.api.services.SignupErrorStatus;
import java.util.Map;

public abstract class IdentifierTokenSignupStatus {

    public static final class Error extends IdentifierTokenSignupStatus {
        private final Map<String, String> errors;
        private final SignupErrorStatus status;

        Error(SignupErrorStatus signupErrorStatus, Map<String, String> map) {
            signupErrorStatus.getClass();
            this.status = signupErrorStatus;
            map.getClass();
            this.errors = map;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            if (error.status != this.status || !error.errors.equals(this.errors)) {
                return false;
            }
            return true;
        }

        public final Map<String, String> errors() {
            return this.errors;
        }

        public int hashCode() {
            return this.errors.hashCode() + ((this.status.hashCode() + 0) * 31);
        }

        @Override // com.spotify.signup.api.services.model.IdentifierTokenSignupStatus
        public final <R_> R_ map(ti0<Ok, R_> ti0, ti0<Error, R_> ti02, ti0<Unknown, R_> ti03) {
            return ti02.apply(this);
        }

        @Override // com.spotify.signup.api.services.model.IdentifierTokenSignupStatus
        public final void match(si0<Ok> si0, si0<Error> si02, si0<Unknown> si03) {
            si02.accept(this);
        }

        public final SignupErrorStatus status() {
            return this.status;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Error{status=");
            V0.append(this.status);
            V0.append(", errors=");
            V0.append(this.errors);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class Ok extends IdentifierTokenSignupStatus {
        private final String oneTimeToken;
        private final String username;

        Ok(String str, String str2) {
            str.getClass();
            this.username = str;
            str2.getClass();
            this.oneTimeToken = str2;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Ok)) {
                return false;
            }
            Ok ok = (Ok) obj;
            if (!ok.username.equals(this.username) || !ok.oneTimeToken.equals(this.oneTimeToken)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.oneTimeToken.hashCode() + je.Y0(this.username, 0, 31);
        }

        @Override // com.spotify.signup.api.services.model.IdentifierTokenSignupStatus
        public final <R_> R_ map(ti0<Ok, R_> ti0, ti0<Error, R_> ti02, ti0<Unknown, R_> ti03) {
            return ti0.apply(this);
        }

        @Override // com.spotify.signup.api.services.model.IdentifierTokenSignupStatus
        public final void match(si0<Ok> si0, si0<Error> si02, si0<Unknown> si03) {
            si0.accept(this);
        }

        public final String oneTimeToken() {
            return this.oneTimeToken;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Ok{username=");
            V0.append(this.username);
            V0.append(", oneTimeToken=");
            V0.append("***");
            V0.append('}');
            return V0.toString();
        }

        public final String username() {
            return this.username;
        }
    }

    public static final class Unknown extends IdentifierTokenSignupStatus {
        Unknown() {
        }

        public boolean equals(Object obj) {
            return obj instanceof Unknown;
        }

        public int hashCode() {
            return 0;
        }

        @Override // com.spotify.signup.api.services.model.IdentifierTokenSignupStatus
        public final <R_> R_ map(ti0<Ok, R_> ti0, ti0<Error, R_> ti02, ti0<Unknown, R_> ti03) {
            return ti03.apply(this);
        }

        @Override // com.spotify.signup.api.services.model.IdentifierTokenSignupStatus
        public final void match(si0<Ok> si0, si0<Error> si02, si0<Unknown> si03) {
            si03.accept(this);
        }

        public String toString() {
            return "Unknown{}";
        }
    }

    IdentifierTokenSignupStatus() {
    }

    public static IdentifierTokenSignupStatus error(SignupErrorStatus signupErrorStatus, Map<String, String> map) {
        return new Error(signupErrorStatus, map);
    }

    public static IdentifierTokenSignupStatus ok(String str, String str2) {
        return new Ok(str, str2);
    }

    public static IdentifierTokenSignupStatus unknown() {
        return new Unknown();
    }

    public final Error asError() {
        return (Error) this;
    }

    public final Ok asOk() {
        return (Ok) this;
    }

    public final Unknown asUnknown() {
        return (Unknown) this;
    }

    public final boolean isError() {
        return this instanceof Error;
    }

    public final boolean isOk() {
        return this instanceof Ok;
    }

    public final boolean isUnknown() {
        return this instanceof Unknown;
    }

    public abstract <R_> R_ map(ti0<Ok, R_> ti0, ti0<Error, R_> ti02, ti0<Unknown, R_> ti03);

    public abstract void match(si0<Ok> si0, si0<Error> si02, si0<Unknown> si03);
}

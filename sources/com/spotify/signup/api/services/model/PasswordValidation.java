package com.spotify.signup.api.services.model;

import java.util.Map;

public abstract class PasswordValidation {

    public static final class Error extends PasswordValidation {
        private final Map<String, String> errors;
        private final int status;

        Error(int i, Map<String, String> map) {
            this.status = i;
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
            return this.errors.hashCode() + je.K(this.status, 0, 31);
        }

        @Override // com.spotify.signup.api.services.model.PasswordValidation
        public final <R_> R_ map(ti0<Ok, R_> ti0, ti0<Error, R_> ti02) {
            return ti02.apply(this);
        }

        @Override // com.spotify.signup.api.services.model.PasswordValidation
        public final void match(si0<Ok> si0, si0<Error> si02) {
            si02.accept(this);
        }

        public final int status() {
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

    public static final class Ok extends PasswordValidation {
        Ok() {
        }

        public boolean equals(Object obj) {
            return obj instanceof Ok;
        }

        public int hashCode() {
            return 0;
        }

        @Override // com.spotify.signup.api.services.model.PasswordValidation
        public final <R_> R_ map(ti0<Ok, R_> ti0, ti0<Error, R_> ti02) {
            return ti0.apply(this);
        }

        @Override // com.spotify.signup.api.services.model.PasswordValidation
        public final void match(si0<Ok> si0, si0<Error> si02) {
            si0.accept(this);
        }

        public String toString() {
            return "Ok{}";
        }
    }

    PasswordValidation() {
    }

    public static PasswordValidation error(int i, Map<String, String> map) {
        return new Error(i, map);
    }

    public static PasswordValidation ok() {
        return new Ok();
    }

    public final Error asError() {
        return (Error) this;
    }

    public final Ok asOk() {
        return (Ok) this;
    }

    public final boolean isError() {
        return this instanceof Error;
    }

    public final boolean isOk() {
        return this instanceof Ok;
    }

    public abstract <R_> R_ map(ti0<Ok, R_> ti0, ti0<Error, R_> ti02);

    public abstract void match(si0<Ok> si0, si0<Error> si02);
}

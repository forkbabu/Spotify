package com.spotify.signup.api.services.model;

public abstract class FacebookSignupStatus {

    public static final class Error extends FacebookSignupStatus {
        private final String message;
        private final int statusCode;

        Error(String str, int i) {
            str.getClass();
            this.message = str;
            this.statusCode = i;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            if (error.statusCode != this.statusCode || !error.message.equals(this.message)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return je.b(this.statusCode, je.Y0(this.message, 0, 31));
        }

        @Override // com.spotify.signup.api.services.model.FacebookSignupStatus
        public final <R_> R_ map(ti0<Ok, R_> ti0, ti0<Error, R_> ti02) {
            return ti02.apply(this);
        }

        @Override // com.spotify.signup.api.services.model.FacebookSignupStatus
        public final void match(si0<Ok> si0, si0<Error> si02) {
            si02.accept(this);
        }

        public final String message() {
            return this.message;
        }

        public final int statusCode() {
            return this.statusCode;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Error{message=");
            V0.append(this.message);
            V0.append(", statusCode=");
            return je.A0(V0, this.statusCode, '}');
        }
    }

    public static final class Ok extends FacebookSignupStatus {
        private final String username;

        Ok(String str) {
            str.getClass();
            this.username = str;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Ok)) {
                return false;
            }
            return ((Ok) obj).username.equals(this.username);
        }

        public int hashCode() {
            return this.username.hashCode() + 0;
        }

        @Override // com.spotify.signup.api.services.model.FacebookSignupStatus
        public final <R_> R_ map(ti0<Ok, R_> ti0, ti0<Error, R_> ti02) {
            return ti0.apply(this);
        }

        @Override // com.spotify.signup.api.services.model.FacebookSignupStatus
        public final void match(si0<Ok> si0, si0<Error> si02) {
            si0.accept(this);
        }

        public String toString() {
            return je.H0(je.V0("Ok{username="), this.username, '}');
        }

        public final String username() {
            return this.username;
        }
    }

    FacebookSignupStatus() {
    }

    public static FacebookSignupStatus error(String str, int i) {
        return new Error(str, i);
    }

    public static FacebookSignupStatus ok(String str) {
        return new Ok(str);
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

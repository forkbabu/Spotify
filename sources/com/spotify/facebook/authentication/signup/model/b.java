package com.spotify.facebook.authentication.signup.model;

import com.spotify.signup.api.services.model.SignupConfigurationResponse;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class b {

    public static final class a extends b {
        private final Failure a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Failure failure) {
            super(null);
            h.e(failure, "failure");
            this.a = failure;
        }

        public final Failure a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && h.a(this.a, ((a) obj).a);
            }
            return true;
        }

        public int hashCode() {
            Failure failure = this.a;
            if (failure != null) {
                return failure.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Failed(failure=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: com.spotify.facebook.authentication.signup.model.b$b  reason: collision with other inner class name */
    public static final class C0155b extends b {
        public static final C0155b a = new C0155b();

        private C0155b() {
            super(null);
        }
    }

    public static final class c extends b {
        private final SignupConfigurationResponse a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(SignupConfigurationResponse signupConfigurationResponse) {
            super(null);
            h.e(signupConfigurationResponse, "response");
            this.a = signupConfigurationResponse;
        }

        public final SignupConfigurationResponse a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && h.a(this.a, ((c) obj).a);
            }
            return true;
        }

        public int hashCode() {
            SignupConfigurationResponse signupConfigurationResponse = this.a;
            if (signupConfigurationResponse != null) {
                return signupConfigurationResponse.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Successful(response=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    private b() {
    }

    public b(f fVar) {
    }
}

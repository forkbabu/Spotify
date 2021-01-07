package com.spotify.encore.consumer.components.authentication.api.authenticationbutton;

import com.spotify.encore.Component;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface AuthenticationButton extends Component<Model, Events> {

    public enum AuthenticationType {
        APPLE,
        PHONE_NUMBER,
        FACEBOOK,
        GOOGLE,
        EMAIL,
        EMAIL_LOG_IN,
        EMAIL_LOGIN_LEGACY,
        EMAIL_SIGNUP_PREMIUM,
        EMAIL_SIGNUP_LEGACY,
        MORE_OPTIONS
    }

    public static final class DefaultImpls {
        public static void onEvent(AuthenticationButton authenticationButton, nmf<? super Events, f> nmf) {
            h.e(nmf, "event");
            Component.DefaultImpls.onEvent(authenticationButton, nmf);
        }
    }

    public static abstract class Events {

        public static final class Clicked extends Events {
            public static final Clicked INSTANCE = new Clicked();

            private Clicked() {
                super(null);
            }
        }

        private Events() {
        }

        public /* synthetic */ Events(kotlin.jvm.internal.f fVar) {
            this();
        }
    }

    public static final class Model {
        private final boolean isPreferred;
        private final AuthenticationType type;

        public Model(AuthenticationType authenticationType, boolean z) {
            h.e(authenticationType, "type");
            this.type = authenticationType;
            this.isPreferred = z;
        }

        public static /* synthetic */ Model copy$default(Model model, AuthenticationType authenticationType, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                authenticationType = model.type;
            }
            if ((i & 2) != 0) {
                z = model.isPreferred;
            }
            return model.copy(authenticationType, z);
        }

        public final AuthenticationType component1() {
            return this.type;
        }

        public final boolean component2() {
            return this.isPreferred;
        }

        public final Model copy(AuthenticationType authenticationType, boolean z) {
            h.e(authenticationType, "type");
            return new Model(authenticationType, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return h.a(this.type, model.type) && this.isPreferred == model.isPreferred;
        }

        public final AuthenticationType getType() {
            return this.type;
        }

        public int hashCode() {
            AuthenticationType authenticationType = this.type;
            int hashCode = (authenticationType != null ? authenticationType.hashCode() : 0) * 31;
            boolean z = this.isPreferred;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            return hashCode + i;
        }

        public final boolean isPreferred() {
            return this.isPreferred;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(type=");
            V0.append(this.type);
            V0.append(", isPreferred=");
            return je.P0(V0, this.isPreferred, ")");
        }
    }
}

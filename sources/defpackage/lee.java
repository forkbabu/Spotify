package defpackage;

import com.spotify.signup.api.services.model.EmailSignupStatus;
import com.spotify.signup.api.services.model.FacebookSignupStatus;
import com.spotify.signup.api.services.model.IdentifierTokenSignupStatus;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: lee  reason: default package */
public abstract class lee {

    /* renamed from: lee$a */
    public static final class a extends lee {
        private final EmailSignupStatus a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(EmailSignupStatus emailSignupStatus) {
            super(null);
            h.e(emailSignupStatus, "status");
            this.a = emailSignupStatus;
        }

        public final EmailSignupStatus a() {
            return this.a;
        }
    }

    /* renamed from: lee$b */
    public static final class b extends lee {
        private final FacebookSignupStatus a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(FacebookSignupStatus facebookSignupStatus) {
            super(null);
            h.e(facebookSignupStatus, "status");
            this.a = facebookSignupStatus;
        }

        public final FacebookSignupStatus a() {
            return this.a;
        }
    }

    /* renamed from: lee$c */
    public static final class c extends lee {
        private final IdentifierTokenSignupStatus a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(IdentifierTokenSignupStatus identifierTokenSignupStatus) {
            super(null);
            h.e(identifierTokenSignupStatus, "status");
            this.a = identifierTokenSignupStatus;
        }

        public final IdentifierTokenSignupStatus a() {
            return this.a;
        }
    }

    public lee(f fVar) {
    }
}

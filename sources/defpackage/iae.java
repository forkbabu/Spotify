package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.signup.api.services.a;
import com.spotify.signup.api.services.model.EmailSignupRequestBody;
import com.spotify.signup.api.services.model.EmailSignupResponse;
import com.spotify.signup.api.services.model.EmailValidationAndDisplayNameSuggestionResponse;
import com.spotify.signup.api.services.model.FacebookSignupRequest;
import com.spotify.signup.api.services.model.FacebookSignupResponse;
import com.spotify.signup.api.services.model.IdentifierTokenSignupRequestBody;
import com.spotify.signup.api.services.model.IdentifierTokenSignupResponse;
import com.spotify.signup.api.services.model.PasswordValidationResponse;
import com.spotify.signup.api.services.model.SignupConfigurationResponse;
import io.reactivex.z;

/* renamed from: iae  reason: default package */
public class iae {
    private final a a;
    private final String b;
    private final String c;

    private iae(a aVar, String str, String str2) {
        this.a = aVar;
        this.b = MoreObjects.isNullOrEmpty(str) ? jae.b : str;
        this.c = str2;
    }

    public static iae a(a aVar, String str) {
        return new iae(aVar, null, str);
    }

    public z<SignupConfigurationResponse> b() {
        return this.a.b(this.b);
    }

    public z<EmailSignupResponse> c(EmailSignupRequestBody emailSignupRequestBody) {
        EmailSignupRequestBody withKey = emailSignupRequestBody.withKey(this.b);
        if (!MoreObjects.isNullOrEmpty(this.c)) {
            withKey = withKey.withCreationPoint(this.c);
        }
        return this.a.a(withKey);
    }

    public z<FacebookSignupResponse> d(FacebookSignupRequest facebookSignupRequest) {
        FacebookSignupRequest withKey = facebookSignupRequest.withKey(this.b);
        if (!MoreObjects.isNullOrEmpty(this.c)) {
            withKey = withKey.withCreationPoint(this.c);
        }
        return this.a.d(withKey);
    }

    public z<IdentifierTokenSignupResponse> e(IdentifierTokenSignupRequestBody identifierTokenSignupRequestBody) {
        IdentifierTokenSignupRequestBody withKey = identifierTokenSignupRequestBody.withKey(this.b);
        if (!MoreObjects.isNullOrEmpty(this.c)) {
            withKey = withKey.withCreationPoint(this.c);
        }
        return this.a.e(withKey);
    }

    public z<EmailValidationAndDisplayNameSuggestionResponse> f(String str) {
        return this.a.f(this.b, str);
    }

    public z<PasswordValidationResponse> g(String str) {
        return this.a.c(this.b, str);
    }
}

package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.libs.signup.validators.AgeValidator;
import com.spotify.signup.api.services.model.SignupConfigurationResponse;
import io.reactivex.functions.g;

/* renamed from: dge  reason: default package */
public final /* synthetic */ class dge implements g {
    public final /* synthetic */ AgeValidator a;
    public final /* synthetic */ i31 b;

    public /* synthetic */ dge(AgeValidator ageValidator, i31 i31) {
        this.a = ageValidator;
        this.b = i31;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        AgeValidator ageValidator = this.a;
        i31 i31 = this.b;
        SignupConfigurationResponse signupConfigurationResponse = (SignupConfigurationResponse) obj;
        ageValidator.a(signupConfigurationResponse.minimumAge);
        i31.a(signupConfigurationResponse.requiresMarketingOptIn, signupConfigurationResponse.country.equals("KR"));
        Logger.g("Signup config: %s", signupConfigurationResponse);
    }
}

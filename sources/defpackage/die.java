package defpackage;

import com.spotify.signup.api.services.model.EmailValidationAndDisplayNameSuggestion;
import defpackage.hie;

/* renamed from: die  reason: default package */
public final /* synthetic */ class die implements ti0 {
    public final /* synthetic */ String a;

    public /* synthetic */ die(String str) {
        this.a = str;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        String str = this.a;
        EmailValidationAndDisplayNameSuggestion.Error error = (EmailValidationAndDisplayNameSuggestion.Error) obj;
        int status = error.status();
        if (status == 20) {
            return new hie.b(str, 20);
        }
        if (status == 130) {
            return new hie.b(str, 130);
        }
        if (status != 320) {
            return new hie.a(str, null);
        }
        return new hie.a(str, error.errors().get("generic_error"));
    }
}

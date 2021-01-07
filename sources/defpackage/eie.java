package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.signup.api.services.model.EmailValidationAndDisplayNameSuggestion;
import com.spotify.signup.api.services.model.EmailValidationAndDisplayNameSuggestionResponse;
import defpackage.hie;

/* renamed from: eie  reason: default package */
public final /* synthetic */ class eie implements ti0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ EmailValidationAndDisplayNameSuggestionResponse b;

    public /* synthetic */ eie(String str, EmailValidationAndDisplayNameSuggestionResponse emailValidationAndDisplayNameSuggestionResponse) {
        this.a = str;
        this.b = emailValidationAndDisplayNameSuggestionResponse;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        EmailValidationAndDisplayNameSuggestion.Ok ok = (EmailValidationAndDisplayNameSuggestion.Ok) obj;
        return new hie.c(this.a, MoreObjects.nullToEmpty(this.b.status().asOk().displayNameSuggestion()));
    }
}

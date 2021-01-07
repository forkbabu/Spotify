package defpackage;

import com.spotify.signup.api.services.model.EmailValidationAndDisplayNameSuggestionResponse;
import io.reactivex.functions.l;

/* renamed from: fie  reason: default package */
public final /* synthetic */ class fie implements l {
    public final /* synthetic */ String a;

    public /* synthetic */ fie(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        String str = this.a;
        EmailValidationAndDisplayNameSuggestionResponse emailValidationAndDisplayNameSuggestionResponse = (EmailValidationAndDisplayNameSuggestionResponse) obj;
        return (hie) emailValidationAndDisplayNameSuggestionResponse.status().map(new eie(str, emailValidationAndDisplayNameSuggestionResponse), new die(str));
    }
}

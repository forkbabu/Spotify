package defpackage;

import com.spotify.signup.api.services.model.IdentifierTokenSignupResponse;
import defpackage.lee;
import io.reactivex.functions.l;

/* renamed from: ffe  reason: default package */
public final /* synthetic */ class ffe implements l {
    public static final /* synthetic */ ffe a = new ffe();

    private /* synthetic */ ffe() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return iee.b(new lee.c(((IdentifierTokenSignupResponse) obj).status()));
    }
}

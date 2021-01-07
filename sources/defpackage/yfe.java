package defpackage;

import com.spotify.signup.api.services.model.FacebookSignupResponse;
import defpackage.lee;
import io.reactivex.functions.l;
import io.reactivex.s;

/* renamed from: yfe  reason: default package */
public final /* synthetic */ class yfe implements l {
    public static final /* synthetic */ yfe a = new yfe();

    private /* synthetic */ yfe() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return s.i0(iee.b(new lee.b(((FacebookSignupResponse) obj).status())));
    }
}

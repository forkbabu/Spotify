package defpackage;

import com.spotify.signup.api.services.model.EmailSignupResponse;
import defpackage.lee;
import io.reactivex.functions.l;
import io.reactivex.s;

/* renamed from: age  reason: default package */
public final /* synthetic */ class age implements l {
    public static final /* synthetic */ age a = new age();

    private /* synthetic */ age() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return s.i0(iee.b(new lee.a(((EmailSignupResponse) obj).status())));
    }
}

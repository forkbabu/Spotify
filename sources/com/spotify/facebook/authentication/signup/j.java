package com.spotify.facebook.authentication.signup;

import com.spotify.facebook.authentication.signup.model.Failure;
import com.spotify.facebook.authentication.signup.model.b;
import io.reactivex.functions.l;
import io.reactivex.s;

public final /* synthetic */ class j implements l {
    public final /* synthetic */ CreateAccountPresenter a;

    public /* synthetic */ j(CreateAccountPresenter createAccountPresenter) {
        this.a = createAccountPresenter;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        CreateAccountPresenter createAccountPresenter = this.a;
        createAccountPresenter.getClass();
        if (!((Boolean) obj).booleanValue()) {
            return s.i0(new b.a(Failure.OFFLINE));
        }
        return createAccountPresenter.y.P().j0(r.a).G0((R) b.C0155b.a).r0(q.a);
    }
}

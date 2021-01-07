package com.spotify.signup.splitflow;

import com.spotify.signup.api.services.model.FacebookSignupStatus;

public final /* synthetic */ class m1 implements si0 {
    public final /* synthetic */ x1 a;

    public /* synthetic */ m1(x1 x1Var) {
        this.a = x1Var;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        this.a.G((FacebookSignupStatus.Error) obj);
    }
}

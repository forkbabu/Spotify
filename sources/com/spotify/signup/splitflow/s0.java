package com.spotify.signup.splitflow;

import com.spotify.signup.api.services.model.EmailSignupStatus;

public final /* synthetic */ class s0 implements si0 {
    public final /* synthetic */ x1 a;

    public /* synthetic */ s0(x1 x1Var) {
        this.a = x1Var;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        this.a.B((EmailSignupStatus.Error) obj);
    }
}

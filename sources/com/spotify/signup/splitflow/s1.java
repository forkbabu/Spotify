package com.spotify.signup.splitflow;

import com.spotify.signup.api.services.model.EmailSignupStatus;

public final /* synthetic */ class s1 implements si0 {
    public final /* synthetic */ x1 a;

    public /* synthetic */ s1(x1 x1Var) {
        this.a = x1Var;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        this.a.C((EmailSignupStatus.Unknown) obj);
    }
}

package com.spotify.effortlesslogin.prerequisites;

import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ qg0 a;

    public /* synthetic */ b(qg0 qg0) {
        this.a = qg0;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        qg0 qg0 = this.a;
        EffortlessLoginPrerequisitesResult effortlessLoginPrerequisitesResult = (EffortlessLoginPrerequisitesResult) obj;
        if (effortlessLoginPrerequisitesResult.enabled() && effortlessLoginPrerequisitesResult.fullName().isPresent()) {
            qg0.accept(effortlessLoginPrerequisitesResult.fullName().get());
        }
    }
}

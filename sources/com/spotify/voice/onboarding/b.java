package com.spotify.voice.onboarding;

import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ vff a;

    public /* synthetic */ b(vff vff) {
        this.a = vff;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        vff vff = this.a;
        if (((Boolean) obj).booleanValue()) {
            vff.a();
        } else {
            vff.b();
        }
    }
}

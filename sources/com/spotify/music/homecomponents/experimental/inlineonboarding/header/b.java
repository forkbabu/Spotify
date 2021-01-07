package com.spotify.music.homecomponents.experimental.inlineonboarding.header;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        int i = HomeInlineOnboardingHeaderCommandHandler.o;
        Assertion.i("Failed to complete inline onboarding complete request", (Throwable) obj);
    }
}

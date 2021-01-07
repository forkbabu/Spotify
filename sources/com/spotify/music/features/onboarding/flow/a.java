package com.spotify.music.features.onboarding.flow;

import com.spotify.loginflow.navigation.Destination;
import com.spotify.loginflow.navigation.d;
import io.reactivex.b0;
import io.reactivex.disposables.b;
import kotlin.jvm.internal.h;

public final class a implements b0<OnboardingDestination> {
    final /* synthetic */ OnboardingLauncherFragment a;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    a(OnboardingLauncherFragment onboardingLauncherFragment) {
        this.a = onboardingLauncherFragment;
    }

    @Override // io.reactivex.b0
    public void onError(Throwable th) {
        h.e(th, "e");
        d dVar = this.a.k0;
        if (dVar != null) {
            dVar.b(Destination.d.a);
        }
    }

    @Override // io.reactivex.b0
    public void onSubscribe(b bVar) {
        h.e(bVar, "d");
        OnboardingLauncherFragment.K4(this.a).b(bVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.b0
    public void onSuccess(OnboardingDestination onboardingDestination) {
        OnboardingDestination onboardingDestination2 = onboardingDestination;
        h.e(onboardingDestination2, "onboardingDestination");
        OnboardingLauncherFragment.L4(this.a, onboardingDestination2);
    }
}

package com.spotify.voice.experiments.onboarding;

import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ VoiceExperimentsOnboardingFragment a;

    public /* synthetic */ b(VoiceExperimentsOnboardingFragment voiceExperimentsOnboardingFragment) {
        this.a = voiceExperimentsOnboardingFragment;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        VoiceExperimentsOnboardingFragment voiceExperimentsOnboardingFragment = this.a;
        voiceExperimentsOnboardingFragment.j0.e();
        if (((Boolean) obj).booleanValue()) {
            voiceExperimentsOnboardingFragment.j0.a();
            voiceExperimentsOnboardingFragment.h0.a();
            voiceExperimentsOnboardingFragment.h0.b();
            voiceExperimentsOnboardingFragment.h0.dismiss();
            return;
        }
        voiceExperimentsOnboardingFragment.j0.b();
    }
}

package com.spotify.voice.experiments.onboarding;

import android.view.View;

public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ VoiceExperimentsOnboardingFragment a;

    public /* synthetic */ a(VoiceExperimentsOnboardingFragment voiceExperimentsOnboardingFragment) {
        this.a = voiceExperimentsOnboardingFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VoiceExperimentsOnboardingFragment voiceExperimentsOnboardingFragment = this.a;
        voiceExperimentsOnboardingFragment.j0.d();
        voiceExperimentsOnboardingFragment.h0.dismiss();
    }
}

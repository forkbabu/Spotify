package com.spotify.voice.experiments.onboarding;

import android.view.View;

public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ VoiceExperimentsOnboardingFragment a;

    public /* synthetic */ d(VoiceExperimentsOnboardingFragment voiceExperimentsOnboardingFragment) {
        this.a = voiceExperimentsOnboardingFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VoiceExperimentsOnboardingFragment voiceExperimentsOnboardingFragment = this.a;
        voiceExperimentsOnboardingFragment.j0.f("https://www.spotify.com/us/legal/voice-controls");
        voiceExperimentsOnboardingFragment.h0.e("https://www.spotify.com/us/legal/voice-controls");
    }
}

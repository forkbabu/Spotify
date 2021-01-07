package com.spotify.voice.experiments.experience.view;

import com.spotify.voice.experiments.experience.view.GuessingGameVoiceViews;
import defpackage.u8f;

public final /* synthetic */ class b0 implements si0 {
    public final /* synthetic */ GuessingGameVoiceViews.b a;

    public /* synthetic */ b0(GuessingGameVoiceViews.b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        GuessingGameVoiceViews.b bVar = this.a;
        u8f.i iVar = (u8f.i) obj;
        bVar.getClass();
        if (iVar.l().isPresent()) {
            GuessingGameVoiceViews.u(GuessingGameVoiceViews.this, new v(bVar, iVar));
        } else {
            GuessingGameVoiceViews.i(GuessingGameVoiceViews.this);
        }
    }
}

package com.spotify.voice.experiments.experience.view;

import com.spotify.voice.api.model.ClientAction;
import com.spotify.voice.experiments.experience.view.GuessingGameVoiceViews;
import defpackage.u8f;

public final /* synthetic */ class f0 implements si0 {
    public final /* synthetic */ GuessingGameVoiceViews.b a;

    public /* synthetic */ f0(GuessingGameVoiceViews.b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        GuessingGameVoiceViews.b bVar = this.a;
        bVar.getClass();
        ClientAction l = ((u8f.g) obj).l();
        if (l != null) {
            int ordinal = l.ordinal();
            if (ordinal == 5) {
                GuessingGameVoiceViews.this.v.k(GuessingGameVoiceViews.this.w.b(), GuessingGameVoiceViews.this.w.d());
            } else if (ordinal == 30) {
                GuessingGameVoiceViews.this.v.h(GuessingGameVoiceViews.this.w.b(), GuessingGameVoiceViews.this.w.d());
            }
        }
    }
}

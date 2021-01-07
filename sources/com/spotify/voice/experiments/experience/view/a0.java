package com.spotify.voice.experiments.experience.view;

import com.spotify.mobile.android.util.d0;
import com.spotify.voice.experiments.experience.view.GuessingGameVoiceViews;
import defpackage.u8f;
import java.util.Locale;

public final /* synthetic */ class a0 implements si0 {
    public final /* synthetic */ GuessingGameVoiceViews.b a;

    public /* synthetic */ a0(GuessingGameVoiceViews.b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        GuessingGameVoiceViews.g(GuessingGameVoiceViews.this, d0.a(((u8f.j) obj).l(), Locale.getDefault()));
    }
}

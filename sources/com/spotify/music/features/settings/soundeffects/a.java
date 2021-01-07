package com.spotify.music.features.settings.soundeffects;

import android.content.DialogInterface;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.features.settings.soundeffects.SoundEffectsWarningActivity;

public final /* synthetic */ class a implements DialogInterface.OnClickListener {
    public final /* synthetic */ f a;
    public final /* synthetic */ c b;

    public /* synthetic */ a(f fVar, c cVar) {
        this.a = fVar;
        this.b = cVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        SoundEffectsWarningActivity.a aVar = (SoundEffectsWarningActivity.a) this.a;
        if (this.b.d()) {
            SoundEffectsWarningActivity soundEffectsWarningActivity = SoundEffectsWarningActivity.this;
            SpSharedPreferences.a<Object> b2 = soundEffectsWarningActivity.G.d(soundEffectsWarningActivity).b();
            b2.a(SoundEffectsWarningActivity.L, true);
            b2.i();
        }
        SoundEffectsWarningActivity soundEffectsWarningActivity2 = SoundEffectsWarningActivity.this;
        soundEffectsWarningActivity2.getClass();
        SoundEffectsWarningActivity.U0(new d(soundEffectsWarningActivity2, soundEffectsWarningActivity2));
    }
}

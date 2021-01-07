package com.spotify.music.features.settings.soundeffects;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.spotify.music.features.settings.soundeffects.SoundEffectsWarningActivity;
import com.spotify.music.z0;

class d implements SoundEffectsWarningActivity.c {
    final /* synthetic */ Activity a;
    final /* synthetic */ SoundEffectsWarningActivity b;

    d(SoundEffectsWarningActivity soundEffectsWarningActivity, Activity activity) {
        this.b = soundEffectsWarningActivity;
        this.a = activity;
    }

    @Override // com.spotify.music.features.settings.soundeffects.SoundEffectsWarningActivity.c
    public z0 a() {
        return this.b.H;
    }

    @Override // com.spotify.music.features.settings.soundeffects.SoundEffectsWarningActivity.c
    public String b() {
        return this.b.I;
    }

    @Override // com.spotify.music.features.settings.soundeffects.SoundEffectsWarningActivity.c
    public ComponentName c(Intent intent) {
        return this.a.startService(intent);
    }

    @Override // com.spotify.music.features.settings.soundeffects.SoundEffectsWarningActivity.c
    public String d() {
        return this.b.J;
    }

    @Override // com.spotify.music.features.settings.soundeffects.SoundEffectsWarningActivity.c
    public Context getContext() {
        return this.a;
    }

    @Override // com.spotify.music.features.settings.soundeffects.SoundEffectsWarningActivity.c
    public void startActivityForResult(Intent intent, int i) {
        this.a.startActivityForResult(intent, i);
    }
}

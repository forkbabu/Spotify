package com.spotify.music.features.settings.adapter;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.spotify.music.features.settings.soundeffects.SoundEffectsWarningActivity;
import com.spotify.music.z0;

/* access modifiers changed from: package-private */
public class r2 implements SoundEffectsWarningActivity.c {
    final /* synthetic */ p2 a;

    r2(p2 p2Var) {
        this.a = p2Var;
    }

    @Override // com.spotify.music.features.settings.soundeffects.SoundEffectsWarningActivity.c
    public z0 a() {
        return this.a.L;
    }

    @Override // com.spotify.music.features.settings.soundeffects.SoundEffectsWarningActivity.c
    public String b() {
        return this.a.M;
    }

    @Override // com.spotify.music.features.settings.soundeffects.SoundEffectsWarningActivity.c
    public ComponentName c(Intent intent) {
        return this.a.b.startService(intent);
    }

    @Override // com.spotify.music.features.settings.soundeffects.SoundEffectsWarningActivity.c
    public String d() {
        return this.a.N;
    }

    @Override // com.spotify.music.features.settings.soundeffects.SoundEffectsWarningActivity.c
    public Context getContext() {
        return this.a.b;
    }

    @Override // com.spotify.music.features.settings.soundeffects.SoundEffectsWarningActivity.c
    public void startActivityForResult(Intent intent, int i) {
        ((Activity) this.a.b).startActivityForResult(intent, i);
    }
}

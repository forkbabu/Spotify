package com.spotify.music.features.settings.soundeffects;

import android.content.DialogInterface;

public final /* synthetic */ class b implements DialogInterface.OnCancelListener {
    public final /* synthetic */ f a;

    public /* synthetic */ b(f fVar) {
        this.a = fVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        SoundEffectsWarningActivity.this.finish();
    }
}

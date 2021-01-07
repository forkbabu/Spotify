package com.spotify.music.features.home.experimental;

import android.content.DialogInterface;

public final /* synthetic */ class b implements DialogInterface.OnClickListener {
    public final /* synthetic */ VoiceFreeTierHomeFragment a;

    public /* synthetic */ b(VoiceFreeTierHomeFragment voiceFreeTierHomeFragment) {
        this.a = voiceFreeTierHomeFragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.M4(false);
    }
}

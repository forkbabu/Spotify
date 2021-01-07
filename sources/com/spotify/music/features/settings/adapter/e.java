package com.spotify.music.features.settings.adapter;

import android.content.DialogInterface;
import com.spotify.music.features.settings.adapter.i2;

public final /* synthetic */ class e implements DialogInterface.OnClickListener {
    public final /* synthetic */ i2.a a;

    public /* synthetic */ e(i2.a aVar) {
        this.a = aVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        p2.f(((s2) this.a).a, true);
    }
}

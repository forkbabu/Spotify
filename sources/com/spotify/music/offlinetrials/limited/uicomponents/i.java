package com.spotify.music.offlinetrials.limited.uicomponents;

import android.content.DialogInterface;
import com.spotify.music.offlinetrials.limited.uicomponents.u;

public final /* synthetic */ class i implements DialogInterface.OnClickListener {
    public final /* synthetic */ u.b a;

    public /* synthetic */ i(u.b bVar) {
        this.a = bVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a();
    }
}

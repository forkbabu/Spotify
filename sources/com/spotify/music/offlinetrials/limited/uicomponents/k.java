package com.spotify.music.offlinetrials.limited.uicomponents;

import android.content.DialogInterface;
import com.spotify.music.offlinetrials.limited.uicomponents.u;

public final /* synthetic */ class k implements DialogInterface.OnClickListener {
    public final /* synthetic */ u.a a;

    public /* synthetic */ k(u.a aVar) {
        this.a = aVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a();
    }
}

package com.spotify.music.offlinetrials.limited.uicomponents;

import android.content.DialogInterface;
import com.spotify.music.offlinetrials.limited.uicomponents.u;

public final /* synthetic */ class l implements DialogInterface.OnCancelListener {
    public final /* synthetic */ u.a a;

    public /* synthetic */ l(u.a aVar) {
        this.a = aVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a.a();
    }
}

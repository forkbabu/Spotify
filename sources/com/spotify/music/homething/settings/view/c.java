package com.spotify.music.homething.settings.view;

import android.content.DialogInterface;
import com.spotify.music.homething.settings.view.e;

public final /* synthetic */ class c implements DialogInterface.OnClickListener {
    public final /* synthetic */ e.a a;

    public /* synthetic */ c(e.a aVar) {
        this.a = aVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a();
    }
}

package com.spotify.music.homething.settings.view;

import android.content.DialogInterface;
import com.spotify.music.homething.settings.view.e;

public final /* synthetic */ class b implements DialogInterface.OnCancelListener {
    public final /* synthetic */ e.a a;

    public /* synthetic */ b(e.a aVar) {
        this.a = aVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a.b();
    }
}

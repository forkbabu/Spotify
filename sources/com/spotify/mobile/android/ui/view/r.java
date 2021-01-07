package com.spotify.mobile.android.ui.view;

import android.content.DialogInterface;
import com.spotify.mobile.android.ui.view.y;

public final /* synthetic */ class r implements DialogInterface.OnClickListener {
    public final /* synthetic */ y.b a;

    public /* synthetic */ r(y.b bVar) {
        this.a = bVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a();
    }
}

package com.spotify.mobile.android.ui.view;

import android.content.DialogInterface;
import com.spotify.mobile.android.ui.view.y;

public final /* synthetic */ class t implements DialogInterface.OnClickListener {
    public final /* synthetic */ y.a a;

    public /* synthetic */ t(y.a aVar) {
        this.a = aVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a();
    }
}

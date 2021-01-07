package com.spotify.mobile.android.ui.view;

import android.content.DialogInterface;
import com.spotify.mobile.android.ui.view.y;

public final /* synthetic */ class s implements DialogInterface.OnCancelListener {
    public final /* synthetic */ y.a a;

    public /* synthetic */ s(y.a aVar) {
        this.a = aVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a.a();
    }
}

package com.spotify.termsandconditions;

import android.content.DialogInterface;
import com.spotify.termsandconditions.l;

public final /* synthetic */ class d implements DialogInterface.OnCancelListener {
    public final /* synthetic */ l.b a;

    public /* synthetic */ d(l.b bVar) {
        this.a = bVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a.c();
    }
}

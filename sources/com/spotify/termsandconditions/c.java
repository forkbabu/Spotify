package com.spotify.termsandconditions;

import android.content.DialogInterface;
import com.spotify.termsandconditions.l;

public final /* synthetic */ class c implements DialogInterface.OnClickListener {
    public final /* synthetic */ l.b a;

    public /* synthetic */ c(l.b bVar) {
        this.a = bVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a();
    }
}

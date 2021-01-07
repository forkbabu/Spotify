package com.spotify.termsandconditions;

import android.content.DialogInterface;
import com.spotify.termsandconditions.l;

public final /* synthetic */ class a implements DialogInterface.OnClickListener {
    public final /* synthetic */ l a;
    public final /* synthetic */ l.b b;

    public /* synthetic */ a(l lVar, l.b bVar) {
        this.a = lVar;
        this.b = bVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.d(this.b, dialogInterface, i);
    }
}

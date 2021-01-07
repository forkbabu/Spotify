package com.spotify.termsandconditions;

import android.content.DialogInterface;
import com.spotify.termsandconditions.l;

public final /* synthetic */ class e implements DialogInterface.OnCancelListener {
    public final /* synthetic */ l a;
    public final /* synthetic */ l.b b;

    public /* synthetic */ e(l lVar, l.b bVar) {
        this.a = lVar;
        this.b = bVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a.e(this.b, dialogInterface);
    }
}

package com.google.android.gms.cast.framework.media;

import android.content.DialogInterface;

final class z implements DialogInterface.OnClickListener {
    private final /* synthetic */ y a;
    private final /* synthetic */ y b;
    private final /* synthetic */ TracksChooserDialogFragment c;

    z(TracksChooserDialogFragment tracksChooserDialogFragment, y yVar, y yVar2) {
        this.c = tracksChooserDialogFragment;
        this.a = yVar;
        this.b = yVar2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        TracksChooserDialogFragment.d5(this.c, this.a, this.b);
    }
}

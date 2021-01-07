package com.google.android.gms.cast.framework.media;

import android.content.DialogInterface;

final class x implements DialogInterface.OnClickListener {
    private final /* synthetic */ TracksChooserDialogFragment a;

    x(TracksChooserDialogFragment tracksChooserDialogFragment) {
        this.a = tracksChooserDialogFragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (TracksChooserDialogFragment.b5(this.a) != null) {
            TracksChooserDialogFragment.b5(this.a).cancel();
            TracksChooserDialogFragment.e5(this.a);
        }
    }
}

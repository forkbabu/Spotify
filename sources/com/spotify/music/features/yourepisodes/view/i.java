package com.spotify.music.features.yourepisodes.view;

import android.content.DialogInterface;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class i implements DialogInterface.OnClickListener {
    public static final i a = new i();

    i() {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        h.e(dialogInterface, "negativeDialog");
        dialogInterface.dismiss();
    }
}

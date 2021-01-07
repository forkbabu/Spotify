package com.spotify.music.features.yourepisodes.view;

import android.content.DialogInterface;
import kotlin.jvm.internal.h;

final class g implements DialogInterface.OnClickListener {
    public static final g a = new g();

    g() {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        h.e(dialogInterface, "negativeDialog");
        dialogInterface.dismiss();
    }
}

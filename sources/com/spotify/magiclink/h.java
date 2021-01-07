package com.spotify.magiclink;

import android.content.DialogInterface;

public final /* synthetic */ class h implements DialogInterface.OnClickListener {
    public final /* synthetic */ MagicLinkActivity a;

    public /* synthetic */ h(MagicLinkActivity magicLinkActivity) {
        this.a = magicLinkActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.T0(dialogInterface, i);
    }
}

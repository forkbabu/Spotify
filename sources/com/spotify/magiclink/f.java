package com.spotify.magiclink;

import android.content.DialogInterface;

public final /* synthetic */ class f implements DialogInterface.OnClickListener {
    public final /* synthetic */ MagicLinkActivity a;

    public /* synthetic */ f(MagicLinkActivity magicLinkActivity) {
        this.a = magicLinkActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        MagicLinkActivity magicLinkActivity = this.a;
        magicLinkActivity.E.a(i11.a(p11.c(), j11.c(), k11.a()));
        magicLinkActivity.F.a(magicLinkActivity);
    }
}

package com.spotify.magiclink;

import android.content.DialogInterface;

public final /* synthetic */ class g implements DialogInterface.OnClickListener {
    public final /* synthetic */ MagicLinkActivity a;

    public /* synthetic */ g(MagicLinkActivity magicLinkActivity) {
        this.a = magicLinkActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        MagicLinkActivity magicLinkActivity = this.a;
        magicLinkActivity.E.a(i11.a(p11.c(), j11.b(), k11.b()));
        magicLinkActivity.F.a(magicLinkActivity);
    }
}

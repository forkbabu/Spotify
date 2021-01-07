package com.spotify.magiclink;

import android.content.DialogInterface;

public final /* synthetic */ class b implements DialogInterface.OnCancelListener {
    public final /* synthetic */ MagicLinkActivity a;

    public /* synthetic */ b(MagicLinkActivity magicLinkActivity) {
        this.a = magicLinkActivity;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        MagicLinkActivity magicLinkActivity = this.a;
        magicLinkActivity.E.a(i11.a(p11.c(), j11.a(), k11.b()));
        magicLinkActivity.F.a(magicLinkActivity);
    }
}

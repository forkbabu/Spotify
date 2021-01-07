package com.spotify.magiclink;

import android.content.DialogInterface;

public final /* synthetic */ class e implements DialogInterface.OnCancelListener {
    public final /* synthetic */ MagicLinkActivity a;

    public /* synthetic */ e(MagicLinkActivity magicLinkActivity) {
        this.a = magicLinkActivity;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        MagicLinkActivity magicLinkActivity = this.a;
        magicLinkActivity.E.a(i11.a(p11.c(), j11.a(), k11.a()));
        magicLinkActivity.F.a(magicLinkActivity);
    }
}

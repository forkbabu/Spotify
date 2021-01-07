package com.spotify.mobile.android.ui.activity;

import android.content.DialogInterface;

public final /* synthetic */ class b implements DialogInterface.OnClickListener {
    public final /* synthetic */ MarketingOptInActivity a;

    public /* synthetic */ b(MarketingOptInActivity marketingOptInActivity) {
        this.a = marketingOptInActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.U0(dialogInterface, i);
    }
}

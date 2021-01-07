package com.spotify.libs.otp.ui;

import android.content.DialogInterface;

public final /* synthetic */ class d implements DialogInterface.OnClickListener {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ d(Runnable runnable, Runnable runnable2) {
        this.a = runnable;
        this.b = runnable2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Runnable runnable = this.a;
        Runnable runnable2 = this.b;
        if (i == -2) {
            runnable2.getClass();
            runnable2.run();
        } else if (i == -1) {
            runnable.run();
        } else {
            throw new AssertionError("unsupported button");
        }
    }
}

package com.google.android.exoplayer2;

import android.content.Context;
import android.os.PowerManager;

/* access modifiers changed from: package-private */
public final class w0 {
    private boolean a;

    public w0(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
    }

    public void a(boolean z) {
        this.a = z;
    }
}

package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.framework.media.h;
import java.util.TimerTask;

/* access modifiers changed from: package-private */
public final class w extends TimerTask {
    private final /* synthetic */ h.i a;

    w(h.i iVar, h hVar) {
        this.a = iVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        h.i iVar = this.a;
        h.this.J(iVar.a);
        h.this.b.postDelayed(this, this.a.b);
    }
}

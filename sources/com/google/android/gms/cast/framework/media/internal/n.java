package com.google.android.gms.cast.framework.media.internal;

import android.content.Intent;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import com.google.android.gms.cast.n;

/* access modifiers changed from: package-private */
public final class n extends MediaSessionCompat.a {
    private final /* synthetic */ k e;

    n(k kVar) {
        this.e = kVar;
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final boolean d(Intent intent) {
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null) {
            return true;
        }
        if (keyEvent.getKeyCode() != 127 && keyEvent.getKeyCode() != 126) {
            return true;
        }
        this.e.i.C();
        return true;
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final void e() {
        this.e.i.C();
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final void f() {
        this.e.i.C();
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final void k(long j) {
        n.a aVar = new n.a();
        aVar.c(j);
        this.e.i.z(aVar.a());
    }
}

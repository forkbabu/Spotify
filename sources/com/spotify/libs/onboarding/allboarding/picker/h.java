package com.spotify.libs.onboarding.allboarding.picker;

import com.spotify.base.java.logging.Logger;

final class h implements Runnable {
    final /* synthetic */ i a;

    h(i iVar) {
        this.a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Logger.b("Added items {banner}", new Object[0]);
        i iVar = this.a;
        PickerFragment.R4(iVar.c, iVar.b.c());
    }
}

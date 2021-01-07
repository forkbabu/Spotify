package com.spotify.libs.onboarding.allboarding.picker;

import com.spotify.base.java.logging.Logger;

final class j implements Runnable {
    final /* synthetic */ k a;

    j(k kVar) {
        this.a = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Logger.b("Added items {shows}", new Object[0]);
        k kVar = this.a;
        PickerFragment.R4(kVar.c, kVar.b.c());
    }
}

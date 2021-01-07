package com.spotify.libs.onboarding.allboarding.picker;

import com.spotify.base.java.logging.Logger;

final class e implements Runnable {
    final /* synthetic */ f a;

    e(f fVar) {
        this.a = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Logger.b("Added items {artist}", new Object[0]);
        f fVar = this.a;
        PickerFragment.R4(fVar.c, fVar.b.c());
    }
}

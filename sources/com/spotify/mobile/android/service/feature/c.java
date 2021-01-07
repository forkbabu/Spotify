package com.spotify.mobile.android.service.feature;

import io.reactivex.h;
import io.reactivex.i;

public final /* synthetic */ class c implements i {
    public final /* synthetic */ FlagsManager a;

    public /* synthetic */ c(FlagsManager flagsManager) {
        this.a = flagsManager;
    }

    @Override // io.reactivex.i
    public final void subscribe(h hVar) {
        FlagsManager flagsManager = this.a;
        hVar.getClass();
        a aVar = new a(hVar);
        hVar.e(new e(flagsManager, aVar));
        flagsManager.o(aVar);
    }
}

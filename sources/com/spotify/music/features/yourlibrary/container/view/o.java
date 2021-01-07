package com.spotify.music.features.yourlibrary.container.view;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class o implements g {
    public static final /* synthetic */ o a = new o();

    private /* synthetic */ o() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Could not observe YourLibraryModel!", new Object[0]);
    }
}

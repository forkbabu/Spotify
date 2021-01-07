package com.spotify.music.features.onboarding.di;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

final class e<T> implements g<Throwable> {
    public static final e a = new e();

    e() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(Throwable th) {
        Logger.e(th, "Failed to get follow data", new Object[0]);
    }
}

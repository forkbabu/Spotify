package com.spotify.mobile.android.share.menu.preview;

import android.util.Log;
import io.reactivex.functions.g;

final class e<T> implements g<Throwable> {
    public static final e a = new e();

    e() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(Throwable th) {
        Log.e("Share:", "error on subscribe", th);
    }
}

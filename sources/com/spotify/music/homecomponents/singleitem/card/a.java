package com.spotify.music.homecomponents.singleitem.card;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.g;

/* compiled from: java-style lambda group */
public final class a<T> implements g<Throwable> {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public final void accept(Throwable th) {
        int i = this.a;
        if (i == 0) {
            Assertion.w("Saved playlists error, hiding heart button", th);
            ((HomeSingleFocusCardViewBinder) this.b).N1();
        } else if (i == 1) {
            Assertion.w("Saved albums error, hiding heart button", th);
            ((HomeSingleFocusCardViewBinder) this.b).N1();
        } else {
            throw null;
        }
    }
}

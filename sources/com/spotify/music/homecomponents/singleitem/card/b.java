package com.spotify.music.homecomponents.singleitem.card;

import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

/* compiled from: java-style lambda group */
public final class b<T> implements g<Boolean> {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public b(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public final void accept(Boolean bool) {
        int i = this.a;
        if (i == 0) {
            Boolean bool2 = bool;
            h.d(bool2, "hearted");
            ((HomeSingleFocusCardViewBinder) this.b).y2(bool2.booleanValue());
        } else if (i == 1) {
            Boolean bool3 = bool;
            h.d(bool3, "hearted");
            ((HomeSingleFocusCardViewBinder) this.b).y2(bool3.booleanValue());
        } else {
            throw null;
        }
    }
}

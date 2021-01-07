package com.spotify.mobile.android.spotlets.collection.util;

import io.reactivex.functions.l;
import io.reactivex.internal.util.ExceptionHelper;

public final /* synthetic */ class c implements l {
    public final /* synthetic */ CollectionStateProvider a;

    public /* synthetic */ c(CollectionStateProvider collectionStateProvider) {
        this.a = collectionStateProvider;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        u3 u3Var = (u3) obj;
        this.a.getClass();
        F f = u3Var.a;
        f.getClass();
        F f2 = f;
        S s = u3Var.b;
        s.getClass();
        int length = ((String[]) s).length;
        int length2 = f2.isInCollection().length;
        if (length2 == f2.isBanned().length && length2 == length) {
            return u3Var;
        }
        throw ExceptionHelper.e(new Exception("The list of items does not equal the list of items in response, and/or response types is not of equal length."));
    }
}

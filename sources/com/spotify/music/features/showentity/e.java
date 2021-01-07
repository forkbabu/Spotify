package com.spotify.music.features.showentity;

import android.os.Bundle;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.showentity.r;
import io.reactivex.functions.g;

public final /* synthetic */ class e implements g {
    public final /* synthetic */ b0 a;

    public /* synthetic */ e(b0 b0Var) {
        this.a = b0Var;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        b0 b0Var = this.a;
        r.c cVar = (r.c) obj;
        String b = cVar.b();
        Optional<Bundle> a2 = cVar.a();
        ShowEntityResolverFragment showEntityResolverFragment = (ShowEntityResolverFragment) b0Var;
        showEntityResolverFragment.getClass();
        Logger.b("Go to uri %s", b);
        ((v) showEntityResolverFragment.h0).a(b, a2);
    }
}

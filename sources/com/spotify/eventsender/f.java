package com.spotify.eventsender;

import android.util.Pair;
import com.google.common.base.Function;

public final /* synthetic */ class f implements Function {
    public static final /* synthetic */ f a = new f();

    private /* synthetic */ f() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        Fragment fragment = (Fragment) obj;
        return Pair.create(fragment.m(), fragment.l());
    }
}

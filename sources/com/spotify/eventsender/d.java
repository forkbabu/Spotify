package com.spotify.eventsender;

import android.util.Pair;
import com.google.common.base.Function;

public final /* synthetic */ class d implements Function {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        Fragment fragment = (Fragment) obj;
        return Pair.create(fragment.m(), fragment.l());
    }
}

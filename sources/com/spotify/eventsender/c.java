package com.spotify.eventsender;

import android.util.Pair;
import com.google.common.base.Predicate;

public final /* synthetic */ class c implements Predicate {
    public static final /* synthetic */ c a = new c();

    private /* synthetic */ c() {
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        return ((String) ((Pair) obj).first).equals("context_device_android");
    }
}

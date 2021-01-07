package com.spotify.encore.consumer.elements.quickactions;

import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class QuickActionView$eventHandler$1 extends Lambda implements nmf<Events, f> {
    public static final QuickActionView$eventHandler$1 INSTANCE = new QuickActionView$eventHandler$1();

    QuickActionView$eventHandler$1() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public /* bridge */ /* synthetic */ f invoke(Events events) {
        invoke(events);
        return f.a;
    }

    public final void invoke(Events events) {
        h.e(events, "it");
    }
}

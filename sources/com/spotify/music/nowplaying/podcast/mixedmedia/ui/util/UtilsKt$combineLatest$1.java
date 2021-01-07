package com.spotify.music.nowplaying.podcast.mixedmedia.ui.util;

import kotlin.Pair;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
public final class UtilsKt$combineLatest$1 extends Lambda implements rmf<A, B, Pair<? extends A, ? extends B>> {
    public static final UtilsKt$combineLatest$1 a = new UtilsKt$combineLatest$1();

    UtilsKt$combineLatest$1() {
        super(2);
    }

    @Override // defpackage.rmf
    public Object invoke(Object obj, Object obj2) {
        return new Pair(obj, obj2);
    }
}

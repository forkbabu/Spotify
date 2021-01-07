package com.spotify.encore.consumer.components.podcast.impl.episoderow;

import kotlin.jvm.internal.Lambda;

final class ViewUtilsKt$isGoneIf$1 extends Lambda implements cmf<Boolean> {
    final /* synthetic */ cmf $predicate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ViewUtilsKt$isGoneIf$1(cmf cmf) {
        super(0);
        this.$predicate = cmf;
    }

    /* Return type fixed from 'boolean' to match base method */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Boolean] */
    @Override // defpackage.cmf
    public final Boolean invoke() {
        return !((Boolean) this.$predicate.invoke()).booleanValue();
    }
}

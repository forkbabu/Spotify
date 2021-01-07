package com.spotify.music.features.notificationsettings.channels;

import com.spotify.music.pageloader.skeleton.SkeletonComponents;
import com.spotify.pageloader.w0;

final class q<T> implements tg0<w0> {
    public static final q a = new q();

    q() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.tg0
    public w0 get() {
        SkeletonComponents skeletonComponents = SkeletonComponents.ROW;
        return fbc.c(SkeletonComponents.TOOLBAR_SPACE, skeletonComponents, skeletonComponents);
    }
}

package com.spotify.mobile.android.video;

import java.util.Comparator;

public final /* synthetic */ class j implements Comparator {
    public static final /* synthetic */ j a = new j();

    private /* synthetic */ j() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = l0.d;
        return ((VideoSurfaceView) obj2).getPriority().compareTo(((VideoSurfaceView) obj).getPriority());
    }
}

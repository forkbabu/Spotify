package com.spotify.music.features.yourlibraryx.view.entities.components;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.encore.Component;
import kotlin.jvm.internal.h;

public final class c {
    public static final Component a(YourLibraryXSkeletonComponents yourLibraryXSkeletonComponents, ViewGroup viewGroup) {
        h.e(yourLibraryXSkeletonComponents, "$this$component");
        h.e(viewGroup, "parent");
        View d = yourLibraryXSkeletonComponents.d(viewGroup.getContext(), LayoutInflater.from(viewGroup.getContext()), viewGroup);
        h.d(d, "this.createView(parent.c…(parent.context), parent)");
        return new b(d);
    }
}

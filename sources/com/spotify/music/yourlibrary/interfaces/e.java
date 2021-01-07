package com.spotify.music.yourlibrary.interfaces;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import com.google.common.collect.ImmutableList;

/* compiled from: YourLibraryPage */
public final /* synthetic */ class e {
    /* JADX WARN: Incorrect args count in method signature: ()Lcom/google/common/collect/ImmutableList<Landroid/view/View;>; */
    public static ImmutableList a(f _this) {
        return ImmutableList.of();
    }

    public static c b(f _this) {
        Fragment P2 = _this.e().P2();
        if (P2 instanceof d) {
            return ((d) P2).g2(_this);
        }
        c B2 = _this.e().B2();
        if (B2 instanceof d) {
            return ((d) B2).g2(_this);
        }
        throw new AssertionError("Parent fragment/activity is null or not a YourLibraryDelegateProvider. Are you sure that your page has been added to Your Library?");
    }

    public static void c(f _this, boolean z) {
        if (z) {
            _this.n0().d(true);
        }
    }
}

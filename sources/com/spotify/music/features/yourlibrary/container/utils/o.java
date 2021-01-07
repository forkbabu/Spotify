package com.spotify.music.features.yourlibrary.container.utils;

import androidx.fragment.app.Fragment;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;

public final class o implements n {
    private final ys2 a;
    private final Fragment b;
    private final zpd c;

    public o(ys2 ys2, Fragment fragment, zpd zpd) {
        this.a = ys2;
        this.b = fragment;
        this.c = zpd;
    }

    @Override // com.spotify.music.features.yourlibrary.container.utils.n
    public void a(YourLibraryPageId yourLibraryPageId) {
        this.a.k(this.b, this.c.c(yourLibraryPageId).getTitle().toString());
    }
}

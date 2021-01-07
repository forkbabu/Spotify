package com.spotify.music.features.collectionartist;

import com.spotify.mobile.android.ui.contextmenu.ContextMenuEvent;
import com.spotify.music.navigation.t;

public class d0 {
    private final t a;
    private final a0 b;

    public d0(t tVar, a0 a0Var) {
        this.a = tVar;
        this.b = a0Var;
    }

    public /* synthetic */ void a(String str) {
        this.b.e(ContextMenuEvent.BROWSE_ARTIST, str);
        this.a.d(str);
    }
}

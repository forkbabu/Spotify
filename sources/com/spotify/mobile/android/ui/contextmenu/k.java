package com.spotify.mobile.android.ui.contextmenu;

import com.spotify.android.glue.patterns.contextmenu.model.b;
import com.spotify.android.glue.patterns.contextmenu.model.e;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.ubi.specification.factories.s0;

public final /* synthetic */ class k implements e {
    public final /* synthetic */ ContextMenuHelper a;
    public final /* synthetic */ s0 b;
    public final /* synthetic */ PlayerTrack c;

    public /* synthetic */ k(ContextMenuHelper contextMenuHelper, s0 s0Var, PlayerTrack playerTrack) {
        this.a = contextMenuHelper;
        this.b = s0Var;
        this.c = playerTrack;
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.model.e
    public final void a(b bVar) {
        this.a.E0(this.b, this.c, bVar);
    }
}

package com.spotify.music.features.yourlibraryx.view.entities.rows;

import com.spotify.encore.Component;
import com.spotify.music.features.yourlibraryx.view.y;
import com.spotify.player.model.ContextTrack;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.j;

public final class a extends nh9 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Component component) {
        super(component, j.b(y.c.class));
        h.e(component, ContextTrack.Metadata.KEY_PROVIDER);
    }

    @Override // defpackage.nh9
    public void l0(y yVar, nmf nmf) {
        h.e((y.c) yVar, "item");
        h.e(nmf, "output");
    }

    @Override // defpackage.nh9
    public Object m0(y yVar) {
        y.c cVar = (y.c) yVar;
        h.e(cVar, "item");
        return cVar.a();
    }
}

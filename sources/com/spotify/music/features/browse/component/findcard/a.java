package com.spotify.music.features.browse.component.findcard;

import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.d;
import com.squareup.picasso.Picasso;
import defpackage.s51;
import java.util.EnumSet;

public class a extends d.a<e> {
    private final u64 a;
    private final HubsGlueImageDelegate b;
    private final Picasso c;
    private final boolean f;

    public a(u64 u64, HubsGlueImageDelegate hubsGlueImageDelegate, Picasso picasso, boolean z) {
        this.a = u64;
        this.b = hubsGlueImageDelegate;
        this.c = picasso;
        this.f = z;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        d dVar = new d(viewGroup.getContext(), viewGroup);
        dVar.j(this.f);
        return new f(dVar, this.a, this.b, this.c);
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.d
    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.CARD, GlueLayoutTraits.Trait.ONE_COLUMN);
    }
}

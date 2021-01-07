package com.spotify.music.features.listeninghistory.ui.encore;

import android.view.ViewGroup;
import com.spotify.encore.Component;
import com.spotify.encore.consumer.components.listeninghistory.api.entityrow.Events;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import defpackage.s51;
import java.util.EnumSet;
import kotlin.jvm.internal.h;

public final class e<Model> extends qk9<EntityBaseHolder<Model>> {
    private final cmf<Component<Model, Events>> a;
    private final vd3 b;
    private final smf<String, String, String, Model> c;
    private final int f;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: cmf<? extends com.spotify.encore.Component<Model, com.spotify.encore.consumer.components.listeninghistory.api.entityrow.Events>> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: smf<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? extends Model> */
    /* JADX WARN: Multi-variable type inference failed */
    public e(cmf<? extends Component<Model, Events>> cmf, vd3 vd3, smf<? super String, ? super String, ? super String, ? extends Model> smf, int i) {
        h.e(cmf, "row");
        h.e(vd3, "listener");
        h.e(smf, "modelProvider");
        this.a = cmf;
        this.b = vd3;
        this.c = smf;
        this.f = i;
    }

    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        h.e(viewGroup, "parent");
        h.e(w51, "config");
        return new EntityBaseHolder(this.a.invoke(), this.b, this.c);
    }

    @Override // defpackage.pk9
    public int d() {
        return this.f;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        EnumSet<GlueLayoutTraits.Trait> of = EnumSet.of(GlueLayoutTraits.Trait.STACKABLE);
        h.d(of, "EnumSet.of(STACKABLE)");
        return of;
    }
}

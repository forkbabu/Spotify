package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobius.e0;
import com.spotify.music.features.yourlibrary.musicpages.filtertags.loader.FilterTagsResponseItem;
import defpackage.wb9;
import defpackage.xb9;
import defpackage.zb9;

/* renamed from: tb9  reason: default package */
public final /* synthetic */ class tb9 implements ti0 {
    public final /* synthetic */ zb9 a;

    public /* synthetic */ tb9(zb9 zb9) {
        this.a = zb9;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        zb9 zb9 = this.a;
        ImmutableList<FilterTagsResponseItem> f = ((xb9.c) obj).f();
        zb9.a d = zb9.d();
        d.d(f);
        zb9 a2 = d.a();
        return e0.g(a2, ImmutableSet.of(new wb9.c(a2.c(), a2.b())));
    }
}

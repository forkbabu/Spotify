package com.spotify.music.features.freetierartist.discographysortandfilter.sort;

import android.content.Context;
import com.squareup.picasso.Picasso;
import kotlin.jvm.internal.h;

public final class i implements fjf<g> {
    private final wlf<SortDiscographyDialogFragment> a;
    private final wlf<Picasso> b;

    public i(wlf<SortDiscographyDialogFragment> wlf, wlf<Picasso> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        SortDiscographyDialogFragment sortDiscographyDialogFragment = this.a.get();
        Picasso picasso = this.b.get();
        h.e(sortDiscographyDialogFragment, "fragment");
        h.e(picasso, "picasso");
        Context l4 = sortDiscographyDialogFragment.l4();
        h.d(l4, "fragment.requireContext()");
        return new g(l4, new h(new SortDiscographyDialogFragmentModule$SortDiscographyOptionsViewCompatModule$provideSortDiscographyOptionsViewCompat$1(sortDiscographyDialogFragment)), picasso);
    }
}

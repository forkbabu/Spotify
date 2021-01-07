package com.spotify.music.features.entityselector.pages.podcasts.view;

import androidx.recyclerview.widget.m;
import kotlin.jvm.internal.h;

public final class a extends m.d<sy4> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.m.d
    public boolean a(sy4 sy4, sy4 sy42) {
        sy4 sy43 = sy4;
        sy4 sy44 = sy42;
        h.e(sy43, "oldItem");
        h.e(sy44, "newItem");
        return h.a(sy43, sy44);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.m.d
    public boolean b(sy4 sy4, sy4 sy42) {
        sy4 sy43 = sy4;
        sy4 sy44 = sy42;
        h.e(sy43, "oldItem");
        h.e(sy44, "newItem");
        return h.a(sy43.a(), sy44.a());
    }
}

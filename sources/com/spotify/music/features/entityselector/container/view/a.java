package com.spotify.music.features.entityselector.container.view;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.b;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class a implements b.AbstractC0111b {
    final /* synthetic */ EntitySelectorViews a;

    a(EntitySelectorViews entitySelectorViews) {
        this.a = entitySelectorViews;
    }

    @Override // com.google.android.material.tabs.b.AbstractC0111b
    public final void a(TabLayout.g gVar, int i) {
        h.e(gVar, "tab");
        if (i == 0) {
            gVar.m(this.a.a().getContext().getString(C0707R.string.add_songs_tab_text));
        } else if (i == 1) {
            gVar.m(this.a.a().getContext().getString(C0707R.string.add_podcasts_tab_text));
        }
    }
}

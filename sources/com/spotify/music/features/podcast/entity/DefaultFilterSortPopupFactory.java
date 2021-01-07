package com.spotify.music.features.podcast.entity;

import android.content.Context;
import android.view.LayoutInflater;
import com.spotify.music.util.filterheader.c;
import kotlin.jvm.internal.h;

public final class DefaultFilterSortPopupFactory implements d {
    @Override // com.spotify.music.features.podcast.entity.d
    public c a(Context context, e eVar) {
        h.e(context, "context");
        h.e(eVar, "listener");
        return new c(context, LayoutInflater.from(context), new a(new DefaultFilterSortPopupFactory$createFilterPopup$1(eVar)));
    }
}

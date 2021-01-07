package com.spotify.music.features.yourlibraryx.view;

import com.spotify.encore.consumer.components.yourlibrary.api.filterrow.FilterRowLibrary;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class YourLibraryXFilterRowView$connect$1$dispose$1 extends Lambda implements nmf<FilterRowLibrary.Event, f> {
    public static final YourLibraryXFilterRowView$connect$1$dispose$1 a = new YourLibraryXFilterRowView$connect$1$dispose$1();

    YourLibraryXFilterRowView$connect$1$dispose$1() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(FilterRowLibrary.Event event) {
        h.e(event, "it");
        return f.a;
    }
}

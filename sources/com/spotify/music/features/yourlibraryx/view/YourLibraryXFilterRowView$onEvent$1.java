package com.spotify.music.features.yourlibraryx.view;

import com.spotify.encore.consumer.components.yourlibrary.api.filterrow.FilterRowLibrary;
import com.spotify.music.C0707R;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class YourLibraryXFilterRowView$onEvent$1 extends Lambda implements nmf<FilterRowLibrary.Event, f> {
    final /* synthetic */ da2 $output;
    final /* synthetic */ YourLibraryXFilterRowView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    YourLibraryXFilterRowView$onEvent$1(YourLibraryXFilterRowView yourLibraryXFilterRowView, da2 da2) {
        super(1);
        this.this$0 = yourLibraryXFilterRowView;
        this.$output = da2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(FilterRowLibrary.Event event) {
        Object obj;
        String str;
        FilterRowLibrary.Event event2 = event;
        h.e(event2, "it");
        if (event2 instanceof FilterRowLibrary.Event.FilterChanged) {
            da2 da2 = this.$output;
            FilterRowLibrary.Event.FilterChanged filterChanged = (FilterRowLibrary.Event.FilterChanged) event2;
            if (filterChanged.getFilter().getSelected()) {
                obj = new YourLibraryXEvent.i(YourLibraryXFilterRowView.a(this.this$0, filterChanged.getFilter().getId()));
            } else {
                obj = new YourLibraryXEvent.h(YourLibraryXFilterRowView.a(this.this$0, filterChanged.getFilter().getId()));
            }
            da2.accept(obj);
            eh9 c = YourLibraryXFilterRowView.c(this.this$0);
            if (c != null) {
                YourLibraryXFilterRowView yourLibraryXFilterRowView = this.this$0;
                int id = filterChanged.getFilter().getId();
                yourLibraryXFilterRowView.getClass();
                if (id == C0707R.id.your_library_filter_albums) {
                    str = "albums";
                } else if (id == C0707R.id.your_library_filter_artists) {
                    str = "artists";
                } else if (id == C0707R.id.your_library_filter_downloads) {
                    str = "downloads";
                } else if (id == C0707R.id.your_library_filter_playlists) {
                    str = "playlists";
                } else if (id == C0707R.id.your_library_filter_podcasts) {
                    str = "podcasts";
                } else if (id == -1) {
                    str = "none";
                } else {
                    throw new IllegalArgumentException(je.p0("Invalid id, ", id));
                }
                c.f(str, 0, filterChanged.getFilter().getSelected());
            }
        } else if (h.a(event2, FilterRowLibrary.Event.ClearClicked.INSTANCE)) {
            this.$output.accept(YourLibraryXEvent.k.a);
            eh9 c2 = YourLibraryXFilterRowView.c(this.this$0);
            if (c2 != null) {
                c2.n();
            }
        }
        return f.a;
    }
}

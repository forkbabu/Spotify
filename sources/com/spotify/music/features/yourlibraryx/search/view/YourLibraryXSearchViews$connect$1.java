package com.spotify.music.features.yourlibraryx.search.view;

import com.spotify.encore.consumer.components.yourlibrary.api.searchheader.SearchHeaderLibrary;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;
import kotlin.text.e;

/* access modifiers changed from: package-private */
public final class YourLibraryXSearchViews$connect$1 extends Lambda implements nmf<SearchHeaderLibrary.Events, f> {
    final /* synthetic */ da2 $output;
    final /* synthetic */ YourLibraryXSearchViews this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    YourLibraryXSearchViews$connect$1(YourLibraryXSearchViews yourLibraryXSearchViews, da2 da2) {
        super(1);
        this.this$0 = yourLibraryXSearchViews;
        this.$output = da2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(SearchHeaderLibrary.Events events) {
        SearchHeaderLibrary.Events events2 = events;
        h.e(events2, "it");
        if (h.a(events2, SearchHeaderLibrary.Events.BackButtonClicked.INSTANCE)) {
            this.$output.accept(YourLibraryXEvent.b.a);
            YourLibraryXSearchViews.b(this.this$0).a();
        } else if (h.a(events2, SearchHeaderLibrary.Events.ClearButtonClicked.INSTANCE)) {
            YourLibraryXSearchViews.b(this.this$0).p();
        } else if (events2 instanceof SearchHeaderLibrary.Events.SearchTextChanged) {
            SearchHeaderLibrary.Events.SearchTextChanged searchTextChanged = (SearchHeaderLibrary.Events.SearchTextChanged) events2;
            this.$output.accept(new YourLibraryXEvent.u(searchTextChanged.getSearchText()));
            String searchText = searchTextChanged.getSearchText();
            if (!(searchText == null || e.n(searchText))) {
                YourLibraryXSearchViews.b(this.this$0).d();
            }
        }
        return f.a;
    }
}

package com.spotify.music.features.yourlibraryx.view.entities.rows;

import com.spotify.encore.consumer.components.yourlibrary.api.sortrow.SortRowLibrary;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import com.spotify.music.features.yourlibraryx.view.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class YourLibrarySortRowComponentViewHolder$bindEvents$1 extends Lambda implements nmf<SortRowLibrary.Events, f> {
    final /* synthetic */ y.d $item;
    final /* synthetic */ nmf $output;
    final /* synthetic */ YourLibrarySortRowComponentViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    YourLibrarySortRowComponentViewHolder$bindEvents$1(YourLibrarySortRowComponentViewHolder yourLibrarySortRowComponentViewHolder, y.d dVar, nmf nmf) {
        super(1);
        this.this$0 = yourLibrarySortRowComponentViewHolder;
        this.$item = dVar;
        this.$output = nmf;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(SortRowLibrary.Events events) {
        Object obj;
        SortRowLibrary.Events events2 = events;
        h.e(events2, "it");
        int ordinal = events2.ordinal();
        if (ordinal == 0) {
            this.this$0.E.o();
            obj = YourLibraryXEvent.x.a;
        } else if (ordinal == 1) {
            this.this$0.E.h(this.$item.a());
            obj = YourLibraryXEvent.l.a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.$output.invoke(obj);
        return f.a;
    }
}

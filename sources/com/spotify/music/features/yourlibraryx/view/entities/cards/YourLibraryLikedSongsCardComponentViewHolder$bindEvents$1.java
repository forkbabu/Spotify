package com.spotify.music.features.yourlibraryx.view.entities.cards;

import com.spotify.encore.consumer.components.yourlibrary.api.likedsongscard.LikedSongsCardLibrary;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXViewMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class YourLibraryLikedSongsCardComponentViewHolder$bindEvents$1 extends Lambda implements nmf<LikedSongsCardLibrary.Events, f> {
    final /* synthetic */ nmf $output;
    final /* synthetic */ String $uri;
    final /* synthetic */ YourLibraryLikedSongsCardComponentViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    YourLibraryLikedSongsCardComponentViewHolder$bindEvents$1(YourLibraryLikedSongsCardComponentViewHolder yourLibraryLikedSongsCardComponentViewHolder, String str, nmf nmf) {
        super(1);
        this.this$0 = yourLibraryLikedSongsCardComponentViewHolder;
        this.$uri = str;
        this.$output = nmf;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(LikedSongsCardLibrary.Events events) {
        LikedSongsCardLibrary.Events events2 = events;
        h.e(events2, "it");
        if (events2.ordinal() == 0) {
            eh9 eh9 = this.this$0.F;
            int w = this.this$0.w();
            String str = this.$uri;
            h.d(str, "uri");
            String c = eh9.c(w, str, YourLibraryXViewMode.b);
            String str2 = this.$uri;
            h.d(str2, "uri");
            this.$output.invoke(new YourLibraryXEvent.e(str2, c));
            return f.a;
        }
        throw new NoWhenBranchMatchedException();
    }
}

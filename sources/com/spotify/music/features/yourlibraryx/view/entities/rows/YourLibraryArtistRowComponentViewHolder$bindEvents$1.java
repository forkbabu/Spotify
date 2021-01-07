package com.spotify.music.features.yourlibraryx.view.entities.rows;

import com.spotify.encore.consumer.components.yourlibrary.api.artistrow.ArtistRowLibrary;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXViewMode;
import com.spotify.music.features.yourlibraryx.view.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class YourLibraryArtistRowComponentViewHolder$bindEvents$1 extends Lambda implements nmf<ArtistRowLibrary.Events, f> {
    final /* synthetic */ y.a $item;
    final /* synthetic */ nmf $output;
    final /* synthetic */ String $uri;
    final /* synthetic */ YourLibraryArtistRowComponentViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    YourLibraryArtistRowComponentViewHolder$bindEvents$1(YourLibraryArtistRowComponentViewHolder yourLibraryArtistRowComponentViewHolder, String str, y.a aVar, nmf nmf) {
        super(1);
        this.this$0 = yourLibraryArtistRowComponentViewHolder;
        this.$uri = str;
        this.$item = aVar;
        this.$output = nmf;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(ArtistRowLibrary.Events events) {
        Object obj;
        ArtistRowLibrary.Events events2 = events;
        h.e(events2, "it");
        int ordinal = events2.ordinal();
        if (ordinal == 0) {
            eh9 eh9 = this.this$0.I;
            int w = this.this$0.w();
            String str = this.$uri;
            h.d(str, "uri");
            String c = eh9.c(w, str, YourLibraryXViewMode.a);
            String str2 = this.$uri;
            h.d(str2, "uri");
            obj = new YourLibraryXEvent.e(str2, c);
        } else if (ordinal == 1) {
            String str3 = this.$uri;
            h.d(str3, "uri");
            obj = new YourLibraryXEvent.d(str3, je.k0(this.$item, "item.entity.entityInfo", "item.entity.entityInfo.name"), je.M(this.$item, "item.entity.entityCase"));
        } else if (ordinal == 2) {
            eh9 eh92 = this.this$0.I;
            int w2 = this.this$0.w();
            String str4 = this.$uri;
            h.d(str4, "uri");
            eh92.i(w2, str4);
            String str5 = this.$uri;
            h.d(str5, "uri");
            obj = new YourLibraryXEvent.c(str5);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.$output.invoke(obj);
        return f.a;
    }
}

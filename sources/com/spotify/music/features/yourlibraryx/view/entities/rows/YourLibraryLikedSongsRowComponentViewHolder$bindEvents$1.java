package com.spotify.music.features.yourlibraryx.view.entities.rows;

import com.spotify.encore.consumer.components.yourlibrary.api.likedsongsrow.LikedSongsRowLibrary;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXViewMode;
import com.spotify.music.features.yourlibraryx.view.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class YourLibraryLikedSongsRowComponentViewHolder$bindEvents$1 extends Lambda implements nmf<LikedSongsRowLibrary.Events, f> {
    final /* synthetic */ y.a $item;
    final /* synthetic */ nmf $output;
    final /* synthetic */ String $uri;
    final /* synthetic */ YourLibraryLikedSongsRowComponentViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    YourLibraryLikedSongsRowComponentViewHolder$bindEvents$1(YourLibraryLikedSongsRowComponentViewHolder yourLibraryLikedSongsRowComponentViewHolder, String str, y.a aVar, nmf nmf) {
        super(1);
        this.this$0 = yourLibraryLikedSongsRowComponentViewHolder;
        this.$uri = str;
        this.$item = aVar;
        this.$output = nmf;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(LikedSongsRowLibrary.Events events) {
        Object obj;
        LikedSongsRowLibrary.Events events2 = events;
        YourLibraryXViewMode yourLibraryXViewMode = YourLibraryXViewMode.a;
        h.e(events2, "it");
        int ordinal = events2.ordinal();
        if (ordinal == 0) {
            eh9 eh9 = this.this$0.I;
            int w = this.this$0.w();
            String str = this.$uri;
            h.d(str, "uri");
            String c = eh9.c(w, str, yourLibraryXViewMode);
            String str2 = this.$uri;
            h.d(str2, "uri");
            obj = new YourLibraryXEvent.e(str2, c);
        } else if (ordinal == 1) {
            eh9 eh92 = this.this$0.I;
            int w2 = this.this$0.w();
            String str3 = this.$uri;
            h.d(str3, "uri");
            eh92.m(w2, str3, yourLibraryXViewMode);
            String str4 = this.$uri;
            h.d(str4, "uri");
            obj = new YourLibraryXEvent.d(str4, je.k0(this.$item, "item.entity.entityInfo", "item.entity.entityInfo.name"), je.M(this.$item, "item.entity.entityCase"));
        } else if (ordinal == 2) {
            eh9 eh93 = this.this$0.I;
            int w3 = this.this$0.w();
            String str5 = this.$uri;
            h.d(str5, "uri");
            eh93.i(w3, str5);
            String str6 = this.$uri;
            h.d(str6, "uri");
            obj = new YourLibraryXEvent.c(str6);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.$output.invoke(obj);
        return f.a;
    }
}

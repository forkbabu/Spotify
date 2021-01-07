package com.spotify.music.features.yourlibraryx.bottomsheet;

import com.spotify.music.features.yourlibraryx.domain.YourLibraryXSortOption;
import kotlin.f;
import kotlin.jvm.internal.Lambda;

final class YourLibraryXSortOptionsAdapter$onBindViewHolder$$inlined$let$lambda$1 extends Lambda implements cmf<f> {
    final /* synthetic */ a $holder$inlined;
    final /* synthetic */ int $position$inlined;
    final /* synthetic */ YourLibraryXSortOption $sortOption;
    final /* synthetic */ b this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    YourLibraryXSortOptionsAdapter$onBindViewHolder$$inlined$let$lambda$1(YourLibraryXSortOption yourLibraryXSortOption, b bVar, int i, a aVar) {
        super(0);
        this.$sortOption = yourLibraryXSortOption;
        this.this$0 = bVar;
        this.$position$inlined = i;
        this.$holder$inlined = aVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public f invoke() {
        nmf<YourLibraryXSortOption, f> X = this.this$0.X();
        if (X != null) {
            X.invoke(this.$sortOption);
        }
        return f.a;
    }
}

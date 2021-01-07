package com.spotify.music.features.yourlibraryx.dataloading;

import io.reactivex.g;
import kotlin.jvm.internal.Lambda;

final class YourLibraryProfileDataLoader$profileDataFlowable$2 extends Lambda implements cmf<g<com.spotify.music.features.yourlibraryx.domain.g>> {
    final /* synthetic */ YourLibraryProfileDataLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    YourLibraryProfileDataLoader$profileDataFlowable$2(YourLibraryProfileDataLoader yourLibraryProfileDataLoader) {
        super(0);
        this.this$0 = yourLibraryProfileDataLoader;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public g<com.spotify.music.features.yourlibraryx.domain.g> invoke() {
        return YourLibraryProfileDataLoader.b(this.this$0).f0(new a(this)).O(b.a);
    }
}

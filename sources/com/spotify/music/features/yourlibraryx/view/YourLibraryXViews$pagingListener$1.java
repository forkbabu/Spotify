package com.spotify.music.features.yourlibraryx.view;

import kotlin.jvm.internal.FunctionReferenceImpl;

final /* synthetic */ class YourLibraryXViews$pagingListener$1 extends FunctionReferenceImpl implements cmf<Integer> {
    YourLibraryXViews$pagingListener$1(YourLibraryXAdapter yourLibraryXAdapter) {
        super(0, yourLibraryXAdapter, YourLibraryXAdapter.class, "getNumberOfIgnoredItems", "getNumberOfIgnoredItems()I", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public Integer invoke() {
        return Integer.valueOf(((YourLibraryXAdapter) this.receiver).m());
    }
}

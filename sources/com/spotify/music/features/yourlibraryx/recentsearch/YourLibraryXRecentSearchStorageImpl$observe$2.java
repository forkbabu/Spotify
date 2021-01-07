package com.spotify.music.features.yourlibraryx.recentsearch;

import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

final /* synthetic */ class YourLibraryXRecentSearchStorageImpl$observe$2 extends FunctionReferenceImpl implements cmf<List<String>> {
    YourLibraryXRecentSearchStorageImpl$observe$2(YourLibraryXRecentSearchStorageImpl yourLibraryXRecentSearchStorageImpl) {
        super(0, yourLibraryXRecentSearchStorageImpl, YourLibraryXRecentSearchStorageImpl.class, "get", "get()Ljava/util/List;", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public List<String> invoke() {
        return YourLibraryXRecentSearchStorageImpl.d((YourLibraryXRecentSearchStorageImpl) this.receiver);
    }
}

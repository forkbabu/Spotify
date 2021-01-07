package com.spotify.music.features.yourlibrary.container.view;

import com.google.common.base.Predicate;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;
import com.spotify.music.yourlibrary.interfaces.g;

public final /* synthetic */ class c implements Predicate {
    public final /* synthetic */ YourLibraryPageId a;

    public /* synthetic */ c(YourLibraryPageId yourLibraryPageId) {
        this.a = yourLibraryPageId;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        return ((g) obj).b() == this.a;
    }
}

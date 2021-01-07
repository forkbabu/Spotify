package com.spotify.music.features.yourlibrary.container.view;

import com.google.common.base.Function;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;

public final /* synthetic */ class q implements Function {
    public final /* synthetic */ zpd a;

    public /* synthetic */ q(zpd zpd) {
        this.a = zpd;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return this.a.c((YourLibraryPageId) obj);
    }
}

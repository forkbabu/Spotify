package com.spotify.pageloader;

import android.view.View;

public final /* synthetic */ class m implements sg0 {
    public final /* synthetic */ PageLoaderView a;

    public /* synthetic */ m(PageLoaderView pageLoaderView) {
        this.a = pageLoaderView;
    }

    @Override // defpackage.sg0
    public final Object apply(Object obj) {
        PageLoaderView pageLoaderView = this.a;
        pageLoaderView.getClass();
        return new a1((View) obj, new s(pageLoaderView));
    }
}

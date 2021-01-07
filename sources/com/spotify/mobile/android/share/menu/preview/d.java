package com.spotify.mobile.android.share.menu.preview;

import com.spotify.mobile.android.share.menu.preview.SharePreviewMenuFragment;
import io.reactivex.disposables.b;
import io.reactivex.functions.g;

final class d<T> implements g<b> {
    final /* synthetic */ SharePreviewMenuFragment.b a;

    d(SharePreviewMenuFragment.b bVar) {
        this.a = bVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(b bVar) {
        SharePreviewMenuFragment.b bVar2 = this.a;
        SharePreviewMenuFragment.b5(bVar2.a, bVar2.b);
    }
}

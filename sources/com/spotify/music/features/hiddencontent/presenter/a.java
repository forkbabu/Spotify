package com.spotify.music.features.hiddencontent.presenter;

import com.spotify.mobile.android.ui.contextmenu.ContextMenuEvent;
import com.spotify.mobile.android.ui.contextmenu.s3;

public final /* synthetic */ class a implements s3 {
    public final /* synthetic */ HiddenContentFragmentPresenter b;
    public final /* synthetic */ String c;

    public /* synthetic */ a(HiddenContentFragmentPresenter hiddenContentFragmentPresenter, String str) {
        this.b = hiddenContentFragmentPresenter;
        this.c = str;
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.s3
    public final void a(ContextMenuEvent contextMenuEvent) {
        this.b.b(this.c, contextMenuEvent);
    }
}

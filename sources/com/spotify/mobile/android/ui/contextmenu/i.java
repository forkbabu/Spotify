package com.spotify.mobile.android.ui.contextmenu;

import androidx.fragment.app.c;
import com.google.common.base.Optional;
import io.reactivex.functions.g;

public final /* synthetic */ class i implements g {
    public final /* synthetic */ ContextMenuHelper a;
    public final /* synthetic */ c b;

    public /* synthetic */ i(ContextMenuHelper contextMenuHelper, c cVar) {
        this.a = contextMenuHelper;
        this.b = cVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b1(this.b, (Optional) obj);
    }
}

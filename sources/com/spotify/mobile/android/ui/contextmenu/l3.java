package com.spotify.mobile.android.ui.contextmenu;

import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import io.reactivex.functions.c;

public final /* synthetic */ class l3 implements c {
    public final /* synthetic */ x3 a;

    public /* synthetic */ l3(x3 x3Var) {
        this.a = x3Var;
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        return this.a.b((ContextMenuViewModel) obj, ((Boolean) obj2).booleanValue());
    }
}

package com.spotify.mobile.android.ui.contextmenu;

import androidx.fragment.app.c;
import com.google.common.base.Optional;
import com.spotify.android.glue.patterns.contextmenu.model.b;
import com.spotify.android.glue.patterns.contextmenu.model.e;
import io.reactivex.g;

public final /* synthetic */ class v implements e {
    public final /* synthetic */ ContextMenuHelper a;
    public final /* synthetic */ Optional b;
    public final /* synthetic */ c c;

    public /* synthetic */ v(ContextMenuHelper contextMenuHelper, Optional optional, c cVar) {
        this.a = contextMenuHelper;
        this.b = optional;
        this.c = cVar;
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.model.e
    public final void a(b bVar) {
        ContextMenuHelper contextMenuHelper = this.a;
        Optional optional = this.b;
        c cVar = this.c;
        contextMenuHelper.getClass();
        g.N(optional).subscribe(new i(contextMenuHelper, cVar), s0.a);
    }
}

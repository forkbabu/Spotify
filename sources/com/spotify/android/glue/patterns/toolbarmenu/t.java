package com.spotify.android.glue.patterns.toolbarmenu;

import android.content.Context;
import android.view.MenuItem;
import androidx.fragment.app.c;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.android.glue.patterns.toolbarmenu.u;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuFragment;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.mobile.android.ui.contextmenu.x3;

/* access modifiers changed from: package-private */
public class t implements MenuItem.OnMenuItemClickListener {
    final /* synthetic */ u a;

    t(u uVar) {
        this.a = uVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem menuItem) {
        this.a.d.onClick(menuItem.getActionView());
        u.b bVar = this.a.c;
        Context context = this.a.e;
        ContextMenuViewModel contextMenuViewModel = this.a.g;
        ContextMenuFragment.f5(r3.f(new x3.b(contextMenuViewModel)), (c) context, ((s) bVar).a);
        return true;
    }
}

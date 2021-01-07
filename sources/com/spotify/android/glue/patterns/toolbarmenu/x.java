package com.spotify.android.glue.patterns.toolbarmenu;

import android.view.MenuItem;
import android.view.View;

class x implements View.OnClickListener {
    final /* synthetic */ MenuItem a;
    final /* synthetic */ z b;

    x(z zVar, MenuItem menuItem) {
        this.b = zVar;
        this.a = menuItem;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.b.d.performIdentifierAction(this.a.getItemId(), 0);
    }
}

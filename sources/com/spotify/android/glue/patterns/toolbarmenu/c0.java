package com.spotify.android.glue.patterns.toolbarmenu;

import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* access modifiers changed from: package-private */
public final class c0 implements b0 {
    private final MenuItem a;

    /* access modifiers changed from: package-private */
    public class a implements MenuItem.OnMenuItemClickListener {
        final /* synthetic */ Runnable a;

        a(c0 c0Var, Runnable runnable) {
            this.a = runnable;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            this.a.run();
            return true;
        }
    }

    private c0(MenuItem menuItem) {
        this.a = menuItem;
    }

    static c0 b(Menu menu, int i, CharSequence charSequence, a4 a4Var) {
        MenuItem add = menu.add(0, i, 0, charSequence);
        add.setShowAsAction(2);
        if (a4Var != null) {
            e2.r(add, a4Var);
        }
        return new c0(add);
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.b0
    public b0 a(Runnable runnable) {
        this.a.setOnMenuItemClickListener(new a(this, runnable));
        return this;
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.b0
    public View getActionView() {
        return this.a.getActionView();
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.b0
    public b0 setActionView(View view) {
        this.a.setActionView(view);
        return this;
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.b0
    public b0 setIcon(int i) {
        this.a.setIcon(i);
        return this;
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.b0
    public b0 setIcon(Drawable drawable) {
        this.a.setIcon(drawable);
        return this;
    }
}

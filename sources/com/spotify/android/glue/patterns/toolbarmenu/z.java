package com.spotify.android.glue.patterns.toolbarmenu;

import android.content.Context;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.spotify.android.paste.app.c;
import com.spotify.paste.widgets.internal.StateListAnimatorImageButton;

public class z extends a4 {
    private final Menu d;

    public z(Context context, Menu menu) {
        super(context);
        this.d = menu;
    }

    @Override // defpackage.a4
    public View d() {
        return null;
    }

    @Override // defpackage.a4
    public View e(MenuItem menuItem) {
        if (menuItem.getIcon() == null) {
            TextView f = c.f(a());
            f.setText(menuItem.getTitle());
            bvd a = dvd.a(f);
            a.g(f);
            a.a();
            f.setOnClickListener(new y(this, menuItem));
            return f;
        }
        StateListAnimatorImageButton stateListAnimatorImageButton = new StateListAnimatorImageButton(a());
        stateListAnimatorImageButton.setImageDrawable(menuItem.getIcon());
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        stateListAnimatorImageButton.setBackground(null);
        stateListAnimatorImageButton.setContentDescription(menuItem.getTitle());
        stateListAnimatorImageButton.setOnClickListener(new x(this, menuItem));
        stateListAnimatorImageButton.setOnLongClickListener(new zc0());
        return stateListAnimatorImageButton;
    }
}

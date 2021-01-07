package android.support.wearable.view;

import android.app.AlertDialog;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.Button;

public class k {
    private Drawable a;
    private Drawable b;
    private Drawable c;
    Resources d;
    Resources.Theme e;

    public k(Resources resources, Resources.Theme theme) {
        this.d = resources;
        this.e = theme;
    }

    public void a(AlertDialog alertDialog) {
        b(alertDialog.getButton(-1), c(this.a, 0));
        b(alertDialog.getButton(-2), c(this.c, 0));
        b(alertDialog.getButton(-3), c(this.b, 0));
    }

    /* access modifiers changed from: package-private */
    public void b(Button button, Drawable drawable) {
        if (button != null) {
            button.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            button.setAllCaps(false);
        }
    }

    /* access modifiers changed from: package-private */
    public Drawable c(Drawable drawable, int i) {
        return (drawable != null || i == 0) ? drawable : this.d.getDrawable(i, this.e);
    }

    public k d(Drawable drawable) {
        this.c = drawable;
        return this;
    }

    public k e(Drawable drawable) {
        this.b = drawable;
        return this;
    }

    public k f(Drawable drawable) {
        this.a = drawable;
        return this;
    }
}

package defpackage;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: kba  reason: default package */
public class kba {
    private final Drawable a;
    private final AnimationDrawable b;

    kba(Drawable drawable, AnimationDrawable animationDrawable) {
        this.b = animationDrawable;
        this.a = drawable;
    }

    public AnimationDrawable a() {
        return this.b;
    }

    public Drawable b() {
        return this.a;
    }
}

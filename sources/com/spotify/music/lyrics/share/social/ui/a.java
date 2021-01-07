package com.spotify.music.lyrics.share.social.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.c;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

public final class a extends AppCompatTextView implements zud {
    private yud a = new yud(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, int i, Drawable drawable, String str) {
        super(context);
        h.e(context, "context");
        h.e(str, "text");
        setId(i);
        setText(str);
        setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable, (Drawable) null, (Drawable) null);
        setLayoutParams(new LinearLayout.LayoutParams(getResources().getDimensionPixelSize(C0707R.dimen.social_icon_width), -2));
        setCompoundDrawablePadding(getResources().getDimensionPixelSize(C0707R.dimen.std_8dp));
        setGravity(1);
        c.n(this, R.style.TextAppearance_Encore_Mesto);
        dvd.a(this).a();
    }

    private final int k(int i) {
        Resources system = Resources.getSystem();
        h.d(system, "Resources.getSystem()");
        return anf.b(system.getDisplayMetrics().density * ((float) i));
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        yud yud = this.a;
        if (yud != null) {
            yud.a();
        } else {
            h.k("stateListAnimatorHelper");
            throw null;
        }
    }

    @Override // defpackage.zud
    public l getStateListAnimatorCompat() {
        yud yud = this.a;
        if (yud != null) {
            l b = yud.b();
            h.d(b, "stateListAnimatorHelper.stateListAnimatorCompat");
            return b;
        }
        h.k("stateListAnimatorHelper");
        throw null;
    }

    public final void j() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(k(10), 0, k(10), 0);
            setLayoutParams(layoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    @Override // android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        yud yud = this.a;
        if (yud != null) {
            yud.c();
        } else {
            h.k("stateListAnimatorHelper");
            throw null;
        }
    }

    @Override // defpackage.zud
    public void setStateListAnimatorCompat(l lVar) {
        yud yud = this.a;
        if (yud != null) {
            yud.d(lVar);
        } else {
            h.k("stateListAnimatorHelper");
            throw null;
        }
    }
}

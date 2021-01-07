package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.widget.Button;
import androidx.core.graphics.drawable.a;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.util.e;
import com.spotify.music.C0707R;

public final class s extends Button {
    public s(Context context) {
        super(context, null, 16842824);
    }

    private static int a(int i, int i2, int i3, int i4) {
        if (i == 0) {
            return i2;
        }
        if (i == 1) {
            return i3;
        }
        if (i == 2) {
            return i4;
        }
        throw new IllegalStateException(je.f0(33, "Unknown color scheme: ", i));
    }

    public final void b(Resources resources, int i, int i2) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i3 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i3);
        setMinWidth(i3);
        int a = a(i2, C0707R.drawable.common_google_signin_btn_icon_dark, C0707R.drawable.common_google_signin_btn_icon_light, C0707R.drawable.common_google_signin_btn_icon_light);
        int a2 = a(i2, C0707R.drawable.common_google_signin_btn_text_dark, C0707R.drawable.common_google_signin_btn_text_light, C0707R.drawable.common_google_signin_btn_text_light);
        if (i == 0 || i == 1) {
            a = a2;
        } else if (i != 2) {
            throw new IllegalStateException(je.f0(32, "Unknown button size: ", i));
        }
        Drawable l = a.l(resources.getDrawable(a));
        a.i(l, resources.getColorStateList(C0707R.color.common_google_signin_btn_tint));
        a.j(l, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(l);
        ColorStateList colorStateList = resources.getColorStateList(a(i2, C0707R.color.common_google_signin_btn_text_dark, C0707R.color.common_google_signin_btn_text_light, C0707R.color.common_google_signin_btn_text_light));
        g.l(colorStateList);
        setTextColor(colorStateList);
        if (i == 0) {
            setText(resources.getString(C0707R.string.common_signin_button_text));
        } else if (i == 1) {
            setText(resources.getString(C0707R.string.common_signin_button_text_long));
        } else if (i == 2) {
            setText((CharSequence) null);
        } else {
            throw new IllegalStateException(je.f0(32, "Unknown button size: ", i));
        }
        setTransformationMethod(null);
        if (e.f(getContext())) {
            setGravity(19);
        }
    }
}

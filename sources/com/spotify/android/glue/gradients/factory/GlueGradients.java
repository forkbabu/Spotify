package com.spotify.android.glue.gradients.factory;

import android.content.Context;
import com.spotify.android.glue.gradients.GradientDrawable;
import com.spotify.encore.foundation.R;

public final class GlueGradients {

    /* JADX WARN: Init of enum a can be incorrect */
    /* JADX WARN: Init of enum b can be incorrect */
    public enum Style {
        PURPLE_LAKE(r1, r2),
        AQUATIC(r2, R.color.powder_green);
        
        private final int mEndColorRes;
        private final int mStartColorRes;

        static {
            int i = R.color.fuchsia;
            int i2 = R.color.klein_blue;
        }

        private Style(int i, int i2) {
            this.mStartColorRes = i;
            this.mEndColorRes = i2;
        }
    }

    public static GradientDrawable a(Context context, Style style, boolean z) {
        int c = i2.c(context.getResources(), style.mStartColorRes, null);
        int c2 = i2.c(context.getResources(), style.mEndColorRes, null);
        if (z) {
            return GradientDrawable.a(GradientDrawable.Type.LINEAR, c, c2);
        }
        return GradientDrawable.b(GradientDrawable.Type.LINEAR, c, c2);
    }
}

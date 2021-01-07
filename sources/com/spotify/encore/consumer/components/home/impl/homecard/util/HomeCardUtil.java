package com.spotify.encore.consumer.components.home.impl.homecard.util;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.home.api.homecard.HomeCard;
import kotlin.jvm.internal.h;

public final class HomeCardUtil {
    public static final HomeCardUtil INSTANCE = new HomeCardUtil();

    private HomeCardUtil() {
    }

    private final int calculateWidth(View view, float f, int i) {
        Resources resources = view.getResources();
        h.d(resources, "view.resources");
        return Math.min((int) (((float) resources.getDisplayMetrics().widthPixels) * f), nud.g((float) i, view.getResources()));
    }

    public final void resetTextAlignment(Context context, TextView... textViewArr) {
        h.e(context, "context");
        h.e(textViewArr, "textViews");
        boolean m = nud.m(context);
        int i = m ? 8388613 : 8388611;
        TextUtils.TruncateAt truncateAt = m ? TextUtils.TruncateAt.START : TextUtils.TruncateAt.END;
        for (TextView textView : textViewArr) {
            textView.setGravity(i);
            textView.setEllipsize(truncateAt);
        }
    }

    public final void setImageBottomMargin(ImageView imageView, HomeCard.Size size) {
        h.e(imageView, "imageView");
        h.e(size, "cardSize");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams)).bottomMargin = nud.g(size.getMargin(), imageView.getResources());
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    public final void setLayoutWidth(View view, HomeCard.Size size) {
        h.e(view, "rootView");
        h.e(size, "cardSize");
        int calculateWidth = calculateWidth(view, size.getPercentage(), size.getMaxWidth());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            view.setLayoutParams(new ViewGroup.LayoutParams(calculateWidth, -2));
        } else {
            layoutParams.width = calculateWidth;
        }
    }
}

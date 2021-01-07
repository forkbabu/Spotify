package com.spotify.paste.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.c;
import com.spotify.music.C0707R;

public final class NotificationBadgeView extends AppCompatTextView {
    private final int a;

    public NotificationBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.pasteDefaultsNotificationBadgeStyle);
    }

    public void setBadgeNumber(int i) {
        String str;
        if (i > this.a) {
            str = Integer.toString(this.a) + '+';
        } else {
            str = Integer.toString(i);
        }
        setText(str);
        setVisibility(i > 0 ? 0 : 8);
    }

    public NotificationBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.g, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        int integer = obtainStyledAttributes.getInteger(1, 99);
        obtainStyledAttributes.recycle();
        int i2 = q4.g;
        int i3 = Build.VERSION.SDK_INT;
        setBackground(drawable);
        c.n(this, resourceId);
        setMinWidth(dimensionPixelSize);
        setVisibility(8);
        this.a = integer;
    }
}

package com.spotify.android.paste.app;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.a;
import com.spotify.encore.foundation.R;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;

public final class d {
    /* JADX INFO: finally extract failed */
    public static Drawable a(Context context) {
        Drawable drawable;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{C0707R.attr.actionBarStyle});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, new int[]{C0707R.attr.background});
        try {
            drawable = obtainStyledAttributes2.getDrawable(0);
            obtainStyledAttributes2.recycle();
        } catch (Resources.NotFoundException e) {
            ColorDrawable colorDrawable = new ColorDrawable(a.b(context, R.color.gray_15));
            Assertion.i("Failed to load actionBar background drawable", e);
            obtainStyledAttributes2.recycle();
            drawable = colorDrawable;
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
        drawable.getClass();
        return drawable;
    }

    public static int b(Context context) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C0707R.attr.actionBarSize, typedValue, true)) {
            return 0;
        }
        return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
    }

    public static int c(Context context) {
        int b = b(context);
        return com.spotify.android.goldenpath.a.g(context) ? b + com.spotify.android.goldenpath.a.e(context.getResources()) : b;
    }

    public static void d(View view, Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.topMargin = com.spotify.android.goldenpath.a.e(context.getResources());
            view.setLayoutParams(marginLayoutParams);
        }
    }
}

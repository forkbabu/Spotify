package androidx.mediarouter.app;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.spotify.music.C0707R;

/* access modifiers changed from: package-private */
public final class g {
    public static int a(Context context) {
        float fraction;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        boolean z = displayMetrics.widthPixels < displayMetrics.heightPixels;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(z ? C0707R.dimen.mr_dialog_fixed_width_minor : C0707R.dimen.mr_dialog_fixed_width_major, typedValue, true);
        int i = typedValue.type;
        if (i == 5) {
            fraction = typedValue.getDimension(displayMetrics);
        } else if (i != 6) {
            return -2;
        } else {
            int i2 = displayMetrics.widthPixels;
            fraction = typedValue.getFraction((float) i2, (float) i2);
        }
        return (int) fraction;
    }

    public static int b(Context context) {
        if (!context.getResources().getBoolean(C0707R.bool.is_tablet)) {
            return -1;
        }
        return a(context);
    }
}

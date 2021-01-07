package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.spotify.encore.foundation.R;

/* renamed from: iqa  reason: default package */
public final class iqa {
    private static final int[] a = {R.color.salmon, R.color.electric_seafoam, R.color.azure, R.color.lavender, R.color.orange, R.color.chocolate};
    public static final /* synthetic */ int b = 0;

    public static int a(Context context, String str) {
        Resources resources = context.getResources();
        int abs = Math.abs(str.hashCode());
        int[] iArr = a;
        return resources.getColor(iArr[abs % iArr.length]);
    }

    public static int b(String str) {
        int abs = Math.abs(str.hashCode());
        int[] iArr = a;
        return iArr[abs % iArr.length];
    }
}

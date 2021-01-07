package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import kotlin.jvm.internal.h;

/* renamed from: ydb  reason: default package */
public final class ydb {
    public static final Bitmap a(View view, Integer num) {
        h.e(view, "view");
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        if (num != null) {
            canvas.drawColor(num.intValue());
        }
        view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        view.draw(canvas);
        h.d(createBitmap, "b");
        return createBitmap;
    }
}

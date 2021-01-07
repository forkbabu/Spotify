package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.internal.f;
import defpackage.bx;

/* renamed from: cx  reason: default package */
public class cx {
    public static final boolean a = (Build.VERSION.SDK_INT < 18);

    public static SparseArray<bx> a(Context context, f fVar) {
        SparseArray<bx> sparseArray = new SparseArray<>(fVar.size());
        for (int i = 0; i < fVar.size(); i++) {
            int keyAt = fVar.keyAt(i);
            bx.a aVar = (bx.a) fVar.valueAt(i);
            if (aVar != null) {
                sparseArray.put(keyAt, bx.c(context, aVar));
            } else {
                throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
            }
        }
        return sparseArray;
    }

    public static void b(bx bxVar, View view, FrameLayout frameLayout) {
        if (bxVar != null) {
            if (a) {
                frameLayout.setForeground(null);
            } else {
                view.getOverlay().remove(bxVar);
            }
        }
    }

    public static void c(bx bxVar, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        (a ? frameLayout : view).getDrawingRect(rect);
        bxVar.setBounds(rect);
        bxVar.n(view, frameLayout);
    }
}

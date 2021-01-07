package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.h;

/* renamed from: keb  reason: default package */
public final class keb extends RecyclerView.l {
    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void j(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
        h.e(rect, "outRect");
        h.e(view, "view");
        h.e(recyclerView, "parent");
        h.e(yVar, "state");
        ((RecyclerView.LayoutParams) view.getLayoutParams()).b();
        rect.set(0, 0, 0, 0);
        int width = (recyclerView.getWidth() - view.getWidth()) / 2;
        int height = (recyclerView.getHeight() - view.getHeight()) / 2;
        int X = recyclerView.X(view);
        if (X != -1) {
            if (X == 0) {
                rect.top = height;
                rect.left = width;
            } else if (X == recyclerView.getChildCount() - 1) {
                rect.top = height;
                rect.left = width / 2;
                rect.right = width;
            }
        }
    }
}

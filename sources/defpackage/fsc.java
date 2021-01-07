package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: fsc  reason: default package */
public class fsc extends RecyclerView.l {
    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void j(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
        ((RecyclerView.LayoutParams) view.getLayoutParams()).b();
        rect.set(0, 0, 0, 0);
        int c = yVar.c();
        int X = recyclerView.X(view);
        if (c <= 0 || X != c - 1) {
            rect.set(0, 0, 0, 0);
            return;
        }
        int measuredHeight = recyclerView.getMeasuredHeight();
        int childCount = recyclerView.getChildCount();
        int i = 0;
        int i2 = 0;
        while (i < childCount && i < 15) {
            i2 += recyclerView.getChildAt((childCount - i) - 1).getMeasuredHeight();
            i++;
        }
        int measuredHeight2 = (measuredHeight - i2) - view.getMeasuredHeight();
        if (measuredHeight2 < 0) {
            measuredHeight2 = 0;
        }
        rect.set(0, 0, 0, nud.f((float) measuredHeight2, view.getResources()));
    }
}

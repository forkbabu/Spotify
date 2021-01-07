package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: w05  reason: default package */
public class w05 extends RecyclerView.l {
    private final int a;

    public w05(int i) {
        this.a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void j(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
        int X = recyclerView.X(view);
        if (X != -1 && ((twd) recyclerView.getAdapter()) != null && X == 0) {
            rect.top = this.a;
        }
    }
}

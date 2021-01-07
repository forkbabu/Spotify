package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: v05  reason: default package */
public class v05 extends RecyclerView.l {
    private final int a;

    public v05(int i) {
        this.a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void j(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
        RecyclerView.e adapter;
        int X = recyclerView.X(view);
        if (X != -1 && (adapter = recyclerView.getAdapter()) != null && X == adapter.u() - 1) {
            rect.bottom = this.a;
        }
    }
}

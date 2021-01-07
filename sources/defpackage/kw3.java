package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: kw3  reason: default package */
class kw3 extends RecyclerView.l {
    private final int a;

    public kw3(int i) {
        this.a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void j(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
        int i = this.a;
        rect.right = i;
        rect.left = i;
    }
}

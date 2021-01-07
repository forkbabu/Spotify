package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: lw3  reason: default package */
class lw3 extends RecyclerView.q {
    lw3() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void c(RecyclerView recyclerView, int i, int i2) {
        View V;
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            float v0 = ((float) layoutManager.v0()) / 2.0f;
            int i3 = 0;
            while (i3 < layoutManager.W() && (V = layoutManager.V(i3)) != null) {
                V.setScaleY(((Math.min(v0, Math.abs(v0 - (((float) (layoutManager.b0(V) + layoutManager.d0(V))) / 2.0f))) * -0.1f) / v0) + 1.0f);
                i3++;
            }
        }
    }
}

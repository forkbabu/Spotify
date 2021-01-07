package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;

class g extends RecyclerView.l {
    private final Calendar a = v.f();
    private final Calendar b = v.f();
    final /* synthetic */ MaterialCalendar c;

    g(MaterialCalendar materialCalendar) {
        this.c = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.y yVar) {
        int i;
        if ((recyclerView.getAdapter() instanceof x) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            x xVar = (x) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            for (u3<Long, Long> u3Var : MaterialCalendar.M4(this.c).d1()) {
                F f = u3Var.a;
                if (!(f == null || u3Var.b == null)) {
                    this.a.setTimeInMillis(f.longValue());
                    this.b.setTimeInMillis(u3Var.b.longValue());
                    int Y = xVar.Y(this.a.get(1));
                    int Y2 = xVar.Y(this.b.get(1));
                    View Q = gridLayoutManager.Q(Y);
                    View Q2 = gridLayoutManager.Q(Y2);
                    int C2 = Y / gridLayoutManager.C2();
                    int C22 = Y2 / gridLayoutManager.C2();
                    for (int i2 = C2; i2 <= C22; i2++) {
                        View Q3 = gridLayoutManager.Q(gridLayoutManager.C2() * i2);
                        if (Q3 != null) {
                            int top = Q3.getTop() + MaterialCalendar.O4(this.c).d.c();
                            int bottom = Q3.getBottom() - MaterialCalendar.O4(this.c).d.b();
                            int width = i2 == C2 ? (Q.getWidth() / 2) + Q.getLeft() : 0;
                            if (i2 == C22) {
                                i = (Q2.getWidth() / 2) + Q2.getLeft();
                            } else {
                                i = recyclerView.getWidth();
                            }
                            canvas.drawRect((float) width, (float) top, (float) i, (float) bottom, MaterialCalendar.O4(this.c).h);
                        }
                    }
                }
            }
        }
    }
}

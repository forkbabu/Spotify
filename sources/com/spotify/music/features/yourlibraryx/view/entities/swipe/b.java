package com.spotify.music.features.yourlibraryx.view.entities.swipe;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import com.spotify.music.C0707R;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.h;

public final class b extends p.g {
    private boolean e = true;
    private final int f;
    private final int g;
    private final Paint h;
    private final boolean i;
    private final Set<Integer> j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(0, 12);
        h.e(context, "context");
        this.f = context.getResources().getDimensionPixelSize(C0707R.dimen.your_library_swipe_action_icon_size);
        this.g = context.getResources().getDimensionPixelSize(C0707R.dimen.your_library_swipe_action_icon_horizontal_offset);
        this.h = new Paint();
        this.i = nud.m(context);
        this.j = new LinkedHashSet();
    }

    @Override // androidx.recyclerview.widget.p.d
    public float g(float f2) {
        return Float.MAX_VALUE;
    }

    @Override // androidx.recyclerview.widget.p.d
    public float h(RecyclerView.b0 b0Var) {
        h.e(b0Var, "viewHolder");
        return Float.MAX_VALUE;
    }

    @Override // androidx.recyclerview.widget.p.d
    public void n(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var, float f2, float f3, int i2, boolean z) {
        h.e(canvas, "c");
        h.e(recyclerView, "recyclerView");
        h.e(b0Var, "viewHolder");
        View view = b0Var.a;
        h.d(view, "viewHolder.itemView");
        float width = ((float) view.getWidth()) * 0.5f;
        float b = knf.b(f2, -width, width);
        SwipeAction swipeAction = null;
        c cVar = (c) (!(b0Var instanceof c) ? null : b0Var);
        if (cVar != null) {
            View view2 = b0Var.a;
            h.d(view2, "viewHolder.itemView");
            if (b == 0.0f) {
                this.j.remove(Integer.valueOf(view2.hashCode()));
            } else {
                int height = (view2.getHeight() - this.f) / 2;
                Rect rect = new Rect(view2.getLeft(), view2.getTop(), view2.getLeft() + ((int) b), view2.getBottom());
                int i3 = rect.right - this.g;
                Rect rect2 = new Rect(i3 - this.f, rect.top + height, i3, rect.bottom - height);
                if (b < 0.0f) {
                    rect.offset(view2.getWidth(), 0);
                    rect2.offset((this.g * 2) + view2.getWidth() + this.f, 0);
                }
                boolean z2 = this.i;
                if (!z2 && b > 0.0f) {
                    swipeAction = cVar.l();
                } else if (!z2 && b < 0.0f) {
                    swipeAction = cVar.f();
                } else if (z2 && b > 0.0f) {
                    swipeAction = cVar.f();
                } else if (z2 && b < 0.0f) {
                    swipeAction = cVar.l();
                }
                if (swipeAction != null) {
                    this.h.setColor(swipeAction.b());
                    canvas.clipRect(rect);
                    canvas.drawRect(rect, this.h);
                    float abs = Math.abs(b) / ((float) view2.getWidth());
                    a d = swipeAction.d();
                    d.setBounds(rect2);
                    d.a(abs / 0.25f);
                    d.draw(canvas);
                    if (!z && abs > 0.25f && !this.j.contains(Integer.valueOf(view2.hashCode()))) {
                        swipeAction.c().invoke();
                        this.j.add(Integer.valueOf(view2.hashCode()));
                    }
                }
            }
        }
        super.n(canvas, recyclerView, b0Var, b, f3, i2, z);
    }

    @Override // androidx.recyclerview.widget.p.d
    public boolean o(RecyclerView recyclerView, RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2) {
        h.e(recyclerView, "recyclerView");
        h.e(b0Var, "viewHolder");
        h.e(b0Var2, "target");
        return false;
    }

    @Override // androidx.recyclerview.widget.p.d
    public void q(RecyclerView.b0 b0Var, int i2) {
        h.e(b0Var, "viewHolder");
    }

    @Override // androidx.recyclerview.widget.p.g
    public int r(RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        h.e(recyclerView, "recyclerView");
        h.e(b0Var, "viewHolder");
        int i2 = 0;
        if (!this.e) {
            return 0;
        }
        if (!(b0Var instanceof c)) {
            b0Var = null;
        }
        c cVar = (c) b0Var;
        if (cVar == null) {
            return 0;
        }
        int i3 = 4;
        if (cVar.l() != null) {
            i2 = 0 | (this.i ? 4 : 8);
        }
        if (cVar.f() == null) {
            return i2;
        }
        if (this.i) {
            i3 = 8;
        }
        return i2 | i3;
    }

    public final void s(boolean z) {
        this.e = z;
    }
}

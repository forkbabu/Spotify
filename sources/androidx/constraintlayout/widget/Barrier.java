package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.a;
import androidx.constraintlayout.solver.widgets.d;
import androidx.constraintlayout.solver.widgets.h;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;

public class Barrier extends ConstraintHelper {
    private int r;
    private int s;
    private a t;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void r(ConstraintWidget constraintWidget, int i, boolean z) {
        this.s = i;
        if (Build.VERSION.SDK_INT < 17) {
            int i2 = this.r;
            if (i2 == 5) {
                this.s = 0;
            } else if (i2 == 6) {
                this.s = 1;
            }
        } else if (z) {
            int i3 = this.r;
            if (i3 == 5) {
                this.s = 1;
            } else if (i3 == 6) {
                this.s = 0;
            }
        } else {
            int i4 = this.r;
            if (i4 == 5) {
                this.s = 0;
            } else if (i4 == 6) {
                this.s = 1;
            }
        }
        if (constraintWidget instanceof a) {
            ((a) constraintWidget).T0(this.s);
        }
    }

    public int getMargin() {
        return this.t.P0();
    }

    public int getType() {
        return this.r;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        this.t = new a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 15) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 14) {
                    this.t.S0(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == 16) {
                    this.t.U0(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f = this.t;
        p();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void i(b.a aVar, h hVar, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        super.i(aVar, hVar, layoutParams, sparseArray);
        if (hVar instanceof a) {
            a aVar2 = (a) hVar;
            r(aVar2, aVar.d.b0, ((d) hVar.R).W0());
            aVar2.S0(aVar.d.j0);
            aVar2.U0(aVar.d.c0);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void j(ConstraintWidget constraintWidget, boolean z) {
        r(constraintWidget, this.r, z);
    }

    public boolean q() {
        return this.t.N0();
    }

    public void setAllowsGoneWidget(boolean z) {
        this.t.S0(z);
    }

    public void setDpMargin(int i) {
        a aVar = this.t;
        aVar.U0((int) ((((float) i) * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.t.U0(i);
    }

    public void setType(int i) {
        this.r = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}

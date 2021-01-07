package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.e;
import androidx.constraintlayout.solver.widgets.h;
import androidx.constraintlayout.solver.widgets.j;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import androidx.constraintlayout.widget.b;

public class Flow extends VirtualLayout {
    private e t;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        this.t = new e();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.e.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.t.P1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 1) {
                    this.t.Z0(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 11) {
                    if (Build.VERSION.SDK_INT >= 17) {
                        this.t.e1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                    }
                } else if (index == 12) {
                    if (Build.VERSION.SDK_INT >= 17) {
                        this.t.b1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                    }
                } else if (index == 2) {
                    this.t.c1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 3) {
                    this.t.f1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 4) {
                    this.t.d1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 5) {
                    this.t.a1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 38) {
                    this.t.U1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 28) {
                    this.t.J1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 37) {
                    this.t.T1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 22) {
                    this.t.D1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 30) {
                    this.t.L1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 24) {
                    this.t.F1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 32) {
                    this.t.N1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 26) {
                    this.t.H1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 21) {
                    this.t.C1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 29) {
                    this.t.K1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 23) {
                    this.t.E1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 31) {
                    this.t.M1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 35) {
                    this.t.R1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 25) {
                    this.t.G1(obtainStyledAttributes.getInt(index, 2));
                } else if (index == 34) {
                    this.t.Q1(obtainStyledAttributes.getInt(index, 2));
                } else if (index == 27) {
                    this.t.I1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 36) {
                    this.t.S1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 33) {
                    this.t.O1(obtainStyledAttributes.getInt(index, -1));
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
        if (hVar instanceof e) {
            e eVar = (e) hVar;
            int i = layoutParams.R;
            if (i != -1) {
                eVar.P1(i);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void j(ConstraintWidget constraintWidget, boolean z) {
        this.t.M0(z);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onMeasure(int i, int i2) {
        q(this.t, i, i2);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    public void q(j jVar, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (jVar != null) {
            jVar.U0(mode, size, mode2, size2);
            setMeasuredDimension(jVar.P0(), jVar.O0());
            return;
        }
        setMeasuredDimension(0, 0);
    }

    public void setFirstHorizontalBias(float f) {
        this.t.C1(f);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.t.D1(i);
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.t.E1(f);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.t.F1(i);
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.t.G1(i);
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.t.H1(f);
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.t.I1(i);
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.t.J1(i);
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.t.O1(i);
        requestLayout();
    }

    public void setOrientation(int i) {
        this.t.P1(i);
        requestLayout();
    }

    public void setPadding(int i) {
        this.t.Z0(i);
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.t.a1(i);
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.t.c1(i);
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.t.d1(i);
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.t.f1(i);
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.t.Q1(i);
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.t.R1(f);
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.t.S1(i);
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.t.T1(i);
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.t.U1(i);
        requestLayout();
    }

    public Flow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

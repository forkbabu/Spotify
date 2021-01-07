package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.spotify.music.C0707R;
import java.util.Calendar;

/* access modifiers changed from: package-private */
public final class MaterialCalendarGridView extends GridView {
    private final Calendar a;

    class a extends z3 {
        a(MaterialCalendarGridView materialCalendarGridView) {
        }

        @Override // defpackage.z3
        public void onInitializeAccessibilityNodeInfo(View view, d5 d5Var) {
            super.onInitializeAccessibilityNodeInfo(view, d5Var);
            d5Var.T(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public p getAdapter() {
        return (p) super.getAdapter();
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        p a2 = getAdapter();
        d<?> dVar = a2.b;
        c cVar = a2.c;
        Long b = a2.getItem(a2.a());
        Long b2 = a2.getItem(a2.c());
        for (u3<Long, Long> u3Var : dVar.d1()) {
            F f = u3Var.a;
            if (f != null) {
                if (u3Var.b == null) {
                    continue;
                } else {
                    long longValue = f.longValue();
                    long longValue2 = u3Var.b.longValue();
                    Long valueOf = Long.valueOf(longValue);
                    Long valueOf2 = Long.valueOf(longValue2);
                    int i5 = 1;
                    if (!(b == null || b2 == null || valueOf == null || valueOf2 == null || valueOf.longValue() > b2.longValue() || valueOf2.longValue() < b.longValue())) {
                        if (longValue < b.longValue()) {
                            i2 = a2.a();
                            if (i2 % a2.a.n == 0) {
                                i = 0;
                            } else {
                                i = materialCalendarGridView.getChildAt(i2 - 1).getRight();
                            }
                        } else {
                            materialCalendarGridView.a.setTimeInMillis(longValue);
                            i2 = (materialCalendarGridView.a.get(5) - 1) + a2.a();
                            View childAt = materialCalendarGridView.getChildAt(i2);
                            i = (childAt.getWidth() / 2) + childAt.getLeft();
                        }
                        if (longValue2 > b2.longValue()) {
                            i4 = Math.min(a2.c(), getChildCount() - 1);
                            if ((i4 + 1) % a2.a.n == 0) {
                                i3 = getWidth();
                            } else {
                                i3 = materialCalendarGridView.getChildAt(i4).getRight();
                            }
                        } else {
                            materialCalendarGridView.a.setTimeInMillis(longValue2);
                            i4 = (materialCalendarGridView.a.get(5) - 1) + a2.a();
                            View childAt2 = materialCalendarGridView.getChildAt(i4);
                            i3 = (childAt2.getWidth() / 2) + childAt2.getLeft();
                        }
                        int itemId = (int) a2.getItemId(i2);
                        int itemId2 = (int) a2.getItemId(i4);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - i5;
                            View childAt3 = materialCalendarGridView.getChildAt(numColumns);
                            canvas.drawRect((float) (numColumns > i2 ? 0 : i), (float) (childAt3.getTop() + cVar.a.c()), (float) (i4 > numColumns2 ? getWidth() : i3), (float) (childAt3.getBottom() - cVar.a.b()), cVar.h);
                            itemId++;
                            i5 = 1;
                            materialCalendarGridView = this;
                        }
                    } else {
                        return;
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
        } else if (i == 33) {
            setSelection(getAdapter().c());
        } else if (i == 130) {
            setSelection(getAdapter().a());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.view.KeyEvent.Callback, android.widget.AbsListView, android.view.View
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().a()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
        if (i < getAdapter().a()) {
            super.setSelection(getAdapter().a());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = v.f();
        if (MaterialDatePicker.k5(getContext())) {
            setNextFocusLeftId(C0707R.id.cancel_button);
            setNextFocusRightId(C0707R.id.confirm_button);
        }
        q4.I(this, new a(this));
    }

    @Override // android.widget.GridView, android.widget.AbsListView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof p) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), p.class.getCanonicalName()));
    }
}

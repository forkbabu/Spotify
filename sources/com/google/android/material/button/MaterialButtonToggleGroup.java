package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.j;
import com.google.android.material.internal.o;
import com.spotify.music.C0707R;
import defpackage.d5;
import defpackage.dy;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;

public class MaterialButtonToggleGroup extends LinearLayout {
    private static final String t = MaterialButtonToggleGroup.class.getSimpleName();
    private final List<d> a;
    private final c b;
    private final f c;
    private final LinkedHashSet<e> f;
    private final Comparator<MaterialButton> n;
    private Integer[] o;
    private boolean p;
    private boolean q;
    private boolean r;
    private int s;

    class a implements Comparator<MaterialButton> {
        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            MaterialButton materialButton3 = materialButton;
            MaterialButton materialButton4 = materialButton2;
            int compareTo = Boolean.valueOf(materialButton3.isChecked()).compareTo(Boolean.valueOf(materialButton4.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton3.isPressed()).compareTo(Boolean.valueOf(materialButton4.isPressed()));
            return compareTo2 != 0 ? compareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton3)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton4)));
        }
    }

    class b extends z3 {
        b() {
        }

        @Override // defpackage.z3
        public void onInitializeAccessibilityNodeInfo(View view, d5 d5Var) {
            super.onInitializeAccessibilityNodeInfo(view, d5Var);
            d5Var.U(d5.c.a(0, 1, MaterialButtonToggleGroup.a(MaterialButtonToggleGroup.this, view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* access modifiers changed from: private */
    public class c implements MaterialButton.a {
        c(a aVar) {
        }

        @Override // com.google.android.material.button.MaterialButton.a
        public void a(MaterialButton materialButton, boolean z) {
            if (!MaterialButtonToggleGroup.this.p) {
                if (MaterialButtonToggleGroup.this.q) {
                    MaterialButtonToggleGroup.this.s = z ? materialButton.getId() : -1;
                }
                if (MaterialButtonToggleGroup.this.l(materialButton.getId(), z)) {
                    MaterialButtonToggleGroup.this.h(materialButton.getId(), materialButton.isChecked());
                }
                MaterialButtonToggleGroup.this.invalidate();
            }
        }
    }

    /* access modifiers changed from: private */
    public static class d {
        private static final tx e = new rx(0.0f);
        tx a;
        tx b;
        tx c;
        tx d;

        d(tx txVar, tx txVar2, tx txVar3, tx txVar4) {
            this.a = txVar;
            this.b = txVar3;
            this.c = txVar4;
            this.d = txVar2;
        }

        public static d a(d dVar) {
            tx txVar = e;
            return new d(txVar, dVar.d, txVar, dVar.c);
        }

        public static d b(d dVar, View view) {
            tx txVar = e;
            if (o.g(view)) {
                return new d(dVar.a, dVar.d, txVar, txVar);
            }
            return new d(txVar, txVar, dVar.b, dVar.c);
        }

        public static d c(d dVar, View view) {
            tx txVar = e;
            if (o.g(view)) {
                return new d(txVar, txVar, dVar.b, dVar.c);
            }
            return new d(dVar.a, dVar.d, txVar, txVar);
        }

        public static d d(d dVar) {
            tx txVar = dVar.a;
            tx txVar2 = e;
            return new d(txVar, txVar2, dVar.b, txVar2);
        }
    }

    public interface e {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z);
    }

    /* access modifiers changed from: private */
    public class f implements MaterialButton.b {
        f(a aVar) {
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.materialButtonToggleGroupStyle);
    }

    static int a(MaterialButtonToggleGroup materialButtonToggleGroup, View view) {
        materialButtonToggleGroup.getClass();
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < materialButtonToggleGroup.getChildCount(); i2++) {
            if (materialButtonToggleGroup.getChildAt(i2) == view) {
                return i;
            }
            if ((materialButtonToggleGroup.getChildAt(i2) instanceof MaterialButton) && materialButtonToggleGroup.j(i2)) {
                i++;
            }
        }
        return -1;
    }

    private void g() {
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
                MaterialButton i2 = i(i);
                int min = Math.min(i2.getStrokeWidth(), i(i - 1).getStrokeWidth());
                ViewGroup.LayoutParams layoutParams2 = i2.getLayoutParams();
                if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    layoutParams = (LinearLayout.LayoutParams) layoutParams2;
                } else {
                    layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
                }
                if (getOrientation() == 0) {
                    e2.s(layoutParams, 0);
                    e2.t(layoutParams, -min);
                } else {
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = -min;
                }
                i2.setLayoutParams(layoutParams);
            }
            if (!(getChildCount() == 0 || firstVisibleChildIndex == -1)) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
                if (getOrientation() == 1) {
                    layoutParams3.topMargin = 0;
                    layoutParams3.bottomMargin = 0;
                    return;
                }
                e2.s(layoutParams3, 0);
                e2.t(layoutParams3, 0);
                layoutParams3.leftMargin = 0;
                layoutParams3.rightMargin = 0;
            }
        }
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (j(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (j(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && j(i2)) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void h(int i, boolean z) {
        Iterator<e> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().a(this, i, z);
        }
    }

    private MaterialButton i(int i) {
        return (MaterialButton) getChildAt(i);
    }

    private boolean j(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    private void k(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof MaterialButton) {
            this.p = true;
            ((MaterialButton) findViewById).setChecked(z);
            this.p = false;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean l(int i, boolean z) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (!this.r || !checkedButtonIds.isEmpty()) {
            if (z && this.q) {
                checkedButtonIds.remove(Integer.valueOf(i));
                for (Integer num : checkedButtonIds) {
                    int intValue = num.intValue();
                    k(intValue, false);
                    h(intValue, false);
                }
            }
            return true;
        }
        k(i, true);
        this.s = i;
        return false;
    }

    private void setCheckedId(int i) {
        this.s = i;
        h(i, true);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(q4.f());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.b(this.b);
        materialButton.setOnPressedChangeListenerInternal(this.c);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(t, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        if (materialButton.isChecked()) {
            l(materialButton.getId(), true);
            setCheckedId(materialButton.getId());
        }
        dy shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.a.add(new d(shapeAppearanceModel.k(), shapeAppearanceModel.e(), shapeAppearanceModel.m(), shapeAppearanceModel.g()));
        q4.I(materialButton, new b());
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.n);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(i(i), Integer.valueOf(i));
        }
        this.o = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.View, android.view.ViewGroup
    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.q) {
            return this.s;
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton i2 = i(i);
            if (i2.isChecked()) {
                arrayList.add(Integer.valueOf(i2.getId()));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.o;
        return (numArr == null || i2 >= numArr.length) ? i2 : numArr[i2].intValue();
    }

    /* access modifiers changed from: package-private */
    public void m() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        int i = 0;
        while (i < childCount) {
            MaterialButton i2 = i(i);
            if (i2.getVisibility() != 8) {
                dy shapeAppearanceModel = i2.getShapeAppearanceModel();
                shapeAppearanceModel.getClass();
                dy.b bVar = new dy.b(shapeAppearanceModel);
                d dVar = this.a.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z = getOrientation() == 0;
                    if (i == firstVisibleChildIndex) {
                        dVar = z ? d.c(dVar, this) : d.d(dVar);
                    } else {
                        dVar = i == lastVisibleChildIndex ? z ? d.b(dVar, this) : d.a(dVar) : null;
                    }
                }
                if (dVar == null) {
                    bVar.o(0.0f);
                } else {
                    bVar.A(dVar.a);
                    bVar.t(dVar.d);
                    bVar.D(dVar.b);
                    bVar.w(dVar.c);
                }
                i2.setShapeAppearanceModel(bVar.m());
            }
            i++;
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.s;
        if (i != -1) {
            k(i, true);
            l(i, true);
            setCheckedId(i);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        d5.v0(accessibilityNodeInfo).T(d5.b.b(1, getVisibleButtonCount(), false, this.q ? 1 : 2));
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        m();
        g();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.e(this.b);
            materialButton.setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.a.remove(indexOfChild);
        }
        m();
        g();
    }

    public void setSelectionRequired(boolean z) {
        this.r = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.q != z) {
            this.q = z;
            this.p = true;
            for (int i = 0; i < getChildCount(); i++) {
                MaterialButton i2 = i(i);
                i2.setChecked(false);
                h(i2.getId(), false);
            }
            this.p = false;
            setCheckedId(-1);
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i) {
        super(iy.a(context, attributeSet, i, C0707R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, i);
        this.a = new ArrayList();
        this.b = new c(null);
        this.c = new f(null);
        this.f = new LinkedHashSet<>();
        this.n = new a();
        this.p = false;
        TypedArray f2 = j.f(getContext(), attributeSet, pw.u, i, C0707R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(f2.getBoolean(2, false));
        this.s = f2.getResourceId(0, -1);
        this.r = f2.getBoolean(1, false);
        setChildrenDrawingOrderEnabled(true);
        f2.recycle();
        q4.O(this, 1);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}

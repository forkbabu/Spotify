package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.g;
import androidx.constraintlayout.solver.widgets.h;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import java.util.Arrays;
import java.util.HashMap;

public abstract class ConstraintHelper extends View {
    protected int[] a;
    protected int b;
    protected Context c;
    protected g f;
    protected String n;
    protected String o;
    private View[] p;
    private HashMap<Integer, String> q;

    public ConstraintHelper(Context context) {
        super(context);
        this.a = new int[32];
        this.p = null;
        this.q = new HashMap<>();
        this.c = context;
        h(null);
    }

    private void a(String str) {
        if (str != null && str.length() != 0 && this.c != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            }
            int f2 = f(trim);
            if (f2 != 0) {
                this.q.put(Integer.valueOf(f2), trim);
                b(f2);
            }
        }
    }

    private void b(int i) {
        if (i != getId()) {
            int i2 = this.b + 1;
            int[] iArr = this.a;
            if (i2 > iArr.length) {
                this.a = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.a;
            int i3 = this.b;
            iArr2[i3] = i;
            this.b = i3 + 1;
        }
    }

    private void c(String str) {
        if (!(str == null || str.length() == 0 || this.c == null)) {
            String trim = str.trim();
            ConstraintLayout constraintLayout = null;
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            }
            if (constraintLayout != null) {
                int childCount = constraintLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = constraintLayout.getChildAt(i);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if ((layoutParams instanceof ConstraintLayout.LayoutParams) && trim.equals(((ConstraintLayout.LayoutParams) layoutParams).U)) {
                        if (childAt.getId() == -1) {
                            childAt.getClass().getSimpleName();
                        } else {
                            b(childAt.getId());
                        }
                    }
                }
            }
        }
    }

    private int e(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int f(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, str);
            if (designInformation instanceof Integer) {
                i = ((Integer) designInformation).intValue();
            }
        }
        if (i == 0 && constraintLayout != null) {
            i = e(constraintLayout, str);
        }
        if (i == 0) {
            try {
                i = d.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return i == 0 ? this.c.getResources().getIdentifier(str, "id", this.c.getPackageName()) : i;
    }

    /* access modifiers changed from: protected */
    public void d() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
            for (int i = 0; i < this.b; i++) {
                View viewById = constraintLayout.getViewById(this.a[i]);
                if (viewById != null) {
                    viewById.setVisibility(visibility);
                    if (elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public View[] g(ConstraintLayout constraintLayout) {
        View[] viewArr = this.p;
        if (viewArr == null || viewArr.length != this.b) {
            this.p = new View[this.b];
        }
        for (int i = 0; i < this.b; i++) {
            this.p[i] = constraintLayout.getViewById(this.a[i]);
        }
        return this.p;
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.a, this.b);
    }

    /* access modifiers changed from: protected */
    public void h(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 19) {
                    String string = obtainStyledAttributes.getString(index);
                    this.n = string;
                    setIds(string);
                } else if (index == 20) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.o = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void i(b.a aVar, h hVar, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        b.C0024b bVar = aVar.d;
        int[] iArr = bVar.e0;
        int i = 0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = bVar.f0;
            if (str != null && str.length() > 0) {
                b.C0024b bVar2 = aVar.d;
                String[] split = bVar2.f0.split(",");
                getContext();
                int[] iArr2 = new int[split.length];
                int i2 = 0;
                for (String str2 : split) {
                    int f2 = f(str2.trim());
                    if (f2 != 0) {
                        iArr2[i2] = f2;
                        i2++;
                    }
                }
                if (i2 != split.length) {
                    iArr2 = Arrays.copyOf(iArr2, i2);
                }
                bVar2.e0 = iArr2;
            }
        }
        hVar.b();
        if (aVar.d.e0 != null) {
            while (true) {
                int[] iArr3 = aVar.d.e0;
                if (i < iArr3.length) {
                    ConstraintWidget constraintWidget = sparseArray.get(iArr3[i]);
                    if (constraintWidget != null) {
                        hVar.a(constraintWidget);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void j(ConstraintWidget constraintWidget, boolean z) {
    }

    public void k(ConstraintLayout constraintLayout) {
    }

    public void l() {
    }

    public void m(ConstraintLayout constraintLayout) {
    }

    /* JADX WARN: Incorrect args count in method signature: (Landroidx/constraintlayout/solver/widgets/d;Landroidx/constraintlayout/solver/widgets/g;Landroid/util/SparseArray<Landroidx/constraintlayout/solver/widgets/ConstraintWidget;>;)V */
    public void n(g gVar, SparseArray sparseArray) {
        gVar.b();
        for (int i = 0; i < this.b; i++) {
            gVar.a((ConstraintWidget) sparseArray.get(this.a[i]));
        }
    }

    public void o(ConstraintLayout constraintLayout) {
        String str;
        int e;
        if (isInEditMode()) {
            setIds(this.n);
        }
        g gVar = this.f;
        if (gVar != null) {
            gVar.b();
            for (int i = 0; i < this.b; i++) {
                int i2 = this.a[i];
                View viewById = constraintLayout.getViewById(i2);
                if (viewById == null && (e = e(constraintLayout, (str = this.q.get(Integer.valueOf(i2))))) != 0) {
                    this.a[i] = e;
                    this.q.put(Integer.valueOf(e), str);
                    viewById = constraintLayout.getViewById(e);
                }
                if (viewById != null) {
                    this.f.a(constraintLayout.getViewWidget(viewById));
                }
            }
            this.f.c(constraintLayout.mLayoutWidget);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.n;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.o;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void p() {
        if (this.f != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                ((ConstraintLayout.LayoutParams) layoutParams).l0 = (ConstraintWidget) this.f;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setIds(String str) {
        this.n = str;
        if (str != null) {
            int i = 0;
            this.b = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    a(str.substring(i));
                    return;
                } else {
                    a(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setReferenceTags(String str) {
        this.o = str;
        if (str != null) {
            int i = 0;
            this.b = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    c(str.substring(i));
                    return;
                } else {
                    c(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.n = null;
        this.b = 0;
        for (int i : iArr) {
            b(i);
        }
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.n == null) {
            b(i);
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new int[32];
        this.p = null;
        this.q = new HashMap<>();
        this.c = context;
        h(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new int[32];
        this.p = null;
        this.q = new HashMap<>();
        this.c = context;
        h(attributeSet);
    }
}

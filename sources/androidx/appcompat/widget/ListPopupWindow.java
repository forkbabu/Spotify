package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.p;
import com.comscore.streaming.ContentMediaFormat;
import com.spotify.music.C0707R;
import java.lang.reflect.Method;

public class ListPopupWindow implements p {
    private static Method J;
    private static Method K;
    private static Method L;
    final e A;
    private final d B;
    private final c C;
    private final a D;
    final Handler E;
    private final Rect F;
    private Rect G;
    private boolean H;
    PopupWindow I;
    private Context a;
    private ListAdapter b;
    r c;
    private int f;
    private int n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    private boolean t;
    private int u;
    int v;
    private int w;
    private DataSetObserver x;
    private View y;
    private AdapterView.OnItemClickListener z;

    /* access modifiers changed from: private */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            r rVar = ListPopupWindow.this.c;
            if (rVar != null) {
                rVar.setListSelectionHidden(true);
                rVar.requestLayout();
            }
        }
    }

    /* access modifiers changed from: private */
    public class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (ListPopupWindow.this.b()) {
                ListPopupWindow.this.a();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    /* access modifiers changed from: private */
    public class c implements AbsListView.OnScrollListener {
        c() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            boolean z = true;
            if (i == 1) {
                if (ListPopupWindow.this.I.getInputMethodMode() != 2) {
                    z = false;
                }
                if (!z && ListPopupWindow.this.I.getContentView() != null) {
                    ListPopupWindow listPopupWindow = ListPopupWindow.this;
                    listPopupWindow.E.removeCallbacks(listPopupWindow.A);
                    ListPopupWindow.this.A.run();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public class d implements View.OnTouchListener {
        d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = ListPopupWindow.this.I) != null && popupWindow.isShowing() && x >= 0 && x < ListPopupWindow.this.I.getWidth() && y >= 0 && y < ListPopupWindow.this.I.getHeight()) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.E.postDelayed(listPopupWindow.A, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                ListPopupWindow listPopupWindow2 = ListPopupWindow.this;
                listPopupWindow2.E.removeCallbacks(listPopupWindow2.A);
                return false;
            }
        }
    }

    /* access modifiers changed from: private */
    public class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            r rVar = ListPopupWindow.this.c;
            if (rVar != null && q4.v(rVar) && ListPopupWindow.this.c.getCount() > ListPopupWindow.this.c.getChildCount()) {
                int childCount = ListPopupWindow.this.c.getChildCount();
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                if (childCount <= listPopupWindow.v) {
                    listPopupWindow.I.setInputMethodMode(2);
                    ListPopupWindow.this.a();
                }
            }
        }
    }

    static {
        Class cls = Boolean.TYPE;
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                J = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
            }
            try {
                L = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                K = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.listPopupWindowStyle);
    }

    public void A(int i) {
        this.u = i;
    }

    public void B(Rect rect) {
        this.G = rect != null ? new Rect(rect) : null;
    }

    public void C(int i) {
        this.I.setInputMethodMode(i);
    }

    public void D(boolean z2) {
        this.H = z2;
        this.I.setFocusable(z2);
    }

    public void E(PopupWindow.OnDismissListener onDismissListener) {
        this.I.setOnDismissListener(onDismissListener);
    }

    public void F(AdapterView.OnItemClickListener onItemClickListener) {
        this.z = onItemClickListener;
    }

    public void G(boolean z2) {
        this.t = true;
        this.s = z2;
    }

    public void H(int i) {
        this.w = i;
    }

    @Override // androidx.appcompat.view.menu.p
    public void a() {
        int i;
        int i2;
        int i3;
        r rVar;
        int i4;
        if (this.c == null) {
            r q2 = q(this.a, !this.H);
            this.c = q2;
            q2.setAdapter(this.b);
            this.c.setOnItemClickListener(this.z);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new u(this));
            this.c.setOnScrollListener(this.C);
            this.I.setContentView(this.c);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.I.getContentView();
        }
        Drawable background = this.I.getBackground();
        int i5 = 0;
        if (background != null) {
            background.getPadding(this.F);
            Rect rect = this.F;
            int i6 = rect.top;
            i = rect.bottom + i6;
            if (!this.r) {
                this.p = -i6;
            }
        } else {
            this.F.setEmpty();
            i = 0;
        }
        boolean z2 = this.I.getInputMethodMode() == 2;
        View view = this.y;
        int i7 = this.p;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = K;
            if (method != null) {
                try {
                    i2 = ((Integer) method.invoke(this.I, view, Integer.valueOf(i7), Boolean.valueOf(z2))).intValue();
                } catch (Exception unused) {
                }
            }
            i2 = this.I.getMaxAvailableHeight(view, i7);
        } else {
            i2 = this.I.getMaxAvailableHeight(view, i7, z2);
        }
        if (this.f == -1) {
            i3 = i2 + i;
        } else {
            int i8 = this.n;
            if (i8 == -2) {
                int i9 = this.a.getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = this.F;
                i4 = View.MeasureSpec.makeMeasureSpec(i9 - (rect2.left + rect2.right), Integer.MIN_VALUE);
            } else if (i8 != -1) {
                i4 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
            } else {
                int i10 = this.a.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.F;
                i4 = View.MeasureSpec.makeMeasureSpec(i10 - (rect3.left + rect3.right), 1073741824);
            }
            int a2 = this.c.a(i4, 0, -1, i2 + 0, -1);
            i3 = a2 + (a2 > 0 ? this.c.getPaddingBottom() + this.c.getPaddingTop() + i + 0 : 0);
        }
        boolean z3 = this.I.getInputMethodMode() == 2;
        androidx.core.widget.c.o(this.I, this.q);
        if (!this.I.isShowing()) {
            int i11 = this.n;
            if (i11 == -1) {
                i11 = -1;
            } else if (i11 == -2) {
                i11 = this.y.getWidth();
            }
            int i12 = this.f;
            if (i12 == -1) {
                i3 = -1;
            } else if (i12 != -2) {
                i3 = i12;
            }
            this.I.setWidth(i11);
            this.I.setHeight(i3);
            if (Build.VERSION.SDK_INT <= 28) {
                Method method2 = J;
                if (method2 != null) {
                    try {
                        method2.invoke(this.I, Boolean.TRUE);
                    } catch (Exception unused2) {
                    }
                }
            } else {
                this.I.setIsClippedToScreen(true);
            }
            this.I.setOutsideTouchable(true);
            this.I.setTouchInterceptor(this.B);
            if (this.t) {
                androidx.core.widget.c.l(this.I, this.s);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method3 = L;
                if (method3 != null) {
                    try {
                        method3.invoke(this.I, this.G);
                    } catch (Exception e2) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                    }
                }
            } else {
                this.I.setEpicenterBounds(this.G);
            }
            PopupWindow popupWindow = this.I;
            View view2 = this.y;
            int i13 = this.o;
            int i14 = this.p;
            int i15 = this.u;
            if (Build.VERSION.SDK_INT >= 19) {
                popupWindow.showAsDropDown(view2, i13, i14, i15);
            } else {
                if ((e2.h(i15, q4.o(view2)) & 7) == 5) {
                    i13 -= popupWindow.getWidth() - view2.getWidth();
                }
                popupWindow.showAsDropDown(view2, i13, i14);
            }
            this.c.setSelection(-1);
            if ((!this.H || this.c.isInTouchMode()) && (rVar = this.c) != null) {
                rVar.setListSelectionHidden(true);
                rVar.requestLayout();
            }
            if (!this.H) {
                this.E.post(this.D);
            }
        } else if (q4.v(this.y)) {
            int i16 = this.n;
            if (i16 == -1) {
                i16 = -1;
            } else if (i16 == -2) {
                i16 = this.y.getWidth();
            }
            int i17 = this.f;
            if (i17 == -1) {
                if (!z3) {
                    i3 = -1;
                }
                if (z3) {
                    this.I.setWidth(this.n == -1 ? -1 : 0);
                    this.I.setHeight(0);
                } else {
                    PopupWindow popupWindow2 = this.I;
                    if (this.n == -1) {
                        i5 = -1;
                    }
                    popupWindow2.setWidth(i5);
                    this.I.setHeight(-1);
                }
            } else if (i17 != -2) {
                i3 = i17;
            }
            this.I.setOutsideTouchable(true);
            this.I.update(this.y, this.o, this.p, i16 < 0 ? -1 : i16, i3 < 0 ? -1 : i3);
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean b() {
        return this.I.isShowing();
    }

    public int c() {
        return this.o;
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        this.I.dismiss();
        this.I.setContentView(null);
        this.c = null;
        this.E.removeCallbacks(this.A);
    }

    public void e(int i) {
        this.o = i;
    }

    public Drawable g() {
        return this.I.getBackground();
    }

    public void i(int i) {
        this.p = i;
        this.r = true;
    }

    public int l() {
        if (!this.r) {
            return 0;
        }
        return this.p;
    }

    @Override // androidx.appcompat.widget.AppCompatSpinner.f
    public void m(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.x;
        if (dataSetObserver == null) {
            this.x = new b();
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.x);
        }
        r rVar = this.c;
        if (rVar != null) {
            rVar.setAdapter(this.b);
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView o() {
        return this.c;
    }

    public void p(Drawable drawable) {
        this.I.setBackgroundDrawable(drawable);
    }

    /* access modifiers changed from: package-private */
    public r q(Context context, boolean z2) {
        return new r(context, z2);
    }

    public Object r() {
        if (!b()) {
            return null;
        }
        return this.c.getSelectedItem();
    }

    public long s() {
        if (!b()) {
            return Long.MIN_VALUE;
        }
        return this.c.getSelectedItemId();
    }

    public int t() {
        if (!b()) {
            return -1;
        }
        return this.c.getSelectedItemPosition();
    }

    public View u() {
        if (!b()) {
            return null;
        }
        return this.c.getSelectedView();
    }

    public int v() {
        return this.n;
    }

    public boolean w() {
        return this.H;
    }

    public void x(View view) {
        this.y = view;
    }

    public void y(int i) {
        this.I.setAnimationStyle(i);
    }

    public void z(int i) {
        Drawable background = this.I.getBackground();
        if (background != null) {
            background.getPadding(this.F);
            Rect rect = this.F;
            this.n = rect.left + rect.right + i;
            return;
        }
        this.n = i;
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f = -2;
        this.n = -2;
        this.q = ContentMediaFormat.FULL_CONTENT_EPISODE;
        this.u = 0;
        this.v = Integer.MAX_VALUE;
        this.w = 0;
        this.A = new e();
        this.B = new d();
        this.C = new c();
        this.D = new a();
        this.F = new Rect();
        this.a = context;
        this.E = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h0.p, i, i2);
        this.o = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.p = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.r = true;
        }
        obtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i, i2);
        this.I = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }
}

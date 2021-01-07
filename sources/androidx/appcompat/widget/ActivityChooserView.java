package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.p;
import com.spotify.music.C0707R;

public class ActivityChooserView extends ViewGroup {
    final f a;
    private final g b;
    private final View c;
    private final Drawable f;
    final FrameLayout n;
    private final ImageView o;
    final FrameLayout p;
    private final ImageView q;
    private final int r;
    a4 s;
    final DataSetObserver t;
    private final ViewTreeObserver.OnGlobalLayoutListener u;
    private ListPopupWindow v;
    PopupWindow.OnDismissListener w;
    int x;
    private boolean y;
    private int z;

    public static class InnerLayout extends LinearLayout {
        private static final int[] a = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            h0 u = h0.u(context, attributeSet, a);
            setBackgroundDrawable(u.g(0));
            u.w();
        }
    }

    class a extends DataSetObserver {
        a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.a.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.a.notifyDataSetInvalidated();
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!ActivityChooserView.this.b()) {
                return;
            }
            if (!ActivityChooserView.this.isShown()) {
                ActivityChooserView.this.getListPopupWindow().dismiss();
                return;
            }
            ActivityChooserView.this.getListPopupWindow().a();
            a4 a4Var = ActivityChooserView.this.s;
            if (a4Var != null) {
                a4Var.m(true);
            }
        }
    }

    class c extends View.AccessibilityDelegate {
        c(ActivityChooserView activityChooserView) {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            d5.v0(accessibilityNodeInfo).O(true);
        }
    }

    class d extends t {
        d(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.t
        public p b() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        /* access modifiers changed from: protected */
        @Override // androidx.appcompat.widget.t
        public boolean c() {
            ActivityChooserView.this.c();
            return true;
        }

        /* access modifiers changed from: protected */
        @Override // androidx.appcompat.widget.t
        public boolean d() {
            ActivityChooserView.this.a();
            return true;
        }
    }

    class e extends DataSetObserver {
        e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.a.getClass();
            throw null;
        }
    }

    /* access modifiers changed from: private */
    public class f extends BaseAdapter {
        private int a = 4;
        private boolean b;
        private boolean c;

        f() {
        }

        public boolean a() {
            return this.b;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            throw null;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            if (this.c) {
                throw null;
            } else if (!this.b) {
                throw null;
            } else {
                throw null;
            }
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return (long) i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            if (!this.c) {
                return 0;
            }
            throw null;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (!this.c) {
                if (view == null || view.getId() != C0707R.id.list_item) {
                    view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(C0707R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
                }
                ActivityChooserView.this.getContext().getPackageManager();
                ImageView imageView = (ImageView) view.findViewById(C0707R.id.icon);
                getItem(i);
                throw null;
            }
            throw null;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }
    }

    /* access modifiers changed from: private */
    public class g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.p) {
                activityChooserView.a();
                ActivityChooserView.this.a.getClass();
                throw null;
            } else if (view == activityChooserView.n) {
                activityChooserView.d(activityChooserView.x);
                throw null;
            } else {
                throw new IllegalArgumentException();
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.w;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
            a4 a4Var = ActivityChooserView.this.s;
            if (a4Var != null) {
                a4Var.m(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ((f) adapterView.getAdapter()).getItemViewType(i);
            ActivityChooserView.this.a();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            activityChooserView.getClass();
            activityChooserView.a.a();
            ActivityChooserView.this.a.getClass();
            throw null;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.p) {
                activityChooserView.a.getClass();
                throw null;
            }
            throw new IllegalArgumentException();
        }
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean a() {
        if (!b()) {
            return true;
        }
        getListPopupWindow().dismiss();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.u);
        return true;
    }

    public boolean b() {
        return getListPopupWindow().b();
    }

    public boolean c() {
        if (b() || !this.y) {
            return false;
        }
        d(this.x);
        throw null;
    }

    /* access modifiers changed from: package-private */
    public void d(int i) {
        this.a.getClass();
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    public d getDataModel() {
        this.a.getClass();
        return null;
    }

    /* access modifiers changed from: package-private */
    public ListPopupWindow getListPopupWindow() {
        if (this.v == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext(), null, C0707R.attr.listPopupWindowStyle);
            this.v = listPopupWindow;
            listPopupWindow.m(this.a);
            this.v.x(this);
            this.v.D(true);
            this.v.F(this.b);
            ListPopupWindow listPopupWindow2 = this.v;
            listPopupWindow2.I.setOnDismissListener(this.b);
        }
        return this.v;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.getClass();
        this.y = true;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.getClass();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.u);
        }
        if (b()) {
            a();
        }
        this.y = false;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        this.c.layout(0, 0, i3 - i, i4 - i2);
        if (!b()) {
            a();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        View view = this.c;
        if (this.p.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setActivityChooserModel(d dVar) {
        f fVar = this.a;
        ActivityChooserView.this.a.getClass();
        if (dVar == null || !ActivityChooserView.this.isShown()) {
            fVar.notifyDataSetChanged();
            if (b()) {
                a();
                c();
                return;
            }
            return;
        }
        DataSetObserver dataSetObserver = ActivityChooserView.this.t;
        throw null;
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.z = i;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.o.setContentDescription(getContext().getString(i));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.o.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i) {
        this.x = i;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.w = onDismissListener;
    }

    public void setProvider(a4 a4Var) {
        this.s = a4Var;
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.t = new a();
        this.u = new b();
        this.x = 4;
        int[] iArr = h0.e;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        q4.H(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        this.x = obtainStyledAttributes.getInt(1, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(C0707R.layout.abc_activity_chooser_view, (ViewGroup) this, true);
        g gVar = new g();
        this.b = gVar;
        View findViewById = findViewById(C0707R.id.activity_chooser_view_content);
        this.c = findViewById;
        this.f = findViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(C0707R.id.default_activity_button);
        this.p = frameLayout;
        frameLayout.setOnClickListener(gVar);
        frameLayout.setOnLongClickListener(gVar);
        this.q = (ImageView) frameLayout.findViewById(C0707R.id.image);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(C0707R.id.expand_activities_button);
        frameLayout2.setOnClickListener(gVar);
        frameLayout2.setAccessibilityDelegate(new c(this));
        frameLayout2.setOnTouchListener(new d(frameLayout2));
        this.n = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(C0707R.id.image);
        this.o = imageView;
        imageView.setImageDrawable(drawable);
        f fVar = new f();
        this.a = fVar;
        fVar.registerDataSetObserver(new e());
        Resources resources = context.getResources();
        this.r = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0707R.dimen.abc_config_prefDialogWidth));
    }
}

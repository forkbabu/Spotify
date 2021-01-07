package android.support.wearable.view.drawer;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.spotify.music.C0707R;

@Deprecated
public class WearableDrawerView extends FrameLayout {
    private static final int[] w = {16844002};
    private final ViewGroup a;
    private final ImageView b;
    private View c;
    private WearableDrawerLayout f;
    private float n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private int t;
    private int u;
    private int v;

    public WearableDrawerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private WearableDrawerLayout getWearableDrawerLayout() {
        if (this.f == null) {
            this.f = (WearableDrawerLayout) getParent();
        }
        return this.f;
    }

    private void n(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.a.getChildCount() > 0) {
            this.a.removeAllViews();
        }
        this.a.addView(view, i, layoutParams);
    }

    private void setDefaultBackgroundIfNonePresent(Context context) {
        if (getBackground() == null) {
            setBackgroundColor(context.obtainStyledAttributes(w).getColor(0, 0));
        }
    }

    public boolean a() {
        return this.o;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        int id = view.getId();
        if (id != 0) {
            if (id == this.u) {
                n(view, i, layoutParams);
                return;
            } else if (id == this.v) {
                View view2 = this.c;
                boolean z = false;
                if (view != view2) {
                    if (view2 != null) {
                        removeView(view2);
                    }
                    this.c = view;
                    z = true;
                }
                if (!z) {
                    return;
                }
            }
        }
        super.addView(view, i, layoutParams);
    }

    public void b() {
        getWearableDrawerLayout().v(this);
    }

    public boolean c() {
        return this.c != null;
    }

    public boolean d() {
        return this.n == 0.0f;
    }

    public boolean e() {
        return this.p && this.n <= 0.0f;
    }

    public boolean f() {
        return this.n == 1.0f;
    }

    public boolean g() {
        return this.s;
    }

    public View getDrawerContent() {
        return this.c;
    }

    public int getDrawerState() {
        return this.t;
    }

    /* access modifiers changed from: package-private */
    public float getOpenedPercent() {
        return this.n;
    }

    /* access modifiers changed from: package-private */
    public ViewGroup getPeekContainer() {
        return this.a;
    }

    public void h() {
    }

    public void i() {
    }

    public void j() {
    }

    public void k(View view) {
        getWearableDrawerLayout().A(this);
    }

    public void l() {
        getWearableDrawerLayout().C(this);
    }

    /* access modifiers changed from: package-private */
    public int m() {
        return 0;
    }

    public boolean o() {
        return this.q;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.a.getLayoutParams();
        if (!Gravity.isVertical(layoutParams.gravity)) {
            if ((((FrameLayout.LayoutParams) getLayoutParams()).gravity & 112) == 48) {
                layoutParams.gravity = 80;
                this.b.setImageResource(C0707R.drawable.ic_more_horiz_24dp_wht);
            } else {
                layoutParams.gravity = 48;
                this.b.setImageResource(C0707R.drawable.ic_more_vert_24dp_wht);
            }
            this.a.setLayoutParams(layoutParams);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.a.bringToFront();
    }

    public boolean p() {
        return this.r;
    }

    public void setCanAutoPeek(boolean z) {
        this.o = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0013  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setDrawerContent(android.view.View r2) {
        /*
            r1 = this;
            android.view.View r0 = r1.c
            if (r2 != r0) goto L_0x0005
            goto L_0x0010
        L_0x0005:
            if (r0 == 0) goto L_0x000a
            r1.removeView(r0)
        L_0x000a:
            r1.c = r2
            if (r2 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            if (r0 == 0) goto L_0x0016
            r1.addView(r2)
        L_0x0016:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.wearable.view.drawer.WearableDrawerView.setDrawerContent(android.view.View):void");
    }

    /* access modifiers changed from: package-private */
    public void setDrawerState(int i) {
        this.t = i;
    }

    /* access modifiers changed from: package-private */
    public void setIsPeeking(boolean z) {
        this.s = z;
    }

    /* access modifiers changed from: package-private */
    public void setOpenedPercent(float f2) {
        this.n = f2;
    }

    public void setPeekContent(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        n(view, -1, layoutParams);
    }

    public void setShouldLockWhenNotOpenOrPeeking(boolean z) {
        this.p = z;
    }

    public void setShouldOnlyOpenWhenAtTop(boolean z) {
        this.q = z;
    }

    public void setShouldPeekOnScrollDown(boolean z) {
        this.r = z;
    }

    public WearableDrawerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.o = true;
        this.p = false;
        this.q = false;
        this.r = false;
        this.u = 0;
        this.v = 0;
        LayoutInflater.from(context).inflate(C0707R.layout.wearable_drawer_view, (ViewGroup) this, true);
        setClickable(true);
        setElevation(context.getResources().getDimension(C0707R.dimen.wearable_drawer_view_elevation));
        ViewGroup viewGroup = (ViewGroup) findViewById(C0707R.id.wearable_support_drawer_view_peek_container);
        this.a = viewGroup;
        this.b = (ImageView) findViewById(C0707R.id.wearable_support_drawer_view_peek_icon);
        viewGroup.setOnClickListener(new e(this));
        setDefaultBackgroundIfNonePresent(context);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.q, i, 0);
            this.v = obtainStyledAttributes.getResourceId(0, 0);
            this.u = obtainStyledAttributes.getResourceId(1, 0);
            obtainStyledAttributes.recycle();
        }
    }
}

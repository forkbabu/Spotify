package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.glue.components.toolbar.GlueToolbarLayout;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.music.features.home.common.viewbinder.FadingHomeHeaderView;
import com.spotify.paste.widgets.internal.StateListAnimatorImageButton;
import kotlin.jvm.internal.h;

/* renamed from: xi5  reason: default package */
public final class xi5 {
    private static final RecyclerView.l h = new b();
    private static final RecyclerView.w i = new a();
    private final Context a;
    private final int b;
    private final int c;
    private final int d;
    private ViewGroup e;
    private final ViewGroup f;
    private final RecyclerView g;

    /* renamed from: xi5$a */
    public static final class a extends RecyclerView.w {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
            h.e(recyclerView, "rv");
            h.e(motionEvent, "motionEvent");
            return true;
        }
    }

    /* renamed from: xi5$b */
    public static final class b extends RecyclerView.l {
        @Override // androidx.recyclerview.widget.RecyclerView.l
        public void l(Canvas canvas, RecyclerView recyclerView, RecyclerView.y yVar) {
            h.e(canvas, "canvas");
            h.e(recyclerView, "parent");
            h.e(yVar, "state");
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            if (!(layoutManager instanceof LinearLayoutManager)) {
                layoutManager = null;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (linearLayoutManager != null) {
                Paint paint = new Paint();
                paint.setColor(androidx.core.content.a.b(recyclerView.getContext(), R.color.black_70));
                paint.setStyle(Paint.Style.FILL);
                canvas.drawRect((float) linearLayoutManager.getPaddingLeft(), (float) linearLayoutManager.getPaddingBottom(), ((float) linearLayoutManager.v0()) - ((float) linearLayoutManager.getPaddingRight()), (float) recyclerView.getBottom(), paint);
            }
        }
    }

    public xi5(ViewGroup viewGroup, RecyclerView recyclerView) {
        h.e(viewGroup, "homeRootView");
        h.e(recyclerView, "rv");
        this.f = viewGroup;
        this.g = recyclerView;
        Context context = recyclerView.getContext();
        h.d(context, "rv.context");
        this.a = context;
        this.d = androidx.core.content.a.b(context, R.color.gray_30);
        this.b = androidx.core.content.a.b(context, R.color.black_70);
        this.c = androidx.core.content.a.b(context, C0707R.color.pasteTransparent);
    }

    private final void a(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            h.d(childAt, "iconContainer.getChildAt(i)");
            if (childAt instanceof StateListAnimatorImageButton) {
                StateListAnimatorImageButton stateListAnimatorImageButton = (StateListAnimatorImageButton) childAt;
                if (stateListAnimatorImageButton.getId() != C0707R.id.home_toolbar_listening_history) {
                    Drawable drawable = stateListAnimatorImageButton.getDrawable();
                    h.d(drawable, "button.drawable");
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    Drawable d2 = androidx.core.content.a.d(this.a, C0707R.drawable.ic_listening_history);
                    if (!h.a(constantState, d2 != null ? d2.getConstantState() : null)) {
                        Drawable drawable2 = stateListAnimatorImageButton.getDrawable();
                        h.d(drawable2, "button.drawable");
                        drawable2.setColorFilter(new PorterDuffColorFilter(this.b, PorterDuff.Mode.DARKEN));
                        stateListAnimatorImageButton.setEnabled(false);
                    }
                }
            }
        }
    }

    private final void f(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            h.d(childAt, "iconContainer.getChildAt(i)");
            if (childAt instanceof StateListAnimatorImageButton) {
                StateListAnimatorImageButton stateListAnimatorImageButton = (StateListAnimatorImageButton) childAt;
                stateListAnimatorImageButton.getDrawable().clearColorFilter();
                stateListAnimatorImageButton.setEnabled(true);
            }
        }
    }

    public final void b() {
        ViewGroup viewGroup;
        ViewParent parent = this.f.getParent();
        h.d(parent, "homeRootView.parent");
        ViewParent parent2 = parent.getParent();
        if (parent2 != null) {
            ViewGroup viewGroup2 = (ViewGroup) parent2;
            boolean z = false;
            if (this.e == null) {
                h.e(viewGroup2, "mainLayout");
                int childCount = viewGroup2.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        viewGroup = null;
                        break;
                    }
                    View childAt = viewGroup2.getChildAt(i2);
                    if (childAt instanceof FrameLayout) {
                        View childAt2 = ((FrameLayout) childAt).getChildAt(0);
                        if (childAt2 instanceof GlueToolbarLayout) {
                            viewGroup = (ViewGroup) childAt2;
                            break;
                        }
                    }
                    i2++;
                }
                this.e = viewGroup;
            }
            if (this.e != null) {
                z = true;
            }
            if (z) {
                this.g.k(h, -1);
                this.g.m(i);
                ((FadingHomeHeaderView) this.f.findViewById(C0707R.id.home_fading_header)).setBackgroundColor(this.b);
                ViewGroup viewGroup3 = this.e;
                if (viewGroup3 != null) {
                    a((GlueToolbarLayout) viewGroup3);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.android.glue.components.toolbar.GlueToolbarLayout");
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public final void c() {
        this.g.k(h, -1);
        this.g.m(i);
        View findViewById = this.f.findViewById(C0707R.id.home_topbar_view);
        h.d(findViewById, "homeRootView\n           …me.R.id.home_topbar_view)");
        ((ConstraintLayout) findViewById).setBackgroundColor(this.b);
        View findViewById2 = this.f.findViewById(C0707R.id.home_topbar_title);
        h.d(findViewById2, "homeRootView\n           …e.R.id.home_topbar_title)");
        ((TextView) findViewById2).setTextColor(this.d);
        View findViewById3 = this.f.findViewById(C0707R.id.home_icon_container);
        h.d(findViewById3, "homeRootView\n           …R.id.home_icon_container)");
        a((LinearLayout) findViewById3);
    }

    public final void d() {
        this.g.A0(h);
        this.g.C0(i);
        ((FadingHomeHeaderView) this.f.findViewById(C0707R.id.home_fading_header)).setBackgroundColor(this.c);
        ViewGroup viewGroup = this.e;
        if (viewGroup != null) {
            f((GlueToolbarLayout) viewGroup);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.spotify.android.glue.components.toolbar.GlueToolbarLayout");
    }

    public final void e() {
        this.g.A0(h);
        this.g.C0(i);
        View findViewById = this.f.findViewById(C0707R.id.home_topbar_view);
        h.d(findViewById, "homeRootView\n           …me.R.id.home_topbar_view)");
        ((ConstraintLayout) findViewById).setBackgroundColor(this.c);
        View findViewById2 = this.f.findViewById(C0707R.id.home_topbar_title);
        h.d(findViewById2, "homeRootView\n           …e.R.id.home_topbar_title)");
        ((TextView) findViewById2).setTextColor(androidx.core.content.a.b(this.a, R.color.white));
        View findViewById3 = this.f.findViewById(C0707R.id.home_icon_container);
        h.d(findViewById3, "homeRootView\n           …R.id.home_icon_container)");
        f((LinearLayout) findViewById3);
    }
}

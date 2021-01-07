package android.support.wearable.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

@Deprecated
public class WearableRecyclerView extends RecyclerView {
    private static final String V0 = WearableRecyclerView.class.getSimpleName();
    public static final /* synthetic */ int W0 = 0;
    private final h O0;
    private boolean P0;
    private boolean Q0;
    private boolean R0;
    private int S0;
    private int T0;
    private final ViewTreeObserver.OnPreDrawListener U0;

    public static abstract class ChildLayoutManager extends LinearLayoutManager {
        private void A2() {
            for (int i = 0; i < W(); i++) {
                View V = V(i);
                z2(V, (WearableRecyclerView) V.getParent());
            }
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
        public void c1(RecyclerView.s sVar, RecyclerView.y yVar) {
            super.c1(sVar, yVar);
            if (W() != 0) {
                A2();
            }
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
        public int w1(int i, RecyclerView.s sVar, RecyclerView.y yVar) {
            int w1 = super.w1(i, sVar, yVar);
            A2();
            return w1;
        }

        public abstract void z2(View view, WearableRecyclerView wearableRecyclerView);
    }

    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!WearableRecyclerView.this.R0 || WearableRecyclerView.this.getChildCount() <= 0) {
                return true;
            }
            WearableRecyclerView.this.W0();
            WearableRecyclerView.this.R0 = false;
            return true;
        }
    }

    @Deprecated
    public static abstract class b {
    }

    @Deprecated
    private final class c extends LinearLayoutManager {
        public c(Context context) {
            super(1, false);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
        public void c1(RecyclerView.s sVar, RecyclerView.y yVar) {
            super.c1(sVar, yVar);
            if (W() != 0) {
                WearableRecyclerView wearableRecyclerView = WearableRecyclerView.this;
                int i = WearableRecyclerView.W0;
                wearableRecyclerView.getClass();
            }
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
        public int w1(int i, RecyclerView.s sVar, RecyclerView.y yVar) {
            int w1 = super.w1(i, sVar, yVar);
            WearableRecyclerView wearableRecyclerView = WearableRecyclerView.this;
            int i2 = WearableRecyclerView.W0;
            wearableRecyclerView.getClass();
            return w1;
        }
    }

    public WearableRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void W0() {
        if (this.Q0 && getChildCount() >= 1) {
            int i = 0;
            int height = (int) ((((float) getHeight()) * 0.5f) - (((float) getChildAt(0).getHeight()) * 0.5f));
            if (getPaddingTop() != height) {
                this.S0 = getPaddingTop();
                this.T0 = getPaddingBottom();
                setPadding(getPaddingLeft(), height, getPaddingRight(), height);
                View focusedChild = getFocusedChild();
                if (focusedChild != null) {
                    i = getLayoutManager().o0(focusedChild);
                }
                getLayoutManager().v1(i);
            }
        }
    }

    public float getBezelWidth() {
        return this.O0.b();
    }

    public boolean getCenterEdgeItems() {
        return this.Q0;
    }

    @Deprecated
    public b getOffsettingHelper() {
        return null;
    }

    public float getScrollDegreesPerScreen() {
        return this.O0.c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.O0.g(this);
        getViewTreeObserver().addOnPreDrawListener(this.U0);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.O0.a();
        getViewTreeObserver().removeOnPreDrawListener(this.U0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        RecyclerView.m layoutManager = getLayoutManager();
        if (layoutManager == null || isLayoutSuppressed()) {
            return false;
        }
        if (motionEvent.getAction() == 8 && z.c(motionEvent)) {
            int round = Math.round(z.b(getContext()) * (-z.a(motionEvent)));
            if (layoutManager.C()) {
                scrollBy(0, round);
                return true;
            } else if (layoutManager.B()) {
                scrollBy(round, 0);
                return true;
            }
        }
        super.onGenericMotionEvent(motionEvent);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.P0 || !this.O0.e(motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setBezelWidth(float f) {
        this.O0.f(f);
    }

    public void setCenterEdgeItems(boolean z) {
        this.Q0 = z;
        if (!z) {
            if (this.S0 != Integer.MIN_VALUE) {
                setPadding(getPaddingLeft(), this.S0, getPaddingRight(), this.T0);
            }
            this.R0 = false;
        } else if (getChildCount() > 0) {
            W0();
        } else {
            this.R0 = true;
        }
    }

    public void setCircularScrollingGestureEnabled(boolean z) {
        this.P0 = z;
    }

    @Deprecated
    public void setOffsettingHelper(b bVar) {
    }

    public void setScrollDegreesPerScreen(float f) {
        this.O0.h(f);
    }

    public WearableRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h hVar = new h();
        this.O0 = hVar;
        this.S0 = Integer.MIN_VALUE;
        this.T0 = Integer.MIN_VALUE;
        this.U0 = new a();
        setHasFixedSize(true);
        setClipToPadding(false);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.m, i, 0);
            setCircularScrollingGestureEnabled(obtainStyledAttributes.getBoolean(1, this.P0));
            setBezelWidth(obtainStyledAttributes.getFloat(0, hVar.b()));
            setScrollDegreesPerScreen(obtainStyledAttributes.getFloat(2, hVar.c()));
            obtainStyledAttributes.recycle();
        }
        setLayoutManager(new c(getContext()));
    }
}

package androidx.transition;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.spotify.music.C0707R;

/* access modifiers changed from: package-private */
public class i extends ViewGroup implements f {
    public static final /* synthetic */ int p = 0;
    ViewGroup a;
    View b;
    final View c;
    int f;
    private Matrix n;
    private final ViewTreeObserver.OnPreDrawListener o = new a();

    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            View view;
            i iVar = i.this;
            int i = q4.g;
            int i2 = Build.VERSION.SDK_INT;
            iVar.postInvalidateOnAnimation();
            i iVar2 = i.this;
            ViewGroup viewGroup = iVar2.a;
            if (viewGroup == null || (view = iVar2.b) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            i.this.a.postInvalidateOnAnimation();
            i iVar3 = i.this;
            iVar3.a = null;
            iVar3.b = null;
            return true;
        }
    }

    i(View view) {
        super(view.getContext());
        this.c = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    static i b(View view, ViewGroup viewGroup, Matrix matrix) {
        g gVar;
        if (view.getParent() instanceof ViewGroup) {
            int i = g.c;
            g gVar2 = (g) viewGroup.getTag(C0707R.id.ghost_view_holder);
            i iVar = (i) view.getTag(C0707R.id.ghost_view);
            int i2 = 0;
            if (!(iVar == null || (gVar = (g) iVar.getParent()) == gVar2)) {
                i2 = iVar.f;
                gVar.removeView(iVar);
                iVar = null;
            }
            if (iVar == null) {
                if (matrix == null) {
                    matrix = new Matrix();
                    ViewGroup viewGroup2 = (ViewGroup) view.getParent();
                    matrix.reset();
                    g0.i(viewGroup2, matrix);
                    matrix.preTranslate((float) (-viewGroup2.getScrollX()), (float) (-viewGroup2.getScrollY()));
                    g0.j(viewGroup, matrix);
                }
                iVar = new i(view);
                iVar.n = matrix;
                if (gVar2 == null) {
                    gVar2 = new g(viewGroup);
                } else {
                    gVar2.c();
                }
                c(viewGroup, gVar2);
                c(viewGroup, iVar);
                gVar2.a(iVar);
                iVar.f = i2;
            } else if (matrix != null) {
                iVar.n = matrix;
            }
            iVar.f++;
            return iVar;
        }
        throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
    }

    static void c(View view, View view2) {
        g0.f(view2, view2.getLeft(), view2.getTop(), view.getWidth() + view2.getLeft(), view.getHeight() + view2.getTop());
    }

    static i d(View view) {
        return (i) view.getTag(C0707R.id.ghost_view);
    }

    @Override // androidx.transition.f
    public void a(ViewGroup viewGroup, View view) {
        this.a = viewGroup;
        this.b = view;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c.setTag(C0707R.id.ghost_view, this);
        this.c.getViewTreeObserver().addOnPreDrawListener(this.o);
        g0.h(this.c, 4);
        if (this.c.getParent() != null) {
            ((View) this.c.getParent()).invalidate();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.c.getViewTreeObserver().removeOnPreDrawListener(this.o);
        g0.h(this.c, 0);
        this.c.setTag(C0707R.id.ghost_view, null);
        if (this.c.getParent() != null) {
            ((View) this.c.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        a.d(canvas, true);
        canvas.setMatrix(this.n);
        g0.h(this.c, 0);
        this.c.invalidate();
        g0.h(this.c, 4);
        drawChild(canvas, this.c, getDrawingTime());
        a.d(canvas, false);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View, androidx.transition.f
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (d(this.c) == this) {
            g0.h(this.c, i == 0 ? 4 : 0);
        }
    }
}

package android.support.wearable.view;

import android.content.Context;
import android.support.wearable.internal.view.SwipeDismissLayout;
import android.util.AttributeSet;
import android.util.Log;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

@Deprecated
public class SwipeDismissFrameLayout extends SwipeDismissLayout {
    private final SwipeDismissLayout.b B;
    private final SwipeDismissLayout.a C;
    private final SwipeDismissLayout.c D;
    private final ArrayList<b> E;
    private final int F;
    private final DecelerateInterpolator G;
    private final AccelerateInterpolator H;
    private final DecelerateInterpolator I;
    private boolean J;

    public static abstract class b {
    }

    private final class c implements SwipeDismissLayout.a {

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                for (int size = SwipeDismissFrameLayout.this.E.size() - 1; size >= 0; size--) {
                    SwipeDismissFrameLayout swipeDismissFrameLayout = SwipeDismissFrameLayout.this;
                    ((b) SwipeDismissFrameLayout.this.E.get(size)).getClass();
                }
            }
        }

        c(a aVar) {
        }

        @Override // android.support.wearable.internal.view.SwipeDismissLayout.a
        public void a(SwipeDismissLayout swipeDismissLayout) {
            Log.isLoggable("SwipeDismissFrameLayout", 3);
            SwipeDismissFrameLayout.this.animate().translationX((float) SwipeDismissFrameLayout.this.getWidth()).alpha(0.0f).setDuration((long) SwipeDismissFrameLayout.this.F).setInterpolator(SwipeDismissFrameLayout.this.J ? SwipeDismissFrameLayout.this.I : SwipeDismissFrameLayout.this.H).withEndAction(new a());
        }
    }

    private final class d implements SwipeDismissLayout.b {
        d(a aVar) {
        }

        @Override // android.support.wearable.internal.view.SwipeDismissLayout.b
        public boolean a(float f, float f2) {
            Iterator it = SwipeDismissFrameLayout.this.E.iterator();
            while (it.hasNext()) {
                ((b) it.next()).getClass();
            }
            return true;
        }
    }

    private final class e implements SwipeDismissLayout.c {

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                for (int size = SwipeDismissFrameLayout.this.E.size() - 1; size >= 0; size--) {
                    ((b) SwipeDismissFrameLayout.this.E.get(size)).getClass();
                }
            }
        }

        e(a aVar) {
        }

        @Override // android.support.wearable.internal.view.SwipeDismissLayout.c
        public void a(SwipeDismissLayout swipeDismissLayout, float f, float f2) {
            Log.isLoggable("SwipeDismissFrameLayout", 3);
            SwipeDismissFrameLayout.this.setTranslationX(f2);
            SwipeDismissFrameLayout.this.setAlpha(1.0f - (f * 0.5f));
            if (!SwipeDismissFrameLayout.this.J) {
                for (int size = SwipeDismissFrameLayout.this.E.size() - 1; size >= 0; size--) {
                    ((b) SwipeDismissFrameLayout.this.E.get(size)).getClass();
                }
                SwipeDismissFrameLayout.this.J = true;
            }
        }

        @Override // android.support.wearable.internal.view.SwipeDismissLayout.c
        public void b(SwipeDismissLayout swipeDismissLayout) {
            Log.isLoggable("SwipeDismissFrameLayout", 3);
            SwipeDismissFrameLayout.this.J = false;
            SwipeDismissFrameLayout.this.animate().translationX(0.0f).alpha(1.0f).setDuration((long) SwipeDismissFrameLayout.this.F).setInterpolator(SwipeDismissFrameLayout.this.G).withEndAction(new a());
        }
    }

    public SwipeDismissFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setDismissEnabled(boolean z) {
        setSwipeable(z);
    }

    public SwipeDismissFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d dVar = new d(null);
        this.B = dVar;
        c cVar = new c(null);
        this.C = cVar;
        e eVar = new e(null);
        this.D = eVar;
        this.E = new ArrayList<>();
        setOnPreSwipeListener(dVar);
        setOnDismissedListener(cVar);
        setOnSwipeProgressChangedListener(eVar);
        this.F = getContext().getResources().getInteger(17694720);
        this.G = new DecelerateInterpolator(1.5f);
        this.H = new AccelerateInterpolator(1.5f);
        this.I = new DecelerateInterpolator(1.5f);
    }
}

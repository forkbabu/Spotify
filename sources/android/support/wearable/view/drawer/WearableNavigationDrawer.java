package android.support.wearable.view.drawer;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityManager;
import com.spotify.music.C0707R;
import java.util.concurrent.TimeUnit;

@Deprecated
public class WearableNavigationDrawer extends WearableDrawerView {
    private static final long D = TimeUnit.SECONDS.toMillis(5);
    private final GestureDetector A;
    private final f0 B;
    private final GestureDetector.SimpleOnGestureListener C;
    private final boolean x;
    private final Handler y;
    private final Runnable z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WearableNavigationDrawer.this.b();
        }
    }

    class b extends GestureDetector.SimpleOnGestureListener {
        b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return WearableNavigationDrawer.this.B.b();
        }
    }

    public static abstract class c {
    }

    public WearableNavigationDrawer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        return f();
    }

    @Override // android.support.wearable.view.drawer.WearableDrawerView
    public void h() {
        this.y.removeCallbacks(this.z);
    }

    @Override // android.support.wearable.view.drawer.WearableDrawerView
    public void i() {
        if (!this.x) {
            this.y.removeCallbacks(this.z);
            this.y.postDelayed(this.z, D);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.wearable.view.drawer.WearableDrawerView
    public int m() {
        return 48;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.x) {
            this.y.removeCallbacks(this.z);
            this.y.postDelayed(this.z, D);
        }
        GestureDetector gestureDetector = this.A;
        return gestureDetector != null && gestureDetector.onTouchEvent(motionEvent);
    }

    public void setAdapter(c cVar) {
        this.B.a(cVar);
    }

    public WearableNavigationDrawer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        f0 f0Var;
        this.y = new Handler(Looper.getMainLooper());
        this.z = new a();
        b bVar = new b();
        this.C = bVar;
        this.A = new GestureDetector(getContext(), bVar);
        boolean z2 = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.s, i, 0);
            try {
                z2 = obtainStyledAttributes.getInt(0, 1) == 0 ? true : z2;
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        boolean isEnabled = ((AccessibilityManager) context.getSystemService("accessibility")).isEnabled();
        this.x = isEnabled;
        if (z2) {
            f0Var = new d0(new e0(this), isEnabled);
        } else {
            f0Var = new b0(this, new c0(), isEnabled);
        }
        this.B = f0Var;
        getPeekContainer().setContentDescription(context.getString(C0707R.string.navigation_drawer_content_description));
        setShouldOnlyOpenWhenAtTop(true);
    }
}

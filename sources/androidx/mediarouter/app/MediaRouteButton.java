package androidx.mediarouter.app;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.appcompat.widget.k0;
import androidx.fragment.app.o;
import androidx.fragment.app.x;
import com.spotify.music.C0707R;
import defpackage.n6;
import java.util.ArrayList;
import java.util.List;

public class MediaRouteButton extends View {
    private static final int[] A = {16842912};
    private static final int[] B = {16842911};
    private static a y;
    static final SparseArray<Drawable.ConstantState> z = new SparseArray<>(2);
    private final n6 a;
    private final b b;
    private m6 c;
    private f f;
    private boolean n;
    private int o;
    c p;
    private Drawable q;
    private int r;
    private int s;
    private ColorStateList t;
    private int u;
    private int v;
    private boolean w;
    private boolean x;

    /* access modifiers changed from: private */
    public static final class a extends BroadcastReceiver {
        private final Context a;
        private boolean b = true;
        private List<MediaRouteButton> c;

        a(Context context) {
            this.a = context;
            this.c = new ArrayList();
        }

        public boolean a() {
            return this.b;
        }

        public void b(MediaRouteButton mediaRouteButton) {
            if (this.c.size() == 0) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                this.a.registerReceiver(this, intentFilter);
            }
            this.c.add(mediaRouteButton);
        }

        public void c(MediaRouteButton mediaRouteButton) {
            this.c.remove(mediaRouteButton);
            if (this.c.size() == 0) {
                this.a.unregisterReceiver(this);
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z;
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) && this.b != (!intent.getBooleanExtra("noConnectivity", false))) {
                this.b = z;
                for (MediaRouteButton mediaRouteButton : this.c) {
                    mediaRouteButton.c();
                }
            }
        }
    }

    private final class b extends n6.a {
        b() {
        }

        @Override // defpackage.n6.a
        public void a(n6 n6Var, n6.e eVar) {
            MediaRouteButton.this.b();
        }

        @Override // defpackage.n6.a
        public void b(n6 n6Var, n6.e eVar) {
            MediaRouteButton.this.b();
        }

        @Override // defpackage.n6.a
        public void c(n6 n6Var, n6.e eVar) {
            MediaRouteButton.this.b();
        }

        @Override // defpackage.n6.a
        public void d(n6 n6Var, n6.f fVar) {
            MediaRouteButton.this.b();
        }

        @Override // defpackage.n6.a
        public void e(n6 n6Var, n6.f fVar) {
            MediaRouteButton.this.b();
        }

        @Override // defpackage.n6.a
        public void f(n6 n6Var, n6.f fVar) {
            MediaRouteButton.this.b();
        }

        @Override // defpackage.n6.a
        public void g(n6 n6Var, n6.f fVar) {
            MediaRouteButton.this.b();
        }

        @Override // defpackage.n6.a
        public void h(n6 n6Var, n6.f fVar) {
            MediaRouteButton.this.b();
        }
    }

    /* access modifiers changed from: private */
    public final class c extends AsyncTask<Void, Void, Drawable> {
        private final int a;
        private final Context b;

        c(int i, Context context) {
            this.a = i;
            this.b = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Drawable doInBackground(Void[] voidArr) {
            if (MediaRouteButton.z.get(this.a) == null) {
                return this.b.getResources().getDrawable(this.a);
            }
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onCancelled(Drawable drawable) {
            Drawable drawable2 = drawable;
            if (drawable2 != null) {
                MediaRouteButton.z.put(this.a, drawable2.getConstantState());
            }
            MediaRouteButton.this.p = null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Drawable drawable) {
            Drawable drawable2 = drawable;
            if (drawable2 != null) {
                MediaRouteButton.z.put(this.a, drawable2.getConstantState());
                MediaRouteButton.this.p = null;
            } else {
                Drawable.ConstantState constantState = MediaRouteButton.z.get(this.a);
                if (constantState != null) {
                    drawable2 = constantState.newDrawable();
                }
                MediaRouteButton.this.p = null;
            }
            MediaRouteButton.this.setRemoteIndicatorDrawableInternal(drawable2);
        }
    }

    public MediaRouteButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.mediaRouteButtonStyle);
    }

    private void a() {
        if (this.r > 0) {
            c cVar = this.p;
            if (cVar != null) {
                cVar.cancel(false);
            }
            c cVar2 = new c(this.r, getContext());
            this.p = cVar2;
            this.r = 0;
            cVar2.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    private void e() {
        int i = this.s;
        setContentDescription(getContext().getString(i != 1 ? i != 2 ? C0707R.string.mr_cast_button_disconnected : C0707R.string.mr_cast_button_connected : C0707R.string.mr_cast_button_connecting));
    }

    private Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    private o getFragmentManager() {
        Activity activity = getActivity();
        if (activity instanceof androidx.fragment.app.c) {
            return ((androidx.fragment.app.c) activity).v0();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        boolean z2;
        n6.f i = this.a.i();
        boolean z3 = false;
        int b2 = !i.u() && i.z(this.c) ? i.b() : 0;
        if (this.s != b2) {
            this.s = b2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            e();
            refreshDrawableState();
        }
        if (b2 == 1) {
            a();
        }
        if (this.n) {
            if (this.x || this.a.j(this.c, 1)) {
                z3 = true;
            }
            setEnabled(z3);
        }
        Drawable drawable = this.q;
        if (drawable != null && (drawable.getCurrent() instanceof AnimationDrawable)) {
            AnimationDrawable animationDrawable = (AnimationDrawable) this.q.getCurrent();
            if (this.n) {
                if ((z2 || b2 == 1) && !animationDrawable.isRunning()) {
                    animationDrawable.start();
                }
            } else if (b2 == 2) {
                if (animationDrawable.isRunning()) {
                    animationDrawable.stop();
                }
                animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        super.setVisibility((this.o != 0 || this.x || y.a()) ? this.o : 4);
        Drawable drawable = this.q;
        if (drawable != null) {
            drawable.setVisible(getVisibility() == 0, false);
        }
    }

    public boolean d() {
        if (!this.n) {
            return false;
        }
        o fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            n6.f i = this.a.i();
            if (i.u() || !i.z(this.c)) {
                if (fragmentManager.U("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") != null) {
                    return false;
                }
                this.f.getClass();
                MediaRouteChooserDialogFragment mediaRouteChooserDialogFragment = new MediaRouteChooserDialogFragment();
                mediaRouteChooserDialogFragment.c5(this.c);
                mediaRouteChooserDialogFragment.d5(this.w);
                x i2 = fragmentManager.i();
                i2.d(mediaRouteChooserDialogFragment, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment");
                i2.j();
                return true;
            } else if (fragmentManager.U("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") != null) {
                return false;
            } else {
                this.f.getClass();
                MediaRouteControllerDialogFragment mediaRouteControllerDialogFragment = new MediaRouteControllerDialogFragment();
                mediaRouteControllerDialogFragment.b5(this.c);
                mediaRouteControllerDialogFragment.c5(this.w);
                x i3 = fragmentManager.i();
                i3.d(mediaRouteControllerDialogFragment, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment");
                i3.j();
                return true;
            }
        } else {
            throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.q != null) {
            this.q.setState(getDrawableState());
            invalidate();
        }
    }

    public f getDialogFactory() {
        return this.f;
    }

    public m6 getRouteSelector() {
        return this.c;
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.q;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            this.n = true;
            if (!this.c.d()) {
                this.a.a(this.c, this.b, 0);
            }
            b();
            y.b(this);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        int i2 = this.s;
        if (i2 == 1) {
            View.mergeDrawableStates(onCreateDrawableState, B);
        } else if (i2 == 2) {
            View.mergeDrawableStates(onCreateDrawableState, A);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.n = false;
            if (!this.c.d()) {
                this.a.k(this.b);
            }
            y.c(this);
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.q != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight() - getPaddingBottom();
            int intrinsicWidth = this.q.getIntrinsicWidth();
            int intrinsicHeight = this.q.getIntrinsicHeight();
            int i = (((width - paddingLeft) - intrinsicWidth) / 2) + paddingLeft;
            int i2 = (((height - paddingTop) - intrinsicHeight) / 2) + paddingTop;
            this.q.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.q.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i4 = this.u;
        Drawable drawable = this.q;
        int i5 = 0;
        if (drawable != null) {
            i3 = getPaddingRight() + getPaddingLeft() + drawable.getIntrinsicWidth();
        } else {
            i3 = 0;
        }
        int max = Math.max(i4, i3);
        int i6 = this.v;
        Drawable drawable2 = this.q;
        if (drawable2 != null) {
            i5 = getPaddingBottom() + getPaddingTop() + drawable2.getIntrinsicHeight();
        }
        int max2 = Math.max(i6, i5);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, max);
        } else if (mode != 1073741824) {
            size = max;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, max2);
        } else if (mode2 != 1073741824) {
            size2 = max2;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public boolean performClick() {
        boolean performClick = super.performClick();
        if (!performClick) {
            playSoundEffect(0);
        }
        a();
        if (d() || performClick) {
            return true;
        }
        return false;
    }

    public void setAlwaysVisible(boolean z2) {
        if (z2 != this.x) {
            this.x = z2;
            c();
            b();
        }
    }

    /* access modifiers changed from: package-private */
    public void setCheatSheetEnabled(boolean z2) {
        k0.b(this, z2 ? getContext().getString(C0707R.string.mr_button_content_description) : null);
    }

    public void setDialogFactory(f fVar) {
        if (fVar != null) {
            this.f = fVar;
            return;
        }
        throw new IllegalArgumentException("factory must not be null");
    }

    public void setRemoteIndicatorDrawable(Drawable drawable) {
        this.r = 0;
        setRemoteIndicatorDrawableInternal(drawable);
    }

    /* access modifiers changed from: package-private */
    public void setRemoteIndicatorDrawableInternal(Drawable drawable) {
        Drawable drawable2;
        c cVar = this.p;
        if (cVar != null) {
            cVar.cancel(false);
        }
        Drawable drawable3 = this.q;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.q);
        }
        if (drawable != null) {
            if (this.t != null) {
                drawable = androidx.core.graphics.drawable.a.l(drawable.mutate());
                androidx.core.graphics.drawable.a.i(drawable, this.t);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
        }
        this.q = drawable;
        refreshDrawableState();
        if (this.n && (drawable2 = this.q) != null && (drawable2.getCurrent() instanceof AnimationDrawable)) {
            AnimationDrawable animationDrawable = (AnimationDrawable) this.q.getCurrent();
            int i = this.s;
            if (i == 1) {
                if (!animationDrawable.isRunning()) {
                    animationDrawable.start();
                }
            } else if (i == 2) {
                if (animationDrawable.isRunning()) {
                    animationDrawable.stop();
                }
                animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
            }
        }
    }

    public void setRouteSelector(m6 m6Var) {
        if (m6Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.c.equals(m6Var)) {
            if (this.n) {
                if (!this.c.d()) {
                    this.a.k(this.b);
                }
                if (!m6Var.d()) {
                    this.a.a(m6Var, this.b, 0);
                }
            }
            this.c = m6Var;
            b();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        this.o = i;
        c();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.q;
    }

    public MediaRouteButton(Context context, AttributeSet attributeSet, int i) {
        super(m.a(context), attributeSet, i);
        Drawable.ConstantState constantState;
        this.c = m6.c;
        this.f = f.a();
        this.o = 0;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, h6.a, i, 0);
        if (isInEditMode()) {
            this.a = null;
            this.b = null;
            this.q = getResources().getDrawable(obtainStyledAttributes.getResourceId(3, 0));
            return;
        }
        this.a = n6.f(context2);
        this.b = new b();
        if (y == null) {
            y = new a(context2.getApplicationContext());
        }
        this.t = obtainStyledAttributes.getColorStateList(4);
        this.u = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.v = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        this.r = obtainStyledAttributes.getResourceId(2, 0);
        obtainStyledAttributes.recycle();
        int i2 = this.r;
        if (!(i2 == 0 || (constantState = z.get(i2)) == null)) {
            setRemoteIndicatorDrawable(constantState.newDrawable());
        }
        if (this.q == null) {
            if (resourceId != 0) {
                Drawable.ConstantState constantState2 = z.get(resourceId);
                if (constantState2 != null) {
                    setRemoteIndicatorDrawableInternal(constantState2.newDrawable());
                } else {
                    c cVar = new c(resourceId, getContext());
                    this.p = cVar;
                    cVar.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
                }
            } else {
                a();
            }
        }
        e();
        setClickable(true);
    }
}

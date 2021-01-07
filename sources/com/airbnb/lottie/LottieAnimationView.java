package com.airbnb.lottie;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import java.io.ByteArrayInputStream;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.SSLException;

public class LottieAnimationView extends AppCompatImageView {
    private static final String B = LottieAnimationView.class.getSimpleName();
    private static final h<Throwable> C = new a();
    private d A;
    private final h<d> a = new b();
    private final h<Throwable> b = new c();
    private h<Throwable> c;
    private int f = 0;
    private final f n = new f();
    private boolean o;
    private String p;
    private int q;
    private boolean r = false;
    private boolean s = false;
    private boolean t = false;
    private boolean u = false;
    private boolean v = true;
    private RenderMode w = RenderMode.AUTOMATIC;
    private Set<j> x = new HashSet();
    private int y = 0;
    private n<d> z;

    class a implements h<Throwable> {
        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.airbnb.lottie.h
        public void a(Throwable th) {
            Throwable th2 = th;
            int i = ee.g;
            if ((th2 instanceof SocketException) || (th2 instanceof ClosedChannelException) || (th2 instanceof InterruptedIOException) || (th2 instanceof ProtocolException) || (th2 instanceof SSLException) || (th2 instanceof UnknownHostException) || (th2 instanceof UnknownServiceException)) {
                ae.d("Unable to load composition.", th2);
                return;
            }
            throw new IllegalStateException("Unable to parse composition", th2);
        }
    }

    class b implements h<d> {
        b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.airbnb.lottie.h
        public void a(d dVar) {
            LottieAnimationView.this.setComposition(dVar);
        }
    }

    class c implements h<Throwable> {
        c() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.airbnb.lottie.h
        public void a(Throwable th) {
            Throwable th2 = th;
            if (LottieAnimationView.this.f != 0) {
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                lottieAnimationView.setImageResource(lottieAnimationView.f);
            }
            (LottieAnimationView.this.c == null ? LottieAnimationView.C : LottieAnimationView.this.c).a(th2);
        }
    }

    private static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();
        String a;
        int b;
        float c;
        boolean f;
        String n;
        int o;
        int p;

        class a implements Parcelable.Creator<d> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public d createFromParcel(Parcel parcel) {
                return new d(parcel, null);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public d[] newArray(int i) {
                return new d[i];
            }
        }

        d(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.os.Parcelable, android.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
            parcel.writeFloat(this.c);
            parcel.writeInt(this.f ? 1 : 0);
            parcel.writeString(this.n);
            parcel.writeInt(this.o);
            parcel.writeInt(this.p);
        }

        d(Parcel parcel, a aVar) {
            super(parcel);
            this.a = parcel.readString();
            this.c = parcel.readFloat();
            this.f = parcel.readInt() != 1 ? false : true;
            this.n = parcel.readString();
            this.o = parcel.readInt();
            this.p = parcel.readInt();
        }
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j(attributeSet);
    }

    private void h() {
        n<d> nVar = this.z;
        if (nVar != null) {
            nVar.h(this.a);
            this.z.g(this.b);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        if (r3 != false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        if (r0 != 1) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void i() {
        /*
            r5 = this;
            com.airbnb.lottie.RenderMode r0 = r5.w
            int r0 = r0.ordinal()
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L_0x000e
            if (r0 == r2) goto L_0x0036
        L_0x000c:
            r1 = 1
            goto L_0x0036
        L_0x000e:
            com.airbnb.lottie.d r0 = r5.A
            r3 = 0
            if (r0 == 0) goto L_0x0020
            boolean r0 = r0.p()
            if (r0 == 0) goto L_0x0020
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r0 >= r4) goto L_0x0020
            goto L_0x0034
        L_0x0020:
            com.airbnb.lottie.d r0 = r5.A
            if (r0 == 0) goto L_0x002c
            int r0 = r0.l()
            r4 = 4
            if (r0 <= r4) goto L_0x002c
            goto L_0x0034
        L_0x002c:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 21
            if (r0 >= r4) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r3 = 1
        L_0x0034:
            if (r3 == 0) goto L_0x000c
        L_0x0036:
            int r0 = r5.getLayerType()
            if (r1 == r0) goto L_0x0040
            r0 = 0
            r5.setLayerType(r1, r0)
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.i():void");
    }

    private void j(AttributeSet attributeSet) {
        float f2;
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p.a);
        boolean z2 = false;
        if (!isInEditMode()) {
            this.v = obtainStyledAttributes.getBoolean(1, true);
            boolean hasValue = obtainStyledAttributes.hasValue(9);
            boolean hasValue2 = obtainStyledAttributes.hasValue(5);
            boolean hasValue3 = obtainStyledAttributes.hasValue(15);
            if (!hasValue || !hasValue2) {
                if (hasValue) {
                    int resourceId = obtainStyledAttributes.getResourceId(9, 0);
                    if (resourceId != 0) {
                        setAnimation(resourceId);
                    }
                } else if (hasValue2) {
                    String string2 = obtainStyledAttributes.getString(5);
                    if (string2 != null) {
                        setAnimation(string2);
                    }
                } else if (hasValue3 && (string = obtainStyledAttributes.getString(15)) != null) {
                    setAnimationFromUrl(string);
                }
                setFallbackResource(obtainStyledAttributes.getResourceId(4, 0));
            } else {
                throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            }
        }
        if (obtainStyledAttributes.getBoolean(0, false)) {
            this.t = true;
            this.u = true;
        }
        if (obtainStyledAttributes.getBoolean(7, false)) {
            this.n.U(-1);
        }
        if (obtainStyledAttributes.hasValue(12)) {
            setRepeatMode(obtainStyledAttributes.getInt(12, 1));
        }
        if (obtainStyledAttributes.hasValue(11)) {
            setRepeatCount(obtainStyledAttributes.getInt(11, -1));
        }
        if (obtainStyledAttributes.hasValue(14)) {
            setSpeed(obtainStyledAttributes.getFloat(14, 1.0f));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(6));
        setProgress(obtainStyledAttributes.getFloat(8, 0.0f));
        this.n.i(obtainStyledAttributes.getBoolean(3, false));
        if (obtainStyledAttributes.hasValue(2)) {
            this.n.d(new com.airbnb.lottie.model.d("**"), k.C, new he(new q(obtainStyledAttributes.getColor(2, 0))));
        }
        if (obtainStyledAttributes.hasValue(13)) {
            this.n.X(obtainStyledAttributes.getFloat(13, 1.0f));
        }
        if (obtainStyledAttributes.hasValue(10)) {
            int i = obtainStyledAttributes.getInt(10, 0);
            RenderMode.values();
            if (i >= 3) {
                i = 0;
            }
            setRenderMode(RenderMode.values()[i]);
        }
        if (getScaleType() != null) {
            this.n.Y(getScaleType());
        }
        obtainStyledAttributes.recycle();
        f fVar = this.n;
        Context context = getContext();
        int i2 = ee.g;
        if (Build.VERSION.SDK_INT >= 17) {
            f2 = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        } else {
            f2 = Settings.System.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        }
        if (f2 != 0.0f) {
            z2 = true;
        }
        fVar.a0(Boolean.valueOf(z2));
        i();
        this.o = true;
    }

    private void setCompositionTask(n<d> nVar) {
        this.A = null;
        this.n.g();
        h();
        nVar.f(this.a);
        nVar.e(this.b);
        this.z = nVar;
    }

    @Override // android.view.View
    public void buildDrawingCache(boolean z2) {
        this.y++;
        super.buildDrawingCache(z2);
        if (this.y == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z2) == null) {
            setRenderMode(RenderMode.HARDWARE);
        }
        this.y--;
        c.a("buildDrawingCache");
    }

    public void f(Animator.AnimatorListener animatorListener) {
        this.n.c(animatorListener);
    }

    public void g() {
        this.t = false;
        this.s = false;
        this.r = false;
        this.n.f();
        i();
    }

    public d getComposition() {
        return this.A;
    }

    public long getDuration() {
        d dVar = this.A;
        if (dVar != null) {
            return (long) dVar.d();
        }
        return 0;
    }

    public int getFrame() {
        return this.n.m();
    }

    public String getImageAssetsFolder() {
        return this.n.o();
    }

    public float getMaxFrame() {
        return this.n.p();
    }

    public float getMinFrame() {
        return this.n.q();
    }

    public o getPerformanceTracker() {
        return this.n.r();
    }

    public float getProgress() {
        return this.n.s();
    }

    public int getRepeatCount() {
        return this.n.t();
    }

    public int getRepeatMode() {
        return this.n.u();
    }

    public float getScale() {
        return this.n.v();
    }

    public float getSpeed() {
        return this.n.w();
    }

    @Override // android.widget.ImageView, android.graphics.drawable.Drawable.Callback, android.view.View
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        f fVar = this.n;
        if (drawable2 == fVar) {
            super.invalidateDrawable(fVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public boolean k() {
        return this.n.y();
    }

    public void l() {
        this.u = false;
        this.t = false;
        this.s = false;
        this.r = false;
        this.n.A();
        i();
    }

    public void m() {
        if (isShown()) {
            this.n.B();
            i();
            return;
        }
        this.r = true;
    }

    public void n() {
        this.n.C();
    }

    public void o() {
        if (isShown()) {
            this.n.D();
            i();
            return;
        }
        this.r = false;
        this.s = true;
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.u || this.t) {
            m();
            this.u = false;
            this.t = false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            onVisibilityChanged(this, getVisibility());
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        if (k()) {
            g();
            this.t = true;
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        String str = dVar.a;
        this.p = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.p);
        }
        int i = dVar.b;
        this.q = i;
        if (i != 0) {
            setAnimation(i);
        }
        setProgress(dVar.c);
        if (dVar.f) {
            m();
        }
        this.n.J(dVar.n);
        setRepeatMode(dVar.o);
        setRepeatCount(dVar.p);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.a = this.p;
        dVar.b = this.q;
        dVar.c = this.n.s();
        dVar.f = this.n.y() || (!q4.v(this) && this.t);
        dVar.n = this.n.o();
        dVar.o = this.n.u();
        dVar.p = this.n.t();
        return dVar;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        if (this.o) {
            if (isShown()) {
                if (this.s) {
                    o();
                } else if (this.r) {
                    m();
                }
                this.s = false;
                this.r = false;
            } else if (k()) {
                l();
                this.s = true;
            }
        }
    }

    public void setAnimation(int i) {
        this.q = i;
        this.p = null;
        setCompositionTask(this.v ? e.h(getContext(), i) : e.i(getContext(), i, null));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setCompositionTask(e.e(new ByteArrayInputStream(str.getBytes()), null));
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.v ? e.k(getContext(), str) : e.l(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z2) {
        this.n.E(z2);
    }

    public void setCacheComposition(boolean z2) {
        this.v = z2;
    }

    public void setComposition(d dVar) {
        this.n.setCallback(this);
        this.A = dVar;
        boolean F = this.n.F(dVar);
        i();
        if (getDrawable() != this.n || F) {
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            for (j jVar : this.x) {
                jVar.a(dVar);
            }
        }
    }

    public void setFailureListener(h<Throwable> hVar) {
        this.c = hVar;
    }

    public void setFallbackResource(int i) {
        this.f = i;
    }

    public void setFontAssetDelegate(a aVar) {
        this.n.G(aVar);
    }

    public void setFrame(int i) {
        this.n.H(i);
    }

    public void setImageAssetDelegate(b bVar) {
        this.n.I(bVar);
    }

    public void setImageAssetsFolder(String str) {
        this.n.J(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        h();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        h();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        h();
        super.setImageResource(i);
    }

    public void setMaxFrame(int i) {
        this.n.K(i);
    }

    public void setMaxProgress(float f2) {
        this.n.M(f2);
    }

    public void setMinAndMaxFrame(String str) {
        this.n.O(str);
    }

    public void setMinFrame(int i) {
        this.n.P(i);
    }

    public void setMinProgress(float f2) {
        this.n.R(f2);
    }

    public void setPerformanceTrackingEnabled(boolean z2) {
        this.n.S(z2);
    }

    public void setProgress(float f2) {
        this.n.T(f2);
    }

    public void setRenderMode(RenderMode renderMode) {
        this.w = renderMode;
        i();
    }

    public void setRepeatCount(int i) {
        this.n.U(i);
    }

    public void setRepeatMode(int i) {
        this.n.V(i);
    }

    public void setSafeMode(boolean z2) {
        this.n.W(z2);
    }

    public void setScale(float f2) {
        this.n.X(f2);
        if (getDrawable() == this.n) {
            setImageDrawable(null);
            setImageDrawable(this.n);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        super.setScaleType(scaleType);
        f fVar = this.n;
        if (fVar != null) {
            fVar.Y(scaleType);
        }
    }

    public void setSpeed(float f2) {
        this.n.Z(f2);
    }

    public void setTextDelegate(r rVar) {
        this.n.getClass();
    }

    public void setMaxFrame(String str) {
        this.n.L(str);
    }

    public void setMinFrame(String str) {
        this.n.Q(str);
    }

    public void setAnimation(String str) {
        this.p = str;
        this.q = 0;
        setCompositionTask(this.v ? e.c(getContext(), str) : e.d(getContext(), str, null));
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j(attributeSet);
    }
}

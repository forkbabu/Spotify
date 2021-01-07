package com.spotify.music.imagepicker.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.spotify.base.java.logging.Logger;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.g;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class CroppingImageView extends AppCompatImageView implements View.OnTouchListener {
    public static final a H = new a(null);
    private float A;
    private float B;
    private float C;
    private int D;
    private int E;
    private int F;
    private b G = new d();
    private boolean a = true;
    private int b;
    private int c;
    private ScaleGestureDetector f;
    private final Matrix n = new Matrix();
    private final Paint o = new Paint();
    private Bitmap p;
    private RectF q;
    private float r;
    private float s;
    private float t;
    private float u;
    private float v;
    private float w;
    private float x;
    private boolean y;
    private boolean z;

    public static final class a {
        public a(f fVar) {
        }
    }

    public interface b {
        void a();

        void b();

        void c();

        void d();
    }

    private final class c implements ScaleGestureDetector.OnScaleGestureListener {
        private float a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public c() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float f;
            float f2;
            h.e(scaleGestureDetector, "detector");
            float currentSpan = scaleGestureDetector.getCurrentSpan();
            float focusX = scaleGestureDetector.getFocusX();
            float focusY = scaleGestureDetector.getFocusY();
            if (CroppingImageView.this.A > ((float) 0)) {
                float f3 = currentSpan / CroppingImageView.this.A;
                if (CroppingImageView.this.r * f3 > CroppingImageView.this.x) {
                    f = CroppingImageView.this.x;
                    f2 = CroppingImageView.this.r;
                } else {
                    if (CroppingImageView.this.r * f3 < CroppingImageView.this.w) {
                        f = CroppingImageView.this.w;
                        f2 = CroppingImageView.this.r;
                    }
                    CroppingImageView croppingImageView = CroppingImageView.this;
                    croppingImageView.s = (focusX - CroppingImageView.this.u) + croppingImageView.s;
                    CroppingImageView croppingImageView2 = CroppingImageView.this;
                    croppingImageView2.t = (focusY - CroppingImageView.this.v) + croppingImageView2.t;
                    float f4 = CroppingImageView.this.r * ((float) CroppingImageView.this.E);
                    float f5 = CroppingImageView.this.r * ((float) CroppingImageView.this.F);
                    CroppingImageView.this.s -= ((f4 * f3) - f4) * ((focusX - CroppingImageView.this.s) / f4);
                    CroppingImageView.this.t -= ((f5 * f3) - f5) * ((focusY - CroppingImageView.this.t) / f5);
                    CroppingImageView.this.r *= f3;
                    CroppingImageView.this.x();
                }
                f3 = f / f2;
                CroppingImageView croppingImageView3 = CroppingImageView.this;
                croppingImageView3.s = (focusX - CroppingImageView.this.u) + croppingImageView3.s;
                CroppingImageView croppingImageView22 = CroppingImageView.this;
                croppingImageView22.t = (focusY - CroppingImageView.this.v) + croppingImageView22.t;
                float f42 = CroppingImageView.this.r * ((float) CroppingImageView.this.E);
                float f52 = CroppingImageView.this.r * ((float) CroppingImageView.this.F);
                CroppingImageView.this.s -= ((f42 * f3) - f42) * ((focusX - CroppingImageView.this.s) / f42);
                CroppingImageView.this.t -= ((f52 * f3) - f52) * ((focusY - CroppingImageView.this.t) / f52);
                CroppingImageView.this.r *= f3;
                CroppingImageView.this.x();
            }
            CroppingImageView.this.A = currentSpan;
            CroppingImageView.this.u = focusX;
            CroppingImageView.this.v = focusY;
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            h.e(scaleGestureDetector, "detector");
            CroppingImageView.this.A = scaleGestureDetector.getCurrentSpan();
            this.a = CroppingImageView.this.r;
            CroppingImageView.this.u = scaleGestureDetector.getFocusX();
            CroppingImageView.this.v = scaleGestureDetector.getFocusY();
            CroppingImageView.this.z = true;
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            h.e(scaleGestureDetector, "scaleGestureDetector");
            if (CroppingImageView.this.r > this.a) {
                CroppingImageView.this.G.d();
            } else if (CroppingImageView.this.r < this.a) {
                CroppingImageView.this.G.b();
            }
            CroppingImageView.this.z = false;
        }
    }

    public static final class d implements b {
        d() {
        }

        @Override // com.spotify.music.imagepicker.view.CroppingImageView.b
        public void a() {
        }

        @Override // com.spotify.music.imagepicker.view.CroppingImageView.b
        public void b() {
        }

        @Override // com.spotify.music.imagepicker.view.CroppingImageView.b
        public void c() {
        }

        @Override // com.spotify.music.imagepicker.view.CroppingImageView.b
        public void d() {
        }
    }

    public static final class e implements g {
        final /* synthetic */ CroppingImageView a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(CroppingImageView croppingImageView) {
            this.a = croppingImageView;
        }

        @Override // com.squareup.picasso.g
        public void onError(Exception exc) {
            h.e(exc, "e");
            Logger.d("Preview image failed to load", new Object[0]);
        }

        @Override // com.squareup.picasso.g
        public void onSuccess() {
            this.a.w();
            this.a.G.a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CroppingImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.e(context, "context");
        setScaleType(ImageView.ScaleType.MATRIX);
        this.f = new ScaleGestureDetector(context, new c());
        setOnTouchListener(this);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void w() {
        int i;
        int i2;
        Drawable drawable = getDrawable();
        if (drawable != null) {
            this.E = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            this.F = intrinsicHeight;
            int i3 = this.E;
            if (i3 != 0 && intrinsicHeight != 0 && (i = this.b) != 0 && (i2 = this.c) != 0) {
                float a2 = knf.a(((float) i) / ((float) i3), ((float) i2) / ((float) intrinsicHeight));
                this.w = a2;
                this.x = ((float) 10) * a2;
                RectF rectF = this.q;
                if (rectF != null) {
                    float a3 = a2 / knf.a(rectF.width(), rectF.height());
                    this.r = a3;
                    this.s = ((float) (-this.E)) * a3 * rectF.left;
                    this.t = ((float) (-this.F)) * a3 * rectF.top;
                }
                this.q = null;
                if (this.r < 1.0E-4f) {
                    float f2 = this.w;
                    this.r = f2;
                    float f3 = (float) 2;
                    this.s = (((float) this.b) - (((float) this.E) * f2)) / f3;
                    this.t = (((float) this.c) - (((float) this.F) * f2)) / f3;
                }
                x();
                Matrix matrix = this.n;
                float f4 = this.r;
                matrix.setScale(f4, f4);
                this.n.postTranslate(this.s, this.t);
                setImageMatrix(this.n);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void x() {
        float f2 = this.r;
        float f3 = this.w;
        if (f2 < f3) {
            this.r = f3;
        }
        float f4 = this.r;
        float f5 = this.x;
        if (f4 > f5) {
            this.r = f5;
        }
        float f6 = this.s;
        float f7 = (float) 0;
        if (f6 > f7) {
            this.s = 0.0f;
        } else {
            int i = this.E;
            float f8 = this.r;
            float f9 = (((float) i) * f8) + f6;
            int i2 = this.b;
            if (f9 < ((float) i2)) {
                this.s = ((float) i2) - (((float) i) * f8);
            }
        }
        float f10 = this.t;
        if (f10 > f7) {
            this.t = 0.0f;
            return;
        }
        int i3 = this.F;
        float f11 = this.r;
        float f12 = (((float) i3) * f11) + f10;
        int i4 = this.c;
        if (f12 < ((float) i4)) {
            this.t = ((float) i4) - (((float) i3) * f11);
        }
    }

    public final RectF getNormalizedRect() {
        int i = this.E;
        if (i <= 0 && this.F <= 0) {
            return new RectF(0.0f, 0.0f, 1.0f, 1.0f);
        }
        float f2 = this.r;
        float f3 = ((-this.s) / f2) / ((float) i);
        int i2 = this.F;
        float f4 = ((-this.t) / f2) / ((float) i2);
        return new RectF(f3, f4, ((((float) this.b) / f2) / ((float) i)) + f3, ((((float) this.c) / f2) / ((float) i2)) + f4);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r0.isRecycled() != false) goto L_0x0021;
     */
    @Override // android.widget.ImageView, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r15) {
        /*
            r14 = this;
            java.lang.String r0 = "canvas"
            kotlin.jvm.internal.h.e(r15, r0)
            super.onDraw(r15)
            boolean r0 = r14.a
            if (r0 == 0) goto L_0x008d
            int r0 = r14.b
            if (r0 <= 0) goto L_0x008d
            int r0 = r14.c
            if (r0 <= 0) goto L_0x008d
            android.graphics.Bitmap r0 = r14.p
            if (r0 == 0) goto L_0x0021
            kotlin.jvm.internal.h.c(r0)
            boolean r0 = r0.isRecycled()
            if (r0 == 0) goto L_0x007d
        L_0x0021:
            android.content.Context r0 = r14.getContext()
            java.lang.String r1 = "context"
            kotlin.jvm.internal.h.d(r0, r1)
            int r1 = r14.b
            int r2 = r14.c
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r1, r2, r3)
            if (r3 == 0) goto L_0x007a
            android.graphics.Canvas r10 = new android.graphics.Canvas
            r10.<init>(r3)
            android.graphics.Paint r11 = new android.graphics.Paint
            r11.<init>()
            r4 = 2131100555(0x7f06038b, float:1.7813495E38)
            int r4 = androidx.core.content.a.b(r0, r4)
            r11.setColor(r4)
            r5 = 0
            r6 = 0
            float r12 = (float) r1
            float r13 = (float) r2
            r4 = r10
            r7 = r12
            r8 = r13
            r9 = r11
            r4.drawRect(r5, r6, r7, r8, r9)
            r4 = 17170445(0x106000d, float:2.461195E-38)
            int r0 = androidx.core.content.a.b(r0, r4)
            r11.setColor(r0)
            r0 = 1
            r11.setAntiAlias(r0)
            android.graphics.PorterDuffXfermode r0 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.CLEAR
            r0.<init>(r4)
            r11.setXfermode(r0)
            if (r1 <= r2) goto L_0x0070
            r1 = r2
        L_0x0070:
            float r0 = (float) r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            float r12 = r12 / r1
            float r13 = r13 / r1
            r10.drawCircle(r12, r13, r0, r11)
            goto L_0x007b
        L_0x007a:
            r3 = 0
        L_0x007b:
            r14.p = r3
        L_0x007d:
            android.graphics.Bitmap r0 = r14.p
            if (r0 == 0) goto L_0x008d
            boolean r1 = r0.isRecycled()
            if (r1 != 0) goto L_0x008d
            android.graphics.Paint r1 = r14.o
            r2 = 0
            r15.drawBitmap(r0, r2, r2, r1)
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.imagepicker.view.CroppingImageView.onDraw(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        h.e(parcelable, "state");
        Bundle bundle = (Bundle) parcelable;
        this.q = (RectF) bundle.getParcelable("normalized_rect");
        super.onRestoreInstanceState(bundle.getParcelable("super_state"));
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("normalized_rect", getNormalizedRect());
        bundle.putParcelable("super_state", super.onSaveInstanceState());
        return bundle;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.b = i;
        this.c = i2;
        Bitmap bitmap = this.p;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.p = null;
        w();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r4 != 6) goto L_0x0083;
     */
    @Override // android.view.View.OnTouchListener
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            java.lang.String r0 = "v"
            kotlin.jvm.internal.h.e(r4, r0)
            java.lang.String r4 = "event"
            kotlin.jvm.internal.h.e(r5, r4)
            android.view.ScaleGestureDetector r4 = r3.f
            if (r4 == 0) goto L_0x0099
            r4.onTouchEvent(r5)
            int r4 = r5.getAction()
            r0 = 1
            if (r4 == 0) goto L_0x006b
            if (r4 == r0) goto L_0x0056
            r1 = 2
            if (r4 == r1) goto L_0x0024
            r1 = 5
            if (r4 == r1) goto L_0x006b
            r1 = 6
            if (r4 == r1) goto L_0x0056
            goto L_0x0083
        L_0x0024:
            boolean r4 = r3.y
            if (r4 == 0) goto L_0x0083
            int r4 = r3.D
            int r1 = r5.getActionIndex()
            if (r4 != r1) goto L_0x0083
            float r4 = r5.getX()
            float r5 = r5.getY()
            boolean r1 = r3.z
            if (r1 != 0) goto L_0x0051
            float r1 = r3.s
            float r2 = r3.B
            float r2 = r4 - r2
            float r2 = r2 + r1
            r3.s = r2
            float r1 = r3.t
            float r2 = r3.C
            float r2 = r5 - r2
            float r2 = r2 + r1
            r3.t = r2
            r3.x()
        L_0x0051:
            r3.B = r4
            r3.C = r5
            goto L_0x0083
        L_0x0056:
            boolean r4 = r3.y
            if (r4 == 0) goto L_0x0083
            int r4 = r3.D
            int r5 = r5.getActionIndex()
            if (r4 != r5) goto L_0x0083
            com.spotify.music.imagepicker.view.CroppingImageView$b r4 = r3.G
            r4.c()
            r4 = 0
            r3.y = r4
            goto L_0x0083
        L_0x006b:
            boolean r4 = r3.y
            if (r4 != 0) goto L_0x0083
            float r4 = r5.getX()
            r3.B = r4
            float r4 = r5.getY()
            r3.C = r4
            int r4 = r5.getActionIndex()
            r3.D = r4
            r3.y = r0
        L_0x0083:
            android.graphics.Matrix r4 = r3.n
            float r5 = r3.r
            r4.setScale(r5, r5)
            android.graphics.Matrix r4 = r3.n
            float r5 = r3.s
            float r1 = r3.t
            r4.postTranslate(r5, r1)
            android.graphics.Matrix r4 = r3.n
            r3.setImageMatrix(r4)
            return r0
        L_0x0099:
            java.lang.String r4 = "scaleDetector"
            kotlin.jvm.internal.h.k(r4)
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.imagepicker.view.CroppingImageView.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void setShowCircularOverlay(boolean z2) {
        this.a = z2;
    }

    public final void y(Picasso picasso, Uri uri, b bVar) {
        h.e(picasso, "picasso");
        h.e(uri, "imageUri");
        h.e(bVar, "imageLoadedCallback");
        this.G = bVar;
        picasso.j(uri);
        picasso.l(uri).n(this, new e(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CroppingImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        setScaleType(ImageView.ScaleType.MATRIX);
        this.f = new ScaleGestureDetector(context, new c());
        setOnTouchListener(this);
    }
}

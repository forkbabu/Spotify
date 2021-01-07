package com.spotify.music.features.profile.editprofile.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
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
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.g;

public class CroppingImageView extends AppCompatImageView implements View.OnTouchListener {
    private float A;
    private float B;
    private int C;
    private int D;
    private int E;
    private b F;
    private int a;
    private int b;
    private ScaleGestureDetector c;
    private final Matrix f = new Matrix();
    private final Paint n = new Paint();
    private Bitmap o;
    private RectF p;
    private float q;
    private float r;
    private float s;
    private float t;
    private float u;
    private float v;
    private float w;
    private boolean x;
    private boolean y;
    private float z;

    class a implements g {
        a() {
        }

        @Override // com.squareup.picasso.g
        public void onError(Exception exc) {
            Logger.d("Edit profile preview image failed to load", new Object[0]);
        }

        @Override // com.squareup.picasso.g
        public void onSuccess() {
            CroppingImageView.this.w();
            if (CroppingImageView.this.F != null) {
                CroppingImageView.this.F.a();
            }
        }
    }

    public interface b {
        void a();

        void b();

        void c();

        void d();
    }

    private class c implements ScaleGestureDetector.OnScaleGestureListener {
        private float a;

        c(a aVar) {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float f;
            float f2;
            float currentSpan = scaleGestureDetector.getCurrentSpan();
            float focusX = scaleGestureDetector.getFocusX();
            float focusY = scaleGestureDetector.getFocusY();
            if (CroppingImageView.this.z > 0.0f) {
                float f3 = currentSpan / CroppingImageView.this.z;
                if (CroppingImageView.this.q * f3 > CroppingImageView.this.w) {
                    f = CroppingImageView.this.w;
                    f2 = CroppingImageView.this.q;
                } else {
                    if (CroppingImageView.this.q * f3 < CroppingImageView.this.v) {
                        f = CroppingImageView.this.v;
                        f2 = CroppingImageView.this.q;
                    }
                    CroppingImageView croppingImageView = CroppingImageView.this;
                    croppingImageView.r = (focusX - CroppingImageView.this.t) + croppingImageView.r;
                    CroppingImageView croppingImageView2 = CroppingImageView.this;
                    croppingImageView2.s = (focusY - CroppingImageView.this.u) + croppingImageView2.s;
                    float f4 = CroppingImageView.this.q * ((float) CroppingImageView.this.D);
                    float f5 = CroppingImageView.this.q * ((float) CroppingImageView.this.E);
                    CroppingImageView.this.r -= ((f4 * f3) - f4) * ((focusX - CroppingImageView.this.r) / f4);
                    CroppingImageView.this.s -= ((f5 * f3) - f5) * ((focusY - CroppingImageView.this.s) / f5);
                    CroppingImageView.this.q *= f3;
                    CroppingImageView.this.x();
                }
                f3 = f / f2;
                CroppingImageView croppingImageView3 = CroppingImageView.this;
                croppingImageView3.r = (focusX - CroppingImageView.this.t) + croppingImageView3.r;
                CroppingImageView croppingImageView22 = CroppingImageView.this;
                croppingImageView22.s = (focusY - CroppingImageView.this.u) + croppingImageView22.s;
                float f42 = CroppingImageView.this.q * ((float) CroppingImageView.this.D);
                float f52 = CroppingImageView.this.q * ((float) CroppingImageView.this.E);
                CroppingImageView.this.r -= ((f42 * f3) - f42) * ((focusX - CroppingImageView.this.r) / f42);
                CroppingImageView.this.s -= ((f52 * f3) - f52) * ((focusY - CroppingImageView.this.s) / f52);
                CroppingImageView.this.q *= f3;
                CroppingImageView.this.x();
            }
            CroppingImageView.this.z = currentSpan;
            CroppingImageView.this.t = focusX;
            CroppingImageView.this.u = focusY;
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            CroppingImageView.this.z = scaleGestureDetector.getCurrentSpan();
            this.a = CroppingImageView.this.q;
            CroppingImageView.this.t = scaleGestureDetector.getFocusX();
            CroppingImageView.this.u = scaleGestureDetector.getFocusY();
            CroppingImageView.this.y = true;
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            if (CroppingImageView.this.F != null) {
                if (CroppingImageView.this.q > this.a) {
                    CroppingImageView.this.F.d();
                } else if (CroppingImageView.this.q < this.a) {
                    CroppingImageView.this.F.b();
                }
            }
            CroppingImageView.this.y = false;
        }
    }

    public CroppingImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setScaleType(ImageView.ScaleType.MATRIX);
        this.c = new ScaleGestureDetector(context, new c(null));
        setOnTouchListener(this);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void w() {
        int i;
        int i2;
        Drawable drawable = getDrawable();
        if (drawable != null) {
            this.D = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            this.E = intrinsicHeight;
            int i3 = this.D;
            if (i3 != 0 && intrinsicHeight != 0 && (i = this.a) != 0 && (i2 = this.b) != 0) {
                float max = Math.max(((float) i) / ((float) i3), ((float) i2) / ((float) intrinsicHeight));
                this.v = max;
                this.w = 10.0f * max;
                RectF rectF = this.p;
                if (rectF != null) {
                    float max2 = max / Math.max(rectF.width(), this.p.height());
                    this.q = max2;
                    RectF rectF2 = this.p;
                    this.r = ((float) (-this.D)) * max2 * rectF2.left;
                    this.s = ((float) (-this.E)) * max2 * rectF2.top;
                    this.p = null;
                }
                if (this.q < 1.0E-4f) {
                    float f2 = this.v;
                    this.q = f2;
                    this.r = (((float) this.a) - (((float) this.D) * f2)) / 2.0f;
                    this.s = (((float) this.b) - (((float) this.E) * f2)) / 2.0f;
                }
                x();
                Matrix matrix = this.f;
                float f3 = this.q;
                matrix.setScale(f3, f3);
                this.f.postTranslate(this.r, this.s);
                setImageMatrix(this.f);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void x() {
        float f2 = this.q;
        float f3 = this.v;
        if (f2 < f3) {
            this.q = f3;
        }
        float f4 = this.q;
        float f5 = this.w;
        if (f4 > f5) {
            this.q = f5;
        }
        float f6 = this.r;
        if (f6 > 0.0f) {
            this.r = 0.0f;
        } else {
            int i = this.D;
            float f7 = this.q;
            float f8 = (((float) i) * f7) + f6;
            int i2 = this.a;
            if (f8 < ((float) i2)) {
                this.r = ((float) i2) - (((float) i) * f7);
            }
        }
        float f9 = this.s;
        if (f9 > 0.0f) {
            this.s = 0.0f;
            return;
        }
        int i3 = this.E;
        float f10 = this.q;
        float f11 = (((float) i3) * f10) + f9;
        int i4 = this.b;
        if (f11 < ((float) i4)) {
            this.s = ((float) i4) - (((float) i3) * f10);
        }
    }

    public RectF getNormalizedRect() {
        int i = this.D;
        if (i <= 0 && this.E <= 0) {
            return new RectF(0.0f, 0.0f, 1.0f, 1.0f);
        }
        float f2 = this.q;
        float f3 = ((-this.r) / f2) / ((float) i);
        int i2 = this.E;
        float f4 = ((-this.s) / f2) / ((float) i2);
        return new RectF(f3, f4, ((((float) this.a) / f2) / ((float) i)) + f3, ((((float) this.b) / f2) / ((float) i2)) + f4);
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.a > 0 && this.b > 0) {
            Bitmap bitmap = this.o;
            if (bitmap == null || bitmap.isRecycled()) {
                Context context = getContext();
                int i = this.a;
                int i2 = this.b;
                Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                if (createBitmap == null) {
                    createBitmap = null;
                } else {
                    Canvas canvas2 = new Canvas(createBitmap);
                    Paint paint = new Paint();
                    paint.setColor(androidx.core.content.a.b(context, C0707R.color.profile_crop_image_overlay));
                    float f2 = (float) i;
                    float f3 = (float) i2;
                    canvas2.drawRect(0.0f, 0.0f, f2, f3, paint);
                    paint.setColor(androidx.core.content.a.b(context, 17170445));
                    paint.setAntiAlias(true);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    canvas2.drawCircle(f2 / 2.0f, f3 / 2.0f, ((float) Math.min(i, i2)) / 2.0f, paint);
                }
                this.o = createBitmap;
            }
            Bitmap bitmap2 = this.o;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                canvas.drawBitmap(this.o, 0.0f, 0.0f, this.n);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable == null) {
            super.onRestoreInstanceState(null);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.p = (RectF) bundle.getParcelable("normalized_rect");
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
        this.a = i;
        this.b = i2;
        Bitmap bitmap = this.o;
        if (bitmap != null) {
            bitmap.recycle();
            this.o = null;
        }
        w();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        if (r4 != 6) goto L_0x0079;
     */
    @Override // android.view.View.OnTouchListener
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            android.view.ScaleGestureDetector r4 = r3.c
            r4.onTouchEvent(r5)
            int r4 = r5.getAction()
            r0 = 1
            if (r4 == 0) goto L_0x0061
            if (r4 == r0) goto L_0x004a
            r1 = 2
            if (r4 == r1) goto L_0x0018
            r1 = 5
            if (r4 == r1) goto L_0x0061
            r1 = 6
            if (r4 == r1) goto L_0x004a
            goto L_0x0079
        L_0x0018:
            boolean r4 = r3.x
            if (r4 == 0) goto L_0x0079
            int r4 = r3.C
            int r1 = r5.getActionIndex()
            if (r4 != r1) goto L_0x0079
            float r4 = r5.getX()
            float r5 = r5.getY()
            boolean r1 = r3.y
            if (r1 != 0) goto L_0x0045
            float r1 = r3.r
            float r2 = r3.A
            float r2 = r4 - r2
            float r2 = r2 + r1
            r3.r = r2
            float r1 = r3.s
            float r2 = r3.B
            float r2 = r5 - r2
            float r2 = r2 + r1
            r3.s = r2
            r3.x()
        L_0x0045:
            r3.A = r4
            r3.B = r5
            goto L_0x0079
        L_0x004a:
            boolean r4 = r3.x
            if (r4 == 0) goto L_0x0079
            int r4 = r3.C
            int r5 = r5.getActionIndex()
            if (r4 != r5) goto L_0x0079
            com.spotify.music.features.profile.editprofile.utils.CroppingImageView$b r4 = r3.F
            if (r4 == 0) goto L_0x005d
            r4.c()
        L_0x005d:
            r4 = 0
            r3.x = r4
            goto L_0x0079
        L_0x0061:
            boolean r4 = r3.x
            if (r4 != 0) goto L_0x0079
            float r4 = r5.getX()
            r3.A = r4
            float r4 = r5.getY()
            r3.B = r4
            int r4 = r5.getActionIndex()
            r3.C = r4
            r3.x = r0
        L_0x0079:
            android.graphics.Matrix r4 = r3.f
            float r5 = r3.q
            r4.setScale(r5, r5)
            android.graphics.Matrix r4 = r3.f
            float r5 = r3.r
            float r1 = r3.s
            r4.postTranslate(r5, r1)
            android.graphics.Matrix r4 = r3.f
            r3.setImageMatrix(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.profile.editprofile.utils.CroppingImageView.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void y(Picasso picasso, Uri uri, b bVar) {
        this.F = bVar;
        picasso.j(uri);
        picasso.l(uri).n(this, new a());
    }

    public void z() {
        this.q = 0.0f;
        this.r = 0.0f;
        this.s = 0.0f;
    }

    public CroppingImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setScaleType(ImageView.ScaleType.MATRIX);
        this.c = new ScaleGestureDetector(context, new c(null));
        setOnTouchListener(this);
    }
}

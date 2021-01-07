package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.e;

public class ImageFilterView extends AppCompatImageView {
    private c a = new c();
    private boolean b = true;
    private float c = 0.0f;
    private float f = 0.0f;
    private float n = Float.NaN;
    private Path o;
    ViewOutlineProvider p;
    RectF q;
    Drawable[] r;
    LayerDrawable s;

    /* access modifiers changed from: package-private */
    public class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = ImageFilterView.this.getWidth();
            int height = ImageFilterView.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (((float) Math.min(width, height)) * ImageFilterView.this.f) / 2.0f);
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), ImageFilterView.this.n);
        }
    }

    /* access modifiers changed from: package-private */
    public static class c {
        float[] a = new float[20];
        ColorMatrix b = new ColorMatrix();
        ColorMatrix c = new ColorMatrix();
        float d = 1.0f;
        float e = 1.0f;
        float f = 1.0f;
        float g = 1.0f;

        c() {
        }

        /* access modifiers changed from: package-private */
        public void a(ImageView imageView) {
            boolean z;
            float f2;
            float f3;
            float f4;
            float f5;
            this.b.reset();
            float f6 = this.e;
            boolean z2 = true;
            if (f6 != 1.0f) {
                float f7 = 1.0f - f6;
                float f8 = 0.2999f * f7;
                float f9 = 0.587f * f7;
                float f10 = f7 * 0.114f;
                float[] fArr = this.a;
                fArr[0] = f8 + f6;
                fArr[1] = f9;
                fArr[2] = f10;
                fArr[3] = 0.0f;
                fArr[4] = 0.0f;
                fArr[5] = f8;
                fArr[6] = f9 + f6;
                fArr[7] = f10;
                fArr[8] = 0.0f;
                fArr[9] = 0.0f;
                fArr[10] = f8;
                fArr[11] = f9;
                fArr[12] = f10 + f6;
                fArr[13] = 0.0f;
                fArr[14] = 0.0f;
                fArr[15] = 0.0f;
                fArr[16] = 0.0f;
                fArr[17] = 0.0f;
                f2 = 1.0f;
                fArr[18] = 1.0f;
                fArr[19] = 0.0f;
                this.b.set(fArr);
                z = true;
            } else {
                f2 = 1.0f;
                z = false;
            }
            float f11 = this.f;
            if (f11 != f2) {
                this.c.setScale(f11, f11, f11, f2);
                this.b.postConcat(this.c);
                z = true;
            }
            float f12 = this.g;
            if (f12 != f2) {
                if (f12 <= 0.0f) {
                    f12 = 0.01f;
                }
                float f13 = (5000.0f / f12) / 100.0f;
                if (f13 > 66.0f) {
                    double d2 = (double) (f13 - 60.0f);
                    f5 = ((float) Math.pow(d2, 0.07551484555006027d)) * 288.12216f;
                    f4 = ((float) Math.pow(d2, -0.13320475816726685d)) * 329.69873f;
                } else {
                    f5 = (((float) Math.log((double) f13)) * 99.4708f) - 161.11957f;
                    f4 = 255.0f;
                }
                float log = f13 < 66.0f ? f13 > 19.0f ? (((float) Math.log((double) (f13 - 10.0f))) * 138.51773f) - 305.0448f : 0.0f : 255.0f;
                float min = Math.min(255.0f, Math.max(f4, 0.0f));
                float min2 = Math.min(255.0f, Math.max(f5, 0.0f));
                float min3 = Math.min(255.0f, Math.max(log, 0.0f));
                float min4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
                float min5 = Math.min(255.0f, Math.max((((float) Math.log((double) 50.0f)) * 99.4708f) - 161.11957f, 0.0f));
                float min6 = min3 / Math.min(255.0f, Math.max((((float) Math.log((double) 40.0f)) * 138.51773f) - 305.0448f, 0.0f));
                float[] fArr2 = this.a;
                fArr2[0] = min / min4;
                fArr2[1] = 0.0f;
                fArr2[2] = 0.0f;
                fArr2[3] = 0.0f;
                fArr2[4] = 0.0f;
                fArr2[5] = 0.0f;
                fArr2[6] = min2 / min5;
                fArr2[7] = 0.0f;
                fArr2[8] = 0.0f;
                fArr2[9] = 0.0f;
                fArr2[10] = 0.0f;
                fArr2[11] = 0.0f;
                fArr2[12] = min6;
                fArr2[13] = 0.0f;
                fArr2[14] = 0.0f;
                fArr2[15] = 0.0f;
                fArr2[16] = 0.0f;
                fArr2[17] = 0.0f;
                f3 = 1.0f;
                fArr2[18] = 1.0f;
                fArr2[19] = 0.0f;
                this.c.set(fArr2);
                this.b.postConcat(this.c);
                z = true;
            } else {
                f3 = 1.0f;
            }
            float f14 = this.d;
            if (f14 != f3) {
                float[] fArr3 = this.a;
                fArr3[0] = f14;
                fArr3[1] = 0.0f;
                fArr3[2] = 0.0f;
                fArr3[3] = 0.0f;
                fArr3[4] = 0.0f;
                fArr3[5] = 0.0f;
                fArr3[6] = f14;
                fArr3[7] = 0.0f;
                fArr3[8] = 0.0f;
                fArr3[9] = 0.0f;
                fArr3[10] = 0.0f;
                fArr3[11] = 0.0f;
                fArr3[12] = f14;
                fArr3[13] = 0.0f;
                fArr3[14] = 0.0f;
                fArr3[15] = 0.0f;
                fArr3[16] = 0.0f;
                fArr3[17] = 0.0f;
                fArr3[18] = 1.0f;
                fArr3[19] = 0.0f;
                this.c.set(fArr3);
                this.b.postConcat(this.c);
            } else {
                z2 = z;
            }
            if (z2) {
                imageView.setColorFilter(new ColorMatrixColorFilter(this.b));
            } else {
                imageView.clearColorFilter();
            }
        }
    }

    public ImageFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e(attributeSet);
    }

    private void e(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.f);
            int indexCount = obtainStyledAttributes.getIndexCount();
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 3) {
                    this.c = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == 8) {
                    setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 7) {
                    setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 2) {
                    setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 5) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                    }
                } else if (index == 6) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                    }
                } else if (index == 4) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.b));
                }
            }
            obtainStyledAttributes.recycle();
            if (drawable != null) {
                Drawable[] drawableArr = new Drawable[2];
                this.r = drawableArr;
                drawableArr[0] = getDrawable();
                this.r[1] = drawable;
                LayerDrawable layerDrawable = new LayerDrawable(this.r);
                this.s = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.c * 255.0f));
                super.setImageDrawable(this.s);
            }
        }
    }

    private void setOverlay(boolean z) {
        this.b = z;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 21 || this.f == 0.0f || this.o == null) {
            z = false;
        } else {
            z = true;
            canvas.save();
            canvas.clipPath(this.o);
        }
        super.draw(canvas);
        if (z) {
            canvas.restore();
        }
    }

    public float getBrightness() {
        return this.a.d;
    }

    public float getContrast() {
        return this.a.f;
    }

    public float getCrossfade() {
        return this.c;
    }

    public float getRound() {
        return this.n;
    }

    public float getRoundPercent() {
        return this.f;
    }

    public float getSaturation() {
        return this.a.e;
    }

    public float getWarmth() {
        return this.a.g;
    }

    public void setBrightness(float f2) {
        c cVar = this.a;
        cVar.d = f2;
        cVar.a(this);
    }

    public void setContrast(float f2) {
        c cVar = this.a;
        cVar.f = f2;
        cVar.a(this);
    }

    public void setCrossfade(float f2) {
        this.c = f2;
        if (this.r != null) {
            if (!this.b) {
                this.s.getDrawable(0).setAlpha((int) ((1.0f - this.c) * 255.0f));
            }
            this.s.getDrawable(1).setAlpha((int) (this.c * 255.0f));
            super.setImageDrawable(this.s);
        }
    }

    public void setRound(float f2) {
        if (Float.isNaN(f2)) {
            this.n = f2;
            float f3 = this.f;
            this.f = -1.0f;
            setRoundPercent(f3);
            return;
        }
        boolean z = this.n != f2;
        this.n = f2;
        if (f2 != 0.0f) {
            if (this.o == null) {
                this.o = new Path();
            }
            if (this.q == null) {
                this.q = new RectF();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.p == null) {
                    b bVar = new b();
                    this.p = bVar;
                    setOutlineProvider(bVar);
                }
                setClipToOutline(true);
            }
            this.q.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.o.reset();
            Path path = this.o;
            RectF rectF = this.q;
            float f4 = this.n;
            path.addRoundRect(rectF, f4, f4, Path.Direction.CW);
        } else if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(false);
        }
        if (z && Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f2) {
        boolean z = this.f != f2;
        this.f = f2;
        if (f2 != 0.0f) {
            if (this.o == null) {
                this.o = new Path();
            }
            if (this.q == null) {
                this.q = new RectF();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.p == null) {
                    a aVar = new a();
                    this.p = aVar;
                    setOutlineProvider(aVar);
                }
                setClipToOutline(true);
            }
            int width = getWidth();
            int height = getHeight();
            float min = (((float) Math.min(width, height)) * this.f) / 2.0f;
            this.q.set(0.0f, 0.0f, (float) width, (float) height);
            this.o.reset();
            this.o.addRoundRect(this.q, min, min, Path.Direction.CW);
        } else if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(false);
        }
        if (z && Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f2) {
        c cVar = this.a;
        cVar.e = f2;
        cVar.a(this);
    }

    public void setWarmth(float f2) {
        c cVar = this.a;
        cVar.g = f2;
        cVar.a(this);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e(attributeSet);
    }
}

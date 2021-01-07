package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.constraintlayout.widget.e;

public class ImageFilterButton extends AppCompatImageButton {
    private ImageFilterView.c a = new ImageFilterView.c();
    private float b = 0.0f;
    private float c = 0.0f;
    private float f = Float.NaN;
    private Path n;
    ViewOutlineProvider o;
    RectF p;
    Drawable[] q;
    LayerDrawable r;
    private boolean s = true;

    /* access modifiers changed from: package-private */
    public class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = ImageFilterButton.this.getWidth();
            int height = ImageFilterButton.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (((float) Math.min(width, height)) * ImageFilterButton.this.c) / 2.0f);
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), ImageFilterButton.this.f);
        }
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i(attributeSet);
    }

    private void i(AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.f);
            int indexCount = obtainStyledAttributes.getIndexCount();
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 3) {
                    this.b = obtainStyledAttributes.getFloat(index, 0.0f);
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
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.s));
                }
            }
            obtainStyledAttributes.recycle();
            if (drawable != null) {
                Drawable[] drawableArr = new Drawable[2];
                this.q = drawableArr;
                drawableArr[0] = getDrawable();
                this.q[1] = drawable;
                LayerDrawable layerDrawable = new LayerDrawable(this.q);
                this.r = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.b * 255.0f));
                super.setImageDrawable(this.r);
            }
        }
    }

    private void setOverlay(boolean z) {
        this.s = z;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 21 || this.f == 0.0f || this.n == null) {
            z = false;
        } else {
            z = true;
            canvas.save();
            canvas.clipPath(this.n);
        }
        super.draw(canvas);
        if (z) {
            canvas.restore();
        }
    }

    public float getContrast() {
        return this.a.f;
    }

    public float getCrossfade() {
        return this.b;
    }

    public float getRound() {
        return this.f;
    }

    public float getRoundPercent() {
        return this.c;
    }

    public float getSaturation() {
        return this.a.e;
    }

    public float getWarmth() {
        return this.a.g;
    }

    public void setBrightness(float f2) {
        ImageFilterView.c cVar = this.a;
        cVar.d = f2;
        cVar.a(this);
    }

    public void setContrast(float f2) {
        ImageFilterView.c cVar = this.a;
        cVar.f = f2;
        cVar.a(this);
    }

    public void setCrossfade(float f2) {
        this.b = f2;
        if (this.q != null) {
            if (!this.s) {
                this.r.getDrawable(0).setAlpha((int) ((1.0f - this.b) * 255.0f));
            }
            this.r.getDrawable(1).setAlpha((int) (this.b * 255.0f));
            super.setImageDrawable(this.r);
        }
    }

    public void setRound(float f2) {
        if (Float.isNaN(f2)) {
            this.f = f2;
            float f3 = this.c;
            this.c = -1.0f;
            setRoundPercent(f3);
            return;
        }
        boolean z = this.f != f2;
        this.f = f2;
        if (f2 != 0.0f) {
            if (this.n == null) {
                this.n = new Path();
            }
            if (this.p == null) {
                this.p = new RectF();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.o == null) {
                    b bVar = new b();
                    this.o = bVar;
                    setOutlineProvider(bVar);
                }
                setClipToOutline(true);
            }
            this.p.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.n.reset();
            Path path = this.n;
            RectF rectF = this.p;
            float f4 = this.f;
            path.addRoundRect(rectF, f4, f4, Path.Direction.CW);
        } else if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(false);
        }
        if (z && Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f2) {
        boolean z = this.c != f2;
        this.c = f2;
        if (f2 != 0.0f) {
            if (this.n == null) {
                this.n = new Path();
            }
            if (this.p == null) {
                this.p = new RectF();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.o == null) {
                    a aVar = new a();
                    this.o = aVar;
                    setOutlineProvider(aVar);
                }
                setClipToOutline(true);
            }
            int width = getWidth();
            int height = getHeight();
            float min = (((float) Math.min(width, height)) * this.c) / 2.0f;
            this.p.set(0.0f, 0.0f, (float) width, (float) height);
            this.n.reset();
            this.n.addRoundRect(this.p, min, min, Path.Direction.CW);
        } else if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(false);
        }
        if (z && Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f2) {
        ImageFilterView.c cVar = this.a;
        cVar.e = f2;
        cVar.a(this);
    }

    public void setWarmth(float f2) {
        ImageFilterView.c cVar = this.a;
        cVar.g = f2;
        cVar.a(this);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i(attributeSet);
    }
}

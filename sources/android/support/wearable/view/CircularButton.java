package android.support.wearable.view;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;

@Deprecated
public class CircularButton extends View {
    private static final double r = Math.sqrt(2.0d);
    private int a;
    private final ShapeDrawable b;
    private RippleDrawable c;
    private final Interpolator f;
    private ColorStateList n;
    private Drawable o;
    private int p;
    private int q;

    private class b extends ViewOutlineProvider {
        b(a aVar) {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setOval(0, 0, CircularButton.this.p, CircularButton.this.p);
        }
    }

    public CircularButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static boolean b(Drawable drawable) {
        return drawable != null && drawable.getIntrinsicHeight() > 0 && drawable.getIntrinsicWidth() > 0;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        ColorStateList colorStateList = this.n;
        if (colorStateList != null && colorStateList.isStateful()) {
            this.b.getPaint().setColor(this.n.getColorForState(getDrawableState(), this.n.getDefaultColor()));
            this.b.invalidateSelf();
        }
    }

    public Drawable getImageDrawable() {
        return this.o;
    }

    public int getImageScaleMode() {
        return this.q;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.o;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        super.onLayout(z, i, i2, i3, i4);
        int i7 = i3 - i;
        int i8 = i4 - i2;
        Drawable drawable = this.o;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.o.getIntrinsicHeight();
            if (this.q == 0 || !b(this.o)) {
                double d = (double) (this.p / 2);
                double d2 = r;
                Double.isNaN(d);
                Double.isNaN(d);
                int floor = (int) Math.floor(d * d2);
                int i9 = (this.p - floor) / 2;
                if (!b(this.o)) {
                    int i10 = floor + i9;
                    this.o.setBounds(i9, i9, i10, i10);
                    return;
                }
                if (intrinsicWidth == intrinsicHeight) {
                    i6 = floor;
                    i5 = i9;
                } else {
                    float f2 = ((float) intrinsicWidth) / ((float) intrinsicHeight);
                    if (intrinsicWidth > intrinsicHeight) {
                        i6 = (int) (((float) floor) / f2);
                        i5 = (int) (((float) (floor - i6)) / 2.0f);
                    } else {
                        int i11 = (int) (((float) floor) * f2);
                        floor = i11;
                        i6 = floor;
                        i9 = (int) (((float) (floor - i11)) / 2.0f);
                        i5 = i9;
                    }
                }
                this.o.setBounds(i9, i5, floor + i9, i6 + i5);
                return;
            }
            int i12 = (int) (((float) (i7 - intrinsicWidth)) / 2.0f);
            int i13 = (int) (((float) (i8 - intrinsicHeight)) / 2.0f);
            this.o.setBounds(i12, i13, intrinsicWidth + i12, intrinsicHeight + i13);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824 && mode2 == 1073741824) {
            this.p = Math.min(size, size2);
        } else if (mode == 1073741824) {
            this.p = size;
        } else if (mode2 == 1073741824) {
            this.p = size2;
        } else {
            if (b(this.o)) {
                i3 = Math.max(this.o.getIntrinsicHeight(), this.o.getIntrinsicWidth());
            } else {
                i3 = (int) Math.ceil((double) TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics()));
            }
            if (mode == Integer.MIN_VALUE || mode2 == Integer.MIN_VALUE) {
                if (mode != Integer.MIN_VALUE) {
                    size = size2;
                } else if (mode2 == Integer.MIN_VALUE) {
                    size = Math.min(size, size2);
                }
                double d = (double) i3;
                double d2 = r;
                Double.isNaN(d);
                Double.isNaN(d);
                this.p = Math.min(size, ((int) Math.floor(d / d2)) * 2);
            } else {
                this.p = i3;
            }
        }
        int i4 = this.p;
        setMeasuredDimension(i4, i4);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent && (motionEvent.getAction() & BitmapRenderer.ALPHA_VISIBLE) == 0) {
            getBackground().setHotspot(motionEvent.getX(), motionEvent.getY());
        }
        return onTouchEvent;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    public void setColor(int i) {
        this.n = ColorStateList.valueOf(i);
        this.b.getPaint().setColor(this.n.getDefaultColor());
    }

    public void setImageDrawable(Drawable drawable) {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        if (this.o != drawable) {
            this.o = drawable;
            requestLayout();
            invalidate();
        }
        Drawable drawable3 = this.o;
        if (drawable3 != null) {
            drawable3.setCallback(this);
        }
    }

    public void setImageResource(int i) {
        setImageDrawable(getResources().getDrawable(i, null));
    }

    public void setImageScaleMode(int i) {
        this.q = i;
        if (this.o != null) {
            invalidate();
            requestLayout();
        }
    }

    public void setPressedTranslationZ(float f2) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        int[] iArr = View.PRESSED_ENABLED_STATE_SET;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "translationZ", f2);
        ofFloat.setInterpolator(this.f);
        stateListAnimator.addState(iArr, ofFloat);
        int[] iArr2 = View.ENABLED_FOCUSED_STATE_SET;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "translationZ", f2);
        ofFloat2.setInterpolator(this.f);
        stateListAnimator.addState(iArr2, ofFloat2);
        int[] iArr3 = View.EMPTY_STATE_SET;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, "translationZ", getElevation());
        ofFloat3.setInterpolator(this.f);
        stateListAnimator.addState(iArr3, ofFloat3);
        setStateListAnimator(stateListAnimator);
    }

    public void setRippleColor(int i) {
        this.a = i;
        RippleDrawable rippleDrawable = this.c;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(ColorStateList.valueOf(i));
        } else if (i == -1 || isInEditMode()) {
            this.c = null;
            super.setBackgroundDrawable(this.b);
        } else {
            ColorStateList valueOf = ColorStateList.valueOf(i);
            ShapeDrawable shapeDrawable = this.b;
            RippleDrawable rippleDrawable2 = new RippleDrawable(valueOf, shapeDrawable, shapeDrawable);
            this.c = rippleDrawable2;
            super.setBackgroundDrawable(rippleDrawable2);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return this.o == drawable || super.verifyDrawable(drawable);
    }

    public CircularButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.a = -1;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        this.b = shapeDrawable;
        shapeDrawable.getPaint().setColor(-3355444);
        super.setBackgroundDrawable(shapeDrawable);
        setOutlineProvider(new b(null));
        this.f = new AccelerateInterpolator(2.0f);
        this.q = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.g, i, 0);
        boolean z = true;
        for (int i2 = 0; i2 < obtainStyledAttributes.getIndexCount(); i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 2) {
                this.n = obtainStyledAttributes.getColorStateList(index);
                this.b.getPaint().setColor(this.n.getDefaultColor());
            } else if (index == 1) {
                this.o = obtainStyledAttributes.getDrawable(index);
            } else if (index == 5) {
                setRippleColor(obtainStyledAttributes.getColor(index, -1));
            } else if (index == 7) {
                setPressedTranslationZ(obtainStyledAttributes.getDimension(index, 0.0f));
            } else if (index == 6) {
                this.q = obtainStyledAttributes.getInt(index, this.q);
            } else if (index == 0) {
                z = obtainStyledAttributes.getBoolean(0, z);
            }
        }
        obtainStyledAttributes.recycle();
        setClickable(z);
    }

    public void setColor(ColorStateList colorStateList) {
        this.n = colorStateList;
        this.b.getPaint().setColor(this.n.getDefaultColor());
    }
}

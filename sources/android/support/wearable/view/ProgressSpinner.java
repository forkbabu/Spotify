package android.support.wearable.view;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ProgressBar;
import com.spotify.music.C0707R;

@Deprecated
public class ProgressSpinner extends ProgressBar {
    private int[] a = null;
    private final ArgbEvaluator b = new ArgbEvaluator();
    private Interpolator c;
    private float f;

    class a extends Property<ProgressSpinner, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public Float get(ProgressSpinner progressSpinner) {
            return Float.valueOf(progressSpinner.getShowingness());
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public void set(ProgressSpinner progressSpinner, Float f) {
            progressSpinner.setShowingness(f.floatValue());
        }
    }

    /* access modifiers changed from: private */
    public class b extends Drawable {
        final RectF a = new RectF();
        final Paint b;

        b() {
            Paint paint = new Paint();
            this.b = paint;
            paint.setAntiAlias(true);
            paint.setColor(-1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x0181  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0184  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0190  */
        /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
        @Override // android.graphics.drawable.Drawable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void draw(android.graphics.Canvas r24) {
            /*
            // Method dump skipped, instructions count: 456
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.wearable.view.ProgressSpinner.b.draw(android.graphics.Canvas):void");
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    static {
        new a(Float.class, "showingness");
    }

    public ProgressSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i(context, attributeSet, 0);
    }

    static float f(float f2, float f3, float f4) {
        float j = j(f2, f3, f4);
        if (j < 0.0f) {
            return 0.0f;
        }
        if (j > 1.0f) {
            return 1.0f;
        }
        return j;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private float getShowingness() {
        return this.f;
    }

    static int h(ProgressSpinner progressSpinner, float f2, float f3, int i, int i2) {
        return ((Integer) progressSpinner.b.evaluate(j(0.0f, f3, f2), Integer.valueOf(i), Integer.valueOf(i2))).intValue();
    }

    private void i(Context context, AttributeSet attributeSet, int i) {
        if (!isInEditMode()) {
            this.c = AnimationUtils.loadInterpolator(context, 17563654);
        }
        setIndeterminateDrawable(new b());
        if (getVisibility() == 0) {
            this.f = 1.0f;
        }
        int[] iArr = this.a;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.l, i, 0);
            iArr = null;
            if (obtainStyledAttributes.hasValue(0)) {
                try {
                    iArr = getResources().getIntArray(obtainStyledAttributes.getResourceId(0, 0));
                } catch (Resources.NotFoundException unused) {
                }
                if (iArr == null || iArr.length <= 0) {
                    iArr = new int[]{Integer.valueOf(obtainStyledAttributes.getColor(0, getResources().getColor(17170445))).intValue()};
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (iArr == null) {
            if (isInEditMode()) {
                iArr = new int[]{context.getResources().getColor(17170456)};
            } else {
                TypedArray obtainTypedArray = getResources().obtainTypedArray(C0707R.array.progress_spinner_sequence);
                iArr = new int[obtainTypedArray.length()];
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    iArr[i2] = obtainTypedArray.getColor(i2, 0);
                }
                obtainTypedArray.recycle();
            }
        }
        setColors(iArr);
    }

    /* access modifiers changed from: private */
    public static float j(float f2, float f3, float f4) {
        if (f2 != f3) {
            return (f4 - f2) / (f3 - f2);
        }
        return 0.0f;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setShowingness(float f2) {
        this.f = f2;
        invalidate();
    }

    public void setColors(int[] iArr) {
        if (iArr != null && iArr.length > 0) {
            this.a = iArr;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (getVisibility() != i) {
            super.setVisibility(i);
            if (i == 0) {
                setShowingness(1.0f);
            } else if (i == 4 || i == 8) {
                setShowingness(0.0f);
            } else {
                throw new IllegalArgumentException("Visibility only supports View.VISIBLE, View.INVISIBLE, or View.GONE");
            }
        }
    }

    public ProgressSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i(context, attributeSet, i);
    }
}

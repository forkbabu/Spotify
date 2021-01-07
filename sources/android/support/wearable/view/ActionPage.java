package android.support.wearable.view;

import android.animation.AnimatorInflater;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.spotify.music.C0707R;

@Deprecated
public class ActionPage extends ViewGroup {
    private final ActionLabel a;
    private CircularButton b;
    private int c;
    private float f;
    private final Point n;
    private int o;
    private int p;
    private boolean q;
    private int r;
    private boolean s;

    public ActionPage(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircularButton getButton() {
        return this.b;
    }

    public ActionLabel getLabel() {
        return this.a;
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        this.s = true;
        if (this.q != windowInsets.isRound()) {
            this.q = windowInsets.isRound();
            requestLayout();
        }
        int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
        if (this.r != systemWindowInsetBottom) {
            this.r = systemWindowInsetBottom;
            requestLayout();
        }
        if (this.q) {
            this.r = (int) Math.max((float) this.r, ((float) getMeasuredHeight()) * 0.09375f);
        }
        return windowInsets;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.s) {
            requestApplyInsets();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        CircularButton circularButton = this.b;
        Point point = this.n;
        int i6 = point.x;
        float f2 = this.f;
        int i7 = point.y;
        circularButton.layout((int) (((float) i6) - f2), (int) (((float) i7) - f2), (int) (((float) i6) + f2), (int) (((float) i7) + f2));
        int i8 = (int) (((float) (i5 - this.o)) / 2.0f);
        this.a.layout(i8, this.b.getBottom(), this.o + i8, this.b.getBottom() + this.p);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        if (this.b.getImageScaleMode() != 1 || this.b.getImageDrawable() == null) {
            int min = (int) (((float) Math.min(measuredWidth, measuredHeight)) * 0.45f);
            this.c = min;
            this.f = ((float) min) / 2.0f;
            this.b.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(this.c, 1073741824));
        } else {
            this.b.measure(0, 0);
            int min2 = Math.min(this.b.getMeasuredWidth(), this.b.getMeasuredHeight());
            this.c = min2;
            this.f = ((float) min2) / 2.0f;
        }
        if (this.q) {
            this.n.set(measuredWidth / 2, measuredHeight / 2);
            this.o = (int) (((float) measuredWidth) * 0.625f);
            this.r = (int) (((float) measuredHeight) * 0.09375f);
        } else {
            this.n.set(measuredWidth / 2, (int) (((float) measuredHeight) * 0.43f));
            this.o = (int) (((float) measuredWidth) * 0.892f);
        }
        this.p = (int) ((((float) measuredHeight) - (((float) this.n.y) + this.f)) - ((float) this.r));
        this.a.measure(View.MeasureSpec.makeMeasureSpec(this.o, 1073741824), View.MeasureSpec.makeMeasureSpec(this.p, 1073741824));
    }

    public void setColor(int i) {
        this.b.setColor(i);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        CircularButton circularButton = this.b;
        if (circularButton != null) {
            circularButton.setEnabled(z);
        }
    }

    public void setImageDrawable(Drawable drawable) {
        this.b.setImageDrawable(drawable);
    }

    public void setImageResource(int i) {
        this.b.setImageResource(i);
    }

    public void setImageScaleMode(int i) {
        this.b.setImageScaleMode(i);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        CircularButton circularButton = this.b;
        if (circularButton != null) {
            circularButton.setOnClickListener(onClickListener);
        }
    }

    @Override // android.view.View
    public void setStateListAnimator(StateListAnimator stateListAnimator) {
        CircularButton circularButton = this.b;
        if (circularButton != null) {
            circularButton.setStateListAnimator(stateListAnimator);
        }
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public ActionPage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, C0707R.style.res_2132083658_widget_actionpage);
        this.n = new Point();
        String str = null;
        this.b = new CircularButton(context, null);
        ActionLabel actionLabel = new ActionLabel(context, null);
        this.a = actionLabel;
        actionLabel.setGravity(17);
        actionLabel.setMaxLines(2);
        float f2 = 1.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.d, i, C0707R.style.res_2132083658_widget_actionpage);
        float f3 = 0.0f;
        int i2 = 1;
        int i3 = 0;
        for (int i4 = 0; i4 < obtainStyledAttributes.getIndexCount(); i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            if (index == 7) {
                this.b.setColor(obtainStyledAttributes.getColorStateList(index));
            } else if (index == 4) {
                this.b.setImageDrawable(obtainStyledAttributes.getDrawable(index));
            } else if (index == 14) {
                this.b.setImageScaleMode(obtainStyledAttributes.getInt(index, 0));
            } else if (index == 13) {
                this.b.setRippleColor(obtainStyledAttributes.getColor(index, -1));
            } else if (index == 17) {
                this.b.setPressedTranslationZ(obtainStyledAttributes.getDimension(index, 0.0f));
            } else if (index == 5) {
                this.a.setText(obtainStyledAttributes.getText(index));
            } else if (index == 16) {
                this.a.d(0, obtainStyledAttributes.getDimension(index, 10.0f));
            } else if (index == 15) {
                this.a.c(0, obtainStyledAttributes.getDimension(index, 60.0f));
            } else if (index == 2) {
                this.a.setTextColor(obtainStyledAttributes.getColorStateList(index));
            } else if (index == 6) {
                this.a.setMaxLines(obtainStyledAttributes.getInt(index, 2));
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
            } else if (index == 0) {
                i2 = obtainStyledAttributes.getInt(index, i2);
            } else {
                if (index == 1) {
                    i3 = obtainStyledAttributes.getInt(index, i3);
                } else if (index == 3) {
                    this.a.setGravity(obtainStyledAttributes.getInt(index, 17));
                } else if (index == 8) {
                    f3 = obtainStyledAttributes.getDimension(index, f3);
                } else if (index == 9) {
                    f2 = obtainStyledAttributes.getDimension(index, f2);
                } else if (index == 12) {
                    this.b.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, obtainStyledAttributes.getResourceId(index, 0)));
                }
            }
        }
        obtainStyledAttributes.recycle();
        this.a.b(f3, f2);
        this.a.e(str, i2, i3);
        addView(this.a);
        addView(this.b);
    }

    public void setColor(ColorStateList colorStateList) {
        this.b.setColor(colorStateList);
    }
}

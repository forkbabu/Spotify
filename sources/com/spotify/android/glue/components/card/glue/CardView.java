package com.spotify.android.glue.components.card.glue;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.a;
import androidx.core.widget.c;
import com.google.common.base.MoreObjects;
import com.spotify.android.glue.components.card.Card;
import com.spotify.android.glue.components.card.CardAppearance;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.paste.graphics.drawable.CardAccessoryDrawable;
import com.spotify.paste.widgets.layouts.PasteLinearLayout;

public class CardView extends PasteLinearLayout {
    private final ImageView o;
    private final TextView p;
    private final TextView q;
    private CardAccessoryDrawable r;
    private float s;
    private final yud t;

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static int c(TextView textView) {
        if (textView.getVisibility() == 8) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        return textView.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int d(int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        float f = (float) i;
        int round = Math.round(this.s * f);
        int round2 = Math.round(((this.s * 0.5f) + 0.5f) * f);
        this.p.measure(z42.A(round2), makeMeasureSpec);
        this.q.measure(z42.A(round2), makeMeasureSpec);
        this.o.measure(z42.A(round), makeMeasureSpec);
        return i;
    }

    private static int g(TextView textView, int i) {
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        return (((fontMetricsInt.bottom - fontMetricsInt.top) + fontMetricsInt.leading) * i) + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        CardAccessoryDrawable cardAccessoryDrawable = this.r;
        if (cardAccessoryDrawable != null) {
            canvas.save();
            if (nud.n(this)) {
                canvas.translate((float) (cardAccessoryDrawable.b() + Math.round(((1.0f - this.s) * ((float) getMeasuredWidth())) / 2.0f)), (float) ((this.o.getMeasuredHeight() - cardAccessoryDrawable.getIntrinsicHeight()) - cardAccessoryDrawable.b()));
            } else {
                canvas.translate((float) (((canvas.getWidth() - cardAccessoryDrawable.getIntrinsicWidth()) - cardAccessoryDrawable.b()) - Math.round(((1.0f - this.s) * ((float) getMeasuredWidth())) / 2.0f)), (float) ((this.o.getMeasuredHeight() - cardAccessoryDrawable.getIntrinsicHeight()) - cardAccessoryDrawable.b()));
            }
            cardAccessoryDrawable.draw(canvas);
            canvas.restore();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.paste.widgets.layouts.PasteLinearLayout, android.view.View, android.view.ViewGroup
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        int length = drawableState.length;
        boolean z = false;
        for (int i = 0; i < length; i++) {
            z |= drawableState[i] == -16842910;
        }
        if (z) {
            setAlpha(0.4f);
        }
        this.t.a();
    }

    public float getCardImageWidthRatio() {
        return this.s;
    }

    public ImageView getImageView() {
        return this.o;
    }

    public TextView getSubtitleView() {
        return this.q;
    }

    public TextView getTitleView() {
        return this.p;
    }

    @Override // com.spotify.paste.widgets.layouts.PasteLinearLayout, android.view.View, android.view.ViewGroup
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.t.c();
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.View, android.view.ViewGroup
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = (getMeasuredWidth() / 2) - (this.o.getMeasuredWidth() / 2);
        int measuredWidth2 = (getMeasuredWidth() / 2) - (this.p.getMeasuredWidth() / 2);
        int measuredWidth3 = this.p.getMeasuredWidth() + measuredWidth2;
        int measuredHeight = this.o.getMeasuredHeight();
        int i5 = measuredHeight + 0;
        this.o.layout(measuredWidth, 0, this.o.getMeasuredWidth() + measuredWidth, i5);
        if (this.p.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.p.getLayoutParams();
            int i6 = i5 + marginLayoutParams.topMargin;
            TextView textView = this.p;
            textView.layout(measuredWidth2, i6, measuredWidth3, textView.getMeasuredHeight() + i6);
            i5 = this.p.getMeasuredHeight() + i6 + marginLayoutParams.bottomMargin;
        }
        if (this.q.getVisibility() != 8) {
            int i7 = i5 + ((ViewGroup.MarginLayoutParams) this.q.getLayoutParams()).topMargin;
            TextView textView2 = this.q;
            textView2.layout(measuredWidth2, i7, measuredWidth3, textView2.getMeasuredHeight() + i7);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        boolean z = false;
        if (!z42.w(i) || !z42.w(i2)) {
            boolean z2 = z42.z(i);
            boolean z3 = z42.z(i2);
            if (z2 == z3) {
                super.onMeasure(i, i2);
                return;
            }
            if (z3) {
                d(size2);
            } else {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                TextView textView = this.p;
                int g = g(textView, c.d(textView));
                TextView textView2 = this.q;
                size2 = Math.round(((float) ((size - g) - g(textView2, c.d(textView2)))) / this.s);
                float f = (float) size2;
                int round = Math.round(this.s * f);
                int round2 = Math.round(((this.s * 0.5f) + 0.5f) * f);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                this.p.measure(makeMeasureSpec3, makeMeasureSpec);
                this.q.measure(makeMeasureSpec3, makeMeasureSpec);
                this.o.measure(makeMeasureSpec2, makeMeasureSpec);
            }
            int measuredHeight = this.o.getMeasuredHeight();
            if (this.p.getVisibility() != 8) {
                measuredHeight += c(this.p);
            }
            if (this.q.getVisibility() != 8) {
                measuredHeight += c(this.q);
            }
            setMeasuredDimension(size2, measuredHeight);
            return;
        }
        if (size2 < size) {
            z = true;
        }
        w(z);
        d(size2);
        setMeasuredDimension(size2, size);
    }

    public void setAccessoryDrawable(CardAccessoryDrawable cardAccessoryDrawable) {
        this.r = cardAccessoryDrawable;
        postInvalidate();
    }

    /* access modifiers changed from: package-private */
    public void setAppearance(CardAppearance cardAppearance) {
        switch (cardAppearance.ordinal()) {
            case 0:
                this.p.setVisibility(4);
                this.q.setVisibility(4);
                break;
            case 1:
                this.p.setVisibility(0);
                this.q.setVisibility(4);
                break;
            case 2:
                nud.p(getContext(), this.q, C0707R.attr.pasteTextAppearanceBodySmall);
                this.p.setVisibility(0);
                this.q.setTextColor(a.b(getContext(), R.color.white_70));
                this.q.setVisibility(0);
                break;
            case 3:
                nud.p(getContext(), this.q, C0707R.attr.pasteTextAppearanceMetadata);
                this.p.setVisibility(0);
                this.q.setTextColor(a.b(getContext(), R.color.white_70));
                this.q.setVisibility(0);
                break;
            case 4:
                nud.p(getContext(), this.p, C0707R.attr.pasteTextAppearanceBodyMedium);
                this.p.setVisibility(0);
                this.p.setTextColor(a.b(getContext(), R.color.white_70));
                this.q.setVisibility(8);
                this.s = 0.66f;
                setTextLayout(Card.TextLayout.DOUBLE_LINE_TITLE);
                vc0.e(this.p, nud.g(24.0f, getResources()));
                vc0.f(this.p, nud.g(24.0f, getResources()));
                vc0.d(this.p, nud.g(8.0f, getResources()));
                break;
            case 5:
                this.p.setVisibility(8);
                this.q.setVisibility(8);
                this.s = 0.66f;
                break;
            case 6:
                nud.p(getContext(), this.p, C0707R.attr.pasteTextAppearanceBodySmall);
                this.p.setVisibility(0);
                this.p.setTextColor(a.b(getContext(), R.color.white_70));
                this.q.setVisibility(8);
                setTextLayout(Card.TextLayout.DOUBLE_LINE_TITLE);
                vc0.f(this.p, nud.g(24.0f, getResources()));
                vc0.d(this.p, nud.g(8.0f, getResources()));
                break;
            default:
                throw new IllegalArgumentException("Unsupported CardAppearance: " + cardAppearance);
        }
        vc0.g(this);
    }

    public void setCardImageWidthRatio(float f) {
        MoreObjects.checkArgument(((double) f) >= 0.5d && f <= 1.0f);
        this.s = f;
    }

    public void setImageResource(int i) {
        this.o.setImageResource(i);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.q.setText(charSequence);
    }

    public void setTextLayout(Card.TextLayout textLayout) {
        int ordinal = textLayout.ordinal();
        if (ordinal == 0) {
            this.p.setMaxLines(1);
            this.q.setMaxLines(1);
        } else if (ordinal == 1) {
            this.p.setMaxLines(2);
            this.q.setMaxLines(1);
        } else if (ordinal == 2) {
            this.p.setMaxLines(1);
            this.q.setMaxLines(2);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.p.setText(charSequence);
    }

    /* access modifiers changed from: protected */
    public void w(boolean z) {
        MoreObjects.checkArgument(z);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.s = 1.0f;
        this.t = new yud(this);
        setOrientation(1);
        LayoutInflater.from(getContext()).inflate(C0707R.layout.glue_card, this);
        ImageView imageView = (ImageView) findViewById(16908294);
        this.o = imageView;
        TextView textView = (TextView) findViewById(C0707R.id.title);
        this.p = textView;
        TextView textView2 = (TextView) findViewById(C0707R.id.subtitle);
        this.q = textView2;
        setGravity(1);
        TextView[] textViewArr = {textView, textView2};
        vc0.i(textViewArr);
        vc0.h(textViewArr);
        vc0.g(this);
        setClickable(true);
        bvd b = dvd.b(this);
        b.f(imageView);
        b.g(textView, textView2);
        b.a();
        if (!isInEditMode()) {
            textView2.setVisibility(8);
        }
    }
}

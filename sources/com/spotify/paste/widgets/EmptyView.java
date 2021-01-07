package com.spotify.paste.widgets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.music.C0707R;
import com.spotify.paste.widgets.internal.a;

@Deprecated
public final class EmptyView extends LinearLayout {
    private static final int[] q = {16843161, 16843233, 16843087};
    private final TextView a;
    private final TextView b;
    private final ImageView c;
    private final a f;
    private int n;
    private float o;
    private boolean p;

    public EmptyView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.pasteDefaultsEmptyViewStyle);
    }

    public View getAccessoryView() {
        return this.f.d();
    }

    public ImageView getImageView() {
        return this.c;
    }

    public TextView getTextView() {
        return this.b;
    }

    public TextView getTitleView() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        float f2;
        this.f.g();
        Drawable drawable = this.c.getDrawable();
        if (drawable != null) {
            int i3 = this.n;
            if (this.p) {
                f2 = this.o;
            } else {
                f2 = ((float) drawable.getIntrinsicWidth()) / ((float) drawable.getIntrinsicHeight());
            }
            int round = Math.round(((float) i3) / f2);
            this.c.getLayoutParams().width = i3;
            this.c.getLayoutParams().height = round;
        }
        super.onMeasure(i, i2);
    }

    public void setAccessoryView(View view) {
        this.f.f(view);
    }

    public void setImageAspectRatio(float f2) {
        this.o = f2;
        this.p = true;
    }

    public void setImageDrawable(Drawable drawable) {
        if (drawable != null) {
            this.c.setVisibility(0);
            this.c.setImageDrawable(drawable);
            return;
        }
        this.c.setVisibility(8);
    }

    public void setImageResource(int i) {
        if (i != 0) {
            this.c.setVisibility(0);
            this.c.setImageResource(i);
            return;
        }
        this.c.setVisibility(8);
    }

    public void setImageWidth(int i) {
        this.n = i;
    }

    public void setText(CharSequence charSequence) {
        this.b.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
        this.b.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0071: APUT  (r6v8 int[]), (0 ??[int, short, byte, char]), (16842836 int) */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EmptyView(android.content.Context r19, android.util.AttributeSet r20, int r21) {
        /*
        // Method dump skipped, instructions count: 339
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.paste.widgets.EmptyView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setTitle(int i) {
        this.a.setText(i);
    }

    public void setText(int i) {
        setText(getContext().getString(i));
    }
}

package com.spotify.android.glue.components.trackcloud;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import com.spotify.paste.widgets.internal.StateListAnimatorTextView;

class TrackCloudTextView extends StateListAnimatorTextView {
    private b a;

    public TrackCloudTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void j(b bVar) {
        this.a = bVar;
        setMaxLines(bVar.d());
        setText(bVar.e());
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        String a2 = this.a.a();
        int lineCount = getLineCount();
        int i5 = lineCount - 1;
        if (!TextUtils.isEmpty(a2) && lineCount > 0 && getLayout().getEllipsisCount(i5) > 0) {
            SpannableString b = b.b(getContext());
            SpannableString spannableString = new SpannableString(a2);
            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            int lineEnd = getLayout().getLineEnd(i5) - getLayout().getEllipsisCount(i5);
            int length = a2.length() + b.length();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
            int i6 = lineEnd - length;
            if (i6 >= 0) {
                spannableStringBuilder.delete(i6, spannableStringBuilder.length());
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.delete(this.a.c(length2), length2);
                spannableStringBuilder.append((CharSequence) b);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            setText(spannableStringBuilder);
        }
    }

    public TrackCloudTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        rud.a(this, context);
    }
}

package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

public class ExpandableEllipsizeTextView extends AppCompatTextView {
    private CharSequence a = "";
    private boolean b;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ExpandableEllipsizeTextView expandableEllipsizeTextView = ExpandableEllipsizeTextView.this;
            expandableEllipsizeTextView.setShouldExpandText(!expandableEllipsizeTextView.b);
            ExpandableEllipsizeTextView.this.l();
        }
    }

    public ExpandableEllipsizeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void l() {
        CharSequence charSequence = this.a;
        if (!this.b && !TextUtils.isEmpty(charSequence) && this.a.length() > 256) {
            charSequence = new SpannableStringBuilder(this.a, 0, 257).append((CharSequence) "...");
        }
        super.setText(charSequence, TextView.BufferType.SPANNABLE);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(new a());
    }

    public void setShouldExpandText(boolean z) {
        this.b = z;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.a = charSequence;
        l();
    }
}

package com.spotify.glue.dialogs;

import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.C0707R;

/* access modifiers changed from: package-private */
public class p implements e {
    private TextView a;
    private TextView b;
    private CharSequence c;
    private CharSequence d;

    p() {
    }

    @Override // com.spotify.glue.dialogs.e
    public void a() {
    }

    @Override // com.spotify.glue.dialogs.e
    public void b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(C0707R.layout.glue_dialog_content_title_body, viewGroup, true);
        this.a = (TextView) inflate.findViewById(C0707R.id.title);
        this.b = (TextView) inflate.findViewById(C0707R.id.body);
        if (!inflate.isInEditMode()) {
            vc0.h(this.a);
            vc0.i(this.b);
            vc0.g(inflate);
        }
        this.a.setText(this.c);
        this.b.setText(this.d, TextView.BufferType.SPANNABLE);
        this.b.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.spotify.glue.dialogs.e
    public int c() {
        return (int) Math.ceil((double) Math.abs(this.b.getPaint().getFontMetrics().descent));
    }

    public void d(CharSequence charSequence) {
        this.d = charSequence;
        TextView textView = this.b;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void e(CharSequence charSequence) {
        this.c = charSequence;
        TextView textView = this.a;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}

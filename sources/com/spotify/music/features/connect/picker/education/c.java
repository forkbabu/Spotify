package com.spotify.music.features.connect.picker.education;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;

public class c implements x90 {
    private final TextView a;
    private final TextView b;
    private final View c;

    public c(Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(C0707R.layout.glue_listtile_2, (ViewGroup) null);
        this.c = inflate;
        TextView textView = (TextView) inflate.findViewById(16908308);
        this.a = textView;
        TextView textView2 = (TextView) inflate.findViewById(16908309);
        this.b = textView2;
        if (!inflate.isInEditMode()) {
            vc0.h(textView);
            vc0.i(textView2);
            vc0.g(inflate);
        }
        inflate.setPadding(0, 12, 0, 12);
        androidx.core.widget.c.n(textView, R.style.TextAppearance_Encore_BalladBold);
        textView.setTextSize(2, 20.0f);
        textView2.setMaxLines(7);
        textView2.setTextSize(2, 18.0f);
        textView2.setGravity(1);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0707R.id.labels);
        linearLayout.setGravity(1);
        linearLayout.setHorizontalGravity(1);
    }

    @Override // defpackage.p90
    public View W1() {
        return null;
    }

    public void b() {
        bvd c2 = dvd.c(this.c.findViewById(C0707R.id.row_view));
        c2.g(this.a, this.b);
        c2.a();
    }

    @Override // defpackage.x90
    public void e(CharSequence charSequence) {
    }

    @Override // defpackage.x90
    public TextView getSubtitleView() {
        return this.b;
    }

    @Override // defpackage.x90
    public TextView getTitleView() {
        return this.a;
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.c;
    }

    @Override // defpackage.f90
    public void setActive(boolean z) {
    }

    @Override // com.spotify.paste.widgets.internal.c
    public void setAppearsDisabled(boolean z) {
    }

    @Override // defpackage.x90
    public void setSubtitle(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    @Override // defpackage.x90
    public void setTitle(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    @Override // defpackage.p90
    public void z0(View view) {
    }
}

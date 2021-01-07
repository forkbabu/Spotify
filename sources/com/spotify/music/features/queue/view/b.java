package com.spotify.music.features.queue.view;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.paste.widgets.internal.c;
import com.spotify.paste.widgets.layouts.PasteLinearLayout;

public class b extends RecyclerView.b0 implements a, c {
    private final ToggleButton C;
    private final TextView D;
    private final TextView E;
    private final PasteLinearLayout F;
    private final View G;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(android.content.Context r7, android.view.ViewGroup r8) {
        /*
            r6 = this;
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            r0 = 2131624773(0x7f0e0345, float:1.8876735E38)
            r1 = 0
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r6.<init>(r7)
            r8 = r7
            com.spotify.paste.widgets.layouts.PasteLinearLayout r8 = (com.spotify.paste.widgets.layouts.PasteLinearLayout) r8
            r6.F = r8
            r8 = 16908308(0x1020014, float:2.3877285E-38)
            android.view.View r7 = r7.findViewById(r8)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r6.D = r7
            android.view.View r8 = r6.a
            r0 = 16908309(0x1020015, float:2.3877288E-38)
            android.view.View r8 = r8.findViewById(r0)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r6.E = r8
            android.view.View r0 = r6.a
            r2 = 16908289(0x1020001, float:2.3877232E-38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.ToggleButton r0 = (android.widget.ToggleButton) r0
            r6.C = r0
            android.view.View r2 = r6.a
            r3 = 2131428240(0x7f0b0390, float:1.8478119E38)
            android.view.View r2 = r2.findViewById(r3)
            r6.G = r2
            android.graphics.drawable.Drawable r3 = r0.getBackground()
            r3.mutate()
            android.view.View r3 = r6.a
            bvd r3 = defpackage.dvd.c(r3)
            r4 = 2
            android.view.View[] r5 = new android.view.View[r4]
            r5[r1] = r0
            r0 = 1
            r5[r0] = r2
            r3.f(r5)
            android.view.View[] r2 = new android.view.View[r4]
            r2[r1] = r7
            r2[r0] = r8
            r3.g(r2)
            r3.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.queue.view.b.<init>(android.content.Context, android.view.ViewGroup):void");
    }

    public TextView getSubtitleView() {
        return this.E;
    }

    public View h0() {
        return this.G;
    }

    public void j0() {
        nud.p(this.D.getContext(), this.D, C0707R.attr.pasteTextAppearanceMuted);
        nud.p(this.E.getContext(), this.E, C0707R.attr.pasteTextAppearanceSecondaryMuted);
    }

    public void l0(boolean z) {
        this.C.setChecked(z);
    }

    @Override // com.spotify.music.features.queue.view.a
    public void m() {
        this.a.setBackgroundResource(R.color.white_0);
    }

    public void m0(boolean z) {
        this.C.setEnabled(z);
        this.C.setFocusable(z);
    }

    @Override // com.spotify.music.features.queue.view.a
    public void o() {
        this.a.setBackgroundResource(C0707R.color.cat_grayscale_15_40);
    }

    public void s0(boolean z) {
        this.G.setVisibility(z ? 0 : 8);
    }

    @Override // com.spotify.paste.widgets.internal.c
    public void setAppearsDisabled(boolean z) {
        this.F.setAppearsDisabled(z);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.E.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.D.setText(charSequence);
    }

    public void u0(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.C.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public void v0() {
        nud.p(this.D.getContext(), this.D, C0707R.attr.pasteTextAppearance);
        nud.p(this.E.getContext(), this.E, C0707R.attr.pasteTextAppearanceSecondary);
    }
}

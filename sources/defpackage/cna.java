package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: cna  reason: default package */
public class cna implements zma {
    private final y90 a;
    private final TextView b;
    private final View c;

    public cna(View view, y90 y90, TextView textView) {
        this.a = y90;
        this.c = view;
        this.b = textView;
    }

    @Override // defpackage.p90
    public View W1() {
        return this.a.W1();
    }

    @Override // defpackage.zma
    public void d2() {
        this.b.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @Override // defpackage.x90
    public void e(CharSequence charSequence) {
        this.a.e(charSequence);
    }

    @Override // defpackage.fa0
    public ImageView getImageView() {
        return this.a.getImageView();
    }

    @Override // defpackage.x90
    public TextView getSubtitleView() {
        return this.a.getSubtitleView();
    }

    @Override // defpackage.x90
    public TextView getTitleView() {
        return this.a.getTitleView();
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.c;
    }

    @Override // defpackage.zma
    public TextView k() {
        return this.b;
    }

    @Override // defpackage.zma
    public void k1(Drawable drawable) {
        this.b.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, drawable);
    }

    @Override // defpackage.zma
    public void r() {
        this.b.setVisibility(8);
    }

    @Override // defpackage.zma
    public void s(int i) {
        this.b.setVisibility(0);
        this.b.setText(String.valueOf(i));
    }

    @Override // defpackage.f90
    public void setActive(boolean z) {
        this.a.setActive(z);
    }

    @Override // com.spotify.paste.widgets.internal.c
    public void setAppearsDisabled(boolean z) {
        this.a.setAppearsDisabled(z);
    }

    @Override // defpackage.x90
    public void setSubtitle(CharSequence charSequence) {
        this.a.setSubtitle(charSequence);
    }

    @Override // defpackage.x90
    public void setTitle(CharSequence charSequence) {
        this.a.setTitle(charSequence);
    }

    @Override // defpackage.p90
    public void z0(View view) {
        this.a.z0(view);
    }
}

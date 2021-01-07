package com.spotify.music.freetiercommon.uicomponents;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.freetiercommon.uicomponents.Rows;

/* access modifiers changed from: package-private */
public final class c implements Rows.g {
    final /* synthetic */ y90 a;
    final /* synthetic */ Rows.RoundedLinearLayout b;

    c(y90 y90, Rows.RoundedLinearLayout roundedLinearLayout) {
        this.a = y90;
        this.b = roundedLinearLayout;
    }

    @Override // defpackage.p90
    public View W1() {
        return this.a.W1();
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
        return this.b;
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

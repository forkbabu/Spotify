package com.spotify.music.playlist.ui.row;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* access modifiers changed from: package-private */
public final class c implements u90 {
    private final u90 a;
    private final View b;

    c(u90 u90, View view) {
        this.a = u90;
        this.b = view;
    }

    @Override // defpackage.p90
    public View W1() {
        return this.a.W1();
    }

    @Override // defpackage.t90
    public TextView Z() {
        return this.a.Z();
    }

    @Override // defpackage.p90
    public void g1(boolean z) {
        this.a.g1(z);
    }

    @Override // defpackage.fa0
    public ImageView getImageView() {
        return this.a.getImageView();
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

    @Override // defpackage.t90
    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    @Override // defpackage.p90
    public void z0(View view) {
        this.a.z0(view);
    }
}

package com.spotify.music.playlist.ui.row;

import android.view.View;
import android.widget.TextView;

/* access modifiers changed from: package-private */
public class b implements r90 {
    private final r90 a;
    private final View b;

    b(r90 r90, View view) {
        this.a = r90;
        this.b = view;
    }

    @Override // defpackage.r90
    public void I(int i) {
        this.a.I(i);
    }

    @Override // defpackage.p90
    public View W1() {
        return this.a.W1();
    }

    @Override // defpackage.t90
    public TextView Z() {
        return this.a.Z();
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

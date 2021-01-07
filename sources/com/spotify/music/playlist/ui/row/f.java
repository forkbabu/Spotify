package com.spotify.music.playlist.ui.row;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.playlist.ui.e0;
import java.util.List;

/* access modifiers changed from: package-private */
public class f implements e {
    private final y90 a;
    private final e0 b;

    f(y90 y90, e0 e0Var) {
        this.a = y90;
        this.b = e0Var;
    }

    @Override // defpackage.p90
    public View W1() {
        return this.b.a();
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
        return this.a.getView();
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

    @Override // com.spotify.music.playlist.ui.row.a
    public void z(List<View> list) {
        this.b.d(list);
        this.b.e();
    }

    @Override // defpackage.p90
    public void z0(View view) {
        this.b.c(view);
    }
}

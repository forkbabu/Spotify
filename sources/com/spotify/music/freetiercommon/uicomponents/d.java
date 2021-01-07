package com.spotify.music.freetiercommon.uicomponents;

import android.view.View;
import android.widget.TextView;
import com.google.common.collect.ImmutableList;
import com.spotify.music.freetiercommon.uicomponents.Rows;
import java.util.List;

/* access modifiers changed from: package-private */
public final class d implements Rows.i {
    final /* synthetic */ x90 a;
    final /* synthetic */ b b;

    d(x90 x90, b bVar) {
        this.a = x90;
        this.b = bVar;
    }

    @Override // defpackage.p90
    public View W1() {
        return this.b.a();
    }

    @Override // defpackage.x90
    public void e(CharSequence charSequence) {
        this.a.e(charSequence);
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

    @Override // com.spotify.music.freetiercommon.uicomponents.Rows.d
    public void z(List<View> list) {
        this.b.c(list);
        this.b.d();
    }

    @Override // defpackage.p90
    public void z0(View view) {
        b bVar = this.b;
        bVar.getClass();
        bVar.c(ImmutableList.of(view));
    }
}

package defpackage;

import android.view.View;
import android.widget.TextView;
import defpackage.kz9;

/* access modifiers changed from: package-private */
/* renamed from: jz9  reason: default package */
public final class jz9 implements kz9.a {
    final /* synthetic */ qa0 a;

    jz9(qa0 qa0) {
        this.a = qa0;
    }

    @Override // defpackage.ia0
    public View B2() {
        return this.a.B2();
    }

    @Override // defpackage.ia0
    public void S(boolean z) {
        this.a.S(z);
    }

    @Override // defpackage.ia0
    public void V1(boolean z) {
        this.a.V1(z);
    }

    @Override // defpackage.ia0
    public void c1(String str) {
        this.a.c1(str);
    }

    @Override // defpackage.qa0
    public TextView getSubtitleView() {
        return this.a.getSubtitleView();
    }

    @Override // defpackage.ia0
    public TextView getTitleView() {
        return this.a.getTitleView();
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a.getView();
    }

    @Override // defpackage.ia0
    public void i1(boolean z) {
        this.a.i1(z);
    }

    @Override // defpackage.ia0
    public void q1(CharSequence charSequence) {
        this.a.q1(charSequence);
    }

    @Override // defpackage.qa0
    public void setSubtitle(CharSequence charSequence) {
        this.a.setSubtitle(charSequence);
    }

    @Override // defpackage.ia0
    public void setTitle(CharSequence charSequence) {
        this.a.setTitle(charSequence);
    }
}

package defpackage;

import android.content.Context;
import android.view.View;

/* renamed from: bk8  reason: default package */
public abstract class bk8 implements hk8 {
    private final View a;
    private final Context b;
    protected x90 c;
    private View.OnClickListener f;

    public bk8(View view, x90 x90) {
        this.a = view;
        this.b = view.getContext();
        this.c = x90;
        x90.getSubtitleView().setEllipsize(null);
        this.c.getSubtitleView().setSingleLine(false);
    }

    @Override // defpackage.hk8
    public void B0(CharSequence charSequence) {
        this.c.setSubtitle(charSequence);
    }

    @Override // defpackage.hk8
    public void Y1() {
        View.OnClickListener onClickListener = this.f;
        if (onClickListener != null) {
            onClickListener.onClick(this.a);
        }
    }

    public Context b() {
        return this.b;
    }

    @Override // defpackage.hk8, com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }

    @Override // defpackage.hk8
    public void setEnabled(boolean z) {
        this.a.setEnabled(z);
    }

    @Override // defpackage.hk8
    public void setId(int i) {
        this.a.setId(i);
    }

    @Override // defpackage.hk8
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f = onClickListener;
    }

    @Override // defpackage.hk8
    public void setTitle(String str) {
        this.c.setTitle(str);
    }
}

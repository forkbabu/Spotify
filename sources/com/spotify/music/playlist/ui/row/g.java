package com.spotify.music.playlist.ui.row;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.transition.Fade;
import androidx.transition.Slide;
import androidx.transition.TransitionSet;
import androidx.transition.u;

/* access modifiers changed from: package-private */
public class g implements h {
    private final y90 a;
    private final RelativeLayout b;
    private final RelativeLayout c;
    private final TextView f;

    g(y90 y90, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, TextView textView) {
        this.a = y90;
        this.b = relativeLayout;
        this.c = relativeLayout2;
        this.f = textView;
    }

    @Override // com.spotify.music.playlist.ui.row.h
    public void G1() {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.g0(400);
        Slide slide = new Slide(48);
        slide.d(this.b);
        transitionSet.c0(slide);
        Fade fade = new Fade(1);
        fade.d(this.b);
        transitionSet.c0(fade);
        u.a(this.c, transitionSet);
        this.b.setVisibility(0);
    }

    @Override // com.spotify.music.playlist.ui.row.h
    public void T0(String str) {
        this.f.setText(str);
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
        return this.c;
    }

    @Override // com.spotify.music.playlist.ui.row.h
    public void o0(View.OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
    }

    @Override // com.spotify.music.playlist.ui.row.h
    public void p0() {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.g0(400);
        Slide slide = new Slide(48);
        slide.d(this.b);
        transitionSet.c0(slide);
        Fade fade = new Fade(2);
        fade.d(this.b);
        transitionSet.c0(fade);
        u.a(this.c, transitionSet);
        this.b.setVisibility(8);
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

package com.spotify.voice.experience;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.spotify.music.C0707R;

public final /* synthetic */ class c implements m4 {
    public final /* synthetic */ VoiceFragment a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ViewPager2 c;

    public /* synthetic */ c(VoiceFragment voiceFragment, View view, ViewPager2 viewPager2) {
        this.a = voiceFragment;
        this.b = view;
        this.c = viewPager2;
    }

    @Override // defpackage.m4
    public final b5 onApplyWindowInsets(View view, b5 b5Var) {
        int i;
        int i2;
        int i3;
        VoiceFragment voiceFragment = this.a;
        View view2 = this.b;
        ViewPager2 viewPager2 = this.c;
        voiceFragment.getClass();
        view2.setPadding(0, b5Var.j(), 0, 0);
        View[] viewArr = {q4.G(view2, C0707R.id.floating_action_button), q4.G(view2, 16908313), q4.G(view2, C0707R.id.listeningView), q4.G(view2, 16908294)};
        for (int i4 = 0; i4 < 4; i4++) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewArr[i4].getLayoutParams();
            marginLayoutParams.bottomMargin = b5Var.g() + marginLayoutParams.bottomMargin;
            marginLayoutParams.rightMargin = b5Var.i() + marginLayoutParams.rightMargin;
            marginLayoutParams.leftMargin = b5Var.h() + marginLayoutParams.leftMargin;
        }
        View[] viewArr2 = {q4.G(view2, C0707R.id.title), q4.G(view2, C0707R.id.description)};
        for (int i5 = 0; i5 < 2; i5++) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) viewArr2[i5].getLayoutParams();
            marginLayoutParams2.rightMargin = b5Var.i() + marginLayoutParams2.rightMargin;
            marginLayoutParams2.leftMargin = b5Var.h() + marginLayoutParams2.leftMargin;
        }
        int dimensionPixelSize = voiceFragment.R2().getDimensionPixelSize(C0707R.dimen.list_padding);
        if (b5Var.h() == 0) {
            i = dimensionPixelSize;
        } else {
            i = b5Var.h() + dimensionPixelSize;
        }
        if (b5Var.i() == 0) {
            i2 = dimensionPixelSize;
        } else {
            i2 = b5Var.i() + dimensionPixelSize;
        }
        if (b5Var.g() == 0) {
            i3 = dimensionPixelSize;
        } else {
            i3 = b5Var.g();
        }
        viewPager2.setPadding(i, dimensionPixelSize, i2, i3);
        q4.P(view2, null);
        return b5Var.c();
    }
}

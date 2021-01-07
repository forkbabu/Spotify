package com.spotify.music.features.login.startview;

import android.widget.TextView;
import androidx.lifecycle.v;
import com.spotify.music.C0707R;
import defpackage.be0;
import defpackage.ce0;
import defpackage.je0;

public final /* synthetic */ class i implements v {
    public final /* synthetic */ WelcomeBackFragment a;
    public final /* synthetic */ TextView b;
    public final /* synthetic */ TextView c;
    public final /* synthetic */ TextView d;

    public /* synthetic */ i(WelcomeBackFragment welcomeBackFragment, TextView textView, TextView textView2, TextView textView3) {
        this.a = welcomeBackFragment;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
    }

    @Override // androidx.lifecycle.v
    public final void a(Object obj) {
        WelcomeBackFragment welcomeBackFragment = this.a;
        TextView textView = this.b;
        TextView textView2 = this.c;
        TextView textView3 = this.d;
        f70 f70 = (f70) obj;
        welcomeBackFragment.getClass();
        textView.setText(welcomeBackFragment.W2(C0707R.string.remember_me_welcome_back, f70.b()));
        if ("facebook".equals(f70.a())) {
            welcomeBackFragment.j0.a(new ce0.p(je0.p.b, be0.a.b));
            textView2.setVisibility(0);
            textView3.setVisibility(8);
            return;
        }
        textView2.setVisibility(8);
        textView3.setVisibility(0);
    }
}

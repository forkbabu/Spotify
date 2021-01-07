package com.spotify.music.features.login.startview;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.g0;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.loginflow.navigation.d;
import com.spotify.music.C0707R;
import dagger.android.support.a;
import defpackage.ce0;
import defpackage.je0;

public class WelcomeBackFragment extends LifecycleListenableFragment {
    ajf<g70> h0;
    d i0;
    ae0 j0;

    @Override // androidx.fragment.app.Fragment
    public void m3(Bundle bundle) {
        super.m3(bundle);
        u uVar = (u) new g0(this).a(u.class);
        if (bundle == null) {
            this.j0.a(new ce0.k(je0.p.b));
            uVar.h(this.h0.get());
            uVar.k();
        }
        TextView textView = (TextView) m4().findViewById(C0707R.id.button_log_in);
        TextView textView2 = (TextView) m4().findViewById(C0707R.id.button_facebook);
        textView.setOnClickListener(new g(this, uVar));
        textView2.setOnClickListener(new d(this));
        ((TextView) m4().findViewById(C0707R.id.button_switch_account)).setOnClickListener(new h(this, uVar));
        uVar.g().h(b3(), new i(this, (TextView) m4().findViewById(C0707R.id.value_proposition_textview), textView2, textView));
        uVar.m().h(b3(), new f(this));
        uVar.n().h(b3(), new e(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        a.a(this);
        super.p3(context);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C0707R.layout.fragment_welcome_back, viewGroup, false);
    }
}

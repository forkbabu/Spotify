package com.spotify.music.homething.addnewdevice.wifi.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.google.common.base.MoreObjects;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import defpackage.ks9;

public class HomethingWifiFragment extends LifecycleListenableFragment implements s, ks9 {
    ks9.a h0;
    as9 i0;
    private EditText j0;
    private EditText k0;
    private View l0;

    class a extends l62 {
        a() {
        }

        @Override // defpackage.l62, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            HomethingWifiFragment.this.h0.b(editable.toString());
        }
    }

    class b extends l62 {
        final /* synthetic */ View a;

        b(View view) {
            this.a = view;
        }

        @Override // defpackage.l62, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            HomethingWifiFragment.this.h0.e(editable.toString());
            this.a.setEnabled(!MoreObjects.isNullOrEmpty(editable.toString()));
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "Home Thing";
    }

    public void K4() {
        this.i0.b(this, F2().getString(C0707R.string.rationale_location_wifi), 4295);
    }

    public void L4(String str) {
        this.k0.setText(str);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        this.h0.c(this);
    }

    public void M4(String str) {
        this.j0.setText(str);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        super.Q3(view, bundle);
        View findViewById = view.findViewById(C0707R.id.button_next);
        findViewById.setOnClickListener(new a(this));
        EditText editText = (EditText) view.findViewById(C0707R.id.wifi_password);
        this.k0 = editText;
        editText.addTextChangedListener(new a());
        EditText editText2 = (EditText) view.findViewById(C0707R.id.wifi_name);
        this.j0 = editText2;
        editText2.addTextChangedListener(new b(findViewById));
        if (!ns9.h()) {
            View findViewById2 = view.findViewById(C0707R.id.use_current_network);
            this.l0 = findViewById2;
            findViewById2.setVisibility(0);
            this.l0.setOnClickListener(new b(this));
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "homething-fragment";
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void n3(int i, int i2, Intent intent) {
        super.n3(i, i2, intent);
        if (i == 4295 && i2 == -1) {
            this.h0.d();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.HOMETHING_ACTIVATION_WIFI, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C0707R.layout.homething_wifi_fragment, viewGroup, false);
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.r0;
    }
}

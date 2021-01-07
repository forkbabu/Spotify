package com.spotify.music.features.languagepicker.view;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.f;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.music.features.languagepicker.presenter.h;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;

public class NoSkipDialog extends DialogFragment implements km5, c.a, s, mfd, DialogInterface.OnClickListener {
    h u0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "";
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.u0.c(this);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        this.u0.d();
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog R4(Bundle bundle) {
        Context l4 = l4();
        View inflate = LayoutInflater.from(l4).inflate(C0707R.layout.fragment_language_picker_no_skip_dialog, (ViewGroup) null);
        f.a aVar = new f.a(l4, C0707R.style.res_2132083498_theme_glue_dialog);
        aVar.o(inflate);
        aVar.k(C0707R.string.skip_dialog_continue, this);
        f a = aVar.a();
        this.u0.a();
        return a;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.LANGUAGEPICKER_NOSKIPDIALOG;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.W;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return kfd.K.getName();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            this.u0.b();
            return;
        }
        throw new IllegalArgumentException("Unsupported dialog button");
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        T4(false);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.LANGUAGEPICKER_NOSKIPDIALOG, ViewUris.W.toString());
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.K;
    }
}

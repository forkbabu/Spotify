package com.spotify.music.features.tasteonboarding.skip.view;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.f;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import me.grantland.widget.a;

public class SkipDialog extends DialogFragment implements qq8, c.a, s, mfd, DialogInterface.OnClickListener {
    pq8 u0;
    f v0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "";
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        ((tq8) this.u0).H2(this);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        ((tq8) this.u0).I2();
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog R4(Bundle bundle) {
        Context l4 = l4();
        View inflate = LayoutInflater.from(l4).inflate(C0707R.layout.fragment_free_tier_taste_onboarding_skip_dialog, (ViewGroup) null);
        a.d((TextView) inflate.findViewById(16908313));
        f.a aVar = new f.a(l4, C0707R.style.res_2132083498_theme_glue_dialog);
        aVar.o(inflate);
        aVar.k(C0707R.string.free_tier_taste_onboarding_skip_dialog_skip, this);
        aVar.h(C0707R.string.free_tier_taste_onboarding_skip_dialog_continue, this);
        this.v0 = aVar.a();
        ((tq8) this.u0).F2();
        return this.v0;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // defpackage.mfd
    public com.spotify.instrumentation.a g1() {
        return PageIdentifiers.FREETIER_TASTEONBOARDING_SKIPDIALOG;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.Q;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return kfd.k0.getName();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -2) {
            ((tq8) this.u0).E2();
        } else if (i == -1) {
            ((tq8) this.u0).G2();
        } else {
            throw new IllegalArgumentException("Unsupported dialog button");
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.FREETIER_TASTEONBOARDING_SKIPDIALOG, ViewUris.Q.toString());
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.k0;
    }
}

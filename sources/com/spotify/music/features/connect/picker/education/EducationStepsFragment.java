package com.spotify.music.features.connect.picker.education;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.c;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.C0707R;
import com.spotify.music.features.connect.dialogs.g;
import com.spotify.music.features.connect.picker.ui.DevicePickerActivity;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import dagger.android.support.a;
import defpackage.zn4;
import java.util.List;

public class EducationStepsFragment extends LifecycleListenableFragment implements g {
    private ImageView h0;
    private TextView i0;
    private ViewGroup j0;
    private zn4 k0;
    e l0;
    oba m0;
    co4 n0;

    public void K4(View view) {
        String c = this.k0.c();
        if (c == null) {
            return;
        }
        if (c.startsWith("http")) {
            c B2 = B2();
            if (B2 != null) {
                this.n0.a(B2, c);
                return;
            }
            return;
        }
        Intent intent = new Intent();
        intent.setAction(c);
        H4(intent, 100, null);
    }

    public void L4(View view) {
        this.m0.a("validation-button", InteractionIntent.VALIDATE, g.a(this.k0), g.b(this.k0));
        c B2 = B2();
        if (B2 != null) {
            B2.onBackPressed();
        }
    }

    @Override // com.spotify.music.features.connect.picker.education.g
    public void N0() {
        zn4 zn4 = this.k0;
        c B2 = B2();
        if ((B2 instanceof DevicePickerActivity) && zn4 != null) {
            ((DevicePickerActivity) B2).X0(((PageIdentifiers) g.a(zn4)).path(), g.b(zn4).toString());
        }
    }

    @Override // com.spotify.music.features.connect.picker.education.g
    public void P1() {
        this.i0.setVisibility(8);
    }

    @Override // com.spotify.music.features.connect.picker.education.g
    public View V0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(C0707R.layout.fragment_connect_education_steps, viewGroup, false);
        this.j0 = (ViewGroup) inflate.findViewById(C0707R.id.steps_list);
        this.h0 = (ImageView) inflate.findViewById(C0707R.id.steps_icon);
        TextView textView = (TextView) inflate.findViewById(C0707R.id.steps_additional);
        this.i0 = textView;
        textView.setOnClickListener(new b(this));
        inflate.findViewById(C0707R.id.steps_got_it).setOnClickListener(new a(this));
        return inflate;
    }

    @Override // com.spotify.music.features.connect.picker.education.g
    public void k1(zn4 zn4) {
        int b = zn4.b();
        Context F2 = F2();
        if (b != 0 || F2 == null) {
            this.h0.setImageResource(b);
            return;
        }
        this.h0.setImageDrawable(new SpotifyIconDrawable(F2, this.k0.f(), (float) F2.getResources().getDimensionPixelSize(C0707R.dimen.connect_education_icon_size)));
    }

    @Override // com.spotify.music.features.connect.picker.education.g
    public void o1(String str) {
        this.i0.setText(str);
        this.i0.setVisibility(0);
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        a.a(this);
        super.p3(context);
    }

    @Override // com.spotify.music.features.connect.picker.education.g
    public void v0(List<zn4.b> list) {
        for (zn4.b bVar : list) {
            c cVar = new c(F2(), null);
            cVar.b();
            cVar.getTitleView().setText(bVar.b());
            cVar.getSubtitleView().setTransformationMethod(null);
            cVar.getSubtitleView().setText(bVar.a());
            this.j0.addView(cVar.getView());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle D2 = D2();
        if (D2 != null) {
            this.k0 = (zn4) D2.getParcelable("tag_education_item");
        }
        zn4 zn4 = this.k0;
        if (zn4 != null) {
            return this.l0.a(layoutInflater, viewGroup, zn4);
        }
        throw new RuntimeException("EducationItem expected");
    }
}

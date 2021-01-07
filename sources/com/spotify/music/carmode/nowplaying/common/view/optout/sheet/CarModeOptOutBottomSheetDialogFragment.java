package com.spotify.music.carmode.nowplaying.common.view.optout.sheet;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.bottomsheet.c;
import com.spotify.music.C0707R;
import com.spotify.music.carmode.nowplaying.common.view.optout.sheet.g;
import dagger.android.support.a;

public class CarModeOptOutBottomSheetDialogFragment extends BottomSheetDialogFragment implements g {
    public static final /* synthetic */ int y0 = 0;
    f v0;
    private TextView w0;
    private g.a x0;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.v0.c(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        view.findViewById(C0707R.id.exit_car_mode_button).setOnClickListener(new b(this));
        view.findViewById(C0707R.id.cancel_button).setOnClickListener(new c(this));
        this.w0 = (TextView) view.findViewById(C0707R.id.leave_car_mode_title);
    }

    public /* synthetic */ void b5(View view) {
        ((f) this.x0).b();
    }

    public /* synthetic */ void c5(View view) {
        ((f) this.x0).a();
    }

    public void d5(g.a aVar) {
        this.x0 = aVar;
    }

    public void e5(int i) {
        this.w0.setText(i);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void m3(Bundle bundle) {
        super.m3(bundle);
        View view = (View) a3().getParent();
        view.setBackground(null);
        BottomSheetBehavior o = BottomSheetBehavior.o(view);
        o.v(0);
        P4().setOnShowListener(new a(o));
        o.i(new d(this, o));
        ((c) P4()).g(true);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void p3(Context context) {
        a.a(this);
        super.p3(context);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C0707R.layout.car_mode_opt_out_bottom_sheet, viewGroup, false);
    }
}

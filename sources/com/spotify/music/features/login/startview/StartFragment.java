package com.spotify.music.features.login.startview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.transition.ChangeBounds;
import androidx.transition.Fade;
import androidx.transition.TransitionSet;
import androidx.transition.u;
import com.google.common.base.Optional;
import com.spotify.effortlesslogin.EffortlessLoginBottomSheetDialog;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButton;
import com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButtonConfiguration;
import com.spotify.libs.pse.model.a;
import com.spotify.libs.pse.model.b;
import com.spotify.music.C0707R;
import com.spotify.music.features.login.startview.cta.d;
import defpackage.fo5;
import java.util.List;
import kotlin.f;

public class StartFragment extends Fragment implements fo5 {
    public static final /* synthetic */ int u0 = 0;
    d g0;
    q h0;
    a i0;
    boolean j0;
    boolean k0;
    Optional<Intent> l0;
    ComponentFactory<AuthenticationButton, AuthenticationButtonConfiguration> m0;
    EffortlessLoginBottomSheetDialog.a n0;
    fo5.a o0;
    private ViewGroup p0;
    private ViewGroup q0;
    private ImageView r0;
    private View s0;
    private boolean t0;

    private void N4(List<sn5> list, int i) {
        boolean z;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = (int) R2().getDimension(C0707R.dimen.start_screen_auth_button_margin_height);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = (int) R2().getDimension(C0707R.dimen.start_screen_auth_button_margin_height);
        layoutParams2.bottomMargin = (int) R2().getDimension(C0707R.dimen.start_fragment_bottom_guideline);
        if (i == -1 || i >= list.size()) {
            i = list.size();
            z = false;
        } else {
            z = true;
        }
        if (z) {
            i--;
        }
        for (int i2 = 0; i2 < i; i2++) {
            sn5 sn5 = list.get(i2);
            AuthenticationButton make = this.m0.make();
            View view = make.getView();
            make.render(sn5.a());
            make.onEvent(sn5.b());
            if (z || i2 != i - 1) {
                view.setLayoutParams(layoutParams);
            } else {
                view.setLayoutParams(layoutParams2);
            }
            q4.T(view, sn5.a().getType().name() + i2);
            this.q0.addView(view);
        }
        if (z) {
            AuthenticationButton make2 = this.m0.make();
            AuthenticationButton.AuthenticationType authenticationType = AuthenticationButton.AuthenticationType.MORE_OPTIONS;
            make2.render(new AuthenticationButton.Model(authenticationType, false));
            make2.onEvent(new a(this, make2, list));
            View view2 = make2.getView();
            view2.setLayoutParams(layoutParams2);
            q4.T(view2, authenticationType.name());
            this.q0.addView(view2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        j4().setTitle(C0707R.string.start_login_page_title);
    }

    public f M4(AuthenticationButton authenticationButton, List list, AuthenticationButton.Events events) {
        ViewGroup viewGroup = this.q0;
        this.t0 = true;
        TransitionSet transitionSet = new TransitionSet();
        Fade fade = new Fade();
        fade.T(350);
        fade.v(authenticationButton.getView(), true);
        fade.V(new AccelerateInterpolator());
        transitionSet.c0(fade);
        Fade fade2 = new Fade();
        fade2.T(150);
        fade2.d(authenticationButton.getView());
        fade2.V(new x5());
        transitionSet.c0(fade2);
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.T(350);
        changeBounds.V(new z5());
        transitionSet.c0(changeBounds);
        u.a((ViewGroup) viewGroup.getParent(), transitionSet);
        for (int childCount = viewGroup.getChildCount() - 2; childCount >= 0; childCount--) {
            viewGroup.removeViewAt(childCount);
        }
        authenticationButton.getView().setVisibility(8);
        N4(list, -1);
        this.o0.e0();
        return f.a;
    }

    @Override // androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        bundle.putBoolean("state_showing_all_options", this.t0);
    }

    @Override // androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        if (this.j0) {
            view.findViewById(C0707R.id.spotify_logo_no_text).setOnLongClickListener(new b(this));
        }
        if (this.k0) {
            ((TextView) view.findViewById(C0707R.id.value_proposition_textview)).setText(C0707R.string.korea_login_value_prop_millions_of_songs_free);
        }
    }

    @Override // defpackage.fo5
    public void R1(String str) {
        if (e3()) {
            EffortlessLoginBottomSheetDialog.c5(Q2(), str, this.n0);
        }
    }

    @Override // defpackage.fo5
    public int l() {
        return R2().getConfiguration().orientation;
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        if (bundle != null) {
            this.t0 = bundle.getBoolean("state_showing_all_options", false);
            EffortlessLoginBottomSheetDialog.b5(E2(), this.n0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C0707R.layout.fragment_start_sthlm_black, viewGroup, false);
        this.p0 = (ViewGroup) inflate.findViewById(C0707R.id.relativeLayout);
        this.q0 = (ViewGroup) inflate.findViewById(C0707R.id.buttons_container);
        this.r0 = (ImageView) inflate.findViewById(C0707R.id.backgroundImage);
        this.s0 = inflate.findViewById(C0707R.id.gradient);
        a aVar = this.i0;
        View findViewById = this.p0.findViewById(C0707R.id.subtitle);
        if (aVar instanceof a.b) {
            findViewById.setVisibility(0);
        } else {
            findViewById.setVisibility(8);
        }
        int i = -1;
        if (!this.t0 && (aVar.b() instanceof b.a)) {
            i = ((b.a) aVar.b()).a();
        }
        N4(this.g0.a(aVar), i);
        if (this.h0.b(R2().getConfiguration().orientation)) {
            this.r0.getViewTreeObserver().addOnGlobalLayoutListener(new m(this));
        }
        return inflate;
    }
}

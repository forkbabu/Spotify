package com.spotify.music.superbird.setup.steps.connecttocar;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.superbird.setup.SetupView;
import com.spotify.music.superbird.setup.m;
import dagger.android.support.DaggerFragment;
import kotlin.jvm.internal.h;

public final class ConnectToCarFragment extends DaggerFragment implements s {
    public m h0;
    private View i0;
    private View j0;
    private ImageView k0;
    private View l0;
    private View m0;
    private ImageView n0;
    private SetupView o0;

    /* compiled from: java-style lambda group */
    static final class a implements View.OnClickListener {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;

        public a(int i, Object obj) {
            this.a = i;
            this.b = obj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = this.a;
            if (i == 0) {
                ConnectToCarFragment.L4((ConnectToCarFragment) this.b);
            } else if (i == 1) {
                ConnectToCarFragment.K4((ConnectToCarFragment) this.b);
            } else {
                throw null;
            }
        }
    }

    public ConnectToCarFragment() {
        super(C0707R.layout.fragment_connect_to_car);
    }

    public static final void K4(ConnectToCarFragment connectToCarFragment) {
        ImageView imageView = connectToCarFragment.k0;
        if (imageView != null) {
            imageView.setImageResource(C0707R.drawable.ic_empty_checkmark);
            View view = connectToCarFragment.j0;
            if (view != null) {
                view.setVisibility(8);
                ImageView imageView2 = connectToCarFragment.n0;
                if (imageView2 != null) {
                    imageView2.setImageResource(C0707R.drawable.ic_filled_checkmark);
                    View view2 = connectToCarFragment.m0;
                    if (view2 != null) {
                        view2.setVisibility(0);
                        SetupView setupView = connectToCarFragment.o0;
                        if (setupView != null) {
                            setupView.setButtonEnabled(true);
                        } else {
                            h.k("setupView");
                            throw null;
                        }
                    } else {
                        h.k("auxVerificationContainer");
                        throw null;
                    }
                } else {
                    h.k("auxCheckmark");
                    throw null;
                }
            } else {
                h.k("bluetoothVerificationContainer");
                throw null;
            }
        } else {
            h.k("bluetoothCheckmark");
            throw null;
        }
    }

    public static final void L4(ConnectToCarFragment connectToCarFragment) {
        ImageView imageView = connectToCarFragment.n0;
        if (imageView != null) {
            imageView.setImageResource(C0707R.drawable.ic_empty_checkmark);
            View view = connectToCarFragment.m0;
            if (view != null) {
                view.setVisibility(8);
                ImageView imageView2 = connectToCarFragment.k0;
                if (imageView2 != null) {
                    imageView2.setImageResource(C0707R.drawable.ic_filled_checkmark);
                    View view2 = connectToCarFragment.j0;
                    if (view2 != null) {
                        view2.setVisibility(0);
                        SetupView setupView = connectToCarFragment.o0;
                        if (setupView != null) {
                            setupView.setButtonEnabled(true);
                        } else {
                            h.k("setupView");
                            throw null;
                        }
                    } else {
                        h.k("bluetoothVerificationContainer");
                        throw null;
                    }
                } else {
                    h.k("bluetoothCheckmark");
                    throw null;
                }
            } else {
                h.k("auxVerificationContainer");
                throw null;
            }
        } else {
            h.k("auxCheckmark");
            throw null;
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        h.e(context, "context");
        return "";
    }

    @Override // androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        h.e(view, "view");
        SetupView setupView = (SetupView) view.findViewById(C0707R.id.connect_car_setup_view);
        h.d(setupView, "this");
        this.o0 = setupView;
        setupView.setOnButtonClick(new ConnectToCarFragment$onViewCreated$$inlined$apply$lambda$1(this));
        setupView.setOnCloseClick(new ConnectToCarFragment$onViewCreated$$inlined$apply$lambda$2(this));
        View findViewById = view.findViewById(C0707R.id.bluetooth_container);
        h.d(findViewById, "view.findViewById(R.id.bluetooth_container)");
        this.i0 = findViewById;
        View findViewById2 = view.findViewById(C0707R.id.bluetooth_checkmark);
        h.d(findViewById2, "view.findViewById(R.id.bluetooth_checkmark)");
        this.k0 = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(C0707R.id.bluetooth_description);
        h.d(findViewById3, "view.findViewById(R.id.bluetooth_description)");
        this.j0 = findViewById3;
        View view2 = this.i0;
        if (view2 != null) {
            view2.setOnClickListener(new a(0, this));
            View findViewById4 = view.findViewById(C0707R.id.aux_container);
            h.d(findViewById4, "view.findViewById(R.id.aux_container)");
            this.l0 = findViewById4;
            View findViewById5 = view.findViewById(C0707R.id.aux_checkmark);
            h.d(findViewById5, "view.findViewById(R.id.aux_checkmark)");
            this.n0 = (ImageView) findViewById5;
            View findViewById6 = view.findViewById(C0707R.id.aux_description);
            h.d(findViewById6, "view.findViewById(R.id.aux_description)");
            this.m0 = findViewById6;
            View view3 = this.l0;
            if (view3 != null) {
                view3.setOnClickListener(new a(1, this));
            } else {
                h.k("auxContainer");
                throw null;
            }
        } else {
            h.k("bluetoothContainer");
            throw null;
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return PageIdentifiers.SUPERBIRD_SETUP_CONNECTTOCAR.name();
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        ij9 b = ij9.b(PageIdentifiers.SUPERBIRD_SETUP_CONNECTTOCAR, ViewUris.u2.toString());
        h.d(b, "PageViewObservable.creat…ECTTOCAR.toString()\n    )");
        return b;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        ifd ifd = kfd.r1;
        h.d(ifd, "FeatureIdentifiers.SUPERBIRD");
        return ifd;
    }
}

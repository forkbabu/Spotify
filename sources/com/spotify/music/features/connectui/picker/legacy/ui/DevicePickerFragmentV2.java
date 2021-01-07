package com.spotify.music.features.connectui.picker.legacy.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.paste.app.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.libs.connect.instrumentation.e;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.u;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.ui.view.DraggableSeekBar;
import com.spotify.music.C0707R;
import com.spotify.music.features.connectui.picker.contextmenu.DeviceContextMenuFragment;
import com.spotify.music.features.connectui.picker.legacy.util.SnackbarScheduler;
import com.spotify.music.features.connectui.picker.legacy.util.d;
import com.spotify.music.features.connectui.picker.ui.ListeningOnView;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public class DevicePickerFragmentV2 extends LifecycleListenableFragment implements s, ws4, c.a, mfd {
    public static final /* synthetic */ int w0 = 0;
    us4 h0;
    private DraggableSeekBar i0;
    private LinearLayout j0;
    private RecyclerView k0;
    private ListeningOnView l0;
    private View m0;
    jt4 n0;
    d o0;
    e p0;
    SnackbarScheduler q0;
    u r0;
    int s0;
    g4d t0;
    hs0 u0;
    private final DraggableSeekBar.b v0 = new a();

    class a implements DraggableSeekBar.b {
        a() {
        }

        @Override // com.spotify.mobile.android.ui.view.DraggableSeekBar.b
        public void a(int i, int i2) {
            DevicePickerFragmentV2 devicePickerFragmentV2 = DevicePickerFragmentV2.this;
            devicePickerFragmentV2.h0.F(devicePickerFragmentV2.K4(i2));
        }

        @Override // com.spotify.mobile.android.ui.view.DraggableSeekBar.b
        public void b(SeekBar seekBar) {
        }

        @Override // com.spotify.mobile.android.ui.view.DraggableSeekBar.b
        public void c(int i, int i2) {
            DevicePickerFragmentV2 devicePickerFragmentV2 = DevicePickerFragmentV2.this;
            devicePickerFragmentV2.h0.F(devicePickerFragmentV2.K4(i2));
        }

        @Override // com.spotify.mobile.android.ui.view.DraggableSeekBar.b
        public void d(SeekBar seekBar) {
            DevicePickerFragmentV2.this.h0.F(DevicePickerFragmentV2.this.L4());
        }

        @Override // com.spotify.mobile.android.ui.view.DraggableSeekBar.b
        public void e(SeekBar seekBar, int i) {
            DevicePickerFragmentV2.this.h0.F(DevicePickerFragmentV2.this.L4());
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return context.getString(C0707R.string.connect_picker_header_text);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        this.h0.C();
    }

    public float K4(int i) {
        return com.spotify.music.libs.connect.u.b(i, this.i0.getMax());
    }

    public float L4() {
        return com.spotify.music.libs.connect.u.c(this.i0);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        this.h0.D();
    }

    public /* synthetic */ void M4(float f) {
        com.spotify.music.libs.connect.u.d(f, this.i0);
    }

    @Override // defpackage.ws4
    public void R() {
        this.m0.setVisibility(0);
    }

    @Override // defpackage.ws4
    public void a(GaiaDevice gaiaDevice, int i) {
        jt4 jt4 = this.n0;
        boolean z = jt4 != null && jt4.e();
        DeviceContextMenuFragment deviceContextMenuFragment = new DeviceContextMenuFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("CONTEXT_MENU_DEVICE", gaiaDevice);
        bundle.putInt("KEY_DEVICE_POSITION_IN_PICKER", i);
        bundle.putBoolean("KEY_MINI_PICKER_COLLAPSED", z);
        deviceContextMenuFragment.r4(bundle);
        deviceContextMenuFragment.b5(new c(this));
        deviceContextMenuFragment.Z4(E2(), null);
    }

    @Override // defpackage.ws4
    public void c1() {
        this.m0.setVisibility(8);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // defpackage.mfd
    public com.spotify.instrumentation.a g1() {
        return PageIdentifiers.CONNECT_DEVICEPICKER;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.z1;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "devices";
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void n3(int i, int i2, Intent intent) {
        super.n3(i, i2, intent);
        this.t0.b(i, i2, intent);
    }

    @Override // defpackage.ws4
    public void o(float f) {
        com.spotify.music.libs.connect.u.d(f, this.i0);
    }

    @Override // defpackage.ws4
    public void p() {
        a.C0151a aVar = new a.C0151a(B2(), C0707R.style.res_2132083498_theme_glue_dialog);
        aVar.d(C0707R.string.connect_picker_empty_context_body);
        aVar.j(C0707R.string.two_button_dialog_button_ok, e.a);
        aVar.f((dj9) B2(), PageIdentifiers.CONNECT_DEVICEPICKER.path(), ViewUris.z1.toString());
        aVar.c().show();
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // defpackage.ws4
    public void q() {
        if (8 == this.j0.getVisibility()) {
            this.j0.setVisibility(0);
        }
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        this.h0.A();
        u4(false);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.CONNECT_DEVICEPICKER, ViewUris.z1.toString());
    }

    @Override // defpackage.ws4
    public void w() {
        if (this.j0.getVisibility() == 0) {
            this.j0.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.s0, viewGroup, false);
        this.k0 = (RecyclerView) inflate.findViewById(C0707R.id.devices_list);
        this.i0 = (DraggableSeekBar) inflate.findViewById(C0707R.id.volume_slider);
        this.j0 = (LinearLayout) inflate.findViewById(C0707R.id.volume_bar);
        this.l0 = (ListeningOnView) inflate.findViewById(C0707R.id.listening_on_view);
        View findViewById = inflate.findViewById(C0707R.id.allow_group_session_view);
        View findViewById2 = inflate.findViewById(C0707R.id.select_device_header);
        this.m0 = findViewById2;
        q4.J(findViewById2, true);
        if (this.u0.a()) {
            findViewById.setVisibility(0);
        } else {
            findViewById.setVisibility(8);
        }
        if (this.r0.a()) {
            jt4 jt4 = new jt4(inflate);
            this.n0 = jt4;
            jt4.d();
            this.n0.h(new f(this));
        }
        if (B2() != null) {
            this.h0.e(this.k0, new LinearLayoutManager(1, false));
        }
        ImageView imageView = (ImageView) inflate.findViewById(C0707R.id.volume_img);
        androidx.fragment.app.c B2 = B2();
        Context F2 = F2();
        if (!(B2 == null || F2 == null)) {
            SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(B2, SpotifyIconV2.NEW_VOLUME, (float) R2().getDimensionPixelSize(C0707R.dimen.device_picker_volume_image_height));
            spotifyIconDrawable.r(androidx.core.content.a.b(F2, C0707R.color.device_picker_volume_icon));
            imageView.setImageDrawable(spotifyIconDrawable);
            this.i0.setMax(100);
            com.spotify.music.libs.connect.u.d(0.0f, this.i0);
            this.i0.setDraggableSeekBarListener(this.v0);
            if (B2 instanceof DevicePickerActivityV2) {
                ((DevicePickerActivityV2) B2).U0(new d(this));
            }
            if (this.j0.getVisibility() == 0) {
                this.j0.setVisibility(8);
            }
        }
        ImageView imageView2 = (ImageView) inflate.findViewById(C0707R.id.close_picker_icon);
        imageView2.setOnClickListener(new b(this));
        imageView2.setImageDrawable(this.o0.e());
        this.h0.b(this.l0);
        this.h0.a((com.spotify.music.features.connectui.picker.frictionlessjoin.ui.a) inflate.findViewById(C0707R.id.allow_group_session_view));
        return inflate;
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void x3() {
        super.x3();
        this.h0.B();
    }

    @Override // defpackage.ws4
    public void y() {
        androidx.fragment.app.c B2 = B2();
        if (B2 != null) {
            B2.finish();
        }
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.P;
    }
}

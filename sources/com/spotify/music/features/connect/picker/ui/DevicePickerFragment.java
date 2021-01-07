package com.spotify.music.features.connect.picker.ui;

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
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.paste.app.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.ui.view.DraggableSeekBar;
import com.spotify.music.C0707R;
import com.spotify.music.features.connect.cast.discovery.d;
import com.spotify.music.features.connect.picker.contextmenu.ui.DeviceContextMenuActivity;
import com.spotify.music.libs.connect.u;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.ArrayList;

public class DevicePickerFragment extends LifecycleListenableFragment implements s, hp4, c.a, mfd {
    public static final /* synthetic */ int q0 = 0;
    an4 h0;
    fp4 i0;
    gq4 j0;
    g4d k0;
    private DraggableSeekBar l0;
    private LinearLayout m0;
    private RecyclerView n0;
    private GridLayoutManager o0;
    private final DraggableSeekBar.b p0 = new b();

    class a implements d {
        a(DevicePickerFragment devicePickerFragment) {
        }

        @Override // com.spotify.music.features.connect.cast.discovery.d
        public void a(String str) {
            Logger.b("Logout device: %s", str);
        }

        @Override // com.spotify.music.features.connect.cast.discovery.d
        public void b(String str, String str2, String str3, String str4, String str5) {
            Logger.b("Login device: %s", str);
        }
    }

    class b implements DraggableSeekBar.b {
        b() {
        }

        @Override // com.spotify.mobile.android.ui.view.DraggableSeekBar.b
        public void a(int i, int i2) {
            DevicePickerFragment devicePickerFragment = DevicePickerFragment.this;
            devicePickerFragment.i0.u(devicePickerFragment.K4(i2));
        }

        @Override // com.spotify.mobile.android.ui.view.DraggableSeekBar.b
        public void b(SeekBar seekBar) {
        }

        @Override // com.spotify.mobile.android.ui.view.DraggableSeekBar.b
        public void c(int i, int i2) {
            DevicePickerFragment devicePickerFragment = DevicePickerFragment.this;
            devicePickerFragment.i0.u(devicePickerFragment.K4(i2));
        }

        @Override // com.spotify.mobile.android.ui.view.DraggableSeekBar.b
        public void d(SeekBar seekBar) {
            float L4 = DevicePickerFragment.this.L4();
            DevicePickerFragment.this.i0.u(L4);
            DevicePickerFragment.this.j0.a(L4);
        }

        @Override // com.spotify.mobile.android.ui.view.DraggableSeekBar.b
        public void e(SeekBar seekBar, int i) {
            DevicePickerFragment.this.i0.u(DevicePickerFragment.this.L4());
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return context.getString(C0707R.string.connect_picker_header_text);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        this.i0.s();
    }

    public float K4(int i) {
        return u.b(i, this.l0.getMax());
    }

    public float L4() {
        return u.c(this.l0);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        this.i0.t();
    }

    public /* synthetic */ void M4(float f) {
        u.d(f, this.l0);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.h0.e(new a(this));
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        this.h0.d();
    }

    @Override // defpackage.hp4
    public void a(GaiaDevice gaiaDevice, int i) {
        androidx.fragment.app.c B2 = B2();
        if (B2 != null) {
            int i2 = DeviceContextMenuActivity.W;
            Intent intent = new Intent(B2, DeviceContextMenuActivity.class);
            intent.putExtra("device", gaiaDevice);
            intent.putExtra("index", i);
            intent.putParcelableArrayListExtra("gaia_incarnations", new ArrayList<>(gaiaDevice.getIncarnations()));
            intent.putParcelableArrayListExtra("gaia_capabilities", gn4.a(gaiaDevice.getCapabilities(), gaiaDevice.getCosmosIdentifier()));
            intent.putExtra("gaia_support_logout", gaiaDevice.supportsLogout());
            intent.putExtra("gaia_support_rename", gaiaDevice.supportsRename());
            intent.putExtra("gaia_support_volume", gaiaDevice.supportsVolume());
            B2.startActivity(intent);
        }
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

    @Override // defpackage.hp4
    public int l() {
        return R2().getConfiguration().orientation;
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void n3(int i, int i2, Intent intent) {
        super.n3(i, i2, intent);
        this.k0.b(i, i2, intent);
    }

    @Override // defpackage.hp4
    public void o(float f) {
        u.d(f, this.l0);
    }

    @Override // defpackage.hp4
    public void p() {
        a.C0151a aVar = new a.C0151a(B2(), C0707R.style.res_2132083498_theme_glue_dialog);
        aVar.d(C0707R.string.connect_picker_empty_context_body);
        aVar.j(C0707R.string.two_button_dialog_button_ok, d.a);
        aVar.f((dj9) B2(), PageIdentifiers.CONNECT_DEVICEPICKER.path(), ViewUris.z1.toString());
        aVar.c().show();
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // defpackage.hp4
    public void q() {
        if (8 == this.m0.getVisibility()) {
            this.m0.setVisibility(0);
        }
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        this.i0.r();
        u4(false);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.CONNECT_DEVICEPICKER, ViewUris.z1.toString());
    }

    @Override // defpackage.hp4
    public void u1(zn4 zn4, int i) {
        androidx.fragment.app.c B2 = B2();
        if (B2 instanceof DevicePickerActivity) {
            ((DevicePickerActivity) B2).a1(zn4, i);
        }
    }

    @Override // defpackage.hp4
    public void w() {
        if (this.m0.getVisibility() == 0) {
            this.m0.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C0707R.layout.fragment_device, viewGroup, false);
        this.n0 = (RecyclerView) inflate.findViewById(C0707R.id.devices_list);
        this.l0 = (DraggableSeekBar) inflate.findViewById(C0707R.id.volume_slider);
        this.m0 = (LinearLayout) inflate.findViewById(C0707R.id.volume_bar);
        androidx.fragment.app.c B2 = B2();
        if (B2 != null) {
            GridLayoutManager gridLayoutManager = new GridLayoutManager(B2, this.i0.c());
            this.o0 = gridLayoutManager;
            this.i0.d(this.n0, gridLayoutManager);
            androidx.fragment.app.c B22 = B2();
            Context F2 = F2();
            if (F2 != null && (B22 instanceof DevicePickerActivity)) {
                this.n0.n(new fq4(com.spotify.android.paste.app.d.b(F2), ((DevicePickerActivity) B22).M.b(), this.o0));
            }
        }
        ImageView imageView = (ImageView) inflate.findViewById(C0707R.id.volume_img);
        androidx.fragment.app.c B23 = B2();
        Context F22 = F2();
        if (!(B23 == null || F22 == null)) {
            SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(B23, SpotifyIconV2.NEW_VOLUME, (float) R2().getDimensionPixelSize(C0707R.dimen.device_picker_volume_image_height));
            spotifyIconDrawable.r(androidx.core.content.a.b(F22, C0707R.color.device_picker_volume_icon));
            imageView.setImageDrawable(spotifyIconDrawable);
            this.l0.setMax(100);
            u.d(0.0f, this.l0);
            this.l0.setDraggableSeekBarListener(this.p0);
            if (B23 instanceof DevicePickerActivity) {
                ((DevicePickerActivity) B23).U0(new c(this));
            }
            if (this.m0.getVisibility() == 0) {
                this.m0.setVisibility(8);
            }
        }
        return inflate;
    }

    @Override // defpackage.hp4
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

package com.spotify.music.homething.addnewdevice.scandevices.view;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import dagger.android.support.a;
import defpackage.ds9;

public class ScanDevicesFragment extends LifecycleListenableFragment implements s, ds9 {
    ds9.a h0;
    cs9 i0;
    as9 j0;
    private View k0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return context.getString(C0707R.string.homething);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        this.h0.a();
    }

    public void K4(BluetoothDevice bluetoothDevice) {
        this.k0.setVisibility(0);
        this.i0.X(bluetoothDevice);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        this.h0.c(this);
        if (!F2().getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
            Toast.makeText(F2(), (int) C0707R.string.ble_not_supported, 0).show();
            B2().finish();
        } else if (!BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            H4(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 123, null);
        } else if (!this.j0.a(F2())) {
            this.j0.b(this, F2().getString(C0707R.string.rationale_location), 1235);
        } else if (Build.VERSION.SDK_INT >= 23) {
            this.h0.b();
        } else {
            Toast.makeText(F2(), (int) C0707R.string.not_supported_android_version, 0).show();
            B2().finish();
        }
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        super.Q3(view, bundle);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(F2());
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C0707R.id.recycler_view);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.i0);
        this.k0 = view.findViewById(C0707R.id.choose_device_text);
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
        if (i == 123) {
            if (i2 != -1) {
                Toast.makeText(F2(), F2().getString(C0707R.string.enable_bluetooth), 0).show();
            }
        } else if (i != 1235) {
        } else {
            if (i2 == -1) {
                this.h0.b();
            } else {
                Toast.makeText(F2(), F2().getString(C0707R.string.enable_location), 0).show();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        a.a(this);
        super.p3(context);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.HOMETHING_ACTIVATION_SCANDEVICES, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C0707R.layout.homething_scan_devices_fragment, viewGroup, false);
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.r0;
    }
}

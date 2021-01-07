package com.spotify.music.features.connectui.picker.legacy.ui;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import androidx.fragment.app.x;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.libs.connect.nudge.c;
import com.spotify.libs.connect.u;
import com.spotify.music.C0707R;
import com.spotify.music.libs.connect.v;
import com.spotify.music.libs.viewuri.ViewUris;

public class DevicePickerActivityV2 extends v {
    public static final /* synthetic */ int R = 0;
    private a L;
    ss0 M;
    o N;
    u O;
    c P;
    private final bj9 Q = new bj9();

    public interface a {
    }

    private void W0(boolean z) {
        DevicePickerFragmentV2 devicePickerFragmentV2 = new DevicePickerFragmentV2();
        x i = this.N.i();
        i.q(C0707R.id.snackbarContainer, devicePickerFragmentV2, "tag_device_fragment");
        i.k();
        this.L = new a(devicePickerFragmentV2);
        if (!z) {
            this.Q.d(PageIdentifiers.CONNECT_DEVICEPICKER.path(), ViewUris.z1.toString());
        }
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        if (this.O.a()) {
            overridePendingTransition(0, C0707R.anim.mini_picker_fade_out);
        } else {
            overridePendingTransition(0, C0707R.anim.slide_out_to_bottom);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        a aVar;
        if (this.N.X() > 0) {
            this.N.x0();
        } else if (!this.O.a() || (aVar = this.L) == null) {
            super.onBackPressed();
        } else {
            DevicePickerFragmentV2 devicePickerFragmentV2 = ((a) aVar).a;
            if (devicePickerFragmentV2.r0.a()) {
                devicePickerFragmentV2.n0.c();
            } else {
                devicePickerFragmentV2.y();
            }
        }
    }

    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.O.a()) {
            setTheme(C0707R.style.res_2132083492_theme_devicepicker);
            overridePendingTransition(C0707R.anim.mini_picker_fade_in, 0);
        } else {
            overridePendingTransition(C0707R.anim.slide_in_from_bottom, 0);
        }
        setContentView(C0707R.layout.new_activity_device);
        if (bundle == null) {
            W0(false);
        }
        if (this.M.b()) {
            this.M.a(this);
        }
        this.P.d();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        if (!(bundle == null || bundle.getString("key_current_fragment") == null)) {
            W0(true);
        }
        super.onRestoreInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Fragment T = this.N.T(C0707R.id.snackbarContainer);
        if (T != null) {
            bundle.putString("key_current_fragment", T.X2());
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.c(this.Q);
    }
}

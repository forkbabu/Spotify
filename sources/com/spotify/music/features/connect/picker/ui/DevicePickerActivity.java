package com.spotify.music.features.connect.picker.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import androidx.fragment.app.x;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.libs.connect.instrumentation.e;
import com.spotify.music.C0707R;
import com.spotify.music.features.connect.dialogs.g;
import com.spotify.music.features.connect.picker.education.EducationStepsFragment;
import com.spotify.music.libs.connect.v;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;

public class DevicePickerActivity extends v {
    public static final /* synthetic */ int V = 0;
    co4 L;
    sp4 M;
    mba N;
    o O;
    e P;
    ss0 Q;
    private final bj9 R = new bj9();
    private final View.OnClickListener S = new b(this);
    private final View.OnClickListener T = new a(this);
    private zn4 U;

    private void W0(boolean z) {
        DevicePickerFragment devicePickerFragment = new DevicePickerFragment();
        x i = this.O.i();
        i.q(C0707R.id.root, devicePickerFragment, "tag_device_fragment");
        i.k();
        this.M.k("tag_device_fragment");
        if (!z) {
            this.R.d(PageIdentifiers.CONNECT_DEVICEPICKER.path(), ViewUris.z1.toString());
        }
    }

    public void X0(String str, String str2) {
        this.R.d(str, str2);
    }

    public void a1(zn4 zn4, int i) {
        this.U = zn4;
        a a = g.a(zn4);
        c b = g.b(zn4);
        ((zt0) this.P.a()).i(((PageIdentifiers) a).path(), b.toString());
        this.N.f(a, i);
        EducationStepsFragment educationStepsFragment = new EducationStepsFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("tag_education_item", zn4);
        educationStepsFragment.r4(bundle);
        String h = zn4.h();
        x i2 = this.O.i();
        i2.t(C0707R.anim.slide_in_right, C0707R.anim.slide_out_left, C0707R.anim.slide_in_left, C0707R.anim.slide_out_right);
        i2.q(C0707R.id.root, educationStepsFragment, "tag_education_steps_fragment");
        i2.g(null);
        i2.i();
        this.M.l("tag_education_steps_fragment", h);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, C0707R.anim.slide_out_to_bottom);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.O.X() > 0) {
            this.O.x0();
            this.M.m(u());
            return;
        }
        super.onBackPressed();
    }

    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        overridePendingTransition(C0707R.anim.slide_in_from_bottom, 0);
        super.onCreate(bundle);
        setContentView(C0707R.layout.activity_device);
        sp4 sp4 = this.M;
        FrameLayout frameLayout = (FrameLayout) findViewById(C0707R.id.toolbar_holder);
        com.spotify.android.glue.components.toolbar.c c = l70.c(this, frameLayout);
        frameLayout.addView(((com.spotify.android.glue.components.toolbar.e) c).getView());
        sp4.h(c, this.S, this.T);
        this.M.m(u());
        if (bundle == null) {
            W0(false);
        }
        if (this.Q.b()) {
            this.Q.a(this);
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        String string;
        if (!(bundle == null || (string = bundle.getString("key_current_fragment")) == null)) {
            char c = 65535;
            int hashCode = string.hashCode();
            if (hashCode != -1126213772) {
                if (hashCode == 1347834596 && string.equals("tag_education_steps_fragment")) {
                    c = 0;
                }
            } else if (string.equals("tag_device_fragment")) {
                c = 1;
            }
            if (c != 0) {
                W0(true);
            } else {
                zn4 zn4 = (zn4) bundle.getParcelable("key_education_item");
                if (zn4 != null) {
                    EducationStepsFragment educationStepsFragment = new EducationStepsFragment();
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("tag_education_item", zn4);
                    educationStepsFragment.r4(bundle2);
                    x i = this.O.i();
                    i.q(C0707R.id.root, educationStepsFragment, "tag_education_steps_fragment");
                    i.k();
                    this.M.l("tag_education_steps_fragment", zn4.h());
                } else {
                    W0(true);
                }
            }
        }
        super.onRestoreInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Fragment u = u();
        if (u != null) {
            bundle.putString("key_current_fragment", u.X2());
        }
        bundle.putParcelable("key_education_item", this.U);
        super.onSaveInstanceState(bundle);
    }

    public Fragment u() {
        return this.O.T(C0707R.id.root);
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.c(this.R);
    }

    public void finish(View view) {
        finish();
    }
}

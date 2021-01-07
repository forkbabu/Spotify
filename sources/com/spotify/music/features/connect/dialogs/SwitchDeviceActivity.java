package com.spotify.music.features.connect.dialogs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.a;
import com.spotify.encore.foundation.R;
import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.libs.connect.instrumentation.b;
import com.spotify.libs.connect.l;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.picker.view.h;
import com.spotify.mobile.android.util.ui.s;
import com.spotify.mobile.android.util.x;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.y;

public class SwitchDeviceActivity extends ss2 implements k {
    public static final /* synthetic */ int U = 0;
    private ImageView G;
    private TextView H;
    private Button I;
    private Button J;
    private boolean K;
    private h L;
    private i M;
    zr0 N;
    l O;
    oba P;
    y Q;
    b R;
    private boolean S;
    private boolean T;

    public boolean U0() {
        return this.K;
    }

    public /* synthetic */ void V0(View view) {
        this.S = true;
        this.P.a("call-to-action", InteractionIntent.CONTINUE, PageIdentifiers.CONNECT_OVERLAY_SWITCHDEVICE, ViewUris.C1);
        ((j) this.M).e();
    }

    public /* synthetic */ void W0(View view) {
        this.S = true;
        this.P.a("call-to-action", InteractionIntent.LISTEN_ON_THIS_DEVICE, PageIdentifiers.CONNECT_OVERLAY_SWITCHDEVICE, ViewUris.C1);
        GaiaDevice gaiaDevice = (GaiaDevice) getIntent().getParcelableExtra("active_device");
        if (gaiaDevice != null) {
            ((j) this.M).g(gaiaDevice.getLoggingIdentifier());
        }
    }

    public void X0(GaiaDevice gaiaDevice) {
        this.G.setImageDrawable(this.L.b(gaiaDevice, a.b(this, R.color.green), (float) getResources().getDimensionPixelSize(C0707R.dimen.connect_dialog_device_icon_size)));
    }

    public void a1(String str) {
        this.H.setText(str);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.T = true;
        ((j) this.M).f("dismiss_back_pressed");
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.L = new h(this);
        setContentView(C0707R.layout.switch_device_dialog);
        this.I = (Button) findViewById(C0707R.id.left_button);
        this.J = (Button) findViewById(C0707R.id.right_button);
        this.G = (ImageView) findViewById(C0707R.id.device_icon);
        this.H = (TextView) findViewById(C0707R.id.device_name);
        this.I.setText(getString(x.g(this) ? C0707R.string.connect_listen_on_this_tablet : C0707R.string.connect_listen_on_this_phone));
        new s(this.I).c();
        this.I.setOnClickListener(new d(this));
        this.J.setText(C0707R.string.connect_popup_button_close);
        this.J.setOnClickListener(new b(this));
        ImageView imageView = this.G;
        if (imageView != null) {
            imageView.setVisibility(getResources().getBoolean(C0707R.bool.connect_dialog_has_image) ? 0 : 8);
        }
        this.M = new j(this.O, this.N, this, new c(this), this.R);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onDestroy() {
        if (!this.S && !this.T) {
            ((j) this.M).f("dismiss_touch_outside");
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, androidx.fragment.app.c, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.fragment.app.c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.K = false;
        ((j) this.M).a();
        setResult(-1);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.jd0, androidx.fragment.app.c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.K = true;
        ((j) this.M).i((GaiaDevice) getIntent().getParcelableExtra("active_device"));
    }

    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStart() {
        super.onStart();
        ((j) this.M).b();
    }

    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStop() {
        super.onStop();
        ((j) this.M).c();
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.CONNECT_OVERLAY_SWITCHDEVICE, ViewUris.C1.toString());
    }
}

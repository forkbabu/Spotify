package com.spotify.music.features.connect.dialogs.newdevice;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.a;
import com.google.common.base.MoreObjects;
import com.spotify.encore.foundation.R;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.libs.connect.instrumentation.b;
import com.spotify.libs.connect.model.DeviceType;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.picker.view.h;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;

public class NewDeviceActivity extends ss2 {
    public static final /* synthetic */ int S = 0;
    private h G;
    private ImageView H;
    private TextView I;
    private TextView J;
    private Button K;
    private Button L;
    boolean M;
    oba N;
    b O;
    private boolean P;
    private boolean Q;
    private String R;

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        this.Q = true;
    }

    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.G = new h(this);
        setContentView(C0707R.layout.new_device_dialog);
        this.K = (Button) findViewById(C0707R.id.top_button);
        this.L = (Button) findViewById(C0707R.id.bottom_button);
        this.H = (ImageView) findViewById(C0707R.id.device_icon);
        this.I = (TextView) findViewById(C0707R.id.device_brand);
        this.J = (TextView) findViewById(C0707R.id.device_type);
        boolean z = getResources().getBoolean(C0707R.bool.connect_dialog_has_image);
        this.M = z;
        this.H.setVisibility(z ? 0 : 8);
        Intent intent = getIntent();
        Assertion.e(intent);
        this.R = ((GaiaDevice) intent.getParcelableExtra("device")).getLoggingIdentifier();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onDestroy() {
        if (!this.P) {
            ((et0) ((ct0) this.O).b()).a(this.Q ? "dismiss_back_pressed" : "dismiss_touch_outside", this.R);
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
    @Override // defpackage.ss2, defpackage.jd0, androidx.fragment.app.c, android.app.Activity
    public void onResume() {
        String str;
        String str2;
        DeviceType.GaiaTypes gaiaTypes;
        DeviceType.GaiaTypes gaiaTypes2;
        int i;
        super.onResume();
        Intent intent = getIntent();
        Assertion.e(intent);
        GaiaDevice gaiaDevice = (GaiaDevice) intent.getParcelableExtra("device");
        if (gaiaDevice != null) {
            Assertion.e(gaiaDevice);
            Intent intent2 = new Intent();
            intent2.putExtra("device", gaiaDevice);
            setResult(0, intent2);
            ((bt0) ((ct0) this.O).a()).a(gaiaDevice.getLoggingIdentifier());
            DeviceType type = gaiaDevice.getType();
            DeviceType.GaiaTypes gaiaTypes3 = DeviceType.GaiaTypes.GAME_CONSOLE;
            if (type == gaiaTypes3 && "sony_tv".equalsIgnoreCase(gaiaDevice.getBrandName())) {
                str = getString(C0707R.string.connect_brand_gameconsole_sony);
            } else if (gaiaDevice.getType() == DeviceType.GaiaTypes.CAST_VIDEO || gaiaDevice.getType() == DeviceType.GaiaTypes.CAST_AUDIO) {
                str = getString(C0707R.string.connect_brand_cast);
            } else {
                str = (gaiaDevice.getType() == DeviceType.GaiaTypes.COMPUTER || gaiaDevice.getType() == DeviceType.GaiaTypes.SMARTPHONE || gaiaDevice.getType() == DeviceType.GaiaTypes.TABLET) ? "" : gaiaDevice.getBrandName();
            }
            if (MoreObjects.isNullOrEmpty(str)) {
                this.I.setVisibility(8);
            } else {
                this.I.setText(str);
                this.I.setVisibility(0);
            }
            TextView textView = this.J;
            if (gaiaDevice.getType() != gaiaTypes3 || !"sony_tv".equalsIgnoreCase(gaiaDevice.getBrandName())) {
                DeviceType type2 = gaiaDevice.getType();
                DeviceType.GaiaTypes gaiaTypes4 = DeviceType.GaiaTypes.COMPUTER;
                if (type2 == gaiaTypes4 || gaiaDevice.getType() == (gaiaTypes = DeviceType.GaiaTypes.SMARTPHONE) || gaiaDevice.getType() == (gaiaTypes2 = DeviceType.GaiaTypes.TABLET)) {
                    str2 = gaiaDevice.getName();
                } else {
                    DeviceType type3 = gaiaDevice.getType();
                    if (type3.equals(DeviceType.GaiaTypes.AVR)) {
                        i = C0707R.string.connect_type_avr;
                    } else if (type3.equals(DeviceType.GaiaTypes.UNKNOWN)) {
                        i = C0707R.string.connect_type_unknown;
                    } else if (type3.equals(DeviceType.GaiaTypes.CAST_AUDIO)) {
                        i = C0707R.string.connect_type_cast_audio;
                    } else if (type3.equals(DeviceType.GaiaTypes.CAST_VIDEO)) {
                        i = C0707R.string.connect_type_cast_video;
                    } else if (type3.equals(gaiaTypes4)) {
                        i = C0707R.string.connect_type_computer;
                    } else if (type3.equals(DeviceType.GaiaTypes.AUDIO_DONGLE)) {
                        i = C0707R.string.connect_type_dongle;
                    } else if (type3.equals(gaiaTypes)) {
                        i = C0707R.string.connect_type_smartphone;
                    } else if (type3.equals(DeviceType.GaiaTypes.SPEAKER)) {
                        i = C0707R.string.connect_type_speaker;
                    } else if (type3.equals(gaiaTypes2)) {
                        i = C0707R.string.connect_type_tablet;
                    } else {
                        i = type3.equals(DeviceType.GaiaTypes.TV) ? C0707R.string.connect_type_tv : C0707R.string.connect_type_generic;
                    }
                    str2 = getString(i);
                }
            } else {
                str2 = getString(C0707R.string.connect_brand_gameconsole_playstation);
            }
            textView.setText(str2);
            if (this.M) {
                this.H.setImageDrawable(this.G.b(gaiaDevice, a.b(this, R.color.green), (float) getResources().getDimensionPixelSize(C0707R.dimen.connect_dialog_device_icon_size)));
            }
            this.L.setOnClickListener(new e(this, gaiaDevice));
            this.K.setOnClickListener(new f(this, gaiaDevice));
        }
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.CONNECT_OVERLAY_NEWDEVICE, ViewUris.B1.toString());
    }
}

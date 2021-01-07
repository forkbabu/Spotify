package com.spotify.music.libs.connect.volume.dialog;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.spotify.encore.foundation.R;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.picker.view.h;
import com.spotify.mobile.android.ui.view.DraggableSeekBar;
import com.spotify.music.C0707R;
import com.spotify.music.libs.connect.u;
import com.spotify.music.libs.connect.v;
import com.spotify.music.libs.viewuri.ViewUris;

public class VolumeWidgetActivity extends v {
    public static final /* synthetic */ int S = 0;
    private Handler L;
    private DraggableSeekBar M;
    private TextView N;
    private ImageView O;
    private h P;
    private GaiaDevice Q;
    private final Runnable R = new a(this);

    class a implements DraggableSeekBar.b {
        a() {
        }

        @Override // com.spotify.mobile.android.ui.view.DraggableSeekBar.b
        public void a(int i, int i2) {
            float b = u.b(i2, VolumeWidgetActivity.this.M.getMax());
            if (VolumeWidgetActivity.this.V0(b)) {
                u.d(b, VolumeWidgetActivity.this.M);
                VolumeWidgetActivity.a1(VolumeWidgetActivity.this);
            }
        }

        @Override // com.spotify.mobile.android.ui.view.DraggableSeekBar.b
        public void b(SeekBar seekBar) {
        }

        @Override // com.spotify.mobile.android.ui.view.DraggableSeekBar.b
        public void c(int i, int i2) {
            float b = u.b(i2, VolumeWidgetActivity.this.M.getMax());
            if (VolumeWidgetActivity.this.V0(b)) {
                u.d(b, VolumeWidgetActivity.this.M);
                VolumeWidgetActivity.a1(VolumeWidgetActivity.this);
            }
        }

        @Override // com.spotify.mobile.android.ui.view.DraggableSeekBar.b
        public void d(SeekBar seekBar) {
            VolumeWidgetActivity.this.V0(u.b(seekBar.getProgress(), seekBar.getMax()));
        }

        @Override // com.spotify.mobile.android.ui.view.DraggableSeekBar.b
        public void e(SeekBar seekBar, int i) {
            if (VolumeWidgetActivity.this.V0(u.b(seekBar.getProgress(), seekBar.getMax()))) {
                VolumeWidgetActivity.a1(VolumeWidgetActivity.this);
            }
        }
    }

    static void a1(VolumeWidgetActivity volumeWidgetActivity) {
        volumeWidgetActivity.L.removeCallbacks(volumeWidgetActivity.R);
        volumeWidgetActivity.L.postDelayed(volumeWidgetActivity.R, 2000);
    }

    public /* synthetic */ void f1(float f) {
        u.d(f, this.M);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0707R.layout.view_volume_widget);
        this.P = new h(this);
        this.M = (DraggableSeekBar) findViewById(C0707R.id.volume_slider);
        this.N = (TextView) findViewById(C0707R.id.device_name);
        this.O = (ImageView) findViewById(C0707R.id.device_image);
        this.L = new Handler();
        this.M.setMax(100);
        this.M.setDraggableSeekBarListener(new a());
        GaiaDevice gaiaDevice = (GaiaDevice) getIntent().getParcelableExtra("active_device");
        this.Q = gaiaDevice;
        if (gaiaDevice != null) {
            ((ju0) this.J.b()).a(this.Q.getLoggingIdentifier());
        }
        U0(new b(this));
    }

    @Override // com.spotify.music.libs.connect.v, defpackage.ss2, androidx.appcompat.app.g, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 25 || i == 24) {
            this.L.removeCallbacks(this.R);
            this.L.postDelayed(this.R, 2000);
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.jd0, androidx.fragment.app.c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.L.postDelayed(this.R, 2000);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStart() {
        super.onStart();
        u.d(getIntent().getFloatExtra("volume_level", 0.0f), this.M);
        GaiaDevice gaiaDevice = this.Q;
        if (gaiaDevice == null) {
            finish();
            return;
        }
        this.N.setText(gaiaDevice.getName());
        this.O.setImageDrawable(this.P.b(gaiaDevice, androidx.core.content.a.b(this, R.color.white), (float) getResources().getDimensionPixelSize(C0707R.dimen.connect_dialog_device_icon_size)));
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStop() {
        super.onStop();
        this.L.removeCallbacks(this.R);
        this.M.setProgress(0);
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.CONNECT_OVERLAY_VOLUME, ViewUris.D1.toString());
    }
}

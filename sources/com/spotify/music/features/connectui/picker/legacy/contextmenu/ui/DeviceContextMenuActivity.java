package com.spotify.music.features.connectui.picker.legacy.contextmenu.ui;

import android.content.Intent;
import android.os.Bundle;
import com.google.common.collect.ImmutableMap;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.libs.connect.ConnectManager;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.model.Tech;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DeviceContextMenuActivity extends ss2 {
    private static int K;
    private static final ImmutableMap<Tech, SpotifyIconV2> L;
    private static final Map<Tech, Integer> M;
    private long G;
    private ConnectManager H;
    private final List<t90> I = new ArrayList(10);
    private final hg0<ConnectManager> J = new a();

    class a implements hg0<ConnectManager> {
        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.hg0
        public void l(ConnectManager connectManager) {
            DeviceContextMenuActivity.this.H = connectManager;
        }

        @Override // defpackage.hg0
        public void onDisconnected() {
            DeviceContextMenuActivity.this.H = null;
        }
    }

    static {
        Tech tech = Tech.CONNECT;
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.SPOTIFY_CONNECT;
        Tech tech2 = Tech.CAST;
        SpotifyIconV2 spotifyIconV22 = SpotifyIconV2.CHROMECAST_DISCONNECTED;
        Tech tech3 = Tech.CAST_JS;
        L = ImmutableMap.of(tech, spotifyIconV2, tech2, spotifyIconV22, tech3, spotifyIconV22);
        Integer valueOf = Integer.valueOf((int) C0707R.string.connect_device_tech_connect);
        Integer valueOf2 = Integer.valueOf((int) C0707R.string.connect_device_tech_cast);
        M = ImmutableMap.of(tech, valueOf, tech2, valueOf2, tech3, valueOf2);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0707R.layout.empty_layout);
        Intent intent = getIntent();
        Assertion.e(intent);
        GaiaDevice gaiaDevice = (GaiaDevice) intent.getParcelableExtra("device");
        int unused = K = intent.getIntExtra("index", -1);
        Assertion.e(gaiaDevice);
        throw null;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onDestroy() {
        throw null;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        this.G = bundle.getLong("startTime", this.G);
        super.onRestoreInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putLong("startTime", this.G);
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStart() {
        throw null;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStop() {
        throw null;
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.CONNECT_CONTEXTMENU, ViewUris.A1.toString());
    }
}

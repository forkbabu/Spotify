package com.spotify.music.features.connect.picker.contextmenu.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.base.java.logging.Logger;
import com.spotify.encore.ViewProvider;
import com.spotify.encore.foundation.R;
import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.libs.connect.ConnectManager;
import com.spotify.libs.connect.instrumentation.e;
import com.spotify.libs.connect.l;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.model.GaiaDeviceIncarnation;
import com.spotify.libs.connect.model.Tech;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.o0;
import com.spotify.mobile.android.util.ui.h;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DeviceContextMenuActivity extends ss2 {
    private static int T;
    private static final ImmutableMap<Tech, SpotifyIconV2> U;
    private static final Map<Tech, Integer> V;
    public static final /* synthetic */ int W = 0;
    private long G;
    private ConnectManager H;
    wr0 I;
    l J;
    oba K;
    o0 L;
    h M;
    cqe N;
    e O;
    private final List<t90> P = new ArrayList(10);
    private l90 Q;
    private d R;
    private final hg0<ConnectManager> S = new a();

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

    class b implements DialogInterface.OnDismissListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            DeviceContextMenuActivity deviceContextMenuActivity = DeviceContextMenuActivity.this;
            int i = DeviceContextMenuActivity.W;
            deviceContextMenuActivity.finish();
        }
    }

    private class c implements View.OnClickListener {
        private final GaiaDevice a;
        private final vm4 b;
        private final Context c;

        c(GaiaDevice gaiaDevice, vm4 vm4, Context context, a aVar) {
            this.a = gaiaDevice;
            this.b = vm4;
            this.c = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DeviceContextMenuActivity.this.K.a(je.B0(je.V0("connect-context-menu/"), DeviceContextMenuActivity.T, "/item/"), InteractionIntent.GROUP_ROOMS, PageIdentifiers.CONNECT_CONTEXTMENU, ViewUris.A1);
            Uri a2 = this.b.a();
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(268435456);
            intent.setData(a2);
            if (!this.c.getPackageManager().queryIntentActivities(intent, 0).isEmpty()) {
                ((zt0) DeviceContextMenuActivity.this.O.a()).c(this.a.getLoggingIdentifier(), this.b.a().toString(), DeviceContextMenuActivity.T);
                Logger.b("Opening companion app with uri [%s]", intent.getData().toString());
                this.c.startActivity(intent);
                return;
            }
            ((zt0) DeviceContextMenuActivity.this.O.a()).c(this.a.getLoggingIdentifier(), this.b.b().toString(), DeviceContextMenuActivity.T);
            Logger.b("Opening companion app not found. Will open app store [%s]", this.b.b().toString());
            Uri b2 = this.b.b();
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.addFlags(268435456);
            intent2.setData(b2);
            this.c.startActivity(intent2);
        }
    }

    /* access modifiers changed from: private */
    public static class d {
        private final Context a;
        private final h b;
        private final ColorStateList c;
        private final ColorStateList d;

        d(Context context, h hVar) {
            this.a = context;
            this.b = hVar;
            int i = R.color.white;
            int i2 = R.color.green;
            this.c = new ColorStateList(new int[][]{new int[]{16842919}, new int[]{16842914}, new int[]{16842910}}, new int[]{androidx.core.content.a.b(context, i), androidx.core.content.a.b(context, i2), androidx.core.content.a.b(context, i)});
            this.d = new ColorStateList(new int[][]{new int[]{16842919}, new int[]{16842910}}, new int[]{androidx.core.content.a.b(context, i2), androidx.core.content.a.b(context, i)});
        }

        static t90 a(d dVar, ViewGroup viewGroup, String str, View.OnClickListener onClickListener) {
            dVar.getClass();
            u90 d2 = e90.d().d(dVar.a, viewGroup);
            TextView Z = d2.Z();
            Z.setText(str);
            Z.setTextColor(dVar.d);
            d2.getView().setOnClickListener(onClickListener);
            return d2;
        }

        static u90 b(d dVar, ViewGroup viewGroup, String str, String str2, View.OnClickListener onClickListener) {
            int g = dVar.g(28);
            int g2 = dVar.g(8);
            int g3 = dVar.g(16);
            u90 d2 = e90.d().d(dVar.a, viewGroup);
            TextView Z = d2.Z();
            Z.setText(str);
            Z.setTextColor(dVar.d);
            ImageView imageView = d2.getImageView();
            dVar.b.e(imageView, str2, yc0.m(dVar.a, SpotifyIconV2.SPOTIFY_CONNECT, 0.5f, true, true, (float) dVar.g(28)), new d(dVar));
            imageView.setLayoutParams(h(g, g, g2));
            ImageView imageView2 = new ImageView(dVar.a);
            imageView2.setImageDrawable(yc0.m(dVar.a, SpotifyIconV2.ARROW_RIGHT, 0.5f, true, true, (float) dVar.g(28)));
            imageView2.setRotation(-45.0f);
            imageView2.setLayoutParams(h(g3, g3, g2));
            d2.z0(imageView2);
            d2.getView().setOnClickListener(onClickListener);
            return d2;
        }

        static u90 c(d dVar, ViewGroup viewGroup, SpotifyIconV2 spotifyIconV2, Integer num, boolean z, View.OnClickListener onClickListener) {
            int g = dVar.g(8);
            int g2 = dVar.g(16);
            int g3 = dVar.g(24);
            u90 d2 = e90.d().d(dVar.a, viewGroup);
            d2.Z().setTextColor(dVar.c);
            ImageView imageView = d2.getImageView();
            imageView.setLayoutParams(h(g3, g3, g));
            ColorStateList colorStateList = dVar.c;
            float f = (float) g3;
            SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(dVar.a, spotifyIconV2, f);
            spotifyIconDrawable.s(colorStateList);
            imageView.setImageDrawable(spotifyIconDrawable);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setPadding(g2, g2, g2, g2);
            ImageView imageView2 = new ImageView(dVar.a);
            imageView2.setLayoutParams(h(g3, g3, g));
            SpotifyIconV2 spotifyIconV22 = SpotifyIconV2.CHECK;
            ColorStateList colorStateList2 = dVar.c;
            SpotifyIconDrawable spotifyIconDrawable2 = new SpotifyIconDrawable(dVar.a, spotifyIconV22, f);
            spotifyIconDrawable2.s(colorStateList2);
            imageView2.setImageDrawable(spotifyIconDrawable2);
            imageView2.setClickable(true);
            imageView2.setFocusable(true);
            d2.g1(true);
            d2.z0(imageView2);
            d2.setText(dVar.a.getText(num.intValue()));
            d2.setActive(z);
            ga0.a(d2);
            d2.W1().setVisibility(z ? 0 : 4);
            d2.setActive(z);
            ViewGroup viewGroup2 = (ViewGroup) d2.getView();
            viewGroup2.setClickable(true);
            viewGroup2.setOnClickListener(onClickListener);
            return d2;
        }

        static u90 e(d dVar, ViewGroup viewGroup, GaiaDevice gaiaDevice) {
            int g = dVar.g(8);
            int g2 = dVar.g(24);
            u90 d2 = e90.d().d(dVar.a, viewGroup);
            d2.setText(gaiaDevice.getName());
            d2.Z().setTextColor(androidx.core.content.a.b(dVar.a, R.color.white));
            d2.Z().setTypeface(d2.Z().getTypeface(), 1);
            d2.getImageView().setLayoutParams(h(g2, g2, g));
            d2.getImageView().setImageDrawable(new SpotifyIconDrawable(dVar.a, com.spotify.libs.connect.picker.view.h.a(gaiaDevice.getType(), gaiaDevice.isGrouped()), (float) g2));
            View view = d2.getView();
            view.setEnabled(false);
            view.setOnClickListener(null);
            return d2;
        }

        static t90 f(d dVar, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            dVar.getClass();
            t90 c2 = e90.d().c(dVar.a, viewGroup);
            TextView Z = c2.Z();
            Z.setText(C0707R.string.connect_device_menu_logout);
            Z.setTextColor(dVar.d);
            View view = c2.getView();
            view.setClickable(true);
            view.setOnClickListener(onClickListener);
            return c2;
        }

        private int g(int i) {
            return nud.g((float) i, this.a.getResources());
        }

        private static LinearLayout.LayoutParams h(int i, int i2, int i3) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i2);
            layoutParams.setMargins(i3, i3, i3, i3);
            return layoutParams;
        }
    }

    static {
        Tech tech = Tech.CONNECT;
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.SPOTIFY_CONNECT;
        Tech tech2 = Tech.CAST;
        SpotifyIconV2 spotifyIconV22 = SpotifyIconV2.CHROMECAST_DISCONNECTED;
        Tech tech3 = Tech.CAST_JS;
        U = ImmutableMap.of(tech, spotifyIconV2, tech2, spotifyIconV22, tech3, spotifyIconV22);
        Integer valueOf = Integer.valueOf((int) C0707R.string.connect_device_tech_connect);
        Integer valueOf2 = Integer.valueOf((int) C0707R.string.connect_device_tech_cast);
        V = ImmutableMap.of(tech, valueOf, tech2, valueOf2, tech3, valueOf2);
    }

    /* access modifiers changed from: private */
    public void b1(p90 p90) {
        for (t90 t90 : this.P) {
            t90.W1().setVisibility(4);
            t90.setActive(false);
        }
        p90.W1().setVisibility(0);
        p90.setActive(true);
    }

    /* access modifiers changed from: private */
    public void d1(GaiaDeviceIncarnation gaiaDeviceIncarnation) {
        ConnectManager connectManager = this.H;
        if (connectManager == null || !connectManager.b()) {
            Logger.d("Unable to set ZeroConf as preferred", new Object[0]);
        } else {
            this.I.a(gaiaDeviceIncarnation.getCosmosIdentifier());
            this.L.a(SpotifyIconV2.CHECK, C0707R.string.connect_device_connection_updated, 1);
        }
        finish();
    }

    public void c1(GaiaDevice gaiaDevice, GaiaDeviceIncarnation gaiaDeviceIncarnation, View view) {
        InteractionIntent interactionIntent;
        int i = e90.i;
        b1((p90) l70.o(view, p90.class));
        String loggingIdentifier = gaiaDevice.getLoggingIdentifier();
        int ordinal = gaiaDeviceIncarnation.getTech().ordinal();
        if (ordinal == 1 || ordinal == 2) {
            InteractionIntent interactionIntent2 = InteractionIntent.DEFAULT_CAST;
            ((zt0) this.O.a()).l(loggingIdentifier, T);
            interactionIntent = interactionIntent2;
        } else {
            ((zt0) this.O.a()).m(loggingIdentifier, T);
            interactionIntent = InteractionIntent.DEFAULT_CONNECT;
        }
        this.K.a(je.B0(je.V0("connect-context-menu/"), T, "/item/"), interactionIntent, PageIdentifiers.CONNECT_CONTEXTMENU, ViewUris.A1);
        d1(gaiaDeviceIncarnation);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        ViewProvider viewProvider;
        super.onCreate(bundle);
        setContentView(C0707R.layout.empty_layout);
        Intent intent = getIntent();
        Assertion.e(intent);
        GaiaDevice gaiaDevice = (GaiaDevice) intent.getParcelableExtra("device");
        int unused = T = intent.getIntExtra("index", -1);
        Assertion.e(gaiaDevice);
        this.J.p(this.S);
        this.G = this.N.d();
        l90 l90 = new l90(this);
        this.Q = l90;
        l90.setOnDismissListener(new b());
        l90 l902 = this.Q;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this).inflate(C0707R.layout.connect_device_dropdown, (ViewGroup) null);
        d dVar = new d(this, this.M);
        this.R = dVar;
        viewGroup.addView(d.e(dVar, viewGroup, gaiaDevice).getView());
        Intent intent2 = getIntent();
        Assertion.e(intent2);
        ArrayList<GaiaDeviceIncarnation> parcelableArrayListExtra = intent2.getParcelableArrayListExtra("gaia_incarnations");
        Assertion.e(parcelableArrayListExtra);
        if (!parcelableArrayListExtra.isEmpty()) {
            for (GaiaDeviceIncarnation gaiaDeviceIncarnation : parcelableArrayListExtra) {
                boolean isPreferred = gaiaDeviceIncarnation.isPreferred();
                Tech tech = gaiaDeviceIncarnation.getTech();
                u90 c2 = d.c(this.R, viewGroup, U.get(tech), V.get(tech), isPreferred, new c(this, gaiaDeviceIncarnation));
                ViewGroup viewGroup2 = (ViewGroup) c2.getView();
                viewGroup2.setClickable(true);
                viewGroup2.setOnClickListener(new a(this, gaiaDevice, gaiaDeviceIncarnation));
                String loggingIdentifier = gaiaDevice.getLoggingIdentifier();
                int ordinal = gaiaDeviceIncarnation.getTech().ordinal();
                if (ordinal == 1 || ordinal == 2) {
                    ((vt0) this.O.b()).a(loggingIdentifier, T);
                } else {
                    ((vt0) this.O.b()).b(loggingIdentifier, T);
                }
                viewGroup.addView(c2.getView());
                this.P.add(c2);
            }
        }
        Intent intent3 = getIntent();
        Assertion.e(intent3);
        if (intent3.getBooleanExtra("gaia_support_logout", false)) {
            ((vt0) this.O.b()).c(gaiaDevice.getLoggingIdentifier(), T);
            viewGroup.addView(d.f(this.R, viewGroup, new b(this, gaiaDevice)).getView());
        }
        Intent intent4 = getIntent();
        Assertion.e(intent4);
        ArrayList<vm4> parcelableArrayListExtra2 = intent4.getParcelableArrayListExtra("gaia_capabilities");
        if (!parcelableArrayListExtra2.isEmpty()) {
            for (vm4 vm4 : parcelableArrayListExtra2) {
                if (MoreObjects.isNullOrEmpty(vm4.c())) {
                    viewProvider = d.a(this.R, viewGroup, vm4.e(), new c(gaiaDevice, vm4, this, null));
                } else {
                    viewProvider = d.b(this.R, viewGroup, vm4.e(), vm4.c(), new c(gaiaDevice, vm4, this, null));
                }
                ((vt0) this.O.b()).d(gaiaDevice.getLoggingIdentifier(), T);
                viewGroup.addView(viewProvider.getView());
            }
        }
        l902.a(viewGroup);
        this.Q.show();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onDestroy() {
        this.J.q(this.S);
        this.P.clear();
        l90 l90 = this.Q;
        if (l90 != null && l90.isShowing()) {
            this.Q.setOnDismissListener(null);
            this.Q.dismiss();
        }
        super.onDestroy();
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
        this.J.i();
        super.onStart();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStop() {
        this.J.j();
        super.onStop();
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.CONNECT_CONTEXTMENU, ViewUris.A1.toString());
    }
}

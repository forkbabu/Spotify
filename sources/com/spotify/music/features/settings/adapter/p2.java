package com.spotify.music.features.settings.adapter;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.protobuf.u;
import com.spotify.encore.foundation.R;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.libs.connect.ConnectManager;
import com.spotify.libs.connect.ConnectStates$State;
import com.spotify.messages.CanvasPreference;
import com.spotify.messages.VoiceAdLog;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.i;
import com.spotify.mobile.android.util.t;
import com.spotify.mobile.android.util.ui.TextLabelUtil;
import com.spotify.mobile.android.util.x;
import com.spotify.music.C0707R;
import com.spotify.music.autoplay.a0;
import com.spotify.music.features.ads.cmp.CMPActivity;
import com.spotify.music.features.localfilesimport.model.PageType;
import com.spotify.music.features.localfilesimport.util.LocalFilesImportMessaging;
import com.spotify.music.features.settings.AudioQualityFlag;
import com.spotify.music.features.settings.SettingsFragment;
import com.spotify.music.features.settings.adapter.model.ResyncBitratePreference;
import com.spotify.music.features.settings.c0;
import com.spotify.music.features.settings.deletecache.StorageDeleteCacheActivity;
import com.spotify.music.features.settings.soundeffects.SoundEffectsWarningActivity;
import com.spotify.music.features.settings.v0;
import com.spotify.music.features.settings.w0;
import com.spotify.music.features.settings.x0;
import com.spotify.music.libs.carmodeengine.util.y;
import com.spotify.music.libs.facebook.FacebookPlaceholderActivity;
import com.spotify.music.libs.podcast.download.f0;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.voice.VoiceSpeechLocale;
import com.spotify.music.libs.voice.VoiceTtsOption;
import com.spotify.music.premiummini.k;
import com.spotify.music.samsungpersonalization.SamsungPersonalizationSettingsHandler;
import com.spotify.music.settings.SettingsState;
import com.spotify.music.settings.a;
import com.spotify.music.z0;
import com.spotify.remoteconfig.AppsMusicLibsRemoteconfigProperties;
import com.spotify.remoteconfig.cj;
import com.spotify.remoteconfig.pj;
import com.spotify.ubi.specification.factories.r3;
import defpackage.jk8;
import defpackage.ov9;
import defpackage.sba;
import defpackage.y6a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class p2 extends BaseAdapter {
    private static final int j1 = ViewType.w.length;
    private static final Pattern k1 = Pattern.compile("<br>");
    public static final /* synthetic */ int l1 = 0;
    private final ere A;
    private boolean A0;
    private final r3 B;
    private boolean B0;
    private final sba.a C;
    private boolean C0;
    private final nl2 D;
    private final boolean D0;
    private final i E;
    private final boolean E0;
    private final er0 F;
    private final boolean F0;
    private final lr0 G;
    private final boolean G0;
    private final mk8 H;
    private final boolean H0;
    private final wj8 I;
    private final boolean I0;
    private final SnackbarManager J;
    private final boolean J0;
    private final k K;
    private final boolean K0;
    private final z0 L;
    private boolean L0;
    private final String M;
    private boolean M0;
    private final String N;
    private boolean N0;
    private final lr9 O;
    private final String O0;
    private final com.spotify.music.features.localfilesimport.util.b P;
    private String P0;
    private final ov9.a Q;
    private String Q0;
    private final String R;
    private boolean R0;
    private final boolean S;
    private int S0;
    private final Random T;
    private boolean T0;
    private final SamsungPersonalizationSettingsHandler U;
    private final com.spotify.music.inappmessaging.b U0;
    private SettingsState V;
    private final com.spotify.music.settings.a V0;
    private List<Item> W = new ArrayList();
    private ConnectManager.ConnectState W0;
    private final List<Item> X = new ArrayList();
    private boolean X0;
    private Predicate<Item> Y;
    private boolean Y0;
    private m2 Z;
    private boolean Z0;
    private final com.spotify.android.flags.c a;
    private o2 a0;
    private boolean a1;
    private final Context b;
    private e b0;
    private boolean b1;
    private final Resources c;
    String[] c0;
    private final boolean c1;
    String[] d0;
    private final boolean d1;
    String[] e0;
    private final boolean e1;
    private final cqe f;
    String[] f0;
    private final boolean f1;
    jk8.c g0 = new w2();
    private final boolean g1;
    jk8.c h0 = new j2();
    private final boolean h1;
    private final i2 i0;
    private final com.spotify.music.libs.voice.e i1;
    private final nk8 j0;
    private final ok8 k0;
    private boolean l0;
    private final boolean m0;
    private final fm9 n;
    private final String[] n0;
    private final uda o;
    private final jk8.c o0 = new a(this);
    private final com.spotify.music.features.datasavermode.settings.e p;
    private kk8 p0;
    private final SpSharedPreferences<Object> q;
    private final boolean q0;
    private final kz1 r;
    private boolean r0;
    private final AppsMusicLibsRemoteconfigProperties s;
    private boolean s0;
    private final dca t;
    private boolean t0;
    private final com.spotify.credentials.store.b u;
    private boolean u0;
    private final sv3 v;
    private boolean v0;
    private final gl0<u> w;
    private final boolean w0;
    private final mba x;
    private boolean x0;
    private final m52 y;
    private final boolean y0;
    private final w0 z;
    private boolean z0;

    class a implements jk8.c {
        private int[] a = {2, 1, 0};

        a(p2 p2Var) {
        }

        @Override // defpackage.jk8.c
        public Optional<Integer> a(int i) {
            int a2 = org.apache.commons.lang3.a.a(this.a, i);
            if (a2 == -1) {
                return Optional.of(Integer.valueOf(org.apache.commons.lang3.a.a(this.a, 1)));
            }
            return Optional.of(Integer.valueOf(a2));
        }

        @Override // defpackage.jk8.c
        public int b(int i) {
            return this.a[i];
        }

        @Override // defpackage.jk8.c
        public int c() {
            throw new UnsupportedOperationException();
        }
    }

    class b implements jk8.c {
        b(p2 p2Var) {
        }

        @Override // defpackage.jk8.c
        public Optional<Integer> a(int i) {
            return Optional.of(Integer.valueOf(i));
        }

        @Override // defpackage.jk8.c
        public int b(int i) {
            return i;
        }

        @Override // defpackage.jk8.c
        public int c() {
            throw new UnsupportedOperationException();
        }
    }

    class c implements jk8.c {
        c(p2 p2Var) {
        }

        @Override // defpackage.jk8.c
        public Optional<Integer> a(int i) {
            return Optional.of(Integer.valueOf(i));
        }

        @Override // defpackage.jk8.c
        public int b(int i) {
            return i;
        }

        @Override // defpackage.jk8.c
        public int c() {
            throw new UnsupportedOperationException();
        }
    }

    class d implements jk8.c {
        d(p2 p2Var) {
        }

        @Override // defpackage.jk8.c
        public Optional<Integer> a(int i) {
            return Optional.of(Integer.valueOf(i));
        }

        @Override // defpackage.jk8.c
        public int b(int i) {
            return i;
        }

        @Override // defpackage.jk8.c
        public int c() {
            throw new UnsupportedOperationException();
        }
    }

    public interface e {
    }

    public p2(Context context, Resources resources, com.spotify.android.flags.c cVar, t tVar, cqe cqe, fm9 fm9, uda uda, com.spotify.music.features.datasavermode.settings.e eVar, kz1 kz1, SpSharedPreferences<Object> spSharedPreferences, AppsMusicLibsRemoteconfigProperties appsMusicLibsRemoteconfigProperties, dca dca, com.spotify.credentials.store.b bVar, com.spotify.music.inappmessaging.b bVar2, sv3 sv3, com.spotify.music.settings.a aVar, dd0 dd0, gl0<u> gl0, mba mba, m52 m52, x0 x0Var, ere ere, r3 r3Var, nl2 nl2, m41 m41, y yVar, or9 or9, i iVar, mk8 mk8, boolean z2, boolean z3, cif cif, com.spotify.music.libs.voice.e eVar2, boolean z4, er0 er0, lr0 lr0, sba.a aVar2, wj8 wj8, nk8 nk8, ok8 ok8, com.spotify.music.email.e eVar3, com.spotify.music.features.ads.cmp.i iVar2, k kVar, z0 z0Var, String str, String str2, SnackbarManager snackbarManager, pj pjVar, cj cjVar, lr9 lr9, com.spotify.music.features.localfilesimport.util.b bVar3, SamsungPersonalizationSettingsHandler samsungPersonalizationSettingsHandler, ov9.a aVar3, String str3, boolean z5, Random random, boolean z6) {
        boolean z7 = true;
        this.X0 = true;
        this.Y0 = c7a.a.a();
        this.Z0 = true;
        this.a1 = true;
        spSharedPreferences.getClass();
        this.q = spSharedPreferences;
        cVar.getClass();
        this.a = cVar;
        context.getClass();
        this.b = context;
        resources.getClass();
        this.c = resources;
        cqe.getClass();
        this.f = cqe;
        fm9.getClass();
        this.n = fm9;
        uda.getClass();
        this.o = uda;
        eVar.getClass();
        this.p = eVar;
        kz1.getClass();
        this.r = kz1;
        nl2.getClass();
        this.D = nl2;
        kVar.getClass();
        this.K = kVar;
        z0Var.getClass();
        this.L = z0Var;
        str.getClass();
        this.M = str;
        str2.getClass();
        this.N = str2;
        this.i0 = new i2(context);
        this.j0 = nk8;
        this.k0 = ok8;
        this.O0 = tVar.c();
        this.y = m52;
        this.z = x0Var;
        this.A = ere;
        this.B = r3Var;
        this.C = aVar2;
        this.I = wj8;
        this.J = snackbarManager;
        this.O = lr9;
        this.P = bVar3;
        this.Q = aVar3;
        this.R = str3;
        this.S = z5;
        this.T = random;
        this.g1 = z6;
        this.P0 = "";
        this.z0 = cVar.M0(v0.c) == AudioQualityFlag.Value.VERY_HIGH_BITRATE;
        this.A0 = ((Boolean) cVar.M0(g51.e)).booleanValue() || f0.b(cVar);
        this.c0 = l(context);
        this.d0 = i(context);
        this.e0 = m(this.z0, kVar);
        this.f0 = j(this.z0, kVar);
        this.l0 = !MoreObjects.isNullOrEmpty((String) cVar.M0(v0.d));
        this.m0 = cjVar.b();
        this.n0 = new String[]{context.getString(C0707R.string.settings_loudness_environment_loud), context.getString(C0707R.string.settings_loudness_environment_normal), context.getString(C0707R.string.settings_loudness_environment_quiet)};
        this.t0 = !((Boolean) cVar.M0(em9.c)).booleanValue();
        this.v = sv3;
        this.v0 = on5.c(cVar);
        this.w0 = pjVar.b();
        this.q0 = !context.getPackageManager().queryIntentActivities(new Intent("android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL"), 65536).isEmpty();
        this.F0 = ((Boolean) cVar.M0(v0.e)).booleanValue();
        this.y0 = ((HashSet) dd0.a()).size() > 1;
        this.G0 = z2;
        this.H0 = z3;
        this.I0 = cif.c();
        this.i1 = eVar2;
        this.J0 = z4;
        this.K0 = Build.VERSION.SDK_INT >= 23 && or9.b();
        this.D0 = yVar.a(m41.a());
        this.E0 = yVar.c().d().booleanValue();
        this.c1 = eVar3.a();
        this.d1 = iVar2.a();
        this.e1 = (!this.A0 || !pjVar.a()) ? false : z7;
        this.f1 = pjVar.c();
        appsMusicLibsRemoteconfigProperties.getClass();
        this.s = appsMusicLibsRemoteconfigProperties;
        dca.getClass();
        this.t = dca;
        this.u = bVar;
        this.U0 = bVar2;
        this.V0 = aVar;
        gl0.getClass();
        this.w = gl0;
        this.x = mba;
        this.E = iVar;
        this.H = mk8;
        this.F = er0;
        this.G = lr0;
        this.U = samsungPersonalizationSettingsHandler;
        this.h1 = cjVar.a();
        h();
        J0();
    }

    private void J0() {
        this.W = Collections2.newArrayList(Collections2.filter((Iterable) this.X, (Predicate) L0()));
        notifyDataSetChanged();
    }

    private Predicate<Item> L0() {
        Predicate<Item> and = MoreObjects.and(new x2(), new l2(this.Q.d(), this.q0, this.A0, this.v0, this.w0, this.y0, this.s0, this.t0, this.F0, this.G0, this.B0, this.C0, this.D0, this.E0, this.u0, this.J0, this.K0, this.X0, this.c1, this.d1, this.f1, this.e1, this.S, this.g1, this.h1));
        SettingsState settingsState = this.V;
        boolean z2 = settingsState != null && settingsState.normalize();
        boolean c2 = this.v.c();
        if (!c2) {
            this.i1.k(false);
        }
        SettingsState settingsState2 = this.V;
        this.Y = MoreObjects.and(and, new k2(this.r0, z2, this.o.b(false), this.T0, this.L0, !c2, this.Z0, this.b1, settingsState2 != null && settingsState2.privateSession()));
        return and;
    }

    private hk8 e1(hk8 hk8, int i, ViewGroup viewGroup, boolean z2, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        if (!(hk8 instanceof gk8)) {
            x90 h = e90.d().h(this.b, viewGroup, false);
            gk8 gk8 = new gk8(h.getView(), h);
            gk8.getView().setTag(C0707R.id.glue_viewholder_tag, gk8);
            hk8 = gk8;
        }
        gk8 gk82 = (gk8) hk8;
        gk82.setId(i);
        gk82.w().requestLayout();
        gk82.w().setOnCheckedChangeListener(null);
        gk82.w().setChecked(z2);
        gk82.w().setOnCheckedChangeListener(onCheckedChangeListener);
        return hk8;
    }

    static void f(p2 p2Var, boolean z2) {
        p2Var.j0.a(ResyncBitratePreference.create(z2)).subscribe();
    }

    private hk8 f1(ViewGroup viewGroup, jk8 jk8, String[] strArr, jk8.c cVar, String[] strArr2, a.C0340a<Integer> aVar, sg0<SettingsState, Integer> sg0) {
        if (jk8 == null) {
            Context context = this.b;
            com.spotify.music.inappmessaging.b bVar = this.U0;
            SnackbarManager snackbarManager = this.J;
            com.spotify.music.settings.a aVar2 = this.V0;
            ere ere = this.A;
            r3 r3Var = this.B;
            x90 h = e90.d().h(context, viewGroup, false);
            jk8 = new jk8(h.getView(), h, aVar2, bVar, snackbarManager, ere, r3Var);
            jk8.getView().setTag(C0707R.id.glue_viewholder_tag, jk8);
        }
        jk8.E1(aVar);
        jk8.Z0(sg0);
        jk8.S0(new v2(this.b, strArr));
        jk8.A1(cVar);
        if (strArr2 != null) {
            jk8.b1(strArr2);
        }
        return jk8;
    }

    private hk8 g1(ViewGroup viewGroup, lk8 lk8, a.C0340a<Boolean> aVar, sg0<SettingsState, Boolean> sg0) {
        if (lk8 == null || (lk8 instanceof gk8)) {
            Context context = this.b;
            com.spotify.music.settings.a aVar2 = this.V0;
            x90 h = e90.d().h(context, viewGroup, false);
            lk8 = new lk8(h.getView(), h, aVar2);
            lk8.getView().setTag(C0707R.id.glue_viewholder_tag, lk8);
        }
        lk8.w().requestLayout();
        lk8.e0(aVar);
        lk8.J(sg0);
        return lk8;
    }

    private void h() {
        this.X.add(Item.EMPLOYEE_PODCASTS);
        this.X.add(Item.DATA_SAVER_MODE);
        this.X.add(Item.DOWNLOAD_PREFERRED_RESOURCE_TYPE);
        this.X.add(Item.EMAIL);
        if (!this.n.a(this.a) || ((Boolean) this.a.M0(g51.e)).booleanValue()) {
            this.X.add(Item.OFFLINE_MODE);
        }
        this.X.add(Item.CROSSFADE);
        this.X.add(Item.GAPLESS);
        this.X.add(Item.AUTOMIX);
        this.X.add(Item.PLAY_EXPLICIT_CONTENT);
        this.X.add(Item.UNAVAILABLE_TRACKS);
        this.X.add(Item.NORMALIZE);
        if (this.l0) {
            this.X.add(Item.LOUDNESS_ENVIRONMENT);
        }
        this.X.add(Item.SILENCE_TRIMMER);
        this.X.add(Item.SEND_BROADCASTS);
        this.X.add(Item.AUTOPLAY);
        if (this.D.a()) {
            this.X.add(Item.CANVAS);
        }
        if (((Boolean) this.a.M0(s9c.c)).booleanValue()) {
            this.X.add(Item.LANGUAGE_PREFERENCE);
        }
        this.X.add(Item.PRIVATE_SESSION);
        this.X.add(Item.LISTENING_ACTIVITY);
        if (!this.n.a(this.a)) {
            this.X.add(Item.RECENTLY_PLAYED_ARTISTS);
        }
        this.X.add(Item.FACEBOOK);
        this.X.add(Item.STREAM_NON_METERED_QUALITY);
        this.X.add(Item.STREAM_QUALITY);
        this.X.add(Item.DOWNLOAD_QUALITY);
        this.X.add(Item.DOWNLOAD_OVER_3G);
        this.X.add(Item.AUDIO_EFFECTS);
        this.X.add(Item.STORAGE_BAR);
        this.X.add(Item.DELETE_CACHE);
        this.X.add(Item.NOTIFICATIONS);
        this.X.add(Item.LOCAL_FILES_LIBRARY);
        this.X.add(Item.LOCAL_FILES_IMPORT);
        this.X.add(Item.AD_BOOKMARK_PAGE);
        this.X.add(Item.AD_PARTNER_PREFERENCES);
        this.X.add(Item.VOICE_ADS);
        if (this.v.c() || this.v.f()) {
            this.X.add(Item.VOICE_MIC_SETTINGS);
        } else {
            this.X.add(Item.VOICE_MIC_PERMISSION);
        }
        if (this.I0) {
            this.X.add(Item.VOICE_WAKE_WORD);
        }
        if (this.H0) {
            this.X.add(Item.VOICE_LANGUAGE);
        }
        if (this.S) {
            this.X.add(Item.SPOTIFY_VOICE_SETTINGS);
        }
        this.X.add(Item.VOICE_EULA);
        this.X.add(Item.VERSION);
        this.X.add(Item.BUG_REPORTING);
        this.X.add(Item.LICENSES);
        this.X.add(Item.LICENSING_INFO);
        this.X.add(Item.SCTA_INFO);
        this.X.add(Item.TERMS_CONDITIONS);
        this.X.add(Item.PRIVACY_POLICY);
        this.X.add(Item.COOKIE_SETTINGS);
        this.X.add(Item.SUPPORT);
        this.X.add(Item.DEVICE_PICKER);
        this.X.add(Item.LOCAL_DEVICE_SETTINGS);
        if (this.F.a()) {
            this.X.add(Item.CONNECT_IN_BACKGROUND);
        }
        this.X.add(Item.HOMETHING_ADD_DEVICE);
        this.X.add(Item.HOMETHING_SETTINGS);
        if (this.J0) {
            this.X.add(Item.VOICE_ASSISTANTS);
        }
        this.X.add(Item.APPS_NAVIGATION);
        if (this.U.b()) {
            this.X.add(Item.SAMSUNG_PERSONALIZATION);
        }
        this.X.add(Item.CAR_MODE_AVAILABILITY);
        this.X.add(Item.CAR_MODE_AUTO_ACTIVATION);
        this.X.add(Item.CAR_MODE_PREVENT_SCREEN_LOCK);
        this.X.add(Item.STORAGE);
        this.X.add(Item.LOGOUT);
        this.X.add(Item.DEBUG_TOOLS);
    }

    private static String[] i(Context context) {
        return new String[]{context.getString(C0707R.string.settings_bitrate_low), context.getString(C0707R.string.settings_bitrate_normal), context.getString(C0707R.string.settings_bitrate_high), context.getString(C0707R.string.settings_bitrate_very_high)};
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0026: APUT  (r7v2 java.lang.String[]), (3 ??[int, float, short, byte, char]), (r5v1 java.lang.String) */
    private static String[] j(boolean z2, k kVar) {
        String str = null;
        if (kVar.a()) {
            return new String[]{null, null, null, "mini-download-quality"};
        }
        String[] strArr = new String[4];
        strArr[0] = null;
        strArr[1] = null;
        strArr[2] = null;
        if (!z2) {
            str = "download-quality";
        }
        strArr[3] = str;
        return strArr;
    }

    private hk8 k(ViewGroup viewGroup, hk8 hk8) {
        return hk8 == null ? ik8.a(this.b, viewGroup) : hk8;
    }

    private static String[] l(Context context) {
        return new String[]{context.getString(C0707R.string.settings_bitrate_automatic), context.getString(C0707R.string.settings_bitrate_low), context.getString(C0707R.string.settings_bitrate_normal), context.getString(C0707R.string.settings_bitrate_high), context.getString(C0707R.string.settings_bitrate_very_high)};
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x002b: APUT  (r8v2 java.lang.String[]), (4 ??[int, float, short, byte, char]), (r6v1 java.lang.String) */
    private static String[] m(boolean z2, k kVar) {
        String str = null;
        if (kVar.a()) {
            return new String[]{null, null, null, null, "mini-streaming-quality"};
        }
        String[] strArr = new String[5];
        strArr[0] = null;
        strArr[1] = null;
        strArr[2] = null;
        strArr[3] = null;
        if (!z2) {
            str = "streaming-quality";
        }
        strArr[4] = str;
        return strArr;
    }

    private Intent q(com.spotify.music.libs.viewuri.c cVar) {
        return this.L.b(this.b, cVar.toString()).a();
    }

    private Intent r(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        return intent;
    }

    private String t(ViewGroup viewGroup, int i) {
        return viewGroup.getContext().getString(i);
    }

    public /* synthetic */ void A(Item item, CompoundButton compoundButton, boolean z2) {
        ((x0) this.z).h(item, ViewUris.c0.toString(), z2);
        this.U.e(z2);
    }

    public /* synthetic */ void A0(Item item, CompoundButton compoundButton, boolean z2) {
        a.C0340a<Integer> aVar = com.spotify.music.settings.a.r;
        this.A.a(this.B.g().c().a());
        ((x0) this.z).h(item, ViewUris.c0.toString(), z2);
        if (z2) {
            this.V0.b(aVar, 1);
        } else {
            this.V0.b(aVar, 4);
        }
    }

    public /* synthetic */ void B(Item item, View view) {
        com.spotify.music.libs.viewuri.c cVar = ViewUris.K1;
        Intent q2 = q(cVar);
        this.A.a(this.B.j().b().a(cVar.toString()));
        ((x0) this.z).e(item, ViewUris.c0.toString(), cVar.toString());
        this.b.startActivity(q2);
    }

    public /* synthetic */ String B0() {
        return VoiceTtsOption.h(this.T);
    }

    public /* synthetic */ void C(Item item, CompoundButton compoundButton, boolean z2) {
        this.t.a(z2);
        this.A.a(this.B.h().e().a());
        ((x0) this.z).h(item, ViewUris.c0.toString(), z2);
    }

    public void C0() {
        this.i0.a(new s2(this));
    }

    public /* synthetic */ void D(Item item, CompoundButton compoundButton, boolean z2) {
        this.G.a(z2);
        ((x0) this.z).h(item, ViewUris.c0.toString(), z2);
    }

    public void D0(Item item, View view) {
        boolean z2;
        this.A.a(this.B.k().d().a(""));
        ((x0) this.z).d(item, ViewUris.c0.toString());
        Context context = this.b;
        SpSharedPreferences<Object> spSharedPreferences = this.q;
        SpSharedPreferences.b<Object, Boolean> bVar = SoundEffectsWarningActivity.L;
        String[] systemSharedLibraryNames = context.getPackageManager().getSystemSharedLibraryNames();
        int length = systemSharedLibraryNames.length;
        boolean z3 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                z2 = false;
                break;
            } else if ("com.sony.device".equals(systemSharedLibraryNames[i])) {
                z2 = true;
                break;
            } else {
                i++;
            }
        }
        if (z2 || spSharedPreferences.d(SoundEffectsWarningActivity.L, false)) {
            z3 = true;
        }
        if (z3) {
            SoundEffectsWarningActivity.U0(new r2(this));
            return;
        }
        Context context2 = this.b;
        Intent intent = new Intent(context2, SoundEffectsWarningActivity.class);
        intent.addFlags(1073741824);
        intent.addFlags(65536);
        context2.startActivity(intent);
    }

    public /* synthetic */ Integer E(SettingsState settingsState) {
        return Integer.valueOf(this.I.d());
    }

    public /* synthetic */ void E0(View view) {
        if (!ActivityManager.isUserAMonkey()) {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(this.b, "com.spotify.android.spotlets.debugtools.DebugMenuActivity"));
            this.b.startActivity(intent);
        }
    }

    public /* synthetic */ void F(int i, int i2) {
        this.I.f(i);
    }

    public /* synthetic */ void F0(Item item, View.OnClickListener onClickListener, View view) {
        this.A.a(this.B.a().e().a(""));
        ((x0) this.z).d(item, ViewUris.c0.toString());
        onClickListener.onClick(view);
    }

    public /* synthetic */ void G(CompoundButton compoundButton, boolean z2) {
        this.I.g(z2);
    }

    public void G0(Item item, View view) {
        this.A.a(this.B.m().b().a());
        ((x0) this.z).c(item, ViewUris.c0.toString());
        this.u.a();
        this.r.a();
    }

    public /* synthetic */ void H(Item item, boolean z2) {
        this.A.a(this.B.o().d().a());
        ((x0) this.z).h(item, ViewUris.c0.toString(), z2);
    }

    public /* synthetic */ void H0(Item item, View view) {
        this.A.a(this.B.p().b().a(""));
        ((x0) this.z).d(item, ViewUris.c0.toString());
        Intent intent = new Intent(this.b, StorageDeleteCacheActivity.class);
        intent.addFlags(1073741824);
        intent.addFlags(65536);
        this.b.startActivity(intent);
    }

    public /* synthetic */ void I(CompoundButton compoundButton, boolean z2) {
        this.I.i(z2);
    }

    public /* synthetic */ void I0(Integer num) {
        if (num.intValue() != 0) {
            ((Activity) this.b).runOnUiThread(new i1(this));
        }
    }

    public /* synthetic */ void J(Item item, boolean z2) {
        this.A.a(this.B.k().c().a());
        ((x0) this.z).h(item, ViewUris.c0.toString(), z2);
    }

    public /* synthetic */ void K(Item item, int i, int i2) {
        this.A.a(this.B.k().f().a());
        ((x0) this.z).g(item, ViewUris.c0.toString(), this.c0[i]);
    }

    public void K0() {
        L0();
    }

    public /* synthetic */ void L(Item item, int i, int i2) {
        this.A.a(this.B.k().e().b());
        ((x0) this.z).g(item, ViewUris.c0.toString(), this.c0[i]);
    }

    public void M(Item item, int i, int i2) {
        this.A.a(this.B.k().b().b());
        ((x0) this.z).g(item, ViewUris.c0.toString(), this.d0[i]);
        this.j0.a(ResyncBitratePreference.create(false)).subscribe();
        if (i >= i2) {
            z0 z0Var = new z0(this);
            this.H.a().P().j0(c1.a).subscribe(new c(z0Var), r.a);
        }
    }

    public void M0(String str) {
        this.Q0 = (String) x.n(str, "");
        J0();
    }

    public /* synthetic */ void N(Item item, View view) {
        this.A.a(this.B.o().b().a(""));
        ((x0) this.z).d(item, ViewUris.c0.toString());
        Context context = view.getContext();
        context.startActivity(new Intent(context, FacebookPlaceholderActivity.class));
    }

    public void N0(boolean z2) {
        this.Y0 = z2;
    }

    public /* synthetic */ void O(Item item, View view) {
        Intent r2 = r("spotify:internal:licenses");
        this.A.a(this.B.a().i().a("spotify:internal:licenses"));
        ((x0) this.z).e(item, ViewUris.c0.toString(), "spotify:internal:licenses");
        this.b.startActivity(r2);
    }

    public void O0(y6a y6a) {
        this.I.h(y6a);
        y6a.getClass();
        this.Z0 = y6a instanceof y6a.c;
        L0();
        this.b1 = y6a instanceof y6a.c;
        L0();
        notifyDataSetChanged();
    }

    public /* synthetic */ void P(ViewGroup viewGroup, Item item, View view) {
        String t2 = t(viewGroup, C0707R.string.licensing_info_url);
        Intent r2 = r(t2);
        this.A.a(this.B.a().c().a(t2));
        ((x0) this.z).e(item, ViewUris.c0.toString(), t2);
        this.b.startActivity(r2);
    }

    public void P0(boolean z2) {
        this.a1 = z2;
    }

    public /* synthetic */ void Q(ViewGroup viewGroup, Item item, View view) {
        String t2 = t(viewGroup, C0707R.string.scta_info_url);
        Intent r2 = r(t2);
        this.A.a(this.B.a().f().a(t2));
        ((x0) this.z).e(item, ViewUris.c0.toString(), t2);
        this.b.startActivity(r2);
    }

    public void Q0(ConnectManager.ConnectState connectState) {
        this.W0 = connectState;
    }

    public /* synthetic */ void R(ViewGroup viewGroup, Item item, View view) {
        String t2 = t(viewGroup, C0707R.string.terms_and_conditions_url);
        Intent r2 = r(t2);
        this.A.a(this.B.a().h().a(t2));
        ((x0) this.z).e(item, ViewUris.c0.toString(), t2);
        this.b.startActivity(r2);
    }

    public void R0(boolean z2) {
        this.X0 = z2;
    }

    public /* synthetic */ void S(Item item, CompoundButton compoundButton, boolean z2) {
        this.A.a(this.B.o().c().a());
        ((x0) this.z).h(item, ViewUris.c0.toString(), z2);
        m2 m2Var = this.Z;
        if (m2Var != null) {
            ((SettingsFragment) m2Var).i5(z2);
        }
    }

    public void S0(boolean z2) {
        this.T0 = z2;
        L0();
        notifyDataSetChanged();
    }

    public /* synthetic */ void T(ViewGroup viewGroup, Item item, View view) {
        String t2 = t(viewGroup, C0707R.string.support_url);
        Intent r2 = r(t2);
        this.A.a(this.B.a().g().a(t2));
        ((x0) this.z).e(item, ViewUris.c0.toString(), t2);
        this.b.startActivity(r2);
    }

    public void T0(boolean z2) {
        if (this.B0 != z2) {
            this.B0 = z2;
            J0();
        }
    }

    public /* synthetic */ void U(ViewGroup viewGroup, Item item, View view) {
        String t2 = t(viewGroup, C0707R.string.voice_eula_url);
        Intent r2 = r(t2);
        this.A.a(this.B.q().b().a(t2));
        ((x0) this.z).e(item, ViewUris.c0.toString(), t2);
        if (!this.b.getPackageManager().queryIntentActivities(r2, 65536).isEmpty()) {
            this.b.startActivity(r2);
        }
    }

    public void U0(boolean z2) {
        this.x0 = z2;
    }

    public /* synthetic */ void V(CompoundButton compoundButton, boolean z2) {
        if (z2) {
            this.v.e();
        }
    }

    public void V0(e eVar) {
        this.b0 = eVar;
    }

    public void W(View view) {
        Context context = this.b;
        context.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", context.getPackageName(), null)));
    }

    public void W0(String str) {
        this.P0 = (String) x.n(str, "");
        J0();
    }

    public /* synthetic */ void X(CompoundButton compoundButton, boolean z2) {
        this.A.a(this.B.q().c().a());
        this.i1.k(z2);
    }

    public void X0(boolean z2) {
        this.R0 = z2;
    }

    public /* synthetic */ Integer Y(SettingsState settingsState) {
        return Integer.valueOf(VoiceTtsOption.k(this.i1.a(new n0(this))));
    }

    public void Y0(m2 m2Var) {
        this.Z = m2Var;
    }

    public /* synthetic */ void Z(int i, int i2) {
        this.i1.j(VoiceTtsOption.g(i).i());
    }

    public void Z0(o2 o2Var) {
        this.a0 = o2Var;
    }

    public /* synthetic */ Integer a0(SettingsState settingsState) {
        return Integer.valueOf(org.apache.commons.lang3.a.b(VoiceSpeechLocale.c, this.i1.f()));
    }

    public void a1(boolean z2) {
        if (z2 != this.r0) {
            this.r0 = z2;
            J0();
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    public /* synthetic */ void b0(int i, int i2) {
        this.i1.g(VoiceSpeechLocale.c[i]);
    }

    public void b1(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        boolean z10 = this.z0 != z3;
        this.M0 = z10;
        this.N0 = z10;
        this.z0 = z3;
        this.A0 = z2;
        this.l0 = z4;
        this.c0 = l(this.b);
        this.d0 = i(this.b);
        this.e0 = m(this.z0, this.K);
        this.f0 = j(this.z0, this.K);
        this.t0 = z6;
        this.s0 = z7;
        this.u0 = z8;
        this.v0 = z5;
        this.C0 = z9;
        J0();
    }

    public /* synthetic */ void c0(Item item, CompoundButton compoundButton, boolean z2) {
        this.A.a(this.B.o().e().a());
        ((x0) this.z).h(item, ViewUris.c0.toString(), z2);
        o2 o2Var = this.a0;
        if (o2Var != null) {
            ((SettingsFragment) o2Var).j5(z2);
        }
    }

    public void c1(int i) {
        this.S0 = i;
        notifyDataSetChanged();
    }

    public /* synthetic */ void d0(View view) {
        this.b.startActivity(q(ViewUris.H2));
    }

    public void d1(boolean z2) {
        if (this.L0 != z2) {
            this.L0 = z2;
            J0();
        }
    }

    public /* synthetic */ void e0(ViewGroup viewGroup, Item item, View view) {
        String t2 = t(viewGroup, C0707R.string.terms_and_conditions_privacy_policy_url);
        Intent r2 = r(t2);
        this.A.a(this.B.a().d().a(t2));
        ((x0) this.z).e(item, ViewUris.c0.toString(), t2);
        this.b.startActivity(r2);
    }

    public void f0(Item item, View view) {
        Context context = this.b;
        int i = CMPActivity.G;
        Intent intent = new Intent(context, CMPActivity.class);
        this.A.a(this.B.a().b().a("https://c.spotify.com"));
        ((x0) this.z).e(item, ViewUris.c0.toString(), "https://c.spotify.com");
        this.b.startActivity(intent);
    }

    public void g() {
        kk8 kk8 = this.p0;
        if (kk8 != null) {
            kk8.b();
        }
        this.v.a();
    }

    public /* synthetic */ void g0(ViewGroup viewGroup, Item item, View view) {
        String t2 = t(viewGroup, C0707R.string.settings_ad_bookmark_page_title);
        Intent q2 = q(ViewUris.i1);
        this.A.a(this.B.d().c().a(t2));
        ((x0) this.z).e(item, ViewUris.c0.toString(), t2);
        this.b.startActivity(q2);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.W.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (i < this.W.size()) {
            return this.W.get(i);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return (long) i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        if (i < this.W.size()) {
            return this.W.get(i).k().ordinal();
        }
        Assertion.p("Unknown position when fetching item view type");
        return -1;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:54:0x0398 */
    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        ck8 ck8;
        CharSequence charSequence;
        String str;
        String str2;
        hk8 hk8;
        String str3;
        String str4;
        hk8 hk82;
        String string;
        String string2;
        String str5;
        String string3;
        hk8 hk83;
        hk8 hk84;
        String str6;
        hk8 hk85;
        String str7;
        String str8;
        MoreObjects.checkElementIndex(i, this.W.size(), "index");
        hk8 hk86 = (hk8) l70.p(view, hk8.class);
        Item item = this.W.get(i);
        String str9 = "";
        ek8 ek8 = hk86;
        kk8 kk8 = hk86;
        switch (item.ordinal()) {
            case 0:
                str9 = this.c.getString(C0707R.string.settings_employee_podcasts_title);
                charSequence = this.c.getString(C0707R.string.settings_employee_podcasts_description);
                hk8 k = k(viewGroup, hk86);
                k.setOnClickListener(new l0(this, item));
                k.setId(C0707R.id.settings_employee_podcasts);
                ck8 = k;
                break;
            case 1:
                str9 = this.c.getString(C0707R.string.data_saver_mode_title);
                str2 = this.c.getString(C0707R.string.data_saver_mode_subtitle);
                hk8 = e1(hk86, C0707R.id.settings_data_saver_mode, viewGroup, this.o.b(false), new i0(this));
                charSequence = str2;
                ck8 = hk8;
                break;
            case 2:
                str9 = this.c.getString(C0707R.string.settings_email_title);
                charSequence = this.c.getString(C0707R.string.settings_account_description);
                hk8 k2 = k(viewGroup, hk86);
                k2.setOnClickListener(new q0(this));
                ck8 = k2;
                break;
            case 3:
                str9 = this.c.getString(C0707R.string.settings_offline_title);
                String string4 = this.c.getString(f0.b(this.a) ? C0707R.string.settings_offline_description_shows : C0707R.string.settings_offline_description);
                SettingsState settingsState = this.V;
                charSequence = string4;
                if (settingsState != null) {
                    charSequence = string4;
                    if (settingsState.offlineMode()) {
                        int secondsToOfflineExpiry = this.V.secondsToOfflineExpiry();
                        charSequence = string4;
                        if (secondsToOfflineExpiry >= 0) {
                            TimeUnit timeUnit = TimeUnit.SECONDS;
                            long j = (long) secondsToOfflineExpiry;
                            int hours = (int) timeUnit.toHours(j);
                            int days = (int) timeUnit.toDays(j);
                            if (days > 0) {
                                str = this.c.getString(f0.b(this.a) ? C0707R.string.settings_offline_active_description_days_shows : C0707R.string.settings_offline_active_description_days, Integer.valueOf(days));
                            } else if (hours > 0) {
                                str = this.c.getString(f0.b(this.a) ? C0707R.string.settings_offline_active_description_hours_shows : C0707R.string.settings_offline_active_description_hours, Integer.valueOf(hours));
                            } else {
                                str = this.c.getString(f0.b(this.a) ? C0707R.string.settings_offline_active_but_expired_description_shows : C0707R.string.settings_offline_active_but_expired_description);
                            }
                            charSequence = k1.matcher(str).replaceAll("\n");
                        }
                    }
                }
                hk8 g12 = g1(viewGroup, (lk8) hk86, com.spotify.music.settings.a.d, k.a);
                ((bk8) g12).setId(C0707R.id.settings_offline);
                ((lk8) g12).W(new o(this, item));
                ck8 = g12;
                break;
            case 4:
                str9 = this.c.getString(C0707R.string.settings_crossfade_title);
                charSequence = this.c.getString(C0707R.string.settings_crossfade_description);
                dk8 dk8 = hk86;
                if (hk86 == null) {
                    Context context = this.b;
                    com.spotify.music.settings.a aVar = this.V0;
                    ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(context).inflate(C0707R.layout.settings_crossfade_row, viewGroup, false);
                    x90 h = e90.d().h(context, viewGroup, false);
                    viewGroup2.addView(h.getView(), 0, new LinearLayout.LayoutParams(-1, -2));
                    dk8 dk82 = new dk8(viewGroup2, h, aVar);
                    dk82.getView().setTag(C0707R.id.glue_viewholder_tag, dk82);
                    dk8 = dk82;
                }
                dk8.setId(C0707R.id.settings_crossfade);
                ((dk8) dk8).J0(new l1(this, item));
                ck8 = dk8;
                break;
            case 5:
                str9 = this.c.getString(C0707R.string.settings_gapless_title);
                charSequence = this.c.getString(C0707R.string.settings_gapless_description);
                hk8 g13 = g1(viewGroup, (lk8) hk86, com.spotify.music.settings.a.k, b.a);
                ((bk8) g13).setId(C0707R.id.settings_gapless);
                ((lk8) g13).W(new s1(this, item));
                ck8 = g13;
                break;
            case 6:
                str9 = this.c.getString(C0707R.string.settings_automix_title);
                charSequence = this.c.getString(C0707R.string.settings_automix_description);
                hk8 g14 = g1(viewGroup, (lk8) hk86, com.spotify.music.settings.a.l, i.a);
                ((bk8) g14).setId(C0707R.id.settings_automix);
                ((lk8) g14).W(new r0(this, item));
                ck8 = g14;
                break;
            case 7:
                str9 = this.c.getString(C0707R.string.settings_play_explicit_content_title);
                StringBuilder sb = new StringBuilder(this.c.getString(this.T0 ? C0707R.string.settings_play_explicit_content_description_locked : C0707R.string.settings_play_explicit_content_description));
                sb.append('\n');
                sb.append(this.c.getString(C0707R.string.settings_play_explicit_content_subtitle, "<EXPLICIT>"));
                int indexOf = sb.indexOf("<EXPLICIT>");
                CharSequence subSequence = sb.subSequence(0, indexOf);
                CharSequence subSequence2 = sb.subSequence(indexOf + 10, sb.length());
                sb.setLength(0);
                sb.append(subSequence);
                sb.append(subSequence2);
                charSequence = TextLabelUtil.c(this.b, sb, indexOf);
                hk8 g15 = g1(viewGroup, (lk8) hk86, com.spotify.music.settings.a.e, d.a);
                ((bk8) g15).setId(C0707R.id.settings_play_explicit_content);
                if (this.T0) {
                    ((lk8) g15).w().setChecked(false);
                }
                ((lk8) g15).W(new g0(this, item));
                ck8 = g15;
                break;
            case 8:
                str9 = this.c.getString(C0707R.string.settings_unavailable_tracks_title);
                charSequence = this.c.getString(C0707R.string.settings_unavailable_tracks_description);
                hk8 g16 = g1(viewGroup, (lk8) hk86, com.spotify.music.settings.a.q, j.a);
                ((bk8) g16).setId(C0707R.id.settings_unavailable_tracks);
                ((lk8) g16).W(new e1(this, item));
                ck8 = g16;
                break;
            case 9:
                str9 = this.c.getString(C0707R.string.settings_normalize_title);
                charSequence = this.c.getString(C0707R.string.settings_normalize_description);
                hk8 g17 = g1(viewGroup, (lk8) hk86, com.spotify.music.settings.a.m, g2.a);
                ((bk8) g17).setId(C0707R.id.settings_normalize);
                ((lk8) g17).W(new k1(this, item));
                ck8 = g17;
                break;
            case 10:
                String string5 = this.c.getString(C0707R.string.settings_loudness_environment_title);
                if (this.m0) {
                    str8 = this.c.getString(C0707R.string.settings_loudness_environment_description_with_limiter_details);
                } else {
                    str8 = this.c.getString(C0707R.string.settings_loudness_environment_description);
                }
                hk8 f12 = f1(viewGroup, (jk8) hk86, this.n0, this.o0, null, com.spotify.music.settings.a.n, l.a);
                ((jk8) f12).z1(new t(this, item));
                str9 = string5;
                charSequence = str8;
                ck8 = f12;
                break;
            case 11:
                str9 = this.c.getString(C0707R.string.settings_silence_trimmer_title);
                charSequence = this.c.getString(C0707R.string.settings_silence_trimmer_description);
                hk8 g18 = g1(viewGroup, (lk8) hk86, com.spotify.music.settings.a.s, h2.a);
                ((bk8) g18).setId(C0707R.id.settings_silence_trimmer);
                ((lk8) g18).W(new u(this, item));
                ck8 = g18;
                break;
            case 12:
                str9 = this.c.getString(C0707R.string.settings_broadcast_status_title);
                charSequence = this.c.getString(C0707R.string.settings_broadcast_status_description);
                ck8 = hk86;
                if (hk86 == null) {
                    Context context2 = this.b;
                    i iVar = this.E;
                    x90 h2 = e90.d().h(context2, viewGroup, false);
                    ck8 ck82 = new ck8(h2.getView(), h2, iVar);
                    ck82.getView().setTag(C0707R.id.glue_viewholder_tag, ck82);
                    ck82.J(new e0(this, item));
                    ck8 = ck82;
                    break;
                }
                break;
            case 13:
                str9 = this.c.getString(C0707R.string.autoplay_settings_title);
                str2 = this.c.getString(C0707R.string.autoplay_settings_description);
                hk8 = e1(hk86, C0707R.id.settings_autoplay, viewGroup, this.q.d(a0.a, true), new f0(this, item));
                charSequence = str2;
                ck8 = hk8;
                break;
            case 14:
            case 16:
                charSequence = str9;
                ck8 = hk86;
                break;
            case 15:
                str9 = this.c.getString(C0707R.string.canvas_settings_title);
                str2 = this.c.getString(C0707R.string.canvas_settings_description);
                hk8 = e1(hk86, C0707R.id.settings_canvas, viewGroup, !this.o.b(false) && this.D.b(), new y0(this, item));
                charSequence = str2;
                ck8 = hk8;
                break;
            case 17:
                str9 = this.c.getString(C0707R.string.settings_connect_subtitle);
                charSequence = this.c.getString(C0707R.string.settings_connect_description);
                Intent a2 = this.C.a(this.b);
                fk8 fk8 = hk86;
                if (hk86 == null) {
                    fk8 = ik8.a(this.b, viewGroup);
                }
                fk8.setOnClickListener(new t1(this, item, a2));
                fk8.setId(C0707R.id.settings_connect_device_picker);
                ck8 = fk8;
                break;
            case 18:
                s52 a3 = t52.a(LinkType.NAVIGATION_APPS_SETTINGS);
                a3.getClass();
                str9 = this.c.getString(C0707R.string.settings_apps_navigation_title);
                String string6 = this.c.getString(C0707R.string.settings_apps_navigation_description);
                hk8 k3 = k(viewGroup, hk86);
                k3.setOnClickListener(new s(this, a3.a().get(0), item));
                k3.setId(C0707R.id.settings_apps_navigation);
                charSequence = string6;
                ck8 = k3;
                break;
            case 19:
                str9 = this.c.getString(C0707R.string.settings_apps_voice_assistants_title);
                charSequence = this.c.getString(C0707R.string.settings_apps_voice_assistants_description);
                hk8 k4 = k(viewGroup, hk86);
                k4.setOnClickListener(new c2(this, item));
                k4.setId(C0707R.id.settings_voice_assistants);
                ck8 = k4;
                break;
            case 20:
                str9 = this.c.getString(C0707R.string.settings_samsung_pzn_title);
                str2 = this.c.getString(C0707R.string.settings_samsung_pzn_description);
                hk8 e12 = e1(hk86, C0707R.id.settings_samsung_personalization, viewGroup, this.U.a(), new p0(this, item));
                e12.setId(C0707R.id.settings_samsung_personalization);
                hk8 = e12;
                charSequence = str2;
                ck8 = hk8;
                break;
            case 21:
                str9 = this.c.getString(C0707R.string.settings_language_preference_title);
                charSequence = this.c.getString(C0707R.string.settings_language_preference_description);
                hk8 k5 = k(viewGroup, hk86);
                k5.setOnClickListener(new d0(this, item));
                k5.setId(C0707R.id.settings_language_preference);
                ck8 = k5;
                break;
            case 22:
                str9 = this.c.getString(C0707R.string.connect_show_local_devices_title);
                str2 = this.c.getString(C0707R.string.connect_show_local_devices_description);
                hk8 = e1(hk86, C0707R.id.settings_local_device, viewGroup, this.t.b(), new q(this, item));
                charSequence = str2;
                ck8 = hk8;
                break;
            case 23:
                str4 = this.I.b();
                str3 = this.I.a();
                hk8 f13 = f1(viewGroup, (jk8) hk86, this.I.c(), new b(this), null, new a.C0340a<>(str9), new f1(this));
                ((bk8) f13).setId(C0707R.id.settings_car_mode_availability);
                ((jk8) f13).z1(new y1(this));
                hk82 = f13;
                str9 = str4;
                charSequence = str3;
                ck8 = hk82;
                break;
            case 24:
                str9 = this.c.getString(C0707R.string.settings_car_mode_auto_activation_title);
                str2 = this.c.getString(C0707R.string.settings_car_mode_auto_activation_description);
                hk8 = e1(hk86, C0707R.id.settings_car_mode_auto_activation, viewGroup, this.Y0, new v0(this));
                charSequence = str2;
                ck8 = hk8;
                break;
            case 25:
                str9 = this.c.getString(C0707R.string.settings_car_mode_prevent_screen_lock_title);
                str2 = this.c.getString(C0707R.string.settings_car_mode_prevent_screen_lock_description);
                hk8 = e1(hk86, C0707R.id.settings_car_mode_prevent_screen_lock, viewGroup, this.a1, new w1(this));
                charSequence = str2;
                ck8 = hk8;
                break;
            case 26:
                str9 = this.c.getString(C0707R.string.settings_private_session_title);
                charSequence = this.c.getString(C0707R.string.settings_private_session_description);
                hk8 g19 = g1(viewGroup, (lk8) hk86, com.spotify.music.settings.a.f, f2.a);
                ((bk8) g19).setId(C0707R.id.settings_private_session);
                ((lk8) g19).W(new w(this, item));
                ck8 = g19;
                break;
            case 27:
                str9 = this.c.getString(C0707R.string.settings_listening_activity_title);
                str2 = this.c.getString(C0707R.string.settings_listening_activity_description);
                hk8 e13 = e1(hk86, C0707R.id.settings_listening_activity, viewGroup, this.R0, new b0(this, item));
                e13.setEnabled(this.R0);
                hk8 = e13;
                charSequence = str2;
                ck8 = hk8;
                break;
            case 28:
                str9 = this.c.getString(C0707R.string.settings_show_recently_played_artists);
                str2 = this.c.getString(C0707R.string.settings_show_recently_played_artists_description);
                hk8 = e1(hk86, C0707R.id.settings_show_recently_played_artists, viewGroup, (this.S0 & 1) == 1, new a1(this, item));
                charSequence = str2;
                ck8 = hk8;
                break;
            case 29:
                if (hk86 == null) {
                    x90 h3 = e90.d().h(this.b, viewGroup, false);
                    ek8 ek82 = new ek8(h3.getView(), h3);
                    ek82.getView().setTag(C0707R.id.glue_viewholder_tag, ek82);
                    ek8 = ek82;
                }
                ek8.setOnClickListener(new m(this, item));
                kk8 = ek8;
                charSequence = null;
                str9 = null;
                ck8 = kk8;
                break;
            case 30:
                string = this.c.getString(C0707R.string.settings_stream_non_metered_quality_title);
                string2 = this.o.b(false) ? this.c.getString(C0707R.string.data_saver_mode_quality_subtitle) : null;
                hk8 hk87 = hk86;
                if (this.M0) {
                    this.M0 = false;
                    hk87 = null;
                }
                hk8 f14 = f1(viewGroup, (jk8) hk87, this.c0, this.g0, this.e0, com.spotify.music.settings.a.j, h.a);
                ((bk8) f14).setId(C0707R.id.settings_streaming_non_metered_quality);
                ((jk8) f14).z1(new b1(this, item));
                hk83 = f14;
                str9 = string;
                hk85 = hk83;
                charSequence = string2;
                ck8 = hk85;
                break;
            case 31:
                if (this.f1) {
                    str5 = this.c.getString(C0707R.string.settings_stream_quality_title);
                } else {
                    str5 = this.c.getString(C0707R.string.settings_stream_combined_quality_title);
                }
                string = str5;
                if (this.o.b(false)) {
                    string3 = this.c.getString(C0707R.string.data_saver_mode_quality_subtitle);
                } else if (this.f1) {
                    string3 = this.c.getString(C0707R.string.settings_stream_quality_description);
                } else {
                    string3 = this.c.getString(C0707R.string.settings_stream_combined_quality_description);
                }
                string2 = string3;
                hk8 hk88 = hk86;
                if (this.M0) {
                    this.M0 = false;
                    hk88 = null;
                }
                hk8 f15 = f1(viewGroup, (jk8) hk88, this.c0, this.g0, this.e0, com.spotify.music.settings.a.i, d2.a);
                ((bk8) f15).setId(C0707R.id.settings_streaming_quality);
                ((jk8) f15).z1(new n1(this, item));
                hk83 = f15;
                str9 = string;
                hk85 = hk83;
                charSequence = string2;
                ck8 = hk85;
                break;
            case 32:
                string = this.c.getString(C0707R.string.settings_download_quality_title);
                string2 = this.c.getString(C0707R.string.settings_download_quality_description);
                hk8 hk89 = hk86;
                if (this.N0) {
                    this.N0 = false;
                    hk89 = null;
                }
                hk8 f16 = f1(viewGroup, (jk8) hk89, this.d0, this.h0, this.f0, com.spotify.music.settings.a.h, e2.a);
                ((bk8) f16).setId(C0707R.id.settings_download_quality);
                ((jk8) f16).z1(new z(this, item));
                hk83 = f16;
                str9 = string;
                hk85 = hk83;
                charSequence = string2;
                ck8 = hk85;
                break;
            case 33:
                str9 = this.c.getString(C0707R.string.settings_download_over_3g_title);
                charSequence = this.c.getString(C0707R.string.settings_download_over_3g_description);
                hk8 g110 = g1(viewGroup, (lk8) hk86, com.spotify.music.settings.a.g, a.a);
                ((lk8) g110).W(new z1(this, item));
                ck8 = g110;
                break;
            case 34:
                str9 = this.b.getString(C0707R.string.settings_audio_effects);
                charSequence = this.b.getString(C0707R.string.settings_audio_effects_description);
                fk8 fk82 = hk86;
                if (hk86 == null) {
                    fk82 = ik8.a(this.b, viewGroup);
                }
                fk82.setOnClickListener(new a2(this, item));
                ck8 = fk82;
                break;
            case 35:
                if (hk86 == null) {
                    kk8 kk82 = new kk8(this.b, viewGroup, this.k0);
                    kk82.getView().setTag(C0707R.id.glue_viewholder_tag, kk82);
                    this.p0 = kk82;
                    registerDataSetObserver(new q2(this));
                    kk8 = this.p0;
                }
                charSequence = null;
                str9 = null;
                ck8 = kk8;
                break;
            case 36:
                str9 = this.b.getString(C0707R.string.settings_storage_delete_cache_title);
                charSequence = this.b.getString(C0707R.string.settings_storage_delete_cache_description);
                fk8 fk83 = hk86;
                if (hk86 == null) {
                    fk83 = ik8.a(this.b, viewGroup);
                }
                fk83.setOnClickListener(new c0(this, item));
                fk83.setId(C0707R.id.settings_delete_cache);
                ck8 = fk83;
                break;
            case 37:
                str9 = this.c.getString(C0707R.string.settings_notification_title);
                charSequence = this.c.getString(C0707R.string.settings_notification_description);
                hk8 k6 = k(viewGroup, hk86);
                k6.setOnClickListener(new x(this, item));
                ck8 = k6;
                break;
            case 38:
                str9 = this.c.getString(C0707R.string.settings_ad_bookmark_page_title);
                charSequence = this.c.getString(C0707R.string.settings_ad_bookmark_page_descirption);
                hk8 k7 = k(viewGroup, hk86);
                k7.setOnClickListener(new w0(this, viewGroup, item));
                ck8 = k7;
                break;
            case 39:
                str9 = this.c.getString(C0707R.string.settings_ad_partners_title);
                charSequence = this.c.getString(C0707R.string.settings_ad_partners_description);
                hk8 k8 = k(viewGroup, hk86);
                k8.setOnClickListener(new o0(this, viewGroup, item));
                ck8 = k8;
                break;
            case 40:
                str9 = this.c.getString(C0707R.string.settings_voice_ads_title);
                str2 = this.c.getString(C0707R.string.settings_voice_ads_description);
                hk8 = e1(hk86, C0707R.id.settings_voice_ads, viewGroup, this.v.d(), new j1(this, item));
                charSequence = str2;
                ck8 = hk8;
                break;
            case 41:
                str9 = this.b.getString(C0707R.string.settings_version);
                charSequence = this.O0;
                fk8 fk84 = hk86;
                if (hk86 == null) {
                    fk84 = ik8.a(this.b, viewGroup);
                }
                fk84.setOnClickListener(null);
                ((TextView) fk84.getView().findViewById(16908308)).setTextColor(androidx.core.content.a.b(this.b, R.color.white));
                ck8 = fk84;
                break;
            case 42:
                str9 = this.c.getString(C0707R.string.settings_licenses_title);
                charSequence = this.c.getString(C0707R.string.settings_licenses_description);
                hk8 k9 = k(viewGroup, hk86);
                k9.setOnClickListener(new m1(this, item));
                ck8 = k9;
                break;
            case 43:
                str9 = this.c.getString(C0707R.string.settings_licensing_info_title);
                charSequence = this.c.getString(C0707R.string.settings_licensing_info_description);
                hk8 k10 = k(viewGroup, hk86);
                k10.setOnClickListener(new h1(this, viewGroup, item));
                ck8 = k10;
                break;
            case 44:
                str9 = this.c.getString(C0707R.string.settings_scta_info_title);
                charSequence = this.c.getString(C0707R.string.settings_scta_info_description);
                hk8 k11 = k(viewGroup, hk86);
                k11.setOnClickListener(new p1(this, viewGroup, item));
                ck8 = k11;
                break;
            case 45:
                str9 = this.c.getString(C0707R.string.settings_legal_terms_and_conditions_title);
                charSequence = this.c.getString(C0707R.string.settings_legal_terms_and_conditions_description);
                hk8 k12 = k(viewGroup, hk86);
                k12.setOnClickListener(new m0(this, viewGroup, item));
                ck8 = k12;
                break;
            case 46:
                str9 = this.c.getString(C0707R.string.settings_legal_privacy_policy_title);
                charSequence = this.c.getString(C0707R.string.settings_legal_privacy_policy_description);
                hk8 k13 = k(viewGroup, hk86);
                k13.setOnClickListener(new p(this, viewGroup, item));
                ck8 = k13;
                break;
            case 47:
                str9 = this.c.getString(C0707R.string.settings_cookie_settings_subtitle);
                charSequence = this.c.getString(C0707R.string.settings_cookie_settings_description);
                hk8 k14 = k(viewGroup, hk86);
                k14.setOnClickListener(new a0(this, item));
                ck8 = k14;
                break;
            case 48:
                str9 = this.c.getString(C0707R.string.settings_voice_eula_title);
                charSequence = this.c.getString(C0707R.string.settings_voice_eula_description);
                hk8 k15 = k(viewGroup, hk86);
                k15.setOnClickListener(new v(this, viewGroup, item));
                ck8 = k15;
                break;
            case 49:
                String string7 = this.c.getString(C0707R.string.settings_voice_language_title);
                string2 = this.c.getString(C0707R.string.settings_voice_language_description);
                jk8 jk8 = (jk8) hk86;
                Resources resources = this.c;
                VoiceSpeechLocale[] voiceSpeechLocaleArr = VoiceSpeechLocale.c;
                hk8 f17 = f1(viewGroup, jk8, new String[]{resources.getString(voiceSpeechLocaleArr[0].d()), this.c.getString(voiceSpeechLocaleArr[1].d())}, new d(this), null, new a.C0340a<>(str9), new d1(this));
                ((jk8) f17).z1(new h0(this));
                str9 = string7;
                hk85 = f17;
                charSequence = string2;
                ck8 = hk85;
                break;
            case 50:
                str9 = this.c.getString(C0707R.string.settings_voice_mic_title);
                str2 = this.c.getString(C0707R.string.settings_voice_mic_description);
                hk8 = e1(hk86, C0707R.id.settings_voice_mic, viewGroup, false, new q1(this));
                charSequence = str2;
                ck8 = hk8;
                break;
            case 51:
                str6 = this.c.getString(C0707R.string.settings_voice_device_mic_title);
                hk8 k16 = k(viewGroup, hk86);
                k16.setOnClickListener(new j0(this));
                hk84 = k16;
                str9 = str6;
                charSequence = str9;
                ck8 = hk84;
                break;
            case 52:
                str9 = this.c.getString(C0707R.string.settings_voice_wake_word_title);
                str2 = this.c.getString(C0707R.string.settings_voice_wake_word_description);
                hk8 = e1(hk86, C0707R.id.settings_voice_ww, viewGroup, this.i1.d(), new u0(this));
                charSequence = str2;
                ck8 = hk8;
                break;
            case 53:
                str4 = this.c.getString(C0707R.string.settings_voice_tts_options_title);
                str3 = this.c.getString(C0707R.string.settings_voice_tts_options_description);
                hk8 f18 = f1(viewGroup, (jk8) hk86, VoiceTtsOption.d(this.b), new c(this), null, new a.C0340a<>(str9), new k0(this));
                ((jk8) f18).z1(new y(this));
                hk82 = f18;
                str9 = str4;
                charSequence = str3;
                ck8 = hk82;
                break;
            case 54:
                this.y.d("Username", this.Q0);
                this.y.d("App Build Package", this.R);
                str9 = this.y.a(this.b);
                charSequence = this.y.b(this.b);
                m52 m52 = this.y;
                fk8 fk85 = hk86;
                if (hk86 == null) {
                    fk85 = ik8.a(this.b, viewGroup);
                }
                Context context3 = this.b;
                context3.getClass();
                fk85.setOnClickListener(new v1(this, item, m52.c(context3)));
                ck8 = fk85;
                break;
            case 55:
                str9 = this.c.getString(C0707R.string.settings_support_title);
                charSequence = this.c.getString(C0707R.string.settings_support_description);
                hk8 k17 = k(viewGroup, hk86);
                k17.setOnClickListener(new b2(this, viewGroup, item));
                ck8 = k17;
                break;
            case 56:
                str9 = this.c.getString(C0707R.string.homething_add_device_title);
                charSequence = this.c.getString(C0707R.string.homething_add_device_description);
                hk8 k18 = k(viewGroup, hk86);
                k18.setOnClickListener(new x1(this, item));
                ck8 = k18;
                break;
            case 57:
                str9 = this.c.getString(C0707R.string.homething_settings_title);
                charSequence = this.c.getString(C0707R.string.homething_settings_description);
                hk8 k19 = k(viewGroup, hk86);
                k19.setOnClickListener(new o1(this, item));
                ck8 = k19;
                break;
            case 58:
                str9 = this.c.getString(C0707R.string.cache_migration_title);
                charSequence = this.c.getString(C0707R.string.cache_migration_subtitle);
                hk8 k20 = k(viewGroup, hk86);
                k20.setOnClickListener(new t0(this, item));
                ck8 = k20;
                break;
            case 59:
                str9 = this.c.getString(C0707R.string.settings_local_files_import_title);
                charSequence = this.c.getString(C0707R.string.settings_local_files_import_description);
                fk8 fk86 = hk86;
                if (hk86 == null) {
                    fk86 = ik8.a(this.b, viewGroup);
                }
                fk86.setOnClickListener(new n(this, item));
                ck8 = fk86;
                break;
            case 60:
                str9 = this.c.getString(C0707R.string.settings_local_files_library_title);
                str2 = this.c.getString(C0707R.string.settings_local_files_library_description);
                hk8 = e1(hk86, C0707R.id.settings_local_files_library, viewGroup, this.x0, new u1(this));
                charSequence = str2;
                ck8 = hk8;
                break;
            case 61:
                str6 = this.b.getString(C0707R.string.settings_logout);
                if (!this.P0.isEmpty()) {
                    str9 = this.b.getString(C0707R.string.settings_logged_in_as_user, this.P0);
                }
                if (hk86 == null) {
                    hk86 = ik8.a(this.b, viewGroup);
                }
                hk86.setOnClickListener(new r1(this, item));
                hk86.setId(C0707R.id.settings_logout);
                hk84 = hk86;
                str9 = str6;
                charSequence = str9;
                ck8 = hk84;
                break;
            case 62:
                int ordinal = this.s.b().ordinal();
                if (ordinal == 0) {
                    str7 = this.b.getString(C0707R.string.debug_tools_label_tooling);
                } else if (ordinal == 1) {
                    str7 = this.b.getString(C0707R.string.debug_tools_label_tools);
                } else if (ordinal != 2) {
                    str7 = this.b.getString(C0707R.string.debug_tools_label_tools);
                } else {
                    str7 = this.b.getString(C0707R.string.debug_tools_label_qa);
                }
                str9 = str7;
                charSequence = this.b.getString(C0707R.string.debug_setting_subtitle);
                fk8 fk87 = hk86;
                if (hk86 == null) {
                    fk87 = ik8.a(this.b, viewGroup);
                }
                fk87.setOnClickListener(new g1(this));
                ck8 = fk87;
                break;
            case 63:
                str9 = this.c.getString(C0707R.string.connect_in_background_title);
                str2 = this.c.getString(C0707R.string.connect_in_background_description);
                hk8 = e1(hk86, C0707R.id.settings_connect_in_background, viewGroup, this.G.b(), new x0(this, item));
                charSequence = str2;
                ck8 = hk8;
                break;
            case 64:
                str9 = this.c.getString(C0707R.string.settings_download_preferred_resource_type_title);
                str2 = this.c.getString(C0707R.string.settings_download_preferred_resource_type_description);
                SettingsState settingsState2 = this.V;
                hk8 = e1(hk86, C0707R.id.settings_download_preferred_resource_type, viewGroup, settingsState2 != null && settingsState2.downloadPreferredResourceType() == 1, new s0(this, item));
                charSequence = str2;
                ck8 = hk8;
                break;
            default:
                Assertion.p("Got unexpected position");
                return null;
        }
        ck8.setEnabled(isEnabled(i));
        ck8.setTitle(str9);
        ck8.B0(charSequence);
        SettingsState settingsState3 = this.V;
        if (settingsState3 != null) {
            ck8.v0(settingsState3);
        }
        return ck8.getView();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return j1;
    }

    public /* synthetic */ void h0(ViewGroup viewGroup, Item item, View view) {
        String t2 = t(viewGroup, C0707R.string.ad_partner_preferences_url);
        Intent r2 = r(t2);
        this.A.a(this.B.d().b().a(t2));
        ((x0) this.z).e(item, ViewUris.c0.toString(), t2);
        this.b.startActivity(r2);
    }

    public void h1(SettingsState settingsState) {
        this.V = settingsState;
        J0();
    }

    public void i0(Item item, CompoundButton compoundButton, boolean z2) {
        sv3 sv3 = this.v;
        if (!z2 || sv3.c()) {
            sv3.b(z2);
        } else {
            sv3.e();
        }
        this.A.a(this.B.d().d().a());
        ((x0) this.z).h(item, ViewUris.c0.toString(), z2);
        VoiceAdLog.c q2 = VoiceAdLog.q();
        q2.p(z2 ? "voice_optin" : "voice_optout");
        q2.r(this.f.d());
        q2.o("");
        this.w.c((VoiceAdLog) q2.build());
    }

    public void i1(boolean z2) {
        if (z2) {
            this.X.clear();
            h();
            J0();
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        return !this.Y.apply(this.W.get(i));
    }

    public /* synthetic */ void j0(Item item, View view) {
        this.A.a(this.B.i().b().a(""));
        ((x0) this.z).d(item, ViewUris.c0.toString());
        Intent a2 = this.P.a(this.b, this.a, PageType.FOLDERS, LocalFilesImportMessaging.DIALOG);
        a2.addFlags(65536);
        this.b.startActivity(a2);
    }

    public void k0(CompoundButton compoundButton, boolean z2) {
        e eVar = this.b0;
        if (eVar != null) {
            SettingsFragment.h5(((c0) eVar).a, z2);
        }
    }

    public /* synthetic */ void l0(Item item, boolean z2) {
        this.A.a(this.B.n().h().a());
        ((x0) this.z).h(item, ViewUris.c0.toString(), z2);
    }

    public /* synthetic */ void m0(Item item, boolean z2) {
        this.A.a(this.B.n().c().a());
        ((x0) this.z).h(item, ViewUris.c0.toString(), z2);
    }

    public void n(boolean z2) {
        this.v.b(z2);
    }

    public /* synthetic */ void n0(Item item, boolean z2) {
        this.A.a(this.B.n().g().a());
        ((x0) this.z).h(item, ViewUris.c0.toString(), z2);
    }

    public int o(int i) {
        if (i >= this.W.size()) {
            return 18;
        }
        return this.W.get(i).i(this.a).ordinal();
    }

    public /* synthetic */ void o0(Item item, boolean z2) {
        this.A.a(this.B.n().b().a());
        ((x0) this.z).h(item, ViewUris.c0.toString(), z2);
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0090: APUT  (r1v1 java.lang.String[]), (6 ??[int, float, short, byte, char]), (r3v13 java.lang.String) */
    public String[] p() {
        String str;
        String str2;
        if (this.r0) {
            StringBuilder S02 = je.S0(' ');
            S02.append(this.b.getString(C0707R.string.settings_section_unavailable_with_connect));
            str = S02.toString();
        } else {
            str = "";
        }
        String[] strArr = new String[19];
        strArr[0] = this.b.getString(C0707R.string.settings_section_employee_podcasts);
        strArr[1] = this.b.getString(C0707R.string.settings_section_data_saver);
        strArr[2] = this.b.getString(C0707R.string.settings_account_title);
        strArr[3] = this.b.getString(C0707R.string.settings_section_playback) + str;
        strArr[4] = this.b.getString(C0707R.string.settings_section_language);
        strArr[5] = this.b.getString(C0707R.string.settings_section_spotify_connect);
        if (this.J0) {
            str2 = this.b.getString(C0707R.string.settings_section_voice_assistants_and_apps);
        } else {
            str2 = this.b.getString(C0707R.string.settings_section_apps);
        }
        strArr[6] = str2;
        strArr[7] = this.b.getString(C0707R.string.settings_section_samsung_pzn);
        strArr[8] = this.b.getString(C0707R.string.settings_section_car);
        strArr[9] = this.b.getString(C0707R.string.settings_section_social) + str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.b.getString(this.f1 ? C0707R.string.settings_section_audio_quality : C0707R.string.settings_section_music_quality));
        sb.append(str);
        strArr[10] = sb.toString();
        strArr[11] = this.b.getString(C0707R.string.settings_storage_title);
        strArr[12] = this.b.getString(C0707R.string.settings_notification_title);
        strArr[13] = this.b.getString(C0707R.string.settings_section_import);
        strArr[14] = this.b.getString(C0707R.string.settings_section_advertisements);
        strArr[15] = this.b.getString(C0707R.string.settings_section_voice);
        strArr[16] = this.b.getString(C0707R.string.settings_section_help);
        strArr[17] = this.b.getString(C0707R.string.settings_section_about);
        strArr[18] = this.b.getString(C0707R.string.settings_section_other);
        return strArr;
    }

    public /* synthetic */ void p0(Item item, boolean z2) {
        this.A.a(this.B.n().k().a());
        ((x0) this.z).h(item, ViewUris.c0.toString(), z2);
    }

    public /* synthetic */ void q0(Item item, boolean z2) {
        J0();
        this.A.a(this.B.n().i().a());
        ((x0) this.z).h(item, ViewUris.c0.toString(), z2);
    }

    public /* synthetic */ void r0(Item item, int i, int i2) {
        this.A.a(this.B.n().l().a());
        ((x0) this.z).g(item, ViewUris.c0.toString(), this.n0[i]);
    }

    public int s() {
        return this.S0;
    }

    public /* synthetic */ void s0(Item item, boolean z2) {
        ((x0) this.z).h(item, ViewUris.c0.toString(), z2);
    }

    public /* synthetic */ void t0(Item item, int i) {
        this.A.a(this.B.n().f().a());
        ((x0) this.z).b(item, ViewUris.c0.toString(), i);
    }

    public void u(Item item, Intent intent, View view) {
        ConnectStates$State connectStates$State;
        this.A.a(this.B.h().b().a(""));
        w0 w0Var = this.z;
        com.spotify.music.libs.viewuri.c cVar = ViewUris.c0;
        ((x0) w0Var).d(item, cVar.toString());
        mba mba = this.x;
        ConnectManager.ConnectState connectState = this.W0;
        String path = PageIdentifiers.SETTINGS.path();
        String cVar2 = cVar.toString();
        mba.getClass();
        int ordinal = connectState.ordinal();
        if (ordinal == 1) {
            connectStates$State = ConnectStates$State.NO_DEVICES;
        } else if (ordinal == 2) {
            connectStates$State = ConnectStates$State.DEVICES_AVAILABLE;
        } else if (ordinal == 3) {
            connectStates$State = ConnectStates$State.PLAYING_FROM;
        } else if (ordinal != 4) {
            connectStates$State = ConnectStates$State.NONE;
        } else {
            connectStates$State = ConnectStates$State.CONNECTING;
        }
        mba.d(connectStates$State, path, cVar2);
        this.b.startActivity(intent);
    }

    public /* synthetic */ void u0(Item item, View view) {
        com.spotify.music.libs.viewuri.c cVar = ViewUris.V1;
        Intent q2 = q(cVar);
        this.A.a(this.B.m().c().a(cVar.toString()));
        ((x0) this.z).e(item, ViewUris.c0.toString(), cVar.toString());
        this.b.startActivity(q2);
    }

    public /* synthetic */ void v(Item item, View view) {
        Intent r2 = r("spotify:config:employee-podcasts");
        ((x0) this.z).e(item, ViewUris.c0.toString(), "spotify:config:employee-podcasts");
        this.b.startActivity(r2);
    }

    public /* synthetic */ void v0(Item item, View view) {
        Intent b2 = this.O.b(this.b);
        ere ere = this.A;
        r3.g.b c2 = this.B.h().c();
        com.spotify.music.libs.viewuri.c cVar = ViewUris.D2;
        ere.a(c2.a(cVar.toString()));
        ((x0) this.z).e(item, ViewUris.c0.toString(), cVar.toString());
        this.b.startActivity(b2);
    }

    public /* synthetic */ void w(Item item, boolean z2) {
        this.A.a(this.B.n().j().a());
        ((x0) this.z).h(item, ViewUris.c0.toString(), z2);
    }

    public /* synthetic */ void w0(Item item, View view) {
        Intent a2 = this.O.a(this.b);
        ere ere = this.A;
        r3.g.c d2 = this.B.h().d();
        com.spotify.music.libs.viewuri.c cVar = ViewUris.C2;
        ere.a(d2.a(cVar.toString()));
        ((x0) this.z).e(item, ViewUris.c0.toString(), cVar.toString());
        this.b.startActivity(a2);
    }

    public /* synthetic */ void x(Item item, View view) {
        com.spotify.music.libs.viewuri.c cVar = ViewUris.M1;
        Intent q2 = q(cVar);
        this.A.a(this.B.l().b().a(cVar.toString()));
        ((x0) this.z).e(item, ViewUris.c0.toString(), cVar.toString());
        this.b.startActivity(q2);
    }

    public /* synthetic */ void x0(Item item, CompoundButton compoundButton, boolean z2) {
        SpSharedPreferences.a<Object> b2 = this.q.b();
        b2.a(a0.a, z2);
        b2.i();
        this.A.a(this.B.n().d().a());
        ((x0) this.z).h(item, ViewUris.c0.toString(), z2);
    }

    public void y(Item item, View view) {
        s52 a2 = t52.a(LinkType.VOICE_ASSISTANTS_SETTINGS);
        a2.getClass();
        String str = a2.b().get(0);
        Intent r2 = r(str);
        this.A.a(this.B.r().a(str));
        ((x0) this.z).e(item, ViewUris.c0.toString(), str);
        this.b.startActivity(r2);
    }

    public /* synthetic */ void y0(Item item, CompoundButton compoundButton, boolean z2) {
        this.D.c(z2);
        gl0<u> gl0 = this.w;
        CanvasPreference.b m = CanvasPreference.m();
        m.m("settings_toggle");
        m.o(z2 ? "on" : "off");
        com.spotify.music.libs.viewuri.c cVar = ViewUris.c0;
        m.n(cVar.toString());
        gl0.c(m.build());
        this.A.a(this.B.n().e().a());
        ((x0) this.z).h(item, cVar.toString(), z2);
    }

    public /* synthetic */ void z(String str, Item item, View view) {
        Intent r2 = r(str);
        this.A.a(this.B.f().b().a(str));
        ((x0) this.z).e(item, ViewUris.c0.toString(), str);
        this.b.startActivity(r2);
    }

    public /* synthetic */ void z0(CompoundButton compoundButton, boolean z2) {
        this.o.e(z2);
        this.A.a(this.B.g().b().a());
        this.p.a(z2);
        J0();
    }
}

package com.spotify.music.features.settings.adapter;

import com.google.common.base.Predicate;
import com.spotify.music.features.settings.adapter.Item;

/* access modifiers changed from: package-private */
public final class l2 implements Predicate<Item> {
    private final boolean A;
    private final boolean B;
    private final boolean C;
    private final boolean D;
    private final boolean E;
    private final boolean F;
    private final boolean G;
    private final boolean H;
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean f;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    private final boolean s;
    private final boolean t;
    private final boolean u;
    private final boolean v;
    private final boolean w;
    private final boolean x;
    private final boolean y;
    private final boolean z;

    public l2(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26) {
        this.a = z2;
        this.b = z3;
        this.c = z4;
        this.f = z5;
        this.n = z6;
        this.o = z7;
        this.p = z8;
        this.q = z9;
        this.r = z10;
        this.s = z11;
        this.u = z12;
        this.v = z13;
        this.w = z14;
        this.x = z15;
        this.y = z16;
        this.t = z17;
        this.z = z18;
        this.A = z19;
        this.B = z20;
        this.C = z21;
        this.D = z22;
        this.E = z23;
        this.F = z24;
        this.G = z25;
        this.H = z26;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.common.base.Predicate
    public boolean apply(Item item) {
        Item item2 = item;
        boolean z2 = false;
        if (item2 == null) {
            return false;
        }
        Item.ShowWhen h = item2.h();
        boolean z3 = (h == Item.ShowWhen.EVER) | (this.a && h == Item.ShowWhen.DEBUG_MENU_ENABLED) | (this.b && h == Item.ShowWhen.AUDIO_EFFECTS_CONTROL_AVAILABLE) | (this.c && h == Item.ShowWhen.OFFLINE_ENABLED) | (this.f && h == Item.ShowWhen.LOCAL_FILES_IMPORT_ENABLED) | (this.n && h == Item.ShowWhen.LOCAL_FILES_LIBRARY_ENABLED) | (this.o && h == Item.ShowWhen.SD_CARD_AVAILABLE) | (this.p && h == Item.ShowWhen.AD_BOOKMARK_AD_ENABLED) | (this.q && h == Item.ShowWhen.AD_PARTNER_PREFERENCES_ENABLED) | (this.y && h == Item.ShowWhen.VOICE_ADS_ENABLED) | (this.r && h == Item.ShowWhen.LICENSING_SCTA_INFO_ENABLED) | (this.s && h == Item.ShowWhen.VOICE_FEATURE_ENABLED) | (this.t && h == Item.ShowWhen.VOICE_ASSISATANTS_ENABLED) | (!this.u && h == Item.ShowWhen.NOT_CONNECTED_TO_FACEBOOK) | (this.v && h == Item.ShowWhen.LANGUAGE_ONBOARDING_ENABLED) | (this.w && h == Item.ShowWhen.CAR_MODE_AVAILABLE) | (this.x && h == Item.ShowWhen.CAR_MODE_AUTO_ACTIVATION_AVAILABLE) | (this.z && h == Item.ShowWhen.HOME_THING_FEATURE_ENABLED) | (this.A && h == Item.ShowWhen.EXPLICIT_CONTENT_SETTING_VISIBLE) | (this.B && h == Item.ShowWhen.EMAIL_UPDATE_ENABLED) | (this.C && h == Item.ShowWhen.ONETRUST_ENABLED) | (this.D && h == Item.ShowWhen.STREAM_NON_METERED_QUALITY_ENABLED) | (this.E && h == Item.ShowWhen.DOWNLOAD_PREFERRED_RESOURCE_TYPE_ENABLED) | (this.F && h == Item.ShowWhen.VOICE_TTS_ENABLED) | (this.G && h == Item.ShowWhen.EMPLOYEE_PODCASTS_ENABLED);
        if (this.H && h == Item.ShowWhen.SILENCE_TRIMMER_ENABLED) {
            z2 = true;
        }
        return z2 | z3;
    }
}

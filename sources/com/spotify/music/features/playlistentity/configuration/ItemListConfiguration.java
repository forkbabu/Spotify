package com.spotify.music.features.playlistentity.configuration;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class ItemListConfiguration {
    public static final b v = new b(null);
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final LongClickAction k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private final PreviewToast p;
    private final boolean q;
    private final boolean r;
    private final AddedByAttribution s;
    private final boolean t;
    private final boolean u;

    public enum AddedByAttribution {
        AS_FACE_WHEN_COLLABORATIVE,
        AS_FACE_ALWAYS
    }

    public enum LongClickAction {
        SHOW_CONTEXT_MENU,
        DO_NOTHING
    }

    public enum PreviewToast {
        DONT_SHOW,
        SHOW_ONCE_PER_PLAYLIST_SESSION,
        SHOW_ON_EVERY_PLAYBACK
    }

    public static final class a {
        private PreviewToast a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private Boolean e;
        private Boolean f;
        private Boolean g;
        private Boolean h;
        private Boolean i;
        private LongClickAction j;
        private Boolean k;
        private Boolean l;
        private Boolean m;
        private AddedByAttribution n;
        private Boolean o;
        private Boolean p;
        private Boolean q;
        private Boolean r;
        private Boolean s;
        private Boolean t;
        private Boolean u;

        public a() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151);
        }

        public a(PreviewToast previewToast, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, LongClickAction longClickAction, Boolean bool9, Boolean bool10, Boolean bool11, AddedByAttribution addedByAttribution, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18) {
            this.a = previewToast;
            this.b = bool;
            this.c = bool2;
            this.d = bool3;
            this.e = bool4;
            this.f = bool5;
            this.g = bool6;
            this.h = bool7;
            this.i = bool8;
            this.j = longClickAction;
            this.k = bool9;
            this.l = bool10;
            this.m = bool11;
            this.n = addedByAttribution;
            this.o = bool12;
            this.p = bool13;
            this.q = bool14;
            this.r = bool15;
            this.s = bool16;
            this.t = bool17;
            this.u = bool18;
        }

        public final a a(AddedByAttribution addedByAttribution) {
            this.n = addedByAttribution;
            return this;
        }

        public final a b(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        public final a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final ItemListConfiguration d() {
            PreviewToast previewToast = this.a;
            h.c(previewToast);
            LongClickAction longClickAction = this.j;
            h.c(longClickAction);
            AddedByAttribution addedByAttribution = this.n;
            h.c(addedByAttribution);
            Boolean bool = this.c;
            h.c(bool);
            boolean booleanValue = bool.booleanValue();
            Boolean bool2 = this.d;
            h.c(bool2);
            boolean booleanValue2 = bool2.booleanValue();
            Boolean bool3 = this.b;
            h.c(bool3);
            boolean booleanValue3 = bool3.booleanValue();
            Boolean bool4 = this.e;
            h.c(bool4);
            boolean booleanValue4 = bool4.booleanValue();
            Boolean bool5 = this.f;
            h.c(bool5);
            boolean booleanValue5 = bool5.booleanValue();
            Boolean bool6 = this.g;
            h.c(bool6);
            boolean booleanValue6 = bool6.booleanValue();
            Boolean bool7 = this.h;
            h.c(bool7);
            boolean booleanValue7 = bool7.booleanValue();
            Boolean bool8 = this.i;
            h.c(bool8);
            boolean booleanValue8 = bool8.booleanValue();
            Boolean bool9 = this.k;
            h.c(bool9);
            boolean booleanValue9 = bool9.booleanValue();
            Boolean bool10 = this.l;
            h.c(bool10);
            boolean booleanValue10 = bool10.booleanValue();
            Boolean bool11 = this.m;
            h.c(bool11);
            boolean booleanValue11 = bool11.booleanValue();
            Boolean bool12 = this.o;
            h.c(bool12);
            boolean booleanValue12 = bool12.booleanValue();
            Boolean bool13 = this.p;
            h.c(bool13);
            boolean booleanValue13 = bool13.booleanValue();
            Boolean bool14 = this.q;
            h.c(bool14);
            boolean booleanValue14 = bool14.booleanValue();
            Boolean bool15 = this.r;
            h.c(bool15);
            boolean booleanValue15 = bool15.booleanValue();
            Boolean bool16 = this.s;
            h.c(bool16);
            boolean booleanValue16 = bool16.booleanValue();
            Boolean bool17 = this.t;
            h.c(bool17);
            boolean booleanValue17 = bool17.booleanValue();
            Boolean bool18 = this.u;
            h.c(bool18);
            return new ItemListConfiguration(booleanValue11, booleanValue15, booleanValue12, booleanValue14, booleanValue9, booleanValue17, booleanValue3, booleanValue6, booleanValue16, booleanValue5, longClickAction, booleanValue4, booleanValue10, booleanValue8, booleanValue7, previewToast, booleanValue, booleanValue2, addedByAttribution, booleanValue13, bool18.booleanValue());
        }

        public final a e(boolean z) {
            this.p = Boolean.valueOf(z);
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return h.a(this.a, aVar.a) && h.a(this.b, aVar.b) && h.a(this.c, aVar.c) && h.a(this.d, aVar.d) && h.a(this.e, aVar.e) && h.a(this.f, aVar.f) && h.a(this.g, aVar.g) && h.a(this.h, aVar.h) && h.a(this.i, aVar.i) && h.a(this.j, aVar.j) && h.a(this.k, aVar.k) && h.a(this.l, aVar.l) && h.a(this.m, aVar.m) && h.a(this.n, aVar.n) && h.a(this.o, aVar.o) && h.a(this.p, aVar.p) && h.a(this.q, aVar.q) && h.a(this.r, aVar.r) && h.a(this.s, aVar.s) && h.a(this.t, aVar.t) && h.a(this.u, aVar.u);
        }

        public final a f(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public final a g(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final a h(LongClickAction longClickAction) {
            this.j = longClickAction;
            return this;
        }

        public int hashCode() {
            PreviewToast previewToast = this.a;
            int i2 = 0;
            int hashCode = (previewToast != null ? previewToast.hashCode() : 0) * 31;
            Boolean bool = this.b;
            int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            Boolean bool2 = this.c;
            int hashCode3 = (hashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
            Boolean bool3 = this.d;
            int hashCode4 = (hashCode3 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
            Boolean bool4 = this.e;
            int hashCode5 = (hashCode4 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
            Boolean bool5 = this.f;
            int hashCode6 = (hashCode5 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
            Boolean bool6 = this.g;
            int hashCode7 = (hashCode6 + (bool6 != null ? bool6.hashCode() : 0)) * 31;
            Boolean bool7 = this.h;
            int hashCode8 = (hashCode7 + (bool7 != null ? bool7.hashCode() : 0)) * 31;
            Boolean bool8 = this.i;
            int hashCode9 = (hashCode8 + (bool8 != null ? bool8.hashCode() : 0)) * 31;
            LongClickAction longClickAction = this.j;
            int hashCode10 = (hashCode9 + (longClickAction != null ? longClickAction.hashCode() : 0)) * 31;
            Boolean bool9 = this.k;
            int hashCode11 = (hashCode10 + (bool9 != null ? bool9.hashCode() : 0)) * 31;
            Boolean bool10 = this.l;
            int hashCode12 = (hashCode11 + (bool10 != null ? bool10.hashCode() : 0)) * 31;
            Boolean bool11 = this.m;
            int hashCode13 = (hashCode12 + (bool11 != null ? bool11.hashCode() : 0)) * 31;
            AddedByAttribution addedByAttribution = this.n;
            int hashCode14 = (hashCode13 + (addedByAttribution != null ? addedByAttribution.hashCode() : 0)) * 31;
            Boolean bool12 = this.o;
            int hashCode15 = (hashCode14 + (bool12 != null ? bool12.hashCode() : 0)) * 31;
            Boolean bool13 = this.p;
            int hashCode16 = (hashCode15 + (bool13 != null ? bool13.hashCode() : 0)) * 31;
            Boolean bool14 = this.q;
            int hashCode17 = (hashCode16 + (bool14 != null ? bool14.hashCode() : 0)) * 31;
            Boolean bool15 = this.r;
            int hashCode18 = (hashCode17 + (bool15 != null ? bool15.hashCode() : 0)) * 31;
            Boolean bool16 = this.s;
            int hashCode19 = (hashCode18 + (bool16 != null ? bool16.hashCode() : 0)) * 31;
            Boolean bool17 = this.t;
            int hashCode20 = (hashCode19 + (bool17 != null ? bool17.hashCode() : 0)) * 31;
            Boolean bool18 = this.u;
            if (bool18 != null) {
                i2 = bool18.hashCode();
            }
            return hashCode20 + i2;
        }

        public final a i(boolean z) {
            this.s = Boolean.valueOf(z);
            return this;
        }

        public final a j(PreviewToast previewToast) {
            this.a = previewToast;
            return this;
        }

        public final a k(boolean z) {
            this.o = Boolean.valueOf(z);
            return this;
        }

        public final a l(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public final a m(boolean z) {
            this.k = Boolean.valueOf(z);
            return this;
        }

        public final a n(boolean z) {
            this.q = Boolean.valueOf(z);
            return this;
        }

        public final a o(boolean z) {
            this.r = Boolean.valueOf(z);
            return this;
        }

        public final a p(boolean z) {
            this.t = Boolean.valueOf(z);
            return this;
        }

        public final a q(boolean z) {
            this.m = Boolean.valueOf(z);
            return this;
        }

        public final a r(boolean z) {
            this.l = Boolean.valueOf(z);
            return this;
        }

        public final a s(boolean z) {
            this.u = Boolean.valueOf(z);
            return this;
        }

        public final a t(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Builder(previewToast=");
            V0.append(this.a);
            V0.append(", allowAutoPlayTrack=");
            V0.append(this.b);
            V0.append(", useEncoreForTracks=");
            V0.append(this.c);
            V0.append(", logItemImpressions=");
            V0.append(this.d);
            V0.append(", showAlbumInSubtitle=");
            V0.append(this.e);
            V0.append(", contextAwareSharing=");
            V0.append(this.f);
            V0.append(", allowAutoPlayEpisode=");
            V0.append(this.g);
            V0.append(", showShuffleOnboarding=");
            V0.append(this.h);
            V0.append(", tracksArePreviewsOnly=");
            V0.append(this.i);
            V0.append(", longClickAction=");
            V0.append(this.j);
            V0.append(", showBanContextMenuOption=");
            V0.append(this.k);
            V0.append(", showLyricsLabelForTracks=");
            V0.append(this.l);
            V0.append(", showHeartAndBanOnTrackRows=");
            V0.append(this.m);
            V0.append(", addedByAttribution=");
            V0.append(this.n);
            V0.append(", showAddToQueueContextMenuOption=");
            V0.append(this.o);
            V0.append(", canDownloadMusicAndTalkEpisodes=");
            V0.append(this.p);
            V0.append(", showBrowseAlbumContextMenuOption=");
            V0.append(this.q);
            V0.append(", showGoToPlaylistRadioContextMenuOption=");
            V0.append(this.r);
            V0.append(", openNpvWhenStartingPlaybackOfVideoItem=");
            V0.append(this.s);
            V0.append(", showGoToShowForVideoEpisodesContextMenuOption=");
            V0.append(this.t);
            V0.append(", showPremiumMiniOnboardingTooltipOnFirstTrackRow=");
            V0.append(this.u);
            V0.append(")");
            return V0.toString();
        }

        public final a u(boolean z) {
            this.i = Boolean.valueOf(z);
            return this;
        }

        public final a v(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(PreviewToast previewToast, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, LongClickAction longClickAction, Boolean bool9, Boolean bool10, Boolean bool11, AddedByAttribution addedByAttribution, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, int i2) {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
            int i3 = i2 & 1;
            int i4 = i2 & 2;
            int i5 = i2 & 4;
            int i6 = i2 & 8;
            int i7 = i2 & 16;
            int i8 = i2 & 32;
            int i9 = i2 & 64;
            int i10 = i2 & 128;
            int i11 = i2 & 256;
            int i12 = i2 & 512;
            int i13 = i2 & 1024;
            int i14 = i2 & 2048;
            int i15 = i2 & 4096;
            int i16 = i2 & 8192;
            int i17 = i2 & 16384;
            int i18 = i2 & 32768;
            int i19 = i2 & 65536;
            int i20 = i2 & 131072;
            int i21 = i2 & 262144;
            int i22 = i2 & 524288;
            int i23 = i2 & 1048576;
        }
    }

    public static final class b {
        public b(f fVar) {
        }
    }

    static {
        PreviewToast previewToast = PreviewToast.DONT_SHOW;
        LongClickAction longClickAction = LongClickAction.DO_NOTHING;
        AddedByAttribution addedByAttribution = AddedByAttribution.AS_FACE_WHEN_COLLABORATIVE;
        h.e(longClickAction, "longClickAction");
        h.e(previewToast, "previewToast");
        h.e(addedByAttribution, "addedByAttribution");
    }

    public ItemListConfiguration(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, LongClickAction longClickAction, boolean z11, boolean z12, boolean z13, boolean z14, PreviewToast previewToast, boolean z15, boolean z16, AddedByAttribution addedByAttribution, boolean z17, boolean z18) {
        h.e(longClickAction, "longClickAction");
        h.e(previewToast, "previewToast");
        h.e(addedByAttribution, "addedByAttribution");
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
        this.j = z10;
        this.k = longClickAction;
        this.l = z11;
        this.m = z12;
        this.n = z13;
        this.o = z14;
        this.p = previewToast;
        this.q = z15;
        this.r = z16;
        this.s = addedByAttribution;
        this.t = z17;
        this.u = z18;
    }

    public final AddedByAttribution a() {
        return this.s;
    }

    public final boolean b() {
        return this.h;
    }

    public final boolean c() {
        return this.g;
    }

    public final boolean d() {
        return this.t;
    }

    public final boolean e() {
        return this.j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemListConfiguration)) {
            return false;
        }
        ItemListConfiguration itemListConfiguration = (ItemListConfiguration) obj;
        return this.a == itemListConfiguration.a && this.b == itemListConfiguration.b && this.c == itemListConfiguration.c && this.d == itemListConfiguration.d && this.e == itemListConfiguration.e && this.f == itemListConfiguration.f && this.g == itemListConfiguration.g && this.h == itemListConfiguration.h && this.i == itemListConfiguration.i && this.j == itemListConfiguration.j && h.a(this.k, itemListConfiguration.k) && this.l == itemListConfiguration.l && this.m == itemListConfiguration.m && this.n == itemListConfiguration.n && this.o == itemListConfiguration.o && h.a(this.p, itemListConfiguration.p) && this.q == itemListConfiguration.q && this.r == itemListConfiguration.r && h.a(this.s, itemListConfiguration.s) && this.t == itemListConfiguration.t && this.u == itemListConfiguration.u;
    }

    public final boolean f() {
        return this.r;
    }

    public final LongClickAction g() {
        return this.k;
    }

    public final boolean h() {
        return this.i;
    }

    public int hashCode() {
        boolean z = this.a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        boolean z2 = this.b;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        boolean z3 = this.c;
        if (z3) {
            z3 = true;
        }
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = (i10 + i11) * 31;
        boolean z4 = this.d;
        if (z4) {
            z4 = true;
        }
        int i15 = z4 ? 1 : 0;
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = (i14 + i15) * 31;
        boolean z5 = this.e;
        if (z5) {
            z5 = true;
        }
        int i19 = z5 ? 1 : 0;
        int i20 = z5 ? 1 : 0;
        int i21 = z5 ? 1 : 0;
        int i22 = (i18 + i19) * 31;
        boolean z6 = this.f;
        if (z6) {
            z6 = true;
        }
        int i23 = z6 ? 1 : 0;
        int i24 = z6 ? 1 : 0;
        int i25 = z6 ? 1 : 0;
        int i26 = (i22 + i23) * 31;
        boolean z7 = this.g;
        if (z7) {
            z7 = true;
        }
        int i27 = z7 ? 1 : 0;
        int i28 = z7 ? 1 : 0;
        int i29 = z7 ? 1 : 0;
        int i30 = (i26 + i27) * 31;
        boolean z8 = this.h;
        if (z8) {
            z8 = true;
        }
        int i31 = z8 ? 1 : 0;
        int i32 = z8 ? 1 : 0;
        int i33 = z8 ? 1 : 0;
        int i34 = (i30 + i31) * 31;
        boolean z9 = this.i;
        if (z9) {
            z9 = true;
        }
        int i35 = z9 ? 1 : 0;
        int i36 = z9 ? 1 : 0;
        int i37 = z9 ? 1 : 0;
        int i38 = (i34 + i35) * 31;
        boolean z10 = this.j;
        if (z10) {
            z10 = true;
        }
        int i39 = z10 ? 1 : 0;
        int i40 = z10 ? 1 : 0;
        int i41 = z10 ? 1 : 0;
        int i42 = (i38 + i39) * 31;
        LongClickAction longClickAction = this.k;
        int i43 = 0;
        int hashCode = (i42 + (longClickAction != null ? longClickAction.hashCode() : 0)) * 31;
        boolean z11 = this.l;
        if (z11) {
            z11 = true;
        }
        int i44 = z11 ? 1 : 0;
        int i45 = z11 ? 1 : 0;
        int i46 = z11 ? 1 : 0;
        int i47 = (hashCode + i44) * 31;
        boolean z12 = this.m;
        if (z12) {
            z12 = true;
        }
        int i48 = z12 ? 1 : 0;
        int i49 = z12 ? 1 : 0;
        int i50 = z12 ? 1 : 0;
        int i51 = (i47 + i48) * 31;
        boolean z13 = this.n;
        if (z13) {
            z13 = true;
        }
        int i52 = z13 ? 1 : 0;
        int i53 = z13 ? 1 : 0;
        int i54 = z13 ? 1 : 0;
        int i55 = (i51 + i52) * 31;
        boolean z14 = this.o;
        if (z14) {
            z14 = true;
        }
        int i56 = z14 ? 1 : 0;
        int i57 = z14 ? 1 : 0;
        int i58 = z14 ? 1 : 0;
        int i59 = (i55 + i56) * 31;
        PreviewToast previewToast = this.p;
        int hashCode2 = (i59 + (previewToast != null ? previewToast.hashCode() : 0)) * 31;
        boolean z15 = this.q;
        if (z15) {
            z15 = true;
        }
        int i60 = z15 ? 1 : 0;
        int i61 = z15 ? 1 : 0;
        int i62 = z15 ? 1 : 0;
        int i63 = (hashCode2 + i60) * 31;
        boolean z16 = this.r;
        if (z16) {
            z16 = true;
        }
        int i64 = z16 ? 1 : 0;
        int i65 = z16 ? 1 : 0;
        int i66 = z16 ? 1 : 0;
        int i67 = (i63 + i64) * 31;
        AddedByAttribution addedByAttribution = this.s;
        if (addedByAttribution != null) {
            i43 = addedByAttribution.hashCode();
        }
        int i68 = (i67 + i43) * 31;
        boolean z17 = this.t;
        if (z17) {
            z17 = true;
        }
        int i69 = z17 ? 1 : 0;
        int i70 = z17 ? 1 : 0;
        int i71 = z17 ? 1 : 0;
        int i72 = (i68 + i69) * 31;
        boolean z18 = this.u;
        if (!z18) {
            i2 = z18 ? 1 : 0;
        }
        return i72 + i2;
    }

    public final PreviewToast i() {
        return this.p;
    }

    public final boolean j() {
        return this.c;
    }

    public final boolean k() {
        return this.l;
    }

    public final boolean l() {
        return this.e;
    }

    public final boolean m() {
        return this.d;
    }

    public final boolean n() {
        return this.b;
    }

    public final boolean o() {
        return this.f;
    }

    public final boolean p() {
        return this.a;
    }

    public final boolean q() {
        return this.m;
    }

    public final boolean r() {
        return this.u;
    }

    public final boolean s() {
        return this.o;
    }

    public final a t() {
        PreviewToast previewToast = this.p;
        LongClickAction longClickAction = this.k;
        AddedByAttribution addedByAttribution = this.s;
        return new a(previewToast, Boolean.valueOf(this.g), Boolean.valueOf(this.q), Boolean.valueOf(this.r), Boolean.valueOf(this.l), Boolean.valueOf(this.j), Boolean.valueOf(this.h), Boolean.valueOf(this.o), Boolean.valueOf(this.n), longClickAction, Boolean.valueOf(this.e), Boolean.valueOf(this.m), Boolean.valueOf(this.a), addedByAttribution, Boolean.valueOf(this.c), Boolean.valueOf(this.t), Boolean.valueOf(this.d), Boolean.valueOf(this.b), Boolean.valueOf(this.i), Boolean.valueOf(this.f), Boolean.valueOf(this.u));
    }

    public String toString() {
        StringBuilder V0 = je.V0("ItemListConfiguration(showHeartAndBanOnTrackRows=");
        V0.append(this.a);
        V0.append(", showGoToPlaylistRadioContextMenuOption=");
        V0.append(this.b);
        V0.append(", showAddToQueueContextMenuOption=");
        V0.append(this.c);
        V0.append(", showBrowseAlbumContextMenuOption=");
        V0.append(this.d);
        V0.append(", showBanContextMenuOption=");
        V0.append(this.e);
        V0.append(", showGoToShowForVideoEpisodesContextMenuOption=");
        V0.append(this.f);
        V0.append(", allowAutoPlayTrack=");
        V0.append(this.g);
        V0.append(", allowAutoPlayEpisode=");
        V0.append(this.h);
        V0.append(", openNpvWhenStartingPlaybackOfVideoItem=");
        V0.append(this.i);
        V0.append(", contextAwareSharing=");
        V0.append(this.j);
        V0.append(", longClickAction=");
        V0.append(this.k);
        V0.append(", showAlbumInSubtitle=");
        V0.append(this.l);
        V0.append(", showLyricsLabelForTracks=");
        V0.append(this.m);
        V0.append(", tracksArePreviewsOnly=");
        V0.append(this.n);
        V0.append(", showShuffleOnboarding=");
        V0.append(this.o);
        V0.append(", previewToast=");
        V0.append(this.p);
        V0.append(", useEncoreForTracks=");
        V0.append(this.q);
        V0.append(", logItemImpressions=");
        V0.append(this.r);
        V0.append(", addedByAttribution=");
        V0.append(this.s);
        V0.append(", canDownloadMusicAndTalkEpisodes=");
        V0.append(this.t);
        V0.append(", showPremiumMiniOnboardingTooltipOnFirstTrackRow=");
        return je.P0(V0, this.u, ")");
    }

    public final boolean u() {
        return this.n;
    }

    public final boolean v() {
        return this.q;
    }
}

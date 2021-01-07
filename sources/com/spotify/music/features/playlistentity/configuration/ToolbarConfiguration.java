package com.spotify.music.features.playlistentity.configuration;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class ToolbarConfiguration {
    public static final b l = new b(null);
    private final boolean a;
    private final FollowOption b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final EditOption f;
    private final boolean g;
    private final boolean h;
    private final RecommendationEducationOption i;
    private final boolean j;
    private final boolean k;

    public enum EditOption {
        NO_SHOW,
        SHOW_WHEN_CAN_MODIFY_CONTENTS,
        SHOW_WHEN_OWNED_BY_SELF
    }

    public enum FollowOption {
        NONE,
        LIKE,
        FOLLOW
    }

    public enum RecommendationEducationOption {
        NO_SHOW,
        FORMAT_LISTS_ONLY,
        ALL_PLAYLISTS
    }

    public static final class a {
        private Boolean a;
        private EditOption b;
        private Boolean c;
        private Boolean d;
        private FollowOption e;
        private Boolean f;
        private Boolean g;
        private Boolean h;
        private Boolean i;
        private Boolean j;
        private RecommendationEducationOption k;

        public a() {
            this(null, null, null, null, null, null, null, null, null, null, null, 2047);
        }

        public a(Boolean bool, EditOption editOption, Boolean bool2, Boolean bool3, FollowOption followOption, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, RecommendationEducationOption recommendationEducationOption) {
            this.a = bool;
            this.b = editOption;
            this.c = bool2;
            this.d = bool3;
            this.e = followOption;
            this.f = bool4;
            this.g = bool5;
            this.h = bool6;
            this.i = bool7;
            this.j = bool8;
            this.k = recommendationEducationOption;
        }

        public final ToolbarConfiguration a() {
            EditOption editOption = this.b;
            h.c(editOption);
            Boolean bool = this.a;
            h.c(bool);
            boolean booleanValue = bool.booleanValue();
            Boolean bool2 = this.c;
            h.c(bool2);
            boolean booleanValue2 = bool2.booleanValue();
            Boolean bool3 = this.d;
            h.c(bool3);
            boolean booleanValue3 = bool3.booleanValue();
            FollowOption followOption = this.e;
            h.c(followOption);
            Boolean bool4 = this.f;
            h.c(bool4);
            boolean booleanValue4 = bool4.booleanValue();
            Boolean bool5 = this.g;
            h.c(bool5);
            boolean booleanValue5 = bool5.booleanValue();
            Boolean bool6 = this.h;
            h.c(bool6);
            boolean booleanValue6 = bool6.booleanValue();
            Boolean bool7 = this.i;
            h.c(bool7);
            boolean booleanValue7 = bool7.booleanValue();
            RecommendationEducationOption recommendationEducationOption = this.k;
            h.c(recommendationEducationOption);
            Boolean bool8 = this.j;
            h.c(bool8);
            return new ToolbarConfiguration(booleanValue2, followOption, booleanValue7, booleanValue5, booleanValue3, editOption, booleanValue, booleanValue6, recommendationEducationOption, bool8.booleanValue(), booleanValue4);
        }

        public final a b(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        public final a c(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final a d(EditOption editOption) {
            h.e(editOption, "editOption");
            this.b = editOption;
            return this;
        }

        public final a e(boolean z) {
            this.h = Boolean.valueOf(z);
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
            return h.a(this.a, aVar.a) && h.a(this.b, aVar.b) && h.a(this.c, aVar.c) && h.a(this.d, aVar.d) && h.a(this.e, aVar.e) && h.a(this.f, aVar.f) && h.a(this.g, aVar.g) && h.a(this.h, aVar.h) && h.a(this.i, aVar.i) && h.a(this.j, aVar.j) && h.a(this.k, aVar.k);
        }

        public final a f(FollowOption followOption) {
            h.e(followOption, "followOption");
            this.e = followOption;
            return this;
        }

        public final a g(boolean z) {
            this.i = Boolean.valueOf(z);
            return this;
        }

        public final a h(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public int hashCode() {
            Boolean bool = this.a;
            int i2 = 0;
            int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
            EditOption editOption = this.b;
            int hashCode2 = (hashCode + (editOption != null ? editOption.hashCode() : 0)) * 31;
            Boolean bool2 = this.c;
            int hashCode3 = (hashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
            Boolean bool3 = this.d;
            int hashCode4 = (hashCode3 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
            FollowOption followOption = this.e;
            int hashCode5 = (hashCode4 + (followOption != null ? followOption.hashCode() : 0)) * 31;
            Boolean bool4 = this.f;
            int hashCode6 = (hashCode5 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
            Boolean bool5 = this.g;
            int hashCode7 = (hashCode6 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
            Boolean bool6 = this.h;
            int hashCode8 = (hashCode7 + (bool6 != null ? bool6.hashCode() : 0)) * 31;
            Boolean bool7 = this.i;
            int hashCode9 = (hashCode8 + (bool7 != null ? bool7.hashCode() : 0)) * 31;
            Boolean bool8 = this.j;
            int hashCode10 = (hashCode9 + (bool8 != null ? bool8.hashCode() : 0)) * 31;
            RecommendationEducationOption recommendationEducationOption = this.k;
            if (recommendationEducationOption != null) {
                i2 = recommendationEducationOption.hashCode();
            }
            return hashCode10 + i2;
        }

        public final a i(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public final a j(boolean z) {
            this.j = Boolean.valueOf(z);
            return this;
        }

        public final a k(RecommendationEducationOption recommendationEducationOption) {
            h.e(recommendationEducationOption, "recommendationEducationOption");
            this.k = recommendationEducationOption;
            return this;
        }

        public final a l(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Builder(showRenameOption=");
            V0.append(this.a);
            V0.append(", showEditOption=");
            V0.append(this.b);
            V0.append(", showHeartInToolbar=");
            V0.append(this.c);
            V0.append(", showDownloadOption=");
            V0.append(this.d);
            V0.append(", showFollowOptionAs=");
            V0.append(this.e);
            V0.append(", showManagePrivacyOption=");
            V0.append(this.f);
            V0.append(", showAddToHomescreenOption=");
            V0.append(this.g);
            V0.append(", showFilterAndSortInToolbar=");
            V0.append(this.h);
            V0.append(", showGoToPlaylistRadioOption=");
            V0.append(this.i);
            V0.append(", showOtherDevicesToDownloadToOption=");
            V0.append(this.j);
            V0.append(", showRecommendationEducationOption=");
            V0.append(this.k);
            V0.append(")");
            return V0.toString();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(Boolean bool, EditOption editOption, Boolean bool2, Boolean bool3, FollowOption followOption, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, RecommendationEducationOption recommendationEducationOption, int i2) {
            this(null, null, null, null, null, null, null, null, null, null, null);
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
        }
    }

    public static final class b {
        public b(f fVar) {
        }
    }

    static {
        EditOption editOption = EditOption.NO_SHOW;
        FollowOption followOption = FollowOption.FOLLOW;
        RecommendationEducationOption recommendationEducationOption = RecommendationEducationOption.NO_SHOW;
        h.e(followOption, "showFollowOptionAs");
        h.e(editOption, "showEditOption");
        h.e(recommendationEducationOption, "showRecommendationEducationOption");
    }

    public ToolbarConfiguration(boolean z, FollowOption followOption, boolean z2, boolean z3, boolean z4, EditOption editOption, boolean z5, boolean z6, RecommendationEducationOption recommendationEducationOption, boolean z7, boolean z8) {
        h.e(followOption, "showFollowOptionAs");
        h.e(editOption, "showEditOption");
        h.e(recommendationEducationOption, "showRecommendationEducationOption");
        this.a = z;
        this.b = followOption;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = editOption;
        this.g = z5;
        this.h = z6;
        this.i = recommendationEducationOption;
        this.j = z7;
        this.k = z8;
    }

    public final boolean a() {
        return this.d;
    }

    public final boolean b() {
        return this.e;
    }

    public final EditOption c() {
        return this.f;
    }

    public final boolean d() {
        return this.h;
    }

    public final FollowOption e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToolbarConfiguration)) {
            return false;
        }
        ToolbarConfiguration toolbarConfiguration = (ToolbarConfiguration) obj;
        return this.a == toolbarConfiguration.a && h.a(this.b, toolbarConfiguration.b) && this.c == toolbarConfiguration.c && this.d == toolbarConfiguration.d && this.e == toolbarConfiguration.e && h.a(this.f, toolbarConfiguration.f) && this.g == toolbarConfiguration.g && this.h == toolbarConfiguration.h && h.a(this.i, toolbarConfiguration.i) && this.j == toolbarConfiguration.j && this.k == toolbarConfiguration.k;
    }

    public final boolean f() {
        return this.c;
    }

    public final boolean g() {
        return this.a;
    }

    public final boolean h() {
        return this.k;
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
        FollowOption followOption = this.b;
        int i7 = 0;
        int hashCode = (i6 + (followOption != null ? followOption.hashCode() : 0)) * 31;
        boolean z2 = this.c;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (hashCode + i8) * 31;
        boolean z3 = this.d;
        if (z3) {
            z3 = true;
        }
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = z3 ? 1 : 0;
        int i15 = (i11 + i12) * 31;
        boolean z4 = this.e;
        if (z4) {
            z4 = true;
        }
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = z4 ? 1 : 0;
        int i19 = (i15 + i16) * 31;
        EditOption editOption = this.f;
        int hashCode2 = (i19 + (editOption != null ? editOption.hashCode() : 0)) * 31;
        boolean z5 = this.g;
        if (z5) {
            z5 = true;
        }
        int i20 = z5 ? 1 : 0;
        int i21 = z5 ? 1 : 0;
        int i22 = z5 ? 1 : 0;
        int i23 = (hashCode2 + i20) * 31;
        boolean z6 = this.h;
        if (z6) {
            z6 = true;
        }
        int i24 = z6 ? 1 : 0;
        int i25 = z6 ? 1 : 0;
        int i26 = z6 ? 1 : 0;
        int i27 = (i23 + i24) * 31;
        RecommendationEducationOption recommendationEducationOption = this.i;
        if (recommendationEducationOption != null) {
            i7 = recommendationEducationOption.hashCode();
        }
        int i28 = (i27 + i7) * 31;
        boolean z7 = this.j;
        if (z7) {
            z7 = true;
        }
        int i29 = z7 ? 1 : 0;
        int i30 = z7 ? 1 : 0;
        int i31 = z7 ? 1 : 0;
        int i32 = (i28 + i29) * 31;
        boolean z8 = this.k;
        if (!z8) {
            i2 = z8 ? 1 : 0;
        }
        return i32 + i2;
    }

    public final boolean i() {
        return this.j;
    }

    public final RecommendationEducationOption j() {
        return this.i;
    }

    public final boolean k() {
        return this.g;
    }

    public final a l() {
        EditOption editOption = this.f;
        return new a(Boolean.valueOf(this.g), editOption, Boolean.valueOf(this.a), Boolean.valueOf(this.e), this.b, Boolean.valueOf(this.k), Boolean.valueOf(this.d), Boolean.valueOf(this.h), Boolean.valueOf(this.c), Boolean.valueOf(this.j), this.i);
    }

    public String toString() {
        StringBuilder V0 = je.V0("ToolbarConfiguration(showHeartInToolbar=");
        V0.append(this.a);
        V0.append(", showFollowOptionAs=");
        V0.append(this.b);
        V0.append(", showGoToPlaylistRadioOption=");
        V0.append(this.c);
        V0.append(", showAddToHomescreenOption=");
        V0.append(this.d);
        V0.append(", showDownloadOption=");
        V0.append(this.e);
        V0.append(", showEditOption=");
        V0.append(this.f);
        V0.append(", showRenameOption=");
        V0.append(this.g);
        V0.append(", showFilterAndSortInToolbar=");
        V0.append(this.h);
        V0.append(", showRecommendationEducationOption=");
        V0.append(this.i);
        V0.append(", showOtherDevicesToDownloadToOption=");
        V0.append(this.j);
        V0.append(", showManagePrivacyOption=");
        return je.P0(V0, this.k, ")");
    }
}

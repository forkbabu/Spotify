package com.spotify.music.features.yourlibrary.musicpages.domain;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.features.yourlibrary.musicpages.datasource.r4;
import com.spotify.music.features.yourlibrary.musicpages.datasource.x3;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId;
import com.spotify.music.yourlibrary.interfaces.YourLibraryTabsCollapseState;

public abstract class r0 {

    public static final class a extends r0 {
        a() {
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "CancelTextFilter{}";
        }
    }

    public static final class a0 extends r0 {
        a0() {
        }

        public boolean equals(Object obj) {
            return obj instanceof a0;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "LogIntentToShowSortOptions{}";
        }
    }

    public static final class a1 extends r0 {
        private final String a;
        private final String b;

        a1(String str, String str2) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a1)) {
                return false;
            }
            a1 a1Var = (a1) obj;
            if (!a1Var.a.equals(this.a) || !a1Var.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + je.Y0(this.a, 0, 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("ShowAgeVerificationDialog{trackUri=");
            V0.append(this.a);
            V0.append(", imageUri=");
            return je.H0(V0, this.b, '}');
        }
    }

    public static final class b extends r0 {
        private final String a;

        b(String str) {
            str.getClass();
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return ((b) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("ClearAllFilters{uri="), this.a, '}');
        }
    }

    public static final class b0 extends r0 {
        private final String a;
        private final int b;

        b0(String str, int i) {
            str.getClass();
            this.a = str;
            this.b = i;
        }

        public final int a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b0)) {
                return false;
            }
            b0 b0Var = (b0) obj;
            if (b0Var.b != this.b || !b0Var.a.equals(this.a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return je.b(this.b, je.Y0(this.a, 0, 31));
        }

        public String toString() {
            StringBuilder V0 = je.V0("LogIntentToUnlikeTrack{uri=");
            V0.append(this.a);
            V0.append(", position=");
            return je.A0(V0, this.b, '}');
        }
    }

    public static final class b1 extends r0 {
        private final MusicItem a;

        b1(MusicItem musicItem) {
            musicItem.getClass();
            this.a = musicItem;
        }

        public final MusicItem a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b1)) {
                return false;
            }
            return ((b1) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ShowContextMenu{musicItem=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class c extends r0 {
        private final boolean a;

        c(boolean z) {
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof c) && ((c) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.n(this.a, 0);
        }

        public String toString() {
            return je.O0(je.V0("DownloadLikedSongs{download="), this.a, '}');
        }
    }

    public static final class c0 extends r0 {
        private final String a;
        private final String b;

        c0(String str, String str2) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c0)) {
                return false;
            }
            c0 c0Var = (c0) obj;
            if (!c0Var.a.equals(this.a) || !c0Var.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + je.Y0(this.a, 0, 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("NavigateTo{uri=");
            V0.append(this.a);
            V0.append(", title=");
            return je.H0(V0, this.b, '}');
        }
    }

    public static final class c1 extends r0 {
        private final String a;
        private final String b;

        c1(String str, String str2) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c1)) {
                return false;
            }
            c1 c1Var = (c1) obj;
            if (!c1Var.a.equals(this.a) || !c1Var.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + je.Y0(this.a, 0, 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("ShowExplicitTrackDialog{trackUri=");
            V0.append(this.a);
            V0.append(", contextUri=");
            return je.H0(V0, this.b, '}');
        }
    }

    public static final class d extends r0 {
        private final String a;
        private final qpd b;
        private final ImmutableList<qpd> c;

        d(String str, qpd qpd, ImmutableList<qpd> immutableList) {
            str.getClass();
            this.a = str;
            qpd.getClass();
            this.b = qpd;
            immutableList.getClass();
            this.c = immutableList;
        }

        public final ImmutableList<qpd> a() {
            return this.c;
        }

        public final qpd b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (!dVar.a.equals(this.a) || !dVar.b.equals(this.b) || !dVar.c.equals(this.c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int Y0 = je.Y0(this.a, 0, 31);
            return this.c.hashCode() + ((this.b.hashCode() + Y0) * 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("LoadSortOption{uri=");
            V0.append(this.a);
            V0.append(", defaultSortOption=");
            V0.append(this.b);
            V0.append(", allowedSortOptions=");
            V0.append(this.c);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class d0 extends r0 {
        d0() {
        }

        public boolean equals(Object obj) {
            return obj instanceof d0;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "NavigateToAddArtist{}";
        }
    }

    public static final class d1 extends r0 {
        private final int a;

        d1(int i) {
            this.a = i;
        }

        public final int a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof d1) && ((d1) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.b(this.a, 0);
        }

        public String toString() {
            return je.A0(je.V0("ShowSnackbar{stringResourceId="), this.a, '}');
        }
    }

    public static final class e extends r0 {
        e() {
        }

        public boolean equals(Object obj) {
            return obj instanceof e;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "LogIntentClearAllFilters{}";
        }
    }

    public static final class e0 extends r0 {
        private final String a;

        e0(String str) {
            str.getClass();
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e0)) {
                return false;
            }
            return ((e0) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("NavigateToCreatePlaylist{contextUri="), this.a, '}');
        }
    }

    public static final class e1 extends r0 {
        e1() {
        }

        public boolean equals(Object obj) {
            return obj instanceof e1;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "ShowSortOptions{}";
        }
    }

    public static final class f extends r0 {
        private final String a;

        f(String str) {
            str.getClass();
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            return ((f) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("LogIntentClearFilter{filterId="), this.a, '}');
        }
    }

    public static final class f0 extends r0 {
        private final String a;

        f0(String str) {
            str.getClass();
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f0)) {
                return false;
            }
            return ((f0) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("NavigateToCreatePlaylistInFolder{folderUri="), this.a, '}');
        }
    }

    public static final class f1 extends r0 {
        private final r4 a;
        private final String b;
        private final String c;

        f1(r4 r4Var, String str, String str2) {
            r4Var.getClass();
            this.a = r4Var;
            str.getClass();
            this.b = str;
            str2.getClass();
            this.c = str2;
        }

        public final r4 a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f1)) {
                return false;
            }
            f1 f1Var = (f1) obj;
            if (!f1Var.a.equals(this.a) || !f1Var.b.equals(this.b) || !f1Var.c.equals(this.c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.c.hashCode() + je.Y0(this.b, (this.a.hashCode() + 0) * 31, 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("ShufflePlay{musicItemSource=");
            V0.append(this.a);
            V0.append(", playContextTitle=");
            V0.append(this.b);
            V0.append(", ubiInteractionId=");
            return je.H0(V0, this.c, '}');
        }
    }

    public static final class g extends r0 {
        g() {
        }

        public boolean equals(Object obj) {
            return obj instanceof g;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "LogIntentToAddArtists{}";
        }
    }

    public static final class g0 extends r0 {
        g0() {
        }

        public boolean equals(Object obj) {
            return obj instanceof g0;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "NavigateToHiddenArtists{}";
        }
    }

    public static final class g1 extends r0 {
        private final String a;

        g1(String str) {
            str.getClass();
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g1)) {
                return false;
            }
            return ((g1) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("StopPreview{previewId="), this.a, '}');
        }
    }

    public static final class h extends r0 {
        h() {
        }

        public boolean equals(Object obj) {
            return obj instanceof h;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "LogIntentToAddArtistsFromEmptyPage{}";
        }
    }

    public static final class h0 extends r0 {
        h0() {
        }

        public boolean equals(Object obj) {
            return obj instanceof h0;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "NavigateToHiddenTracks{}";
        }
    }

    public static final class h1 extends r0 {
        private final String a;
        private final boolean b;

        h1(String str, boolean z) {
            str.getClass();
            this.a = str;
            this.b = z;
        }

        public final String a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h1)) {
                return false;
            }
            h1 h1Var = (h1) obj;
            if (h1Var.b != this.b || !h1Var.a.equals(this.a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return je.n(this.b, je.Y0(this.a, 0, 31));
        }

        public String toString() {
            StringBuilder V0 = je.V0("UpdateAlbumLikedState{albumUri=");
            V0.append(this.a);
            V0.append(", isLiked=");
            return je.O0(V0, this.b, '}');
        }
    }

    public static final class i extends r0 {
        private final String a;
        private final int b;

        i(String str, int i) {
            str.getClass();
            this.a = str;
            this.b = i;
        }

        public final int a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (iVar.b != this.b || !iVar.a.equals(this.a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return je.b(this.b, je.Y0(this.a, 0, 31));
        }

        public String toString() {
            StringBuilder V0 = je.V0("LogIntentToBanTrack{uri=");
            V0.append(this.a);
            V0.append(", position=");
            return je.A0(V0, this.b, '}');
        }
    }

    public static final class i0 extends r0 {
        i0() {
        }

        public boolean equals(Object obj) {
            return obj instanceof i0;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "NavigateToSettings{}";
        }
    }

    public static final class i1 extends r0 {
        private final x3 a;

        i1(x3 x3Var) {
            x3Var.getClass();
            this.a = x3Var;
        }

        public final x3 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof i1)) {
                return false;
            }
            return ((i1) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("UpdateDataSourceConfiguration{dataSourceConfiguration=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class j extends r0 {
        j() {
        }

        public boolean equals(Object obj) {
            return obj instanceof j;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "LogIntentToCancelFind{}";
        }
    }

    public static final class j0 extends r0 {
        j0() {
        }

        public boolean equals(Object obj) {
            return obj instanceof j0;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "NotifyScrollability{}";
        }
    }

    public static final class j1 extends r0 {
        private final String a;
        private final boolean b;

        j1(String str, boolean z) {
            str.getClass();
            this.a = str;
            this.b = z;
        }

        public final boolean a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof j1)) {
                return false;
            }
            j1 j1Var = (j1) obj;
            if (j1Var.b != this.b || !j1Var.a.equals(this.a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return je.n(this.b, je.Y0(this.a, 0, 31));
        }

        public String toString() {
            StringBuilder V0 = je.V0("UpdateFollowState{uri=");
            V0.append(this.a);
            V0.append(", follow=");
            return je.O0(V0, this.b, '}');
        }
    }

    public static final class k extends r0 {
        k() {
        }

        public boolean equals(Object obj) {
            return obj instanceof k;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "LogIntentToCreatePlaylist{}";
        }
    }

    public static final class k0 extends r0 {
        private final String a;
        private final ImmutableMap<String, Boolean> b;
        private final ImmutableList<String> c;
        private final MusicPageId d;

        k0(String str, ImmutableMap<String, Boolean> immutableMap, ImmutableList<String> immutableList, MusicPageId musicPageId) {
            str.getClass();
            this.a = str;
            immutableMap.getClass();
            this.b = immutableMap;
            immutableList.getClass();
            this.c = immutableList;
            musicPageId.getClass();
            this.d = musicPageId;
        }

        public final ImmutableList<String> a() {
            return this.c;
        }

        public final ImmutableMap<String, Boolean> b() {
            return this.b;
        }

        public final MusicPageId c() {
            return this.d;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof k0)) {
                return false;
            }
            k0 k0Var = (k0) obj;
            if (k0Var.d != this.d || !k0Var.a.equals(this.a) || !k0Var.b.equals(this.b) || !k0Var.c.equals(this.c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int Y0 = je.Y0(this.a, 0, 31);
            int hashCode = this.c.hashCode();
            return this.d.hashCode() + ((hashCode + ((this.b.hashCode() + Y0) * 31)) * 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("ObserveFilterStates{uri=");
            V0.append(this.a);
            V0.append(", defaultFilterStates=");
            V0.append(this.b);
            V0.append(", allowedFilters=");
            V0.append(this.c);
            V0.append(", pageId=");
            V0.append(this.d);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class k1 extends r0 {
        private final String a;
        private final String b;
        private final boolean c;

        k1(String str, String str2, boolean z) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
            this.c = z;
        }

        public final String a() {
            return this.b;
        }

        public final boolean b() {
            return this.c;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof k1)) {
                return false;
            }
            k1 k1Var = (k1) obj;
            if (k1Var.c != this.c || !k1Var.a.equals(this.a) || !k1Var.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return je.n(this.c, je.Y0(this.b, je.Y0(this.a, 0, 31), 31));
        }

        public String toString() {
            StringBuilder V0 = je.V0("UpdateTrackBannedState{trackUri=");
            V0.append(this.a);
            V0.append(", contextUri=");
            V0.append(this.b);
            V0.append(", isBanned=");
            return je.O0(V0, this.c, '}');
        }
    }

    public static final class l extends r0 {
        l() {
        }

        public boolean equals(Object obj) {
            return obj instanceof l;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "LogIntentToCreatePlaylistFromEmptyPage{}";
        }
    }

    public static final class l0 extends r0 {
        private final String a;

        l0(String str) {
            str.getClass();
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof l0)) {
                return false;
            }
            return ((l0) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("ObservePagePrefs{uri="), this.a, '}');
        }
    }

    public static final class l1 extends r0 {
        private final String a;
        private final String b;
        private final boolean c;

        l1(String str, String str2, boolean z) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
            this.c = z;
        }

        public final String a() {
            return this.b;
        }

        public final boolean b() {
            return this.c;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof l1)) {
                return false;
            }
            l1 l1Var = (l1) obj;
            if (l1Var.c != this.c || !l1Var.a.equals(this.a) || !l1Var.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return je.n(this.c, je.Y0(this.b, je.Y0(this.a, 0, 31), 31));
        }

        public String toString() {
            StringBuilder V0 = je.V0("UpdateTrackLikedState{trackUri=");
            V0.append(this.a);
            V0.append(", contextUri=");
            V0.append(this.b);
            V0.append(", isLiked=");
            return je.O0(V0, this.c, '}');
        }
    }

    public static final class m extends r0 {
        m() {
        }

        public boolean equals(Object obj) {
            return obj instanceof m;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "LogIntentToDismissInfoDialog{}";
        }
    }

    public static final class m0 extends r0 {
        private final String a;
        private final String b;
        private final String c;

        m0(String str, String str2, String str3) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
            str3.getClass();
            this.c = str3;
        }

        public final String a() {
            return this.c;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof m0)) {
                return false;
            }
            m0 m0Var = (m0) obj;
            if (!m0Var.a.equals(this.a) || !m0Var.b.equals(this.b) || !m0Var.c.equals(this.c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.c.hashCode() + je.Y0(this.b, je.Y0(this.a, 0, 31), 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("OpenInfoDialog{title=");
            V0.append(this.a);
            V0.append(", text=");
            V0.append(this.b);
            V0.append(", dismissText=");
            return je.H0(V0, this.c, '}');
        }
    }

    public static final class n extends r0 {
        private final boolean a;
        private final String b;

        n(boolean z, String str) {
            this.a = z;
            str.getClass();
            this.b = str;
        }

        public final boolean a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            if (nVar.a != this.a || !nVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + ((Boolean.valueOf(this.a).hashCode() + 0) * 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("LogIntentToDownloadLikedSongs{download=");
            V0.append(this.a);
            V0.append(", uri=");
            return je.H0(V0, this.b, '}');
        }
    }

    public static final class n0 extends r0 {
        private final String a;

        n0(String str) {
            str.getClass();
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof n0)) {
                return false;
            }
            return ((n0) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("PlayPreview{previewId="), this.a, '}');
        }
    }

    public static final class o extends r0 {
        private final String a;
        private final boolean b;

        o(String str, boolean z) {
            str.getClass();
            this.a = str;
            this.b = z;
        }

        public final String a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            if (oVar.b != this.b || !oVar.a.equals(this.a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return je.n(this.b, je.Y0(this.a, 0, 31));
        }

        public String toString() {
            StringBuilder V0 = je.V0("LogIntentToFilterFromContextMenu{filterId=");
            V0.append(this.a);
            V0.append(", isEnabled=");
            return je.O0(V0, this.b, '}');
        }
    }

    public static final class o0 extends r0 {
        private final MusicItem a;
        private final String b;
        private final qpd c;
        private final String d;

        o0(MusicItem musicItem, String str, qpd qpd, String str2) {
            musicItem.getClass();
            this.a = musicItem;
            str.getClass();
            this.b = str;
            qpd.getClass();
            this.c = qpd;
            str2.getClass();
            this.d = str2;
        }

        public final MusicItem a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public final qpd c() {
            return this.c;
        }

        public final String d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof o0)) {
                return false;
            }
            o0 o0Var = (o0) obj;
            if (!o0Var.a.equals(this.a) || !o0Var.b.equals(this.b) || !o0Var.c.equals(this.c) || !o0Var.d.equals(this.d)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int Y0 = je.Y0(this.b, (this.a.hashCode() + 0) * 31, 31);
            return this.d.hashCode() + ((this.c.hashCode() + Y0) * 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("PlayTrack{musicItem=");
            V0.append(this.a);
            V0.append(", playContextTitle=");
            V0.append(this.b);
            V0.append(", sortOption=");
            V0.append(this.c);
            V0.append(", ubiInteractionId=");
            return je.H0(V0, this.d, '}');
        }
    }

    public static final class p extends r0 {
        p() {
        }

        public boolean equals(Object obj) {
            return obj instanceof p;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "LogIntentToFind{}";
        }
    }

    public static final class p0 extends r0 {
        private final boolean a;

        p0(boolean z) {
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof p0) && ((p0) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.n(this.a, 0);
        }

        public String toString() {
            return je.O0(je.V0("RequestSetPageSwipeLock{swipeLocked="), this.a, '}');
        }
    }

    public static final class q extends r0 {
        private final String a;
        private final int b;

        q(String str, int i) {
            str.getClass();
            this.a = str;
            this.b = i;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            if (qVar.b != this.b || !qVar.a.equals(this.a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return je.b(this.b, je.Y0(this.a, 0, 31));
        }

        public String toString() {
            StringBuilder V0 = je.V0("LogIntentToFollowArtist{uri=");
            V0.append(this.a);
            V0.append(", position=");
            return je.A0(V0, this.b, '}');
        }
    }

    public static final class q0 extends r0 {
        private final boolean a;

        q0(boolean z) {
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof q0) && ((q0) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.n(this.a, 0);
        }

        public String toString() {
            return je.O0(je.V0("RequestSetTabsCollapseLock{collapseLocked="), this.a, '}');
        }
    }

    public static final class r extends r0 {
        private final String a;
        private final int b;

        r(String str, int i) {
            str.getClass();
            this.a = str;
            this.b = i;
        }

        public final int a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            if (rVar.b != this.b || !rVar.a.equals(this.a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return je.b(this.b, je.Y0(this.a, 0, 31));
        }

        public String toString() {
            StringBuilder V0 = je.V0("LogIntentToLikeAlbum{uri=");
            V0.append(this.a);
            V0.append(", position=");
            return je.A0(V0, this.b, '}');
        }
    }

    /* renamed from: com.spotify.music.features.yourlibrary.musicpages.domain.r0$r0  reason: collision with other inner class name */
    public static final class C0262r0 extends r0 {
        private final YourLibraryTabsCollapseState a;
        private final boolean b;

        C0262r0(YourLibraryTabsCollapseState yourLibraryTabsCollapseState, boolean z) {
            yourLibraryTabsCollapseState.getClass();
            this.a = yourLibraryTabsCollapseState;
            this.b = z;
        }

        public final boolean a() {
            return this.b;
        }

        public final YourLibraryTabsCollapseState b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0262r0)) {
                return false;
            }
            C0262r0 r0Var = (C0262r0) obj;
            if (r0Var.a == this.a && r0Var.b == this.b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.n(this.b, (this.a.hashCode() + 0) * 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("RequestTabsCollapseState{tabsCollapseState=");
            V0.append(this.a);
            V0.append(", animate=");
            return je.O0(V0, this.b, '}');
        }
    }

    public static final class s extends r0 {
        private final String a;
        private final int b;

        s(String str, int i) {
            str.getClass();
            this.a = str;
            this.b = i;
        }

        public final int a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            if (sVar.b != this.b || !sVar.a.equals(this.a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return je.b(this.b, je.Y0(this.a, 0, 31));
        }

        public String toString() {
            StringBuilder V0 = je.V0("LogIntentToLikeRecommendedTrack{uri=");
            V0.append(this.a);
            V0.append(", position=");
            return je.A0(V0, this.b, '}');
        }
    }

    public static final class s0 extends r0 {
        private final String a;
        private final String b;
        private final Boolean c;

        s0(String str, String str2, Boolean bool) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
            bool.getClass();
            this.c = bool;
        }

        public final String a() {
            return this.b;
        }

        public final Boolean b() {
            return this.c;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof s0)) {
                return false;
            }
            s0 s0Var = (s0) obj;
            if (!s0Var.a.equals(this.a) || !s0Var.b.equals(this.b) || !s0Var.c.equals(this.c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.c.hashCode() + je.Y0(this.b, je.Y0(this.a, 0, 31), 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("SaveFilterState{uri=");
            V0.append(this.a);
            V0.append(", filterId=");
            V0.append(this.b);
            V0.append(", filterState=");
            V0.append(this.c);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class t extends r0 {
        private final String a;
        private final int b;

        t(String str, int i) {
            str.getClass();
            this.a = str;
            this.b = i;
        }

        public final int a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof t)) {
                return false;
            }
            t tVar = (t) obj;
            if (tVar.b != this.b || !tVar.a.equals(this.a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return je.b(this.b, je.Y0(this.a, 0, 31));
        }

        public String toString() {
            StringBuilder V0 = je.V0("LogIntentToNavigateToEntity{uri=");
            V0.append(this.a);
            V0.append(", position=");
            return je.A0(V0, this.b, '}');
        }
    }

    public static final class t0 extends r0 {
        private final String a;
        private final qpd b;

        t0(String str, qpd qpd) {
            str.getClass();
            this.a = str;
            qpd.getClass();
            this.b = qpd;
        }

        public final qpd a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof t0)) {
                return false;
            }
            t0 t0Var = (t0) obj;
            if (!t0Var.a.equals(this.a) || !t0Var.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + je.Y0(this.a, 0, 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("SaveSortOption{uri=");
            V0.append(this.a);
            V0.append(", sortOption=");
            V0.append(this.b);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class u extends r0 {
        u() {
        }

        public boolean equals(Object obj) {
            return obj instanceof u;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "LogIntentToNavigateToHiddenArtists{}";
        }
    }

    public static final class u0 extends r0 {
        private final boolean a;

        u0(boolean z) {
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof u0) && ((u0) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.n(this.a, 0);
        }

        public String toString() {
            return je.O0(je.V0("ScrollToTop{smooth="), this.a, '}');
        }
    }

    public static final class v extends r0 {
        v() {
        }

        public boolean equals(Object obj) {
            return obj instanceof v;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "LogIntentToNavigateToHiddenTracks{}";
        }
    }

    public static final class v0 extends r0 {
        private final int a;

        v0(int i) {
            this.a = i;
        }

        public final int a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof v0) && ((v0) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.b(this.a, 0);
        }

        public String toString() {
            return je.A0(je.V0("SetCenteredContentTopMargin{topMargin="), this.a, '}');
        }
    }

    public static final class w extends r0 {
        w() {
        }

        public boolean equals(Object obj) {
            return obj instanceof w;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "LogIntentToNavigateToLikedSongs{}";
        }
    }

    public static final class w0 extends r0 {
        private final boolean a;

        w0(boolean z) {
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof w0) && ((w0) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.n(this.a, 0);
        }

        public String toString() {
            return je.O0(je.V0("SetFilterTextViewShowing{showing="), this.a, '}');
        }
    }

    public static final class x extends r0 {
        x() {
        }

        public boolean equals(Object obj) {
            return obj instanceof x;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "LogIntentToOpenInfoDialog{}";
        }
    }

    public static final class x0 extends r0 {
        private final int a;

        x0(int i) {
            this.a = i;
        }

        public final int a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof x0) && ((x0) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.b(this.a, 0);
        }

        public String toString() {
            return je.A0(je.V0("SetMaxTabsOffset{maxTabsOffset="), this.a, '}');
        }
    }

    public static final class y extends r0 {
        private final String a;
        private final int b;
        private final boolean c;
        private final boolean d;

        y(String str, int i, boolean z, boolean z2) {
            str.getClass();
            this.a = str;
            this.b = i;
            this.c = z;
            this.d = z2;
        }

        public final int a() {
            return this.b;
        }

        public final boolean b() {
            return this.c;
        }

        public final String c() {
            return this.a;
        }

        public final boolean d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof y)) {
                return false;
            }
            y yVar = (y) obj;
            if (yVar.b == this.b && yVar.c == this.c && yVar.d == this.d && yVar.a.equals(this.a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int K = je.K(this.b, je.Y0(this.a, 0, 31), 31);
            return je.n(this.d, (Boolean.valueOf(this.c).hashCode() + K) * 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("LogIntentToPlayPreview{uri=");
            V0.append(this.a);
            V0.append(", position=");
            V0.append(this.b);
            V0.append(", recommended=");
            V0.append(this.c);
            V0.append(", viaImage=");
            return je.O0(V0, this.d, '}');
        }
    }

    public static final class y0 extends r0 {
        private final String a;
        private final String b;
        private final Optional<String> c;

        y0(String str, String str2, Optional<String> optional) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
            optional.getClass();
            this.c = optional;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public final Optional<String> c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof y0)) {
                return false;
            }
            y0 y0Var = (y0) obj;
            if (!y0Var.a.equals(this.a) || !y0Var.b.equals(this.b) || !y0Var.c.equals(this.c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.c.hashCode() + je.Y0(this.b, je.Y0(this.a, 0, 31), 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("SetPagePrefsOption{uri=");
            V0.append(this.a);
            V0.append(", key=");
            V0.append(this.b);
            V0.append(", value=");
            V0.append(this.c);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class z extends r0 {
        z() {
        }

        public boolean equals(Object obj) {
            return obj instanceof z;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "LogIntentToShowFilterTextView{}";
        }
    }

    public static final class z0 extends r0 {
        private final boolean a;

        z0(boolean z) {
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof z0) && ((z0) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.n(this.a, 0);
        }

        public String toString() {
            return je.O0(je.V0("SetPulldownLock{isLocked="), this.a, '}');
        }
    }

    r0() {
    }
}

package com.spotify.collection.endpoints.yourlibrary.all;

import com.coremedia.iso.boxes.FreeSpaceBox;
import com.google.protobuf.GeneratedMessageLite;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryRequestProto$YourLibraryRequest;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryRequestProto$YourLibraryRequestEntity;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryRequestProto$YourLibraryRequestHeader;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryRequestProto$YourLibraryRequestShowExtraInfo;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class YourLibraryEndpointConfiguration {
    private final Map<String, String> a;
    private final YourLibraryRequestProto$YourLibraryRequest b;
    private final String c;
    private final String d;
    private final Integer e;
    private final Integer f;
    private final Boolean g;
    private final int h;
    private final Boolean i;
    private final Sort j;
    private final Entity k;
    private final String l;
    private final String m;
    private final String n;
    private final String o;
    private final Boolean p;
    private final String q;
    private final Boolean r;
    private final List<String> s;

    public enum Entity {
        ALBUMS("albums"),
        ARTISTS("artists"),
        PLAYLISTS("playlists"),
        SHOWS("shows");
        
        private final String value;

        private Entity(String str) {
            this.value = str;
        }

        public final String d() {
            return this.value;
        }
    }

    public enum Sort {
        CREATOR("creator"),
        NAME("alphabetical"),
        ADDED("recentlyAdded"),
        RELEVANCE("mostRelevant"),
        PLAYED("recentlyPlayed");
        
        private final String value;

        private Sort(String str) {
            this.value = str;
        }

        public final String d() {
            return this.value;
        }
    }

    public YourLibraryEndpointConfiguration(String str, String str2, Integer num, Integer num2, Boolean bool, int i2, Boolean bool2, Sort sort, Entity entity, String str3, String str4, String str5, String str6, Boolean bool3, String str7, Boolean bool4, List list, int i3) {
        int i4 = i3 & 2;
        Integer num3 = (i3 & 4) != 0 ? null : num;
        Integer num4 = (i3 & 8) != 0 ? null : num2;
        Boolean bool5 = (i3 & 16) != 0 ? null : bool;
        int i5 = (i3 & 32) != 0 ? 500 : i2;
        int i6 = i3 & 64;
        Sort sort2 = (i3 & 128) != 0 ? null : sort;
        Entity entity2 = (i3 & 256) != 0 ? null : entity;
        String str8 = (i3 & 512) != 0 ? null : str3;
        int i7 = i3 & 1024;
        String str9 = (i3 & 2048) != 0 ? null : str5;
        int i8 = i3 & 4096;
        Boolean bool6 = (i3 & 8192) != 0 ? null : bool3;
        String str10 = (i3 & 16384) != 0 ? null : str7;
        Boolean bool7 = (32768 & i3) != 0 ? null : bool4;
        List list2 = (i3 & 65536) != 0 ? null : list;
        h.e(str, "username");
        this.c = str;
        this.d = null;
        this.e = num3;
        this.f = num4;
        this.g = bool5;
        this.h = i5;
        this.i = null;
        this.j = sort2;
        this.k = entity2;
        this.l = str8;
        this.m = null;
        this.n = str9;
        this.o = null;
        this.p = bool6;
        this.q = str10;
        this.r = bool7;
        this.s = list2;
        LinkedHashMap s2 = d.s(new Pair("updateThrottling", String.valueOf(i5)));
        if (list2 == null) {
            if (num3 != null) {
                s2.put(FreeSpaceBox.TYPE, String.valueOf(num3.intValue()));
            }
            if (num4 != null) {
                s2.put("length", String.valueOf(num4.intValue()));
            }
            if (bool6 != null) {
                s2.put("downloaded", String.valueOf(bool6.booleanValue()));
            }
            if (str10 != null) {
                s2.put("text_filter", str10);
            }
            if (sort2 != null) {
                s2.put("sort", sort2.d());
            }
            if (entity2 != null) {
                s2.put("entity_type", entity2.d());
            }
        }
        this.a = s2;
        YourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo.a l2 = YourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo.l();
        if (str8 != null) {
            h.d(l2, "this");
            l2.m(str8);
        }
        if (str9 != null) {
            h.d(l2, "this");
            l2.n(str9);
        }
        YourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo yourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo = (YourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo) l2.build();
        YourLibraryRequestProto$YourLibraryRequestShowExtraInfo.a i9 = YourLibraryRequestProto$YourLibraryRequestShowExtraInfo.i();
        if (bool7 != null) {
            boolean booleanValue = bool7.booleanValue();
            h.d(i9, "this");
            i9.m(booleanValue);
        }
        YourLibraryRequestProto$YourLibraryRequestEntity.a l3 = YourLibraryRequestProto$YourLibraryRequestEntity.l();
        l3.m(yourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo);
        l3.n((YourLibraryRequestProto$YourLibraryRequestShowExtraInfo) i9.build());
        YourLibraryRequestProto$YourLibraryRequestHeader.a i10 = YourLibraryRequestProto$YourLibraryRequestHeader.i();
        if (bool5 != null) {
            boolean booleanValue2 = bool5.booleanValue();
            h.d(i10, "this");
            i10.m(booleanValue2);
        }
        YourLibraryRequestProto$YourLibraryRequest.a m2 = YourLibraryRequestProto$YourLibraryRequest.m();
        m2.n(l3);
        m2.o(i10);
        if (list2 != null) {
            m2.m(list2);
        }
        GeneratedMessageLite build = m2.build();
        h.d(build, "builder.build()");
        this.b = (YourLibraryRequestProto$YourLibraryRequest) build;
    }

    public final Map<String, String> a() {
        return this.a;
    }

    public final YourLibraryRequestProto$YourLibraryRequest b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YourLibraryEndpointConfiguration)) {
            return false;
        }
        YourLibraryEndpointConfiguration yourLibraryEndpointConfiguration = (YourLibraryEndpointConfiguration) obj;
        return h.a(this.c, yourLibraryEndpointConfiguration.c) && h.a(this.d, yourLibraryEndpointConfiguration.d) && h.a(this.e, yourLibraryEndpointConfiguration.e) && h.a(this.f, yourLibraryEndpointConfiguration.f) && h.a(this.g, yourLibraryEndpointConfiguration.g) && this.h == yourLibraryEndpointConfiguration.h && h.a(this.i, yourLibraryEndpointConfiguration.i) && h.a(this.j, yourLibraryEndpointConfiguration.j) && h.a(this.k, yourLibraryEndpointConfiguration.k) && h.a(this.l, yourLibraryEndpointConfiguration.l) && h.a(this.m, yourLibraryEndpointConfiguration.m) && h.a(this.n, yourLibraryEndpointConfiguration.n) && h.a(this.o, yourLibraryEndpointConfiguration.o) && h.a(this.p, yourLibraryEndpointConfiguration.p) && h.a(this.q, yourLibraryEndpointConfiguration.q) && h.a(this.r, yourLibraryEndpointConfiguration.r) && h.a(this.s, yourLibraryEndpointConfiguration.s);
    }

    public int hashCode() {
        String str = this.c;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.e;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f;
        int hashCode4 = (hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Boolean bool = this.g;
        int hashCode5 = (((hashCode4 + (bool != null ? bool.hashCode() : 0)) * 31) + this.h) * 31;
        Boolean bool2 = this.i;
        int hashCode6 = (hashCode5 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Sort sort = this.j;
        int hashCode7 = (hashCode6 + (sort != null ? sort.hashCode() : 0)) * 31;
        Entity entity = this.k;
        int hashCode8 = (hashCode7 + (entity != null ? entity.hashCode() : 0)) * 31;
        String str3 = this.l;
        int hashCode9 = (hashCode8 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.m;
        int hashCode10 = (hashCode9 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.n;
        int hashCode11 = (hashCode10 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.o;
        int hashCode12 = (hashCode11 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Boolean bool3 = this.p;
        int hashCode13 = (hashCode12 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        String str7 = this.q;
        int hashCode14 = (hashCode13 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Boolean bool4 = this.r;
        int hashCode15 = (hashCode14 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        List<String> list = this.s;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode15 + i2;
    }

    public String toString() {
        StringBuilder V0 = je.V0("YourLibraryEndpointConfiguration(username=");
        V0.append(this.c);
        V0.append(", lowerBound=");
        V0.append(this.d);
        V0.append(", skip=");
        V0.append(this.e);
        V0.append(", length=");
        V0.append(this.f);
        V0.append(", remainingEntities=");
        V0.append(this.g);
        V0.append(", updateThrottling=");
        V0.append(this.h);
        V0.append(", reverse=");
        V0.append(this.i);
        V0.append(", sort=");
        V0.append(this.j);
        V0.append(", entity=");
        V0.append(this.k);
        V0.append(", likedSongsLabel=");
        V0.append(this.l);
        V0.append(", likedSongsImageURI=");
        V0.append(this.m);
        V0.append(", yourEpisodesLabel=");
        V0.append(this.n);
        V0.append(", yourEpisodesImageUri=");
        V0.append(this.o);
        V0.append(", downloads=");
        V0.append(this.p);
        V0.append(", textFilter=");
        V0.append(this.q);
        V0.append(", showPublishDate=");
        V0.append(this.r);
        V0.append(", requestedUris=");
        return je.L0(V0, this.s, ")");
    }
}

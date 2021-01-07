package com.spotify.playlist.endpoints.policy.playlist;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyMap;
import kotlin.collections.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ListPolicy implements JacksonModel, Parcelable {
    public static final Parcelable.Creator CREATOR = new c();
    public static final b Companion = new b(null);
    private final Map<String, Boolean> addedByAttributes;
    private final Map<String, Boolean> albumAttributes;
    private final Map<String, Boolean> artistsAttributes;
    private final Map<String, Boolean> attributes;
    private final Map<String, Boolean> podcastSegmentsAttributes;
    private final Map<String, Boolean> showAttributes;

    public static final class a {
        private Map<String, Boolean> a;
        private Map<String, Boolean> b;
        private Map<String, Boolean> c;
        private Map<String, Boolean> d;
        private Map<String, Boolean> e;
        private Map<String, Boolean> f;

        public a() {
            this(null, null, null, null, null, null, 63);
        }

        public a(Map<String, Boolean> map, Map<String, Boolean> map2, Map<String, Boolean> map3, Map<String, Boolean> map4, Map<String, Boolean> map5, Map<String, Boolean> map6) {
            h.e(map, "attributes");
            h.e(map2, "showAttributes");
            h.e(map3, "albumAttributes");
            h.e(map4, "addedByAttributes");
            h.e(map5, "artistsAttributes");
            h.e(map6, "podcastSegmentsAttributes");
            this.a = map;
            this.b = map2;
            this.c = map3;
            this.d = map4;
            this.e = map5;
            this.f = map6;
        }

        public final a a(Map<String, Boolean> map) {
            h.e(map, "addedByAttributes");
            this.d = map;
            return this;
        }

        public final a b(Map<String, Boolean> map) {
            h.e(map, "albumAttributes");
            this.c = map;
            return this;
        }

        public final a c(Map<String, Boolean> map) {
            h.e(map, "artistsAttributes");
            this.e = map;
            return this;
        }

        public final a d(Map<String, Boolean> map) {
            h.e(map, "attributes");
            this.a = map;
            return this;
        }

        public final ListPolicy e() {
            return new ListPolicy(this.a, this.b, this.c, this.d, this.e, this.f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return h.a(this.a, aVar.a) && h.a(this.b, aVar.b) && h.a(this.c, aVar.c) && h.a(this.d, aVar.d) && h.a(this.e, aVar.e) && h.a(this.f, aVar.f);
        }

        public final a f(Map<String, Boolean> map) {
            h.e(map, "podcastSegmentsAttributes");
            this.f = map;
            return this;
        }

        public final a g(Map<String, Boolean> map) {
            h.e(map, "showAttributes");
            this.b = map;
            return this;
        }

        public int hashCode() {
            Map<String, Boolean> map = this.a;
            int i = 0;
            int hashCode = (map != null ? map.hashCode() : 0) * 31;
            Map<String, Boolean> map2 = this.b;
            int hashCode2 = (hashCode + (map2 != null ? map2.hashCode() : 0)) * 31;
            Map<String, Boolean> map3 = this.c;
            int hashCode3 = (hashCode2 + (map3 != null ? map3.hashCode() : 0)) * 31;
            Map<String, Boolean> map4 = this.d;
            int hashCode4 = (hashCode3 + (map4 != null ? map4.hashCode() : 0)) * 31;
            Map<String, Boolean> map5 = this.e;
            int hashCode5 = (hashCode4 + (map5 != null ? map5.hashCode() : 0)) * 31;
            Map<String, Boolean> map6 = this.f;
            if (map6 != null) {
                i = map6.hashCode();
            }
            return hashCode5 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Builder(attributes=");
            V0.append(this.a);
            V0.append(", showAttributes=");
            V0.append(this.b);
            V0.append(", albumAttributes=");
            V0.append(this.c);
            V0.append(", addedByAttributes=");
            V0.append(this.d);
            V0.append(", artistsAttributes=");
            V0.append(this.e);
            V0.append(", podcastSegmentsAttributes=");
            return je.M0(V0, this.f, ")");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(Map map, Map map2, Map map3, Map map4, Map map5, Map map6, int i) {
            this((i & 1) != 0 ? d.x(new Pair("link", Boolean.FALSE)) : null, (i & 2) != 0 ? EmptyMap.a : null, (i & 4) != 0 ? EmptyMap.a : null, (i & 8) != 0 ? EmptyMap.a : null, (i & 16) != 0 ? EmptyMap.a : null, (i & 32) != 0 ? EmptyMap.a : null);
        }
    }

    public static final class b {
        public b(f fVar) {
        }

        public final a a() {
            return new a(null, null, null, null, null, null, 63);
        }
    }

    public static class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            while (true) {
                boolean z = true;
                if (readInt == 0) {
                    break;
                }
                String readString = parcel.readString();
                if (parcel.readInt() == 0) {
                    z = false;
                }
                linkedHashMap.put(readString, Boolean.valueOf(z));
                readInt--;
            }
            int readInt2 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
            while (readInt2 != 0) {
                linkedHashMap2.put(parcel.readString(), Boolean.valueOf(parcel.readInt() != 0));
                readInt2--;
            }
            int readInt3 = parcel.readInt();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(readInt3);
            while (readInt3 != 0) {
                linkedHashMap3.put(parcel.readString(), Boolean.valueOf(parcel.readInt() != 0));
                readInt3--;
            }
            int readInt4 = parcel.readInt();
            LinkedHashMap linkedHashMap4 = new LinkedHashMap(readInt4);
            while (readInt4 != 0) {
                linkedHashMap4.put(parcel.readString(), Boolean.valueOf(parcel.readInt() != 0));
                readInt4--;
            }
            int readInt5 = parcel.readInt();
            LinkedHashMap linkedHashMap5 = new LinkedHashMap(readInt5);
            while (readInt5 != 0) {
                linkedHashMap5.put(parcel.readString(), Boolean.valueOf(parcel.readInt() != 0));
                readInt5--;
            }
            int readInt6 = parcel.readInt();
            LinkedHashMap linkedHashMap6 = new LinkedHashMap(readInt6);
            while (readInt6 != 0) {
                linkedHashMap6.put(parcel.readString(), Boolean.valueOf(parcel.readInt() != 0));
                readInt6--;
            }
            return new ListPolicy(linkedHashMap, linkedHashMap2, linkedHashMap3, linkedHashMap4, linkedHashMap5, linkedHashMap6);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ListPolicy[i];
        }
    }

    public ListPolicy() {
        this(null, null, null, null, null, null, 63, null);
    }

    public ListPolicy(Map<String, Boolean> map, Map<String, Boolean> map2, Map<String, Boolean> map3, Map<String, Boolean> map4, Map<String, Boolean> map5, Map<String, Boolean> map6) {
        h.e(map, "attributes");
        h.e(map2, "showAttributes");
        h.e(map3, "albumAttributes");
        h.e(map4, "addedByAttributes");
        h.e(map5, "artistsAttributes");
        h.e(map6, "podcastSegmentsAttributes");
        this.attributes = map;
        this.showAttributes = map2;
        this.albumAttributes = map3;
        this.addedByAttributes = map4;
        this.artistsAttributes = map5;
        this.podcastSegmentsAttributes = map6;
    }

    public static final a builder() {
        return Companion.a();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.spotify.playlist.endpoints.policy.playlist.ListPolicy */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ListPolicy copy$default(ListPolicy listPolicy, Map map, Map map2, Map map3, Map map4, Map map5, Map map6, int i, Object obj) {
        if ((i & 1) != 0) {
            map = listPolicy.attributes;
        }
        if ((i & 2) != 0) {
            map2 = listPolicy.showAttributes;
        }
        if ((i & 4) != 0) {
            map3 = listPolicy.albumAttributes;
        }
        if ((i & 8) != 0) {
            map4 = listPolicy.addedByAttributes;
        }
        if ((i & 16) != 0) {
            map5 = listPolicy.artistsAttributes;
        }
        if ((i & 32) != 0) {
            map6 = listPolicy.podcastSegmentsAttributes;
        }
        return listPolicy.copy(map, map2, map3, map4, map5, map6);
    }

    @JsonProperty("addedBy")
    public final Map<String, Boolean> addedByAttributes() {
        return this.addedByAttributes;
    }

    @JsonProperty("album")
    public final Map<String, Boolean> albumAttributes() {
        return this.albumAttributes;
    }

    @JsonProperty("artists")
    public final Map<String, Boolean> artistsAttributes() {
        return this.artistsAttributes;
    }

    @JsonAnyGetter
    public final Map<String, Boolean> attributes() {
        return this.attributes;
    }

    public final Map<String, Boolean> component1() {
        return this.attributes;
    }

    public final Map<String, Boolean> component2() {
        return this.showAttributes;
    }

    public final Map<String, Boolean> component3() {
        return this.albumAttributes;
    }

    public final Map<String, Boolean> component4() {
        return this.addedByAttributes;
    }

    public final Map<String, Boolean> component5() {
        return this.artistsAttributes;
    }

    public final Map<String, Boolean> component6() {
        return this.podcastSegmentsAttributes;
    }

    public final ListPolicy copy(Map<String, Boolean> map, Map<String, Boolean> map2, Map<String, Boolean> map3, Map<String, Boolean> map4, Map<String, Boolean> map5, Map<String, Boolean> map6) {
        h.e(map, "attributes");
        h.e(map2, "showAttributes");
        h.e(map3, "albumAttributes");
        h.e(map4, "addedByAttributes");
        h.e(map5, "artistsAttributes");
        h.e(map6, "podcastSegmentsAttributes");
        return new ListPolicy(map, map2, map3, map4, map5, map6);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListPolicy)) {
            return false;
        }
        ListPolicy listPolicy = (ListPolicy) obj;
        return h.a(this.attributes, listPolicy.attributes) && h.a(this.showAttributes, listPolicy.showAttributes) && h.a(this.albumAttributes, listPolicy.albumAttributes) && h.a(this.addedByAttributes, listPolicy.addedByAttributes) && h.a(this.artistsAttributes, listPolicy.artistsAttributes) && h.a(this.podcastSegmentsAttributes, listPolicy.podcastSegmentsAttributes);
    }

    @Override // java.lang.Object
    public int hashCode() {
        Map<String, Boolean> map = this.attributes;
        int i = 0;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        Map<String, Boolean> map2 = this.showAttributes;
        int hashCode2 = (hashCode + (map2 != null ? map2.hashCode() : 0)) * 31;
        Map<String, Boolean> map3 = this.albumAttributes;
        int hashCode3 = (hashCode2 + (map3 != null ? map3.hashCode() : 0)) * 31;
        Map<String, Boolean> map4 = this.addedByAttributes;
        int hashCode4 = (hashCode3 + (map4 != null ? map4.hashCode() : 0)) * 31;
        Map<String, Boolean> map5 = this.artistsAttributes;
        int hashCode5 = (hashCode4 + (map5 != null ? map5.hashCode() : 0)) * 31;
        Map<String, Boolean> map6 = this.podcastSegmentsAttributes;
        if (map6 != null) {
            i = map6.hashCode();
        }
        return hashCode5 + i;
    }

    @JsonProperty("podcastSegments")
    public final Map<String, Boolean> podcastSegmentsAttributes() {
        return this.podcastSegmentsAttributes;
    }

    @JsonProperty("show")
    public final Map<String, Boolean> showAttributes() {
        return this.showAttributes;
    }

    public final a toBuilder() {
        return new a(this.attributes, this.showAttributes, this.albumAttributes, this.addedByAttributes, this.artistsAttributes, this.podcastSegmentsAttributes);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("ListPolicy(attributes=");
        V0.append(this.attributes);
        V0.append(", showAttributes=");
        V0.append(this.showAttributes);
        V0.append(", albumAttributes=");
        V0.append(this.albumAttributes);
        V0.append(", addedByAttributes=");
        V0.append(this.addedByAttributes);
        V0.append(", artistsAttributes=");
        V0.append(this.artistsAttributes);
        V0.append(", podcastSegmentsAttributes=");
        return je.M0(V0, this.podcastSegmentsAttributes, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        Map<String, Boolean> map = this.attributes;
        parcel.writeInt(map.size());
        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeInt(entry.getValue().booleanValue() ? 1 : 0);
        }
        Map<String, Boolean> map2 = this.showAttributes;
        parcel.writeInt(map2.size());
        for (Map.Entry<String, Boolean> entry2 : map2.entrySet()) {
            parcel.writeString(entry2.getKey());
            parcel.writeInt(entry2.getValue().booleanValue() ? 1 : 0);
        }
        Map<String, Boolean> map3 = this.albumAttributes;
        parcel.writeInt(map3.size());
        for (Map.Entry<String, Boolean> entry3 : map3.entrySet()) {
            parcel.writeString(entry3.getKey());
            parcel.writeInt(entry3.getValue().booleanValue() ? 1 : 0);
        }
        Map<String, Boolean> map4 = this.addedByAttributes;
        parcel.writeInt(map4.size());
        for (Map.Entry<String, Boolean> entry4 : map4.entrySet()) {
            parcel.writeString(entry4.getKey());
            parcel.writeInt(entry4.getValue().booleanValue() ? 1 : 0);
        }
        Map<String, Boolean> map5 = this.artistsAttributes;
        parcel.writeInt(map5.size());
        for (Map.Entry<String, Boolean> entry5 : map5.entrySet()) {
            parcel.writeString(entry5.getKey());
            parcel.writeInt(entry5.getValue().booleanValue() ? 1 : 0);
        }
        Map<String, Boolean> map6 = this.podcastSegmentsAttributes;
        parcel.writeInt(map6.size());
        for (Map.Entry<String, Boolean> entry6 : map6.entrySet()) {
            parcel.writeString(entry6.getKey());
            parcel.writeInt(entry6.getValue().booleanValue() ? 1 : 0);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ListPolicy(Map map, Map map2, Map map3, Map map4, Map map5, Map map6, int i, f fVar) {
        this((i & 1) != 0 ? d.x(new Pair("link", Boolean.FALSE)) : map, (i & 2) != 0 ? EmptyMap.a : map2, (i & 4) != 0 ? EmptyMap.a : map3, (i & 8) != 0 ? EmptyMap.a : map4, (i & 16) != 0 ? EmptyMap.a : map5, (i & 32) != 0 ? EmptyMap.a : map6);
    }
}

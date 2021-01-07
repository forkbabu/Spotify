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
public final class HeaderPolicy implements JacksonModel, Parcelable {
    public static final Parcelable.Creator CREATOR = new c();
    public static final b Companion = new b(null);
    private final Map<String, Boolean> attributes;
    private final CollaboratingUsersDecorationPolicy collaboratingUsers;
    private final Map<String, Boolean> madeForAttributes;
    private final Map<String, Boolean> ownerAttributes;

    public static final class a {
        private Map<String, Boolean> a;
        private Map<String, Boolean> b;
        private Map<String, Boolean> c;
        private CollaboratingUsersDecorationPolicy d;

        public a() {
            this(null, null, null, null, 15);
        }

        public a(Map<String, Boolean> map, Map<String, Boolean> map2, Map<String, Boolean> map3, CollaboratingUsersDecorationPolicy collaboratingUsersDecorationPolicy) {
            h.e(map, "attributes");
            h.e(map2, "ownerAttributes");
            h.e(map3, "madeForAttributes");
            h.e(collaboratingUsersDecorationPolicy, "collaboratingUsers");
            this.a = map;
            this.b = map2;
            this.c = map3;
            this.d = collaboratingUsersDecorationPolicy;
        }

        public final a a(Map<String, Boolean> map) {
            h.e(map, "attributes");
            this.a = map;
            return this;
        }

        public final HeaderPolicy b() {
            return new HeaderPolicy(this.a, this.b, this.c, this.d);
        }

        public final a c(CollaboratingUsersDecorationPolicy collaboratingUsersDecorationPolicy) {
            h.e(collaboratingUsersDecorationPolicy, "collaboratingUsers");
            this.d = collaboratingUsersDecorationPolicy;
            return this;
        }

        public final a d(Map<String, Boolean> map) {
            h.e(map, "madeForAttributes");
            this.c = map;
            return this;
        }

        public final a e(Map<String, Boolean> map) {
            h.e(map, "ownerAttributes");
            this.b = map;
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
            return h.a(this.a, aVar.a) && h.a(this.b, aVar.b) && h.a(this.c, aVar.c) && h.a(this.d, aVar.d);
        }

        public int hashCode() {
            Map<String, Boolean> map = this.a;
            int i = 0;
            int hashCode = (map != null ? map.hashCode() : 0) * 31;
            Map<String, Boolean> map2 = this.b;
            int hashCode2 = (hashCode + (map2 != null ? map2.hashCode() : 0)) * 31;
            Map<String, Boolean> map3 = this.c;
            int hashCode3 = (hashCode2 + (map3 != null ? map3.hashCode() : 0)) * 31;
            CollaboratingUsersDecorationPolicy collaboratingUsersDecorationPolicy = this.d;
            if (collaboratingUsersDecorationPolicy != null) {
                i = collaboratingUsersDecorationPolicy.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Builder(attributes=");
            V0.append(this.a);
            V0.append(", ownerAttributes=");
            V0.append(this.b);
            V0.append(", madeForAttributes=");
            V0.append(this.c);
            V0.append(", collaboratingUsers=");
            V0.append(this.d);
            V0.append(")");
            return V0.toString();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(Map map, Map map2, Map map3, CollaboratingUsersDecorationPolicy collaboratingUsersDecorationPolicy, int i) {
            this((i & 1) != 0 ? d.x(new Pair("link", Boolean.TRUE)) : null, (i & 2) != 0 ? EmptyMap.a : null, (i & 4) != 0 ? EmptyMap.a : null, (i & 8) != 0 ? new CollaboratingUsersDecorationPolicy(0, false, null, 7, null) : null);
        }
    }

    public static final class b {
        public b(f fVar) {
        }

        public final a a() {
            return new a(null, null, null, null, 15);
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
            return new HeaderPolicy(linkedHashMap, linkedHashMap2, linkedHashMap3, (CollaboratingUsersDecorationPolicy) CollaboratingUsersDecorationPolicy.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HeaderPolicy[i];
        }
    }

    public HeaderPolicy() {
        this(null, null, null, null, 15, null);
    }

    public HeaderPolicy(Map<String, Boolean> map, Map<String, Boolean> map2, Map<String, Boolean> map3, CollaboratingUsersDecorationPolicy collaboratingUsersDecorationPolicy) {
        h.e(map, "attributes");
        h.e(map2, "ownerAttributes");
        h.e(map3, "madeForAttributes");
        h.e(collaboratingUsersDecorationPolicy, "collaboratingUsers");
        this.attributes = map;
        this.ownerAttributes = map2;
        this.madeForAttributes = map3;
        this.collaboratingUsers = collaboratingUsersDecorationPolicy;
    }

    public static final a builder() {
        return Companion.a();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.spotify.playlist.endpoints.policy.playlist.HeaderPolicy */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HeaderPolicy copy$default(HeaderPolicy headerPolicy, Map map, Map map2, Map map3, CollaboratingUsersDecorationPolicy collaboratingUsersDecorationPolicy, int i, Object obj) {
        if ((i & 1) != 0) {
            map = headerPolicy.attributes;
        }
        if ((i & 2) != 0) {
            map2 = headerPolicy.ownerAttributes;
        }
        if ((i & 4) != 0) {
            map3 = headerPolicy.madeForAttributes;
        }
        if ((i & 8) != 0) {
            collaboratingUsersDecorationPolicy = headerPolicy.collaboratingUsers;
        }
        return headerPolicy.copy(map, map2, map3, collaboratingUsersDecorationPolicy);
    }

    @JsonAnyGetter
    public final Map<String, Boolean> attributes() {
        return this.attributes;
    }

    @JsonProperty("collaboratingUsers")
    public final CollaboratingUsersDecorationPolicy collaboratingUsers() {
        return this.collaboratingUsers;
    }

    public final Map<String, Boolean> component1() {
        return this.attributes;
    }

    public final Map<String, Boolean> component2() {
        return this.ownerAttributes;
    }

    public final Map<String, Boolean> component3() {
        return this.madeForAttributes;
    }

    public final CollaboratingUsersDecorationPolicy component4() {
        return this.collaboratingUsers;
    }

    public final HeaderPolicy copy(Map<String, Boolean> map, Map<String, Boolean> map2, Map<String, Boolean> map3, CollaboratingUsersDecorationPolicy collaboratingUsersDecorationPolicy) {
        h.e(map, "attributes");
        h.e(map2, "ownerAttributes");
        h.e(map3, "madeForAttributes");
        h.e(collaboratingUsersDecorationPolicy, "collaboratingUsers");
        return new HeaderPolicy(map, map2, map3, collaboratingUsersDecorationPolicy);
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
        if (!(obj instanceof HeaderPolicy)) {
            return false;
        }
        HeaderPolicy headerPolicy = (HeaderPolicy) obj;
        return h.a(this.attributes, headerPolicy.attributes) && h.a(this.ownerAttributes, headerPolicy.ownerAttributes) && h.a(this.madeForAttributes, headerPolicy.madeForAttributes) && h.a(this.collaboratingUsers, headerPolicy.collaboratingUsers);
    }

    @Override // java.lang.Object
    public int hashCode() {
        Map<String, Boolean> map = this.attributes;
        int i = 0;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        Map<String, Boolean> map2 = this.ownerAttributes;
        int hashCode2 = (hashCode + (map2 != null ? map2.hashCode() : 0)) * 31;
        Map<String, Boolean> map3 = this.madeForAttributes;
        int hashCode3 = (hashCode2 + (map3 != null ? map3.hashCode() : 0)) * 31;
        CollaboratingUsersDecorationPolicy collaboratingUsersDecorationPolicy = this.collaboratingUsers;
        if (collaboratingUsersDecorationPolicy != null) {
            i = collaboratingUsersDecorationPolicy.hashCode();
        }
        return hashCode3 + i;
    }

    @JsonProperty("madeFor")
    public final Map<String, Boolean> madeForAttributes() {
        return this.madeForAttributes;
    }

    @JsonProperty("owner")
    public final Map<String, Boolean> ownerAttributes() {
        return this.ownerAttributes;
    }

    public final a toBuilder() {
        return new a(this.attributes, this.ownerAttributes, this.madeForAttributes, this.collaboratingUsers);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("HeaderPolicy(attributes=");
        V0.append(this.attributes);
        V0.append(", ownerAttributes=");
        V0.append(this.ownerAttributes);
        V0.append(", madeForAttributes=");
        V0.append(this.madeForAttributes);
        V0.append(", collaboratingUsers=");
        V0.append(this.collaboratingUsers);
        V0.append(")");
        return V0.toString();
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
        Map<String, Boolean> map2 = this.ownerAttributes;
        parcel.writeInt(map2.size());
        for (Map.Entry<String, Boolean> entry2 : map2.entrySet()) {
            parcel.writeString(entry2.getKey());
            parcel.writeInt(entry2.getValue().booleanValue() ? 1 : 0);
        }
        Map<String, Boolean> map3 = this.madeForAttributes;
        parcel.writeInt(map3.size());
        for (Map.Entry<String, Boolean> entry3 : map3.entrySet()) {
            parcel.writeString(entry3.getKey());
            parcel.writeInt(entry3.getValue().booleanValue() ? 1 : 0);
        }
        this.collaboratingUsers.writeToParcel(parcel, 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HeaderPolicy(Map map, Map map2, Map map3, CollaboratingUsersDecorationPolicy collaboratingUsersDecorationPolicy, int i, f fVar) {
        this((i & 1) != 0 ? d.x(new Pair("link", Boolean.TRUE)) : map, (i & 2) != 0 ? EmptyMap.a : map2, (i & 4) != 0 ? EmptyMap.a : map3, (i & 8) != 0 ? new CollaboratingUsersDecorationPolicy(0, false, null, 7, null) : collaboratingUsersDecorationPolicy);
    }
}

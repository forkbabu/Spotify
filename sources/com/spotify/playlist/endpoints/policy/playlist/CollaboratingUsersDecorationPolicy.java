package com.spotify.playlist.endpoints.policy.playlist;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

@JsonInclude(JsonInclude.Include.NON_NULL)
public final class CollaboratingUsersDecorationPolicy implements JacksonModel, Parcelable {
    public static final Parcelable.Creator CREATOR = new c();
    public static final b Companion = new b(null);
    private final Collaborator collaborator;
    private final boolean count;
    private final int limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static final class Collaborator implements JacksonModel, Parcelable {
        public static final Parcelable.Creator CREATOR = new c();
        public static final b Companion = new b(null);
        private final boolean isOwner;
        private final boolean numberOfEpisodes;
        private final boolean numberOfItems;
        private final boolean numberOfTracks;
        private final Map<String, Boolean> userAttributes;

        public static final class a {
            private boolean a;
            private boolean b;
            private boolean c;
            private boolean d;
            private Map<String, Boolean> e;

            public a() {
                this(false, false, false, false, null, 31);
            }

            public a(boolean z, boolean z2, boolean z3, boolean z4, Map<String, Boolean> map) {
                h.e(map, "userAttributes");
                this.a = z;
                this.b = z2;
                this.c = z3;
                this.d = z4;
                this.e = map;
            }

            public final Collaborator a() {
                return new Collaborator(this.a, this.b, this.c, this.d, this.e);
            }

            public final a b(boolean z) {
                this.a = z;
                return this;
            }

            public final a c(boolean z) {
                this.d = z;
                return this;
            }

            public final a d(boolean z) {
                this.c = z;
                return this;
            }

            public final a e(Map<String, Boolean> map) {
                h.e(map, "userAttributes");
                this.e = map;
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
                return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && h.a(this.e, aVar.e);
            }

            public int hashCode() {
                boolean z = this.a;
                int i = 1;
                if (z) {
                    z = true;
                }
                int i2 = z ? 1 : 0;
                int i3 = z ? 1 : 0;
                int i4 = z ? 1 : 0;
                int i5 = i2 * 31;
                boolean z2 = this.b;
                if (z2) {
                    z2 = true;
                }
                int i6 = z2 ? 1 : 0;
                int i7 = z2 ? 1 : 0;
                int i8 = z2 ? 1 : 0;
                int i9 = (i5 + i6) * 31;
                boolean z3 = this.c;
                if (z3) {
                    z3 = true;
                }
                int i10 = z3 ? 1 : 0;
                int i11 = z3 ? 1 : 0;
                int i12 = z3 ? 1 : 0;
                int i13 = (i9 + i10) * 31;
                boolean z4 = this.d;
                if (!z4) {
                    i = z4 ? 1 : 0;
                }
                int i14 = (i13 + i) * 31;
                Map<String, Boolean> map = this.e;
                return i14 + (map != null ? map.hashCode() : 0);
            }

            public String toString() {
                StringBuilder V0 = je.V0("Builder(isOwner=");
                V0.append(this.a);
                V0.append(", numberOfItems=");
                V0.append(this.b);
                V0.append(", numberOfTracks=");
                V0.append(this.c);
                V0.append(", numberOfEpisodes=");
                V0.append(this.d);
                V0.append(", userAttributes=");
                return je.M0(V0, this.e, ")");
            }

            public a(boolean z, boolean z2, boolean z3, boolean z4, Map map, int i) {
                z = (i & 1) != 0 ? false : z;
                z2 = (i & 2) != 0 ? false : z2;
                z3 = (i & 4) != 0 ? false : z3;
                z4 = (i & 8) != 0 ? false : z4;
                Map<String, Boolean> map2 = (i & 16) != 0 ? EmptyMap.a : null;
                h.e(map2, "userAttributes");
                this.a = z;
                this.b = z2;
                this.c = z3;
                this.d = z4;
                this.e = map2;
            }
        }

        public static final class b {
            public b(f fVar) {
            }
        }

        public static class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                h.e(parcel, "in");
                boolean z = parcel.readInt() != 0;
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                boolean z4 = parcel.readInt() != 0;
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                while (readInt != 0) {
                    linkedHashMap.put(parcel.readString(), Boolean.valueOf(parcel.readInt() != 0));
                    readInt--;
                }
                return new Collaborator(z, z2, z3, z4, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Collaborator[i];
            }
        }

        public Collaborator() {
            this(false, false, false, false, null, 31, null);
        }

        public Collaborator(boolean z, boolean z2, boolean z3, boolean z4, Map<String, Boolean> map) {
            h.e(map, "userAttributes");
            this.isOwner = z;
            this.numberOfItems = z2;
            this.numberOfTracks = z3;
            this.numberOfEpisodes = z4;
            this.userAttributes = map;
        }

        public static final a builder() {
            Companion.getClass();
            return new a(false, false, false, false, null, 31);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.spotify.playlist.endpoints.policy.playlist.CollaboratingUsersDecorationPolicy$Collaborator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Collaborator copy$default(Collaborator collaborator, boolean z, boolean z2, boolean z3, boolean z4, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                z = collaborator.isOwner;
            }
            if ((i & 2) != 0) {
                z2 = collaborator.numberOfItems;
            }
            if ((i & 4) != 0) {
                z3 = collaborator.numberOfTracks;
            }
            if ((i & 8) != 0) {
                z4 = collaborator.numberOfEpisodes;
            }
            if ((i & 16) != 0) {
                map = collaborator.userAttributes;
            }
            return collaborator.copy(z, z2, z3, z4, map);
        }

        public final boolean component1() {
            return this.isOwner;
        }

        public final boolean component2() {
            return this.numberOfItems;
        }

        public final boolean component3() {
            return this.numberOfTracks;
        }

        public final boolean component4() {
            return this.numberOfEpisodes;
        }

        public final Map<String, Boolean> component5() {
            return this.userAttributes;
        }

        public final Collaborator copy(boolean z, boolean z2, boolean z3, boolean z4, Map<String, Boolean> map) {
            h.e(map, "userAttributes");
            return new Collaborator(z, z2, z3, z4, map);
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
            if (!(obj instanceof Collaborator)) {
                return false;
            }
            Collaborator collaborator = (Collaborator) obj;
            return this.isOwner == collaborator.isOwner && this.numberOfItems == collaborator.numberOfItems && this.numberOfTracks == collaborator.numberOfTracks && this.numberOfEpisodes == collaborator.numberOfEpisodes && h.a(this.userAttributes, collaborator.userAttributes);
        }

        @Override // java.lang.Object
        public int hashCode() {
            boolean z = this.isOwner;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = i2 * 31;
            boolean z2 = this.numberOfItems;
            if (z2) {
                z2 = true;
            }
            int i6 = z2 ? 1 : 0;
            int i7 = z2 ? 1 : 0;
            int i8 = z2 ? 1 : 0;
            int i9 = (i5 + i6) * 31;
            boolean z3 = this.numberOfTracks;
            if (z3) {
                z3 = true;
            }
            int i10 = z3 ? 1 : 0;
            int i11 = z3 ? 1 : 0;
            int i12 = z3 ? 1 : 0;
            int i13 = (i9 + i10) * 31;
            boolean z4 = this.numberOfEpisodes;
            if (!z4) {
                i = z4 ? 1 : 0;
            }
            int i14 = (i13 + i) * 31;
            Map<String, Boolean> map = this.userAttributes;
            return i14 + (map != null ? map.hashCode() : 0);
        }

        @JsonProperty("isOwner")
        public final boolean isOwner() {
            return this.isOwner;
        }

        @JsonProperty("numberOfEpisodes")
        public final boolean numberOfEpisodes() {
            return this.numberOfEpisodes;
        }

        @JsonProperty("numberOfItems")
        public final boolean numberOfItems() {
            return this.numberOfItems;
        }

        @JsonProperty("numberOfTracks")
        public final boolean numberOfTracks() {
            return this.numberOfTracks;
        }

        public final a toBuilder() {
            return new a(this.isOwner, this.numberOfItems, this.numberOfTracks, this.numberOfEpisodes, this.userAttributes);
        }

        @Override // java.lang.Object
        public String toString() {
            StringBuilder V0 = je.V0("Collaborator(isOwner=");
            V0.append(this.isOwner);
            V0.append(", numberOfItems=");
            V0.append(this.numberOfItems);
            V0.append(", numberOfTracks=");
            V0.append(this.numberOfTracks);
            V0.append(", numberOfEpisodes=");
            V0.append(this.numberOfEpisodes);
            V0.append(", userAttributes=");
            return je.M0(V0, this.userAttributes, ")");
        }

        @JsonProperty("user")
        public final Map<String, Boolean> userAttributes() {
            return this.userAttributes;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            h.e(parcel, "parcel");
            parcel.writeInt(this.isOwner ? 1 : 0);
            parcel.writeInt(this.numberOfItems ? 1 : 0);
            parcel.writeInt(this.numberOfTracks ? 1 : 0);
            parcel.writeInt(this.numberOfEpisodes ? 1 : 0);
            Map<String, Boolean> map = this.userAttributes;
            parcel.writeInt(map.size());
            for (Map.Entry<String, Boolean> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeInt(entry.getValue().booleanValue() ? 1 : 0);
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Collaborator(boolean z, boolean z2, boolean z3, boolean z4, Map map, int i, f fVar) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) == 0 ? z4 : false, (i & 16) != 0 ? EmptyMap.a : map);
        }
    }

    public static final class a {
        private int a;
        private boolean b;
        private Collaborator c;

        public a() {
            this(0, false, null, 7);
        }

        public a(int i, boolean z, Collaborator collaborator) {
            h.e(collaborator, "collaborator");
            this.a = i;
            this.b = z;
            this.c = collaborator;
        }

        public final CollaboratingUsersDecorationPolicy a() {
            return new CollaboratingUsersDecorationPolicy(this.a, this.b, this.c);
        }

        public final a b(Collaborator collaborator) {
            h.e(collaborator, "collaborator");
            this.c = collaborator;
            return this;
        }

        public final a c(boolean z) {
            this.b = z;
            return this;
        }

        public final a d(int i) {
            this.a = i;
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
            return this.a == aVar.a && this.b == aVar.b && h.a(this.c, aVar.c);
        }

        public int hashCode() {
            int i = this.a * 31;
            boolean z = this.b;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = (i + i2) * 31;
            Collaborator collaborator = this.c;
            return i5 + (collaborator != null ? collaborator.hashCode() : 0);
        }

        public String toString() {
            StringBuilder V0 = je.V0("Builder(limit=");
            V0.append(this.a);
            V0.append(", count=");
            V0.append(this.b);
            V0.append(", collaborator=");
            V0.append(this.c);
            V0.append(")");
            return V0.toString();
        }

        public a(int i, boolean z, Collaborator collaborator, int i2) {
            i = (i2 & 1) != 0 ? 0 : i;
            z = (i2 & 2) != 0 ? false : z;
            Collaborator collaborator2 = (i2 & 4) != 0 ? new Collaborator(false, false, false, false, null, 31, null) : null;
            h.e(collaborator2, "collaborator");
            this.a = i;
            this.b = z;
            this.c = collaborator2;
        }
    }

    public static final class b {
        public b(f fVar) {
        }
    }

    public static class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            return new CollaboratingUsersDecorationPolicy(parcel.readInt(), parcel.readInt() != 0, (Collaborator) Collaborator.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CollaboratingUsersDecorationPolicy[i];
        }
    }

    public CollaboratingUsersDecorationPolicy() {
        this(0, false, null, 7, null);
    }

    public CollaboratingUsersDecorationPolicy(int i, boolean z, Collaborator collaborator2) {
        h.e(collaborator2, "collaborator");
        this.limit = i;
        this.count = z;
        this.collaborator = collaborator2;
    }

    public static final a builder() {
        Companion.getClass();
        return new a(0, false, null, 7);
    }

    public static /* synthetic */ CollaboratingUsersDecorationPolicy copy$default(CollaboratingUsersDecorationPolicy collaboratingUsersDecorationPolicy, int i, boolean z, Collaborator collaborator2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = collaboratingUsersDecorationPolicy.limit;
        }
        if ((i2 & 2) != 0) {
            z = collaboratingUsersDecorationPolicy.count;
        }
        if ((i2 & 4) != 0) {
            collaborator2 = collaboratingUsersDecorationPolicy.collaborator;
        }
        return collaboratingUsersDecorationPolicy.copy(i, z, collaborator2);
    }

    @JsonProperty("collaborator")
    public final Collaborator collaborator() {
        return this.collaborator;
    }

    public final int component1() {
        return this.limit;
    }

    public final boolean component2() {
        return this.count;
    }

    public final Collaborator component3() {
        return this.collaborator;
    }

    public final CollaboratingUsersDecorationPolicy copy(int i, boolean z, Collaborator collaborator2) {
        h.e(collaborator2, "collaborator");
        return new CollaboratingUsersDecorationPolicy(i, z, collaborator2);
    }

    @JsonProperty("count")
    public final boolean count() {
        return this.count;
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
        if (!(obj instanceof CollaboratingUsersDecorationPolicy)) {
            return false;
        }
        CollaboratingUsersDecorationPolicy collaboratingUsersDecorationPolicy = (CollaboratingUsersDecorationPolicy) obj;
        return this.limit == collaboratingUsersDecorationPolicy.limit && this.count == collaboratingUsersDecorationPolicy.count && h.a(this.collaborator, collaboratingUsersDecorationPolicy.collaborator);
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i = this.limit * 31;
        boolean z = this.count;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (i + i2) * 31;
        Collaborator collaborator2 = this.collaborator;
        return i5 + (collaborator2 != null ? collaborator2.hashCode() : 0);
    }

    @JsonProperty("limit")
    public final int limit() {
        return this.limit;
    }

    public final a toBuilder() {
        return new a(this.limit, this.count, this.collaborator);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("CollaboratingUsersDecorationPolicy(limit=");
        V0.append(this.limit);
        V0.append(", count=");
        V0.append(this.count);
        V0.append(", collaborator=");
        V0.append(this.collaborator);
        V0.append(")");
        return V0.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeInt(this.limit);
        parcel.writeInt(this.count ? 1 : 0);
        this.collaborator.writeToParcel(parcel, 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CollaboratingUsersDecorationPolicy(int i, boolean z, Collaborator collaborator2, int i2, f fVar) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? new Collaborator(false, false, false, false, null, 31, null) : collaborator2);
    }
}

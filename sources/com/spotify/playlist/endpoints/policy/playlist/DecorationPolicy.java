package com.spotify.playlist.endpoints.policy.playlist;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

@JsonInclude(JsonInclude.Include.NON_NULL)
public final class DecorationPolicy implements JacksonModel, Parcelable {
    public static final Parcelable.Creator CREATOR = new c();
    public static final b Companion = new b(null);
    private final HeaderPolicy headerPolicy;
    private final ListPolicy listPolicy;

    public static final class a {
        private ListPolicy a;
        private HeaderPolicy b;

        public a() {
            this(null, null, 3);
        }

        public a(ListPolicy listPolicy, HeaderPolicy headerPolicy) {
            h.e(listPolicy, "listPolicy");
            h.e(headerPolicy, "headerPolicy");
            this.a = listPolicy;
            this.b = headerPolicy;
        }

        public final DecorationPolicy a() {
            return new DecorationPolicy(this.a, this.b);
        }

        public final a b(HeaderPolicy headerPolicy) {
            h.e(headerPolicy, "headerPolicy");
            this.b = headerPolicy;
            return this;
        }

        public final a c(ListPolicy listPolicy) {
            h.e(listPolicy, "listPolicy");
            this.a = listPolicy;
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
            return h.a(this.a, aVar.a) && h.a(this.b, aVar.b);
        }

        public int hashCode() {
            ListPolicy listPolicy = this.a;
            int i = 0;
            int hashCode = (listPolicy != null ? listPolicy.hashCode() : 0) * 31;
            HeaderPolicy headerPolicy = this.b;
            if (headerPolicy != null) {
                i = headerPolicy.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Builder(listPolicy=");
            V0.append(this.a);
            V0.append(", headerPolicy=");
            V0.append(this.b);
            V0.append(")");
            return V0.toString();
        }

        public a(ListPolicy listPolicy, HeaderPolicy headerPolicy, int i) {
            HeaderPolicy headerPolicy2 = null;
            ListPolicy listPolicy2 = (i & 1) != 0 ? new ListPolicy(null, null, null, null, null, null, 63, null) : null;
            headerPolicy2 = (i & 2) != 0 ? new HeaderPolicy(null, null, null, null, 15, null) : headerPolicy2;
            h.e(listPolicy2, "listPolicy");
            h.e(headerPolicy2, "headerPolicy");
            this.a = listPolicy2;
            this.b = headerPolicy2;
        }
    }

    public static final class b {
        public b(f fVar) {
        }

        public final a a() {
            return new a(null, null, 3);
        }
    }

    public static class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            return new DecorationPolicy((ListPolicy) ListPolicy.CREATOR.createFromParcel(parcel), (HeaderPolicy) HeaderPolicy.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DecorationPolicy[i];
        }
    }

    public DecorationPolicy() {
        this(null, null, 3, null);
    }

    public DecorationPolicy(ListPolicy listPolicy2, HeaderPolicy headerPolicy2) {
        h.e(listPolicy2, "listPolicy");
        h.e(headerPolicy2, "headerPolicy");
        this.listPolicy = listPolicy2;
        this.headerPolicy = headerPolicy2;
    }

    public static final a builder() {
        return Companion.a();
    }

    public static /* synthetic */ DecorationPolicy copy$default(DecorationPolicy decorationPolicy, ListPolicy listPolicy2, HeaderPolicy headerPolicy2, int i, Object obj) {
        if ((i & 1) != 0) {
            listPolicy2 = decorationPolicy.listPolicy;
        }
        if ((i & 2) != 0) {
            headerPolicy2 = decorationPolicy.headerPolicy;
        }
        return decorationPolicy.copy(listPolicy2, headerPolicy2);
    }

    public final ListPolicy component1() {
        return this.listPolicy;
    }

    public final HeaderPolicy component2() {
        return this.headerPolicy;
    }

    public final DecorationPolicy copy(ListPolicy listPolicy2, HeaderPolicy headerPolicy2) {
        h.e(listPolicy2, "listPolicy");
        h.e(headerPolicy2, "headerPolicy");
        return new DecorationPolicy(listPolicy2, headerPolicy2);
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
        if (!(obj instanceof DecorationPolicy)) {
            return false;
        }
        DecorationPolicy decorationPolicy = (DecorationPolicy) obj;
        return h.a(this.listPolicy, decorationPolicy.listPolicy) && h.a(this.headerPolicy, decorationPolicy.headerPolicy);
    }

    @Override // java.lang.Object
    public int hashCode() {
        ListPolicy listPolicy2 = this.listPolicy;
        int i = 0;
        int hashCode = (listPolicy2 != null ? listPolicy2.hashCode() : 0) * 31;
        HeaderPolicy headerPolicy2 = this.headerPolicy;
        if (headerPolicy2 != null) {
            i = headerPolicy2.hashCode();
        }
        return hashCode + i;
    }

    @JsonProperty("header")
    public final HeaderPolicy headerPolicy() {
        return this.headerPolicy;
    }

    @JsonProperty("list")
    public final ListPolicy listPolicy() {
        return this.listPolicy;
    }

    public final a toBuilder() {
        return new a(this.listPolicy, this.headerPolicy);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("DecorationPolicy(listPolicy=");
        V0.append(this.listPolicy);
        V0.append(", headerPolicy=");
        V0.append(this.headerPolicy);
        V0.append(")");
        return V0.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        this.listPolicy.writeToParcel(parcel, 0);
        this.headerPolicy.writeToParcel(parcel, 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DecorationPolicy(ListPolicy listPolicy2, HeaderPolicy headerPolicy2, int i, f fVar) {
        this((i & 1) != 0 ? new ListPolicy(null, null, null, null, null, null, 63, null) : listPolicy2, (i & 2) != 0 ? new HeaderPolicy(null, null, null, null, 15, null) : headerPolicy2);
    }
}

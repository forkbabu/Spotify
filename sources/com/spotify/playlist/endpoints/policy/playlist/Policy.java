package com.spotify.playlist.endpoints.policy.playlist;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

@JsonInclude(JsonInclude.Include.NON_NULL)
public final class Policy implements JacksonModel, Parcelable {
    public static final Parcelable.Creator CREATOR = new c();
    public static final b Companion = new b(null);
    private final DecorationPolicy decorationPolicy;

    public static final class a {
        private DecorationPolicy a;

        public a() {
            this(null, 1);
        }

        public a(DecorationPolicy decorationPolicy) {
            h.e(decorationPolicy, "decorationPolicy");
            this.a = decorationPolicy;
        }

        public final Policy a() {
            return new Policy(this.a);
        }

        public final a b(DecorationPolicy decorationPolicy) {
            h.e(decorationPolicy, "decorationPolicy");
            this.a = decorationPolicy;
            return this;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && h.a(this.a, ((a) obj).a);
            }
            return true;
        }

        public int hashCode() {
            DecorationPolicy decorationPolicy = this.a;
            if (decorationPolicy != null) {
                return decorationPolicy.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Builder(decorationPolicy=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }

        public a(DecorationPolicy decorationPolicy, int i) {
            DecorationPolicy decorationPolicy2 = (i & 1) != 0 ? new DecorationPolicy(null, null, 3, null) : null;
            h.e(decorationPolicy2, "decorationPolicy");
            this.a = decorationPolicy2;
        }
    }

    public static final class b {
        public b(f fVar) {
        }

        public final a a() {
            return new a(null, 1);
        }
    }

    public static class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            return new Policy((DecorationPolicy) DecorationPolicy.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Policy[i];
        }
    }

    public Policy() {
        this(null, 1, null);
    }

    public Policy(DecorationPolicy decorationPolicy2) {
        h.e(decorationPolicy2, "decorationPolicy");
        this.decorationPolicy = decorationPolicy2;
    }

    public static final a builder() {
        return Companion.a();
    }

    public static /* synthetic */ Policy copy$default(Policy policy, DecorationPolicy decorationPolicy2, int i, Object obj) {
        if ((i & 1) != 0) {
            decorationPolicy2 = policy.decorationPolicy;
        }
        return policy.copy(decorationPolicy2);
    }

    public final DecorationPolicy component1() {
        return this.decorationPolicy;
    }

    public final Policy copy(DecorationPolicy decorationPolicy2) {
        h.e(decorationPolicy2, "decorationPolicy");
        return new Policy(decorationPolicy2);
    }

    @JsonProperty("policy")
    public final DecorationPolicy decorationPolicy() {
        return this.decorationPolicy;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof Policy) && h.a(this.decorationPolicy, ((Policy) obj).decorationPolicy);
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        DecorationPolicy decorationPolicy2 = this.decorationPolicy;
        if (decorationPolicy2 != null) {
            return decorationPolicy2.hashCode();
        }
        return 0;
    }

    public final a toBuilder() {
        return new a(this.decorationPolicy);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Policy(decorationPolicy=");
        V0.append(this.decorationPolicy);
        V0.append(")");
        return V0.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        this.decorationPolicy.writeToParcel(parcel, 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Policy(DecorationPolicy decorationPolicy2, int i, f fVar) {
        this((i & 1) != 0 ? new DecorationPolicy(null, null, 3, null) : decorationPolicy2);
    }
}

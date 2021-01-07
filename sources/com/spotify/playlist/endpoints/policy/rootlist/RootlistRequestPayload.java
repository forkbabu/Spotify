package com.spotify.playlist.endpoints.policy.rootlist;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

@JsonInclude(JsonInclude.Include.NON_NULL)
public final class RootlistRequestPayload implements JacksonModel, Parcelable {
    public static final Parcelable.Creator CREATOR = new c();
    public static final b Companion = new b(null);
    private final FolderRequestPolicy policy;

    public static final class a {
        private FolderRequestPolicy a;

        public a() {
            this(null, 1);
        }

        public a(FolderRequestPolicy folderRequestPolicy) {
            h.e(folderRequestPolicy, "policy");
            this.a = folderRequestPolicy;
        }

        public final RootlistRequestPayload a() {
            return new RootlistRequestPayload(this.a);
        }

        public final a b(FolderRequestPolicy folderRequestPolicy) {
            h.e(folderRequestPolicy, "policy");
            this.a = folderRequestPolicy;
            return this;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && h.a(this.a, ((a) obj).a);
            }
            return true;
        }

        public int hashCode() {
            FolderRequestPolicy folderRequestPolicy = this.a;
            if (folderRequestPolicy != null) {
                return folderRequestPolicy.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Builder(policy=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }

        public a(FolderRequestPolicy folderRequestPolicy, int i) {
            FolderRequestPolicy folderRequestPolicy2 = (i & 1) != 0 ? new FolderRequestPolicy(null, null, null, 7, null) : null;
            h.e(folderRequestPolicy2, "policy");
            this.a = folderRequestPolicy2;
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
            return new RootlistRequestPayload((FolderRequestPolicy) FolderRequestPolicy.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RootlistRequestPayload[i];
        }
    }

    public RootlistRequestPayload() {
        this(null, 1, null);
    }

    public RootlistRequestPayload(FolderRequestPolicy folderRequestPolicy) {
        h.e(folderRequestPolicy, "policy");
        this.policy = folderRequestPolicy;
    }

    public static final a builder() {
        Companion.getClass();
        return new a(null, 1);
    }

    public static /* synthetic */ RootlistRequestPayload copy$default(RootlistRequestPayload rootlistRequestPayload, FolderRequestPolicy folderRequestPolicy, int i, Object obj) {
        if ((i & 1) != 0) {
            folderRequestPolicy = rootlistRequestPayload.policy;
        }
        return rootlistRequestPayload.copy(folderRequestPolicy);
    }

    public final FolderRequestPolicy component1() {
        return this.policy;
    }

    public final RootlistRequestPayload copy(FolderRequestPolicy folderRequestPolicy) {
        h.e(folderRequestPolicy, "policy");
        return new RootlistRequestPayload(folderRequestPolicy);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof RootlistRequestPayload) && h.a(this.policy, ((RootlistRequestPayload) obj).policy);
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        FolderRequestPolicy folderRequestPolicy = this.policy;
        if (folderRequestPolicy != null) {
            return folderRequestPolicy.hashCode();
        }
        return 0;
    }

    @JsonProperty("policy")
    public final FolderRequestPolicy policy() {
        return this.policy;
    }

    public final a toBuilder() {
        return new a(this.policy);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("RootlistRequestPayload(policy=");
        V0.append(this.policy);
        V0.append(")");
        return V0.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        this.policy.writeToParcel(parcel, 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RootlistRequestPayload(FolderRequestPolicy folderRequestPolicy, int i, f fVar) {
        this((i & 1) != 0 ? new FolderRequestPolicy(null, null, null, 7, null) : folderRequestPolicy);
    }
}

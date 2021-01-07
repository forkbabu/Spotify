package com.spotify.music.libs.ageverification.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.h;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class AgeVerificationDialogModel implements JacksonModel, Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private final int color;
    private final String providerURL;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            return new AgeVerificationDialogModel(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AgeVerificationDialogModel[i];
        }
    }

    public AgeVerificationDialogModel(@JsonProperty("color") int i, @JsonProperty("provider_url") String str) {
        h.e(str, "providerURL");
        this.color = i;
        this.providerURL = str;
    }

    public static /* synthetic */ AgeVerificationDialogModel copy$default(AgeVerificationDialogModel ageVerificationDialogModel, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = ageVerificationDialogModel.color;
        }
        if ((i2 & 2) != 0) {
            str = ageVerificationDialogModel.providerURL;
        }
        return ageVerificationDialogModel.copy(i, str);
    }

    public final int component1() {
        return this.color;
    }

    public final String component2() {
        return this.providerURL;
    }

    public final AgeVerificationDialogModel copy(@JsonProperty("color") int i, @JsonProperty("provider_url") String str) {
        h.e(str, "providerURL");
        return new AgeVerificationDialogModel(i, str);
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
        if (!(obj instanceof AgeVerificationDialogModel)) {
            return false;
        }
        AgeVerificationDialogModel ageVerificationDialogModel = (AgeVerificationDialogModel) obj;
        return this.color == ageVerificationDialogModel.color && h.a(this.providerURL, ageVerificationDialogModel.providerURL);
    }

    public final int getColor() {
        return this.color;
    }

    public final String getProviderURL() {
        return this.providerURL;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i = this.color * 31;
        String str = this.providerURL;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("AgeVerificationDialogModel(color=");
        V0.append(this.color);
        V0.append(", providerURL=");
        return je.I0(V0, this.providerURL, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeInt(this.color);
        parcel.writeString(this.providerURL);
    }
}

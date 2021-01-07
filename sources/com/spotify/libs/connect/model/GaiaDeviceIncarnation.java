package com.spotify.libs.connect.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GaiaDeviceIncarnation implements JacksonModel, Parcelable {
    public static final Parcelable.Creator<GaiaDeviceIncarnation> CREATOR = new a();
    private final String mCosmosIdentifier;
    private final boolean mIsPreferred;
    private final Tech mTech;

    static class a implements Parcelable.Creator<GaiaDeviceIncarnation> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public GaiaDeviceIncarnation createFromParcel(Parcel parcel) {
            return new GaiaDeviceIncarnation(parcel, null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public GaiaDeviceIncarnation[] newArray(int i) {
            return new GaiaDeviceIncarnation[i];
        }
    }

    /* synthetic */ GaiaDeviceIncarnation(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @JsonGetter("identifier")
    public String getCosmosIdentifier() {
        return this.mCosmosIdentifier;
    }

    @JsonGetter("class")
    public Tech getTech() {
        return this.mTech;
    }

    @JsonGetter("preferred")
    public boolean isPreferred() {
        return this.mIsPreferred;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("GaiaDeviceIncarnation{mCosmosIdentifier='");
        je.A(V0, this.mCosmosIdentifier, '\'', ", mTech=");
        V0.append(this.mTech);
        V0.append(", mIsPreferred=");
        return je.O0(V0, this.mIsPreferred, '}');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mCosmosIdentifier);
        gf0.q(parcel, this.mTech);
        parcel.writeInt(this.mIsPreferred ? 1 : 0);
    }

    @JsonCreator
    public GaiaDeviceIncarnation(@JsonProperty("class") Tech tech, @JsonProperty("identifier") String str, @JsonProperty("preferred") boolean z) {
        this.mTech = tech;
        this.mCosmosIdentifier = str;
        this.mIsPreferred = z;
    }

    private GaiaDeviceIncarnation(Parcel parcel) {
        this.mCosmosIdentifier = parcel.readString();
        this.mTech = (Tech) gf0.j(parcel, Tech.class);
        this.mIsPreferred = parcel.readInt() != 0;
    }
}

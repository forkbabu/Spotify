package com.spotify.libs.connect.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.libs.connect.model.DeviceState;
import com.spotify.libs.connect.model.DeviceType;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Collections;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GaiaDevice implements JacksonModel, Parcelable, a {
    public static final Parcelable.Creator<GaiaDevice> CREATOR = new a();
    private final String mAttachId;
    private final String mBrandName;
    private final List<GaiaDeviceCapability> mCapabilities;
    private final long mCreationTime;
    private b mFrictionlessJoinData;
    private final String mIdentifier;
    private final List<GaiaDeviceIncarnation> mIncarnations;
    private boolean mIsActive;
    private final boolean mIsAttached;
    private final boolean mIsBeingActivated;
    private final boolean mIsConnect;
    private final boolean mIsDisabled;
    private final boolean mIsGrouped;
    private final boolean mIsNewlyDiscovered;
    private final boolean mIsSelf;
    private final boolean mIsSocialConnect;
    private final boolean mIsWebApp;
    private final boolean mIsZeroConf;
    private final String mModelName;
    private final String mName;
    private final String mPhysicalIdentifier;
    private final DeviceState.GaiaDeviceState mState;
    private final boolean mSupportsLogout;
    private final boolean mSupportsRename;
    private boolean mSupportsVolume;
    private final DeviceType.GaiaTypes mType;
    private final boolean mVoiceEnabled;
    private final int mVolume;
    private final int mVolumeSteps;

    static class a implements Parcelable.Creator<GaiaDevice> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public GaiaDevice createFromParcel(Parcel parcel) {
            return new GaiaDevice(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public GaiaDevice[] newArray(int i) {
            return new GaiaDevice[i];
        }
    }

    @JsonCreator
    public GaiaDevice(@JsonProperty("is_self") boolean z, @JsonProperty("is_active") boolean z2, @JsonProperty("is_being_activated") boolean z3, @JsonProperty("is_attached") boolean z4, @JsonProperty("is_connect") boolean z5, @JsonProperty("is_webapp") boolean z6, @JsonProperty("is_zeroconf") boolean z7, @JsonProperty("is_group") boolean z8, @JsonProperty("is_social_connect") boolean z9, @JsonProperty("supports_logout") boolean z10, @JsonProperty("supports_volume") boolean z11, @JsonProperty("supports_rename") boolean z12, @JsonProperty("creation_time_ms") long j, @JsonProperty("brand_display_name") String str, @JsonProperty("model_display_name") String str2, @JsonProperty("identifier") String str3, @JsonProperty("physical_identifier") String str4, @JsonProperty("name") String str5, @JsonProperty("state") DeviceState.GaiaDeviceState gaiaDeviceState, @JsonProperty("type") DeviceType.GaiaTypes gaiaTypes, @JsonProperty("incarnations") List<GaiaDeviceIncarnation> list, @JsonProperty("volume") int i, @JsonProperty("attach_id") String str6, @JsonProperty("is_newly_discovered") boolean z13, @JsonProperty("is_disabled") boolean z14, @JsonProperty("capabilities") List<GaiaDeviceCapability> list2, @JsonProperty("volume_steps") int i2, @JsonProperty("is_voice_enabled") boolean z15) {
        List<GaiaDeviceCapability> list3;
        List<GaiaDeviceIncarnation> list4;
        this.mIsSelf = z;
        this.mIsActive = z2;
        this.mIsBeingActivated = z3;
        this.mIsAttached = z4;
        this.mIsConnect = z5;
        this.mIsWebApp = z6;
        this.mIsZeroConf = z7;
        this.mIsGrouped = z8;
        this.mIsSocialConnect = z9;
        this.mSupportsLogout = z10;
        this.mSupportsVolume = z11;
        this.mSupportsRename = z12;
        this.mCreationTime = j;
        this.mBrandName = str;
        this.mModelName = str2;
        this.mIdentifier = str3;
        this.mPhysicalIdentifier = str4;
        this.mName = str5;
        this.mState = gaiaDeviceState;
        this.mType = gaiaTypes;
        if (list2 != null) {
            list3 = list2;
        } else {
            list3 = Collections.emptyList();
        }
        this.mCapabilities = list3;
        if (list != null) {
            list4 = list;
        } else {
            list4 = Collections.emptyList();
        }
        this.mIncarnations = list4;
        this.mVolume = i;
        this.mAttachId = str6;
        this.mIsNewlyDiscovered = z13;
        this.mIsDisabled = z14;
        this.mVolumeSteps = i2;
        this.mVoiceEnabled = z15;
        this.mFrictionlessJoinData = null;
    }

    public GaiaDevice copy() {
        return new GaiaDevice(this.mIsSelf, this.mIsActive, this.mIsBeingActivated, this.mIsAttached, this.mIsConnect, this.mIsWebApp, this.mIsZeroConf, this.mIsGrouped, this.mIsSocialConnect, this.mSupportsLogout, this.mSupportsVolume, this.mSupportsRename, this.mCreationTime, this.mBrandName, this.mModelName, this.mIdentifier, this.mPhysicalIdentifier, this.mName, this.mState, this.mType, this.mCapabilities, this.mIncarnations, this.mVolume, this.mAttachId, this.mIsNewlyDiscovered, this.mIsDisabled, this.mVolumeSteps, this.mVoiceEnabled, this.mFrictionlessJoinData);
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
        if (!(obj instanceof GaiaDevice)) {
            return false;
        }
        GaiaDevice gaiaDevice = (GaiaDevice) obj;
        String str = this.mBrandName;
        if (str == null ? gaiaDevice.mBrandName != null : !str.equals(gaiaDevice.mBrandName)) {
            return false;
        }
        String str2 = this.mModelName;
        if (str2 == null ? gaiaDevice.mModelName != null : !str2.equals(gaiaDevice.mModelName)) {
            return false;
        }
        String str3 = this.mIdentifier;
        if (str3 == null ? gaiaDevice.mIdentifier != null : !str3.equals(gaiaDevice.mIdentifier)) {
            return false;
        }
        String str4 = this.mPhysicalIdentifier;
        if (str4 == null ? gaiaDevice.mPhysicalIdentifier != null : !str4.equals(gaiaDevice.mPhysicalIdentifier)) {
            return false;
        }
        String str5 = this.mName;
        if (str5 == null ? gaiaDevice.mName != null : !str5.equals(gaiaDevice.mName)) {
            return false;
        }
        if (this.mIsActive != gaiaDevice.mIsActive || this.mState != gaiaDevice.mState || this.mSupportsVolume != gaiaDevice.mSupportsVolume || this.mVoiceEnabled != gaiaDevice.mVoiceEnabled) {
            return false;
        }
        b bVar = this.mFrictionlessJoinData;
        if (bVar == null ? gaiaDevice.mFrictionlessJoinData != null : !bVar.equals(gaiaDevice.mFrictionlessJoinData)) {
            return false;
        }
        String str6 = this.mAttachId;
        String str7 = gaiaDevice.mAttachId;
        if (str6 != null) {
            return str6.equals(str7);
        }
        if (str7 == null) {
            return true;
        }
        return false;
    }

    @JsonGetter("attach_id")
    public String getAttachId() {
        return this.mAttachId;
    }

    @JsonGetter("brand_display_name")
    public String getBrandName() {
        return this.mBrandName;
    }

    @Override // com.spotify.libs.connect.model.a
    @JsonGetter("capabilities")
    public List<GaiaDeviceCapability> getCapabilities() {
        return this.mCapabilities;
    }

    @Override // com.spotify.libs.connect.model.a
    @JsonGetter("identifier")
    public String getCosmosIdentifier() {
        return this.mIdentifier;
    }

    @JsonGetter("creation_time_ms")
    public long getCreationTime() {
        return this.mCreationTime;
    }

    public b getFrictionlessJoinData() {
        return this.mFrictionlessJoinData;
    }

    @JsonGetter("incarnations")
    public List<GaiaDeviceIncarnation> getIncarnations() {
        return this.mIncarnations;
    }

    public String getJoinToken() {
        b bVar = this.mFrictionlessJoinData;
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    @Override // com.spotify.libs.connect.model.a
    public String getLoggingIdentifier() {
        return this.mPhysicalIdentifier;
    }

    @JsonGetter("model_display_name")
    public String getModelName() {
        return this.mModelName;
    }

    @Override // com.spotify.libs.connect.model.a
    @JsonGetter("name")
    public String getName() {
        return this.mName;
    }

    @JsonGetter("physical_identifier")
    public String getPhysicalIdentifier() {
        return this.mPhysicalIdentifier;
    }

    @Override // com.spotify.libs.connect.model.a
    public DeviceState getState() {
        return this.mState;
    }

    @JsonGetter("state")
    public DeviceState.GaiaDeviceState getStateSerializable() {
        return this.mState;
    }

    @Override // com.spotify.libs.connect.model.a
    public DeviceType getType() {
        return this.mType;
    }

    @JsonGetter("type")
    public DeviceType.GaiaTypes getTypeSerializable() {
        return this.mType;
    }

    @JsonGetter("volume")
    public int getVolume() {
        return this.mVolume;
    }

    @JsonGetter("volume_steps")
    public int getVolumeSteps() {
        return this.mVolumeSteps;
    }

    @Override // com.spotify.libs.connect.model.a
    public boolean hasIncarnations() {
        return !this.mIncarnations.isEmpty();
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.mBrandName;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.mModelName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.mIdentifier;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.mPhysicalIdentifier;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.mName;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        DeviceState.GaiaDeviceState gaiaDeviceState = this.mState;
        int hashCode6 = (hashCode5 + (gaiaDeviceState != null ? gaiaDeviceState.hashCode() : 0)) * 31;
        String str6 = this.mAttachId;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        b bVar = this.mFrictionlessJoinData;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode7 + i;
    }

    @Override // com.spotify.libs.connect.model.a
    @JsonGetter("is_active")
    public boolean isActive() {
        return this.mIsActive;
    }

    @JsonGetter("is_attached")
    public boolean isAttached() {
        return this.mIsAttached;
    }

    public boolean isAvailableForJoin() {
        return this.mFrictionlessJoinData != null;
    }

    @Override // com.spotify.libs.connect.model.a
    @JsonGetter("is_being_activated")
    public boolean isBeingActivated() {
        return this.mIsBeingActivated;
    }

    @JsonGetter("is_connect")
    public boolean isConnect() {
        return this.mIsConnect;
    }

    @Override // com.spotify.libs.connect.model.a
    @JsonGetter("is_disabled")
    public boolean isDisabled() {
        return this.mIsDisabled;
    }

    @Override // com.spotify.libs.connect.model.a
    @JsonGetter("is_group")
    public boolean isGrouped() {
        return this.mIsGrouped;
    }

    @JsonGetter("is_newly_discovered")
    public boolean isNewlyDiscovered() {
        return this.mIsNewlyDiscovered;
    }

    @Override // com.spotify.libs.connect.model.a
    @JsonGetter("is_self")
    public boolean isSelf() {
        return this.mIsSelf;
    }

    @JsonGetter("is_social_connect")
    public boolean isSocialConnect() {
        return this.mIsSocialConnect;
    }

    @JsonGetter("is_voice_enabled")
    public boolean isVoiceEnabled() {
        return this.mVoiceEnabled;
    }

    @JsonGetter("is_webapp")
    public boolean isWebApp() {
        return this.mIsWebApp;
    }

    @JsonGetter("is_zeroconf")
    public boolean isZeroConf() {
        return this.mIsZeroConf;
    }

    @Override // com.spotify.libs.connect.model.a
    public void setActive() {
        this.mIsActive = true;
    }

    public void setFrictionlessJoinData(b bVar) {
        this.mFrictionlessJoinData = bVar;
    }

    public void setInactive() {
        this.mIsActive = false;
    }

    public void setSupportsVolume(boolean z) {
        this.mSupportsVolume = z;
    }

    @Override // com.spotify.libs.connect.model.a
    @JsonGetter("supports_logout")
    public boolean supportsLogout() {
        return this.mSupportsLogout;
    }

    @JsonGetter("supports_rename")
    public boolean supportsRename() {
        return this.mSupportsRename;
    }

    @JsonGetter("supports_volume")
    public boolean supportsVolume() {
        return this.mSupportsVolume;
    }

    @Override // java.lang.Object
    @JsonIgnore
    public String toString() {
        StringBuilder V0 = je.V0("GaiaDevice{mCreationTime=");
        V0.append(this.mCreationTime);
        V0.append(", mIsSelf=");
        V0.append(this.mIsSelf);
        V0.append(", mIsActive=");
        V0.append(this.mIsActive);
        V0.append(", mIsBeingActivated=");
        V0.append(this.mIsBeingActivated);
        V0.append(", mIsAttached=");
        V0.append(this.mIsAttached);
        V0.append(", mIsConnect=");
        V0.append(this.mIsConnect);
        V0.append(", mIsWebApp=");
        V0.append(this.mIsWebApp);
        V0.append(", mIsZeroConf=");
        V0.append(this.mIsZeroConf);
        V0.append(", mIsGrouped=");
        V0.append(this.mIsGrouped);
        V0.append(", mIsSocialConnect=");
        V0.append(this.mIsSocialConnect);
        V0.append(", mSupportsLogout=");
        V0.append(this.mSupportsLogout);
        V0.append(", mSupportsVolume=");
        V0.append(this.mSupportsVolume);
        V0.append(", mSupportsRename=");
        V0.append(this.mSupportsRename);
        V0.append(", mIsNewlyDiscovered=");
        V0.append(this.mIsNewlyDiscovered);
        V0.append(", mIsDisabled=");
        V0.append(this.mIsDisabled);
        V0.append(", mBrandName='");
        je.A(V0, this.mBrandName, '\'', ", mModelName='");
        je.A(V0, this.mModelName, '\'', ", mIdentifier='");
        je.A(V0, this.mIdentifier, '\'', ", mPhysicalIdentifier='");
        je.A(V0, this.mPhysicalIdentifier, '\'', ", mName='");
        je.A(V0, this.mName, '\'', ", mVolume=");
        V0.append(this.mVolume);
        V0.append(", mAttachId='");
        je.A(V0, this.mAttachId, '\'', ", mState=");
        V0.append(this.mState);
        V0.append(", mType=");
        V0.append(this.mType);
        V0.append(", mCapabilities=");
        V0.append(this.mCapabilities);
        V0.append(", mIncarnations=");
        V0.append(this.mIncarnations);
        V0.append(", mVolumeSteps=");
        V0.append(this.mVolumeSteps);
        V0.append(", mVoiceEnabled=");
        V0.append(this.mVoiceEnabled);
        V0.append(", mFrictionlessJoinData=");
        V0.append(this.mFrictionlessJoinData);
        V0.append('}');
        return V0.toString();
    }

    @JsonIgnore
    public String toStringState() {
        StringBuilder V0 = je.V0("GaiaDevice{, mIsActive=");
        V0.append(this.mIsActive);
        V0.append(", mIsBeingActivated=");
        V0.append(this.mIsBeingActivated);
        V0.append(", mIsAttached=");
        V0.append(this.mIsAttached);
        V0.append(", mBrandName='");
        je.A(V0, this.mBrandName, '\'', ", mModelName='");
        je.A(V0, this.mModelName, '\'', ", mIdentifier='");
        je.A(V0, this.mIdentifier, '\'', ", mName='");
        je.A(V0, this.mName, '\'', ", mState=");
        V0.append(this.mState);
        V0.append(", mType=");
        V0.append(this.mType);
        V0.append('}');
        return V0.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mCreationTime);
        parcel.writeInt(this.mIsSelf ? 1 : 0);
        parcel.writeInt(this.mIsActive ? 1 : 0);
        parcel.writeInt(this.mIsBeingActivated ? 1 : 0);
        parcel.writeInt(this.mIsAttached ? 1 : 0);
        parcel.writeInt(this.mIsConnect ? 1 : 0);
        parcel.writeInt(this.mIsWebApp ? 1 : 0);
        parcel.writeInt(this.mIsZeroConf ? 1 : 0);
        parcel.writeInt(this.mIsGrouped ? 1 : 0);
        parcel.writeInt(this.mIsSocialConnect ? 1 : 0);
        parcel.writeInt(this.mSupportsLogout ? 1 : 0);
        parcel.writeInt(this.mSupportsVolume ? 1 : 0);
        parcel.writeInt(this.mSupportsRename ? 1 : 0);
        parcel.writeInt(this.mIsNewlyDiscovered ? 1 : 0);
        parcel.writeInt(this.mIsDisabled ? 1 : 0);
        parcel.writeString(this.mBrandName);
        parcel.writeString(this.mModelName);
        parcel.writeString(this.mIdentifier);
        parcel.writeString(this.mPhysicalIdentifier);
        parcel.writeString(this.mName);
        parcel.writeInt(this.mVolume);
        parcel.writeString(this.mAttachId);
        gf0.q(parcel, this.mState);
        gf0.q(parcel, this.mType);
        parcel.writeTypedList(this.mCapabilities);
        parcel.writeTypedList(this.mIncarnations);
        parcel.writeInt(this.mVolumeSteps);
        parcel.writeInt(this.mVoiceEnabled ? 1 : 0);
        gf0.v(parcel, this.mFrictionlessJoinData, i);
    }

    protected GaiaDevice(Parcel parcel) {
        this.mCreationTime = parcel.readLong();
        boolean z = true;
        this.mIsSelf = parcel.readInt() != 0;
        this.mIsActive = parcel.readInt() != 0;
        this.mIsBeingActivated = parcel.readInt() != 0;
        this.mIsAttached = parcel.readInt() != 0;
        this.mIsConnect = parcel.readInt() != 0;
        this.mIsWebApp = parcel.readInt() != 0;
        this.mIsZeroConf = parcel.readInt() != 0;
        this.mIsGrouped = parcel.readInt() != 0;
        this.mIsSocialConnect = parcel.readInt() != 0;
        this.mSupportsLogout = parcel.readInt() != 0;
        this.mSupportsVolume = parcel.readInt() != 0;
        this.mSupportsRename = parcel.readInt() != 0;
        this.mIsNewlyDiscovered = parcel.readInt() != 0;
        this.mIsDisabled = parcel.readInt() != 0;
        this.mBrandName = parcel.readString();
        this.mModelName = parcel.readString();
        this.mIdentifier = parcel.readString();
        this.mPhysicalIdentifier = parcel.readString();
        this.mName = parcel.readString();
        this.mVolume = parcel.readInt();
        this.mAttachId = parcel.readString();
        this.mState = (DeviceState.GaiaDeviceState) gf0.j(parcel, DeviceState.GaiaDeviceState.class);
        this.mType = (DeviceType.GaiaTypes) gf0.j(parcel, DeviceType.GaiaTypes.class);
        this.mCapabilities = parcel.createTypedArrayList(GaiaDeviceCapability.CREATOR);
        this.mIncarnations = parcel.createTypedArrayList(GaiaDeviceIncarnation.CREATOR);
        this.mVolumeSteps = parcel.readInt();
        this.mVoiceEnabled = parcel.readInt() == 0 ? false : z;
        this.mFrictionlessJoinData = (b) gf0.n(parcel, b.CREATOR);
    }

    private GaiaDevice(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, long j, String str, String str2, String str3, String str4, String str5, DeviceState.GaiaDeviceState gaiaDeviceState, DeviceType.GaiaTypes gaiaTypes, List<GaiaDeviceCapability> list, List<GaiaDeviceIncarnation> list2, int i, String str6, boolean z13, boolean z14, int i2, boolean z15, b bVar) {
        this.mIsSelf = z;
        this.mIsActive = z2;
        this.mIsBeingActivated = z3;
        this.mIsAttached = z4;
        this.mIsConnect = z5;
        this.mIsWebApp = z6;
        this.mIsZeroConf = z7;
        this.mIsGrouped = z8;
        this.mIsSocialConnect = z9;
        this.mSupportsLogout = z10;
        this.mSupportsVolume = z11;
        this.mSupportsRename = z12;
        this.mCreationTime = j;
        this.mBrandName = str;
        this.mModelName = str2;
        this.mIdentifier = str3;
        this.mPhysicalIdentifier = str4;
        this.mName = str5;
        this.mState = gaiaDeviceState;
        this.mType = gaiaTypes;
        this.mCapabilities = list;
        this.mIncarnations = list2;
        this.mVolume = i;
        this.mAttachId = str6;
        this.mIsNewlyDiscovered = z13;
        this.mIsDisabled = z14;
        this.mVolumeSteps = i2;
        this.mVoiceEnabled = z15;
        this.mFrictionlessJoinData = bVar;
    }
}

package com.spotify.signup.api.services.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SignupConfigurationResponse implements Parcelable {
    public static final Parcelable.Creator<SignupConfigurationResponse> CREATOR = new Parcelable.Creator<SignupConfigurationResponse>() {
        /* class com.spotify.signup.api.services.model.SignupConfigurationResponse.AnonymousClass1 */

        @Override // android.os.Parcelable.Creator
        public SignupConfigurationResponse createFromParcel(Parcel parcel) {
            return new SignupConfigurationResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public SignupConfigurationResponse[] newArray(int i) {
            return new SignupConfigurationResponse[i];
        }
    };
    public static final SignupConfigurationResponse DEFAULT = createDefaultConfiguration();
    @d20("allowed_calling_codes")
    @JsonProperty("allowed_calling_codes")
    public CallingCode[] allowedCallingCodes;
    @d20("can_accept_licenses_in_one_step")
    @JsonProperty("can_accept_licenses_in_one_step")
    public boolean canAcceptLicensesInOneStep;
    @d20("pretick_eula")
    @JsonProperty("pretick_eula")
    public boolean canImplicitlyAcceptTermsAndCondition;
    @d20("use_all_genders")
    @JsonProperty("use_all_genders")
    public boolean canSignupWithAllGenders;
    @d20("country")
    @JsonProperty("country")
    public String country;
    @d20("minimum_age")
    @JsonProperty("minimum_age")
    public int minimumAge;
    @d20("requires_marketing_opt_in")
    @JsonProperty("requires_marketing_opt_in")
    public boolean requiresMarketingOptIn;
    @d20("requires_marketing_opt_in_text")
    @JsonProperty("requires_marketing_opt_in_text")
    public boolean requiresMarketingOptInText;
    @d20("specific_licenses")
    @JsonProperty("specific_licenses")
    public boolean requiresSpecificLicenses;
    @d20("show_collect_personal_info")
    @JsonProperty("show_collect_personal_info")
    public boolean showPersonalInformationCollection;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CallingCode implements Parcelable {
        public static final Parcelable.Creator<CallingCode> CREATOR = new Parcelable.Creator<CallingCode>() {
            /* class com.spotify.signup.api.services.model.SignupConfigurationResponse.CallingCode.AnonymousClass1 */

            @Override // android.os.Parcelable.Creator
            public CallingCode createFromParcel(Parcel parcel) {
                return new CallingCode(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public CallingCode[] newArray(int i) {
                return new CallingCode[i];
            }
        };
        @d20("calling_code")
        @JsonProperty("calling_code")
        public String callingCode;
        @d20("country_code")
        @JsonProperty("country_code")
        public String countryCode;

        public static CallingCode create(String str, String str2) {
            CallingCode callingCode2 = new CallingCode();
            callingCode2.countryCode = str;
            callingCode2.callingCode = str2;
            return callingCode2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // java.lang.Object
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CallingCode)) {
                return false;
            }
            CallingCode callingCode2 = (CallingCode) obj;
            if (!rw.equal(callingCode2.countryCode, this.countryCode) || !rw.equal(callingCode2.callingCode, this.callingCode)) {
                return false;
            }
            return true;
        }

        @Override // java.lang.Object
        public int hashCode() {
            return ((this.countryCode.hashCode() ^ 1000003) * 1000003) ^ this.callingCode.hashCode();
        }

        @Override // java.lang.Object
        public String toString() {
            StringBuilder V0 = je.V0("CallingCode{countryCode=");
            V0.append(this.countryCode);
            V0.append(", callingCode=");
            return je.I0(V0, this.callingCode, "}");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.countryCode);
            parcel.writeString(this.callingCode);
        }

        public CallingCode() {
        }

        private CallingCode(Parcel parcel) {
            this.countryCode = parcel.readString();
            this.callingCode = parcel.readString();
        }
    }

    private static SignupConfigurationResponse createDefaultConfiguration() {
        SignupConfigurationResponse signupConfigurationResponse = new SignupConfigurationResponse();
        signupConfigurationResponse.canAcceptLicensesInOneStep = false;
        signupConfigurationResponse.canSignupWithAllGenders = false;
        signupConfigurationResponse.canImplicitlyAcceptTermsAndCondition = false;
        signupConfigurationResponse.requiresMarketingOptIn = false;
        signupConfigurationResponse.requiresMarketingOptInText = false;
        signupConfigurationResponse.showPersonalInformationCollection = false;
        signupConfigurationResponse.minimumAge = 13;
        signupConfigurationResponse.country = "";
        signupConfigurationResponse.requiresSpecificLicenses = false;
        signupConfigurationResponse.allowedCallingCodes = null;
        return signupConfigurationResponse;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("SignupConfigurationResponse{canAcceptLicensesInOneStep=");
        V0.append(this.canAcceptLicensesInOneStep);
        V0.append(", canSignupWithAllGenders=");
        V0.append(this.canSignupWithAllGenders);
        V0.append(", canImplicitlyAcceptTermsAndCondition=");
        V0.append(this.canImplicitlyAcceptTermsAndCondition);
        V0.append(", requiresMarketingOptIn=");
        V0.append(this.requiresMarketingOptIn);
        V0.append(", requiresMarketingOptInText=");
        V0.append(this.requiresMarketingOptInText);
        V0.append(", showPersonalInformationCollection=");
        V0.append(this.showPersonalInformationCollection);
        V0.append(", minimumAge=");
        V0.append(this.minimumAge);
        V0.append(", country='");
        je.A(V0, this.country, '\'', ", requiresSpecificLicenses=");
        V0.append(this.requiresSpecificLicenses);
        V0.append(", allowedCallingCodes=");
        return je.H0(V0, Arrays.toString(this.allowedCallingCodes), '}');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.canAcceptLicensesInOneStep ? 1 : 0);
        parcel.writeInt(this.canSignupWithAllGenders ? 1 : 0);
        parcel.writeInt(this.canImplicitlyAcceptTermsAndCondition ? 1 : 0);
        parcel.writeInt(this.requiresMarketingOptIn ? 1 : 0);
        parcel.writeInt(this.requiresMarketingOptInText ? 1 : 0);
        parcel.writeInt(this.showPersonalInformationCollection ? 1 : 0);
        parcel.writeInt(this.minimumAge);
        parcel.writeString(this.country);
        parcel.writeInt(this.requiresSpecificLicenses ? 1 : 0);
        parcel.writeTypedArray(this.allowedCallingCodes, i);
    }

    public SignupConfigurationResponse() {
    }

    private SignupConfigurationResponse(Parcel parcel) {
        boolean z = true;
        this.canAcceptLicensesInOneStep = parcel.readInt() != 0;
        this.canSignupWithAllGenders = parcel.readInt() != 0;
        this.canImplicitlyAcceptTermsAndCondition = parcel.readInt() != 0;
        this.requiresMarketingOptIn = parcel.readInt() != 0;
        this.requiresMarketingOptInText = parcel.readInt() != 0;
        this.showPersonalInformationCollection = parcel.readInt() != 0;
        this.minimumAge = parcel.readInt();
        this.country = parcel.readString();
        this.requiresSpecificLicenses = parcel.readInt() == 0 ? false : z;
        this.allowedCallingCodes = (CallingCode[]) parcel.createTypedArray(CallingCode.CREATOR);
    }
}

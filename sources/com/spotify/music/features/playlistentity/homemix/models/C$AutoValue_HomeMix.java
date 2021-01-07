package com.spotify.music.features.playlistentity.homemix.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.music.features.playlistentity.homemix.models.HomeMixTuning;
import java.util.List;

/* renamed from: com.spotify.music.features.playlistentity.homemix.models.$AutoValue_HomeMix  reason: invalid class name */
abstract class C$AutoValue_HomeMix extends HomeMix {
    private final String cohort;
    private final boolean includeExplicit;
    private final boolean isAlone;
    private final boolean isFamilyMember;
    private final boolean isGlobalExplicitFilterOn;
    private final boolean isUserEnabled;
    private final boolean needsTasteOnboarding;
    private final boolean needsWelcome;
    private final HomeMixPlanType planType;
    private final String primaryColor;
    private final String secondaryColor;
    private final String setType;
    private final HomeMixTuning.Style style;
    private final List<HomeMixUser> users;

    C$AutoValue_HomeMix(HomeMixPlanType homeMixPlanType, List<HomeMixUser> list, HomeMixTuning.Style style2, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str3, String str4) {
        if (homeMixPlanType != null) {
            this.planType = homeMixPlanType;
            if (list != null) {
                this.users = list;
                if (style2 != null) {
                    this.style = style2;
                    if (str != null) {
                        this.primaryColor = str;
                        if (str2 != null) {
                            this.secondaryColor = str2;
                            this.isFamilyMember = z;
                            this.needsWelcome = z2;
                            this.isUserEnabled = z3;
                            this.includeExplicit = z4;
                            this.needsTasteOnboarding = z5;
                            this.isAlone = z6;
                            this.isGlobalExplicitFilterOn = z7;
                            this.setType = str3;
                            this.cohort = str4;
                            return;
                        }
                        throw new NullPointerException("Null secondaryColor");
                    }
                    throw new NullPointerException("Null primaryColor");
                }
                throw new NullPointerException("Null style");
            }
            throw new NullPointerException("Null users");
        }
        throw new NullPointerException("Null planType");
    }

    @Override // com.spotify.music.features.playlistentity.homemix.models.HomeMix
    @JsonProperty("cohort")
    public String cohort() {
        return this.cohort;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HomeMix)) {
            return false;
        }
        HomeMix homeMix = (HomeMix) obj;
        if (this.planType.equals(homeMix.planType()) && this.users.equals(homeMix.users()) && this.style.equals(homeMix.style()) && this.primaryColor.equals(homeMix.primaryColor()) && this.secondaryColor.equals(homeMix.secondaryColor()) && this.isFamilyMember == homeMix.isFamilyMember() && this.needsWelcome == homeMix.needsWelcome() && this.isUserEnabled == homeMix.isUserEnabled() && this.includeExplicit == homeMix.includeExplicit() && this.needsTasteOnboarding == homeMix.needsTasteOnboarding() && this.isAlone == homeMix.isAlone() && this.isGlobalExplicitFilterOn == homeMix.isGlobalExplicitFilterOn() && ((str = this.setType) != null ? str.equals(homeMix.setType()) : homeMix.setType() == null)) {
            String str2 = this.cohort;
            if (str2 == null) {
                if (homeMix.cohort() == null) {
                    return true;
                }
            } else if (str2.equals(homeMix.cohort())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((((((((((((((((((((this.planType.hashCode() ^ 1000003) * 1000003) ^ this.users.hashCode()) * 1000003) ^ this.style.hashCode()) * 1000003) ^ this.primaryColor.hashCode()) * 1000003) ^ this.secondaryColor.hashCode()) * 1000003) ^ (this.isFamilyMember ? 1231 : 1237)) * 1000003) ^ (this.needsWelcome ? 1231 : 1237)) * 1000003) ^ (this.isUserEnabled ? 1231 : 1237)) * 1000003) ^ (this.includeExplicit ? 1231 : 1237)) * 1000003) ^ (this.needsTasteOnboarding ? 1231 : 1237)) * 1000003) ^ (this.isAlone ? 1231 : 1237)) * 1000003;
        if (!this.isGlobalExplicitFilterOn) {
            i = 1237;
        }
        int i2 = (hashCode ^ i) * 1000003;
        String str = this.setType;
        int i3 = 0;
        int hashCode2 = (i2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.cohort;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return hashCode2 ^ i3;
    }

    @Override // com.spotify.music.features.playlistentity.homemix.models.HomeMix
    @JsonProperty("publish_explicit")
    public boolean includeExplicit() {
        return this.includeExplicit;
    }

    @Override // com.spotify.music.features.playlistentity.homemix.models.HomeMix
    @JsonProperty("alone")
    public boolean isAlone() {
        return this.isAlone;
    }

    @Override // com.spotify.music.features.playlistentity.homemix.models.HomeMix
    @JsonProperty("is_family_member")
    public boolean isFamilyMember() {
        return this.isFamilyMember;
    }

    @Override // com.spotify.music.features.playlistentity.homemix.models.HomeMix
    @JsonProperty("global_explicit_on")
    public boolean isGlobalExplicitFilterOn() {
        return this.isGlobalExplicitFilterOn;
    }

    @Override // com.spotify.music.features.playlistentity.homemix.models.HomeMix
    @JsonProperty("enabled")
    public boolean isUserEnabled() {
        return this.isUserEnabled;
    }

    @Override // com.spotify.music.features.playlistentity.homemix.models.HomeMix
    @JsonProperty("needs_taste_onboarding")
    public boolean needsTasteOnboarding() {
        return this.needsTasteOnboarding;
    }

    @Override // com.spotify.music.features.playlistentity.homemix.models.HomeMix
    @JsonProperty("needs_welcome")
    public boolean needsWelcome() {
        return this.needsWelcome;
    }

    @Override // com.spotify.music.features.playlistentity.homemix.models.HomeMix
    @JsonProperty("plan_type")
    public HomeMixPlanType planType() {
        return this.planType;
    }

    @Override // com.spotify.music.features.playlistentity.homemix.models.HomeMix
    @JsonProperty("primary_color")
    public String primaryColor() {
        return this.primaryColor;
    }

    @Override // com.spotify.music.features.playlistentity.homemix.models.HomeMix
    @JsonProperty("secondary_color")
    public String secondaryColor() {
        return this.secondaryColor;
    }

    @Override // com.spotify.music.features.playlistentity.homemix.models.HomeMix
    @JsonProperty("set_type")
    public String setType() {
        return this.setType;
    }

    @Override // com.spotify.music.features.playlistentity.homemix.models.HomeMix
    @JsonProperty("style")
    public HomeMixTuning.Style style() {
        return this.style;
    }

    public String toString() {
        StringBuilder V0 = je.V0("HomeMix{planType=");
        V0.append(this.planType);
        V0.append(", users=");
        V0.append(this.users);
        V0.append(", style=");
        V0.append(this.style);
        V0.append(", primaryColor=");
        V0.append(this.primaryColor);
        V0.append(", secondaryColor=");
        V0.append(this.secondaryColor);
        V0.append(", isFamilyMember=");
        V0.append(this.isFamilyMember);
        V0.append(", needsWelcome=");
        V0.append(this.needsWelcome);
        V0.append(", isUserEnabled=");
        V0.append(this.isUserEnabled);
        V0.append(", includeExplicit=");
        V0.append(this.includeExplicit);
        V0.append(", needsTasteOnboarding=");
        V0.append(this.needsTasteOnboarding);
        V0.append(", isAlone=");
        V0.append(this.isAlone);
        V0.append(", isGlobalExplicitFilterOn=");
        V0.append(this.isGlobalExplicitFilterOn);
        V0.append(", setType=");
        V0.append(this.setType);
        V0.append(", cohort=");
        return je.I0(V0, this.cohort, "}");
    }

    @Override // com.spotify.music.features.playlistentity.homemix.models.HomeMix
    @JsonProperty("users")
    public List<HomeMixUser> users() {
        return this.users;
    }
}

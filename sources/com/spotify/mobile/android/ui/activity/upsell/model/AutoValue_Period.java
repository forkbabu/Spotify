package com.spotify.mobile.android.ui.activity.upsell.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* access modifiers changed from: package-private */
public final class AutoValue_Period extends Period {
    private final int duration;
    private final String durationType;
    private final String formattedPrice;

    AutoValue_Period(int i, String str, String str2) {
        this.duration = i;
        if (str != null) {
            this.durationType = str;
            if (str2 != null) {
                this.formattedPrice = str2;
                return;
            }
            throw new NullPointerException("Null formattedPrice");
        }
        throw new NullPointerException("Null durationType");
    }

    @Override // com.spotify.mobile.android.ui.activity.upsell.model.Period
    @JsonProperty("duration")
    public int duration() {
        return this.duration;
    }

    @Override // com.spotify.mobile.android.ui.activity.upsell.model.Period
    @JsonProperty("duration_type")
    public String durationType() {
        return this.durationType;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Period)) {
            return false;
        }
        Period period = (Period) obj;
        if (this.duration != period.duration() || !this.durationType.equals(period.durationType()) || !this.formattedPrice.equals(period.formattedPrice())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.mobile.android.ui.activity.upsell.model.Period
    @JsonProperty("formatted_price")
    public String formattedPrice() {
        return this.formattedPrice;
    }

    public int hashCode() {
        return ((((this.duration ^ 1000003) * 1000003) ^ this.durationType.hashCode()) * 1000003) ^ this.formattedPrice.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("Period{duration=");
        V0.append(this.duration);
        V0.append(", durationType=");
        V0.append(this.durationType);
        V0.append(", formattedPrice=");
        return je.I0(V0, this.formattedPrice, "}");
    }
}

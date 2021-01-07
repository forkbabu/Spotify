package com.spotify.mobile.android.ui.activity.upsell.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* access modifiers changed from: package-private */
public final class AutoValue_Offer extends Offer {
    private final String adTargetingKey;
    private final Period initialPeriod;
    private final boolean isTrial;
    private final Period recurringPeriod;

    AutoValue_Offer(boolean z, Period period, Period period2, String str) {
        this.isTrial = z;
        if (period != null) {
            this.initialPeriod = period;
            this.recurringPeriod = period2;
            this.adTargetingKey = str;
            return;
        }
        throw new NullPointerException("Null initialPeriod");
    }

    @Override // com.spotify.mobile.android.ui.activity.upsell.model.Offer
    @JsonProperty("ad_targeting_key")
    public String adTargetingKey() {
        return this.adTargetingKey;
    }

    public boolean equals(Object obj) {
        Period period;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Offer)) {
            return false;
        }
        Offer offer = (Offer) obj;
        if (this.isTrial == offer.isTrial() && this.initialPeriod.equals(offer.initialPeriod()) && ((period = this.recurringPeriod) != null ? period.equals(offer.recurringPeriod()) : offer.recurringPeriod() == null)) {
            String str = this.adTargetingKey;
            if (str == null) {
                if (offer.adTargetingKey() == null) {
                    return true;
                }
            } else if (str.equals(offer.adTargetingKey())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.isTrial ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.initialPeriod.hashCode()) * 1000003;
        Period period = this.recurringPeriod;
        int i = 0;
        int hashCode2 = (hashCode ^ (period == null ? 0 : period.hashCode())) * 1000003;
        String str = this.adTargetingKey;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 ^ i;
    }

    @Override // com.spotify.mobile.android.ui.activity.upsell.model.Offer
    @JsonProperty("initial_period")
    public Period initialPeriod() {
        return this.initialPeriod;
    }

    @Override // com.spotify.mobile.android.ui.activity.upsell.model.Offer
    @JsonProperty("is_trial")
    public boolean isTrial() {
        return this.isTrial;
    }

    @Override // com.spotify.mobile.android.ui.activity.upsell.model.Offer
    @JsonProperty("recurring_period")
    public Period recurringPeriod() {
        return this.recurringPeriod;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Offer{isTrial=");
        V0.append(this.isTrial);
        V0.append(", initialPeriod=");
        V0.append(this.initialPeriod);
        V0.append(", recurringPeriod=");
        V0.append(this.recurringPeriod);
        V0.append(", adTargetingKey=");
        return je.I0(V0, this.adTargetingKey, "}");
    }
}

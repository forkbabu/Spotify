package com.spotify.music.features.ads.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.music.features.ads.model.$AutoValue_AdSlotEvent  reason: invalid class name */
abstract class C$AutoValue_AdSlotEvent extends AdSlotEvent {
    private final Ad ad;
    private final String eventString;
    private final String formatString;
    private final String slot;

    C$AutoValue_AdSlotEvent(String str, String str2, Ad ad2, String str3) {
        if (str != null) {
            this.eventString = str;
            if (str2 != null) {
                this.formatString = str2;
                if (ad2 != null) {
                    this.ad = ad2;
                    if (str3 != null) {
                        this.slot = str3;
                        return;
                    }
                    throw new NullPointerException("Null slot");
                }
                throw new NullPointerException("Null ad");
            }
            throw new NullPointerException("Null formatString");
        }
        throw new NullPointerException("Null eventString");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdSlotEvent)) {
            return false;
        }
        AdSlotEvent adSlotEvent = (AdSlotEvent) obj;
        if (!this.eventString.equals(adSlotEvent.getEventString()) || !this.formatString.equals(adSlotEvent.getFormatString()) || !this.ad.equals(adSlotEvent.getAd()) || !this.slot.equals(adSlotEvent.getSlot())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.features.ads.model.AdSlotEvent
    @JsonProperty("ad")
    public Ad getAd() {
        return this.ad;
    }

    @Override // com.spotify.music.features.ads.model.AdSlotEvent
    @JsonProperty("event")
    public String getEventString() {
        return this.eventString;
    }

    @Override // com.spotify.music.features.ads.model.AdSlotEvent
    @JsonProperty("format")
    public String getFormatString() {
        return this.formatString;
    }

    @Override // com.spotify.music.features.ads.model.AdSlotEvent
    @JsonProperty("slot")
    public String getSlot() {
        return this.slot;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((((((this.eventString.hashCode() ^ 1000003) * 1000003) ^ this.formatString.hashCode()) * 1000003) ^ this.ad.hashCode()) * 1000003) ^ this.slot.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("AdSlotEvent{eventString=");
        V0.append(this.eventString);
        V0.append(", formatString=");
        V0.append(this.formatString);
        V0.append(", ad=");
        V0.append(this.ad);
        V0.append(", slot=");
        return je.I0(V0, this.slot, "}");
    }
}

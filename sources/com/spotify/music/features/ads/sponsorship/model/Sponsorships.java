package com.spotify.music.features.ads.sponsorship.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Sponsorships implements JacksonModel {
    public static final int DEFAULT_TTL_SECONDS = 1800;
    private long mTTLSeconds = 1800;

    @JsonCreator
    public static Sponsorships create(@JsonProperty("sponsorships") ArrayList<Sponsorship> arrayList) {
        return new AutoValue_Sponsorships(arrayList);
    }

    private Map<String, Sponsorship> createSponsorshipMap(List<Sponsorship> list) {
        HashMap hashMap = new HashMap();
        for (Sponsorship sponsorship : list) {
            hashMap.put(sponsorship.uri(), sponsorship);
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    public static Parcelable.Creator<? extends Sponsorship> getCreator() {
        return AutoValue_Sponsorship.CREATOR;
    }

    public Sponsorship getSponsorship(String str) {
        ArrayList<Sponsorship> sponsorships = sponsorships();
        if (sponsorships == null) {
            return null;
        }
        Iterator<Sponsorship> it = sponsorships.iterator();
        while (it.hasNext()) {
            Sponsorship next = it.next();
            if (next.isEqual(str)) {
                return next;
            }
        }
        return null;
    }

    public long getTTLSeconds() {
        return this.mTTLSeconds;
    }

    public void preserveDisplayState(Sponsorships sponsorships) {
        if (sponsorships != null) {
            ArrayList<Sponsorship> sponsorships2 = sponsorships.sponsorships();
            ArrayList<Sponsorship> sponsorships3 = sponsorships();
            if (!(sponsorships2 == null || sponsorships3 == null)) {
                Map<String, Sponsorship> createSponsorshipMap = createSponsorshipMap(sponsorships2);
                for (Map.Entry<String, Sponsorship> entry : createSponsorshipMap(sponsorships3).entrySet()) {
                    Sponsorship value = entry.getValue();
                    Sponsorship sponsorship = createSponsorshipMap.get(entry.getKey());
                    if (sponsorship != null && sponsorship.wasDisplayedDuringSession()) {
                        value.displayedDuringSession();
                    }
                }
            }
        }
    }

    public void setTTLSeconds(long j) {
        this.mTTLSeconds = j;
    }

    @JsonProperty("sponsorships")
    public abstract ArrayList<Sponsorship> sponsorships();
}

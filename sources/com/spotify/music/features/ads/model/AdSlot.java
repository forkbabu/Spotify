package com.spotify.music.features.ads.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.features.ads.a2;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AdSlot implements JacksonModel {
    public static final AdSlot ACTIVE_PLAY_INTERRUPTION;
    private static final String ACTIVE_PLAY_INTERRUPTION_SLOT = "active-play-limit";
    public static final AdSlot MARQUEE;
    private static final String MARQUEE_SLOT = "marquee";
    public static final AdSlot MIDROLL_WATCHNOW;
    private static final String MIDROLL_WATCHNOW_SLOT = "midroll-watchnow";
    public static final AdSlot MOBILE_SCREENSAVER;
    private static final String MOBILE_SCREENSAVER_SLOT = "mobile-screensaver";
    public static final AdSlot PODCAST_MIDROLL;
    private static final String PODCAST_MIDROLL_SLOT = "podcast-midroll-1";
    public static final AdSlot PREROLL;
    private static final String PREROLL_SLOT = "preroll";
    public static final AdSlot REPEAT_PLAY_INTERRUPTION;
    private static final String REPEAT_PLAY_INTERRUPTION_SLOT = "repeat-play";
    public static final AdSlot SPONSORED_PLAYLIST;
    private static final String SPONSORED_PLAYLIST_SLOT = "sponsored-playlist";
    public static final AdSlot STREAM;
    private static final String STREAM_SLOT = "stream";
    public static final AdSlot WATCHNOW;
    private static final String WATCHNOW_SLOT = "watchnow";
    @JsonProperty
    public List<Format> formats;
    private boolean mIsRegistered;
    private final a mOnSlotRegistered;
    private b mPendingAdRequestListener;
    @JsonProperty
    public String slot_id;

    public interface a {
        void a(a2 a2Var);
    }

    public interface b {
        void i();
    }

    static {
        Format format = Format.AUDIO;
        Format format2 = Format.VIDEO;
        PREROLL = new AdSlot(PREROLL_SLOT, Arrays.asList(format, format2), g.a);
        WATCHNOW = new AdSlot(WATCHNOW_SLOT, Arrays.asList(format, format2), b.a);
        MIDROLL_WATCHNOW = new AdSlot(MIDROLL_WATCHNOW_SLOT, Arrays.asList(format, format2), e.a);
        List singletonList = Collections.singletonList(format2);
        d dVar = d.a;
        STREAM = new AdSlot(STREAM_SLOT, singletonList, dVar);
        Format format3 = Format.BANNER;
        MARQUEE = new AdSlot(MARQUEE_SLOT, Collections.singletonList(format3), c.a);
        MOBILE_SCREENSAVER = new AdSlot(MOBILE_SCREENSAVER_SLOT, Collections.singletonList(format3), f.a);
        SPONSORED_PLAYLIST = new AdSlot(SPONSORED_PLAYLIST_SLOT, Collections.singletonList(format3), dVar);
        ACTIVE_PLAY_INTERRUPTION = new AdSlot(ACTIVE_PLAY_INTERRUPTION_SLOT, Arrays.asList(format, format2), dVar);
        REPEAT_PLAY_INTERRUPTION = new AdSlot(REPEAT_PLAY_INTERRUPTION_SLOT, Arrays.asList(format, format2), dVar);
        PODCAST_MIDROLL = new AdSlot(PODCAST_MIDROLL_SLOT, Collections.singletonList(format), dVar);
    }

    public AdSlot(String str, List<Format> list, a aVar) {
        this.slot_id = str;
        this.formats = list;
        this.mOnSlotRegistered = aVar;
    }

    /* access modifiers changed from: private */
    public static void doNoOp(a2 a2Var) {
    }

    public static AdSlot valueOf(String str) {
        AdSlot adSlot = PREROLL;
        if (adSlot.getSlotId().equals(str)) {
            return adSlot;
        }
        AdSlot adSlot2 = WATCHNOW;
        if (adSlot2.getSlotId().equals(str)) {
            return adSlot2;
        }
        AdSlot adSlot3 = MIDROLL_WATCHNOW;
        if (adSlot3.getSlotId().equals(str)) {
            return adSlot3;
        }
        AdSlot adSlot4 = MOBILE_SCREENSAVER;
        if (adSlot4.getSlotId().equals(str)) {
            return adSlot4;
        }
        AdSlot adSlot5 = SPONSORED_PLAYLIST;
        if (adSlot5.getSlotId().equals(str)) {
            return adSlot5;
        }
        AdSlot adSlot6 = ACTIVE_PLAY_INTERRUPTION;
        if (adSlot6.getSlotId().equals(str)) {
            return adSlot6;
        }
        AdSlot adSlot7 = REPEAT_PLAY_INTERRUPTION;
        if (adSlot7.getSlotId().equals(str)) {
            return adSlot7;
        }
        AdSlot adSlot8 = PODCAST_MIDROLL;
        if (adSlot8.getSlotId().equals(str)) {
            return adSlot8;
        }
        return STREAM;
    }

    @Deprecated
    public String getCosmosEndpoint() {
        return je.x0("sp://ads/v1/slots/", getSlotId());
    }

    public String getSlotId() {
        return this.slot_id;
    }

    public void onRegistered(a2 a2Var) {
        this.mOnSlotRegistered.a(a2Var);
        this.mIsRegistered = true;
        b bVar = this.mPendingAdRequestListener;
        if (bVar != null) {
            bVar.i();
            this.mPendingAdRequestListener = null;
        }
    }

    public void registerAdRequest(b bVar) {
        if (this.mIsRegistered) {
            bVar.i();
        } else {
            this.mPendingAdRequestListener = bVar;
        }
    }

    public void setRegistered(boolean z) {
        this.mIsRegistered = z;
    }

    public String toString() {
        return this.slot_id;
    }
}

package com.spotify.music.marketingformats.constants;

import kotlin.jvm.internal.f;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
public final class MarketingFormatsComponentId extends Enum<MarketingFormatsComponentId> {
    public static final MarketingFormatsComponentId a;
    public static final MarketingFormatsComponentId b;
    public static final MarketingFormatsComponentId c;
    public static final MarketingFormatsComponentId f;
    public static final MarketingFormatsComponentId n;
    public static final MarketingFormatsComponentId o;
    private static final /* synthetic */ MarketingFormatsComponentId[] p;
    public static final a q = new a(null);
    private final String id;

    public static final class a {
        public a(f fVar) {
        }
    }

    static {
        MarketingFormatsComponentId marketingFormatsComponentId = new MarketingFormatsComponentId("SLIDE_HEADER_ENTITY", 2, "marketing-format:slide-header-entity");
        a = marketingFormatsComponentId;
        MarketingFormatsComponentId marketingFormatsComponentId2 = new MarketingFormatsComponentId("SLIDE_HEADER_FEATURED_VIDEO", 3, "marketing-format:slide-header-featured-video");
        b = marketingFormatsComponentId2;
        MarketingFormatsComponentId marketingFormatsComponentId3 = new MarketingFormatsComponentId("SLIDE_HEADER_INFO", 4, "marketing-format:slide-header-info");
        c = marketingFormatsComponentId3;
        MarketingFormatsComponentId marketingFormatsComponentId4 = new MarketingFormatsComponentId("SLIDE_HEADER_INTRO", 5, "marketing-format:slide-header-intro");
        f = marketingFormatsComponentId4;
        MarketingFormatsComponentId marketingFormatsComponentId5 = new MarketingFormatsComponentId("SLIDE_HEADER_PLAYABLE_ENTITY", 6, "marketing-format:slide-header-playable-entity");
        n = marketingFormatsComponentId5;
        MarketingFormatsComponentId marketingFormatsComponentId6 = new MarketingFormatsComponentId("SLIDE_HEADER_SHARE", 7, "marketing-format:slide-header-share");
        o = marketingFormatsComponentId6;
        p = new MarketingFormatsComponentId[]{new MarketingFormatsComponentId("BLURB", 0, "marketing-format:blurb-card"), new MarketingFormatsComponentId("SLIDE_HEADER", 1, "marketing-format:slide-header"), marketingFormatsComponentId, marketingFormatsComponentId2, marketingFormatsComponentId3, marketingFormatsComponentId4, marketingFormatsComponentId5, marketingFormatsComponentId6};
    }

    private MarketingFormatsComponentId(String str, int i, String str2) {
        this.id = str2;
    }

    public static MarketingFormatsComponentId valueOf(String str) {
        return (MarketingFormatsComponentId) Enum.valueOf(MarketingFormatsComponentId.class, str);
    }

    public static MarketingFormatsComponentId[] values() {
        return (MarketingFormatsComponentId[]) p.clone();
    }

    public final String d() {
        return this.id;
    }
}

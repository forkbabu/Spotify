package com.spotify.music.features.yourlibraryx.view;

import kotlin.jvm.internal.f;

/* JADX WARN: Init of enum a can be incorrect */
/* JADX WARN: Init of enum b can be incorrect */
/* JADX WARN: Init of enum c can be incorrect */
/* JADX WARN: Init of enum f can be incorrect */
/* JADX WARN: Init of enum n can be incorrect */
/* JADX WARN: Init of enum o can be incorrect */
/* JADX WARN: Init of enum p can be incorrect */
/* JADX WARN: Init of enum q can be incorrect */
/* JADX WARN: Init of enum r can be incorrect */
/* JADX WARN: Init of enum s can be incorrect */
/* JADX WARN: Init of enum t can be incorrect */
/* JADX WARN: Init of enum u can be incorrect */
/* JADX WARN: Init of enum v can be incorrect */
/* JADX WARN: Init of enum w can be incorrect */
/* JADX WARN: Init of enum x can be incorrect */
/* JADX WARN: Init of enum y can be incorrect */
/* JADX WARN: Init of enum z can be incorrect */
/* JADX WARN: Init of enum A can be incorrect */
/* JADX WARN: Init of enum B can be incorrect */
/* JADX WARN: Init of enum C can be incorrect */
/* access modifiers changed from: package-private */
public enum EntityType {
    CARD_ALBUM(r2),
    CARD_ARTIST(r2),
    CARD_CIRCULAR_PLACEHOLDER(r2),
    CARD_FOLDER(r2),
    CARD_LIKED_SONGS(r2),
    CARD_PLACEHOLDER(r2),
    CARD_PLAYLIST(r2),
    CARD_PODCAST(r2),
    CARD_YOUR_EPISODES(r2),
    ROW_ALBUM(r2),
    ROW_ARTIST(r2),
    ROW_CIRCULAR_PLACEHOLDER(r2),
    ROW_FOLDER(r2),
    ROW_LIKED_SONGS(r2),
    ROW_PLACEHOLDER(r2),
    ROW_PLAYLIST(r2),
    ROW_PODCAST(r2),
    ROW_SECTION_HEADER(r2),
    ROW_SORT_OPTIONS(r2),
    ROW_YOUR_EPISODES(r2);
    
    private static final EntityType[] E = values();
    public static final a F = new a(null);
    private final SpanType spanType;

    public static final class a {
        public a(f fVar) {
        }
    }

    static {
        SpanType spanType2 = SpanType.CARD;
        SpanType spanType3 = SpanType.ROW;
    }

    private EntityType(SpanType spanType2) {
        this.spanType = spanType2;
    }

    public final SpanType g() {
        return this.spanType;
    }
}

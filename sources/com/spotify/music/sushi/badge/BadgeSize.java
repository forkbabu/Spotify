package com.spotify.music.sushi.badge;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
public final class BadgeSize extends Enum<BadgeSize> {
    public static final BadgeSize a;
    private static final /* synthetic */ BadgeSize[] b;

    static {
        BadgeSize badgeSize = new BadgeSize("REGULAR", 0);
        a = badgeSize;
        b = new BadgeSize[]{badgeSize, new BadgeSize("LARGE", 1)};
    }

    private BadgeSize(String str, int i) {
    }

    public static BadgeSize valueOf(String str) {
        return (BadgeSize) Enum.valueOf(BadgeSize.class, str);
    }

    public static BadgeSize[] values() {
        return (BadgeSize[]) b.clone();
    }
}

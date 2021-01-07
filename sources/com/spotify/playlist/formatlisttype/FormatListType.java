package com.spotify.playlist.formatlisttype;

import java.util.regex.Pattern;
import kotlin.jvm.internal.h;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
public final class FormatListType extends Enum<FormatListType> {
    public static final FormatListType a;
    public static final FormatListType b;
    public static final FormatListType c;
    public static final FormatListType f;
    public static final FormatListType n;
    public static final FormatListType o;
    public static final FormatListType p;
    public static final FormatListType q;
    public static final FormatListType r;
    public static final FormatListType s;
    private static final /* synthetic */ FormatListType[] t;
    private final Pattern pattern;

    static {
        FormatListType formatListType = new FormatListType("BLEND", 0, "blend");
        a = formatListType;
        FormatListType formatListType2 = new FormatListType("CAR_MIX", 1, "car-mix");
        b = formatListType2;
        FormatListType formatListType3 = new FormatListType("CHART", 2, "chart");
        c = formatListType3;
        FormatListType formatListType4 = new FormatListType("DAILY_MIX", 3, "daily-mix");
        f = formatListType4;
        FormatListType formatListType5 = new FormatListType("EDITORIAL", 5, "editorial");
        n = formatListType5;
        FormatListType formatListType6 = new FormatListType("HOME_MIX", 6, "home-mix");
        o = formatListType6;
        FormatListType formatListType7 = new FormatListType("OFFLINE_MIX", 8, "offline-mix");
        p = formatListType7;
        FormatListType formatListType8 = new FormatListType("OFFLINE_USER_MIX", 9, "offline-user-mix");
        q = formatListType8;
        FormatListType formatListType9 = new FormatListType("PLAYLIST", 10, "");
        r = formatListType9;
        FormatListType formatListType10 = new FormatListType("P2S", 11, "format-shows|format-shows-shuffle");
        s = formatListType10;
        t = new FormatListType[]{formatListType, formatListType2, formatListType3, formatListType4, new FormatListType("DISCOVER_WEEKLY", 4, "discover-weekly|personalised-sets-.*"), formatListType5, formatListType6, new FormatListType("RELEASE_RADAR", 7, "release-radar"), formatListType7, formatListType8, formatListType9, formatListType10};
    }

    private FormatListType(String str, int i, String str2) {
        Pattern compile = Pattern.compile(str2);
        h.d(compile, "Pattern.compile(pattern)");
        this.pattern = compile;
    }

    public static FormatListType valueOf(String str) {
        return (FormatListType) Enum.valueOf(FormatListType.class, str);
    }

    public static FormatListType[] values() {
        return (FormatListType[]) t.clone();
    }

    public final boolean d(String str) {
        h.e(str, "input");
        return this.pattern.matcher(str).matches();
    }
}

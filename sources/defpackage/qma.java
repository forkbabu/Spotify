package defpackage;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.mobile.android.util.l0;

/* renamed from: qma  reason: default package */
public final class qma {
    public static a a(String str) {
        switch (l0.z(str).q().ordinal()) {
            case 190:
            case 191:
                return PageIdentifiers.PODCASTCHARTS_CATEGORIES;
            case 192:
                return PageIdentifiers.PODCASTCHARTS_CHART;
            case 193:
            case 195:
                return PageIdentifiers.PODCASTCHARTS;
            case 194:
                return PageIdentifiers.PODCASTCHARTS_REGIONS;
            default:
                return PageIdentifiers.UNKNOWN;
        }
    }
}

package com.spotify.music.features.yourlibrary.musicpages.prefs.domain;

import java.util.Comparator;

public final /* synthetic */ class f implements Comparator {
    public static final /* synthetic */ f a = new f();

    private /* synthetic */ f() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Long timestamp = ((PagePrefs) obj2).timestamp();
        timestamp.getClass();
        long longValue = timestamp.longValue();
        Long timestamp2 = ((PagePrefs) obj).timestamp();
        timestamp2.getClass();
        return (longValue > timestamp2.longValue() ? 1 : (longValue == timestamp2.longValue() ? 0 : -1));
    }
}

package com.spotify.music.features.yourlibraryx.recentsearch;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.text.e;

public final class c {
    public static final List a(String str) {
        return str != null ? e.v(str, new char[]{','}, false, 0, 6, null) : EmptyList.a;
    }
}

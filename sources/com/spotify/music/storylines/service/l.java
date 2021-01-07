package com.spotify.music.storylines.service;

import com.spotify.libs.instrumentation.performance.ColdStartTracker;
import com.spotify.mobile.android.rx.v;
import io.reactivex.y;

public final class l {
    public static void a(StorylinesUrisFetcher storylinesUrisFetcher, sjd sjd) {
        storylinesUrisFetcher.r = sjd;
    }

    public static void b(StorylinesUrisFetcher storylinesUrisFetcher, ColdStartTracker coldStartTracker) {
        storylinesUrisFetcher.v = coldStartTracker;
    }

    public static void c(StorylinesUrisFetcher storylinesUrisFetcher, v vVar) {
        storylinesUrisFetcher.s = vVar;
    }

    public static void d(StorylinesUrisFetcher storylinesUrisFetcher, ajd ajd) {
        storylinesUrisFetcher.q = ajd;
    }

    public static void e(StorylinesUrisFetcher storylinesUrisFetcher, fjd fjd) {
        storylinesUrisFetcher.t = fjd;
    }

    public static void f(StorylinesUrisFetcher storylinesUrisFetcher, y yVar) {
        storylinesUrisFetcher.u = yVar;
    }
}

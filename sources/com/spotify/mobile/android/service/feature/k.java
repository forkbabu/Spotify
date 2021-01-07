package com.spotify.mobile.android.service.feature;

import com.spotify.android.flags.Overridable;
import com.spotify.android.flags.a;
import com.spotify.android.flags.j;
import com.spotify.cosmos.android.CosmosServiceIntentBuilder;
import com.spotify.libs.instrumentation.performance.ColdStartTracker;
import com.spotify.mobile.android.ui.fragments.logic.p;

public final class k {
    public static void a(FeatureService featureService, ColdStartTracker coldStartTracker) {
        featureService.a = coldStartTracker;
    }

    public static void b(FeatureService featureService, CosmosServiceIntentBuilder cosmosServiceIntentBuilder) {
        featureService.c = cosmosServiceIntentBuilder;
    }

    public static void c(FeatureService featureService, FlagsManager flagsManager) {
        featureService.f = flagsManager;
    }

    public static void d(FeatureService featureService, fg0 fg0) {
        featureService.b = fg0;
    }

    @Deprecated
    public static a e(String str, Overridable overridable) {
        return new a(str, new p(str), overridable);
    }

    @Deprecated
    public static a f(String str, Overridable overridable, int i) {
        return new l(str, new p(str), overridable, i);
    }

    @Deprecated
    public static j g(String str, Overridable overridable) {
        return new j(str, new p(str), overridable);
    }
}

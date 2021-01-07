package com.spotify.page.hosting;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.h;

public final class a {
    private final Map<String, usd<Parcelable>> a;

    public a(Map<String, usd<Parcelable>> map) {
        h.e(map, "pageRegistry");
        this.a = map;
    }

    public final <Parameters extends Parcelable> PageHostingFragment a(Class<? extends usd<Parameters>> cls, Parameters parameters) {
        h.e(cls, "pageProviderType");
        h.e(parameters, "parameters");
        PageHostingFragment pageHostingFragment = new PageHostingFragment(this.a);
        Bundle bundle = new Bundle();
        bundle.putString("page_key", cls.getName());
        bundle.putParcelable("parameters", parameters);
        pageHostingFragment.r4(bundle);
        return pageHostingFragment;
    }

    public final PageHostingFragment b() {
        return new PageHostingFragment(this.a);
    }
}

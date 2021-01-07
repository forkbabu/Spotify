package com.spotify.music.features.premiumreactivation;

import com.spotify.remoteconfig.runtime.model.PropertyModel;
import java.util.Comparator;

public final /* synthetic */ class d implements Comparator {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((PropertyModel) obj).name().compareTo(((PropertyModel) obj2).name());
    }
}

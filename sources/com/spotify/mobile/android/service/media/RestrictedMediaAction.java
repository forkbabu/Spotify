package com.spotify.mobile.android.service.media;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class RestrictedMediaAction {
    public final Type a;
    public final List<String> b;

    public enum Type {
        SKIP_NEXT,
        SKIP_PREVIOUS,
        SEEK
    }

    RestrictedMediaAction(Type type, List<String> list) {
        this.a = type;
        this.b = ImmutableList.copyOf((Collection) list);
    }
}

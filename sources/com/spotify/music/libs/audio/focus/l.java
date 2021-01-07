package com.spotify.music.libs.audio.focus;

import com.google.common.base.Function;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.audio.focus.MediaFocusManager;

public final /* synthetic */ class l implements Function {
    public static final /* synthetic */ l a = new l();

    private /* synthetic */ l() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return ((l0) obj).q() == LinkType.SHOW_EPISODE ? MediaFocusManager.ContentType.SPEECH : MediaFocusManager.ContentType.DEFAULT;
    }
}

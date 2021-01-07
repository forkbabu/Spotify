package com.spotify.music.features.premiumdestination.view;

import android.content.res.Resources;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableViewModel;
import com.spotify.music.C0707R;
import com.spotify.music.features.premiumdestination.domain.ErrorReason;
import com.spotify.music.features.premiumdestination.domain.m;

public final class a1 {
    private static final b91 b;
    private static final b91 c;
    private static final b91 d = t71.c();
    private final Resources a;

    static {
        HubsImmutableViewModel hubsImmutableViewModel = HubsImmutableViewModel.EMPTY;
        b = hubsImmutableViewModel;
        c = hubsImmutableViewModel;
    }

    public a1(Resources resources) {
        this.a = resources;
    }

    public static b91 a(a1 a1Var, m.c cVar) {
        a1Var.getClass();
        return cVar.c() ? d : c;
    }

    public static b91 b(a1 a1Var, m.a aVar) {
        a1Var.getClass();
        if (aVar.c() == ErrorReason.SERVER_FAILURE) {
            return t71.a(SpotifyIconV2.WARNING, a1Var.a.getString(C0707R.string.error_general_title), a1Var.a.getString(C0707R.string.error_general_body));
        }
        return b;
    }
}

package com.spotify.music.features.podcast.notifications;

import android.os.Bundle;
import androidx.fragment.app.o;
import kotlin.jvm.internal.h;

public final class d implements tna {
    private final o a;

    public d(o oVar) {
        h.e(oVar, "fragmentManager");
        this.a = oVar;
    }

    @Override // defpackage.tna
    public void a(String str, String str2) {
        h.e(str, "showUri");
        h.e(str2, "showName");
        h.e(str, "showUri");
        h.e(str2, "showName");
        NotificationsBottomDrawerFragment notificationsBottomDrawerFragment = new NotificationsBottomDrawerFragment();
        Bundle bundle = new Bundle();
        bundle.putString("show_uri", str);
        bundle.putString("show_name", str2);
        notificationsBottomDrawerFragment.r4(bundle);
        notificationsBottomDrawerFragment.Y4(this.a, "podcast-notification-bottom-drawer");
    }
}

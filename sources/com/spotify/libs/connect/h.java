package com.spotify.libs.connect;

import com.google.common.base.Optional;
import com.spotify.libs.connect.ConnectManager;
import com.spotify.libs.connect.picker.view.d;
import io.reactivex.s;

public class h {
    private static final String a = "h";
    public static final /* synthetic */ int b = 0;

    public s<d> a(ConnectManager connectManager) {
        String str = a;
        return s.l(connectManager.p(str).j0(f.a).G0((R) Optional.absent()), connectManager.j(str).G0(Optional.absent()), connectManager.m(str), connectManager.h(str).G0(ConnectManager.ConnectState.UNKNOWN), a.a);
    }
}

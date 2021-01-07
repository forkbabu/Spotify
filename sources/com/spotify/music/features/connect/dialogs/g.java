package com.spotify.music.features.connect.dialogs;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;

public final class g {
    public static a a(zn4 zn4) {
        int type = zn4.getType();
        if (type == 0) {
            return PageIdentifiers.CONNECT_TUTORIALDESKTOP;
        }
        if (type == 1) {
            return PageIdentifiers.CONNECT_TUTORIALTV;
        }
        if (type == 3) {
            return PageIdentifiers.CONNECT_TUTORIALGAMECONSOLE;
        }
        if (type == 4) {
            return PageIdentifiers.CONNECT_TUTORIALCHROMECAST;
        }
        if (type != 5) {
            return PageIdentifiers.CONNECT_TUTORIALSPEAKER;
        }
        return PageIdentifiers.CONNECT_TUTORIALBLUETOOTH;
    }

    public static c b(zn4 zn4) {
        int type = zn4.getType();
        if (type == 0) {
            return ViewUris.E1;
        }
        if (type == 1) {
            return ViewUris.G1;
        }
        if (type == 3) {
            return ViewUris.H1;
        }
        if (type == 4) {
            return ViewUris.I1;
        }
        if (type != 5) {
            return ViewUris.F1;
        }
        return ViewUris.J1;
    }
}

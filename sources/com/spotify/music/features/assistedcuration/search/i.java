package com.spotify.music.features.assistedcuration.search;

import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;

public class i implements jh8 {
    private final String a;

    i(String str) {
        this.a = str;
    }

    @Override // defpackage.jh8
    public c a() {
        String str = this.a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1415163932:
                if (str.equals("albums")) {
                    c = 0;
                    break;
                }
                break;
            case -865716088:
                if (str.equals("tracks")) {
                    c = 1;
                    break;
                }
                break;
            case -732362228:
                if (str.equals("artists")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return ViewUris.L;
            case 1:
                return ViewUris.K;
            case 2:
                return ViewUris.J;
            default:
                return ViewUris.G;
        }
    }
}

package com.spotify.share.util;

import com.spotify.share.sharedata.p;
import com.spotify.share.sharedata.s;
import com.spotify.share.sharedata.t;

public class q {
    public String a(t tVar, String str) {
        String str2;
        if (tVar instanceof s) {
            str2 = ((s) tVar).k();
        } else {
            str2 = tVar instanceof p ? ((p) tVar).k() : null;
        }
        if (str2 == null) {
            return str;
        }
        return str2 + '\n' + str;
    }
}

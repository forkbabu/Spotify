package com.spotify.mobile.android.video.offline;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.upstream.cache.i;
import com.google.android.exoplayer2.upstream.m;

public class i0 implements i {
    @Override // com.google.android.exoplayer2.upstream.cache.i
    public String a(m mVar) {
        String str = mVar.h;
        if (str != null) {
            return str;
        }
        Uri uri = mVar.a;
        String path = uri.getPath();
        return TextUtils.isEmpty(path) ? uri.toString() : path;
    }
}

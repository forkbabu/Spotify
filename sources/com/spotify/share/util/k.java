package com.spotify.share.util;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.spotify.mobile.android.util.t;
import java.io.File;

public class k {
    private final Context a;
    private final t b;

    public k(Context context, t tVar) {
        this.a = context;
        this.b = tVar;
    }

    public Uri a(File file) {
        return FileProvider.b(this.a, String.format("%s.%s", this.b.y(), "instagram"), file);
    }
}

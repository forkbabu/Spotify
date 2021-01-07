package com.spotify.music.features.creatorartist;

import android.os.Environment;
import android.os.FileObserver;
import java.io.File;

public class k extends FileObserver {
    private static final String c = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Screenshots").getAbsolutePath();
    private final a a;
    private String b;

    public interface a {
    }

    public k(a aVar) {
        super(c, 8);
        this.a = aVar;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i, String str) {
        if (str != null && i == 8 && !str.equals(this.b)) {
            this.b = str;
            ((BiographyFragment) this.a).x0.p();
        }
    }
}

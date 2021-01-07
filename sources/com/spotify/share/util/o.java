package com.spotify.share.util;

import android.app.Application;
import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.IOException;
import org.apache.commons.lang3.c;

public class o {
    private final Context a;

    public o(Application application) {
        this.a = application.getApplicationContext();
    }

    public File a(String str, boolean z) {
        File file;
        if (z) {
            file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        } else {
            file = new File(this.a.getCacheDir(), "shareablesdir");
        }
        if (!file.exists() && !file.mkdirs()) {
            throw new IOException(String.format("Could not make shareable directory: %s", file));
        } else if (!z) {
            return new File(file, str);
        } else {
            File file2 = new File(file, str);
            if (!file2.exists()) {
                return file2;
            }
            while (file2.exists()) {
                file2 = new File(file, b(".png"));
            }
            return file2;
        }
    }

    public String b(String str) {
        return c.a(10) + str;
    }
}

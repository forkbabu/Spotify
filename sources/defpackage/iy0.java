package defpackage;

import android.app.Activity;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: iy0  reason: default package */
public class iy0 implements hy0 {
    private final File a;

    public iy0(Activity activity) {
        Optional optional;
        File cacheDir = activity.getCacheDir();
        if (cacheDir == null) {
            optional = Optional.absent();
        } else if ((!cacheDir.isDirectory() || !cacheDir.canWrite()) && (!cacheDir.mkdirs() || !cacheDir.isDirectory() || !cacheDir.canWrite())) {
            optional = Optional.absent();
        } else {
            optional = Optional.of(cacheDir.getAbsolutePath());
        }
        if (optional.isPresent()) {
            this.a = (File) optional.transform(gy0.a).get();
            return;
        }
        throw new IllegalStateException("unable to access application cache directory");
    }

    @Override // defpackage.hy0
    public boolean a() {
        return this.a.exists();
    }

    @Override // defpackage.hy0
    public OutputStream b() {
        try {
            if (this.a.createNewFile()) {
                Logger.b("Created PSES cache file", new Object[0]);
            }
        } catch (IOException e) {
            Assertion.i("Unable to create PSES cache file", e);
        }
        try {
            return new FileOutputStream(this.a);
        } catch (FileNotFoundException e2) {
            Assertion.i("Unable to find PSES cache file", e2);
            return null;
        }
    }

    @Override // defpackage.hy0
    public InputStream c() {
        try {
            return new FileInputStream(this.a);
        } catch (FileNotFoundException e) {
            Assertion.i("Unable to find PSES cache file", e);
            return null;
        }
    }
}

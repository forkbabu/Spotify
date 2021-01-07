package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import androidx.core.content.FileProvider;
import com.spotify.mobile.android.util.t;
import java.io.File;

/* renamed from: zl5  reason: default package */
public class zl5 implements yl5 {
    private final Context a;

    public zl5(Context context) {
        this.a = context;
    }

    @Override // defpackage.yl5
    public Uri a(File file, t tVar, String str) {
        return FileProvider.b(this.a, String.format("%s.%s", tVar.y(), str), file);
    }

    public File b() {
        return File.createTempFile("ImageRecs", ".jpg", this.a.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
    }
}

package defpackage;

import android.os.Debug;
import android.os.Environment;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

/* access modifiers changed from: package-private */
/* renamed from: iv9  reason: default package */
public class iv9 extends PrintStream {
    final /* synthetic */ boolean a;
    final /* synthetic */ PrintStream b;
    final /* synthetic */ jv9 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    iv9(jv9 jv9, OutputStream outputStream, boolean z, PrintStream printStream) {
        super(outputStream);
        this.c = jv9;
        this.a = z;
        this.b = printStream;
    }

    @Override // java.io.PrintStream
    public synchronized void println(String str) {
        super.println(str);
        if (!this.a && str.startsWith("StrictMode VmPolicy violation")) {
            try {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                Debug.dumpHprofData(new File(externalStorageDirectory, "spotify-" + this.c.e.d() + ".hprof").getAbsolutePath());
            } catch (IOException e) {
                super.println("Failed capturing heap data");
                e.printStackTrace(this.b);
            }
        }
    }
}

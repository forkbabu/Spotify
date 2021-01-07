package defpackage;

import android.os.ParcelFileDescriptor;
import com.spotify.base.java.logging.Logger;
import com.spotify.core.image.ImageLoaderInterface;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* access modifiers changed from: package-private */
/* renamed from: ic1  reason: default package */
public class ic1 implements hc1 {
    private final ImageLoaderInterface a;

    public ic1(ImageLoaderInterface imageLoaderInterface) {
        this.a = imageLoaderInterface;
    }

    @Override // defpackage.hc1
    public InputStream a(String str) {
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
            ParcelFileDescriptor parcelFileDescriptor2 = createPipe[1];
            if (!this.a.writeImageToPipe(str, parcelFileDescriptor2.getFileDescriptor())) {
                try {
                    parcelFileDescriptor.close();
                } catch (IOException unused) {
                }
                try {
                    parcelFileDescriptor2.close();
                } catch (IOException unused2) {
                }
                return null;
            }
            try {
                parcelFileDescriptor2.close();
            } catch (IOException e) {
                Logger.c(e, "", new Object[0]);
            }
            return new FileInputStream(parcelFileDescriptor.getFileDescriptor());
        } catch (IOException unused3) {
            return null;
        }
    }
}

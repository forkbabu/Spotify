package defpackage;

import com.spotify.core.image.ImageLoaderInterface;
import java.io.InputStream;

/* renamed from: jc1  reason: default package */
public class jc1 implements hc1 {
    private hc1 a = new kc1();

    @Override // defpackage.hc1
    public InputStream a(String str) {
        return this.a.a(str);
    }

    public void b(ImageLoaderInterface imageLoaderInterface) {
        this.a = new ic1(imageLoaderInterface);
    }

    public void c() {
        this.a = new kc1();
    }
}

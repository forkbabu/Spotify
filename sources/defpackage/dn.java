package defpackage;

import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* renamed from: dn  reason: default package */
public final class dn {
    private final ByteArrayOutputStream a;
    private final DataOutputStream b;

    public dn() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.a = byteArrayOutputStream;
        this.b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, long j) {
        dataOutputStream.writeByte(((int) (j >>> 24)) & BitmapRenderer.ALPHA_VISIBLE);
        dataOutputStream.writeByte(((int) (j >>> 16)) & BitmapRenderer.ALPHA_VISIBLE);
        dataOutputStream.writeByte(((int) (j >>> 8)) & BitmapRenderer.ALPHA_VISIBLE);
        dataOutputStream.writeByte(((int) j) & BitmapRenderer.ALPHA_VISIBLE);
    }

    public byte[] a(bn bnVar) {
        this.a.reset();
        try {
            DataOutputStream dataOutputStream = this.b;
            dataOutputStream.writeBytes(bnVar.a);
            dataOutputStream.writeByte(0);
            String str = bnVar.b;
            if (str == null) {
                str = "";
            }
            DataOutputStream dataOutputStream2 = this.b;
            dataOutputStream2.writeBytes(str);
            dataOutputStream2.writeByte(0);
            b(this.b, bnVar.c);
            b(this.b, bnVar.f);
            this.b.write(bnVar.n);
            this.b.flush();
            return this.a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

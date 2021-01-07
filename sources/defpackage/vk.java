package defpackage;

import com.google.android.exoplayer2.util.v;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.nio.ByteBuffer;
import java.util.UUID;

/* renamed from: vk  reason: default package */
public final class vk {

    /* access modifiers changed from: private */
    /* renamed from: vk$a */
    public static class a {
        private final UUID a;
        private final int b;
        private final byte[] c;

        public a(UUID uuid, int i, byte[] bArr) {
            this.a = uuid;
            this.b = i;
            this.c = bArr;
        }
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (!(bArr == null || bArr.length == 0)) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static boolean b(byte[] bArr) {
        return c(bArr) != null;
    }

    private static a c(byte[] bArr) {
        int h;
        v vVar = new v(bArr);
        if (vVar.c() < 32) {
            return null;
        }
        vVar.K(0);
        if (vVar.h() != vVar.a() + 4 || vVar.h() != 1886614376 || (h = (vVar.h() >> 24) & BitmapRenderer.ALPHA_VISIBLE) > 1) {
            return null;
        }
        UUID uuid = new UUID(vVar.q(), vVar.q());
        if (h == 1) {
            vVar.L(vVar.B() * 16);
        }
        int B = vVar.B();
        if (B != vVar.a()) {
            return null;
        }
        byte[] bArr2 = new byte[B];
        vVar.g(bArr2, 0, B);
        return new a(uuid, h, bArr2);
    }

    public static byte[] d(byte[] bArr, UUID uuid) {
        a c = c(bArr);
        if (c == null) {
            return null;
        }
        if (uuid == null || uuid.equals(c.a)) {
            return c.c;
        }
        String str = "UUID mismatch. Expected: " + uuid + ", got: " + c.a + ".";
        return null;
    }

    public static UUID e(byte[] bArr) {
        a c = c(bArr);
        if (c == null) {
            return null;
        }
        return c.a;
    }

    public static int f(byte[] bArr) {
        a c = c(bArr);
        if (c == null) {
            return -1;
        }
        return c.b;
    }
}

package defpackage;

import com.google.android.exoplayer2.util.v;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: cn  reason: default package */
public final class cn implements wm {
    @Override // defpackage.wm
    public um a(ym ymVar) {
        ByteBuffer byteBuffer = ymVar.b;
        byteBuffer.getClass();
        return new um(b(new v(byteBuffer.array(), byteBuffer.limit())));
    }

    public bn b(v vVar) {
        String r = vVar.r();
        r.getClass();
        String r2 = vVar.r();
        r2.getClass();
        return new bn(r, r2, vVar.z(), vVar.z(), Arrays.copyOfRange(vVar.a, vVar.b(), vVar.c()));
    }
}

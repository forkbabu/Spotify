package defpackage;

import com.googlecode.mp4parser.boxes.piff.a;
import java.nio.ByteBuffer;
import java.util.UUID;

/* renamed from: u40  reason: default package */
public class u40 extends a {
    public static UUID c = UUID.fromString("00000000-0000-0000-0000-000000000000");
    ByteBuffer b;

    static {
        a.a.put(c, u40.class);
    }

    @Override // com.googlecode.mp4parser.boxes.piff.a
    public ByteBuffer a() {
        return this.b;
    }

    @Override // com.googlecode.mp4parser.boxes.piff.a
    public void b(ByteBuffer byteBuffer) {
        this.b = byteBuffer;
    }
}

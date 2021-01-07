package com.googlecode.mp4parser.boxes.piff;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public abstract class a {
    protected static Map<UUID, Class<? extends a>> a = new HashMap();

    public abstract ByteBuffer a();

    public abstract void b(ByteBuffer byteBuffer);

    public boolean equals(Object obj) {
        throw new RuntimeException("somebody called equals on me but that's not supposed to happen.");
    }

    public String toString() {
        StringBuilder Z0 = je.Z0("ProtectionSpecificHeader", "{data=");
        ByteBuffer duplicate = a().duplicate();
        duplicate.rewind();
        byte[] bArr = new byte[duplicate.limit()];
        duplicate.get(bArr);
        Z0.append(me.b(bArr, 0));
        Z0.append('}');
        return Z0.toString();
    }
}

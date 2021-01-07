package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import java.nio.ByteBuffer;

public abstract class b {
    public abstract ByteBuffer a();

    public abstract String b();

    public abstract void c(ByteBuffer byteBuffer);

    public int d() {
        return a().limit();
    }
}

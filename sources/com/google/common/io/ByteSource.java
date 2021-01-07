package com.google.common.io;

import java.io.InputStream;

public abstract class ByteSource {
    protected ByteSource() {
    }

    public abstract InputStream openStream();
}

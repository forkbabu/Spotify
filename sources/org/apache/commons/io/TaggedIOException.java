package org.apache.commons.io;

import java.io.IOException;
import java.io.Serializable;

public class TaggedIOException extends IOExceptionWithCause {
    private static final long serialVersionUID = -6994123481142850163L;
    private final Serializable tag;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return (IOException) super.getCause();
    }
}

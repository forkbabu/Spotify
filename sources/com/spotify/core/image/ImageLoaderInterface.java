package com.spotify.core.image;

import java.io.FileDescriptor;

public interface ImageLoaderInterface {
    boolean writeImageToPipe(String str, FileDescriptor fileDescriptor);
}

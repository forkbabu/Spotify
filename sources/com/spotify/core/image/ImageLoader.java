package com.spotify.core.image;

import java.io.FileDescriptor;

public class ImageLoader implements ImageLoaderInterface {
    private long nImageLoaderPtr;

    private ImageLoader() {
    }

    @Override // com.spotify.core.image.ImageLoaderInterface
    public native boolean writeImageToPipe(String str, FileDescriptor fileDescriptor);
}

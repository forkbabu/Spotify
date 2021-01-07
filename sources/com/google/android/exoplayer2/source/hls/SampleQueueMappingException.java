package com.google.android.exoplayer2.source.hls;

import java.io.IOException;

public final class SampleQueueMappingException extends IOException {
    public SampleQueueMappingException(String str) {
        super(je.y0("Unable to bind a sample queue to TrackGroup with mime type ", str, "."));
    }
}

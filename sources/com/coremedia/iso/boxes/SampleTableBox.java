package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractContainerBox;

public class SampleTableBox extends AbstractContainerBox {
    public static final String TYPE = "stbl";
    private SampleToChunkBox sampleToChunkBox;

    public SampleTableBox() {
        super(TYPE);
    }

    public ChunkOffsetBox getChunkOffsetBox() {
        for (a aVar : getBoxes()) {
            if (aVar instanceof ChunkOffsetBox) {
                return (ChunkOffsetBox) aVar;
            }
        }
        return null;
    }

    public CompositionTimeToSample getCompositionTimeToSample() {
        for (a aVar : getBoxes()) {
            if (aVar instanceof CompositionTimeToSample) {
                return (CompositionTimeToSample) aVar;
            }
        }
        return null;
    }

    public SampleDependencyTypeBox getSampleDependencyTypeBox() {
        for (a aVar : getBoxes()) {
            if (aVar instanceof SampleDependencyTypeBox) {
                return (SampleDependencyTypeBox) aVar;
            }
        }
        return null;
    }

    public SampleDescriptionBox getSampleDescriptionBox() {
        for (a aVar : getBoxes()) {
            if (aVar instanceof SampleDescriptionBox) {
                return (SampleDescriptionBox) aVar;
            }
        }
        return null;
    }

    public SampleSizeBox getSampleSizeBox() {
        for (a aVar : getBoxes()) {
            if (aVar instanceof SampleSizeBox) {
                return (SampleSizeBox) aVar;
            }
        }
        return null;
    }

    public SampleToChunkBox getSampleToChunkBox() {
        SampleToChunkBox sampleToChunkBox2 = this.sampleToChunkBox;
        if (sampleToChunkBox2 != null) {
            return sampleToChunkBox2;
        }
        for (a aVar : getBoxes()) {
            if (aVar instanceof SampleToChunkBox) {
                SampleToChunkBox sampleToChunkBox3 = (SampleToChunkBox) aVar;
                this.sampleToChunkBox = sampleToChunkBox3;
                return sampleToChunkBox3;
            }
        }
        return null;
    }

    public SyncSampleBox getSyncSampleBox() {
        for (a aVar : getBoxes()) {
            if (aVar instanceof SyncSampleBox) {
                return (SyncSampleBox) aVar;
            }
        }
        return null;
    }

    public TimeToSampleBox getTimeToSampleBox() {
        for (a aVar : getBoxes()) {
            if (aVar instanceof TimeToSampleBox) {
                return (TimeToSampleBox) aVar;
            }
        }
        return null;
    }
}

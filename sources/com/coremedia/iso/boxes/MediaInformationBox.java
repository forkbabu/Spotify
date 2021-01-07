package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractContainerBox;

public class MediaInformationBox extends AbstractContainerBox {
    public static final String TYPE = "minf";

    public MediaInformationBox() {
        super(TYPE);
    }

    public AbstractMediaHeaderBox getMediaHeaderBox() {
        for (a aVar : getBoxes()) {
            if (aVar instanceof AbstractMediaHeaderBox) {
                return (AbstractMediaHeaderBox) aVar;
            }
        }
        return null;
    }

    public SampleTableBox getSampleTableBox() {
        for (a aVar : getBoxes()) {
            if (aVar instanceof SampleTableBox) {
                return (SampleTableBox) aVar;
            }
        }
        return null;
    }
}

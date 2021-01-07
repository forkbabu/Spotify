package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractContainerBox;

public class MediaBox extends AbstractContainerBox {
    public static final String TYPE = "mdia";

    public MediaBox() {
        super(TYPE);
    }

    public HandlerBox getHandlerBox() {
        for (a aVar : getBoxes()) {
            if (aVar instanceof HandlerBox) {
                return (HandlerBox) aVar;
            }
        }
        return null;
    }

    public MediaHeaderBox getMediaHeaderBox() {
        for (a aVar : getBoxes()) {
            if (aVar instanceof MediaHeaderBox) {
                return (MediaHeaderBox) aVar;
            }
        }
        return null;
    }

    public MediaInformationBox getMediaInformationBox() {
        for (a aVar : getBoxes()) {
            if (aVar instanceof MediaInformationBox) {
                return (MediaInformationBox) aVar;
            }
        }
        return null;
    }
}

package com.coremedia.iso.boxes.fragment;

import com.coremedia.iso.boxes.a;
import com.googlecode.mp4parser.AbstractContainerBox;

public class TrackFragmentBox extends AbstractContainerBox {
    public static final String TYPE = "traf";

    public TrackFragmentBox() {
        super(TYPE);
    }

    public TrackFragmentHeaderBox getTrackFragmentHeaderBox() {
        for (a aVar : getBoxes()) {
            if (aVar instanceof TrackFragmentHeaderBox) {
                return (TrackFragmentHeaderBox) aVar;
            }
        }
        return null;
    }
}

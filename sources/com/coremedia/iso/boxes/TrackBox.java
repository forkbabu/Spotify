package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractContainerBox;
import java.util.List;

public class TrackBox extends AbstractContainerBox {
    public static final String TYPE = "trak";
    private SampleTableBox sampleTableBox;

    public TrackBox() {
        super(TYPE);
    }

    public MediaBox getMediaBox() {
        for (a aVar : getBoxes()) {
            if (aVar instanceof MediaBox) {
                return (MediaBox) aVar;
            }
        }
        return null;
    }

    public SampleTableBox getSampleTableBox() {
        MediaInformationBox mediaInformationBox;
        SampleTableBox sampleTableBox2 = this.sampleTableBox;
        if (sampleTableBox2 != null) {
            return sampleTableBox2;
        }
        MediaBox mediaBox = getMediaBox();
        if (mediaBox == null || (mediaInformationBox = mediaBox.getMediaInformationBox()) == null) {
            return null;
        }
        SampleTableBox sampleTableBox3 = mediaInformationBox.getSampleTableBox();
        this.sampleTableBox = sampleTableBox3;
        return sampleTableBox3;
    }

    public TrackHeaderBox getTrackHeaderBox() {
        for (a aVar : getBoxes()) {
            if (aVar instanceof TrackHeaderBox) {
                return (TrackHeaderBox) aVar;
            }
        }
        return null;
    }

    @Override // com.googlecode.mp4parser.BasicContainer
    public void setBoxes(List<a> list) {
        super.setBoxes(list);
        this.sampleTableBox = null;
    }
}

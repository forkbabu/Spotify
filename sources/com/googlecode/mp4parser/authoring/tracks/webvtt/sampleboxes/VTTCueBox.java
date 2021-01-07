package com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes;

import com.mp4parser.streaming.WriteOnlyBox;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public class VTTCueBox extends WriteOnlyBox {
    CueIDBox cueIDBox;
    CuePayloadBox cuePayloadBox;
    CueSettingsBox cueSettingsBox;
    CueSourceIDBox cueSourceIDBox;
    CueTimeBox cueTimeBox;

    public VTTCueBox() {
        super("vtcc");
    }

    @Override // com.mp4parser.streaming.WriteOnlyBox, com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putInt((int) getSize());
        allocate.put(ne.b(getType()));
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        CueSourceIDBox cueSourceIDBox2 = this.cueSourceIDBox;
        if (cueSourceIDBox2 != null) {
            cueSourceIDBox2.getBox(writableByteChannel);
        }
        CueIDBox cueIDBox2 = this.cueIDBox;
        if (cueIDBox2 != null) {
            cueIDBox2.getBox(writableByteChannel);
        }
        CueTimeBox cueTimeBox2 = this.cueTimeBox;
        if (cueTimeBox2 != null) {
            cueTimeBox2.getBox(writableByteChannel);
        }
        CueSettingsBox cueSettingsBox2 = this.cueSettingsBox;
        if (cueSettingsBox2 != null) {
            cueSettingsBox2.getBox(writableByteChannel);
        }
        CuePayloadBox cuePayloadBox2 = this.cuePayloadBox;
        if (cuePayloadBox2 != null) {
            cuePayloadBox2.getBox(writableByteChannel);
        }
    }

    public CueIDBox getCueIDBox() {
        return this.cueIDBox;
    }

    public CuePayloadBox getCuePayloadBox() {
        return this.cuePayloadBox;
    }

    public CueSettingsBox getCueSettingsBox() {
        return this.cueSettingsBox;
    }

    public CueSourceIDBox getCueSourceIDBox() {
        return this.cueSourceIDBox;
    }

    public CueTimeBox getCueTimeBox() {
        return this.cueTimeBox;
    }

    @Override // com.mp4parser.streaming.WriteOnlyBox, com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        CueSourceIDBox cueSourceIDBox2 = this.cueSourceIDBox;
        long j = 0;
        long size = (cueSourceIDBox2 != null ? cueSourceIDBox2.getSize() : 0) + 8;
        CueIDBox cueIDBox2 = this.cueIDBox;
        long size2 = size + (cueIDBox2 != null ? cueIDBox2.getSize() : 0);
        CueTimeBox cueTimeBox2 = this.cueTimeBox;
        long size3 = size2 + (cueTimeBox2 != null ? cueTimeBox2.getSize() : 0);
        CueSettingsBox cueSettingsBox2 = this.cueSettingsBox;
        long size4 = size3 + (cueSettingsBox2 != null ? cueSettingsBox2.getSize() : 0);
        CuePayloadBox cuePayloadBox2 = this.cuePayloadBox;
        if (cuePayloadBox2 != null) {
            j = cuePayloadBox2.getSize();
        }
        return size4 + j;
    }

    public void setCueIDBox(CueIDBox cueIDBox2) {
        this.cueIDBox = cueIDBox2;
    }

    public void setCuePayloadBox(CuePayloadBox cuePayloadBox2) {
        this.cuePayloadBox = cuePayloadBox2;
    }

    public void setCueSettingsBox(CueSettingsBox cueSettingsBox2) {
        this.cueSettingsBox = cueSettingsBox2;
    }

    public void setCueSourceIDBox(CueSourceIDBox cueSourceIDBox2) {
        this.cueSourceIDBox = cueSourceIDBox2;
    }

    public void setCueTimeBox(CueTimeBox cueTimeBox2) {
        this.cueTimeBox = cueTimeBox2;
    }
}

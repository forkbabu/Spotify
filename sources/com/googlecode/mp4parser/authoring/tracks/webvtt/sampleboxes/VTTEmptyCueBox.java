package com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes;

import com.mp4parser.streaming.WriteOnlyBox;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public class VTTEmptyCueBox extends WriteOnlyBox {
    public VTTEmptyCueBox() {
        super("vtte");
    }

    @Override // com.mp4parser.streaming.WriteOnlyBox, com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putInt((int) getSize());
        allocate.put(ne.b(getType()));
        writableByteChannel.write((ByteBuffer) allocate.rewind());
    }

    @Override // com.mp4parser.streaming.WriteOnlyBox, com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        return 8;
    }
}

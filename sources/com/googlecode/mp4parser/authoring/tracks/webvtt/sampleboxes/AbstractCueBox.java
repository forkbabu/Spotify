package com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes;

import com.mp4parser.streaming.WriteOnlyBox;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public abstract class AbstractCueBox extends WriteOnlyBox {
    String content = "";

    public AbstractCueBox(String str) {
        super(str);
    }

    @Override // com.mp4parser.streaming.WriteOnlyBox, com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) {
        ByteBuffer allocate = ByteBuffer.allocate(rw.n(getSize()));
        allocate.putInt((int) getSize());
        allocate.put(ne.b(getType()));
        allocate.put(h7.b(this.content));
        writableByteChannel.write((ByteBuffer) allocate.rewind());
    }

    public String getContent() {
        return this.content;
    }

    @Override // com.mp4parser.streaming.WriteOnlyBox, com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        return (long) (h7.q(this.content) + 8);
    }

    public void setContent(String str) {
        this.content = str;
    }
}

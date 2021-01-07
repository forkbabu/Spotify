package com.mp4parser.iso14496.part30;

import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import com.googlecode.mp4parser.a;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public class XMLSubtitleSampleEntry extends AbstractSampleEntry {
    public static final String TYPE = "stpp";
    private String auxiliaryMimeTypes = "";
    private String namespace = "";
    private String schemaLocation = "";

    public XMLSubtitleSampleEntry() {
        super(TYPE);
    }

    public String getAuxiliaryMimeTypes() {
        return this.auxiliaryMimeTypes;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(getHeader());
        ByteBuffer allocate = ByteBuffer.allocate(this.auxiliaryMimeTypes.length() + this.schemaLocation.length() + this.namespace.length() + 8 + 3);
        allocate.position(6);
        pe.e(allocate, this.dataReferenceIndex);
        pe.j(allocate, this.namespace);
        pe.j(allocate, this.schemaLocation);
        pe.j(allocate, this.auxiliaryMimeTypes);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        writeContainer(writableByteChannel);
    }

    public String getNamespace() {
        return this.namespace;
    }

    public String getSchemaLocation() {
        return this.schemaLocation;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        int i = 8;
        long containerSize = getContainerSize() + ((long) (this.auxiliaryMimeTypes.length() + this.schemaLocation.length() + this.namespace.length() + 8 + 3));
        if (this.largeBox || 8 + containerSize >= 4294967296L) {
            i = 16;
        }
        return containerSize + ((long) i);
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public void parse(a aVar, ByteBuffer byteBuffer, long j, le leVar) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        aVar.read((ByteBuffer) allocate.rewind());
        allocate.position(6);
        this.dataReferenceIndex = h7.l(allocate);
        long Z = aVar.Z();
        ByteBuffer allocate2 = ByteBuffer.allocate(1024);
        aVar.read((ByteBuffer) allocate2.rewind());
        String j2 = h7.j((ByteBuffer) allocate2.rewind());
        this.namespace = j2;
        aVar.position(((long) j2.length()) + Z + 1);
        aVar.read((ByteBuffer) allocate2.rewind());
        this.schemaLocation = h7.j((ByteBuffer) allocate2.rewind());
        aVar.position(((long) this.namespace.length()) + Z + ((long) this.schemaLocation.length()) + 2);
        aVar.read((ByteBuffer) allocate2.rewind());
        this.auxiliaryMimeTypes = h7.j((ByteBuffer) allocate2.rewind());
        aVar.position(Z + ((long) this.namespace.length()) + ((long) this.schemaLocation.length()) + ((long) this.auxiliaryMimeTypes.length()) + 3);
        initContainer(aVar, j - ((long) ((this.auxiliaryMimeTypes.length() + (this.schemaLocation.length() + (this.namespace.length() + byteBuffer.remaining()))) + 3)), leVar);
    }

    public void setAuxiliaryMimeTypes(String str) {
        this.auxiliaryMimeTypes = str;
    }

    public void setNamespace(String str) {
        this.namespace = str;
    }

    public void setSchemaLocation(String str) {
        this.schemaLocation = str;
    }
}

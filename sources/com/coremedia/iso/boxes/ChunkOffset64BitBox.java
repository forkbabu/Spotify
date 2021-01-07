package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.d;
import java.nio.ByteBuffer;
import org.mp4parser.aspectj.lang.a;

public class ChunkOffset64BitBox extends ChunkOffsetBox {
    public static final String TYPE = "co64";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private long[] chunkOffsets;

    static {
        ajc$preClinit();
    }

    public ChunkOffset64BitBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("ChunkOffset64BitBox.java", ChunkOffset64BitBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getChunkOffsets", "com.coremedia.iso.boxes.ChunkOffset64BitBox", "", "", "", "[J"), 23);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "setChunkOffsets", "com.coremedia.iso.boxes.ChunkOffset64BitBox", "[J", "chunkOffsets", "", "void"), 28);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int n = rw.n(h7.n(byteBuffer));
        this.chunkOffsets = new long[n];
        for (int i = 0; i < n; i++) {
            this.chunkOffsets[i] = h7.p(byteBuffer);
        }
    }

    @Override // com.coremedia.iso.boxes.ChunkOffsetBox
    public long[] getChunkOffsets() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.chunkOffsets;
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt((int) ((long) this.chunkOffsets.length));
        for (long j : this.chunkOffsets) {
            byteBuffer.putLong(j);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (long) ((this.chunkOffsets.length * 8) + 8);
    }

    @Override // com.coremedia.iso.boxes.ChunkOffsetBox
    public void setChunkOffsets(long[] jArr) {
        d.a().b(bpf.c(ajc$tjp_1, this, this, jArr));
        this.chunkOffsets = jArr;
    }
}

package com.googlecode.mp4parser;

import com.coremedia.iso.boxes.UserBox;
import com.coremedia.iso.boxes.a;
import com.coremedia.iso.boxes.b;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public abstract class AbstractBox implements a {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static j50 LOG = j50.a(AbstractBox.class);
    private ByteBuffer content;
    a dataSource;
    private ByteBuffer deadBytes = null;
    boolean isParsed;
    long offset;
    private b parent;
    protected String type;
    private byte[] userType;

    protected AbstractBox(String str) {
        this.type = str;
        this.isParsed = true;
    }

    private void getHeader(ByteBuffer byteBuffer) {
        if (isSmallBox()) {
            byteBuffer.putInt((int) getSize());
            byteBuffer.put(ne.b(getType()));
        } else {
            byteBuffer.putInt((int) 1);
            byteBuffer.put(ne.b(getType()));
            byteBuffer.putLong(getSize());
        }
        if (UserBox.TYPE.equals(getType())) {
            byteBuffer.put(getUserType());
        }
    }

    private boolean isSmallBox() {
        int i = UserBox.TYPE.equals(getType()) ? 24 : 8;
        if (!this.isParsed) {
            return ((long) (this.content.limit() + i)) < 4294967296L;
        }
        long contentSize = getContentSize();
        ByteBuffer byteBuffer = this.deadBytes;
        return (contentSize + ((long) (byteBuffer != null ? byteBuffer.limit() : 0))) + ((long) i) < 4294967296L;
    }

    private boolean verify(ByteBuffer byteBuffer) {
        long contentSize = getContentSize();
        ByteBuffer byteBuffer2 = this.deadBytes;
        ByteBuffer allocate = ByteBuffer.allocate(rw.n(contentSize + ((long) (byteBuffer2 != null ? byteBuffer2.limit() : 0))));
        getContent(allocate);
        ByteBuffer byteBuffer3 = this.deadBytes;
        if (byteBuffer3 != null) {
            byteBuffer3.rewind();
            while (this.deadBytes.remaining() > 0) {
                allocate.put(this.deadBytes);
            }
        }
        byteBuffer.rewind();
        allocate.rewind();
        if (byteBuffer.remaining() != allocate.remaining()) {
            System.err.print(String.valueOf(getType()) + ": remaining differs " + byteBuffer.remaining() + " vs. " + allocate.remaining());
            LOG.c(String.valueOf(getType()) + ": remaining differs " + byteBuffer.remaining() + " vs. " + allocate.remaining());
            return false;
        }
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 1;
        int limit2 = allocate.limit() - 1;
        while (limit >= position) {
            byte b = byteBuffer.get(limit);
            byte b2 = allocate.get(limit2);
            if (b != b2) {
                LOG.c(String.format("%s: buffers differ at %d: %2X/%2X", getType(), Integer.valueOf(limit), Byte.valueOf(b), Byte.valueOf(b2)));
                byte[] bArr = new byte[byteBuffer.remaining()];
                byte[] bArr2 = new byte[allocate.remaining()];
                byteBuffer.get(bArr);
                allocate.get(bArr2);
                System.err.println("original      : " + me.b(bArr, 4));
                System.err.println("reconstructed : " + me.b(bArr2, 4));
                return false;
            }
            limit--;
            limit2--;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract void _parseDetails(ByteBuffer byteBuffer);

    @Override // com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) {
        if (this.isParsed) {
            ByteBuffer allocate = ByteBuffer.allocate(rw.n(getSize()));
            getHeader(allocate);
            getContent(allocate);
            ByteBuffer byteBuffer = this.deadBytes;
            if (byteBuffer != null) {
                byteBuffer.rewind();
                while (this.deadBytes.remaining() > 0) {
                    allocate.put(this.deadBytes);
                }
            }
            writableByteChannel.write((ByteBuffer) allocate.rewind());
            return;
        }
        int i = 16;
        int i2 = isSmallBox() ? 8 : 16;
        if (!UserBox.TYPE.equals(getType())) {
            i = 0;
        }
        ByteBuffer allocate2 = ByteBuffer.allocate(i2 + i);
        getHeader(allocate2);
        writableByteChannel.write((ByteBuffer) allocate2.rewind());
        writableByteChannel.write((ByteBuffer) this.content.position(0));
    }

    /* access modifiers changed from: protected */
    public abstract void getContent(ByteBuffer byteBuffer);

    /* access modifiers changed from: protected */
    public abstract long getContentSize();

    public long getOffset() {
        return this.offset;
    }

    @Override // com.coremedia.iso.boxes.a
    public b getParent() {
        return this.parent;
    }

    public String getPath() {
        return l50.a(this);
    }

    @Override // com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        long j;
        int i = 0;
        if (this.isParsed) {
            j = getContentSize();
        } else {
            ByteBuffer byteBuffer = this.content;
            j = (long) (byteBuffer != null ? byteBuffer.limit() : 0);
        }
        long j2 = j + ((long) ((j >= 4294967288L ? 8 : 0) + 8 + (UserBox.TYPE.equals(getType()) ? 16 : 0)));
        ByteBuffer byteBuffer2 = this.deadBytes;
        if (byteBuffer2 != null) {
            i = byteBuffer2.limit();
        }
        return j2 + ((long) i);
    }

    @Override // com.coremedia.iso.boxes.a
    public String getType() {
        return this.type;
    }

    public byte[] getUserType() {
        return this.userType;
    }

    public boolean isParsed() {
        return this.isParsed;
    }

    @Override // com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public void parse(a aVar, ByteBuffer byteBuffer, long j, le leVar) {
        this.offset = aVar.Z() - ((long) byteBuffer.remaining());
        this.dataSource = aVar;
        this.content = ByteBuffer.allocate(rw.n(j));
        while (this.content.remaining() > 0) {
            aVar.read(this.content);
        }
        this.content.position(0);
        this.isParsed = false;
    }

    public final synchronized void parseDetails() {
        j50 j50 = LOG;
        j50.b("parsing details of " + getType());
        ByteBuffer byteBuffer = this.content;
        if (byteBuffer != null) {
            this.isParsed = true;
            byteBuffer.rewind();
            _parseDetails(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.deadBytes = byteBuffer.slice();
            }
            this.content = null;
        }
    }

    @Override // com.coremedia.iso.boxes.a
    public void setParent(b bVar) {
        this.parent = bVar;
    }

    protected AbstractBox(String str, byte[] bArr) {
        this.type = str;
        this.userType = bArr;
        this.isParsed = true;
    }
}

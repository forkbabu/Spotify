package com.googlecode.mp4parser.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.d;
import com.mp4parser.iso23001.part7.a;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.mp4parser.aspectj.lang.a;

public abstract class AbstractSampleEncryptionBox extends AbstractFullBox {
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_3 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_4 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_5 = null;
    protected int algorithmId = -1;
    List<com.mp4parser.iso23001.part7.a> entries = Collections.emptyList();
    protected int ivSize = -1;
    protected byte[] kid = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    static {
        ajc$preClinit();
    }

    protected AbstractSampleEncryptionBox(String str) {
        super(str);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("AbstractSampleEncryptionBox.java", AbstractSampleEncryptionBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getOffsetToFirstIV", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "int"), 29);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "getEntries", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "java.util.List"), 89);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "setEntries", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "java.util.List", "entries", "", "void"), 93);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "equals", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "java.lang.Object", "o", "", "boolean"), 173);
        ajc$tjp_4 = bpf.g("method-execution", bpf.f("1", "hashCode", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "int"), 200);
        ajc$tjp_5 = bpf.g("method-execution", bpf.f("1", "getEntrySizes", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "java.util.List"), 208);
    }

    private int getNonEmptyEntriesNum() {
        int i = 0;
        for (com.mp4parser.iso23001.part7.a aVar : this.entries) {
            if (aVar.b() > 0) {
                i++;
            }
        }
        return i;
    }

    private List<com.mp4parser.iso23001.part7.a> parseEntries(ByteBuffer byteBuffer, long j, int i) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            long j2 = j - 1;
            if (j <= 0) {
                return arrayList;
            }
            try {
                com.mp4parser.iso23001.part7.a aVar = new com.mp4parser.iso23001.part7.a();
                byte[] bArr = new byte[i];
                aVar.a = bArr;
                byteBuffer.get(bArr);
                if ((getFlags() & 2) > 0) {
                    aVar.b = new a.j[h7.l(byteBuffer)];
                    int i2 = 0;
                    while (true) {
                        a.j[] jVarArr = aVar.b;
                        if (i2 >= jVarArr.length) {
                            break;
                        }
                        jVarArr[i2] = aVar.a(h7.l(byteBuffer), h7.n(byteBuffer));
                        i2++;
                    }
                }
                arrayList.add(aVar);
                j = j2;
            } catch (BufferUnderflowException unused) {
                return null;
            }
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if ((getFlags() & 1) > 0) {
            this.algorithmId = h7.m(byteBuffer);
            int i = byteBuffer.get();
            if (i < 0) {
                i += 256;
            }
            this.ivSize = i;
            byte[] bArr = new byte[16];
            this.kid = bArr;
            byteBuffer.get(bArr);
        }
        long n = h7.n(byteBuffer);
        ByteBuffer duplicate = byteBuffer.duplicate();
        ByteBuffer duplicate2 = byteBuffer.duplicate();
        List<com.mp4parser.iso23001.part7.a> parseEntries = parseEntries(duplicate, n, 8);
        this.entries = parseEntries;
        if (parseEntries == null) {
            this.entries = parseEntries(duplicate2, n, 16);
            byteBuffer.position((byteBuffer.remaining() + byteBuffer.position()) - duplicate2.remaining());
        } else {
            byteBuffer.position((byteBuffer.remaining() + byteBuffer.position()) - duplicate.remaining());
        }
        if (this.entries == null) {
            throw new RuntimeException("Cannot parse SampleEncryptionBox");
        }
    }

    public boolean equals(Object obj) {
        d.a().b(bpf.c(ajc$tjp_3, this, this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractSampleEncryptionBox abstractSampleEncryptionBox = (AbstractSampleEncryptionBox) obj;
        if (this.algorithmId != abstractSampleEncryptionBox.algorithmId || this.ivSize != abstractSampleEncryptionBox.ivSize) {
            return false;
        }
        List<com.mp4parser.iso23001.part7.a> list = this.entries;
        if (list == null ? abstractSampleEncryptionBox.entries == null : list.equals(abstractSampleEncryptionBox.entries)) {
            return Arrays.equals(this.kid, abstractSampleEncryptionBox.kid);
        }
        return false;
    }

    @Override // com.googlecode.mp4parser.AbstractBox, com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) {
        super.getBox(writableByteChannel);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if (isOverrideTrackEncryptionBoxParameters()) {
            pe.f(byteBuffer, this.algorithmId);
            byteBuffer.put((byte) (this.ivSize & BitmapRenderer.ALPHA_VISIBLE));
            byteBuffer.put(this.kid);
        }
        byteBuffer.putInt((int) ((long) getNonEmptyEntriesNum()));
        for (com.mp4parser.iso23001.part7.a aVar : this.entries) {
            if (aVar.b() > 0) {
                byte[] bArr = aVar.a;
                if (bArr.length == 8 || bArr.length == 16) {
                    byteBuffer.put(bArr);
                    if (isSubSampleEncryption()) {
                        pe.e(byteBuffer, aVar.b.length);
                        a.j[] jVarArr = aVar.b;
                        for (a.j jVar : jVarArr) {
                            pe.e(byteBuffer, jVar.clear());
                            byteBuffer.putInt((int) jVar.a());
                        }
                    }
                } else {
                    throw new RuntimeException("IV must be either 8 or 16 bytes");
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        long length = (isOverrideTrackEncryptionBoxParameters() ? 8 + ((long) this.kid.length) : 4) + 4;
        for (com.mp4parser.iso23001.part7.a aVar : this.entries) {
            length += (long) aVar.b();
        }
        return length;
    }

    public List<com.mp4parser.iso23001.part7.a> getEntries() {
        d.a().b(bpf.b(ajc$tjp_1, this, this));
        return this.entries;
    }

    public List<Short> getEntrySizes() {
        d.a().b(bpf.b(ajc$tjp_5, this, this));
        ArrayList arrayList = new ArrayList(this.entries.size());
        for (com.mp4parser.iso23001.part7.a aVar : this.entries) {
            short length = (short) aVar.a.length;
            if (isSubSampleEncryption()) {
                length = (short) ((aVar.b.length * 6) + ((short) (length + 2)));
            }
            arrayList.add(Short.valueOf(length));
        }
        return arrayList;
    }

    public int getOffsetToFirstIV() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return (getSize() > 4294967296L ? 16 : 8) + (isOverrideTrackEncryptionBoxParameters() ? this.kid.length + 4 : 0) + 4;
    }

    public int hashCode() {
        d.a().b(bpf.b(ajc$tjp_4, this, this));
        int i = ((this.algorithmId * 31) + this.ivSize) * 31;
        byte[] bArr = this.kid;
        int i2 = 0;
        int hashCode = (i + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31;
        List<com.mp4parser.iso23001.part7.a> list = this.entries;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    /* access modifiers changed from: protected */
    public boolean isOverrideTrackEncryptionBoxParameters() {
        return (getFlags() & 1) > 0;
    }

    public boolean isSubSampleEncryption() {
        return (getFlags() & 2) > 0;
    }

    public void setEntries(List<com.mp4parser.iso23001.part7.a> list) {
        d.a().b(bpf.c(ajc$tjp_2, this, this, list));
        this.entries = list;
    }

    public void setSubSampleEncryption(boolean z) {
        if (z) {
            setFlags(getFlags() | 2);
        } else {
            setFlags(getFlags() & 16777213);
        }
    }
}

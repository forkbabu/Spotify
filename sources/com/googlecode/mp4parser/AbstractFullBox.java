package com.googlecode.mp4parser;

import com.coremedia.iso.boxes.FullBox;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.nio.ByteBuffer;
import org.mp4parser.aspectj.lang.a;

public abstract class AbstractFullBox extends AbstractBox implements FullBox {
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private int flags;
    private int version;

    static {
        ajc$preClinit();
    }

    protected AbstractFullBox(String str) {
        super(str);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("AbstractFullBox.java", AbstractFullBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "setVersion", "com.googlecode.mp4parser.AbstractFullBox", "int", "version", "", "void"), 51);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "setFlags", "com.googlecode.mp4parser.AbstractFullBox", "int", "flags", "", "void"), 64);
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public int getFlags() {
        if (!this.isParsed) {
            parseDetails();
        }
        return this.flags;
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public int getVersion() {
        if (!this.isParsed) {
            parseDetails();
        }
        return this.version;
    }

    /* access modifiers changed from: protected */
    public final long parseVersionAndFlags(ByteBuffer byteBuffer) {
        int i = byteBuffer.get();
        if (i < 0) {
            i += 256;
        }
        this.version = i;
        this.flags = h7.m(byteBuffer);
        return 4;
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public void setFlags(int i) {
        d.a().b(bpf.c(ajc$tjp_1, this, this, new Integer(i)));
        this.flags = i;
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public void setVersion(int i) {
        d.a().b(bpf.c(ajc$tjp_0, this, this, new Integer(i)));
        this.version = i;
    }

    /* access modifiers changed from: protected */
    public final void writeVersionAndFlags(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) (this.version & BitmapRenderer.ALPHA_VISIBLE));
        pe.f(byteBuffer, this.flags);
    }

    protected AbstractFullBox(String str, byte[] bArr) {
        super(str, bArr);
    }
}

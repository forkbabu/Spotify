package com.googlecode.mp4parser.boxes.apple;

import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.d;
import java.nio.ByteBuffer;
import org.mp4parser.aspectj.lang.a;

public class BaseMediaInfoAtom extends AbstractFullBox {
    public static final String TYPE = "gmin";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_10 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_11 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_12 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_3 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_4 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_5 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_6 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_7 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_8 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_9 = null;
    short balance;
    short graphicsMode = 64;
    int opColorB = 32768;
    int opColorG = 32768;
    int opColorR = 32768;
    short reserved;

    static {
        ajc$preClinit();
    }

    public BaseMediaInfoAtom() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("BaseMediaInfoAtom.java", BaseMediaInfoAtom.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getGraphicsMode", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "short"), 54);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "setGraphicsMode", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "short", "graphicsMode", "", "void"), 58);
        ajc$tjp_10 = bpf.g("method-execution", bpf.f("1", "getReserved", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "short"), 94);
        ajc$tjp_11 = bpf.g("method-execution", bpf.f("1", "setReserved", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "short", "reserved", "", "void"), 98);
        ajc$tjp_12 = bpf.g("method-execution", bpf.f("1", "toString", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "java.lang.String"), 103);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "getOpColorR", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "int"), 62);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "setOpColorR", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "int", "opColorR", "", "void"), 66);
        ajc$tjp_4 = bpf.g("method-execution", bpf.f("1", "getOpColorG", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "int"), 70);
        ajc$tjp_5 = bpf.g("method-execution", bpf.f("1", "setOpColorG", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "int", "opColorG", "", "void"), 74);
        ajc$tjp_6 = bpf.g("method-execution", bpf.f("1", "getOpColorB", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "int"), 78);
        ajc$tjp_7 = bpf.g("method-execution", bpf.f("1", "setOpColorB", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "int", "opColorB", "", "void"), 82);
        ajc$tjp_8 = bpf.g("method-execution", bpf.f("1", "getBalance", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "short"), 86);
        ajc$tjp_9 = bpf.g("method-execution", bpf.f("1", "setBalance", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "short", "balance", "", "void"), 90);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.graphicsMode = byteBuffer.getShort();
        this.opColorR = h7.l(byteBuffer);
        this.opColorG = h7.l(byteBuffer);
        this.opColorB = h7.l(byteBuffer);
        this.balance = byteBuffer.getShort();
        this.reserved = byteBuffer.getShort();
    }

    public short getBalance() {
        d.a().b(bpf.b(ajc$tjp_8, this, this));
        return this.balance;
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.putShort(this.graphicsMode);
        pe.e(byteBuffer, this.opColorR);
        pe.e(byteBuffer, this.opColorG);
        pe.e(byteBuffer, this.opColorB);
        byteBuffer.putShort(this.balance);
        byteBuffer.putShort(this.reserved);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 16;
    }

    public short getGraphicsMode() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.graphicsMode;
    }

    public int getOpColorB() {
        d.a().b(bpf.b(ajc$tjp_6, this, this));
        return this.opColorB;
    }

    public int getOpColorG() {
        d.a().b(bpf.b(ajc$tjp_4, this, this));
        return this.opColorG;
    }

    public int getOpColorR() {
        d.a().b(bpf.b(ajc$tjp_2, this, this));
        return this.opColorR;
    }

    public short getReserved() {
        d.a().b(bpf.b(ajc$tjp_10, this, this));
        return this.reserved;
    }

    public void setBalance(short s) {
        d.a().b(bpf.c(ajc$tjp_9, this, this, new Short(s)));
        this.balance = s;
    }

    public void setGraphicsMode(short s) {
        d.a().b(bpf.c(ajc$tjp_1, this, this, new Short(s)));
        this.graphicsMode = s;
    }

    public void setOpColorB(int i) {
        d.a().b(bpf.c(ajc$tjp_7, this, this, new Integer(i)));
        this.opColorB = i;
    }

    public void setOpColorG(int i) {
        d.a().b(bpf.c(ajc$tjp_5, this, this, new Integer(i)));
        this.opColorG = i;
    }

    public void setOpColorR(int i) {
        d.a().b(bpf.c(ajc$tjp_3, this, this, new Integer(i)));
        this.opColorR = i;
    }

    public void setReserved(short s) {
        d.a().b(bpf.c(ajc$tjp_11, this, this, new Short(s)));
        this.reserved = s;
    }

    public String toString() {
        StringBuilder c1 = je.c1(bpf.b(ajc$tjp_12, this, this), "BaseMediaInfoAtom{graphicsMode=");
        c1.append((int) this.graphicsMode);
        c1.append(", opColorR=");
        c1.append(this.opColorR);
        c1.append(", opColorG=");
        c1.append(this.opColorG);
        c1.append(", opColorB=");
        c1.append(this.opColorB);
        c1.append(", balance=");
        c1.append((int) this.balance);
        c1.append(", reserved=");
        return je.A0(c1, this.reserved, '}');
    }
}

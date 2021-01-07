package com.googlecode.mp4parser.boxes;

import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.d;
import java.nio.ByteBuffer;
import org.mp4parser.aspectj.lang.a;

public class AC3SpecificBox extends AbstractBox {
    public static final String TYPE = "dac3";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_10 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_11 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_12 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_13 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_14 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_3 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_4 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_5 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_6 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_7 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_8 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_9 = null;
    int acmod;
    int bitRateCode;
    int bsid;
    int bsmod;
    int fscod;
    int lfeon;
    int reserved;

    static {
        ajc$preClinit();
    }

    public AC3SpecificBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("AC3SpecificBox.java", AC3SpecificBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getFscod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"), 55);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "setFscod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "fscod", "", "void"), 59);
        ajc$tjp_10 = bpf.g("method-execution", bpf.f("1", "getBitRateCode", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"), 95);
        ajc$tjp_11 = bpf.g("method-execution", bpf.f("1", "setBitRateCode", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "bitRateCode", "", "void"), 99);
        ajc$tjp_12 = bpf.g("method-execution", bpf.f("1", "getReserved", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"), 103);
        ajc$tjp_13 = bpf.g("method-execution", bpf.f("1", "setReserved", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "reserved", "", "void"), 107);
        ajc$tjp_14 = bpf.g("method-execution", bpf.f("1", "toString", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "java.lang.String"), 112);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "getBsid", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"), 63);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "setBsid", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "bsid", "", "void"), 67);
        ajc$tjp_4 = bpf.g("method-execution", bpf.f("1", "getBsmod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"), 71);
        ajc$tjp_5 = bpf.g("method-execution", bpf.f("1", "setBsmod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "bsmod", "", "void"), 75);
        ajc$tjp_6 = bpf.g("method-execution", bpf.f("1", "getAcmod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"), 79);
        ajc$tjp_7 = bpf.g("method-execution", bpf.f("1", "setAcmod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "acmod", "", "void"), 83);
        ajc$tjp_8 = bpf.g("method-execution", bpf.f("1", "getLfeon", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"), 87);
        ajc$tjp_9 = bpf.g("method-execution", bpf.f("1", "setLfeon", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "lfeon", "", "void"), 91);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        h40 h40 = new h40(byteBuffer);
        this.fscod = h40.a(2);
        this.bsid = h40.a(5);
        this.bsmod = h40.a(3);
        this.acmod = h40.a(3);
        this.lfeon = h40.a(1);
        this.bitRateCode = h40.a(5);
        this.reserved = h40.a(5);
    }

    public int getAcmod() {
        d.a().b(bpf.b(ajc$tjp_6, this, this));
        return this.acmod;
    }

    public int getBitRateCode() {
        d.a().b(bpf.b(ajc$tjp_10, this, this));
        return this.bitRateCode;
    }

    public int getBsid() {
        d.a().b(bpf.b(ajc$tjp_2, this, this));
        return this.bsid;
    }

    public int getBsmod() {
        d.a().b(bpf.b(ajc$tjp_4, this, this));
        return this.bsmod;
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        i40 i40 = new i40(byteBuffer);
        i40.a(this.fscod, 2);
        i40.a(this.bsid, 5);
        i40.a(this.bsmod, 3);
        i40.a(this.acmod, 3);
        i40.a(this.lfeon, 1);
        i40.a(this.bitRateCode, 5);
        i40.a(this.reserved, 5);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 3;
    }

    public int getFscod() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.fscod;
    }

    public int getLfeon() {
        d.a().b(bpf.b(ajc$tjp_8, this, this));
        return this.lfeon;
    }

    public int getReserved() {
        d.a().b(bpf.b(ajc$tjp_12, this, this));
        return this.reserved;
    }

    public void setAcmod(int i) {
        d.a().b(bpf.c(ajc$tjp_7, this, this, new Integer(i)));
        this.acmod = i;
    }

    public void setBitRateCode(int i) {
        d.a().b(bpf.c(ajc$tjp_11, this, this, new Integer(i)));
        this.bitRateCode = i;
    }

    public void setBsid(int i) {
        d.a().b(bpf.c(ajc$tjp_3, this, this, new Integer(i)));
        this.bsid = i;
    }

    public void setBsmod(int i) {
        d.a().b(bpf.c(ajc$tjp_5, this, this, new Integer(i)));
        this.bsmod = i;
    }

    public void setFscod(int i) {
        d.a().b(bpf.c(ajc$tjp_1, this, this, new Integer(i)));
        this.fscod = i;
    }

    public void setLfeon(int i) {
        d.a().b(bpf.c(ajc$tjp_9, this, this, new Integer(i)));
        this.lfeon = i;
    }

    public void setReserved(int i) {
        d.a().b(bpf.c(ajc$tjp_13, this, this, new Integer(i)));
        this.reserved = i;
    }

    public String toString() {
        StringBuilder c1 = je.c1(bpf.b(ajc$tjp_14, this, this), "AC3SpecificBox{fscod=");
        c1.append(this.fscod);
        c1.append(", bsid=");
        c1.append(this.bsid);
        c1.append(", bsmod=");
        c1.append(this.bsmod);
        c1.append(", acmod=");
        c1.append(this.acmod);
        c1.append(", lfeon=");
        c1.append(this.lfeon);
        c1.append(", bitRateCode=");
        c1.append(this.bitRateCode);
        c1.append(", reserved=");
        return je.A0(c1, this.reserved, '}');
    }
}

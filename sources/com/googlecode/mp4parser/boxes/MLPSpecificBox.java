package com.googlecode.mp4parser.boxes;

import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.d;
import java.nio.ByteBuffer;
import org.mp4parser.aspectj.lang.a;

public class MLPSpecificBox extends AbstractBox {
    public static final String TYPE = "dmlp";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_3 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_4 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_5 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_6 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_7 = null;
    int format_info;
    int peak_data_rate;
    int reserved;
    int reserved2;

    static {
        ajc$preClinit();
    }

    public MLPSpecificBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("MLPSpecificBox.java", MLPSpecificBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getFormat_info", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "", "", "", "int"), 49);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "setFormat_info", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "int", "format_info", "", "void"), 53);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "getPeak_data_rate", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "", "", "", "int"), 57);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "setPeak_data_rate", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "int", "peak_data_rate", "", "void"), 61);
        ajc$tjp_4 = bpf.g("method-execution", bpf.f("1", "getReserved", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "", "", "", "int"), 65);
        ajc$tjp_5 = bpf.g("method-execution", bpf.f("1", "setReserved", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "int", "reserved", "", "void"), 69);
        ajc$tjp_6 = bpf.g("method-execution", bpf.f("1", "getReserved2", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "", "", "", "int"), 73);
        ajc$tjp_7 = bpf.g("method-execution", bpf.f("1", "setReserved2", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "int", "reserved2", "", "void"), 77);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        h40 h40 = new h40(byteBuffer);
        this.format_info = h40.a(32);
        this.peak_data_rate = h40.a(15);
        this.reserved = h40.a(1);
        this.reserved2 = h40.a(32);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        i40 i40 = new i40(byteBuffer);
        i40.a(this.format_info, 32);
        i40.a(this.peak_data_rate, 15);
        i40.a(this.reserved, 1);
        i40.a(this.reserved2, 32);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 10;
    }

    public int getFormat_info() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.format_info;
    }

    public int getPeak_data_rate() {
        d.a().b(bpf.b(ajc$tjp_2, this, this));
        return this.peak_data_rate;
    }

    public int getReserved() {
        d.a().b(bpf.b(ajc$tjp_4, this, this));
        return this.reserved;
    }

    public int getReserved2() {
        d.a().b(bpf.b(ajc$tjp_6, this, this));
        return this.reserved2;
    }

    public void setFormat_info(int i) {
        d.a().b(bpf.c(ajc$tjp_1, this, this, new Integer(i)));
        this.format_info = i;
    }

    public void setPeak_data_rate(int i) {
        d.a().b(bpf.c(ajc$tjp_3, this, this, new Integer(i)));
        this.peak_data_rate = i;
    }

    public void setReserved(int i) {
        d.a().b(bpf.c(ajc$tjp_5, this, this, new Integer(i)));
        this.reserved = i;
    }

    public void setReserved2(int i) {
        d.a().b(bpf.c(ajc$tjp_7, this, this, new Integer(i)));
        this.reserved2 = i;
    }
}

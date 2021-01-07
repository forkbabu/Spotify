package com.mp4parser.iso23009.part1;

import com.adjust.sdk.Constants;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.d;
import java.nio.ByteBuffer;
import org.mp4parser.aspectj.lang.a;

public class EventMessageBox extends AbstractFullBox {
    public static final String TYPE = "emsg";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_10 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_11 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_12 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_13 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_3 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_4 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_5 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_6 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_7 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_8 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_9 = null;
    long eventDuration;
    long id;
    byte[] messageData;
    long presentationTimeDelta;
    String schemeIdUri;
    long timescale;
    String value;

    static {
        ajc$preClinit();
    }

    public EventMessageBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("EventMessageBox.java", EventMessageBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getSchemeIdUri", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", "java.lang.String"), 59);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "setSchemeIdUri", "com.mp4parser.iso23009.part1.EventMessageBox", "java.lang.String", "schemeIdUri", "", "void"), 63);
        ajc$tjp_10 = bpf.g("method-execution", bpf.f("1", "getId", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", Constants.LONG), 99);
        ajc$tjp_11 = bpf.g("method-execution", bpf.f("1", "setId", "com.mp4parser.iso23009.part1.EventMessageBox", Constants.LONG, "id", "", "void"), 103);
        ajc$tjp_12 = bpf.g("method-execution", bpf.f("1", "getMessageData", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", "[B"), 107);
        ajc$tjp_13 = bpf.g("method-execution", bpf.f("1", "setMessageData", "com.mp4parser.iso23009.part1.EventMessageBox", "[B", "messageData", "", "void"), 111);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "getValue", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", "java.lang.String"), 67);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "setValue", "com.mp4parser.iso23009.part1.EventMessageBox", "java.lang.String", "value", "", "void"), 71);
        ajc$tjp_4 = bpf.g("method-execution", bpf.f("1", "getTimescale", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", Constants.LONG), 75);
        ajc$tjp_5 = bpf.g("method-execution", bpf.f("1", "setTimescale", "com.mp4parser.iso23009.part1.EventMessageBox", Constants.LONG, "timescale", "", "void"), 79);
        ajc$tjp_6 = bpf.g("method-execution", bpf.f("1", "getPresentationTimeDelta", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", Constants.LONG), 83);
        ajc$tjp_7 = bpf.g("method-execution", bpf.f("1", "setPresentationTimeDelta", "com.mp4parser.iso23009.part1.EventMessageBox", Constants.LONG, "presentationTimeDelta", "", "void"), 87);
        ajc$tjp_8 = bpf.g("method-execution", bpf.f("1", "getEventDuration", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", Constants.LONG), 91);
        ajc$tjp_9 = bpf.g("method-execution", bpf.f("1", "setEventDuration", "com.mp4parser.iso23009.part1.EventMessageBox", Constants.LONG, "eventDuration", "", "void"), 95);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.schemeIdUri = h7.j(byteBuffer);
        this.value = h7.j(byteBuffer);
        this.timescale = h7.n(byteBuffer);
        this.presentationTimeDelta = h7.n(byteBuffer);
        this.eventDuration = h7.n(byteBuffer);
        this.id = h7.n(byteBuffer);
        byte[] bArr = new byte[byteBuffer.remaining()];
        this.messageData = bArr;
        byteBuffer.get(bArr);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        pe.i(byteBuffer, this.schemeIdUri);
        pe.i(byteBuffer, this.value);
        byteBuffer.putInt((int) this.timescale);
        byteBuffer.putInt((int) this.presentationTimeDelta);
        byteBuffer.putInt((int) this.eventDuration);
        byteBuffer.putInt((int) this.id);
        byteBuffer.put(this.messageData);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (long) (h7.q(this.value) + h7.q(this.schemeIdUri) + 22 + this.messageData.length);
    }

    public long getEventDuration() {
        d.a().b(bpf.b(ajc$tjp_8, this, this));
        return this.eventDuration;
    }

    public long getId() {
        d.a().b(bpf.b(ajc$tjp_10, this, this));
        return this.id;
    }

    public byte[] getMessageData() {
        d.a().b(bpf.b(ajc$tjp_12, this, this));
        return this.messageData;
    }

    public long getPresentationTimeDelta() {
        d.a().b(bpf.b(ajc$tjp_6, this, this));
        return this.presentationTimeDelta;
    }

    public String getSchemeIdUri() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.schemeIdUri;
    }

    public long getTimescale() {
        d.a().b(bpf.b(ajc$tjp_4, this, this));
        return this.timescale;
    }

    public String getValue() {
        d.a().b(bpf.b(ajc$tjp_2, this, this));
        return this.value;
    }

    public void setEventDuration(long j) {
        d.a().b(bpf.c(ajc$tjp_9, this, this, new Long(j)));
        this.eventDuration = j;
    }

    public void setId(long j) {
        d.a().b(bpf.c(ajc$tjp_11, this, this, new Long(j)));
        this.id = j;
    }

    public void setMessageData(byte[] bArr) {
        d.a().b(bpf.c(ajc$tjp_13, this, this, bArr));
        this.messageData = bArr;
    }

    public void setPresentationTimeDelta(long j) {
        d.a().b(bpf.c(ajc$tjp_7, this, this, new Long(j)));
        this.presentationTimeDelta = j;
    }

    public void setSchemeIdUri(String str) {
        d.a().b(bpf.c(ajc$tjp_1, this, this, str));
        this.schemeIdUri = str;
    }

    public void setTimescale(long j) {
        d.a().b(bpf.c(ajc$tjp_5, this, this, new Long(j)));
        this.timescale = j;
    }

    public void setValue(String str) {
        d.a().b(bpf.c(ajc$tjp_3, this, this, str));
        this.value = str;
    }
}

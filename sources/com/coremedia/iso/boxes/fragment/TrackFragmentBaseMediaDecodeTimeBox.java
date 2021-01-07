package com.coremedia.iso.boxes.fragment;

import com.adjust.sdk.Constants;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.d;
import java.nio.ByteBuffer;
import org.mp4parser.aspectj.lang.a;

public class TrackFragmentBaseMediaDecodeTimeBox extends AbstractFullBox {
    public static final String TYPE = "tfdt";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    private long baseMediaDecodeTime;

    static {
        ajc$preClinit();
    }

    public TrackFragmentBaseMediaDecodeTimeBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("TrackFragmentBaseMediaDecodeTimeBox.java", TrackFragmentBaseMediaDecodeTimeBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getBaseMediaDecodeTime", "com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox", "", "", "", Constants.LONG), 65);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "setBaseMediaDecodeTime", "com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox", Constants.LONG, "baseMediaDecodeTime", "", "void"), 69);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "toString", "com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox", "", "", "", "java.lang.String"), 74);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            this.baseMediaDecodeTime = h7.p(byteBuffer);
        } else {
            this.baseMediaDecodeTime = h7.n(byteBuffer);
        }
    }

    public long getBaseMediaDecodeTime() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.baseMediaDecodeTime;
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            byteBuffer.putLong(this.baseMediaDecodeTime);
        } else {
            byteBuffer.putInt((int) this.baseMediaDecodeTime);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (long) (getVersion() == 0 ? 8 : 12);
    }

    public void setBaseMediaDecodeTime(long j) {
        d.a().b(bpf.c(ajc$tjp_1, this, this, new Long(j)));
        this.baseMediaDecodeTime = j;
    }

    public String toString() {
        return je.D0(je.c1(bpf.b(ajc$tjp_2, this, this), "TrackFragmentBaseMediaDecodeTimeBox{baseMediaDecodeTime="), this.baseMediaDecodeTime, '}');
    }
}

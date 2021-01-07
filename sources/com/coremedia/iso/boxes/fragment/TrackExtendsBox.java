package com.coremedia.iso.boxes.fragment;

import com.adjust.sdk.Constants;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.d;
import java.nio.ByteBuffer;
import org.mp4parser.aspectj.lang.a;

public class TrackExtendsBox extends AbstractFullBox {
    public static final String TYPE = "trex";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_10 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_3 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_4 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_5 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_6 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_7 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_8 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_9 = null;
    private long defaultSampleDescriptionIndex;
    private long defaultSampleDuration;
    private a defaultSampleFlags;
    private long defaultSampleSize;
    private long trackId;

    static {
        ajc$preClinit();
    }

    public TrackExtendsBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("TrackExtendsBox.java", TrackExtendsBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getTrackId", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", Constants.LONG), 72);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "getDefaultSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", Constants.LONG), 76);
        ajc$tjp_10 = bpf.g("method-execution", bpf.f("1", "setDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "com.coremedia.iso.boxes.fragment.SampleFlags", "defaultSampleFlags", "", "void"), 112);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "getDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", Constants.LONG), 80);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "getDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", Constants.LONG), 84);
        ajc$tjp_4 = bpf.g("method-execution", bpf.f("1", "getDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "com.coremedia.iso.boxes.fragment.SampleFlags"), 88);
        ajc$tjp_5 = bpf.g("method-execution", bpf.f("1", "getDefaultSampleFlagsStr", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "java.lang.String"), 92);
        ajc$tjp_6 = bpf.g("method-execution", bpf.f("1", "setTrackId", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", Constants.LONG, "trackId", "", "void"), 96);
        ajc$tjp_7 = bpf.g("method-execution", bpf.f("1", "setDefaultSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", Constants.LONG, "defaultSampleDescriptionIndex", "", "void"), 100);
        ajc$tjp_8 = bpf.g("method-execution", bpf.f("1", "setDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", Constants.LONG, "defaultSampleDuration", "", "void"), 104);
        ajc$tjp_9 = bpf.g("method-execution", bpf.f("1", "setDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", Constants.LONG, "defaultSampleSize", "", "void"), 108);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.trackId = h7.n(byteBuffer);
        this.defaultSampleDescriptionIndex = h7.n(byteBuffer);
        this.defaultSampleDuration = h7.n(byteBuffer);
        this.defaultSampleSize = h7.n(byteBuffer);
        this.defaultSampleFlags = new a(byteBuffer);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt((int) this.trackId);
        byteBuffer.putInt((int) this.defaultSampleDescriptionIndex);
        byteBuffer.putInt((int) this.defaultSampleDuration);
        byteBuffer.putInt((int) this.defaultSampleSize);
        this.defaultSampleFlags.a(byteBuffer);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 24;
    }

    public long getDefaultSampleDescriptionIndex() {
        d.a().b(bpf.b(ajc$tjp_1, this, this));
        return this.defaultSampleDescriptionIndex;
    }

    public long getDefaultSampleDuration() {
        d.a().b(bpf.b(ajc$tjp_2, this, this));
        return this.defaultSampleDuration;
    }

    public a getDefaultSampleFlags() {
        d.a().b(bpf.b(ajc$tjp_4, this, this));
        return this.defaultSampleFlags;
    }

    public String getDefaultSampleFlagsStr() {
        d.a().b(bpf.b(ajc$tjp_5, this, this));
        return this.defaultSampleFlags.toString();
    }

    public long getDefaultSampleSize() {
        d.a().b(bpf.b(ajc$tjp_3, this, this));
        return this.defaultSampleSize;
    }

    public long getTrackId() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.trackId;
    }

    public void setDefaultSampleDescriptionIndex(long j) {
        d.a().b(bpf.c(ajc$tjp_7, this, this, new Long(j)));
        this.defaultSampleDescriptionIndex = j;
    }

    public void setDefaultSampleDuration(long j) {
        d.a().b(bpf.c(ajc$tjp_8, this, this, new Long(j)));
        this.defaultSampleDuration = j;
    }

    public void setDefaultSampleFlags(a aVar) {
        d.a().b(bpf.c(ajc$tjp_10, this, this, aVar));
        this.defaultSampleFlags = aVar;
    }

    public void setDefaultSampleSize(long j) {
        d.a().b(bpf.c(ajc$tjp_9, this, this, new Long(j)));
        this.defaultSampleSize = j;
    }

    public void setTrackId(long j) {
        d.a().b(bpf.c(ajc$tjp_6, this, this, new Long(j)));
        this.trackId = j;
    }
}

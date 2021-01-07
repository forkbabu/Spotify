package com.coremedia.iso.boxes.fragment;

import com.adjust.sdk.Constants;
import com.comscore.streaming.AdvertisementType;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.d;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import java.nio.ByteBuffer;
import org.mp4parser.aspectj.lang.a;

public class TrackFragmentHeaderBox extends AbstractFullBox {
    public static final String TYPE = "tfhd";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_10 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_11 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_12 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_13 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_14 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_15 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_16 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_17 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_18 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_19 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_20 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_21 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_3 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_4 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_5 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_6 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_7 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_8 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_9 = null;
    private long baseDataOffset = -1;
    private boolean defaultBaseIsMoof;
    private long defaultSampleDuration = -1;
    private a defaultSampleFlags;
    private long defaultSampleSize = -1;
    private boolean durationIsEmpty;
    private long sampleDescriptionIndex;
    private long trackId;

    static {
        ajc$preClinit();
    }

    public TrackFragmentHeaderBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("TrackFragmentHeaderBox.java", TrackFragmentHeaderBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "hasBaseDataOffset", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 126);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "hasSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 130);
        ajc$tjp_10 = bpf.g("method-execution", bpf.f("1", "setSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", Constants.LONG, "sampleDescriptionIndex", "", "void"), 171);
        ajc$tjp_11 = bpf.g("method-execution", bpf.f("1", "getDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", Constants.LONG), 180);
        ajc$tjp_12 = bpf.g("method-execution", bpf.f("1", "setDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", Constants.LONG, "defaultSampleDuration", "", "void"), 184);
        ajc$tjp_13 = bpf.g("method-execution", bpf.f("1", "getDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", Constants.LONG), 191);
        ajc$tjp_14 = bpf.g("method-execution", bpf.f("1", "setDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", Constants.LONG, "defaultSampleSize", "", "void"), 195);
        ajc$tjp_15 = bpf.g("method-execution", bpf.f("1", "getDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "com.coremedia.iso.boxes.fragment.SampleFlags"), 204);
        ajc$tjp_16 = bpf.g("method-execution", bpf.f("1", "setDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "com.coremedia.iso.boxes.fragment.SampleFlags", "defaultSampleFlags", "", "void"), 208);
        ajc$tjp_17 = bpf.g("method-execution", bpf.f("1", "isDurationIsEmpty", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 217);
        ajc$tjp_18 = bpf.g("method-execution", bpf.f("1", "setDurationIsEmpty", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "boolean", "durationIsEmpty", "", "void"), AdvertisementType.LIVE);
        ajc$tjp_19 = bpf.g("method-execution", bpf.f("1", "isDefaultBaseIsMoof", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 230);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "hasDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 134);
        ajc$tjp_20 = bpf.g("method-execution", bpf.f("1", "setDefaultBaseIsMoof", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "boolean", "defaultBaseIsMoof", "", "void"), AdvertisementType.BRANDED_AS_CONTENT);
        ajc$tjp_21 = bpf.g("method-execution", bpf.f("1", "toString", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "java.lang.String"), 244);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "hasDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 138);
        ajc$tjp_4 = bpf.g("method-execution", bpf.f("1", "hasDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 142);
        ajc$tjp_5 = bpf.g("method-execution", bpf.f("1", "getTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", Constants.LONG), 146);
        ajc$tjp_6 = bpf.g("method-execution", bpf.f("1", "setTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", Constants.LONG, "trackId", "", "void"), AppProtocol.PlaybackSpeed.PLAYBACK_SPEED_150);
        ajc$tjp_7 = bpf.g("method-execution", bpf.f("1", "getBaseDataOffset", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", Constants.LONG), 154);
        ajc$tjp_8 = bpf.g("method-execution", bpf.f("1", "setBaseDataOffset", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", Constants.LONG, "baseDataOffset", "", "void"), 158);
        ajc$tjp_9 = bpf.g("method-execution", bpf.f("1", "getSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", Constants.LONG), 167);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.trackId = h7.n(byteBuffer);
        if ((getFlags() & 1) == 1) {
            this.baseDataOffset = h7.p(byteBuffer);
        }
        if ((getFlags() & 2) == 2) {
            this.sampleDescriptionIndex = h7.n(byteBuffer);
        }
        if ((getFlags() & 8) == 8) {
            this.defaultSampleDuration = h7.n(byteBuffer);
        }
        if ((getFlags() & 16) == 16) {
            this.defaultSampleSize = h7.n(byteBuffer);
        }
        if ((getFlags() & 32) == 32) {
            this.defaultSampleFlags = new a(byteBuffer);
        }
        if ((getFlags() & 65536) == 65536) {
            this.durationIsEmpty = true;
        }
        if ((getFlags() & 131072) == 131072) {
            this.defaultBaseIsMoof = true;
        }
    }

    public long getBaseDataOffset() {
        d.a().b(bpf.b(ajc$tjp_7, this, this));
        return this.baseDataOffset;
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt((int) this.trackId);
        if ((getFlags() & 1) == 1) {
            byteBuffer.putLong(getBaseDataOffset());
        }
        if ((getFlags() & 2) == 2) {
            byteBuffer.putInt((int) getSampleDescriptionIndex());
        }
        if ((getFlags() & 8) == 8) {
            byteBuffer.putInt((int) getDefaultSampleDuration());
        }
        if ((getFlags() & 16) == 16) {
            byteBuffer.putInt((int) getDefaultSampleSize());
        }
        if ((getFlags() & 32) == 32) {
            this.defaultSampleFlags.a(byteBuffer);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        int flags = getFlags();
        long j = (flags & 1) == 1 ? 16 : 8;
        if ((flags & 2) == 2) {
            j += 4;
        }
        if ((flags & 8) == 8) {
            j += 4;
        }
        if ((flags & 16) == 16) {
            j += 4;
        }
        return (flags & 32) == 32 ? j + 4 : j;
    }

    public long getDefaultSampleDuration() {
        d.a().b(bpf.b(ajc$tjp_11, this, this));
        return this.defaultSampleDuration;
    }

    public a getDefaultSampleFlags() {
        d.a().b(bpf.b(ajc$tjp_15, this, this));
        return this.defaultSampleFlags;
    }

    public long getDefaultSampleSize() {
        d.a().b(bpf.b(ajc$tjp_13, this, this));
        return this.defaultSampleSize;
    }

    public long getSampleDescriptionIndex() {
        d.a().b(bpf.b(ajc$tjp_9, this, this));
        return this.sampleDescriptionIndex;
    }

    public long getTrackId() {
        d.a().b(bpf.b(ajc$tjp_5, this, this));
        return this.trackId;
    }

    public boolean hasBaseDataOffset() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return (getFlags() & 1) != 0;
    }

    public boolean hasDefaultSampleDuration() {
        d.a().b(bpf.b(ajc$tjp_2, this, this));
        return (getFlags() & 8) != 0;
    }

    public boolean hasDefaultSampleFlags() {
        d.a().b(bpf.b(ajc$tjp_4, this, this));
        return (getFlags() & 32) != 0;
    }

    public boolean hasDefaultSampleSize() {
        d.a().b(bpf.b(ajc$tjp_3, this, this));
        return (getFlags() & 16) != 0;
    }

    public boolean hasSampleDescriptionIndex() {
        d.a().b(bpf.b(ajc$tjp_1, this, this));
        return (getFlags() & 2) != 0;
    }

    public boolean isDefaultBaseIsMoof() {
        d.a().b(bpf.b(ajc$tjp_19, this, this));
        return this.defaultBaseIsMoof;
    }

    public boolean isDurationIsEmpty() {
        d.a().b(bpf.b(ajc$tjp_17, this, this));
        return this.durationIsEmpty;
    }

    public void setBaseDataOffset(long j) {
        d.a().b(bpf.c(ajc$tjp_8, this, this, new Long(j)));
        if (j == -1) {
            setFlags(getFlags() & 2147483646);
        } else {
            setFlags(getFlags() | 1);
        }
        this.baseDataOffset = j;
    }

    public void setDefaultBaseIsMoof(boolean z) {
        d.a().b(bpf.c(ajc$tjp_20, this, this, new Boolean(z)));
        if (z) {
            setFlags(getFlags() | 131072);
        } else {
            setFlags(getFlags() & 16646143);
        }
        this.defaultBaseIsMoof = z;
    }

    public void setDefaultSampleDuration(long j) {
        d.a().b(bpf.c(ajc$tjp_12, this, this, new Long(j)));
        setFlags(getFlags() | 8);
        this.defaultSampleDuration = j;
    }

    public void setDefaultSampleFlags(a aVar) {
        d.a().b(bpf.c(ajc$tjp_16, this, this, aVar));
        if (aVar != null) {
            setFlags(getFlags() | 32);
        } else {
            setFlags(getFlags() & 16777183);
        }
        this.defaultSampleFlags = aVar;
    }

    public void setDefaultSampleSize(long j) {
        d.a().b(bpf.c(ajc$tjp_14, this, this, new Long(j)));
        if (j != -1) {
            setFlags(getFlags() | 16);
        } else {
            setFlags(getFlags() & 16777199);
        }
        this.defaultSampleSize = j;
    }

    public void setDurationIsEmpty(boolean z) {
        d.a().b(bpf.c(ajc$tjp_18, this, this, new Boolean(z)));
        if (this.defaultBaseIsMoof) {
            setFlags(getFlags() | 65536);
        } else {
            setFlags(getFlags() & 16711679);
        }
        this.durationIsEmpty = z;
    }

    public void setSampleDescriptionIndex(long j) {
        d.a().b(bpf.c(ajc$tjp_10, this, this, new Long(j)));
        if (j == -1) {
            setFlags(getFlags() & 2147483645);
        } else {
            setFlags(getFlags() | 2);
        }
        this.sampleDescriptionIndex = j;
    }

    public void setTrackId(long j) {
        d.a().b(bpf.c(ajc$tjp_6, this, this, new Long(j)));
        this.trackId = j;
    }

    public String toString() {
        d.a().b(bpf.b(ajc$tjp_21, this, this));
        StringBuilder sb = new StringBuilder();
        sb.append("TrackFragmentHeaderBox");
        sb.append("{trackId=");
        sb.append(this.trackId);
        sb.append(", baseDataOffset=");
        sb.append(this.baseDataOffset);
        sb.append(", sampleDescriptionIndex=");
        sb.append(this.sampleDescriptionIndex);
        sb.append(", defaultSampleDuration=");
        sb.append(this.defaultSampleDuration);
        sb.append(", defaultSampleSize=");
        sb.append(this.defaultSampleSize);
        sb.append(", defaultSampleFlags=");
        sb.append(this.defaultSampleFlags);
        sb.append(", durationIsEmpty=");
        sb.append(this.durationIsEmpty);
        sb.append(", defaultBaseIsMoof=");
        return je.O0(sb, this.defaultBaseIsMoof, '}');
    }
}

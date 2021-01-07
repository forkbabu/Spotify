package defpackage;

import com.coremedia.iso.boxes.ChunkOffsetBox;
import com.coremedia.iso.boxes.MovieBox;
import com.coremedia.iso.boxes.SchemeTypeBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.b;
import com.coremedia.iso.boxes.fragment.MovieExtendsBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackRunBox;
import com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox;
import com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox;
import com.mp4parser.iso23001.part7.TrackEncryptionBox;
import com.mp4parser.iso23001.part7.a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: s30  reason: default package */
public class s30 extends v30 implements d40 {
    private List<com.mp4parser.iso23001.part7.a> w = new ArrayList();

    /* renamed from: s30$a */
    private class a {
        private b a;
        private SampleAuxiliaryInformationSizesBox b;
        private SampleAuxiliaryInformationOffsetsBox c;

        public a(s30 s30, b bVar) {
            this.a = bVar;
        }

        public SampleAuxiliaryInformationOffsetsBox c() {
            return this.c;
        }

        public SampleAuxiliaryInformationSizesBox d() {
            return this.b;
        }

        public a e() {
            List boxes = this.a.getBoxes(SampleAuxiliaryInformationSizesBox.class);
            List boxes2 = this.a.getBoxes(SampleAuxiliaryInformationOffsetsBox.class);
            this.b = null;
            this.c = null;
            for (int i = 0; i < boxes.size(); i++) {
                if (!(this.b == null && ((SampleAuxiliaryInformationSizesBox) boxes.get(i)).getAuxInfoType() == null) && !"cenc".equals(((SampleAuxiliaryInformationSizesBox) boxes.get(i)).getAuxInfoType())) {
                    SampleAuxiliaryInformationSizesBox sampleAuxiliaryInformationSizesBox = this.b;
                    if (sampleAuxiliaryInformationSizesBox == null || sampleAuxiliaryInformationSizesBox.getAuxInfoType() != null || !"cenc".equals(((SampleAuxiliaryInformationSizesBox) boxes.get(i)).getAuxInfoType())) {
                        throw new RuntimeException("Are there two cenc labeled saiz?");
                    }
                    this.b = (SampleAuxiliaryInformationSizesBox) boxes.get(i);
                } else {
                    this.b = (SampleAuxiliaryInformationSizesBox) boxes.get(i);
                }
                if (!(this.c == null && ((SampleAuxiliaryInformationOffsetsBox) boxes2.get(i)).getAuxInfoType() == null) && !"cenc".equals(((SampleAuxiliaryInformationOffsetsBox) boxes2.get(i)).getAuxInfoType())) {
                    SampleAuxiliaryInformationOffsetsBox sampleAuxiliaryInformationOffsetsBox = this.c;
                    if (sampleAuxiliaryInformationOffsetsBox == null || sampleAuxiliaryInformationOffsetsBox.getAuxInfoType() != null || !"cenc".equals(((SampleAuxiliaryInformationOffsetsBox) boxes2.get(i)).getAuxInfoType())) {
                        throw new RuntimeException("Are there two cenc labeled saio?");
                    }
                    this.c = (SampleAuxiliaryInformationOffsetsBox) boxes2.get(i);
                } else {
                    this.c = (SampleAuxiliaryInformationOffsetsBox) boxes2.get(i);
                }
            }
            return this;
        }
    }

    public s30(String str, TrackBox trackBox, ne... neVarArr) {
        super(str, trackBox, neVarArr);
        long j;
        int i;
        long j2;
        b bVar;
        int i2;
        SchemeTypeBox schemeTypeBox = (SchemeTypeBox) l50.c(trackBox, "mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schm[0]");
        long trackId = trackBox.getTrackHeaderBox().getTrackId();
        if (trackBox.getParent().getBoxes(MovieExtendsBox.class).size() > 0) {
            Iterator it = ((com.coremedia.iso.boxes.a) trackBox.getParent()).getParent().getBoxes(MovieFragmentBox.class).iterator();
            while (it.hasNext()) {
                MovieFragmentBox movieFragmentBox = (MovieFragmentBox) it.next();
                Iterator it2 = movieFragmentBox.getBoxes(TrackFragmentBox.class).iterator();
                while (it2.hasNext()) {
                    TrackFragmentBox trackFragmentBox = (TrackFragmentBox) it2.next();
                    if (trackFragmentBox.getTrackFragmentHeaderBox().getTrackId() == trackId) {
                        TrackEncryptionBox trackEncryptionBox = (TrackEncryptionBox) l50.c(trackBox, "mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schi[0]/tenc[0]");
                        trackEncryptionBox.getDefault_KID();
                        if (trackFragmentBox.getTrackFragmentHeaderBox().hasBaseDataOffset()) {
                            bVar = ((com.coremedia.iso.boxes.a) trackBox.getParent()).getParent();
                            j2 = trackFragmentBox.getTrackFragmentHeaderBox().getBaseDataOffset();
                        } else {
                            bVar = movieFragmentBox;
                            j2 = 0;
                        }
                        a aVar = new a(this, trackFragmentBox);
                        aVar.e();
                        SampleAuxiliaryInformationOffsetsBox c = aVar.c();
                        SampleAuxiliaryInformationSizesBox d = aVar.d();
                        long[] offsets = c.getOffsets();
                        List boxes = trackFragmentBox.getBoxes(TrackRunBox.class);
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < offsets.length) {
                            int size = ((TrackRunBox) boxes.get(i3)).getEntries().size();
                            long j3 = offsets[i3];
                            int i5 = i4;
                            long j4 = 0;
                            while (true) {
                                i2 = i4 + size;
                                if (i5 >= i2) {
                                    break;
                                }
                                j4 += (long) d.getSize(i5);
                                i5++;
                                movieFragmentBox = movieFragmentBox;
                                it2 = it2;
                            }
                            ByteBuffer byteBuffer = bVar.getByteBuffer(j2 + j3, j4);
                            int i6 = i4;
                            while (i6 < i2) {
                                this.w.add(b(trackEncryptionBox.getDefaultIvSize(), byteBuffer, (long) d.getSize(i6)));
                                i6++;
                                i2 = i2;
                                movieFragmentBox = movieFragmentBox;
                                it2 = it2;
                            }
                            i3++;
                            offsets = offsets;
                            i4 = i2;
                            boxes = boxes;
                            it = it;
                        }
                        trackId = trackId;
                    }
                }
            }
            return;
        }
        TrackEncryptionBox trackEncryptionBox2 = (TrackEncryptionBox) l50.c(trackBox, "mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schi[0]/tenc[0]");
        trackEncryptionBox2.getDefault_KID();
        ChunkOffsetBox chunkOffsetBox = (ChunkOffsetBox) l50.c(trackBox, "mdia[0]/minf[0]/stbl[0]/stco[0]");
        long[] blowup = trackBox.getSampleTableBox().getSampleToChunkBox().blowup((chunkOffsetBox == null ? (ChunkOffsetBox) l50.c(trackBox, "mdia[0]/minf[0]/stbl[0]/co64[0]") : chunkOffsetBox).getChunkOffsets().length);
        a aVar2 = new a(this, (b) l50.c(trackBox, "mdia[0]/minf[0]/stbl[0]"));
        aVar2.e();
        SampleAuxiliaryInformationOffsetsBox sampleAuxiliaryInformationOffsetsBox = aVar2.c;
        SampleAuxiliaryInformationSizesBox sampleAuxiliaryInformationSizesBox = aVar2.b;
        b parent = ((MovieBox) trackBox.getParent()).getParent();
        if (sampleAuxiliaryInformationOffsetsBox.getOffsets().length == 1) {
            long j5 = sampleAuxiliaryInformationOffsetsBox.getOffsets()[0];
            if (sampleAuxiliaryInformationSizesBox.getDefaultSampleInfoSize() > 0) {
                i = (sampleAuxiliaryInformationSizesBox.getDefaultSampleInfoSize() * sampleAuxiliaryInformationSizesBox.getSampleCount()) + 0;
            } else {
                i = 0;
                for (int i7 = 0; i7 < sampleAuxiliaryInformationSizesBox.getSampleCount(); i7++) {
                    i += sampleAuxiliaryInformationSizesBox.getSampleInfoSizes()[i7];
                }
            }
            ByteBuffer byteBuffer2 = parent.getByteBuffer(j5, (long) i);
            for (int i8 = 0; i8 < sampleAuxiliaryInformationSizesBox.getSampleCount(); i8++) {
                this.w.add(b(trackEncryptionBox2.getDefaultIvSize(), byteBuffer2, (long) sampleAuxiliaryInformationSizesBox.getSize(i8)));
            }
        } else if (sampleAuxiliaryInformationOffsetsBox.getOffsets().length == blowup.length) {
            int i9 = 0;
            for (int i10 = 0; i10 < blowup.length; i10++) {
                long j6 = sampleAuxiliaryInformationOffsetsBox.getOffsets()[i10];
                if (sampleAuxiliaryInformationSizesBox.getDefaultSampleInfoSize() > 0) {
                    j = (((long) sampleAuxiliaryInformationSizesBox.getSampleCount()) * blowup[i10]) + 0;
                } else {
                    j = 0;
                    for (int i11 = 0; ((long) i11) < blowup[i10]; i11++) {
                        j += (long) sampleAuxiliaryInformationSizesBox.getSize(i9 + i11);
                    }
                }
                ByteBuffer byteBuffer3 = parent.getByteBuffer(j6, j);
                for (int i12 = 0; ((long) i12) < blowup[i10]; i12++) {
                    this.w.add(b(trackEncryptionBox2.getDefaultIvSize(), byteBuffer3, (long) sampleAuxiliaryInformationSizesBox.getSize(i9 + i12)));
                }
                i9 = (int) (((long) i9) + blowup[i10]);
            }
        } else {
            throw new RuntimeException("Number of saio offsets must be either 1 or number of chunks");
        }
    }

    private com.mp4parser.iso23001.part7.a b(int i, ByteBuffer byteBuffer, long j) {
        com.mp4parser.iso23001.part7.a aVar = new com.mp4parser.iso23001.part7.a();
        if (j > 0) {
            byte[] bArr = new byte[i];
            aVar.a = bArr;
            byteBuffer.get(bArr);
            if (j > ((long) i)) {
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
        }
        return aVar;
    }

    @Override // defpackage.d40
    public boolean J0() {
        return false;
    }

    @Override // defpackage.d40
    public List<com.mp4parser.iso23001.part7.a> M1() {
        return this.w;
    }

    @Override // defpackage.r30, defpackage.x30
    public String getName() {
        return je.I0(new StringBuilder("enc("), this.a, ")");
    }

    @Override // java.lang.Object
    public String toString() {
        return "CencMp4TrackImpl{handler='" + getHandler() + "'}";
    }
}

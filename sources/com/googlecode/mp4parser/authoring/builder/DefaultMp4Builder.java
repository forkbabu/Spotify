package com.googlecode.mp4parser.authoring.builder;

import com.coremedia.iso.boxes.StaticChunkOffsetBox;
import com.coremedia.iso.boxes.b;
import com.coremedia.iso.boxes.mdat.MediaDataBox;
import com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DefaultMp4Builder {
    private static j50 f = j50.a(DefaultMp4Builder.class);
    Map<x30, StaticChunkOffsetBox> a = new HashMap();
    Set<SampleAuxiliaryInformationOffsetsBox> b = new HashSet();
    HashMap<x30, List<w30>> c = new HashMap<>();
    HashMap<x30, long[]> d = new HashMap<>();
    private a e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.googlecode.mp4parser.BasicContainer, com.coremedia.iso.boxes.TrackBox] */
    /* JADX WARN: Type inference failed for: r5v11, types: [com.googlecode.mp4parser.BasicContainer, com.coremedia.iso.boxes.MediaInformationBox] */
    /* JADX WARN: Type inference failed for: r1v34, types: [com.googlecode.mp4parser.BasicContainer, com.coremedia.iso.boxes.DataInformationBox, com.coremedia.iso.boxes.a] */
    /* JADX WARN: Type inference failed for: r5v12, types: [com.googlecode.mp4parser.BasicContainer, com.coremedia.iso.boxes.a] */
    /* JADX WARN: Type inference failed for: r4v22, types: [com.googlecode.mp4parser.BasicContainer] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.coremedia.iso.boxes.b b(defpackage.u30 r40) {
        /*
        // Method dump skipped, instructions count: 2533
        */
        throw new UnsupportedOperationException("Method not decompiled: com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder.b(u30):com.coremedia.iso.boxes.b");
    }

    public long c(u30 u30) {
        long g = u30.e().iterator().next().n1().g();
        for (x30 x30 : u30.e()) {
            long g2 = x30.n1().g();
            long j = g;
            long j2 = g2;
            while (j2 > 0) {
                j2 = j % j2;
                j = j2;
            }
            g *= g2 / j;
        }
        return g;
    }

    private class InterleaveChunkMdat implements com.coremedia.iso.boxes.a {
        List<List<w30>> chunkList;
        long contentSize;
        b parent;
        List<x30> tracks;

        class a implements Comparator<x30> {
            a(InterleaveChunkMdat interleaveChunkMdat) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public int compare(x30 x30, x30 x302) {
                return rw.n(x30.n1().j() - x302.n1().j());
            }
        }

        private InterleaveChunkMdat(u30 u30, Map<x30, int[]> map, long j) {
            int i;
            this.chunkList = new ArrayList();
            this.contentSize = j;
            this.tracks = u30.e();
            ArrayList arrayList = new ArrayList(map.keySet());
            Collections.sort(arrayList, new a(this));
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                x30 x30 = (x30) it.next();
                hashMap.put(x30, 0);
                hashMap2.put(x30, 0);
                hashMap3.put(x30, Double.valueOf(0.0d));
            }
            while (true) {
                x30 x302 = null;
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    x30 x303 = (x30) it2.next();
                    if ((x302 == null || ((Double) hashMap3.get(x303)).doubleValue() < ((Double) hashMap3.get(x302)).doubleValue()) && ((Integer) hashMap.get(x303)).intValue() < map.get(x303).length) {
                        x302 = x303;
                    }
                }
                if (x302 != null) {
                    int intValue = ((Integer) hashMap.get(x302)).intValue();
                    int i2 = map.get(x302)[intValue];
                    int intValue2 = ((Integer) hashMap2.get(x302)).intValue();
                    double doubleValue = ((Double) hashMap3.get(x302)).doubleValue();
                    int i3 = intValue2;
                    while (true) {
                        i = intValue2 + i2;
                        if (i3 >= i) {
                            break;
                        }
                        double d = (double) x302.B1()[i3];
                        double g = (double) x302.n1().g();
                        Double.isNaN(d);
                        Double.isNaN(g);
                        doubleValue += d / g;
                        i3++;
                        i2 = i2;
                        intValue = intValue;
                    }
                    this.chunkList.add(x302.p0().subList(intValue2, i));
                    hashMap.put(x302, Integer.valueOf(intValue + 1));
                    hashMap2.put(x302, Integer.valueOf(i));
                    hashMap3.put(x302, Double.valueOf(doubleValue));
                } else {
                    return;
                }
            }
        }

        private boolean isSmallBox(long j) {
            return j + 8 < 4294967296L;
        }

        @Override // com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
        public void getBox(WritableByteChannel writableByteChannel) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            long size = getSize();
            if (isSmallBox(size)) {
                allocate.putInt((int) size);
            } else {
                allocate.putInt((int) 1);
            }
            allocate.put(ne.b(MediaDataBox.TYPE));
            if (isSmallBox(size)) {
                allocate.put(new byte[8]);
            } else {
                allocate.putLong(size);
            }
            allocate.rewind();
            writableByteChannel.write(allocate);
            DefaultMp4Builder.f.b("About to write " + this.contentSize);
            long j = 0;
            long j2 = 0;
            for (List<w30> list : this.chunkList) {
                for (w30 w30 : list) {
                    w30.a(writableByteChannel);
                    j += w30.getSize();
                    if (j > 1048576) {
                        j -= 1048576;
                        j2++;
                        DefaultMp4Builder.f.b("Written " + j2 + "MB");
                    }
                }
            }
        }

        public long getDataOffset() {
            com.coremedia.iso.boxes.a next;
            long j = 16;
            Object obj = this;
            while (obj instanceof com.coremedia.iso.boxes.a) {
                com.coremedia.iso.boxes.a aVar = (com.coremedia.iso.boxes.a) obj;
                Iterator<com.coremedia.iso.boxes.a> it = aVar.getParent().getBoxes().iterator();
                while (it.hasNext() && obj != (next = it.next())) {
                    j += next.getSize();
                }
                obj = aVar.getParent();
            }
            return j;
        }

        public long getOffset() {
            throw new RuntimeException("Doesn't have any meaning for programmatically created boxes");
        }

        @Override // com.coremedia.iso.boxes.a
        public b getParent() {
            return this.parent;
        }

        @Override // com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
        public long getSize() {
            return this.contentSize + 16;
        }

        @Override // com.coremedia.iso.boxes.a
        public String getType() {
            return MediaDataBox.TYPE;
        }

        @Override // com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
        public void parse(com.googlecode.mp4parser.a aVar, ByteBuffer byteBuffer, long j, le leVar) {
        }

        @Override // com.coremedia.iso.boxes.a
        public void setParent(b bVar) {
            this.parent = bVar;
        }

        /* synthetic */ InterleaveChunkMdat(DefaultMp4Builder defaultMp4Builder, u30 u30, Map map, long j, InterleaveChunkMdat interleaveChunkMdat) {
            this(u30, map, j);
        }
    }
}

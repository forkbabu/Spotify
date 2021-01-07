package com.googlecode.mp4parser;

import com.coremedia.iso.boxes.a;
import com.coremedia.iso.boxes.b;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class BasicContainer implements b, Iterator<a>, Closeable {
    private static final a EOF = new AbstractBox("eof ") {
        /* class com.googlecode.mp4parser.BasicContainer.AnonymousClass1 */

        /* access modifiers changed from: protected */
        @Override // com.googlecode.mp4parser.AbstractBox
        public void _parseDetails(ByteBuffer byteBuffer) {
        }

        /* access modifiers changed from: protected */
        @Override // com.googlecode.mp4parser.AbstractBox
        public void getContent(ByteBuffer byteBuffer) {
        }

        /* access modifiers changed from: protected */
        @Override // com.googlecode.mp4parser.AbstractBox
        public long getContentSize() {
            return 0;
        }
    };
    private static j50 LOG = j50.a(BasicContainer.class);
    protected le boxParser;
    private List<a> boxes = new ArrayList();
    protected a dataSource;
    long endPosition = 0;
    a lookahead = null;
    long parsePosition = 0;
    long startPosition = 0;

    public void addBox(a aVar) {
        if (aVar != null) {
            this.boxes = new ArrayList(getBoxes());
            aVar.setParent(this);
            this.boxes.add(aVar);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.dataSource.close();
    }

    @Override // com.coremedia.iso.boxes.b
    public List<a> getBoxes() {
        if (this.dataSource == null || this.lookahead == EOF) {
            return this.boxes;
        }
        return new i50(this.boxes, this);
    }

    @Override // com.coremedia.iso.boxes.b
    public ByteBuffer getByteBuffer(long j, long j2) {
        ByteBuffer K1;
        a aVar = this.dataSource;
        if (aVar != null) {
            synchronized (aVar) {
                K1 = this.dataSource.K1(this.startPosition + j, j2);
            }
            return K1;
        }
        ByteBuffer allocate = ByteBuffer.allocate(rw.n(j2));
        long j3 = j + j2;
        long j4 = 0;
        for (a aVar2 : this.boxes) {
            long size = aVar2.getSize() + j4;
            if (size > j && j4 < j3) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                WritableByteChannel newChannel = Channels.newChannel(byteArrayOutputStream);
                aVar2.getBox(newChannel);
                newChannel.close();
                if (j4 >= j && size <= j3) {
                    allocate.put(byteArrayOutputStream.toByteArray());
                } else if (j4 < j && size > j3) {
                    long j5 = j - j4;
                    allocate.put(byteArrayOutputStream.toByteArray(), rw.n(j5), rw.n((aVar2.getSize() - j5) - (size - j3)));
                } else if (j4 < j && size <= j3) {
                    long j6 = j - j4;
                    allocate.put(byteArrayOutputStream.toByteArray(), rw.n(j6), rw.n(aVar2.getSize() - j6));
                } else if (j4 >= j && size > j3) {
                    allocate.put(byteArrayOutputStream.toByteArray(), 0, rw.n(aVar2.getSize() - (size - j3)));
                }
            }
            j4 = size;
        }
        return (ByteBuffer) allocate.rewind();
    }

    /* access modifiers changed from: protected */
    public long getContainerSize() {
        long j = 0;
        for (int i = 0; i < getBoxes().size(); i++) {
            j += this.boxes.get(i).getSize();
        }
        return j;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        a aVar = this.lookahead;
        if (aVar == EOF) {
            return false;
        }
        if (aVar != null) {
            return true;
        }
        try {
            this.lookahead = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.lookahead = EOF;
            return false;
        }
    }

    public void initContainer(a aVar, long j, le leVar) {
        this.dataSource = aVar;
        long Z = aVar.Z();
        this.startPosition = Z;
        this.parsePosition = Z;
        aVar.position(aVar.Z() + j);
        this.endPosition = aVar.Z();
        this.boxParser = leVar;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public void setBoxes(List<a> list) {
        this.boxes = new ArrayList(list);
        this.lookahead = EOF;
        this.dataSource = null;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.boxes.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(this.boxes.get(i).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // com.coremedia.iso.boxes.b
    public final void writeContainer(WritableByteChannel writableByteChannel) {
        for (a aVar : getBoxes()) {
            aVar.getBox(writableByteChannel);
        }
    }

    @Override // java.util.Iterator
    public a next() {
        a b;
        a aVar = this.lookahead;
        if (aVar == null || aVar == EOF) {
            a aVar2 = this.dataSource;
            if (aVar2 == null || this.parsePosition >= this.endPosition) {
                this.lookahead = EOF;
                throw new NoSuchElementException();
            }
            try {
                synchronized (aVar2) {
                    this.dataSource.position(this.parsePosition);
                    b = ((ke) this.boxParser).b(this.dataSource, this);
                    this.parsePosition = this.dataSource.Z();
                }
                return b;
            } catch (EOFException unused) {
                throw new NoSuchElementException();
            } catch (IOException unused2) {
                throw new NoSuchElementException();
            }
        } else {
            this.lookahead = null;
            return aVar;
        }
    }

    @Override // com.coremedia.iso.boxes.b
    public <T extends a> List<T> getBoxes(Class<T> cls) {
        List<a> boxes2 = getBoxes();
        ArrayList arrayList = null;
        a aVar = null;
        for (int i = 0; i < boxes2.size(); i++) {
            a aVar2 = boxes2.get(i);
            if (cls.isInstance(aVar2)) {
                if (aVar == null) {
                    aVar = aVar2;
                } else {
                    if (arrayList == null) {
                        arrayList = new ArrayList(2);
                        arrayList.add(aVar);
                    }
                    arrayList.add(aVar2);
                }
            }
        }
        if (arrayList != null) {
            return arrayList;
        }
        if (aVar != null) {
            return Collections.singletonList(aVar);
        }
        return Collections.emptyList();
    }

    @Override // com.coremedia.iso.boxes.b
    public <T extends a> List<T> getBoxes(Class<T> cls, boolean z) {
        ArrayList arrayList = new ArrayList(2);
        List<a> boxes2 = getBoxes();
        for (int i = 0; i < boxes2.size(); i++) {
            a aVar = boxes2.get(i);
            if (cls.isInstance(aVar)) {
                arrayList.add(aVar);
            }
            if (z && (aVar instanceof b)) {
                arrayList.addAll(((b) aVar).getBoxes(cls, z));
            }
        }
        return arrayList;
    }
}

package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.a;
import com.google.protobuf.a.AbstractC0137a;
import com.google.protobuf.u;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Iterator;

public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0137a<MessageType, BuilderType>> implements u {
    protected int memoizedHashCode = 0;

    protected static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        AbstractC0137a.addAll(iterable, collection);
    }

    protected static void checkByteStringIsUtf8(ByteString byteString) {
        if (!byteString.o()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String getSerializingExceptionMessage(String str) {
        StringBuilder V0 = je.V0("Serializing ");
        V0.append(getClass().getName());
        V0.append(" to a ");
        V0.append(str);
        V0.append(" threw an IOException (should never happen).");
        return V0.toString();
    }

    /* access modifiers changed from: package-private */
    public UninitializedMessageException newUninitializedMessageException() {
        return new UninitializedMessageException();
    }

    @Override // com.google.protobuf.u
    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            int i = CodedOutputStream.d;
            CodedOutputStream.c cVar = new CodedOutputStream.c(bArr, 0, serializedSize);
            writeTo(cVar);
            if (cVar.y() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("byte array"), e);
        }
    }

    @Override // com.google.protobuf.u
    public ByteString toByteString() {
        try {
            int serializedSize = getSerializedSize();
            ByteString byteString = ByteString.a;
            ByteString.c cVar = new ByteString.c(serializedSize, null);
            writeTo(cVar.b());
            return cVar.a();
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("ByteString"), e);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        int t = CodedOutputStream.t(serializedSize) + serializedSize;
        if (t > 4096) {
            t = 4096;
        }
        CodedOutputStream.d dVar = new CodedOutputStream.d(outputStream, t);
        dVar.T(serializedSize);
        writeTo(dVar);
        dVar.b0();
    }

    public void writeTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        int i = CodedOutputStream.d;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        CodedOutputStream.d dVar = new CodedOutputStream.d(outputStream, serializedSize);
        writeTo(dVar);
        dVar.b0();
    }

    /* renamed from: com.google.protobuf.a$a  reason: collision with other inner class name */
    public static abstract class AbstractC0137a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0137a<MessageType, BuilderType>> implements u.a {
        protected static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
            iterable.getClass();
            if (iterable instanceof r) {
                checkForNullValues(((r) iterable).c0());
                collection.addAll((Collection) iterable);
            } else if (iterable instanceof Collection) {
                checkForNullValues(iterable);
                collection.addAll((Collection) iterable);
            } else {
                for (T t : iterable) {
                    t.getClass();
                    collection.add(t);
                }
            }
        }

        private static void checkForNullValues(Iterable<?> iterable) {
            Iterator<?> it = iterable.iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
        }

        private String getReadingExceptionMessage(String str) {
            StringBuilder V0 = je.V0("Reading ");
            V0.append(getClass().getName());
            V0.append(" from a ");
            V0.append(str);
            V0.append(" threw an IOException (should never happen).");
            return V0.toString();
        }

        protected static UninitializedMessageException newUninitializedMessageException(u uVar) {
            return new UninitializedMessageException();
        }

        @Override // java.lang.Object
        public abstract BuilderType clone();

        @Override // java.lang.Object
        public abstract /* bridge */ /* synthetic */ u.a clone();

        @Override // java.lang.Object
        public abstract /* bridge */ /* synthetic */ Object clone();

        /* access modifiers changed from: protected */
        public abstract BuilderType internalMergeFrom(MessageType messagetype);

        public boolean mergeDelimitedFrom(InputStream inputStream, k kVar) {
            int read = inputStream.read();
            if (read == -1) {
                return false;
            }
            mergeFrom((InputStream) new C0138a(inputStream, g.v(read, inputStream)), kVar);
            return true;
        }

        @Override // com.google.protobuf.u.a
        public abstract BuilderType mergeFrom(g gVar, k kVar);

        @Override // com.google.protobuf.u.a
        public abstract /* bridge */ /* synthetic */ u.a mergeFrom(g gVar, k kVar);

        /* access modifiers changed from: package-private */
        /* renamed from: com.google.protobuf.a$a$a  reason: collision with other inner class name */
        public static final class C0138a extends FilterInputStream {
            private int a;

            C0138a(InputStream inputStream, int i) {
                super(inputStream);
                this.a = i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() {
                return Math.min(super.available(), this.a);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() {
                if (this.a <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.a--;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j) {
                long skip = super.skip(Math.min(j, (long) this.a));
                if (skip >= 0) {
                    this.a = (int) (((long) this.a) - skip);
                }
                return skip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i, int i2) {
                int i3 = this.a;
                if (i3 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i, Math.min(i2, i3));
                if (read >= 0) {
                    this.a -= read;
                }
                return read;
            }
        }

        public boolean mergeDelimitedFrom(InputStream inputStream) {
            return mergeDelimitedFrom(inputStream, k.a());
        }

        public BuilderType mergeFrom(g gVar) {
            return mergeFrom(gVar, k.a());
        }

        public BuilderType mergeFrom(ByteString byteString) {
            try {
                g t = byteString.t();
                mergeFrom(t);
                t.a(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(getReadingExceptionMessage("ByteString"), e2);
            }
        }

        public BuilderType mergeFrom(ByteString byteString, k kVar) {
            try {
                g t = byteString.t();
                mergeFrom(t, kVar);
                t.a(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(getReadingExceptionMessage("ByteString"), e2);
            }
        }

        public BuilderType mergeFrom(byte[] bArr) {
            return mergeFrom(bArr, 0, bArr.length);
        }

        public BuilderType mergeFrom(byte[] bArr, int i, int i2) {
            try {
                g d = g.d(bArr, i, i2);
                mergeFrom(d);
                d.a(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(getReadingExceptionMessage("byte array"), e2);
            }
        }

        public BuilderType mergeFrom(byte[] bArr, k kVar) {
            return mergeFrom(bArr, 0, bArr.length, kVar);
        }

        public BuilderType mergeFrom(byte[] bArr, int i, int i2, k kVar) {
            try {
                g d = g.d(bArr, i, i2);
                mergeFrom(d, kVar);
                d.a(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(getReadingExceptionMessage("byte array"), e2);
            }
        }

        public BuilderType mergeFrom(InputStream inputStream) {
            g c = g.c(inputStream);
            mergeFrom(c);
            c.a(0);
            return this;
        }

        public BuilderType mergeFrom(InputStream inputStream, k kVar) {
            g c = g.c(inputStream);
            mergeFrom(c, kVar);
            c.a(0);
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.protobuf.a$a<MessageType extends com.google.protobuf.a<MessageType, BuilderType>, BuilderType extends com.google.protobuf.a$a<MessageType, BuilderType>> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.u.a
        public BuilderType mergeFrom(u uVar) {
            if (getDefaultInstanceForType().getClass().isInstance(uVar)) {
                return (BuilderType) internalMergeFrom((a) uVar);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }
}

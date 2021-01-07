package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.t;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.Map;

public final class EventSenderStats extends GeneratedMessageLite<EventSenderStats, b> implements Object {
    private static final EventSenderStats f;
    private static volatile x<EventSenderStats> n;
    private MapFieldLite<String, Long> a = MapFieldLite.d();
    private MapFieldLite<String, Long> b = MapFieldLite.d();
    private MapFieldLite<String, Long> c = MapFieldLite.d();

    public static final class b extends GeneratedMessageLite.b<EventSenderStats, b> implements Object {
        public b m(String str, long j) {
            str.getClass();
            copyOnWrite();
            ((MapFieldLite) EventSenderStats.i((EventSenderStats) this.instance)).put(str, Long.valueOf(j));
            return this;
        }

        public b n(String str, long j) {
            str.getClass();
            copyOnWrite();
            ((MapFieldLite) EventSenderStats.l((EventSenderStats) this.instance)).put(str, Long.valueOf(j));
            return this;
        }

        public b o(String str, long j) {
            str.getClass();
            copyOnWrite();
            ((MapFieldLite) EventSenderStats.h((EventSenderStats) this.instance)).put(str, Long.valueOf(j));
            return this;
        }

        private b() {
            super(EventSenderStats.f);
        }
    }

    /* access modifiers changed from: private */
    public static final class c {
        static final t<String, Long> a = t.b(WireFormat.FieldType.STRING, "", WireFormat.FieldType.INT64, 0L);
    }

    /* access modifiers changed from: private */
    public static final class d {
        static final t<String, Long> a = t.b(WireFormat.FieldType.STRING, "", WireFormat.FieldType.INT64, 0L);
    }

    /* access modifiers changed from: private */
    public static final class e {
        static final t<String, Long> a = t.b(WireFormat.FieldType.STRING, "", WireFormat.FieldType.INT64, 0L);
    }

    static {
        EventSenderStats eventSenderStats = new EventSenderStats();
        f = eventSenderStats;
        eventSenderStats.makeImmutable();
    }

    private EventSenderStats() {
    }

    static Map h(EventSenderStats eventSenderStats) {
        if (!eventSenderStats.a.f()) {
            eventSenderStats.a = eventSenderStats.a.k();
        }
        return eventSenderStats.a;
    }

    static Map i(EventSenderStats eventSenderStats) {
        if (!eventSenderStats.b.f()) {
            eventSenderStats.b = eventSenderStats.b.k();
        }
        return eventSenderStats.b;
    }

    static Map l(EventSenderStats eventSenderStats) {
        if (!eventSenderStats.c.f()) {
            eventSenderStats.c = eventSenderStats.c.k();
        }
        return eventSenderStats.c;
    }

    public static b m() {
        return (b) f.toBuilder();
    }

    public static x<EventSenderStats> parser() {
        return f.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return f;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                EventSenderStats eventSenderStats = (EventSenderStats) obj2;
                this.a = hVar.c(this.a, eventSenderStats.a);
                this.b = hVar.c(this.b, eventSenderStats.b);
                this.c = hVar.c(this.c, eventSenderStats.c);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                if (!this.a.f()) {
                                    this.a = this.a.k();
                                }
                                e.a.d(this.a, gVar, kVar);
                            } else if (B == 18) {
                                if (!this.b.f()) {
                                    this.b = this.b.k();
                                }
                                c.a.d(this.b, gVar, kVar);
                            } else if (B == 26) {
                                if (!this.c.f()) {
                                    this.c = this.c.k();
                                }
                                d.a.d(this.c, gVar, kVar);
                            } else if (!parseUnknownField(B, gVar)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e2) {
                        e2.d(this);
                        throw new RuntimeException(e2);
                    } catch (IOException e3) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3.getMessage());
                        invalidProtocolBufferException.d(this);
                        throw new RuntimeException(invalidProtocolBufferException);
                    }
                }
                break;
            case 3:
                this.a.g();
                this.b.g();
                this.c.g();
                return null;
            case 4:
                return new EventSenderStats();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (EventSenderStats.class) {
                        if (n == null) {
                            n = new GeneratedMessageLite.c(f);
                        }
                    }
                }
                return n;
            default:
                throw new UnsupportedOperationException();
        }
        return f;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (Map.Entry<String, Long> entry : this.a.entrySet()) {
            i2 = je.j1(entry, e.a, 1, entry.getKey(), i2);
        }
        for (Map.Entry<String, Long> entry2 : this.b.entrySet()) {
            i2 = je.j1(entry2, c.a, 2, entry2.getKey(), i2);
        }
        for (Map.Entry<String, Long> entry3 : this.c.entrySet()) {
            i2 = je.j1(entry3, d.a, 3, entry3.getKey(), i2);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (Map.Entry<String, Long> entry : this.a.entrySet()) {
            e.a.e(codedOutputStream, 1, entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, Long> entry2 : this.b.entrySet()) {
            c.a.e(codedOutputStream, 2, entry2.getKey(), entry2.getValue());
        }
        for (Map.Entry<String, Long> entry3 : this.c.entrySet()) {
            d.a.e(codedOutputStream, 3, entry3.getKey(), entry3.getValue());
        }
        this.unknownFields.l(codedOutputStream);
    }
}

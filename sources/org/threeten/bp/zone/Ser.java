package org.threeten.bp.zone;

import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import org.threeten.bp.ZoneOffset;

/* access modifiers changed from: package-private */
public final class Ser implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;
    private Object object;
    private byte type;

    public Ser() {
    }

    static Object a(DataInput dataInput) {
        return c(dataInput.readByte(), dataInput);
    }

    static long b(DataInput dataInput) {
        int readByte = dataInput.readByte() & 255;
        if (readByte == 255) {
            return dataInput.readLong();
        }
        return (((long) (((readByte << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255))) * 900) - 4575744000L;
    }

    private static Object c(byte b, DataInput dataInput) {
        if (b == 1) {
            return StandardZoneRules.j(dataInput);
        }
        if (b == 2) {
            long b2 = b(dataInput);
            ZoneOffset d = d(dataInput);
            ZoneOffset d2 = d(dataInput);
            if (!d.equals(d2)) {
                return new ZoneOffsetTransition(b2, d, d2);
            }
            throw new IllegalArgumentException("Offsets must not be equal");
        } else if (b == 3) {
            return ZoneOffsetTransitionRule.b(dataInput);
        } else {
            throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    static ZoneOffset d(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? ZoneOffset.G(dataInput.readInt()) : ZoneOffset.G(readByte * 900);
    }

    static void e(long j, DataOutput dataOutput) {
        if (j < -4575744000L || j >= 10413792000L || j % 900 != 0) {
            dataOutput.writeByte(BitmapRenderer.ALPHA_VISIBLE);
            dataOutput.writeLong(j);
            return;
        }
        int i = (int) ((j + 4575744000L) / 900);
        dataOutput.writeByte((i >>> 16) & BitmapRenderer.ALPHA_VISIBLE);
        dataOutput.writeByte((i >>> 8) & BitmapRenderer.ALPHA_VISIBLE);
        dataOutput.writeByte(i & BitmapRenderer.ALPHA_VISIBLE);
    }

    static void f(ZoneOffset zoneOffset, DataOutput dataOutput) {
        int C = zoneOffset.C();
        int i = C % 900 == 0 ? C / 900 : 127;
        dataOutput.writeByte(i);
        if (i == 127) {
            dataOutput.writeInt(C);
        }
    }

    private Object readResolve() {
        return this.object;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.type = readByte;
        this.object = c(readByte, objectInput);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        byte b = this.type;
        Object obj = this.object;
        objectOutput.writeByte(b);
        if (b == 1) {
            ((StandardZoneRules) obj).k(objectOutput);
        } else if (b == 2) {
            ((ZoneOffsetTransition) obj).p(objectOutput);
        } else if (b == 3) {
            ((ZoneOffsetTransitionRule) obj).c(objectOutput);
        } else {
            throw new InvalidClassException("Unknown serialized type");
        }
    }

    Ser(byte b, Object obj) {
        this.type = b;
        this.object = obj;
    }
}

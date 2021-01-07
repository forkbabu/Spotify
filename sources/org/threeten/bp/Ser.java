package org.threeten.bp;

import java.io.DataInput;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import org.threeten.bp.zone.ZoneRules;

/* access modifiers changed from: package-private */
public final class Ser implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;
    private Object object;
    private byte type;

    public Ser() {
    }

    static Object a(DataInput dataInput) {
        return b(dataInput.readByte(), dataInput);
    }

    private static Object b(byte b, DataInput dataInput) {
        ZoneRegion zoneRegion;
        ZoneRegion zoneRegion2;
        if (b != 64) {
            switch (b) {
                case 1:
                    Duration duration = Duration.a;
                    return Duration.k(dataInput.readLong(), (long) dataInput.readInt());
                case 2:
                    Instant instant = Instant.a;
                    return Instant.G(dataInput.readLong(), (long) dataInput.readInt());
                case 3:
                    LocalDate localDate = LocalDate.a;
                    return LocalDate.k0(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
                case 4:
                    return LocalDateTime.q0(dataInput);
                case 5:
                    return LocalTime.T(dataInput);
                case 6:
                    return ZonedDateTime.U(dataInput);
                case 7:
                    int i = ZoneRegion.f;
                    String readUTF = dataInput.readUTF();
                    if (readUTF.equals("Z") || readUTF.startsWith("+") || readUTF.startsWith("-")) {
                        throw new DateTimeException(je.x0("Invalid ID for region-based ZoneId, invalid format: ", readUTF));
                    } else if (readUTF.equals("UTC") || readUTF.equals("GMT") || readUTF.equals("UT")) {
                        ZoneOffset zoneOffset = ZoneOffset.n;
                        zoneOffset.getClass();
                        return new ZoneRegion(readUTF, ZoneRules.g(zoneOffset));
                    } else if (readUTF.startsWith("UTC+") || readUTF.startsWith("GMT+") || readUTF.startsWith("UTC-") || readUTF.startsWith("GMT-")) {
                        ZoneOffset D = ZoneOffset.D(readUTF.substring(3));
                        if (D.C() == 0) {
                            zoneRegion = new ZoneRegion(readUTF.substring(0, 3), ZoneRules.g(D));
                        } else {
                            zoneRegion = new ZoneRegion(readUTF.substring(0, 3) + D.i(), ZoneRules.g(D));
                        }
                        return zoneRegion;
                    } else if (!readUTF.startsWith("UT+") && !readUTF.startsWith("UT-")) {
                        return ZoneRegion.A(readUTF, false);
                    } else {
                        ZoneOffset D2 = ZoneOffset.D(readUTF.substring(2));
                        if (D2.C() == 0) {
                            zoneRegion2 = new ZoneRegion("UT", ZoneRules.g(D2));
                        } else {
                            StringBuilder V0 = je.V0("UT");
                            V0.append(D2.i());
                            zoneRegion2 = new ZoneRegion(V0.toString(), ZoneRules.g(D2));
                        }
                        return zoneRegion2;
                    }
                case 8:
                    return ZoneOffset.J(dataInput);
                default:
                    switch (b) {
                        case 66:
                            return OffsetTime.z(dataInput);
                        case 67:
                            int i2 = Year.a;
                            return Year.z(dataInput.readInt());
                        case 68:
                            return YearMonth.C(dataInput);
                        case 69:
                            return OffsetDateTime.C(dataInput);
                        default:
                            throw new StreamCorruptedException("Unknown serialized type");
                    }
            }
        } else {
            int i3 = MonthDay.a;
            return MonthDay.w(dataInput.readByte(), dataInput.readByte());
        }
    }

    private Object readResolve() {
        return this.object;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.type = readByte;
        this.object = b(readByte, objectInput);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        byte b = this.type;
        Object obj = this.object;
        objectOutput.writeByte(b);
        if (b != 64) {
            switch (b) {
                case 1:
                    ((Duration) obj).m(objectOutput);
                    return;
                case 2:
                    ((Instant) obj).O(objectOutput);
                    return;
                case 3:
                    ((LocalDate) obj).E0(objectOutput);
                    return;
                case 4:
                    ((LocalDateTime) obj).v0(objectOutput);
                    return;
                case 5:
                    ((LocalTime) obj).h0(objectOutput);
                    return;
                case 6:
                    ((ZonedDateTime) obj).m0(objectOutput);
                    return;
                case 7:
                    ((ZoneRegion) obj).B(objectOutput);
                    return;
                case 8:
                    ((ZoneOffset) obj).L(objectOutput);
                    return;
                default:
                    switch (b) {
                        case 66:
                            ((OffsetTime) obj).C(objectOutput);
                            return;
                        case 67:
                            ((Year) obj).D(objectOutput);
                            return;
                        case 68:
                            ((YearMonth) obj).I(objectOutput);
                            return;
                        case 69:
                            ((OffsetDateTime) obj).I(objectOutput);
                            return;
                        default:
                            throw new InvalidClassException("Unknown serialized type");
                    }
            }
        } else {
            ((MonthDay) obj).x(objectOutput);
        }
    }

    Ser(byte b, Object obj) {
        this.type = b;
        this.object = obj;
    }
}

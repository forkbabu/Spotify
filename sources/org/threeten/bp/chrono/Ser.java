package org.threeten.bp.chrono;

import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.temporal.ChronoField;

final class Ser implements Externalizable {
    private static final long serialVersionUID = 7857518227608961174L;
    private Object object;
    private byte type;

    public Ser() {
    }

    private Object readResolve() {
        return this.object;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        Object obj;
        Object obj2;
        byte readByte = objectInput.readByte();
        this.type = readByte;
        switch (readByte) {
            case 1:
                LocalDate localDate = JapaneseDate.c;
                int readInt = objectInput.readInt();
                byte readByte2 = objectInput.readByte();
                byte readByte3 = objectInput.readByte();
                JapaneseChronology.f.getClass();
                obj2 = new JapaneseDate(LocalDate.k0(readInt, readByte2, readByte3));
                obj = obj2;
                break;
            case 2:
                JapaneseEra japaneseEra = JapaneseEra.c;
                obj = JapaneseEra.A(objectInput.readByte());
                break;
            case 3:
                int i = HijrahDate.M;
                int readInt2 = objectInput.readInt();
                byte readByte4 = objectInput.readByte();
                byte readByte5 = objectInput.readByte();
                HijrahChronology hijrahChronology = HijrahChronology.c;
                obj = HijrahDate.f0(readInt2, readByte4, readByte5);
                break;
            case 4:
                obj = HijrahEra.h(objectInput.readByte());
                break;
            case 5:
                int readInt3 = objectInput.readInt();
                byte readByte6 = objectInput.readByte();
                byte readByte7 = objectInput.readByte();
                MinguoChronology minguoChronology = MinguoChronology.c;
                obj2 = new MinguoDate(LocalDate.k0(readInt3 + 1911, readByte6, readByte7));
                obj = obj2;
                break;
            case 6:
                obj = MinguoEra.h(objectInput.readByte());
                break;
            case 7:
                int readInt4 = objectInput.readInt();
                byte readByte8 = objectInput.readByte();
                byte readByte9 = objectInput.readByte();
                ThaiBuddhistChronology thaiBuddhistChronology = ThaiBuddhistChronology.c;
                obj2 = new ThaiBuddhistDate(LocalDate.k0(readInt4 - 543, readByte8, readByte9));
                obj = obj2;
                break;
            case 8:
                obj = ThaiBuddhistEra.h(objectInput.readByte());
                break;
            case 9:
            case 10:
            default:
                throw new StreamCorruptedException("Unknown serialized type");
            case 11:
                obj = e.s(objectInput);
                break;
            case 12:
                obj = ((a) objectInput.readObject()).w((LocalTime) objectInput.readObject());
                break;
            case 13:
                obj = ((b) objectInput.readObject()).w((ZoneOffset) objectInput.readObject()).M((ZoneId) objectInput.readObject());
                break;
        }
        this.object = obj;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        byte b = this.type;
        Object obj = this.object;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                JapaneseDate japaneseDate = (JapaneseDate) obj;
                japaneseDate.getClass();
                objectOutput.writeInt(japaneseDate.r(ChronoField.YEAR));
                objectOutput.writeByte(japaneseDate.r(ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(japaneseDate.r(ChronoField.DAY_OF_MONTH));
                return;
            case 2:
                ((JapaneseEra) obj).D(objectOutput);
                return;
            case 3:
                HijrahDate hijrahDate = (HijrahDate) obj;
                hijrahDate.getClass();
                objectOutput.writeInt(hijrahDate.r(ChronoField.YEAR));
                objectOutput.writeByte(hijrahDate.r(ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(hijrahDate.r(ChronoField.DAY_OF_MONTH));
                return;
            case 4:
                objectOutput.writeByte(((HijrahEra) obj).ordinal());
                return;
            case 5:
                MinguoDate minguoDate = (MinguoDate) obj;
                minguoDate.getClass();
                objectOutput.writeInt(minguoDate.r(ChronoField.YEAR));
                objectOutput.writeByte(minguoDate.r(ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(minguoDate.r(ChronoField.DAY_OF_MONTH));
                return;
            case 6:
                objectOutput.writeByte(((MinguoEra) obj).ordinal());
                return;
            case 7:
                ThaiBuddhistDate thaiBuddhistDate = (ThaiBuddhistDate) obj;
                thaiBuddhistDate.getClass();
                objectOutput.writeInt(thaiBuddhistDate.r(ChronoField.YEAR));
                objectOutput.writeByte(thaiBuddhistDate.r(ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(thaiBuddhistDate.r(ChronoField.DAY_OF_MONTH));
                return;
            case 8:
                objectOutput.writeByte(((ThaiBuddhistEra) obj).ordinal());
                return;
            case 9:
            case 10:
            default:
                throw new InvalidClassException("Unknown serialized type");
            case 11:
                objectOutput.writeUTF(((e) obj).q());
                return;
            case 12:
                ((ChronoLocalDateTimeImpl) obj).writeExternal(objectOutput);
                return;
            case 13:
                ((ChronoZonedDateTimeImpl) obj).writeExternal(objectOutput);
                return;
        }
    }

    Ser(byte b, Object obj) {
        this.type = b;
        this.object = obj;
    }
}

package org.threeten.bp;

import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.regex.Pattern;
import org.threeten.bp.temporal.e;

public final class Duration implements e, Comparable<Duration>, Serializable {
    public static final Duration a = new Duration(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;
    private final int nanos;
    private final long seconds;

    static {
        BigInteger.valueOf(1000000000);
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);
    }

    private Duration(long j, int i) {
        this.seconds = j;
        this.nanos = i;
    }

    private static Duration d(long j, int i) {
        if ((((long) i) | j) == 0) {
            return a;
        }
        return new Duration(j, i);
    }

    public static Duration h(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i += 1000000000;
            j2--;
        }
        return d(j2, i);
    }

    public static Duration i(long j) {
        return d(j, 0);
    }

    public static Duration k(long j, long j2) {
        return d(yif.O(j, yif.o(j2, 1000000000)), yif.q(j2, 1000000000));
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new Ser((byte) 1, this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public int compareTo(Duration duration) {
        Duration duration2 = duration;
        int l = yif.l(this.seconds, duration2.seconds);
        return l != 0 ? l : this.nanos - duration2.nanos;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Duration)) {
            return false;
        }
        Duration duration = (Duration) obj;
        if (this.seconds == duration.seconds && this.nanos == duration.nanos) {
            return true;
        }
        return false;
    }

    public long g() {
        return this.seconds;
    }

    @Override // java.lang.Object
    public int hashCode() {
        long j = this.seconds;
        return (this.nanos * 51) + ((int) (j ^ (j >>> 32)));
    }

    public long l() {
        return this.seconds / 86400;
    }

    /* access modifiers changed from: package-private */
    public void m(DataOutput dataOutput) {
        dataOutput.writeLong(this.seconds);
        dataOutput.writeInt(this.nanos);
    }

    @Override // java.lang.Object
    public String toString() {
        if (this == a) {
            return "PT0S";
        }
        long j = this.seconds;
        long j2 = j / 3600;
        int i = (int) ((j % 3600) / 60);
        int i2 = (int) (j % 60);
        StringBuilder T0 = je.T0(24, "PT");
        if (j2 != 0) {
            T0.append(j2);
            T0.append('H');
        }
        if (i != 0) {
            T0.append(i);
            T0.append('M');
        }
        if (i2 == 0 && this.nanos == 0 && T0.length() > 2) {
            return T0.toString();
        }
        if (i2 >= 0 || this.nanos <= 0) {
            T0.append(i2);
        } else if (i2 == -1) {
            T0.append("-0");
        } else {
            T0.append(i2 + 1);
        }
        if (this.nanos > 0) {
            int length = T0.length();
            if (i2 < 0) {
                T0.append(2000000000 - this.nanos);
            } else {
                T0.append(this.nanos + 1000000000);
            }
            while (T0.charAt(T0.length() - 1) == '0') {
                T0.setLength(T0.length() - 1);
            }
            T0.setCharAt(length, '.');
        }
        T0.append('S');
        return T0.toString();
    }
}

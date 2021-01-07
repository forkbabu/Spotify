package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import java.math.BigInteger;

public final class t extends p {
    private final Object a;

    public t(Boolean bool) {
        bool.getClass();
        this.a = bool;
    }

    private static boolean n(t tVar) {
        Object obj = tVar.a;
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.gson.p
    public String e() {
        Object obj = this.a;
        if (obj instanceof Number) {
            return k().toString();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).toString();
        }
        return (String) obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        if (this.a == null) {
            if (tVar.a == null) {
                return true;
            }
            return false;
        } else if (!n(this) || !n(tVar)) {
            Object obj2 = this.a;
            if (!(obj2 instanceof Number) || !(tVar.a instanceof Number)) {
                return obj2.equals(tVar.a);
            }
            double doubleValue = k().doubleValue();
            double doubleValue2 = tVar.k().doubleValue();
            if (doubleValue == doubleValue2) {
                return true;
            }
            if (!Double.isNaN(doubleValue) || !Double.isNaN(doubleValue2)) {
                return false;
            }
            return true;
        } else if (k().longValue() == tVar.k().longValue()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean f() {
        Object obj = this.a;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return Boolean.parseBoolean(e());
    }

    public double h() {
        return this.a instanceof Number ? k().doubleValue() : Double.parseDouble(e());
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.a == null) {
            return 31;
        }
        if (n(this)) {
            doubleToLongBits = k().longValue();
        } else {
            Object obj = this.a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(k().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public int i() {
        return this.a instanceof Number ? k().intValue() : Integer.parseInt(e());
    }

    public long j() {
        return this.a instanceof Number ? k().longValue() : Long.parseLong(e());
    }

    public Number k() {
        Object obj = this.a;
        return obj instanceof String ? new LazilyParsedNumber((String) this.a) : (Number) obj;
    }

    public boolean l() {
        return this.a instanceof Boolean;
    }

    public boolean o() {
        return this.a instanceof Number;
    }

    public boolean t() {
        return this.a instanceof String;
    }

    public t(Number number) {
        number.getClass();
        this.a = number;
    }

    public t(String str) {
        str.getClass();
        this.a = str;
    }
}

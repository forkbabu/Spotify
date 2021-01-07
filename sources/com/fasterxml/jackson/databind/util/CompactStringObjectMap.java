package com.fasterxml.jackson.databind.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public final class CompactStringObjectMap implements Serializable {
    private static final CompactStringObjectMap EMPTY = new CompactStringObjectMap(1, 0, new Object[4]);
    private static final long serialVersionUID = 1;
    private final Object[] _hashArea;
    private final int _hashMask;
    private final int _spillCount;

    private CompactStringObjectMap(int i, int i2, Object[] objArr) {
        this._hashMask = i;
        this._spillCount = i2;
        this._hashArea = objArr;
    }

    public static <T> CompactStringObjectMap construct(Map<String, T> map) {
        int i;
        if (map.isEmpty()) {
            return EMPTY;
        }
        int size = map.size();
        if (size <= 5) {
            i = 8;
        } else if (size <= 12) {
            i = 16;
        } else {
            int i2 = 32;
            while (i2 < size + (size >> 2)) {
                i2 += i2;
            }
            i = i2;
        }
        int i3 = i - 1;
        int i4 = (i >> 1) + i;
        Object[] objArr = new Object[(i4 * 2)];
        int i5 = 0;
        for (Map.Entry<String, T> entry : map.entrySet()) {
            String key = entry.getKey();
            int hashCode = key.hashCode() & i3;
            int i6 = hashCode + hashCode;
            if (objArr[i6] != null) {
                i6 = ((hashCode >> 1) + i) << 1;
                if (objArr[i6] != null) {
                    i6 = (i4 << 1) + i5;
                    i5 += 2;
                    if (i6 >= objArr.length) {
                        objArr = Arrays.copyOf(objArr, objArr.length + 4);
                    }
                }
            }
            objArr[i6] = key;
            objArr[i6 + 1] = entry.getValue();
        }
        return new CompactStringObjectMap(i3, i5, objArr);
    }

    public Object find(String str) {
        int hashCode = str.hashCode() & this._hashMask;
        int i = hashCode << 1;
        Object obj = this._hashArea[i];
        if (obj == str || str.equals(obj)) {
            return this._hashArea[i + 1];
        }
        if (obj == null) {
            return null;
        }
        int i2 = this._hashMask + 1;
        int i3 = ((hashCode >> 1) + i2) << 1;
        Object obj2 = this._hashArea[i3];
        if (str.equals(obj2)) {
            return this._hashArea[i3 + 1];
        }
        if (obj2 == null) {
            return null;
        }
        int i4 = (i2 + (i2 >> 1)) << 1;
        int i5 = this._spillCount + i4;
        while (i4 < i5) {
            Object obj3 = this._hashArea[i4];
            if (obj3 == str || str.equals(obj3)) {
                return this._hashArea[i4 + 1];
            }
            i4 += 2;
        }
        return null;
    }

    public Object findCaseInsensitive(String str) {
        int length = this._hashArea.length;
        for (int i = 0; i < length; i += 2) {
            Object obj = this._hashArea[i];
            if (obj != null && ((String) obj).equalsIgnoreCase(str)) {
                return this._hashArea[i + 1];
            }
        }
        return null;
    }

    public List<String> keys() {
        int length = this._hashArea.length;
        ArrayList arrayList = new ArrayList(length >> 2);
        for (int i = 0; i < length; i += 2) {
            Object obj = this._hashArea[i];
            if (obj != null) {
                arrayList.add((String) obj);
            }
        }
        return arrayList;
    }
}

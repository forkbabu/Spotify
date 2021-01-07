package com.spotify.music.features.go.protocol;

import defpackage.ne5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class b {
    static final byte[] b = {26, 4, 77, 83, 70, 84, 34, 6, 69, 97, 114, 98, 117, 100};
    private final List<a<?>> a;

    public b() {
        ArrayList arrayList = new ArrayList(1);
        this.a = arrayList;
        arrayList.add(new ne5.a());
    }

    public me5 a(byte[] bArr) {
        byte[] bArr2;
        ArrayList arrayList;
        if (Arrays.equals(bArr, b)) {
            return ne5.c("microsoft-surface-buds-legacy-client-id", "Surface Buds", "Microsoft");
        }
        for (a<?> aVar : this.a) {
            if (aVar.a(bArr)) {
                if (aVar.a(bArr)) {
                    if (bArr == null || bArr.length < 2) {
                        bArr2 = new byte[0];
                    } else {
                        byte b2 = bArr[1];
                        if (b2 == 0) {
                            bArr2 = new byte[0];
                        } else if (b2 <= 0 || b2 + 1 + 1 != bArr.length) {
                            throw new GoProtocolParseException();
                        } else {
                            bArr2 = Arrays.copyOfRange(bArr, 2, bArr.length);
                        }
                    }
                    if (bArr2 == null || bArr2.length == 0) {
                        arrayList = Collections.emptyList();
                    } else {
                        ArrayList arrayList2 = new ArrayList(3);
                        StringBuilder sb = new StringBuilder(bArr2.length);
                        for (byte b3 : bArr2) {
                            if (b3 == 0) {
                                arrayList2.add(sb.toString());
                                sb.setLength(0);
                            } else {
                                sb.append((char) b3);
                            }
                        }
                        arrayList = arrayList2;
                        if (sb.length() != 0) {
                            throw new GoProtocolParseException();
                        }
                    }
                    return aVar.b(arrayList);
                }
                throw new GoProtocolParseException();
            }
        }
        throw new GoProtocolParseException();
    }
}

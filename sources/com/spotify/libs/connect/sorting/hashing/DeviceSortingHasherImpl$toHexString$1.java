package com.spotify.libs.connect.sorting.hashing;

import java.util.Arrays;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class DeviceSortingHasherImpl$toHexString$1 extends Lambda implements nmf<Byte, CharSequence> {
    public static final DeviceSortingHasherImpl$toHexString$1 a = new DeviceSortingHasherImpl$toHexString$1();

    DeviceSortingHasherImpl$toHexString$1() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public CharSequence invoke(Byte b) {
        String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b.byteValue())}, 1));
        h.d(format, "java.lang.String.format(this, *args)");
        return format;
    }
}

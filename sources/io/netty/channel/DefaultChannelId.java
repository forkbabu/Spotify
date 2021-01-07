package io.netty.channel;

import io.netty.buffer.o;
import io.netty.util.internal.ThreadLocalRandom;
import io.netty.util.internal.logging.b;
import io.netty.util.internal.logging.c;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

public final class DefaultChannelId implements ChannelId {
    private static final b b = c.b(DefaultChannelId.class.getName());
    private static final Pattern c = Pattern.compile("^(?:[0-9a-fA-F][:-]?){6,8}$");
    private static final byte[] f;
    private static final int n;
    private static final AtomicInteger o = new AtomicInteger();
    private static final long serialVersionUID = 3884076183504074063L;
    private transient String a;
    private final byte[] data = new byte[28];
    private int hashCode;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0133  */
    static {
        /*
        // Method dump skipped, instructions count: 354
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.channel.DefaultChannelId.<clinit>():void");
    }

    private DefaultChannelId() {
    }

    public static DefaultChannelId d() {
        DefaultChannelId defaultChannelId = new DefaultChannelId();
        System.arraycopy(f, 0, defaultChannelId.data, 0, 8);
        int g = defaultChannelId.g(defaultChannelId.g(8, n), o.getAndIncrement());
        long reverse = Long.reverse(System.nanoTime()) ^ System.currentTimeMillis();
        byte[] bArr = defaultChannelId.data;
        int i = g + 1;
        bArr[g] = (byte) ((int) (reverse >>> 56));
        int i2 = i + 1;
        bArr[i] = (byte) ((int) (reverse >>> 48));
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) (reverse >>> 40));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) (reverse >>> 32));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((int) (reverse >>> 24));
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((int) (reverse >>> 16));
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((int) (reverse >>> 8));
        bArr[i7] = (byte) ((int) reverse);
        int nextInt = ThreadLocalRandom.d().nextInt();
        defaultChannelId.hashCode = nextInt;
        defaultChannelId.g(i7 + 1, nextInt);
        return defaultChannelId;
    }

    private int g(int i, int i2) {
        byte[] bArr = this.data;
        int i3 = i + 1;
        bArr[i] = (byte) (i2 >>> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i2 >>> 16);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i2 >>> 8);
        int i6 = i5 + 1;
        bArr[i5] = (byte) i2;
        return i6;
    }

    @Override // io.netty.channel.ChannelId
    public String U0() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        String h = o.h(this.data, 24, 4);
        this.a = h;
        return h;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(ChannelId channelId) {
        return 0;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DefaultChannelId)) {
            return false;
        }
        return Arrays.equals(this.data, ((DefaultChannelId) obj).data);
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.hashCode;
    }

    @Override // java.lang.Object
    public String toString() {
        return U0();
    }
}

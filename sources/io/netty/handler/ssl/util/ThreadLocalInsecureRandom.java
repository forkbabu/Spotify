package io.netty.handler.ssl.util;

import io.netty.util.internal.ThreadLocalRandom;
import java.security.SecureRandom;

/* access modifiers changed from: package-private */
public final class ThreadLocalInsecureRandom extends SecureRandom {
    private static final SecureRandom a = new ThreadLocalInsecureRandom();
    private static final long serialVersionUID = -8209473337192526191L;

    private ThreadLocalInsecureRandom() {
    }

    static SecureRandom a() {
        return a;
    }

    @Override // java.security.SecureRandom
    public byte[] generateSeed(int i) {
        byte[] bArr = new byte[i];
        ThreadLocalRandom.d().nextBytes(bArr);
        return bArr;
    }

    @Override // java.security.SecureRandom
    public String getAlgorithm() {
        return "insecure";
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
        return ThreadLocalRandom.d().nextBoolean();
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void nextBytes(byte[] bArr) {
        ThreadLocalRandom.d().nextBytes(bArr);
    }

    @Override // java.util.Random
    public double nextDouble() {
        return ThreadLocalRandom.d().nextDouble();
    }

    @Override // java.util.Random
    public float nextFloat() {
        return ThreadLocalRandom.d().nextFloat();
    }

    @Override // java.util.Random
    public double nextGaussian() {
        return ThreadLocalRandom.d().nextGaussian();
    }

    @Override // java.util.Random
    public int nextInt() {
        return ThreadLocalRandom.d().nextInt();
    }

    @Override // java.util.Random
    public long nextLong() {
        return ThreadLocalRandom.d().nextLong();
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void setSeed(long j) {
    }

    @Override // java.security.SecureRandom
    public void setSeed(byte[] bArr) {
    }

    @Override // java.util.Random
    public int nextInt(int i) {
        return ThreadLocalRandom.d().nextInt(i);
    }
}

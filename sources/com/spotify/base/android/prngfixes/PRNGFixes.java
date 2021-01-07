package com.spotify.base.android.prngfixes;

import android.os.Build;
import android.os.Process;
import com.google.common.base.Charsets;
import com.spotify.base.java.logging.Logger;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.SecureRandomSpi;
import java.security.Security;

public final class PRNGFixes {
    private static final byte[] a = (Build.FINGERPRINT + Build.BOARD + Build.BOOTLOADER + Build.TIME + Build.HOST).getBytes(Charsets.UTF_8);

    public static class LinuxPRNGSecureRandom extends SecureRandomSpi {
        private static final File a = new File("/dev/urandom");
        private static final Object b = new Object();
        private static DataInputStream c = null;
        private static OutputStream f = null;
        private static final long serialVersionUID = 1;
        private boolean mSeeded;

        private DataInputStream a() {
            DataInputStream dataInputStream;
            synchronized (b) {
                if (c == null) {
                    try {
                        c = new DataInputStream(new FileInputStream(a));
                    } catch (IOException e) {
                        throw new SecurityException("Failed to open " + a + " for reading", e);
                    }
                }
                dataInputStream = c;
            }
            return dataInputStream;
        }

        /* access modifiers changed from: protected */
        @Override // java.security.SecureRandomSpi
        public byte[] engineGenerateSeed(int i) {
            byte[] bArr = new byte[i];
            engineNextBytes(bArr);
            return bArr;
        }

        /* access modifiers changed from: protected */
        @Override // java.security.SecureRandomSpi
        public void engineNextBytes(byte[] bArr) {
            DataInputStream a2;
            if (!this.mSeeded) {
                engineSetSeed(PRNGFixes.c());
            }
            try {
                synchronized (b) {
                    a2 = a();
                }
                a2.readFully(bArr);
            } catch (IOException e) {
                StringBuilder V0 = je.V0("Failed to read from ");
                V0.append(a);
                throw new SecurityException(V0.toString(), e);
            }
        }

        /* access modifiers changed from: protected */
        @Override // java.security.SecureRandomSpi
        public void engineSetSeed(byte[] bArr) {
            OutputStream outputStream;
            try {
                Object obj = b;
                synchronized (obj) {
                    synchronized (obj) {
                        if (f == null) {
                            f = new FileOutputStream(a);
                        }
                        outputStream = f;
                    }
                    outputStream.write(bArr);
                    outputStream.flush();
                    this.mSeeded = true;
                }
                outputStream.write(bArr);
                outputStream.flush();
            } catch (IOException unused) {
                Logger.n("%s: Failed to mix seed into %s", PRNGFixes.class.getSimpleName(), a);
            } catch (Throwable th) {
                this.mSeeded = true;
                throw th;
            }
            this.mSeeded = true;
        }
    }

    /* access modifiers changed from: private */
    public static class LinuxPRNGSecureRandomProvider extends Provider {
        private static final long serialVersionUID = 1;

        LinuxPRNGSecureRandomProvider() {
            super("LinuxPRNG", 1.0d, "A Linux-specific random number provider that uses /dev/urandom");
            put("SecureRandom.SHA1PRNG", LinuxPRNGSecureRandom.class.getName());
            put("SecureRandom.SHA1PRNG ImplementedIn", "Software");
        }
    }

    private PRNGFixes() {
    }

    public static void b() {
        int i = Build.VERSION.SDK_INT;
        if (i <= 18) {
            try {
                Class.forName("org.apache.harmony.xnet.provider.jsse.NativeCrypto").getMethod("RAND_seed", byte[].class).invoke(null, c());
                int intValue = ((Integer) Class.forName("org.apache.harmony.xnet.provider.jsse.NativeCrypto").getMethod("RAND_load_file", String.class, Long.TYPE).invoke(null, "/dev/urandom", 1024)).intValue();
                if (intValue != 1024) {
                    throw new IOException("Unexpected number of bytes read from Linux PRNG: " + intValue);
                }
            } catch (ClassNotFoundException e) {
                throw new SecurityException("Failed to seed OpenSSL PRNG", e);
            } catch (NoClassDefFoundError e2) {
                throw new SecurityException("Failed to seed OpenSSL PRNG", e2);
            } catch (UnsatisfiedLinkError e3) {
                throw new SecurityException("Failed to seed OpenSSL PRNG", e3);
            } catch (Exception e4) {
                throw new SecurityException("Failed to seed OpenSSL PRNG", e4);
            }
        }
        if (i <= 18) {
            Provider[] providers = Security.getProviders("SecureRandom.SHA1PRNG");
            if (providers == null || providers.length < 1 || !LinuxPRNGSecureRandomProvider.class.equals(providers[0].getClass())) {
                Security.insertProviderAt(new LinuxPRNGSecureRandomProvider(), 1);
            }
            SecureRandom secureRandom = new SecureRandom();
            if (LinuxPRNGSecureRandomProvider.class.equals(secureRandom.getProvider().getClass())) {
                try {
                    SecureRandom instance = SecureRandom.getInstance("SHA1PRNG");
                    if (!LinuxPRNGSecureRandomProvider.class.equals(instance.getProvider().getClass())) {
                        StringBuilder V0 = je.V0("SecureRandom.getInstance(\"SHA1PRNG\") backed by wrong Provider: ");
                        V0.append(instance.getProvider().getClass());
                        throw new SecurityException(V0.toString());
                    }
                } catch (NoSuchAlgorithmException e5) {
                    throw new SecurityException("SHA1PRNG not available", e5);
                }
            } else {
                StringBuilder V02 = je.V0("new SecureRandom() backed by wrong Provider: ");
                V02.append(secureRandom.getProvider().getClass());
                throw new SecurityException(V02.toString());
            }
        }
    }

    /* access modifiers changed from: private */
    public static byte[] c() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeLong(System.currentTimeMillis());
            dataOutputStream.writeLong(System.nanoTime());
            dataOutputStream.writeInt(Process.myPid());
            dataOutputStream.writeInt(Process.myUid());
            dataOutputStream.write(a);
            dataOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new SecurityException("Failed to generate seed", e);
        }
    }
}

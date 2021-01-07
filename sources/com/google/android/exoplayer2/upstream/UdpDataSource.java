package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.spotify.encore.mobile.snackbar.SnackbarUtilsKt;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketException;

public final class UdpDataSource extends g {
    private final int e = 8000;
    private final byte[] f;
    private final DatagramPacket g;
    private Uri h;
    private DatagramSocket i;
    private MulticastSocket j;
    private InetAddress k;
    private InetSocketAddress l;
    private boolean m;
    private int n;

    public static final class UdpDataSourceException extends IOException {
        public UdpDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public UdpDataSource() {
        super(true);
        byte[] bArr = new byte[SnackbarUtilsKt.SNACKBAR_ACTION_DURATION];
        this.f = bArr;
        this.g = new DatagramPacket(bArr, 0, (int) SnackbarUtilsKt.SNACKBAR_ACTION_DURATION);
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public long a(m mVar) {
        Uri uri = mVar.a;
        this.h = uri;
        String host = uri.getHost();
        int port = this.h.getPort();
        f(mVar);
        try {
            this.k = InetAddress.getByName(host);
            this.l = new InetSocketAddress(this.k, port);
            if (this.k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.l);
                this.j = multicastSocket;
                multicastSocket.joinGroup(this.k);
                this.i = this.j;
            } else {
                this.i = new DatagramSocket(this.l);
            }
            try {
                this.i.setSoTimeout(this.e);
                this.m = true;
                g(mVar);
                return -1;
            } catch (SocketException e2) {
                throw new UdpDataSourceException(e2);
            }
        } catch (IOException e3) {
            throw new UdpDataSourceException(e3);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public void close() {
        this.h = null;
        MulticastSocket multicastSocket = this.j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.k);
            } catch (IOException unused) {
            }
            this.j = null;
        }
        DatagramSocket datagramSocket = this.i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.i = null;
        }
        this.k = null;
        this.l = null;
        this.n = 0;
        if (this.m) {
            this.m = false;
            e();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public Uri getUri() {
        return this.h;
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public int read(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        if (this.n == 0) {
            try {
                this.i.receive(this.g);
                int length = this.g.getLength();
                this.n = length;
                d(length);
            } catch (IOException e2) {
                throw new UdpDataSourceException(e2);
            }
        }
        int length2 = this.g.getLength();
        int i4 = this.n;
        int min = Math.min(i4, i3);
        System.arraycopy(this.f, length2 - i4, bArr, i2, min);
        this.n -= min;
        return min;
    }
}

package com.spotify.music.features.go.socket;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.go.protocol.GoProtocolParseException;
import java.io.IOException;
import java.io.InputStream;

public class SocketIo {
    private final InputStream a;
    private final com.spotify.music.features.go.protocol.b b;

    public static class CommandParseException extends SocketIoException {
        private static final long serialVersionUID = 7579905756997180769L;

        public CommandParseException(Throwable th) {
            super("Error parsing bytes to command", th);
        }
    }

    public static class CommandReadException extends SocketIoException {
        private static final long serialVersionUID = 3835121697857691829L;

        public CommandReadException() {
            super("No bytes read");
        }
    }

    public static class ConnectionException extends SocketIoException {
        private static final long serialVersionUID = 7714519286084654138L;

        public ConnectionException(Throwable th) {
            super("IO Exception. Socket likely closed", th);
        }
    }

    public static class SocketIoException extends Exception {
        private static final long serialVersionUID = 6235705699221626927L;

        public SocketIoException(String str) {
            super(str);
        }

        public SocketIoException(String str, Throwable th) {
            super(str, th);
        }
    }

    public static class b {
        private final com.spotify.music.features.go.protocol.b a;

        public b(com.spotify.music.features.go.protocol.b bVar) {
            this.a = bVar;
        }

        public SocketIo a(InputStream inputStream) {
            return new SocketIo(inputStream, this.a, null);
        }
    }

    SocketIo(InputStream inputStream, com.spotify.music.features.go.protocol.b bVar, a aVar) {
        this.a = inputStream;
        this.b = bVar;
    }

    public static void a(SocketIo socketIo) {
        socketIo.a.close();
        Logger.g("Go: Stream closed", new Object[0]);
    }

    /* access modifiers changed from: package-private */
    public me5 b() {
        try {
            Logger.g("Go: Do blocking read of bytes", new Object[0]);
            byte[] bArr = new byte[251];
            int read = this.a.read(bArr, 0, 251);
            Logger.g("Go: Bytes received", new Object[0]);
            if (read > 0) {
                byte[] bArr2 = new byte[read];
                System.arraycopy(bArr, 0, bArr2, 0, read);
                return this.b.a(bArr2);
            }
            throw new CommandReadException();
        } catch (GoProtocolParseException e) {
            throw new CommandParseException(e);
        } catch (IOException e2) {
            throw new ConnectionException(e2);
        }
    }
}

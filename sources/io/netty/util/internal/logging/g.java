package io.netty.util.internal.logging;

import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class g extends c {

    class a extends OutputStream {
        final /* synthetic */ StringBuffer a;

        a(g gVar, StringBuffer stringBuffer) {
            this.a = stringBuffer;
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            this.a.append((char) i);
        }
    }

    g(boolean z) {
        StringBuffer stringBuffer = new StringBuffer();
        PrintStream printStream = System.err;
        try {
            System.setErr(new PrintStream(new a(this, stringBuffer), true, "US-ASCII"));
            try {
                if (!(ypf.c() instanceof org.slf4j.helpers.a)) {
                    printStream.print(stringBuffer);
                    printStream.flush();
                    return;
                }
                throw new NoClassDefFoundError(stringBuffer.toString());
            } finally {
                System.setErr(printStream);
            }
        } catch (UnsupportedEncodingException e) {
            throw new Error(e);
        }
    }

    @Override // io.netty.util.internal.logging.c
    public b c(String str) {
        return new Slf4JLogger(ypf.e(str));
    }
}

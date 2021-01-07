package com.spotify.mobile.android.video.exo;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class AggregateException extends RuntimeException {
    private static final long serialVersionUID = 2437354144351174134L;
    private final List<Exception> mExceptionList = new ArrayList();

    public void a(Exception exc) {
        this.mExceptionList.add(exc);
    }

    public boolean b() {
        return this.mExceptionList.isEmpty();
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        for (Exception exc : this.mExceptionList) {
            printStream.println("----------------------------------------");
            exc.printStackTrace(printStream);
        }
        printStream.println("----------------------------------------");
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        for (Exception exc : this.mExceptionList) {
            printWriter.println("----------------------------------------");
            exc.printStackTrace(printWriter);
        }
        printWriter.println("----------------------------------------");
    }
}

package com.googlecode.mp4parser;

import org.mp4parser.aspectj.lang.NoAspectBoundException;
import org.mp4parser.aspectj.lang.a;

public class d {
    private static /* synthetic */ Throwable a;
    public static final /* synthetic */ d b;

    static {
        try {
            b = new d();
        } catch (Throwable th) {
            a = th;
        }
    }

    public static d a() {
        d dVar = b;
        if (dVar != null) {
            return dVar;
        }
        throw new NoAspectBoundException("com.googlecode.mp4parser.RequiresParseDetailAspect", a);
    }

    public void b(a aVar) {
        if (!(aVar.a() instanceof AbstractBox)) {
            throw new RuntimeException(je.l0(AbstractBox.class, new StringBuilder("Only methods in subclasses of "), " can  be annotated with ParseDetail"));
        } else if (!((AbstractBox) aVar.a()).isParsed()) {
            ((AbstractBox) aVar.a()).parseDetails();
        }
    }
}

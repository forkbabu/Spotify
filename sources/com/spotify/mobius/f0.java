package com.spotify.mobius;

import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public class f0<I> implements h<I> {
    private final List<I> a = new ArrayList();
    private h<I> b;
    private boolean c = false;

    f0() {
    }

    @Override // com.spotify.mobius.h, defpackage.da2
    public synchronized void accept(I i) {
        h<I> hVar = this.b;
        if (hVar != null) {
            hVar.accept(i);
        } else {
            this.a.add(i);
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void b(h<I> hVar) {
        if (this.b == null) {
            hVar.getClass();
            this.b = hVar;
            if (!this.c) {
                for (I i : this.a) {
                    hVar.accept(i);
                }
                this.a.clear();
                return;
            }
            return;
        }
        throw new IllegalStateException("Attempt at setting delegate twice");
    }

    @Override // com.spotify.mobius.h, defpackage.w92
    public synchronized void dispose() {
        this.c = true;
        h<I> hVar = this.b;
        if (hVar != null) {
            hVar.dispose();
        }
    }
}

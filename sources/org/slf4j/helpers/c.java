package org.slf4j.helpers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

public class c implements wpf {
    boolean a = false;
    final Map<String, b> b = new HashMap();
    final LinkedBlockingQueue<org.slf4j.event.c> c = new LinkedBlockingQueue<>();

    @Override // defpackage.wpf
    public synchronized xpf a(String str) {
        b bVar;
        bVar = this.b.get(str);
        if (bVar == null) {
            bVar = new b(str, this.c, this.a);
            this.b.put(str, bVar);
        }
        return bVar;
    }

    public void b() {
        this.b.clear();
        this.c.clear();
    }

    public LinkedBlockingQueue<org.slf4j.event.c> c() {
        return this.c;
    }

    public List<b> d() {
        return new ArrayList(this.b.values());
    }

    public void e() {
        this.a = true;
    }
}

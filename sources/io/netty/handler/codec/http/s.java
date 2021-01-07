package io.netty.handler.codec.http;

import io.netty.buffer.j;
import io.netty.buffer.o;
import io.netty.util.c;
import io.netty.util.internal.i;
import io.netty.util.internal.r;
import java.util.Iterator;
import java.util.Map;

final class s {
    private static void a(StringBuilder sb, t tVar) {
        sb.append(r.f(tVar));
        sb.append("(decodeResult: ");
        sb.append(tVar.a());
        sb.append(", version: ");
        sb.append(tVar.c());
        sb.append(')');
        sb.append(r.a);
    }

    static StringBuilder b(StringBuilder sb, l lVar) {
        sb.append(r.f(lVar));
        sb.append("(decodeResult: ");
        sb.append(((g) lVar).a());
        sb.append(", version: ");
        f fVar = (f) lVar;
        sb.append(fVar.c());
        sb.append(", content: ");
        c cVar = (c) lVar;
        sb.append(cVar.content());
        sb.append(')');
        sb.append(r.a);
        d(sb, lVar);
        c(sb, fVar.f());
        c(sb, cVar.u());
        h(sb);
        return sb;
    }

    private static void c(StringBuilder sb, r rVar) {
        Iterator<Map.Entry<String, String>> it = rVar.iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            sb.append(next.getKey());
            sb.append(": ");
            sb.append(next.getValue());
            sb.append(r.a);
        }
    }

    private static void d(StringBuilder sb, z zVar) {
        sb.append(zVar.c());
        sb.append(' ');
        sb.append(zVar.b());
        sb.append(r.a);
    }

    static StringBuilder e(StringBuilder sb, x xVar) {
        a(sb, xVar);
        h hVar = (h) xVar;
        sb.append(hVar.method());
        sb.append(' ');
        sb.append(hVar.uri());
        sb.append(' ');
        f fVar = (f) xVar;
        sb.append(fVar.c());
        sb.append(r.a);
        c(sb, fVar.f());
        h(sb);
        return sb;
    }

    static StringBuilder f(StringBuilder sb, z zVar) {
        a(sb, zVar);
        d(sb, zVar);
        c(sb, ((f) zVar).f());
        h(sb);
        return sb;
    }

    public static void g(CharSequence charSequence, CharSequence charSequence2, j jVar) {
        int length = charSequence.length();
        int length2 = charSequence2.length();
        jVar.P(length + length2 + 4);
        int Z1 = jVar.Z1();
        i(jVar, Z1, charSequence, length);
        int i = Z1 + length;
        int i2 = i + 1;
        jVar.w1(i, 58);
        int i3 = i2 + 1;
        jVar.w1(i2, 32);
        i(jVar, i3, charSequence2, length2);
        int i4 = i3 + length2;
        int i5 = i4 + 1;
        jVar.w1(i4, 13);
        jVar.w1(i5, 10);
        jVar.a2(i5 + 1);
    }

    private static void h(StringBuilder sb) {
        sb.setLength(sb.length() - r.a.length());
    }

    private static void i(j jVar, int i, CharSequence charSequence, int i2) {
        int i3 = 0;
        if (charSequence instanceof c) {
            c cVar = (c) charSequence;
            int i4 = o.f;
            if (!i.a(0, i2, cVar.length())) {
                jVar.B1(i, cVar.d(), cVar.g() + 0, i2);
                return;
            }
            StringBuilder X0 = je.X0("expected: 0 <= srcIdx(", 0, ") <= srcIdx + length(", i2, ") <= srcLen(");
            X0.append(cVar.length());
            X0.append(')');
            throw new IndexOutOfBoundsException(X0.toString());
        }
        while (i3 < i2) {
            int i5 = i + 1;
            char charAt = charSequence.charAt(i3);
            c cVar2 = c.o;
            if (charAt > 255) {
                charAt = '?';
            }
            jVar.w1(i, (byte) charAt);
            i3++;
            i = i5;
        }
    }
}

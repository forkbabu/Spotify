package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.WireFormat;
import com.google.protobuf.a;
import com.google.protobuf.l;
import com.google.protobuf.o;
import com.google.protobuf.u;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;

public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends a<MessageType, BuilderType> {
    protected int memoizedSerializedSize = -1;
    protected b0 unknownFields = b0.b();

    static class EqualsVisitor implements h {
        static final EqualsVisitor a = new EqualsVisitor();
        static final NotEqualsException b = new NotEqualsException();

        static final class NotEqualsException extends RuntimeException {
            NotEqualsException() {
            }
        }

        private EqualsVisitor() {
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public l<d> a(l<d> lVar, l<d> lVar2) {
            if (lVar.equals(lVar2)) {
                return lVar;
            }
            throw b;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public void b(boolean z) {
            if (z) {
                throw b;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public <K, V> MapFieldLite<K, V> c(MapFieldLite<K, V> mapFieldLite, MapFieldLite<K, V> mapFieldLite2) {
            if (mapFieldLite.equals(mapFieldLite2)) {
                return mapFieldLite;
            }
            throw b;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public b0 d(b0 b0Var, b0 b0Var2) {
            if (b0Var.equals(b0Var2)) {
                return b0Var;
            }
            throw b;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public Object e(boolean z, Object obj, Object obj2) {
            if (z && obj.equals(obj2)) {
                return obj;
            }
            throw b;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public boolean f(boolean z, boolean z2, boolean z3, boolean z4) {
            if (z == z3 && z2 == z4) {
                return z2;
            }
            throw b;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public Object g(boolean z, Object obj, Object obj2) {
            if (z && obj.equals(obj2)) {
                return obj;
            }
            throw b;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public o.f h(o.f fVar, o.f fVar2) {
            if (fVar.equals(fVar2)) {
                return fVar;
            }
            throw b;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public <T extends u> T i(T t, T t2) {
            if (t == null && t2 == null) {
                return null;
            }
            if (t == null || t2 == null) {
                throw b;
            }
            ((GeneratedMessageLite) t).equals(this, t2);
            return t;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public Object j(boolean z, Object obj, Object obj2) {
            if (z && obj.equals(obj2)) {
                return obj;
            }
            throw b;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public Object k(boolean z, Object obj, Object obj2) {
            if (z && obj.equals(obj2)) {
                return obj;
            }
            throw b;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public o.a l(o.a aVar, o.a aVar2) {
            if (aVar.equals(aVar2)) {
                return aVar;
            }
            throw b;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public int m(boolean z, int i, boolean z2, int i2) {
            if (z == z2 && i == i2) {
                return i;
            }
            throw b;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public String n(boolean z, String str, boolean z2, String str2) {
            if (z == z2 && str.equals(str2)) {
                return str;
            }
            throw b;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public float o(boolean z, float f, boolean z2, float f2) {
            if (z == z2 && f == f2) {
                return f;
            }
            throw b;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public Object p(boolean z, Object obj, Object obj2) {
            if (z && obj.equals(obj2)) {
                return obj;
            }
            throw b;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public <T> o.i<T> q(o.i<T> iVar, o.i<T> iVar2) {
            if (iVar.equals(iVar2)) {
                return iVar;
            }
            throw b;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public ByteString r(boolean z, ByteString byteString, boolean z2, ByteString byteString2) {
            if (z == z2 && byteString.equals(byteString2)) {
                return byteString;
            }
            throw b;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public long s(boolean z, long j, boolean z2, long j2) {
            if (z == z2 && j == j2) {
                return j;
            }
            throw b;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public double t(boolean z, double d, boolean z2, double d2) {
            if (z == z2 && d == d2) {
                return d;
            }
            throw b;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public Object u(boolean z, Object obj, Object obj2) {
            if (z && ((GeneratedMessageLite) obj).equals(this, (u) obj2)) {
                return obj;
            }
            throw b;
        }
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends Object<MessageType, BuilderType>> extends GeneratedMessageLite<MessageType, BuilderType> implements Object<MessageType, BuilderType> {
        protected l<d> a = l.i();

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.v
        public /* bridge */ /* synthetic */ u getDefaultInstanceForType() {
            return GeneratedMessageLite.super.getDefaultInstanceForType();
        }

        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        public final void makeImmutable() {
            GeneratedMessageLite.super.makeImmutable();
            this.a.f();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public /* bridge */ /* synthetic */ u.a newBuilderForType() {
            return GeneratedMessageLite.super.newBuilderForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.u
        public /* bridge */ /* synthetic */ u.a toBuilder() {
            return GeneratedMessageLite.super.toBuilder();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.protobuf.GeneratedMessageLite
        public void visit(h hVar, GeneratedMessageLite generatedMessageLite) {
            ExtendableMessage extendableMessage = (ExtendableMessage) generatedMessageLite;
            GeneratedMessageLite.super.visit(hVar, extendableMessage);
            this.a = hVar.a(this.a, extendableMessage.a);
        }
    }

    public enum MethodToInvoke {
        IS_INITIALIZED,
        VISIT,
        MERGE_FROM_STREAM,
        MAKE_IMMUTABLE,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static abstract class b<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends a.AbstractC0137a<MessageType, BuilderType> {
        private final MessageType defaultInstance;
        protected MessageType instance;
        protected boolean isBuilt = false;

        protected b(MessageType messagetype) {
            this.defaultInstance = messagetype;
            this.instance = (MessageType) ((GeneratedMessageLite) messagetype.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE));
        }

        /* access modifiers changed from: protected */
        public void copyOnWrite() {
            if (this.isBuilt) {
                MessageType messagetype = (MessageType) ((GeneratedMessageLite) this.instance.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE));
                messagetype.visit(g.a, this.instance);
                this.instance = messagetype;
                this.isBuilt = false;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.protobuf.GeneratedMessageLite$b<MessageType extends com.google.protobuf.GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends com.google.protobuf.GeneratedMessageLite$b<MessageType, BuilderType>> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.a.AbstractC0137a
        public /* bridge */ /* synthetic */ a.AbstractC0137a internalMergeFrom(a aVar) {
            return internalMergeFrom((b<MessageType, BuilderType>) ((GeneratedMessageLite) aVar));
        }

        @Override // com.google.protobuf.v
        public final boolean isInitialized() {
            return GeneratedMessageLite.isInitialized(this.instance, false);
        }

        @Override // com.google.protobuf.u.a
        public final MessageType build() {
            MessageType buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw a.AbstractC0137a.newUninitializedMessageException(buildPartial);
        }

        @Override // com.google.protobuf.u.a
        public MessageType buildPartial() {
            if (this.isBuilt) {
                return this.instance;
            }
            this.instance.makeImmutable();
            this.isBuilt = true;
            return this.instance;
        }

        public final BuilderType clear() {
            this.instance = (MessageType) ((GeneratedMessageLite) this.instance.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE));
            return this;
        }

        @Override // com.google.protobuf.v
        public MessageType getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        /* access modifiers changed from: protected */
        public BuilderType internalMergeFrom(MessageType messagetype) {
            return mergeFrom((b<MessageType, BuilderType>) messagetype);
        }

        public BuilderType mergeFrom(MessageType messagetype) {
            copyOnWrite();
            this.instance.visit(g.a, messagetype);
            return this;
        }

        @Override // com.google.protobuf.a.AbstractC0137a, java.lang.Object
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) getDefaultInstanceForType().newBuilderForType();
            buildertype.mergeFrom(buildPartial());
            return buildertype;
        }

        @Override // com.google.protobuf.a.AbstractC0137a, com.google.protobuf.u.a
        public BuilderType mergeFrom(g gVar, k kVar) {
            copyOnWrite();
            try {
                this.instance.dynamicMethod(MethodToInvoke.MERGE_FROM_STREAM, gVar, kVar);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }
    }

    protected static class c<T extends GeneratedMessageLite<T, ?>> extends b<T> {
        private T b;

        public c(T t) {
            this.b = t;
        }

        @Override // com.google.protobuf.x
        public Object d(g gVar, k kVar) {
            return GeneratedMessageLite.parsePartialFrom(this.b, gVar, kVar);
        }
    }

    static final class d implements l.a<d> {
        final int a;
        final WireFormat.FieldType b;
        final boolean c;

        d(o.d<?> dVar, int i, WireFormat.FieldType fieldType, boolean z, boolean z2) {
            this.a = i;
            this.b = fieldType;
            this.c = z;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: com.google.protobuf.GeneratedMessageLite$b */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.l.a
        public u.a H(u.a aVar, u uVar) {
            return ((b) aVar).mergeFrom((b) ((GeneratedMessageLite) uVar));
        }

        @Override // com.google.protobuf.l.a
        public boolean Z() {
            return this.c;
        }

        @Override // com.google.protobuf.l.a
        public WireFormat.FieldType a0() {
            return this.b;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.a - ((d) obj).a;
        }

        @Override // com.google.protobuf.l.a
        public WireFormat.JavaType w0() {
            return this.b.d();
        }
    }

    public static class e<ContainingType extends u, Type> extends i<ContainingType, Type> {
        final ContainingType a;
        final Type b;
        final u c;

        /* JADX WARN: Incorrect args count in method signature: (TContainingType;TType;Lcom/google/protobuf/u;Lcom/google/protobuf/GeneratedMessageLite$d;Ljava/lang/Class;)V */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.google.protobuf.u */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Object */
        /* JADX WARN: Multi-variable type inference failed */
        e(u uVar, Object obj, u uVar2, d dVar) {
            if (uVar == 0) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            } else if (dVar.b == WireFormat.FieldType.MESSAGE && uVar2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            } else {
                this.a = uVar;
                this.b = obj;
                this.c = uVar2;
            }
        }
    }

    /* access modifiers changed from: private */
    public static class f implements h {
        private int a = 0;

        f(a aVar) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public l<d> a(l<d> lVar, l<d> lVar2) {
            this.a = (this.a * 53) + lVar.hashCode();
            return lVar;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public void b(boolean z) {
            if (z) {
                throw new IllegalStateException();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public <K, V> MapFieldLite<K, V> c(MapFieldLite<K, V> mapFieldLite, MapFieldLite<K, V> mapFieldLite2) {
            this.a = mapFieldLite.hashCode() + (this.a * 53);
            return mapFieldLite;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public b0 d(b0 b0Var, b0 b0Var2) {
            this.a = b0Var.hashCode() + (this.a * 53);
            return b0Var;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public Object e(boolean z, Object obj, Object obj2) {
            this.a = obj.hashCode() + (this.a * 53);
            return obj;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public boolean f(boolean z, boolean z2, boolean z3, boolean z4) {
            this.a = o.a(z2) + (this.a * 53);
            return z2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public Object g(boolean z, Object obj, Object obj2) {
            this.a = o.b(((Long) obj).longValue()) + (this.a * 53);
            return obj;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public o.f h(o.f fVar, o.f fVar2) {
            this.a = fVar.hashCode() + (this.a * 53);
            return fVar;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public <T extends u> T i(T t, T t2) {
            int i;
            if (t != null) {
                i = t instanceof GeneratedMessageLite ? ((GeneratedMessageLite) t).hashCode(this) : t.hashCode();
            } else {
                i = 37;
            }
            this.a = (this.a * 53) + i;
            return t;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public Object j(boolean z, Object obj, Object obj2) {
            this.a = o.b(Double.doubleToLongBits(((Double) obj).doubleValue())) + (this.a * 53);
            return obj;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public Object k(boolean z, Object obj, Object obj2) {
            this.a = ((Integer) obj).intValue() + (this.a * 53);
            return obj;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public o.a l(o.a aVar, o.a aVar2) {
            this.a = aVar.hashCode() + (this.a * 53);
            return aVar;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public int m(boolean z, int i, boolean z2, int i2) {
            this.a = (this.a * 53) + i;
            return i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public String n(boolean z, String str, boolean z2, String str2) {
            this.a = str.hashCode() + (this.a * 53);
            return str;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public float o(boolean z, float f, boolean z2, float f2) {
            this.a = Float.floatToIntBits(f) + (this.a * 53);
            return f;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public Object p(boolean z, Object obj, Object obj2) {
            this.a = o.a(((Boolean) obj).booleanValue()) + (this.a * 53);
            return obj;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public <T> o.i<T> q(o.i<T> iVar, o.i<T> iVar2) {
            this.a = iVar.hashCode() + (this.a * 53);
            return iVar;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public ByteString r(boolean z, ByteString byteString, boolean z2, ByteString byteString2) {
            this.a = byteString.hashCode() + (this.a * 53);
            return byteString;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public long s(boolean z, long j, boolean z2, long j2) {
            this.a = o.b(j) + (this.a * 53);
            return j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public double t(boolean z, double d, boolean z2, double d2) {
            this.a = o.b(Double.doubleToLongBits(d)) + (this.a * 53);
            return d;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public Object u(boolean z, Object obj, Object obj2) {
            u uVar = (u) obj;
            i(uVar, (u) obj2);
            return uVar;
        }
    }

    /* access modifiers changed from: protected */
    public static class g implements h {
        public static final g a = new g();

        private g() {
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public l<d> a(l<d> lVar, l<d> lVar2) {
            if (lVar.d()) {
                lVar = lVar.clone();
            }
            lVar.g(lVar2);
            return lVar;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public void b(boolean z) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public <K, V> MapFieldLite<K, V> c(MapFieldLite<K, V> mapFieldLite, MapFieldLite<K, V> mapFieldLite2) {
            if (!mapFieldLite2.isEmpty()) {
                if (!mapFieldLite.f()) {
                    mapFieldLite = mapFieldLite.k();
                }
                mapFieldLite.j(mapFieldLite2);
            }
            return mapFieldLite;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public b0 d(b0 b0Var, b0 b0Var2) {
            return b0Var2 == b0.b() ? b0Var : b0.h(b0Var, b0Var2);
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public Object e(boolean z, Object obj, Object obj2) {
            return obj2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public boolean f(boolean z, boolean z2, boolean z3, boolean z4) {
            return z3 ? z4 : z2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public Object g(boolean z, Object obj, Object obj2) {
            return obj2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public o.f h(o.f fVar, o.f fVar2) {
            n nVar = (n) fVar;
            int size = nVar.size();
            n nVar2 = (n) fVar2;
            int size2 = nVar2.size();
            n nVar3 = nVar;
            nVar3 = nVar;
            if (size > 0 && size2 > 0) {
                boolean R0 = nVar.R0();
                o.f fVar3 = nVar;
                if (!R0) {
                    fVar3 = nVar.p(size2 + size);
                }
                n nVar4 = (n) fVar3;
                nVar4.addAll(nVar2);
                nVar3 = nVar4;
            }
            return size > 0 ? nVar3 : nVar2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public <T extends u> T i(T t, T t2) {
            return (t == null || t2 == null) ? t != null ? t : t2 : (T) t.toBuilder().mergeFrom(t2).build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public Object j(boolean z, Object obj, Object obj2) {
            return obj2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public Object k(boolean z, Object obj, Object obj2) {
            return obj2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public o.a l(o.a aVar, o.a aVar2) {
            d dVar = (d) aVar;
            int size = dVar.size();
            d dVar2 = (d) aVar2;
            int size2 = dVar2.size();
            d dVar3 = dVar;
            dVar3 = dVar;
            if (size > 0 && size2 > 0) {
                boolean R0 = dVar.R0();
                o.a aVar3 = dVar;
                if (!R0) {
                    aVar3 = dVar.p(size2 + size);
                }
                d dVar4 = (d) aVar3;
                dVar4.addAll(dVar2);
                dVar3 = dVar4;
            }
            return size > 0 ? dVar3 : dVar2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public int m(boolean z, int i, boolean z2, int i2) {
            return z2 ? i2 : i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public String n(boolean z, String str, boolean z2, String str2) {
            return z2 ? str2 : str;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public float o(boolean z, float f, boolean z2, float f2) {
            return z2 ? f2 : f;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public Object p(boolean z, Object obj, Object obj2) {
            return obj2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public <T> o.i<T> q(o.i<T> iVar, o.i<T> iVar2) {
            int size = iVar.size();
            int size2 = iVar2.size();
            if (size > 0 && size2 > 0) {
                if (!((c) iVar).R0()) {
                    iVar = iVar.p(size2 + size);
                }
                iVar.addAll(iVar2);
            }
            return size > 0 ? iVar : iVar2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public ByteString r(boolean z, ByteString byteString, boolean z2, ByteString byteString2) {
            return z2 ? byteString2 : byteString;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public long s(boolean z, long j, boolean z2, long j2) {
            return z2 ? j2 : j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public double t(boolean z, double d, boolean z2, double d2) {
            return z2 ? d2 : d;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.h
        public Object u(boolean z, Object obj, Object obj2) {
            return z ? i((u) obj, (u) obj2) : obj2;
        }
    }

    /* access modifiers changed from: protected */
    public interface h {
        l<d> a(l<d> lVar, l<d> lVar2);

        void b(boolean z);

        <K, V> MapFieldLite<K, V> c(MapFieldLite<K, V> mapFieldLite, MapFieldLite<K, V> mapFieldLite2);

        b0 d(b0 b0Var, b0 b0Var2);

        Object e(boolean z, Object obj, Object obj2);

        boolean f(boolean z, boolean z2, boolean z3, boolean z4);

        Object g(boolean z, Object obj, Object obj2);

        o.f h(o.f fVar, o.f fVar2);

        <T extends u> T i(T t, T t2);

        Object j(boolean z, Object obj, Object obj2);

        Object k(boolean z, Object obj, Object obj2);

        o.a l(o.a aVar, o.a aVar2);

        int m(boolean z, int i, boolean z2, int i2);

        String n(boolean z, String str, boolean z2, String str2);

        float o(boolean z, float f, boolean z2, float f2);

        Object p(boolean z, Object obj, Object obj2);

        <T> o.i<T> q(o.i<T> iVar, o.i<T> iVar2);

        ByteString r(boolean z, ByteString byteString, boolean z2, ByteString byteString2);

        long s(boolean z, long j, boolean z2, long j2);

        double t(boolean z, double d, boolean z2, double d2);

        Object u(boolean z, Object obj, Object obj2);
    }

    /* access modifiers changed from: private */
    public static <MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends Object<MessageType, BuilderType>, T> e<MessageType, T> checkIsLite(i<MessageType, T> iVar) {
        iVar.getClass();
        return (e) iVar;
    }

    private static <T extends GeneratedMessageLite<T, ?>> T checkMessageInitialized(T t) {
        if (t == null || t.isInitialized()) {
            return t;
        }
        UninitializedMessageException newUninitializedMessageException = t.newUninitializedMessageException();
        newUninitializedMessageException.getClass();
        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(newUninitializedMessageException.getMessage());
        invalidProtocolBufferException.d(t);
        throw invalidProtocolBufferException;
    }

    protected static o.a emptyBooleanList() {
        return d.e();
    }

    protected static o.b emptyDoubleList() {
        return h.d();
    }

    protected static o.e emptyFloatList() {
        return m.d();
    }

    protected static o.f emptyIntList() {
        return n.e();
    }

    protected static o.h emptyLongList() {
        return s.d();
    }

    protected static <E> o.i<E> emptyProtobufList() {
        return y.d();
    }

    private final void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == b0.b()) {
            this.unknownFields = b0.i();
        }
    }

    static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e2) {
            StringBuilder V0 = je.V0("Generated message class \"");
            V0.append(cls.getName());
            V0.append("\" missing method \"");
            V0.append(str);
            V0.append("\".");
            throw new RuntimeException(V0.toString(), e2);
        }
    }

    static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static o.f mutableCopy(o.f fVar) {
        n nVar = (n) fVar;
        int size = nVar.size();
        return nVar.p(size == 0 ? 10 : size * 2);
    }

    public static <ContainingType extends u, Type> e<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, u uVar, o.d<?> dVar, int i, WireFormat.FieldType fieldType, boolean z, Class cls) {
        return new e<>(containingtype, Collections.emptyList(), uVar, new d(dVar, i, fieldType, true, z));
    }

    public static <ContainingType extends u, Type> e<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, u uVar, o.d<?> dVar, int i, WireFormat.FieldType fieldType, Class cls) {
        return new e<>(containingtype, type, uVar, new d(dVar, i, fieldType, false, false));
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream) {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, k.a()));
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteString byteString) {
        return (T) checkMessageInitialized(parseFrom(t, byteString, k.a()));
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialDelimitedFrom(T t, InputStream inputStream, k kVar) {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            g c2 = g.c(new a.AbstractC0137a.C0138a(inputStream, g.v(read, inputStream)));
            T t2 = (T) parsePartialFrom(t, c2, kVar);
            try {
                c2.a(0);
                return t2;
            } catch (InvalidProtocolBufferException e2) {
                e2.d(t2);
                throw e2;
            }
        } catch (IOException e3) {
            throw new InvalidProtocolBufferException(e3.getMessage());
        }
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, byte[] bArr, k kVar) {
        try {
            g d2 = g.d(bArr, 0, bArr.length);
            T t2 = (T) parsePartialFrom(t, d2, kVar);
            try {
                d2.a(0);
                return t2;
            } catch (InvalidProtocolBufferException e2) {
                e2.d(t2);
                throw e2;
            }
        } catch (InvalidProtocolBufferException e3) {
            throw e3;
        }
    }

    /* access modifiers changed from: protected */
    public Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj) {
        return dynamicMethod(methodToInvoke, obj, null);
    }

    /* access modifiers changed from: protected */
    public abstract Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2);

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.google.protobuf.GeneratedMessageLite<MessageType extends com.google.protobuf.GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends com.google.protobuf.GeneratedMessageLite$b<MessageType, BuilderType>> */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getDefaultInstanceForType().getClass().isInstance(obj)) {
            return false;
        }
        try {
            visit(EqualsVisitor.a, (GeneratedMessageLite) obj);
            return true;
        } catch (EqualsVisitor.NotEqualsException unused) {
            return false;
        }
    }

    @Override // com.google.protobuf.u
    public final x<MessageType> getParserForType() {
        return (x) dynamicMethod(MethodToInvoke.GET_PARSER);
    }

    public int hashCode() {
        if (this.memoizedHashCode == 0) {
            f fVar = new f(null);
            visit(fVar, this);
            this.memoizedHashCode = fVar.a;
        }
        return this.memoizedHashCode;
    }

    @Override // com.google.protobuf.v
    public final boolean isInitialized() {
        return dynamicMethod(MethodToInvoke.IS_INITIALIZED, Boolean.TRUE) != null;
    }

    /* access modifiers changed from: protected */
    public void makeImmutable() {
        dynamicMethod(MethodToInvoke.MAKE_IMMUTABLE);
        this.unknownFields.d();
    }

    /* access modifiers changed from: protected */
    public void mergeLengthDelimitedField(int i, ByteString byteString) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.f(i, byteString);
    }

    /* access modifiers changed from: protected */
    public final void mergeUnknownFields(b0 b0Var) {
        this.unknownFields = b0.h(this.unknownFields, b0Var);
    }

    /* access modifiers changed from: protected */
    public void mergeVarintField(int i, int i2) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.g(i, i2);
    }

    /* access modifiers changed from: protected */
    public boolean parseUnknownField(int i, g gVar) {
        if ((i & 7) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.e(i, gVar);
    }

    public String toString() {
        return w.e(this, super.toString());
    }

    /* access modifiers changed from: package-private */
    public void visit(h hVar, MessageType messagetype) {
        dynamicMethod(MethodToInvoke.VISIT, hVar, messagetype);
        this.unknownFields = hVar.d(this.unknownFields, messagetype.unknownFields);
    }

    protected static final <T extends GeneratedMessageLite<T, ?>> boolean isInitialized(T t, boolean z) {
        return t.dynamicMethod(MethodToInvoke.IS_INITIALIZED, Boolean.valueOf(z)) != null;
    }

    /* access modifiers changed from: protected */
    public Object dynamicMethod(MethodToInvoke methodToInvoke) {
        return dynamicMethod(methodToInvoke, null, null);
    }

    @Override // com.google.protobuf.v
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) ((GeneratedMessageLite) dynamicMethod(MethodToInvoke.GET_DEFAULT_INSTANCE));
    }

    public final BuilderType newBuilderForType() {
        return (BuilderType) ((b) dynamicMethod(MethodToInvoke.NEW_BUILDER));
    }

    @Override // com.google.protobuf.u
    public final BuilderType toBuilder() {
        BuilderType buildertype = (BuilderType) ((b) dynamicMethod(MethodToInvoke.NEW_BUILDER));
        buildertype.mergeFrom(this);
        return buildertype;
    }

    protected static final <T extends GeneratedMessageLite<T, ?>> void makeImmutable(T t) {
        t.dynamicMethod(MethodToInvoke.MAKE_IMMUTABLE);
    }

    protected static o.h mutableCopy(o.h hVar) {
        s sVar = (s) hVar;
        int size = sVar.size();
        return sVar.p(size == 0 ? 10 : size * 2);
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteString byteString, k kVar) {
        return (T) checkMessageInitialized(parsePartialFrom(t, byteString, kVar));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.google.protobuf.GeneratedMessageLite<MessageType extends com.google.protobuf.GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends com.google.protobuf.GeneratedMessageLite$b<MessageType, BuilderType>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    public boolean equals(EqualsVisitor equalsVisitor, u uVar) {
        if (this == uVar) {
            return true;
        }
        if (!getDefaultInstanceForType().getClass().isInstance(uVar)) {
            return false;
        }
        visit(equalsVisitor, (GeneratedMessageLite) uVar);
        return true;
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream, k kVar) {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, kVar));
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr) {
        return (T) checkMessageInitialized(parsePartialFrom(t, bArr, k.a()));
    }

    protected static o.e mutableCopy(o.e eVar) {
        m mVar = (m) eVar;
        int size = mVar.size();
        return mVar.p(size == 0 ? 10 : size * 2);
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr, k kVar) {
        return (T) checkMessageInitialized(parsePartialFrom(t, bArr, kVar));
    }

    static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, g gVar, k kVar) {
        T t2 = (T) ((GeneratedMessageLite) t.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE));
        try {
            t2.dynamicMethod(MethodToInvoke.MERGE_FROM_STREAM, gVar, kVar);
            t2.makeImmutable();
            return t2;
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e2.getCause());
            }
            throw e2;
        }
    }

    /* access modifiers changed from: package-private */
    public int hashCode(f fVar) {
        if (this.memoizedHashCode == 0) {
            int i = fVar.a;
            fVar.a = 0;
            visit(fVar, this);
            this.memoizedHashCode = fVar.a;
            fVar.a = i;
        }
        return this.memoizedHashCode;
    }

    protected static o.b mutableCopy(o.b bVar) {
        h hVar = (h) bVar;
        int size = hVar.size();
        return hVar.p(size == 0 ? 10 : size * 2);
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, InputStream inputStream) {
        return (T) checkMessageInitialized(parsePartialFrom(t, g.c(inputStream), k.a()));
    }

    protected static o.a mutableCopy(o.a aVar) {
        d dVar = (d) aVar;
        int size = dVar.size();
        return dVar.p(size == 0 ? 10 : size * 2);
    }

    protected static <E> o.i<E> mutableCopy(o.i<E> iVar) {
        int size = iVar.size();
        return iVar.p(size == 0 ? 10 : size * 2);
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, InputStream inputStream, k kVar) {
        return (T) checkMessageInitialized(parsePartialFrom(t, g.c(inputStream), kVar));
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, g gVar) {
        return (T) parsePartialFrom(t, gVar, k.a());
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, g gVar) {
        return (T) parseFrom(t, gVar, k.a());
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, ByteString byteString, k kVar) {
        try {
            g t2 = byteString.t();
            T t3 = (T) parsePartialFrom(t, t2, kVar);
            try {
                t2.a(0);
                return t3;
            } catch (InvalidProtocolBufferException e2) {
                e2.d(t3);
                throw e2;
            }
        } catch (InvalidProtocolBufferException e3) {
            throw e3;
        }
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, g gVar, k kVar) {
        return (T) checkMessageInitialized(parsePartialFrom(t, gVar, kVar));
    }
}

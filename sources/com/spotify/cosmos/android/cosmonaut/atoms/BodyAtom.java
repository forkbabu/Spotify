package com.spotify.cosmos.android.cosmonaut.atoms;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.BodyPart;
import com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class BodyAtom {
    private static final byte[] DEFAULT_VALUE = new byte[0];
    private final Optional<sg0<Object[], byte[]>> mArgumentTransformation;

    /* access modifiers changed from: private */
    public static class BodyPartTransformation implements sg0<Object[], byte[]> {
        private final Converter<Object, byte[]> mConverter;
        private final List<PartArgument> mPartArguments;

        BodyPartTransformation(List<PartArgument> list, Converter<?, byte[]> converter) {
            this.mPartArguments = list;
            this.mConverter = converter;
        }

        public byte[] apply(Object[] objArr) {
            ImmutableMap.Builder<String, Object> builder = ImmutableMap.builder();
            for (PartArgument partArgument : this.mPartArguments) {
                partArgument.visit(objArr, builder);
            }
            ImmutableMap<String, Object> build = builder.build();
            try {
                byte[] convert = this.mConverter.convert(build.getClass(), build);
                convert.getClass();
                return convert;
            } catch (IOException e) {
                Logger.e(e, "Unexpected IO exception", new Object[0]);
                return BodyAtom.DEFAULT_VALUE;
            }
        }
    }

    /* access modifiers changed from: private */
    public static class BodyTransformation implements sg0<Object[], byte[]> {
        private final Converter<Object, byte[]> mConverter;
        private final int mIndex;
        private final Type mType;

        BodyTransformation(int i, Type type, Converter<?, byte[]> converter) {
            this.mIndex = i;
            this.mType = type;
            this.mConverter = converter;
        }

        public byte[] apply(Object[] objArr) {
            try {
                byte[] convert = this.mConverter.convert(this.mType, objArr[this.mIndex]);
                convert.getClass();
                return convert;
            } catch (IOException e) {
                Logger.e(e, "Unexpected IO exception", new Object[0]);
                return BodyAtom.DEFAULT_VALUE;
            }
        }
    }

    /* access modifiers changed from: private */
    public static class PartArgument {
        private final int mIndex;
        private final String mName;

        PartArgument(String str, int i) {
            this.mName = str;
            this.mIndex = i;
        }

        /* access modifiers changed from: package-private */
        public void visit(Object[] objArr, ImmutableMap.Builder<String, Object> builder) {
            builder.mo51put(this.mName, objArr[this.mIndex]);
        }
    }

    BodyAtom(Method method, RequestTransformers requestTransformers) {
        this.mArgumentTransformation = createOptionalArgumentTransformer(method, requestTransformers);
    }

    private static Optional<sg0<Object[], byte[]>> createOptionalArgumentTransformer(Method method, RequestTransformers requestTransformers) {
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        int length = parameterAnnotations.length;
        for (int i = 0; i < length; i++) {
            if (((Body) ReflectionUtil.findAnnotation(parameterAnnotations[i], Body.class)) != null) {
                Type type = method.getGenericParameterTypes()[i];
                return Optional.of(new BodyTransformation(i, type, requestTransformers.find(type)));
            }
        }
        ArrayList arrayList = new ArrayList(1);
        int length2 = parameterAnnotations.length;
        for (int i2 = 0; i2 < length2; i2++) {
            BodyPart bodyPart = (BodyPart) ReflectionUtil.findAnnotation(parameterAnnotations[i2], BodyPart.class);
            if (bodyPart != null) {
                arrayList.add(new PartArgument(bodyPart.value(), i2));
            }
        }
        if (arrayList.isEmpty()) {
            return Optional.absent();
        }
        return Optional.of(new BodyPartTransformation(arrayList, requestTransformers.find(Map.class)));
    }

    /* access modifiers changed from: package-private */
    public byte[] call(Object[] objArr) {
        return (byte[]) this.mArgumentTransformation.transform(new a(objArr)).or((Optional<V>) ((V) DEFAULT_VALUE));
    }
}

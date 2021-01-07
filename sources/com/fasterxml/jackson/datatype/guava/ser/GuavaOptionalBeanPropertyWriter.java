package com.fasterxml.jackson.datatype.guava.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.google.common.base.Optional;

public class GuavaOptionalBeanPropertyWriter extends BeanPropertyWriter {
    private static final long serialVersionUID = 1;

    protected GuavaOptionalBeanPropertyWriter(BeanPropertyWriter beanPropertyWriter) {
        super(beanPropertyWriter);
    }

    /* access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
    public BeanPropertyWriter _new(PropertyName propertyName) {
        return new GuavaOptionalBeanPropertyWriter(this, propertyName);
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Object obj2;
        if (this._nullSerializer != null || ((obj2 = get(obj)) != null && !Optional.absent().equals(obj2))) {
            super.serializeAsField(obj, jsonGenerator, serializerProvider);
        }
    }

    protected GuavaOptionalBeanPropertyWriter(BeanPropertyWriter beanPropertyWriter, PropertyName propertyName) {
        super(beanPropertyWriter, propertyName);
    }
}

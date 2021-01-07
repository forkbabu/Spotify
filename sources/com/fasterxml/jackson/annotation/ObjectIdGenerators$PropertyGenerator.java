package com.fasterxml.jackson.annotation;

public abstract class ObjectIdGenerators$PropertyGenerator extends ObjectIdGenerators$Base<Object> {
    private static final long serialVersionUID = 1;

    protected ObjectIdGenerators$PropertyGenerator(Class<?> cls) {
        super(cls);
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerators$Base, com.fasterxml.jackson.annotation.ObjectIdGenerator
    public Class<?> getScope() {
        return this._scope;
    }
}

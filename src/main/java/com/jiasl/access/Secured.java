package com.jiasl.access;

import java.util.List;

public @interface Secured {
    public String[] value() default {};
}

package com.example.cross_prog_2.task;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = NoProfanityValidator.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface NoProfanity {
    String message() default "{task.noProfanity}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

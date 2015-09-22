package com.project1.base.model;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Use this annotation at field level to hash the attribute/member before
 * persisting.
 * 
 * @author harkamwaljeet.Singh
 *
 */

@Target({ FIELD })
@Retention(RUNTIME)
public @interface HashedField {


}

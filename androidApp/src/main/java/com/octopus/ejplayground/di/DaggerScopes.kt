package com.octopus.ejplayground.di

import javax.inject.Scope

@Scope
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class PerApplication

@Scope
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class SingleActivity
